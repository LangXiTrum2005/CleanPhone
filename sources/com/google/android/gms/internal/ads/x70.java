package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzab;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x70 implements na0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b30 f21773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yh0 f21774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final du0 f21775c;

    public x70(b30 b30Var, yh0 yh0Var, du0 du0Var) {
        this.f21773a = b30Var;
        this.f21774b = yh0Var;
        this.f21775c = du0Var;
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void k() {
        b30 b30Var;
        if (!((Boolean) zzba.zzc().a(am.Ee)).booleanValue() || (b30Var = this.f21773a) == null) {
            return;
        }
        String str = true != zzab.zza(b30Var.zzE()) ? "0" : "1";
        lj1 lj1VarA = this.f21774b.a();
        lj1VarA.l("action", "hcp");
        lj1VarA.l("hcp", str);
        lj1VarA.k(this.f21775c);
        lj1VarA.m();
    }
}
