package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes7.dex */
public final class BlockingFirstSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // io.reactivex.rxjava3.internal.subscribers.BlockingBaseSubscriber, io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.value == null) {
            this.error = th;
        } else {
            RxJavaPlugins.onError(th);
        }
        countDown();
    }

    @Override // io.reactivex.rxjava3.internal.subscribers.BlockingBaseSubscriber, io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.value == null) {
            this.value = t;
            this.upstream.cancel();
            countDown();
        }
    }
}
