package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class SingleSubject<T> extends Single<T> implements SingleObserver<T> {
    static final SingleDisposable[] EMPTY = new SingleDisposable[0];
    static final SingleDisposable[] TERMINATED = new SingleDisposable[0];
    Throwable error;
    T value;
    final AtomicBoolean once = new AtomicBoolean();
    final AtomicReference<SingleDisposable<T>[]> observers = new AtomicReference<>(EMPTY);

    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        final SingleObserver<? super T> downstream;

        public SingleDisposable(SingleObserver<? super T> singleObserver, SingleSubject<T> singleSubject) {
            this.downstream = singleObserver;
            lazySet(singleSubject);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.remove(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == null;
        }
    }

    @CheckReturnValue
    public static <T> SingleSubject<T> create() {
        return new SingleSubject<>();
    }

    public boolean add(SingleDisposable<T> singleDisposable) {
        while (true) {
            SingleDisposable<T>[] singleDisposableArr = this.observers.get();
            if (singleDisposableArr == TERMINATED) {
                return false;
            }
            int length = singleDisposableArr.length;
            SingleDisposable<T>[] singleDisposableArr2 = new SingleDisposable[length + 1];
            System.arraycopy(singleDisposableArr, 0, singleDisposableArr2, 0, length);
            singleDisposableArr2[length] = singleDisposable;
            AtomicReference<SingleDisposable<T>[]> atomicReference = this.observers;
            while (!atomicReference.compareAndSet(singleDisposableArr, singleDisposableArr2)) {
                if (atomicReference.get() != singleDisposableArr) {
                }
            }
            return true;
        }
    }

    public Throwable getThrowable() {
        if (this.observers.get() == TERMINATED) {
            return this.error;
        }
        return null;
    }

    public T getValue() {
        if (this.observers.get() == TERMINATED) {
            return this.value;
        }
        return null;
    }

    public boolean hasObservers() {
        return this.observers.get().length != 0;
    }

    public boolean hasThrowable() {
        return this.observers.get() == TERMINATED && this.error != null;
    }

    public boolean hasValue() {
        return this.observers.get() == TERMINATED && this.value != null;
    }

    public int observerCount() {
        return this.observers.get().length;
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th) {
        ExceptionHelper.nullCheck(th, "onError called with a null Throwable.");
        if (!this.once.compareAndSet(false, true)) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        for (SingleDisposable<T> singleDisposable : this.observers.getAndSet(TERMINATED)) {
            singleDisposable.downstream.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (this.observers.get() == TERMINATED) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T t) {
        ExceptionHelper.nullCheck(t, "onSuccess called with a null value.");
        if (this.once.compareAndSet(false, true)) {
            this.value = t;
            for (SingleDisposable<T> singleDisposable : this.observers.getAndSet(TERMINATED)) {
                singleDisposable.downstream.onSuccess(t);
            }
        }
    }

    public void remove(SingleDisposable<T> singleDisposable) {
        SingleDisposable<T>[] singleDisposableArr;
        while (true) {
            SingleDisposable<T>[] singleDisposableArr2 = this.observers.get();
            int length = singleDisposableArr2.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (singleDisposableArr2[i2] == singleDisposable) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                singleDisposableArr = EMPTY;
            } else {
                SingleDisposable<T>[] singleDisposableArr3 = new SingleDisposable[length - 1];
                System.arraycopy(singleDisposableArr2, 0, singleDisposableArr3, 0, i2);
                System.arraycopy(singleDisposableArr2, i2 + 1, singleDisposableArr3, i2, (length - i2) - 1);
                singleDisposableArr = singleDisposableArr3;
            }
            AtomicReference<SingleDisposable<T>[]> atomicReference = this.observers;
            while (!atomicReference.compareAndSet(singleDisposableArr2, singleDisposableArr)) {
                if (atomicReference.get() != singleDisposableArr2) {
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        SingleDisposable<T> singleDisposable = new SingleDisposable<>(singleObserver, this);
        singleObserver.onSubscribe(singleDisposable);
        if (add(singleDisposable)) {
            if (singleDisposable.isDisposed()) {
                remove(singleDisposable);
            }
        } else {
            Throwable th = this.error;
            if (th != null) {
                singleObserver.onError(th);
            } else {
                singleObserver.onSuccess(this.value);
            }
        }
    }
}
