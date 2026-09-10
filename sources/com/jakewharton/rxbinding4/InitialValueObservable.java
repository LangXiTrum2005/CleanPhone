package com.jakewharton.rxbinding4;

import com.google.android.gms.ads.RequestConfiguration;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/jakewharton/rxbinding4/InitialValueObservable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lio/reactivex/rxjava3/core/Observable;", "Skipped", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
public abstract class InitialValueObservable<T> extends Observable<T> {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/InitialValueObservable$Skipped;", "Lio/reactivex/rxjava3/core/Observable;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    public final class Skipped extends Observable<T> {
        @Override // io.reactivex.rxjava3.core.Observable
        public final void subscribeActual(Observer observer) {
            Intrinsics.g(observer, "observer");
            throw null;
        }
    }

    public abstract Object a();

    public abstract void b(Observer observer);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        Intrinsics.g(observer, "observer");
        b(observer);
        observer.onNext(a());
    }
}
