package io.reactivex.rxjava3.internal.subscribers;

/* JADX INFO: loaded from: classes7.dex */
public final class BlockingLastSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // io.reactivex.rxjava3.internal.subscribers.BlockingBaseSubscriber, io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        this.value = null;
        this.error = th;
        countDown();
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.BlockingBaseSubscriber, io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onNext(T t) {
        this.value = t;
    }
}
