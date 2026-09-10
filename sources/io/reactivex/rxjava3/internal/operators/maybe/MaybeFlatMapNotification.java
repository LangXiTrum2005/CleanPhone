package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeFlatMapNotification<T, R> extends AbstractMaybeWithUpstream<T, R> {
    final Supplier<? extends MaybeSource<? extends R>> onCompleteSupplier;
    final Function<? super Throwable, ? extends MaybeSource<? extends R>> onErrorMapper;
    final Function<? super T, ? extends MaybeSource<? extends R>> onSuccessMapper;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = 4375739915521278546L;
        final MaybeObserver<? super R> downstream;
        final Supplier<? extends MaybeSource<? extends R>> onCompleteSupplier;
        final Function<? super Throwable, ? extends MaybeSource<? extends R>> onErrorMapper;
        final Function<? super T, ? extends MaybeSource<? extends R>> onSuccessMapper;
        Disposable upstream;

        public final class InnerObserver implements MaybeObserver<R> {
            public InnerObserver() {
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public void onComplete() {
                FlatMapMaybeObserver.this.downstream.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public void onError(Throwable th) {
                FlatMapMaybeObserver.this.downstream.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(FlatMapMaybeObserver.this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
            public void onSuccess(R r) {
                FlatMapMaybeObserver.this.downstream.onSuccess(r);
            }
        }

        public FlatMapMaybeObserver(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends R>> function, Function<? super Throwable, ? extends MaybeSource<? extends R>> function2, Supplier<? extends MaybeSource<? extends R>> supplier) {
            this.downstream = maybeObserver;
            this.onSuccessMapper = function;
            this.onErrorMapper = function2;
            this.onCompleteSupplier = supplier;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
            this.upstream.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onComplete() {
            try {
                MaybeSource<? extends R> maybeSource = this.onCompleteSupplier.get();
                Objects.requireNonNull(maybeSource, "The onCompleteSupplier returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource2 = maybeSource;
                if (isDisposed()) {
                    return;
                }
                maybeSource2.subscribe(new InnerObserver());
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onError(Throwable th) {
            try {
                MaybeSource<? extends R> maybeSourceApply = this.onErrorMapper.apply(th);
                Objects.requireNonNull(maybeSourceApply, "The onErrorMapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = maybeSourceApply;
                if (isDisposed()) {
                    return;
                }
                maybeSource.subscribe(new InnerObserver());
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(T t) {
            try {
                MaybeSource<? extends R> maybeSourceApply = this.onSuccessMapper.apply(t);
                Objects.requireNonNull(maybeSourceApply, "The onSuccessMapper returned a null MaybeSource");
                MaybeSource<? extends R> maybeSource = maybeSourceApply;
                if (isDisposed()) {
                    return;
                }
                maybeSource.subscribe(new InnerObserver());
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }
    }

    public MaybeFlatMapNotification(MaybeSource<T> maybeSource, Function<? super T, ? extends MaybeSource<? extends R>> function, Function<? super Throwable, ? extends MaybeSource<? extends R>> function2, Supplier<? extends MaybeSource<? extends R>> supplier) {
        super(maybeSource);
        this.onSuccessMapper = function;
        this.onErrorMapper = function2;
        this.onCompleteSupplier = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new FlatMapMaybeObserver(maybeObserver, this.onSuccessMapper, this.onErrorMapper, this.onCompleteSupplier));
    }
}
