package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.gx1;
import com.google.android.gms.internal.ads.kx1;
import com.google.android.gms.internal.ads.o40;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzca implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f11105a;

    public zzca(kx1 kx1Var) {
        this.f11105a = kx1Var;
    }

    public static zzca zza(kx1 kx1Var) {
        return new zzca(kx1Var);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbz(((o40) this.f11105a).a());
    }
}
