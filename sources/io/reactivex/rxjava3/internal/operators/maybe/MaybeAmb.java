package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeAmb<T> extends Maybe<T> {
    private final MaybeSource<? extends T>[] sources;
    private final Iterable<? extends MaybeSource<? extends T>> sourcesIterable;

    public static final class AmbMaybeObserver<T> implements MaybeObserver<T> {
        final MaybeObserver<? super T> downstream;
        final CompositeDisposable set;
        Disposable upstream;
        final AtomicBoolean winner;

        public AmbMaybeObserver(MaybeObserver<? super T> maybeObserver, CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean) {
            this.downstream = maybeObserver;
            this.set = compositeDisposable;
            this.winner = atomicBoolean;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onComplete() {
            if (this.winner.compareAndSet(false, true)) {
                this.set.delete(this.upstream);
                this.set.dispose();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onError(Throwable th) {
            if (!this.winner.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.set.delete(this.upstream);
            this.set.dispose();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.upstream = disposable;
            this.set.add(disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public void onSuccess(T t) {
            if (this.winner.compareAndSet(false, true)) {
                this.set.delete(this.upstream);
                this.set.dispose();
                this.downstream.onSuccess(t);
            }
        }
    }

    public MaybeAmb(MaybeSource<? extends T>[] maybeSourceArr, Iterable<? extends MaybeSource<? extends T>> iterable) {
        this.sources = maybeSourceArr;
        this.sourcesIterable = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        int length;
        MaybeSource<? extends T>[] maybeSourceArr = this.sources;
        if (maybeSourceArr == null) {
            maybeSourceArr = new MaybeSource[8];
            try {
                length = 0;
                for (MaybeSource<? extends T> maybeSource : this.sourcesIterable) {
                    if (maybeSource == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), maybeObserver);
                        return;
                    }
                    if (length == maybeSourceArr.length) {
                        MaybeSource<? extends T>[] maybeSourceArr2 = new MaybeSource[(length >> 2) + length];
                        System.arraycopy(maybeSourceArr, 0, maybeSourceArr2, 0, length);
                        maybeSourceArr = maybeSourceArr2;
                    }
                    int i2 = length + 1;
                    maybeSourceArr[length] = maybeSource;
                    length = i2;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptyDisposable.error(th, maybeObserver);
                return;
            }
        } else {
            length = maybeSourceArr.length;
        }
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        maybeObserver.onSubscribe(compositeDisposable);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        for (int i3 = 0; i3 < length; i3++) {
            MaybeSource<? extends T> maybeSource2 = maybeSourceArr[i3];
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (maybeSource2 == null) {
                compositeDisposable.dispose();
                NullPointerException nullPointerException = new NullPointerException("One of the MaybeSources is null");
                if (atomicBoolean.compareAndSet(false, true)) {
                    maybeObserver.onError(nullPointerException);
                    return;
                } else {
                    RxJavaPlugins.onError(nullPointerException);
                    return;
                }
            }
            maybeSource2.subscribe(new AmbMaybeObserver(maybeObserver, compositeDisposable, atomicBoolean));
        }
        if (length == 0) {
            maybeObserver.onComplete();
        }
    }
}
