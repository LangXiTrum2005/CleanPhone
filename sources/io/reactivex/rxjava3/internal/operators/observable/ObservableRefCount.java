package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableRefCount<T> extends Observable<T> {
    RefConnection connection;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f42989n;
    final Scheduler scheduler;
    final ConnectableObservable<T> source;
    final long timeout;
    final TimeUnit unit;

    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final ObservableRefCount<?> parent;
        long subscriberCount;
        Disposable timer;

        public RefConnection(ObservableRefCount<?> observableRefCount) {
            this.parent = observableRefCount;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.timeout(this);
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
            synchronized (this.parent) {
                try {
                    if (this.disconnectedEarly) {
                        this.parent.source.reset();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class RefCountObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = -7419642935409022375L;
        final RefConnection connection;
        final Observer<? super T> downstream;
        final ObservableRefCount<T> parent;
        Disposable upstream;

        public RefCountObserver(Observer<? super T> observer, ObservableRefCount<T> observableRefCount, RefConnection refConnection) {
            this.downstream = observer;
            this.parent = observableRefCount;
            this.connection = refConnection;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                this.parent.cancel(this.connection);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.terminated(this.connection);
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.onError(th);
            } else {
                this.parent.terminated(this.connection);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableRefCount(ConnectableObservable<T> connectableObservable) {
        this(connectableObservable, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public void cancel(RefConnection refConnection) {
        synchronized (this) {
            try {
                RefConnection refConnection2 = this.connection;
                if (refConnection2 != null && refConnection2 == refConnection) {
                    long j = refConnection.subscriberCount - 1;
                    refConnection.subscriberCount = j;
                    if (j == 0 && refConnection.connected) {
                        if (this.timeout == 0) {
                            timeout(refConnection);
                            return;
                        }
                        SequentialDisposable sequentialDisposable = new SequentialDisposable();
                        refConnection.timer = sequentialDisposable;
                        sequentialDisposable.replace(this.scheduler.scheduleDirect(refConnection, this.timeout, this.unit));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        RefConnection refConnection;
        boolean z2;
        Disposable disposable;
        synchronized (this) {
            try {
                refConnection = this.connection;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.connection = refConnection;
                }
                long j = refConnection.subscriberCount;
                if (j == 0 && (disposable = refConnection.timer) != null) {
                    disposable.dispose();
                }
                long j2 = j + 1;
                refConnection.subscriberCount = j2;
                if (refConnection.connected || j2 != this.f42989n) {
                    z2 = false;
                } else {
                    z2 = true;
                    refConnection.connected = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.source.subscribe(new RefCountObserver(observer, this, refConnection));
        if (z2) {
            this.source.connect(refConnection);
        }
    }

    public void terminated(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (this.connection == refConnection) {
                    Disposable disposable = refConnection.timer;
                    if (disposable != null) {
                        disposable.dispose();
                        refConnection.timer = null;
                    }
                    long j = refConnection.subscriberCount - 1;
                    refConnection.subscriberCount = j;
                    if (j == 0) {
                        this.connection = null;
                        this.source.reset();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void timeout(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (refConnection.subscriberCount == 0 && refConnection == this.connection) {
                    this.connection = null;
                    Disposable disposable = refConnection.get();
                    DisposableHelper.dispose(refConnection);
                    if (disposable == null) {
                        refConnection.disconnectedEarly = true;
                    } else {
                        this.source.reset();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ObservableRefCount(ConnectableObservable<T> connectableObservable, int i2, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.source = connectableObservable;
        this.f42989n = i2;
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }
}
