package io.reactivex.rxjava3.internal.fuseable;

import io.reactivex.rxjava3.core.FlowableSubscriber;

/* JADX INFO: loaded from: classes7.dex */
public interface ConditionalSubscriber<T> extends FlowableSubscriber<T> {
    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    /* synthetic */ void onComplete();

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
    /* synthetic */ void onNext(Object obj);

    boolean tryOnNext(T t);
}
