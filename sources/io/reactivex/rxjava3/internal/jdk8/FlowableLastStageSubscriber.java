package io.reactivex.rxjava3.internal.jdk8;

import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableLastStageSubscriber<T> extends FlowableStageSubscriber<T> {
    final T defaultItem;
    final boolean hasDefault;

    public FlowableLastStageSubscriber(boolean z2, T t) {
        this.hasDefault = z2;
        this.defaultItem = t;
    }

    @Override // io.reactivex.rxjava3.internal.jdk8.FlowableStageSubscriber
    public void afterSubscribe(Subscription subscription) {
        subscription.request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.rxjava3.internal.jdk8.FlowableStageSubscriber, io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onComplete() {
        if (isDone()) {
            return;
        }
        T t = this.value;
        clear();
        if (t != null) {
            complete(t);
        } else if (this.hasDefault) {
            complete(this.defaultItem);
        } else {
            completeExceptionally(new NoSuchElementException());
        }
    }

    @Override // io.reactivex.rxjava3.internal.jdk8.FlowableStageSubscriber, io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onNext(T t) {
        this.value = t;
    }
}
