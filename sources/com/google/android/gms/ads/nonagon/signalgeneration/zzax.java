package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.gx1;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.kx1;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.nc0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzax implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f11438a;

    public zzax(kx1 kx1Var) {
        this.f11438a = kx1Var;
    }

    public static zzax zza(kx1 kx1Var, kx1 kx1Var2) {
        return new zzax(kx1Var);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        zzr zzrVar = (zzr) this.f11438a.zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new nc0(zzrVar, k00Var);
    }
}
