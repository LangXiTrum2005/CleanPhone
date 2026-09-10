package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends Publisher<? extends R>> mapper;
    final int prefetch;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$rxjava3$internal$util$ErrorMode;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            $SwitchMap$io$reactivex$rxjava3$internal$util$ErrorMode = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$rxjava3$internal$util$ErrorMode[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, Subscription {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean active;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final int limit;
        final Function<? super T, ? extends Publisher<? extends R>> mapper;
        final int prefetch;
        SimpleQueue<T> queue;
        int sourceMode;
        Subscription upstream;
        final ConcatMapInner<R> inner = new ConcatMapInner<>(this);
        final AtomicThrowable errors = new AtomicThrowable();

        public BaseConcatMapSubscriber(Function<? super T, ? extends Publisher<? extends R>> function, int i2) {
            this.mapper = function;
            this.prefetch = i2;
            this.limit = i2 - (i2 >> 2);
        }

        @Override // org.reactivestreams.Subscription
        public abstract /* synthetic */ void cancel();

        public abstract void drain();

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public abstract /* synthetic */ void onError(Throwable th);

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.sourceMode == 2 || this.queue.offer(t)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        subscribeActual();
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        subscribeActual();
                        subscription.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                subscribeActual();
                subscription.request(this.prefetch);
            }
        }

        @Override // org.reactivestreams.Subscription
        public abstract /* synthetic */ void request(long j);

        public abstract void subscribeActual();
    }

    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final Subscriber<? super R> downstream;
        final boolean veryEnd;

        public ConcatMapDelayed(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i2, boolean z2) {
            super(function, i2);
            this.downstream = subscriber;
            this.veryEnd = z2;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
            this.errors.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void drain() {
            Object obj;
            if (getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z2 = this.done;
                        if (z2 && !this.veryEnd && this.errors.get() != null) {
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                        try {
                            T tPoll = this.queue.poll();
                            boolean z3 = tPoll == null;
                            if (z2 && z3) {
                                this.errors.tryTerminateConsumer(this.downstream);
                                return;
                            }
                            if (!z3) {
                                try {
                                    Publisher<? extends R> publisherApply = this.mapper.apply(tPoll);
                                    Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                                    Publisher<? extends R> publisher = publisherApply;
                                    if (this.sourceMode != 1) {
                                        int i2 = this.consumed + 1;
                                        if (i2 == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i2);
                                        } else {
                                            this.consumed = i2;
                                        }
                                    }
                                    if (publisher instanceof Supplier) {
                                        try {
                                            obj = ((Supplier) publisher).get();
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            this.errors.tryAddThrowableOrReport(th);
                                            if (!this.veryEnd) {
                                                this.upstream.cancel();
                                                this.errors.tryTerminateConsumer(this.downstream);
                                                return;
                                            }
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            continue;
                                        } else if (this.inner.isUnbounded()) {
                                            this.downstream.onNext(obj);
                                        } else {
                                            this.active = true;
                                            ConcatMapInner<R> concatMapInner = this.inner;
                                            concatMapInner.setSubscription(new WeakScalarSubscription(obj, concatMapInner));
                                        }
                                    } else {
                                        this.active = true;
                                        publisher.subscribe(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.upstream.cancel();
                                    this.errors.tryAddThrowableOrReport(th2);
                                    this.errors.tryTerminateConsumer(this.downstream);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.upstream.cancel();
                            this.errors.tryAddThrowableOrReport(th3);
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (!this.veryEnd) {
                    this.upstream.cancel();
                    this.done = true;
                }
                this.active = false;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, org.reactivestreams.Subscription
        public void request(long j) {
            this.inner.request(j);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void subscribeActual() {
            this.downstream.onSubscribe(this);
        }
    }

    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final Subscriber<? super R> downstream;
        final AtomicInteger wip;

        public ConcatMapImmediate(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i2) {
            super(function, i2);
            this.downstream = subscriber;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, org.reactivestreams.Subscription
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
            this.errors.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z2 = this.done;
                        try {
                            T tPoll = this.queue.poll();
                            boolean z3 = tPoll == null;
                            if (z2 && z3) {
                                this.downstream.onComplete();
                                return;
                            }
                            if (!z3) {
                                try {
                                    Publisher<? extends R> publisherApply = this.mapper.apply(tPoll);
                                    Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                                    Publisher<? extends R> publisher = publisherApply;
                                    if (this.sourceMode != 1) {
                                        int i2 = this.consumed + 1;
                                        if (i2 == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i2);
                                        } else {
                                            this.consumed = i2;
                                        }
                                    }
                                    if (publisher instanceof Supplier) {
                                        try {
                                            Object obj = ((Supplier) publisher).get();
                                            if (obj == null) {
                                                continue;
                                            } else if (!this.inner.isUnbounded()) {
                                                this.active = true;
                                                ConcatMapInner<R> concatMapInner = this.inner;
                                                concatMapInner.setSubscription(new WeakScalarSubscription(obj, concatMapInner));
                                            } else if (!HalfSerializer.onNext(this.downstream, obj, this, this.errors)) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.throwIfFatal(th);
                                            this.upstream.cancel();
                                            this.errors.tryAddThrowableOrReport(th);
                                            this.errors.tryTerminateConsumer(this.downstream);
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        publisher.subscribe(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.upstream.cancel();
                                    this.errors.tryAddThrowableOrReport(th2);
                                    this.errors.tryTerminateConsumer(this.downstream);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.upstream.cancel();
                            this.errors.tryAddThrowableOrReport(th3);
                            this.errors.tryTerminateConsumer(this.downstream);
                            return;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(Throwable th) {
            this.upstream.cancel();
            HalfSerializer.onError(this.downstream, th, this, this.errors);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r) {
            HalfSerializer.onNext(this.downstream, r, this, this.errors);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.inner.cancel();
            HalfSerializer.onError(this.downstream, th, this, this.errors);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, org.reactivestreams.Subscription
        public void request(long j) {
            this.inner.request(j);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void subscribeActual() {
            this.downstream.onSubscribe(this);
        }
    }

    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final ConcatMapSupport<R> parent;
        long produced;

        public ConcatMapInner(ConcatMapSupport<R> concatMapSupport) {
            super(false);
            this.parent = concatMapSupport;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0L;
                produced(j);
            }
            this.parent.innerComplete();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0L;
                produced(j);
            }
            this.parent.innerError(th);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(R r) {
            this.produced++;
            this.parent.innerNext(r);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            setSubscription(subscription);
        }
    }

    public interface ConcatMapSupport<T> {
        void innerComplete();

        void innerError(Throwable th);

        void innerNext(T t);
    }

    public static final class WeakScalarSubscription<T> implements Subscription {
        final Subscriber<? super T> downstream;
        boolean once;
        final T value;

        public WeakScalarSubscription(T t, Subscriber<? super T> subscriber) {
            this.value = t;
            this.downstream = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (j <= 0 || this.once) {
                return;
            }
            this.once = true;
            Subscriber<? super T> subscriber = this.downstream;
            subscriber.onNext(this.value);
            subscriber.onComplete();
        }
    }

    public FlowableConcatMap(Flowable<T> flowable, Function<? super T, ? extends Publisher<? extends R>> function, int i2, ErrorMode errorMode) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i2;
        this.errorMode = errorMode;
    }

    public static <T, R> Subscriber<T> subscribe(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i2, ErrorMode errorMode) {
        int i3 = AnonymousClass1.$SwitchMap$io$reactivex$rxjava3$internal$util$ErrorMode[errorMode.ordinal()];
        if (i3 != 1) {
            return i3 != 2 ? new ConcatMapImmediate(subscriber, function, i2) : new ConcatMapDelayed(subscriber, function, i2, true);
        }
        return new ConcatMapDelayed(subscriber, function, i2, false);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.mapper)) {
            return;
        }
        this.source.subscribe(subscribe(subscriber, this.mapper, this.prefetch, this.errorMode));
    }
}
