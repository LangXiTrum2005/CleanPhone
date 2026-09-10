package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.gx1;
import com.google.android.gms.internal.ads.kx1;
import com.google.android.gms.internal.ads.wh0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzs implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f11519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f11520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kx1 f11521c;

    public zzs(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3) {
        this.f11519a = kx1Var;
        this.f11520b = kx1Var2;
        this.f11521c = kx1Var3;
    }

    public static zzs zza(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3) {
        return new zzs(kx1Var, kx1Var2, kx1Var3);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzr((wh0) this.f11519a.zzb(), (zzq) this.f11520b.zzb(), (String) this.f11521c.zzb());
    }
}
