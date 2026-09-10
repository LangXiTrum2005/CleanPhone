package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: classes7.dex */
@FunctionalInterface
public interface CompletableOnSubscribe {
    void subscribe(CompletableEmitter completableEmitter) throws Throwable;
}
