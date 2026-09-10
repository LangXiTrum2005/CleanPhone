package io.reactivex.internal.operators.mixed;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSwitchMapMaybe<T, R> extends Observable<R> {
    final boolean delayErrors;
    final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
    final Observable<T> source;

    public static final class SwitchMapMaybeMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        static final SwitchMapMaybeObserver<Object> INNER_DISPOSED = new SwitchMapMaybeObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Observer<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapMaybeObserver<R>> inner = new AtomicReference<>();
        final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        Disposable upstream;

        public static final class SwitchMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapMaybeMainObserver<?, R> parent;

            public SwitchMapMaybeObserver(SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver) {
                this.parent = switchMapMaybeMainObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                this.parent.innerError(this, th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r) {
                this.item = r;
                this.parent.drain();
            }
        }

        public SwitchMapMaybeMainObserver(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            disposeInner();
        }

        public void disposeInner() {
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            SwitchMapMaybeObserver<Object> switchMapMaybeObserver = INNER_DISPOSED;
            SwitchMapMaybeObserver<R> andSet = atomicReference.getAndSet((SwitchMapMaybeObserver<R>) switchMapMaybeObserver);
            if (andSet == null || andSet == switchMapMaybeObserver) {
                return;
            }
            andSet.dispose();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.downstream;
            AtomicThrowable atomicThrowable = this.errors;
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (atomicThrowable.get() != null && !this.delayErrors) {
                    observer.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z2 = this.done;
                SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
                boolean z3 = switchMapMaybeObserver == null;
                if (z2 && z3) {
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (thTerminate != null) {
                        observer.onError(thTerminate);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (z3 || switchMapMaybeObserver.item == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapMaybeObserver, null) && atomicReference.get() == switchMapMaybeObserver) {
                    }
                    observer.onNext(switchMapMaybeObserver.item);
                }
            }
        }

        public void innerComplete(SwitchMapMaybeObserver<R> switchMapMaybeObserver) {
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            while (!atomicReference.compareAndSet(switchMapMaybeObserver, null)) {
                if (atomicReference.get() != switchMapMaybeObserver) {
                    return;
                }
            }
            drain();
        }

        public void innerError(SwitchMapMaybeObserver<R> switchMapMaybeObserver, Throwable th) {
            AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
            while (!atomicReference.compareAndSet(switchMapMaybeObserver, null)) {
                if (atomicReference.get() != switchMapMaybeObserver) {
                    RxJavaPlugins.onError(th);
                }
            }
            if (this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    this.upstream.dispose();
                    disposeInner();
                }
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
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

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            SwitchMapMaybeObserver<R> switchMapMaybeObserver = this.inner.get();
            if (switchMapMaybeObserver != null) {
                switchMapMaybeObserver.dispose();
            }
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = new SwitchMapMaybeObserver<>(this);
                while (true) {
                    SwitchMapMaybeObserver<R> switchMapMaybeObserver3 = this.inner.get();
                    if (switchMapMaybeObserver3 == INNER_DISPOSED) {
                        return;
                    }
                    AtomicReference<SwitchMapMaybeObserver<R>> atomicReference = this.inner;
                    do {
                        if (atomicReference.compareAndSet(switchMapMaybeObserver3, switchMapMaybeObserver2)) {
                            maybeSource.subscribe(switchMapMaybeObserver2);
                            return;
                        }
                    } while (atomicReference.get() == switchMapMaybeObserver3);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.dispose();
                this.inner.getAndSet((SwitchMapMaybeObserver<R>) INNER_DISPOSED);
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapMaybe(Observable<T> observable, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z2) {
        this.source = observable;
        this.mapper = function;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        if (ScalarXMapZHelper.tryAsMaybe(this.source, this.mapper, observer)) {
            return;
        }
        this.source.subscribe(new SwitchMapMaybeMainObserver(observer, this.mapper, this.delayErrors));
    }
}
