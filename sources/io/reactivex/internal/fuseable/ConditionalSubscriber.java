package io.reactivex.internal.fuseable;

import io.reactivex.FlowableSubscriber;

/* JADX INFO: loaded from: classes7.dex */
public interface ConditionalSubscriber<T> extends FlowableSubscriber<T> {
    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* synthetic */ void onNext(Object obj);

    boolean tryOnNext(T t);
}
