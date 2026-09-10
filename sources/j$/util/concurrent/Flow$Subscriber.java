package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
public interface Flow$Subscriber<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(Flow$Subscription flow$Subscription);
}
