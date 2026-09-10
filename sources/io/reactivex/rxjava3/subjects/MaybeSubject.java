package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeSubject<T> extends Maybe<T> implements MaybeObserver<T> {
    static final MaybeDisposable[] EMPTY = new MaybeDisposable[0];
    static final MaybeDisposable[] TERMINATED = new MaybeDisposable[0];
    Throwable error;
    T value;
    final AtomicBoolean once = new AtomicBoolean();
    final AtomicReference<MaybeDisposable<T>[]> observers = new AtomicReference<>(EMPTY);

    public static final class MaybeDisposable<T> extends AtomicReference<MaybeSubject<T>> implements Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        final MaybeObserver<? super T> downstream;

        public MaybeDisposable(MaybeObserver<? super T> maybeObserver, MaybeSubject<T> maybeSubject) {
            this.downstream = maybeObserver;
            lazySet(maybeSubject);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            MaybeSubject<T> andSet = getAndSet(null);
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
    public static <T> MaybeSubject<T> create() {
        return new MaybeSubject<>();
    }

    public boolean add(MaybeDisposable<T> maybeDisposable) {
        while (true) {
            MaybeDisposable<T>[] maybeDisposableArr = this.observers.get();
            if (maybeDisposableArr == TERMINATED) {
                return false;
            }
            int length = maybeDisposableArr.length;
            MaybeDisposable<T>[] maybeDisposableArr2 = new MaybeDisposable[length + 1];
            System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr2, 0, length);
            maybeDisposableArr2[length] = maybeDisposable;
            AtomicReference<MaybeDisposable<T>[]> atomicReference = this.observers;
            while (!atomicReference.compareAndSet(maybeDisposableArr, maybeDisposableArr2)) {
                if (atomicReference.get() != maybeDisposableArr) {
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

    public boolean hasComplete() {
        return this.observers.get() == TERMINATED && this.value == null && this.error == null;
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

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            for (MaybeDisposable<T> maybeDisposable : this.observers.getAndSet(TERMINATED)) {
                maybeDisposable.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onError(Throwable th) {
        ExceptionHelper.nullCheck(th, "onError called with a null Throwable.");
        if (!this.once.compareAndSet(false, true)) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        for (MaybeDisposable<T> maybeDisposable : this.observers.getAndSet(TERMINATED)) {
            maybeDisposable.downstream.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (this.observers.get() == TERMINATED) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T t) {
        ExceptionHelper.nullCheck(t, "onSuccess called with a null value.");
        if (this.once.compareAndSet(false, true)) {
            this.value = t;
            for (MaybeDisposable<T> maybeDisposable : this.observers.getAndSet(TERMINATED)) {
                maybeDisposable.downstream.onSuccess(t);
            }
        }
    }

    public void remove(MaybeDisposable<T> maybeDisposable) {
        MaybeDisposable<T>[] maybeDisposableArr;
        while (true) {
            MaybeDisposable<T>[] maybeDisposableArr2 = this.observers.get();
            int length = maybeDisposableArr2.length;
            if (length == 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (maybeDisposableArr2[i2] == maybeDisposable) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length == 1) {
                maybeDisposableArr = EMPTY;
            } else {
                MaybeDisposable<T>[] maybeDisposableArr3 = new MaybeDisposable[length - 1];
                System.arraycopy(maybeDisposableArr2, 0, maybeDisposableArr3, 0, i2);
                System.arraycopy(maybeDisposableArr2, i2 + 1, maybeDisposableArr3, i2, (length - i2) - 1);
                maybeDisposableArr = maybeDisposableArr3;
            }
            AtomicReference<MaybeDisposable<T>[]> atomicReference = this.observers;
            while (!atomicReference.compareAndSet(maybeDisposableArr2, maybeDisposableArr)) {
                if (atomicReference.get() != maybeDisposableArr2) {
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        MaybeDisposable<T> maybeDisposable = new MaybeDisposable<>(maybeObserver, this);
        maybeObserver.onSubscribe(maybeDisposable);
        if (add(maybeDisposable)) {
            if (maybeDisposable.isDisposed()) {
                remove(maybeDisposable);
                return;
            }
            return;
        }
        Throwable th = this.error;
        if (th != null) {
            maybeObserver.onError(th);
            return;
        }
        T t = this.value;
        if (t == null) {
            maybeObserver.onComplete();
        } else {
            maybeObserver.onSuccess(t);
        }
    }
}
