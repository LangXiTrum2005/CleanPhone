package io.reactivex.internal.operators.single;

import io.reactivex.Notification;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.operators.mixed.MaterializeSingleObserver;

/* JADX INFO: loaded from: classes7.dex */
public final class SingleMaterialize<T> extends Single<Notification<T>> {
    final Single<T> source;

    public SingleMaterialize(Single<T> single) {
        this.source = single;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Notification<T>> singleObserver) {
        this.source.subscribe(new MaterializeSingleObserver(singleObserver));
    }
}
