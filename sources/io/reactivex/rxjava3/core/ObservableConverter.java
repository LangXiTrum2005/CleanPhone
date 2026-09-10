package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: classes7.dex */
@FunctionalInterface
public interface ObservableConverter<T, R> {
    R apply(Observable<T> observable);
}
