package http;

import java.lang.Throwable;

/* JADX INFO: compiled from: OutcomeReceiverCompat.java */
/* JADX INFO: loaded from: classes.dex */
public interface saneness<T, E extends Throwable> {
    void onResult(T t);

    default void onError(E e) {
    }
}
