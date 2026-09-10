package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yn0 extends wn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a50 f22319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v90 f22320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final so0 f22321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bc0 f22322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final md0 f22323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jb0 f22324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f22325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ub0 f22326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bo0 f22327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sm0 f22328j;

    public yn0(a50 a50Var, v90 v90Var, so0 so0Var, bc0 bc0Var, md0 md0Var, jb0 jb0Var, ViewGroup viewGroup, ub0 ub0Var, bo0 bo0Var, sm0 sm0Var) {
        this.f22319a = a50Var;
        this.f22320b = v90Var;
        this.f22321c = so0Var;
        this.f22322d = bc0Var;
        this.f22323e = md0Var;
        this.f22324f = jb0Var;
        this.f22325g = viewGroup;
        this.f22326h = ub0Var;
        this.f22327i = bo0Var;
        this.f22328j = sm0Var;
    }

    @Override // com.google.android.gms.internal.ads.wn0
    public final uv0 c(ou0 ou0Var, Bundle bundle, du0 du0Var, ju0 ju0Var) {
        v90 v90Var = this.f22320b;
        v90Var.f21136b = ou0Var;
        v90Var.f21137c = bundle;
        v90Var.f21139e = new vu0(ju0Var, du0Var, this.f22327i, 14);
        if (((Boolean) zzba.zzc().a(am.E4)).booleanValue()) {
            v90Var.f21140f = this.f22328j;
        }
        a50 a50Var = this.f22319a.f11854b;
        w90 w90Var = new w90(v90Var);
        md0 md0Var = new md0(15, this.f22324f, this.f22326h);
        vf vfVar = new vf(this.f22325g, 15);
        bc0 bc0Var = this.f22322d;
        ic1.j(bc0Var, bc0.class);
        so0 so0Var = this.f22321c;
        ic1.j(so0Var, so0.class);
        so0 so0Var2 = new so0(29);
        md0 md0Var2 = this.f22323e;
        ic1.j(md0Var2, md0.class);
        v80 v80Var = (v80) new f50(a50Var, vfVar, md0Var2, new tc0(9), bc0Var, w90Var, so0Var2, so0Var, md0Var, null, null).f14244t.zzb();
        return v80Var.c(v80Var.b());
    }
}
