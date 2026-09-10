package io.reactivex.rxjava3.internal.operators.observable;

import A.A;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;
import io.reactivex.rxjava3.internal.fuseable.SimpleQueue;
import io.reactivex.rxjava3.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSwitchMap<T, R> extends AbstractObservableWithUpstream<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends ObservableSource<? extends R>> mapper;

    public static final class SwitchMapInnerObserver<T, R> extends AtomicReference<Disposable> implements Observer<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        final long index;
        final SwitchMapObserver<T, R> parent;
        volatile SimpleQueue<R> queue;

        public SwitchMapInnerObserver(SwitchMapObserver<T, R> switchMapObserver, long j, int i2) {
            this.parent = switchMapObserver;
            this.index = j;
            this.bufferSize = i2;
        }

        public void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th) {
            this.parent.innerError(this, th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(R r) {
            if (this.index == this.parent.unique) {
                if (r != null) {
                    this.queue.offer(r);
                }
                this.parent.drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iRequestFusion = queueDisposable.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.queue = queueDisposable;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (iRequestFusion == 2) {
                        this.queue = queueDisposable;
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.bufferSize);
            }
        }
    }

    public static final class SwitchMapObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        static final SwitchMapInnerObserver<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Observer<? super R> downstream;
        final Function<? super T, ? extends ObservableSource<? extends R>> mapper;
        volatile long unique;
        Disposable upstream;
        final AtomicReference<SwitchMapInnerObserver<T, R>> active = new AtomicReference<>();
        final AtomicThrowable errors = new AtomicThrowable();

        static {
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver = new SwitchMapInnerObserver<>(null, -1L, 1);
            CANCELLED = switchMapInnerObserver;
            switchMapInnerObserver.cancel();
        }

        public SwitchMapObserver(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i2, boolean z2) {
            this.downstream = observer;
            this.mapper = function;
            this.bufferSize = i2;
            this.delayErrors = z2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.dispose();
            disposeInner();
            this.errors.tryTerminateAndReport();
        }

        public void disposeInner() {
            SwitchMapInnerObserver<T, R> andSet = this.active.getAndSet((SwitchMapInnerObserver<T, R>) CANCELLED);
            if (andSet != null) {
                andSet.cancel();
            }
        }

        /* JADX WARN: Code duplicated, block: B:86:0x00d0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x0010 A[SYNTHETIC] */
        public void drain() {
            SimpleQueue<R> simpleQueue;
            A aPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Observer<? super R> observer = this.downstream;
            AtomicReference<SwitchMapInnerObserver<T, R>> atomicReference = this.active;
            boolean z2 = this.delayErrors;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.done) {
                    boolean z3 = atomicReference.get() == null;
                    if (z2) {
                        if (z3) {
                            Throwable th = this.errors.get();
                            if (th != null) {
                                observer.onError(th);
                                return;
                            } else {
                                observer.onComplete();
                                return;
                            }
                        }
                    } else if (this.errors.get() != null) {
                        this.errors.tryTerminateConsumer(observer);
                        return;
                    } else if (z3) {
                        observer.onComplete();
                        return;
                    }
                }
                SwitchMapInnerObserver<T, R> switchMapInnerObserver = atomicReference.get();
                if (switchMapInnerObserver != null && (simpleQueue = switchMapInnerObserver.queue) != null) {
                    boolean z4 = false;
                    while (!this.cancelled) {
                        if (switchMapInnerObserver == atomicReference.get()) {
                            if (!z2 && this.errors.get() != null) {
                                this.errors.tryTerminateConsumer(observer);
                                return;
                            }
                            boolean z5 = switchMapInnerObserver.done;
                            try {
                                aPoll = simpleQueue.poll();
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.errors.tryAddThrowableOrReport(th2);
                                while (!atomicReference.compareAndSet(switchMapInnerObserver, null) && atomicReference.get() == switchMapInnerObserver) {
                                }
                                if (z2) {
                                    switchMapInnerObserver.cancel();
                                } else {
                                    disposeInner();
                                    this.upstream.dispose();
                                    this.done = true;
                                }
                                z4 = true;
                                aPoll = null;
                            }
                            boolean z6 = aPoll == null;
                            if (z5 && z6) {
                                while (!atomicReference.compareAndSet(switchMapInnerObserver, null) && atomicReference.get() == switchMapInnerObserver) {
                                }
                            } else if (!z6) {
                                observer.onNext(aPoll);
                            }
                            if (z4) {
                                continue;
                            }
                        }
                        z4 = true;
                        if (z4) {
                            continue;
                        }
                    }
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public void innerError(SwitchMapInnerObserver<T, R> switchMapInnerObserver, Throwable th) {
            if (switchMapInnerObserver.index != this.unique || !this.errors.tryAddThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.dispose();
                this.done = true;
            }
            switchMapInnerObserver.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th) {
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

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            long j = this.unique + 1;
            this.unique = j;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver = this.active.get();
            if (switchMapInnerObserver != null) {
                switchMapInnerObserver.cancel();
            }
            try {
                ObservableSource<? extends R> observableSourceApply = this.mapper.apply(t);
                Objects.requireNonNull(observableSourceApply, "The ObservableSource returned is null");
                ObservableSource<? extends R> observableSource = observableSourceApply;
                SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = new SwitchMapInnerObserver<>(this, j, this.bufferSize);
                while (true) {
                    SwitchMapInnerObserver<T, R> switchMapInnerObserver3 = this.active.get();
                    if (switchMapInnerObserver3 == CANCELLED) {
                        return;
                    }
                    AtomicReference<SwitchMapInnerObserver<T, R>> atomicReference = this.active;
                    do {
                        if (atomicReference.compareAndSet(switchMapInnerObserver3, switchMapInnerObserver2)) {
                            observableSource.subscribe(switchMapInnerObserver2);
                            return;
                        }
                    } while (atomicReference.get() == switchMapInnerObserver3);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, int i2, boolean z2) {
        super(observableSource);
        this.mapper = function;
        this.bufferSize = i2;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        if (ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.mapper)) {
            return;
        }
        this.source.subscribe(new SwitchMapObserver(observer, this.mapper, this.bufferSize, this.delayErrors));
    }
}
