package com.google.android.gms.ads.nonagon.devicetier;

import com.google.android.gms.internal.ads.gx1;
import com.google.android.gms.internal.ads.kx1;
import com.google.android.gms.internal.ads.o40;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zza implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f11351a;

    public zza(kx1 kx1Var) {
        this.f11351a = kx1Var;
    }

    public static zza zza(kx1 kx1Var) {
        return new zza(kx1Var);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new DeviceTierManager(((o40) this.f11351a).a());
    }
}
