package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableZipIterable<T, U, V> extends Observable<V> {
    final Iterable<U> other;
    final Observable<? extends T> source;
    final BiFunction<? super T, ? super U, ? extends V> zipper;

    public static final class ZipIterableObserver<T, U, V> implements Observer<T>, Disposable {
        boolean done;
        final Observer<? super V> downstream;
        final Iterator<U> iterator;
        Disposable upstream;
        final BiFunction<? super T, ? super U, ? extends V> zipper;

        public ZipIterableObserver(Observer<? super V> observer, Iterator<U> it, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.downstream = observer;
            this.iterator = it;
            this.zipper = biFunction;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        public void error(Throwable th) {
            this.done = true;
            this.upstream.dispose();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                U next = this.iterator.next();
                Objects.requireNonNull(next, "The iterator returned a null value");
                try {
                    V vApply = this.zipper.apply(t, next);
                    Objects.requireNonNull(vApply, "The zipper function returned a null value");
                    this.downstream.onNext(vApply);
                    try {
                        if (this.iterator.hasNext()) {
                            return;
                        }
                        this.done = true;
                        this.upstream.dispose();
                        this.downstream.onComplete();
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        error(th);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    error(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                error(th3);
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

    public ObservableZipIterable(Observable<? extends T> observable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        this.source = observable;
        this.other = iterable;
        this.zipper = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super V> observer) {
        try {
            Iterator<U> it = this.other.iterator();
            Objects.requireNonNull(it, "The iterator returned by other is null");
            Iterator<U> it2 = it;
            try {
                if (it2.hasNext()) {
                    this.source.subscribe(new ZipIterableObserver(observer, it2, this.zipper));
                } else {
                    EmptyDisposable.complete(observer);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptyDisposable.error(th, observer);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
