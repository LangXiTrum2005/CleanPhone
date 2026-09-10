package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableSwitchMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends Publisher<? extends R>> mapper;

    public static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long index;
        final SwitchMapSubscriber<T, R> parent;
        volatile SimpleQueue<R> queue;

        public SwitchMapInnerSubscriber(SwitchMapSubscriber<T, R> switchMapSubscriber, long j, int i2) {
            this.parent = switchMapSubscriber;
            this.index = j;
            this.bufferSize = i2;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() throws Throwable {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                this.done = true;
                switchMapSubscriber.drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) throws Throwable {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index != switchMapSubscriber.unique || !switchMapSubscriber.errors.tryAddThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!switchMapSubscriber.delayErrors) {
                switchMapSubscriber.upstream.cancel();
                switchMapSubscriber.done = true;
            }
            this.done = true;
            switchMapSubscriber.drain();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(R r) throws Throwable {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                if (this.fusionMode != 0 || this.queue.offer(r)) {
                    switchMapSubscriber.drain();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) throws Throwable {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        subscription.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                subscription.request(this.bufferSize);
            }
        }

        public void request(long j) {
            if (this.fusionMode != 1) {
                get().request(j);
            }
        }
    }

    public static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        static final SwitchMapInnerSubscriber<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Subscriber<? super R> downstream;
        final Function<? super T, ? extends Publisher<? extends R>> mapper;
        volatile long unique;
        Subscription upstream;
        final AtomicReference<SwitchMapInnerSubscriber<T, R>> active = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicThrowable errors = new AtomicThrowable();

        static {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = new SwitchMapInnerSubscriber<>(null, -1L, 1);
            CANCELLED = switchMapInnerSubscriber;
            switchMapInnerSubscriber.cancel();
        }

        public SwitchMapSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i2, boolean z2) {
            this.downstream = subscriber;
            this.mapper = function;
            this.bufferSize = i2;
            this.delayErrors = z2;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
            this.errors.tryTerminateAndReport();
        }

        public void disposeInner() {
            AtomicReference<SwitchMapInnerSubscriber<T, R>> atomicReference = this.active;
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = CANCELLED;
            SwitchMapInnerSubscriber<T, R> andSet = atomicReference.getAndSet((SwitchMapInnerSubscriber<T, R>) switchMapInnerSubscriber);
            if (andSet == switchMapInnerSubscriber || andSet == null) {
                return;
            }
            andSet.cancel();
        }

        public void drain() throws Throwable {
            boolean z2;
            long j;
            R rPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.done) {
                    if (this.delayErrors) {
                        if (this.active.get() == null) {
                            this.errors.tryTerminateConsumer(subscriber);
                            return;
                        }
                    } else if (this.errors.get() != null) {
                        disposeInner();
                        this.errors.tryTerminateConsumer(subscriber);
                        return;
                    } else if (this.active.get() == null) {
                        subscriber.onComplete();
                        return;
                    }
                }
                SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.active.get();
                SimpleQueue<R> simpleQueue = switchMapInnerSubscriber != null ? switchMapInnerSubscriber.queue : null;
                if (simpleQueue != null) {
                    long j2 = this.requested.get();
                    long j3 = 0;
                    while (true) {
                        z2 = false;
                        if (j3 == j2) {
                            j = 0;
                            break;
                        }
                        if (!this.cancelled) {
                            boolean z3 = switchMapInnerSubscriber.done;
                            try {
                                rPoll = simpleQueue.poll();
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                switchMapInnerSubscriber.cancel();
                                this.errors.tryAddThrowableOrReport(th);
                                rPoll = null;
                                z3 = true;
                            }
                            boolean z4 = rPoll == null;
                            j = 0;
                            if (switchMapInnerSubscriber == this.active.get()) {
                                if (z3) {
                                    if (this.delayErrors) {
                                        if (z4) {
                                            AtomicReference<SwitchMapInnerSubscriber<T, R>> atomicReference = this.active;
                                            while (!atomicReference.compareAndSet(switchMapInnerSubscriber, null) && atomicReference.get() == switchMapInnerSubscriber) {
                                            }
                                        }
                                    } else if (this.errors.get() != null) {
                                        this.errors.tryTerminateConsumer(subscriber);
                                        return;
                                    } else if (z4) {
                                        AtomicReference<SwitchMapInnerSubscriber<T, R>> atomicReference2 = this.active;
                                        while (!atomicReference2.compareAndSet(switchMapInnerSubscriber, null) && atomicReference2.get() == switchMapInnerSubscriber) {
                                        }
                                    }
                                }
                                if (z4) {
                                    break;
                                }
                                subscriber.onNext(rPoll);
                                j3++;
                            }
                            z2 = true;
                            break;
                        }
                        return;
                    }
                    if (j3 == j2 && switchMapInnerSubscriber.done) {
                        if (this.delayErrors) {
                            if (simpleQueue.isEmpty()) {
                                AtomicReference<SwitchMapInnerSubscriber<T, R>> atomicReference3 = this.active;
                                while (!atomicReference3.compareAndSet(switchMapInnerSubscriber, null) && atomicReference3.get() == switchMapInnerSubscriber) {
                                }
                            }
                        } else if (this.errors.get() != null) {
                            disposeInner();
                            this.errors.tryTerminateConsumer(subscriber);
                            return;
                        } else if (simpleQueue.isEmpty()) {
                            AtomicReference<SwitchMapInnerSubscriber<T, R>> atomicReference4 = this.active;
                            while (!atomicReference4.compareAndSet(switchMapInnerSubscriber, null) && atomicReference4.get() == switchMapInnerSubscriber) {
                            }
                        }
                    }
                    if (j3 != j && !this.cancelled) {
                        if (j2 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j3);
                        }
                        switchMapInnerSubscriber.request(j3);
                    }
                    if (z2) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() throws Throwable {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) throws Throwable {
            if (this.done || !this.errors.tryAddThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) throws Throwable {
            if (this.done) {
                return;
            }
            long j = this.unique + 1;
            this.unique = j;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.active.get();
            if (switchMapInnerSubscriber != null) {
                switchMapInnerSubscriber.cancel();
            }
            try {
                Publisher<? extends R> publisherApply = this.mapper.apply(t);
                Objects.requireNonNull(publisherApply, "The publisher returned is null");
                Publisher<? extends R> publisher = publisherApply;
                SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = new SwitchMapInnerSubscriber<>(this, j, this.bufferSize);
                while (true) {
                    SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber3 = this.active.get();
                    if (switchMapInnerSubscriber3 == CANCELLED) {
                        return;
                    }
                    AtomicReference<SwitchMapInnerSubscriber<T, R>> atomicReference = this.active;
                    do {
                        if (atomicReference.compareAndSet(switchMapInnerSubscriber3, switchMapInnerSubscriber2)) {
                            publisher.subscribe(switchMapInnerSubscriber2);
                            return;
                        }
                    } while (atomicReference.get() == switchMapInnerSubscriber3);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) throws Throwable {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                if (this.unique == 0) {
                    this.upstream.request(Long.MAX_VALUE);
                } else {
                    drain();
                }
            }
        }
    }

    public FlowableSwitchMap(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends R>> function, int i2, boolean z2) {
        super(flowable);
        this.mapper = function;
        this.bufferSize = i2;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) new SwitchMapSubscriber(subscriber, this.mapper, this.bufferSize, this.delayErrors));
    }
}
