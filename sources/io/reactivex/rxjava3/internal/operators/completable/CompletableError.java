package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes7.dex */
public final class CompletableError extends Completable {
    final Throwable error;

    public CompletableError(Throwable th) {
        this.error = th;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        EmptyDisposable.error(this.error, completableObserver);
    }
}
