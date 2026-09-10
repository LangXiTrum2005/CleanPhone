package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {
    final boolean delayErrors;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final Flowable<T> source;

    public static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        static final SwitchMapSingleObserver<Object> INNER_DISPOSED = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Subscriber<? super R> downstream;
        long emitted;
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        Subscription upstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();

        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapSingleSubscriber<?, R> parent;

            public SwitchMapSingleObserver(SwitchMapSingleSubscriber<?, R> switchMapSingleSubscriber) {
                this.parent = switchMapSingleSubscriber;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.parent.innerError(this, th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                this.item = r;
                this.parent.drain();
            }
        }

        public SwitchMapSingleSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z2) {
            this.downstream = subscriber;
            this.mapper = function;
            this.delayErrors = z2;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
        }

        public void disposeInner() {
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
            SwitchMapSingleObserver<Object> switchMapSingleObserver = INNER_DISPOSED;
            SwitchMapSingleObserver<R> andSet = atomicReference.getAndSet((SwitchMapSingleObserver<R>) switchMapSingleObserver);
            if (andSet == null || andSet == switchMapSingleObserver) {
                return;
            }
            andSet.dispose();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.downstream;
            AtomicThrowable atomicThrowable = this.errors;
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
            AtomicLong atomicLong = this.requested;
            long j = this.emitted;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (atomicThrowable.get() != null && !this.delayErrors) {
                    subscriber.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z2 = this.done;
                SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                boolean z3 = switchMapSingleObserver == null;
                if (z2 && z3) {
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (thTerminate != null) {
                        subscriber.onError(thTerminate);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                if (z3 || switchMapSingleObserver.item == null || j == atomicLong.get()) {
                    this.emitted = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapSingleObserver, null) && atomicReference.get() == switchMapSingleObserver) {
                    }
                    subscriber.onNext(switchMapSingleObserver.item);
                    j++;
                }
            }
        }

        public void innerError(SwitchMapSingleObserver<R> switchMapSingleObserver, Throwable th) {
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
            while (!atomicReference.compareAndSet(switchMapSingleObserver, null)) {
                if (atomicReference.get() != switchMapSingleObserver) {
                    RxJavaPlugins.onError(th);
                }
            }
            if (this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    disposeInner();
                }
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            SwitchMapSingleObserver<R> switchMapSingleObserver = this.inner.get();
            if (switchMapSingleObserver != null) {
                switchMapSingleObserver.dispose();
            }
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null SingleSource");
                SwitchMapSingleObserver<R> switchMapSingleObserver2 = new SwitchMapSingleObserver<>(this);
                while (true) {
                    SwitchMapSingleObserver<R> switchMapSingleObserver3 = this.inner.get();
                    if (switchMapSingleObserver3 == INNER_DISPOSED) {
                        return;
                    }
                    AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
                    do {
                        if (atomicReference.compareAndSet(switchMapSingleObserver3, switchMapSingleObserver2)) {
                            singleSource.subscribe(switchMapSingleObserver2);
                            return;
                        }
                    } while (atomicReference.get() == switchMapSingleObserver3);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                this.inner.getAndSet((SwitchMapSingleObserver<R>) INNER_DISPOSED);
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.upstream, subscription)) {
                this.upstream = subscription;
                this.downstream.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            BackpressureHelper.add(this.requested, j);
            drain();
        }
    }

    public FlowableSwitchMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z2) {
        this.source = flowable;
        this.mapper = function;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber) new SwitchMapSingleSubscriber(subscriber, this.mapper, this.delayErrors));
    }
}
