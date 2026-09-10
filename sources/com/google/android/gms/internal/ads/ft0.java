package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ft0 implements d81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hz f14532b;

    public /* synthetic */ ft0(hz hzVar, int i10) {
        this.f14531a = i10;
        this.f14532b = hzVar;
    }

    @Override // com.google.android.gms.internal.ads.d81
    public final /* synthetic */ Object apply(Object obj) {
        int i10 = this.f14531a;
        hz hzVar = this.f14532b;
        switch (i10) {
            case 0:
                int i11 = zze.zza;
                zzo.zzg("", (yk0) obj);
                zze.zza("Failed to get a cache key, reverting to legacy flow.");
                gt0 gt0Var = new gt0(null, hzVar.m());
                hzVar.f15436e = gt0Var;
                return gt0Var;
            default:
                mx mxVar = (mx) obj;
                gt0 gt0Var2 = new gt0(mxVar, new iv0(mxVar.f17575j));
                hzVar.f15436e = gt0Var2;
                return gt0Var2;
        }
    }
}
