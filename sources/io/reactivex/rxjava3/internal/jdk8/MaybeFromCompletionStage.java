package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CompletionStage;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeFromCompletionStage<T> extends Maybe<T> {
    final CompletionStage<T> stage;

    public static final class CompletionStageHandler<T> implements Disposable, BiConsumer<T, Throwable> {
        final MaybeObserver<? super T> downstream;
        final FlowableFromCompletionStage.BiConsumerAtomicReference<T> whenReference;

        public CompletionStageHandler(MaybeObserver<? super T> maybeObserver, FlowableFromCompletionStage.BiConsumerAtomicReference<T> biConsumerAtomicReference) {
            this.downstream = maybeObserver;
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
            } else if (t != null) {
                this.downstream.onSuccess(t);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public MaybeFromCompletionStage(CompletionStage<T> completionStage) {
        this.stage = completionStage;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        FlowableFromCompletionStage.BiConsumerAtomicReference biConsumerAtomicReference = new FlowableFromCompletionStage.BiConsumerAtomicReference();
        CompletionStageHandler completionStageHandler = new CompletionStageHandler(maybeObserver, biConsumerAtomicReference);
        biConsumerAtomicReference.lazySet(completionStageHandler);
        maybeObserver.onSubscribe(completionStageHandler);
        this.stage.whenComplete(biConsumerAtomicReference);
    }
}
