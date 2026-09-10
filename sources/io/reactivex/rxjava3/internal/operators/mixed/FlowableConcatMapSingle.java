package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.SimplePlainQueue;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final int prefetch;
    final Flowable<T> source;

    public static final class ConcatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        static final int STATE_ACTIVE = 1;
        static final int STATE_INACTIVE = 0;
        static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final Subscriber<? super R> downstream;
        long emitted;
        final ErrorMode errorMode;
        R item;
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        final int prefetch;
        final SimplePlainQueue<T> queue;
        volatile int state;
        Subscription upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapSingleObserver<R> inner = new ConcatMapSingleObserver<>(this);

        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final ConcatMapSingleSubscriber<?, R> parent;

            public ConcatMapSingleObserver(ConcatMapSingleSubscriber<?, R> concatMapSingleSubscriber) {
                this.parent = concatMapSingleSubscriber;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public void onSuccess(R r) {
                this.parent.innerSuccess(r);
            }
        }

        public ConcatMapSingleSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends SingleSource<? extends R>> function, int i2, ErrorMode errorMode) {
            this.downstream = subscriber;
            this.mapper = function;
            this.prefetch = i2;
            this.errorMode = errorMode;
            this.queue = new SpscArrayQueue(i2);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.inner.dispose();
            this.errors.tryTerminateAndReport();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.downstream;
            ErrorMode errorMode = this.errorMode;
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            AtomicLong atomicLong = this.requested;
            int i2 = this.prefetch;
            int i3 = i2 - (i2 >> 1);
            int iAddAndGet = 1;
            while (true) {
                if (!this.cancelled) {
                    int i4 = this.state;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i4 == 0))) {
                        break;
                    }
                    if (i4 == 0) {
                        boolean z2 = this.done;
                        T tPoll = simplePlainQueue.poll();
                        boolean z3 = tPoll == null;
                        if (z2 && z3) {
                            atomicThrowable.tryTerminateConsumer(subscriber);
                            return;
                        }
                        if (!z3) {
                            int i5 = this.consumed + 1;
                            if (i5 == i3) {
                                this.consumed = 0;
                                this.upstream.request(i3);
                            } else {
                                this.consumed = i5;
                            }
                            try {
                                SingleSource<? extends R> singleSourceApply = this.mapper.apply(tPoll);
                                Objects.requireNonNull(singleSourceApply, "The mapper returned a null SingleSource");
                                SingleSource<? extends R> singleSource = singleSourceApply;
                                this.state = 1;
                                singleSource.subscribe(this.inner);
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.upstream.cancel();
                                simplePlainQueue.clear();
                                atomicThrowable.tryAddThrowableOrReport(th);
                                atomicThrowable.tryTerminateConsumer(subscriber);
                                return;
                            }
                        }
                    } else if (i4 == 2) {
                        long j = this.emitted;
                        if (j != atomicLong.get()) {
                            R r = this.item;
                            this.item = null;
                            subscriber.onNext(r);
                            this.emitted = j + 1;
                            this.state = 0;
                        }
                    }
                } else {
                    simplePlainQueue.clear();
                    this.item = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            simplePlainQueue.clear();
            this.item = null;
            atomicThrowable.tryTerminateConsumer(subscriber);
        }

        public void innerError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.errorMode != ErrorMode.END) {
                    this.upstream.cancel();
                }
                this.state = 0;
                drain();
            }
        }

        public void innerSuccess(R r) {
            this.item = r;
            this.state = 2;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.errorMode == ErrorMode.IMMEDIATE) {
                    this.inner.dispose();
                }
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.queue.offer(t)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("queue full?!"));
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(this.prefetch);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            BackpressureHelper.add(this.requested, j);
            drain();
        }
    }

    public FlowableConcatMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, ErrorMode errorMode, int i2) {
        this.source = flowable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber) new ConcatMapSingleSubscriber(subscriber, this.mapper, this.prefetch, this.errorMode));
    }
}
