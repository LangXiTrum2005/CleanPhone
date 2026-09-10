package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableSwitchMapCompletable<T> extends Completable {
    final boolean delayErrors;
    final Function<? super T, ? extends CompletableSource> mapper;
    final Flowable<T> source;

    public static final class SwitchMapCompletableObserver<T> implements FlowableSubscriber<T>, Disposable {
        static final SwitchMapInnerObserver INNER_DISPOSED = new SwitchMapInnerObserver(null);
        final boolean delayErrors;
        volatile boolean done;
        final CompletableObserver downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapInnerObserver> inner = new AtomicReference<>();
        final Function<? super T, ? extends CompletableSource> mapper;
        Subscription upstream;

        public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -8003404460084760287L;
            final SwitchMapCompletableObserver<?> parent;

            public SwitchMapInnerObserver(SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.parent = switchMapCompletableObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public void onComplete() {
                this.parent.innerComplete(this);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public void onError(Throwable th) {
                this.parent.innerError(this, th);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z2) {
            this.downstream = completableObserver;
            this.mapper = function;
            this.delayErrors = z2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            disposeInner();
            this.errors.tryTerminateAndReport();
        }

        public void disposeInner() {
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.inner;
            SwitchMapInnerObserver switchMapInnerObserver = INNER_DISPOSED;
            SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet == null || andSet == switchMapInnerObserver) {
                return;
            }
            andSet.dispose();
        }

        public void innerComplete(SwitchMapInnerObserver switchMapInnerObserver) {
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.inner;
            while (!atomicReference.compareAndSet(switchMapInnerObserver, null)) {
                if (atomicReference.get() != switchMapInnerObserver) {
                    return;
                }
            }
            if (this.done) {
                this.errors.tryTerminateConsumer(this.downstream);
            }
        }

        public void innerError(SwitchMapInnerObserver switchMapInnerObserver, Throwable th) {
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.inner;
            while (!atomicReference.compareAndSet(switchMapInnerObserver, null)) {
                if (atomicReference.get() != switchMapInnerObserver) {
                    RxJavaPlugins.onError(th);
                    return;
                }
            }
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.delayErrors) {
                    if (this.done) {
                        this.errors.tryTerminateConsumer(this.downstream);
                    }
                } else {
                    this.upstream.cancel();
                    disposeInner();
                    this.errors.tryTerminateConsumer(this.downstream);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.inner.get() == INNER_DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            this.done = true;
            if (this.inner.get() == null) {
                this.errors.tryTerminateConsumer(this.downstream);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.errors.tryAddThrowableOrReport(th)) {
                if (this.delayErrors) {
                    onComplete();
                } else {
                    disposeInner();
                    this.errors.tryTerminateConsumer(this.downstream);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onNext(T t) {
            try {
                CompletableSource completableSourceApply = this.mapper.apply(t);
                Objects.requireNonNull(completableSourceApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = completableSourceApply;
                SwitchMapInnerObserver switchMapInnerObserver = new SwitchMapInnerObserver(this);
                while (true) {
                    SwitchMapInnerObserver switchMapInnerObserver2 = this.inner.get();
                    if (switchMapInnerObserver2 == INNER_DISPOSED) {
                        return;
                    }
                    AtomicReference<SwitchMapInnerObserver> atomicReference = this.inner;
                    do {
                        if (atomicReference.compareAndSet(switchMapInnerObserver2, switchMapInnerObserver)) {
                            if (switchMapInnerObserver2 != null) {
                                switchMapInnerObserver2.dispose();
                            }
                            completableSource.subscribe(switchMapInnerObserver);
                            return;
                        }
                    } while (atomicReference.get() == switchMapInnerObserver2);
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
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSwitchMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z2) {
        this.source = flowable;
        this.mapper = function;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe((FlowableSubscriber) new SwitchMapCompletableObserver(completableObserver, this.mapper, this.delayErrors));
    }
}
