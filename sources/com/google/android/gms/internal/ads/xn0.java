package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xn0 extends wn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a50 f21940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v90 f21941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bc0 f21942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bo0 f21943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sm0 f21944e;

    public xn0(a50 a50Var, v90 v90Var, bc0 bc0Var, bo0 bo0Var, sm0 sm0Var) {
        this.f21940a = a50Var;
        this.f21941b = v90Var;
        this.f21942c = bc0Var;
        this.f21943d = bo0Var;
        this.f21944e = sm0Var;
    }

    @Override // com.google.android.gms.internal.ads.wn0
    public final uv0 c(ou0 ou0Var, Bundle bundle, du0 du0Var, ju0 ju0Var) {
        v90 v90Var = this.f21941b;
        v90Var.f21136b = ou0Var;
        v90Var.f21137c = bundle;
        v90Var.f21139e = new vu0(ju0Var, du0Var, this.f21943d, 14);
        if (((Boolean) zzba.zzc().a(am.E4)).booleanValue()) {
            v90Var.f21140f = this.f21944e;
        }
        a50 a50Var = this.f21940a.f11854b;
        w90 w90Var = new w90(v90Var);
        bc0 bc0Var = this.f21942c;
        ic1.j(bc0Var, bc0.class);
        v80 v80VarZza = new d50(a50Var, new tc0(9), bc0Var, w90Var, new so0(29), null, null).zza();
        return v80VarZza.c(v80VarZza.b());
    }
}
