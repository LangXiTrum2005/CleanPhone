package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.ci0;
import com.google.android.gms.internal.ads.gx1;
import com.google.android.gms.internal.ads.ic1;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.kx1;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.o40;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzm implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kx1 f11500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kx1 f11501b;

    public zzm(kx1 kx1Var, kx1 kx1Var2) {
        this.f11500a = kx1Var;
        this.f11501b = kx1Var2;
    }

    public static zzm zza(kx1 kx1Var, kx1 kx1Var2, kx1 kx1Var3) {
        return new zzm(kx1Var, kx1Var2);
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        Context contextA = ((o40) this.f11500a).a();
        ci0 ci0Var = (ci0) this.f11501b.zzb();
        k00 k00Var = l00.f16608a;
        ic1.h(k00Var);
        return new zzj(contextA, ci0Var, k00Var);
    }
}
