package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes7.dex */
final class AutoCloseableDisposable extends ReferenceDisposable<AutoCloseable> {
    private static final long serialVersionUID = -6646144244598696847L;

    public AutoCloseableDisposable(AutoCloseable autoCloseable) {
        super(autoCloseable);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "AutoCloseableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }

    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    public void onDisposed(AutoCloseable autoCloseable) {
        try {
            autoCloseable.close();
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }
}
