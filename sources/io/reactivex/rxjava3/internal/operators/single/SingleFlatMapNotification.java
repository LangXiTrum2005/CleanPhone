package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class SingleFlatMapNotification<T, R> extends Single<R> {
    final Function<? super Throwable, ? extends SingleSource<? extends R>> onErrorMapper;
    final Function<? super T, ? extends SingleSource<? extends R>> onSuccessMapper;
    final SingleSource<T> source;

    public static final class FlatMapSingleObserver<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        private static final long serialVersionUID = 4375739915521278546L;
        final SingleObserver<? super R> downstream;
        final Function<? super Throwable, ? extends SingleSource<? extends R>> onErrorMapper;
        final Function<? super T, ? extends SingleSource<? extends R>> onSuccessMapper;
        Disposable upstream;

        public final class InnerObserver implements SingleObserver<R> {
            public InnerObserver() {
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public void onError(Throwable th) {
                FlatMapSingleObserver.this.downstream.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(FlatMapSingleObserver.this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public void onSuccess(R r) {
                FlatMapSingleObserver.this.downstream.onSuccess(r);
            }
        }

        public FlatMapSingleObserver(SingleObserver<? super R> singleObserver, Function<? super T, ? extends SingleSource<? extends R>> function, Function<? super Throwable, ? extends SingleSource<? extends R>> function2) {
            this.downstream = singleObserver;
            this.onSuccessMapper = function;
            this.onErrorMapper = function2;
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

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onError(Throwable th) {
            try {
                SingleSource<? extends R> singleSourceApply = this.onErrorMapper.apply(th);
                Objects.requireNonNull(singleSourceApply, "The onErrorMapper returned a null SingleSource");
                SingleSource<? extends R> singleSource = singleSourceApply;
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new InnerObserver());
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(T t) {
            try {
                SingleSource<? extends R> singleSourceApply = this.onSuccessMapper.apply(t);
                Objects.requireNonNull(singleSourceApply, "The onSuccessMapper returned a null SingleSource");
                SingleSource<? extends R> singleSource = singleSourceApply;
                if (isDisposed()) {
                    return;
                }
                singleSource.subscribe(new InnerObserver());
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }
    }

    public SingleFlatMapNotification(SingleSource<T> singleSource, Function<? super T, ? extends SingleSource<? extends R>> function, Function<? super Throwable, ? extends SingleSource<? extends R>> function2) {
        this.source = singleSource;
        this.onSuccessMapper = function;
        this.onErrorMapper = function2;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.source.subscribe(new FlatMapSingleObserver(singleObserver, this.onSuccessMapper, this.onErrorMapper));
    }
}
