package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableFlattenIterable<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final Function<? super T, ? extends Iterable<? extends R>> mapper;
    final int prefetch;

    public static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        volatile boolean cancelled;
        int consumed;
        Iterator<? extends R> current;
        volatile boolean done;
        final Subscriber<? super R> downstream;
        int fusionMode;
        final int limit;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        final int prefetch;
        SimpleQueue<T> queue;
        Subscription upstream;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public FlattenIterableSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends Iterable<? extends R>> function, int i2) {
            this.downstream = subscriber;
            this.mapper = function;
            this.prefetch = i2;
            this.limit = i2 - (i2 >> 2);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public boolean checkTerminated(boolean z2, boolean z3, Subscriber<?> subscriber, SimpleQueue<?> simpleQueue) {
            if (this.cancelled) {
                this.current = null;
                simpleQueue.clear();
                return true;
            }
            if (!z2) {
                return false;
            }
            if (this.error.get() == null) {
                if (!z3) {
                    return false;
                }
                subscriber.onComplete();
                return true;
            }
            Throwable thTerminate = ExceptionHelper.terminate(this.error);
            this.current = null;
            simpleQueue.clear();
            subscriber.onError(thTerminate);
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.current = null;
            this.queue.clear();
        }

        public void consumedOne(boolean z2) {
            if (z2) {
                int i2 = this.consumed + 1;
                if (i2 != this.limit) {
                    this.consumed = i2;
                } else {
                    this.consumed = 0;
                    this.upstream.request(i2);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:70:0x0128 A[PHI: r6
  0x0128: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:31:0x0081, B:68:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:89:0x012f A[SYNTHETIC] */
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<?> subscriber = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            boolean z2 = true;
            boolean z3 = this.fusionMode != 1;
            Iterator<? extends R> it = this.current;
            int iAddAndGet = 1;
            while (true) {
                if (it == null) {
                    boolean z4 = this.done;
                    try {
                        T tPoll = simpleQueue.poll();
                        if (checkTerminated(z4, tPoll == null ? z2 : false, subscriber, simpleQueue)) {
                            return;
                        }
                        if (tPoll != null) {
                            try {
                                it = this.mapper.apply(tPoll).iterator();
                                if (it.hasNext()) {
                                    this.current = it;
                                } else {
                                    consumedOne(z3);
                                    it = null;
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.upstream.cancel();
                                ExceptionHelper.addThrowable(this.error, th);
                                subscriber.onError(ExceptionHelper.terminate(this.error));
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.upstream.cancel();
                        ExceptionHelper.addThrowable(this.error, th2);
                        Throwable thTerminate = ExceptionHelper.terminate(this.error);
                        this.current = null;
                        simpleQueue.clear();
                        subscriber.onError(thTerminate);
                        return;
                    }
                }
                if (it != null) {
                    long j = this.requested.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (checkTerminated(this.done, false, subscriber, simpleQueue)) {
                            return;
                        }
                        try {
                            subscriber.onNext(ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                            if (checkTerminated(this.done, false, subscriber, simpleQueue)) {
                                return;
                            }
                            j2++;
                            try {
                                if (!it.hasNext()) {
                                    consumedOne(z3);
                                    this.current = null;
                                    it = null;
                                    break;
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.current = null;
                                this.upstream.cancel();
                                ExceptionHelper.addThrowable(this.error, th3);
                                subscriber.onError(ExceptionHelper.terminate(this.error));
                                return;
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            this.current = null;
                            this.upstream.cancel();
                            ExceptionHelper.addThrowable(this.error, th4);
                            subscriber.onError(ExceptionHelper.terminate(this.error));
                            return;
                        }
                    }
                    if (j2 == j) {
                        if (checkTerminated(this.done, simpleQueue.isEmpty() && it == null, subscriber, simpleQueue)) {
                            return;
                        }
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j2);
                    }
                    if (it != null) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                z2 = true;
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.current == null && this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.done || !ExceptionHelper.addThrowable(this.error, th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.fusionMode != 0 || this.queue.offer(t)) {
                drain();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        subscription.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                subscription.request(this.prefetch);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public R poll() throws Exception {
            Iterator<? extends R> it = this.current;
            while (it == null) {
                T tPoll = this.queue.poll();
                if (tPoll != null) {
                    it = this.mapper.apply(tPoll).iterator();
                    if (it.hasNext()) {
                        this.current = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            }
            R r = (R) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.current = null;
            }
            return r;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i2) {
            return ((i2 & 1) == 0 || this.fusionMode != 1) ? 0 : 1;
        }
    }

    public FlowableFlattenIterable(Flowable<T> flowable, Function<? super T, ? extends Iterable<? extends R>> function, int i2) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        Flowable<T> flowable = this.source;
        if (!(flowable instanceof Callable)) {
            flowable.subscribe((FlowableSubscriber) new FlattenIterableSubscriber(subscriber, this.mapper, this.prefetch));
            return;
        }
        try {
            Object objCall = ((Callable) flowable).call();
            if (objCall == null) {
                EmptySubscription.complete(subscriber);
                return;
            }
            try {
                FlowableFromIterable.subscribe(subscriber, this.mapper.apply(objCall).iterator());
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, subscriber);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
