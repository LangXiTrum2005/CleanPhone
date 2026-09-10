package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class ParallelCollector<T, A, R> extends Flowable<R> {
    final Collector<T, A, R> collector;
    final ParallelFlowable<? extends T> source;

    public static final class ParallelCollectorInnerSubscriber<T, A, R> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7954444275102466525L;
        final BiConsumer<A, T> accumulator;
        final BinaryOperator<A> combiner;
        A container;
        boolean done;
        final ParallelCollectorSubscriber<T, A, R> parent;

        public ParallelCollectorInnerSubscriber(ParallelCollectorSubscriber<T, A, R> parallelCollectorSubscriber, A a2, BiConsumer<A, T> biConsumer, BinaryOperator<A> binaryOperator) {
            this.parent = parallelCollectorSubscriber;
            this.accumulator = biConsumer;
            this.combiner = binaryOperator;
            this.container = a2;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.done) {
                return;
            }
            A a2 = this.container;
            this.container = null;
            this.done = true;
            this.parent.innerComplete(a2, this.combiner);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.container = null;
            this.done = true;
            this.parent.innerError(th);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                this.accumulator.accept(this.container, t);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                get().cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public static final class ParallelCollectorSubscriber<T, A, R> extends DeferredScalarSubscription<R> {
        private static final long serialVersionUID = -5370107872170712765L;
        final AtomicReference<SlotPair<A>> current;
        final AtomicThrowable error;
        final Function<A, R> finisher;
        final AtomicInteger remaining;
        final ParallelCollectorInnerSubscriber<T, A, R>[] subscribers;

        public ParallelCollectorSubscriber(Subscriber<? super R> subscriber, int i2, Collector<T, A, R> collector) {
            super(subscriber);
            this.current = new AtomicReference<>();
            this.remaining = new AtomicInteger();
            this.error = new AtomicThrowable();
            this.finisher = collector.finisher();
            ParallelCollectorInnerSubscriber<T, A, R>[] parallelCollectorInnerSubscriberArr = new ParallelCollectorInnerSubscriber[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                parallelCollectorInnerSubscriberArr[i3] = new ParallelCollectorInnerSubscriber<>(this, collector.supplier().get(), collector.accumulator(), collector.combiner());
            }
            this.subscribers = parallelCollectorInnerSubscriberArr;
            this.remaining.lazySet(i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SlotPair<A> addValue(A a2) {
            SlotPair<A> slotPair;
            int iTryAcquireSlot;
            while (true) {
                slotPair = this.current.get();
                if (slotPair == null) {
                    SlotPair<A> slotPair2 = new SlotPair<>();
                    AtomicReference<SlotPair<A>> atomicReference = this.current;
                    while (true) {
                        if (atomicReference.compareAndSet(null, slotPair2)) {
                            slotPair = slotPair2;
                        } else if (atomicReference.get() != null) {
                        }
                    }
                }
                iTryAcquireSlot = slotPair.tryAcquireSlot();
                if (iTryAcquireSlot >= 0) {
                    break;
                }
                AtomicReference<SlotPair<A>> atomicReference2 = this.current;
                while (!atomicReference2.compareAndSet(slotPair, null) && atomicReference2.get() == slotPair) {
                }
            }
            if (iTryAcquireSlot == 0) {
                slotPair.first = a2;
            } else {
                slotPair.second = a2;
            }
            if (!slotPair.releaseSlot()) {
                return null;
            }
            AtomicReference<SlotPair<A>> atomicReference3 = this.current;
            while (!atomicReference3.compareAndSet(slotPair, null)) {
                if (atomicReference3.get() != slotPair) {
                    return slotPair;
                }
            }
            return slotPair;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.rxjava3.internal.fuseable.QueueSubscription, org.reactivestreams.Subscription
        public void cancel() {
            for (ParallelCollectorInnerSubscriber<T, A, R> parallelCollectorInnerSubscriber : this.subscribers) {
                parallelCollectorInnerSubscriber.cancel();
            }
        }

        public void innerComplete(A a2, BinaryOperator<A> binaryOperator) {
            while (true) {
                SlotPair<A> slotPairAddValue = addValue(a2);
                if (slotPairAddValue == null) {
                    break;
                }
                try {
                    a2 = (A) binaryOperator.apply(slotPairAddValue.first, slotPairAddValue.second);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    innerError(th);
                    return;
                }
            }
            if (this.remaining.decrementAndGet() == 0) {
                SlotPair<A> slotPair = this.current.get();
                this.current.lazySet(null);
                try {
                    R rApply = this.finisher.apply(slotPair.first);
                    Objects.requireNonNull(rApply, "The finisher returned a null value");
                    complete(rApply);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    innerError(th2);
                }
            }
        }

        public void innerError(Throwable th) {
            if (this.error.compareAndSet(null, th)) {
                cancel();
                this.downstream.onError(th);
            } else if (th != this.error.get()) {
                RxJavaPlugins.onError(th);
            }
        }
    }

    public static final class SlotPair<T> extends AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;
        T first;
        final AtomicInteger releaseIndex = new AtomicInteger();
        T second;

        public boolean releaseSlot() {
            return this.releaseIndex.incrementAndGet() == 2;
        }

        public int tryAcquireSlot() {
            int i2;
            do {
                i2 = get();
                if (i2 >= 2) {
                    return -1;
                }
            } while (!compareAndSet(i2, i2 + 1));
            return i2;
        }
    }

    public ParallelCollector(ParallelFlowable<? extends T> parallelFlowable, Collector<T, A, R> collector) {
        this.source = parallelFlowable;
        this.collector = collector;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        try {
            ParallelCollectorSubscriber parallelCollectorSubscriber = new ParallelCollectorSubscriber(subscriber, this.source.parallelism(), this.collector);
            subscriber.onSubscribe(parallelCollectorSubscriber);
            this.source.subscribe(parallelCollectorSubscriber.subscribers);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, subscriber);
        }
    }
}
