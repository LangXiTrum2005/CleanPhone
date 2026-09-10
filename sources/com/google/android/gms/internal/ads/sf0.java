package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sf0 implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fd1 f19952b;

    public /* synthetic */ sf0(fd1 fd1Var, int i10) {
        this.f19951a = i10;
        this.f19952b = fd1Var;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final ListenableFuture zza(Object obj) throws eo0 {
        b30 b30Var = (b30) obj;
        switch (this.f19951a) {
            case 0:
                if (b30Var != null) {
                    return this.f19952b;
                }
                throw new eo0(1, "Retrieve Web View from image ad response failed.");
            default:
                if (b30Var == null || b30Var.zzh() == null) {
                    throw new eo0(1, "Retrieve video view in html5 ad response failed.");
                }
                return this.f19952b;
        }
    }
}
