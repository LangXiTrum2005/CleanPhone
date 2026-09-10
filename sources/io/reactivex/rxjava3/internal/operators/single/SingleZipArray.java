package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class SingleZipArray<T, R> extends Single<R> {
    final SingleSource<? extends T>[] sources;
    final Function<? super Object[], ? extends R> zipper;

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public R apply(T t) throws Throwable {
            R rApply = SingleZipArray.this.zipper.apply(new Object[]{t});
            Objects.requireNonNull(rApply, "The zipper returned a null value");
            return rApply;
        }
    }

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -5556924161382950569L;
        final SingleObserver<? super R> downstream;
        final ZipSingleObserver<T>[] observers;
        final Object[] values;
        final Function<? super Object[], ? extends R> zipper;

        public ZipCoordinator(SingleObserver<? super R> singleObserver, int i2, Function<? super Object[], ? extends R> function) {
            super(i2);
            this.downstream = singleObserver;
            this.zipper = function;
            ZipSingleObserver<T>[] zipSingleObserverArr = new ZipSingleObserver[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                zipSingleObserverArr[i3] = new ZipSingleObserver<>(this, i3);
            }
            this.observers = zipSingleObserverArr;
            this.values = new Object[i2];
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipSingleObserver<T> zipSingleObserver : this.observers) {
                    zipSingleObserver.dispose();
                }
            }
        }

        public void disposeExcept(int i2) {
            ZipSingleObserver<T>[] zipSingleObserverArr = this.observers;
            int length = zipSingleObserverArr.length;
            for (int i3 = 0; i3 < i2; i3++) {
                zipSingleObserverArr[i3].dispose();
            }
            while (true) {
                i2++;
                if (i2 >= length) {
                    return;
                } else {
                    zipSingleObserverArr[i2].dispose();
                }
            }
        }

        public void innerError(Throwable th, int i2) {
            if (getAndSet(0) <= 0) {
                RxJavaPlugins.onError(th);
            } else {
                disposeExcept(i2);
                this.downstream.onError(th);
            }
        }

        public void innerSuccess(T t, int i2) {
            this.values[i2] = t;
            if (decrementAndGet() == 0) {
                try {
                    R rApply = this.zipper.apply(this.values);
                    Objects.requireNonNull(rApply, "The zipper returned a null value");
                    this.downstream.onSuccess(rApply);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.downstream.onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    public static final class ZipSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final ZipCoordinator<T, ?> parent;

        public ZipSingleObserver(ZipCoordinator<T, ?> zipCoordinator, int i2) {
            this.parent = zipCoordinator;
            this.index = i2;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onError(Throwable th) {
            this.parent.innerError(th, this.index);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(T t) {
            this.parent.innerSuccess(t, this.index);
        }
    }

    public SingleZipArray(SingleSource<? extends T>[] singleSourceArr, Function<? super Object[], ? extends R> function) {
        this.sources = singleSourceArr;
        this.zipper = function;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        SingleSource<? extends T>[] singleSourceArr = this.sources;
        int length = singleSourceArr.length;
        if (length == 1) {
            singleSourceArr[0].subscribe(new SingleMap.MapSingleObserver(singleObserver, new SingletonArrayFunc()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(singleObserver, length, this.zipper);
        singleObserver.onSubscribe(zipCoordinator);
        for (int i2 = 0; i2 < length && !zipCoordinator.isDisposed(); i2++) {
            SingleSource<? extends T> singleSource = singleSourceArr[i2];
            if (singleSource == null) {
                zipCoordinator.innerError(new NullPointerException("One of the sources is null"), i2);
                return;
            }
            singleSource.subscribe(zipCoordinator.observers[i2]);
        }
    }
}
