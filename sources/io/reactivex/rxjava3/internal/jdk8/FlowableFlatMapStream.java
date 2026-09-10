package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableFlatMapStream<T, R> extends Flowable<R> {
    final Function<? super T, ? extends Stream<? extends R>> mapper;
    final int prefetch;
    final Flowable<T> source;

    public static final class FlatMapStreamSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -5127032662980523968L;
        volatile boolean cancelled;
        int consumed;
        AutoCloseable currentCloseable;
        Iterator<? extends R> currentIterator;
        final Subscriber<? super R> downstream;
        long emitted;
        final Function<? super T, ? extends Stream<? extends R>> mapper;
        final int prefetch;
        SimpleQueue<T> queue;
        int sourceMode;
        Subscription upstream;
        volatile boolean upstreamDone;
        final AtomicLong requested = new AtomicLong();
        final AtomicThrowable error = new AtomicThrowable();

        public FlatMapStreamSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends Stream<? extends R>> function, int i2) {
            this.downstream = subscriber;
            this.mapper = function;
            this.prefetch = i2;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            drain();
        }

        public void clearCurrentRethrowCloseError() throws Exception {
            this.currentIterator = null;
            AutoCloseable autoCloseable = this.currentCloseable;
            this.currentCloseable = null;
            if (autoCloseable != null) {
                autoCloseable.close();
            }
        }

        public void clearCurrentSuppressCloseError() {
            try {
                clearCurrentRethrowCloseError();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r16v0 */
        /* JADX WARN: Type inference failed for: r16v1 */
        /* JADX WARN: Type inference failed for: r16v2 */
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            AtomicThrowable atomicThrowable = this.error;
            Iterator<? extends R> it = this.currentIterator;
            long j = this.requested.get();
            long j2 = this.emitted;
            int i2 = this.prefetch;
            int i3 = i2 - (i2 >> 2);
            int i4 = 0;
            ?? r12 = 1;
            boolean z2 = this.sourceMode != 1;
            long j3 = j2;
            int iAddAndGet = 1;
            long j4 = j;
            Iterator<? extends R> it2 = it;
            while (true) {
                if (this.cancelled) {
                    simpleQueue.clear();
                    clearCurrentSuppressCloseError();
                } else {
                    boolean z3 = this.upstreamDone;
                    if (atomicThrowable.get() != null) {
                        subscriber.onError(atomicThrowable.get());
                        this.cancelled = r12;
                    } else if (it2 == null) {
                        try {
                            T tPoll = simpleQueue.poll();
                            ?? r16 = tPoll == null ? r12 : i4;
                            if (z3 && r16 != 0) {
                                subscriber.onComplete();
                                this.cancelled = r12;
                            } else if (r16 == 0) {
                                if (z2) {
                                    int i5 = this.consumed + r12;
                                    this.consumed = i5;
                                    if (i5 == i3) {
                                        this.consumed = i4;
                                        this.upstream.request(i3);
                                    }
                                }
                                try {
                                    Stream<? extends R> streamApply = this.mapper.apply(tPoll);
                                    Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                                    Stream<? extends R> stream = streamApply;
                                    it2 = stream.iterator();
                                    if (it2.hasNext()) {
                                        this.currentIterator = it2;
                                        this.currentCloseable = stream;
                                    } else {
                                        it2 = null;
                                    }
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    trySignalError(subscriber, th);
                                }
                            }
                            if (it2 == null && j3 != j4) {
                                try {
                                    R next = it2.next();
                                    Objects.requireNonNull(next, "The Stream.Iterator returned a null value");
                                    if (!this.cancelled) {
                                        subscriber.onNext(next);
                                        j3++;
                                        if (!this.cancelled) {
                                            try {
                                                if (!it2.hasNext()) {
                                                    try {
                                                        clearCurrentRethrowCloseError();
                                                        it2 = null;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        it2 = null;
                                                        Exceptions.throwIfFatal(th);
                                                        trySignalError(subscriber, th);
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
                                    Exceptions.throwIfFatal(th4);
                                    trySignalError(subscriber, th4);
                                }
                            }
                        } catch (Throwable th5) {
                            Exceptions.throwIfFatal(th5);
                            trySignalError(subscriber, th5);
                        }
                    } else if (it2 == null) {
                    }
                    i4 = 0;
                    r12 = 1;
                }
                this.emitted = j3;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                j4 = this.requested.get();
                i4 = 0;
                r12 = 1;
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            this.upstreamDone = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!this.error.compareAndSet(null, th)) {
                RxJavaPlugins.onError(th);
            } else {
                this.upstreamDone = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.sourceMode == 2 || this.queue.offer(t)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.upstreamDone = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
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

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        public void trySignalError(Subscriber<?> subscriber, Throwable th) {
            if (!this.error.compareAndSet(null, th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.upstream.cancel();
            this.cancelled = true;
            subscriber.onError(th);
        }
    }

    public FlowableFlatMapStream(Flowable<T> flowable, Function<? super T, ? extends Stream<? extends R>> function, int i2) {
        this.source = flowable;
        this.mapper = function;
        this.prefetch = i2;
    }

    public static <T, R> Subscriber<T> subscribe(Subscriber<? super R> subscriber, Function<? super T, ? extends Stream<? extends R>> function, int i2) {
        return new FlatMapStreamSubscriber(subscriber, function, i2);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        Stream<? extends R> stream;
        Flowable<T> flowable = this.source;
        if (!(flowable instanceof Supplier)) {
            flowable.subscribe(subscribe(subscriber, this.mapper, this.prefetch));
            return;
        }
        try {
            Object obj = ((Supplier) flowable).get();
            if (obj != null) {
                Stream<? extends R> streamApply = this.mapper.apply(obj);
                Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                stream = streamApply;
            } else {
                stream = null;
            }
            if (stream != null) {
                FlowableFromStream.subscribeStream(subscriber, stream);
            } else {
                EmptySubscription.complete(subscriber);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, subscriber);
        }
    }
}
