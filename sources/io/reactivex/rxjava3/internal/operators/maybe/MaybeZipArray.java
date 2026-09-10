package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeZipArray<T, R> extends Maybe<R> {
    final MaybeSource<? extends T>[] sources;
    final Function<? super Object[], ? extends R> zipper;

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public R apply(T t) throws Throwable {
            R rApply = MaybeZipArray.this.zipper.apply(new Object[]{t});
            Objects.requireNonNull(rApply, "The zipper returned a null value");
            return rApply;
        }
    }

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -5556924161382950569L;
        final MaybeObserver<? super R> downstream;
        final ZipMaybeObserver<T>[] observers;
        final Object[] values;
        final Function<? super Object[], ? extends R> zipper;

        public ZipCoordinator(MaybeObserver<? super R> maybeObserver, int i2, Function<? super Object[], ? extends R> function) {
            super(i2);
            this.downstream = maybeObserver;
            this.zipper = function;
            ZipMaybeObserver<T>[] zipMaybeObserverArr = new ZipMaybeObserver[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                zipMaybeObserverArr[i3] = new ZipMaybeObserver<>(this, i3);
            }
            this.observers = zipMaybeObserverArr;
            this.values = new Object[i2];
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipMaybeObserver<T> zipMaybeObserver : this.observers) {
                    zipMaybeObserver.dispose();
                }
            }
        }

        public void disposeExcept(int i2) {
            ZipMaybeObserver<T>[] zipMaybeObserverArr = this.observers;
            int length = zipMaybeObserverArr.length;
            for (int i3 = 0; i3 < i2; i3++) {
                zipMaybeObserverArr[i3].dispose();
            }
            while (true) {
                i2++;
                if (i2 >= length) {
                    return;
                } else {
                    zipMaybeObserverArr[i2].dispose();
                }
            }
        }

        public void innerComplete(int i2) {
            if (getAndSet(0) > 0) {
                disposeExcept(i2);
                this.downstream.onComplete();
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

    public static final class ZipMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final ZipCoordinator<T, ?> parent;

        public ZipMaybeObserver(ZipCoordinator<T, ?> zipCoordinator, int i2) {
            this.parent = zipCoordinator;
            this.index = i2;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onError(Throwable th) {
            this.parent.innerError(th, this.index);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(T t) {
            this.parent.innerSuccess(t, this.index);
        }
    }

    public MaybeZipArray(MaybeSource<? extends T>[] maybeSourceArr, Function<? super Object[], ? extends R> function) {
        this.sources = maybeSourceArr;
        this.zipper = function;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        MaybeSource<? extends T>[] maybeSourceArr = this.sources;
        int length = maybeSourceArr.length;
        if (length == 1) {
            maybeSourceArr[0].subscribe(new MaybeMap.MapMaybeObserver(maybeObserver, new SingletonArrayFunc()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(maybeObserver, length, this.zipper);
        maybeObserver.onSubscribe(zipCoordinator);
        for (int i2 = 0; i2 < length && !zipCoordinator.isDisposed(); i2++) {
            MaybeSource<? extends T> maybeSource = maybeSourceArr[i2];
            if (maybeSource == null) {
                zipCoordinator.innerError(new NullPointerException("One of the sources is null"), i2);
                return;
            }
            maybeSource.subscribe(zipCoordinator.observers[i2]);
        }
    }
}
