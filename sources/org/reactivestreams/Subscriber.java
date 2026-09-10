package org.reactivestreams;

/* JADX INFO: loaded from: classes7.dex */
public interface Subscriber<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(Object obj);

    void onSubscribe(Subscription subscription);
}
