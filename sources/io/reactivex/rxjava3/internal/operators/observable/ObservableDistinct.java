package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.BasicFuseableObserver;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableDistinct<T, K> extends AbstractObservableWithUpstream<T, T> {
    final Supplier<? extends Collection<? super K>> collectionSupplier;
    final Function<? super T, K> keySelector;

    public static final class DistinctObserver<T, K> extends BasicFuseableObserver<T, T> {
        final Collection<? super K> collection;
        final Function<? super T, K> keySelector;

        public DistinctObserver(Observer<? super T> observer, Function<? super T, K> function, Collection<? super K> collection) {
            super(observer);
            this.keySelector = function;
            this.collection = collection;
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicFuseableObserver, io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public void clear() {
            this.collection.clear();
            super.clear();
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicFuseableObserver, io.reactivex.rxjava3.core.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.collection.clear();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicFuseableObserver, io.reactivex.rxjava3.core.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.collection.clear();
            this.downstream.onError(th);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.core.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                K kApply = this.keySelector.apply(t);
                Objects.requireNonNull(kApply, "The keySelector returned a null key");
                if (this.collection.add(kApply)) {
                    this.downstream.onNext((Object) t);
                }
            } catch (Throwable th) {
                fail(th);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public T poll() throws Throwable {
            T tPoll;
            Collection<? super K> collection;
            K kApply;
            do {
                tPoll = this.qd.poll();
                if (tPoll == null) {
                    break;
                }
                collection = this.collection;
                kApply = this.keySelector.apply(tPoll);
                Objects.requireNonNull(kApply, "The keySelector returned a null key");
            } while (!collection.add(kApply));
            return tPoll;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public int requestFusion(int i2) {
            return transitiveBoundaryFusion(i2);
        }
    }

    public ObservableDistinct(ObservableSource<T> observableSource, Function<? super T, K> function, Supplier<? extends Collection<? super K>> supplier) {
        super(observableSource);
        this.keySelector = function;
        this.collectionSupplier = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            this.source.subscribe(new DistinctObserver(observer, this.keySelector, (Collection) ExceptionHelper.nullCheck(this.collectionSupplier.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptyDisposable.error(th, observer);
        }
    }
}
