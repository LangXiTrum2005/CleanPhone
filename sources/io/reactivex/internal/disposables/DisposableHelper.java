package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public enum DisposableHelper implements Disposable {
    DISPOSED;

    public static boolean replace(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        while (true) {
            Disposable disposable2 = atomicReference.get();
            if (disposable2 != DISPOSED) {
                while (!atomicReference.compareAndSet(disposable2, disposable)) {
                    if (atomicReference.get() != disposable2) {
                    }
                }
                return true;
            }
            if (disposable == null) {
                return false;
            }
            disposable.dispose();
            return false;
        }
    }

    public static void reportDisposableSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        while (true) {
            Disposable disposable2 = atomicReference.get();
            if (disposable2 == DISPOSED) {
                if (disposable == null) {
                    return false;
                }
                disposable.dispose();
                return false;
            }
            do {
                if (atomicReference.compareAndSet(disposable2, disposable)) {
                    if (disposable2 == null) {
                        return true;
                    }
                    disposable2.dispose();
                    return true;
                }
            } while (atomicReference.get() == disposable2);
        }
    }

    public static boolean setOnce(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "d is null");
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                disposable.dispose();
                if (atomicReference.get() == DISPOSED) {
                    return false;
                }
                reportDisposableSet();
                return false;
            }
        }
        return true;
    }

    public static boolean trySet(AtomicReference<Disposable> atomicReference, Disposable disposable) {
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                if (atomicReference.get() != DISPOSED) {
                    return false;
                }
                disposable.dispose();
                return false;
            }
        }
        return true;
    }

    public static boolean validate(Disposable disposable, Disposable disposable2) {
        if (disposable2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        }
        if (disposable == null) {
            return true;
        }
        disposable2.dispose();
        reportDisposableSet();
        return false;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return true;
    }

    public static boolean dispose(AtomicReference<Disposable> atomicReference) {
        Disposable andSet;
        Disposable disposable = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (disposable == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(Disposable disposable) {
        return disposable == DISPOSED;
    }
}
