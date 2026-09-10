package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qi0 implements mi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kp0 f19091b;

    public qi0(long j10, Context context, so0 so0Var, a50 a50Var, String str) {
        this.f19090a = j10;
        a50 a50Var2 = a50Var.f11854b;
        zzr zzrVar = new zzr();
        str.getClass();
        kp0 kp0Var = (kp0) new j50(a50Var2, context, str, zzrVar).f15984a.zzb();
        this.f19091b = kp0Var;
        kp0Var.zzdS(new pi0(this, so0Var));
    }

    @Override // com.google.android.gms.internal.ads.mi0
    public final void a(zzm zzmVar) {
        this.f19091b.zze(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.mi0
    public final void zzb() {
        this.f19091b.zzR(new s9.b(null));
    }

    @Override // com.google.android.gms.internal.ads.mi0
    public final void zzc() {
        this.f19091b.zzc();
    }
}
