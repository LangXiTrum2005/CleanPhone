package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableFromCompletionStage<T> extends Observable<T> {
    final CompletionStage<T> stage;

    public static final class BiConsumerAtomicReference<T> extends AtomicReference<BiConsumer<T, Throwable>> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 45838553147237545L;

        @Override // java.util.function.BiConsumer
        public void accept(T t, Throwable th) {
            BiConsumer<T, Throwable> biConsumer = get();
            if (biConsumer != null) {
                biConsumer.accept(t, th);
            }
        }
    }

    public static final class CompletionStageHandler<T> extends DeferredScalarDisposable<T> implements BiConsumer<T, Throwable> {
        private static final long serialVersionUID = 4665335664328839859L;
        final BiConsumerAtomicReference<T> whenReference;

        public CompletionStageHandler(Observer<? super T> observer, BiConsumerAtomicReference<T> biConsumerAtomicReference) {
            super(observer);
            this.whenReference = biConsumerAtomicReference;
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            super.dispose();
            this.whenReference.set(null);
        }

        @Override // java.util.function.BiConsumer
        public void accept(T t, Throwable th) {
            if (th != null) {
                this.downstream.onError(th);
            } else if (t != null) {
                complete(t);
            } else {
                this.downstream.onError(new NullPointerException("The CompletionStage terminated with null."));
            }
        }
    }

    public ObservableFromCompletionStage(CompletionStage<T> completionStage) {
        this.stage = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        BiConsumerAtomicReference biConsumerAtomicReference = new BiConsumerAtomicReference();
        CompletionStageHandler completionStageHandler = new CompletionStageHandler(observer, biConsumerAtomicReference);
        biConsumerAtomicReference.lazySet(completionStageHandler);
        observer.onSubscribe(completionStageHandler);
        this.stage.whenComplete(biConsumerAtomicReference);
    }
}
