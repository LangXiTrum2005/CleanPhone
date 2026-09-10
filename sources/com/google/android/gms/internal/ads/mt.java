package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mt implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ListenableFuture f17541b;

    public /* synthetic */ mt(int i10, ListenableFuture listenableFuture) {
        this.f17540a = i10;
        this.f17541b = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final ListenableFuture zza(Object obj) {
        switch (this.f17540a) {
            case 0:
                return zw1.x(this.f17541b, new ht(1, this, obj), l00.f16615h);
            case 1:
                return obj != null ? this.f17541b : zw1.l(new eo0(1, "Retrieve required value in native ad response failed."));
            default:
                return this.f17541b;
        }
    }
}
