package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeDoOnLifecycle<T> extends AbstractMaybeWithUpstream<T, T> {
    final Action onDispose;
    final Consumer<? super Disposable> onSubscribe;

    public static final class MaybeLifecycleObserver<T> implements MaybeObserver<T>, Disposable {
        final MaybeObserver<? super T> downstream;
        final Action onDispose;
        final Consumer<? super Disposable> onSubscribe;
        Disposable upstream;

        public MaybeLifecycleObserver(MaybeObserver<? super T> maybeObserver, Consumer<? super Disposable> consumer, Action action) {
            this.downstream = maybeObserver;
            this.onSubscribe = consumer;
            this.onDispose = action;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            try {
                this.onDispose.run();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onComplete() {
            Disposable disposable = this.upstream;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                this.upstream = disposableHelper;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onError(Throwable th) {
            Disposable disposable = this.upstream;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable == disposableHelper) {
                RxJavaPlugins.onError(th);
            } else {
                this.upstream = disposableHelper;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            try {
                this.onSubscribe.accept(disposable);
                if (DisposableHelper.validate(this.upstream, disposable)) {
                    this.upstream = disposable;
                    this.downstream.onSubscribe(this);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                disposable.dispose();
                this.upstream = DisposableHelper.DISPOSED;
                EmptyDisposable.error(th, this.downstream);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(T t) {
            Disposable disposable = this.upstream;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                this.upstream = disposableHelper;
                this.downstream.onSuccess(t);
            }
        }
    }

    public MaybeDoOnLifecycle(Maybe<T> maybe, Consumer<? super Disposable> consumer, Action action) {
        super(maybe);
        this.onSubscribe = consumer;
        this.onDispose = action;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new MaybeLifecycleObserver(maybeObserver, this.onSubscribe, this.onDispose));
    }
}
