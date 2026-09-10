package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: classes7.dex */
@FunctionalInterface
public interface CompletableTransformer {
    CompletableSource apply(Completable completable);
}
