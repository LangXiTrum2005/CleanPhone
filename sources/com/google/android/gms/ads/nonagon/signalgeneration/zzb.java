package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.gx1;
import com.google.android.gms.internal.ads.kx1;
import com.google.android.gms.internal.ads.o40;
import com.google.android.gms.internal.ads.u40;
import com.google.android.gms.internal.ads.ul;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f11444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f11445b;

    public zzb(kx1 kx1Var, kx1 kx1Var2) {
        this.f11444a = kx1Var;
        this.f11445b = kx1Var2;
    }

    public static zzb zza(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3, kx1 kx1Var4) {
        return new zzb(kx1Var, kx1Var4);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        Context contextA = ((o40) this.f11444a).a();
        ul ulVar = am.f12058a;
        return new zza(contextA, com.google.android.gms.ads.internal.client.zzba.zzb().a(), ((u40) this.f11445b).a());
    }
}
