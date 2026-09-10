package io.reactivex.rxjava3.core;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42973a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f42973a) {
            case 0:
                return Flowable.empty();
            case 1:
                return Maybe.empty();
            default:
                return Observable.empty();
        }
    }
}
