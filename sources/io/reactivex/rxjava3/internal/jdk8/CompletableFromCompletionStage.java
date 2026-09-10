package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes7.dex */
public final class CompletableFromCompletionStage<T> extends Completable {
    final CompletionStage<T> stage;

    public static final class CompletionStageHandler<T> implements Disposable, BiConsumer<T, Throwable> {
        final CompletableObserver downstream;
        final FlowableFromCompletionStage.BiConsumerAtomicReference<T> whenReference;

        public CompletionStageHandler(CompletableObserver completableObserver, FlowableFromCompletionStage.BiConsumerAtomicReference<T> biConsumerAtomicReference) {
            this.downstream = completableObserver;
            this.whenReference = biConsumerAtomicReference;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.whenReference.set(null);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.whenReference.get() == null;
        }

        @Override // java.util.function.BiConsumer
        public void accept(T t, Throwable th) {
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public CompletableFromCompletionStage(CompletionStage<T> completionStage) {
        this.stage = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        FlowableFromCompletionStage.BiConsumerAtomicReference biConsumerAtomicReference = new FlowableFromCompletionStage.BiConsumerAtomicReference();
        CompletionStageHandler completionStageHandler = new CompletionStageHandler(completableObserver, biConsumerAtomicReference);
        biConsumerAtomicReference.lazySet(completionStageHandler);
        completableObserver.onSubscribe(completionStageHandler);
        this.stage.whenComplete(biConsumerAtomicReference);
    }
}
