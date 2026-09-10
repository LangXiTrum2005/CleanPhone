package io.reactivex.rxjava3.core;

/* JADX INFO: loaded from: classes7.dex */
@FunctionalInterface
public interface SingleOperator<Downstream, Upstream> {
    SingleObserver<? super Upstream> apply(SingleObserver<? super Downstream> singleObserver) throws Throwable;
}
