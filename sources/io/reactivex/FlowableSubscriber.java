package io.reactivex;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public interface FlowableSubscriber<T> extends Subscriber<T> {
    @Override // org.reactivestreams.Subscriber
    /* synthetic */ void onComplete();

    @Override // org.reactivestreams.Subscriber
    /* synthetic */ void onError(Throwable th);

    @Override // org.reactivestreams.Subscriber
    /* synthetic */ void onNext(Object obj);

    @Override // org.reactivestreams.Subscriber
    void onSubscribe(Subscription subscription);
}
