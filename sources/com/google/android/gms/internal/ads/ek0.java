package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ek0 implements od1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mx f14000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14002d;

    public /* synthetic */ ek0(Object obj, mx mxVar, int i10, int i11) {
        this.f13999a = i11;
        this.f14002d = obj;
        this.f14000b = mxVar;
        this.f14001c = i10;
    }

    @Override // com.google.android.gms.internal.ads.od1
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        Bundle bundle;
        switch (this.f13999a) {
            case 0:
                uw uwVar = (uw) this.f14002d;
                mx mxVar = this.f14000b;
                if (mxVar != null && (bundle = mxVar.f17577m) != null) {
                    bundle.putBoolean("ls", true);
                }
                return zw1.x(((hl0) ((dx1) uwVar.f20918b).zzb()).x1(mxVar, this.f14001c), new fk0(mxVar, 0), (fe1) uwVar.f20920d);
            default:
                jk0 jk0Var = (jk0) this.f14002d;
                mx mxVar2 = this.f14000b;
                if (mxVar2 != null) {
                    jk0Var.getClass();
                    Bundle bundle2 = mxVar2.f17577m;
                    if (bundle2 != null) {
                        bundle2.putBoolean("ls", true);
                    }
                }
                return zw1.x(((hl0) jk0Var.f16109e.zzb()).A1(mxVar2, this.f14001c), new fk0(mxVar2, 1), jk0Var.f16106b);
        }
    }
}
