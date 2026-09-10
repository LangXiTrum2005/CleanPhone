package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservablePublish<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T> {
    final AtomicReference<PublishConnection<T>> current = new AtomicReference<>();
    final ObservableSource<T> source;

    public static final class InnerDisposable<T> extends AtomicReference<PublishConnection<T>> implements Disposable {
        private static final long serialVersionUID = 7463222674719692880L;
        final Observer<? super T> downstream;

        public InnerDisposable(Observer<? super T> observer, PublishConnection<T> publishConnection) {
            this.downstream = observer;
            lazySet(publishConnection);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            PublishConnection<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.remove(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == null;
        }
    }

    public static final class PublishConnection<T> extends AtomicReference<InnerDisposable<T>[]> implements Observer<T>, Disposable {
        static final InnerDisposable[] EMPTY = new InnerDisposable[0];
        static final InnerDisposable[] TERMINATED = new InnerDisposable[0];
        private static final long serialVersionUID = -3251430252873581268L;
        final AtomicReference<PublishConnection<T>> current;
        Throwable error;
        final AtomicBoolean connect = new AtomicBoolean();
        final AtomicReference<Disposable> upstream = new AtomicReference<>();

        public PublishConnection(AtomicReference<PublishConnection<T>> atomicReference) {
            this.current = atomicReference;
            lazySet(EMPTY);
        }

        public boolean add(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = get();
                if (innerDisposableArr == TERMINATED) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!compareAndSet(innerDisposableArr, innerDisposableArr2));
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            getAndSet(TERMINATED);
            AtomicReference<PublishConnection<T>> atomicReference = this.current;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            DisposableHelper.dispose(this.upstream);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == TERMINATED;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            this.upstream.lazySet(DisposableHelper.DISPOSED);
            for (InnerDisposable<T> innerDisposable : getAndSet(TERMINATED)) {
                innerDisposable.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th) {
            Disposable disposable = this.upstream.get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.upstream.lazySet(disposableHelper);
            for (InnerDisposable<T> innerDisposable : getAndSet(TERMINATED)) {
                innerDisposable.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            for (InnerDisposable<T> innerDisposable : get()) {
                innerDisposable.downstream.onNext(t);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        public void remove(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    } else if (innerDisposableArr[i2] == innerDisposable) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    return;
                }
                innerDisposableArr2 = EMPTY;
                if (length != 1) {
                    innerDisposableArr2 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, i2);
                    System.arraycopy(innerDisposableArr, i2 + 1, innerDisposableArr2, i2, (length - i2) - 1);
                }
            } while (!compareAndSet(innerDisposableArr, innerDisposableArr2));
        }
    }

    public ObservablePublish(ObservableSource<T> observableSource) {
        this.source = observableSource;
    }

    @Override // io.reactivex.rxjava3.observables.ConnectableObservable
    public void connect(Consumer<? super Disposable> consumer) {
        PublishConnection<T> publishConnection;
        loop0: while (true) {
            publishConnection = this.current.get();
            if (publishConnection != null && !publishConnection.isDisposed()) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.current);
            AtomicReference<PublishConnection<T>> atomicReference = this.current;
            do {
                if (atomicReference.compareAndSet(publishConnection, publishConnection2)) {
                    publishConnection = publishConnection2;
                    break loop0;
                }
            } while (atomicReference.get() == publishConnection);
        }
        boolean z2 = false;
        if (!publishConnection.connect.get() && publishConnection.connect.compareAndSet(false, true)) {
            z2 = true;
        }
        try {
            consumer.accept(publishConnection);
            if (z2) {
                this.source.subscribe(publishConnection);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.rxjava3.observables.ConnectableObservable
    public void reset() {
        PublishConnection<T> publishConnection = this.current.get();
        if (publishConnection == null || !publishConnection.isDisposed()) {
            return;
        }
        AtomicReference<PublishConnection<T>> atomicReference = this.current;
        while (!atomicReference.compareAndSet(publishConnection, null) && atomicReference.get() == publishConnection) {
        }
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamObservableSource
    public ObservableSource<T> source() {
        return this.source;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        PublishConnection<T> publishConnection;
        loop0: while (true) {
            publishConnection = this.current.get();
            if (publishConnection != null) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.current);
            AtomicReference<PublishConnection<T>> atomicReference = this.current;
            do {
                if (atomicReference.compareAndSet(publishConnection, publishConnection2)) {
                    publishConnection = publishConnection2;
                    break loop0;
                }
            } while (atomicReference.get() == publishConnection);
        }
        InnerDisposable<T> innerDisposable = new InnerDisposable<>(observer, publishConnection);
        observer.onSubscribe(innerDisposable);
        if (publishConnection.add(innerDisposable)) {
            if (innerDisposable.isDisposed()) {
                publishConnection.remove(innerDisposable);
            }
        } else {
            Throwable th = publishConnection.error;
            if (th != null) {
                observer.onError(th);
            } else {
                observer.onComplete();
            }
        }
    }
}
