package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeDefer<T> extends Maybe<T> {
    final Supplier<? extends MaybeSource<? extends T>> maybeSupplier;

    public MaybeDefer(Supplier<? extends MaybeSource<? extends T>> supplier) {
        this.maybeSupplier = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        try {
            MaybeSource<? extends T> maybeSource = this.maybeSupplier.get();
            Objects.requireNonNull(maybeSource, "The maybeSupplier returned a null MaybeSource");
            maybeSource.subscribe(maybeObserver);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptyDisposable.error(th, maybeObserver);
        }
    }
}
