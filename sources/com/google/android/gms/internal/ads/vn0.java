package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vn0 extends wn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21213a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a50 f21214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v90 f21215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bc0 f21216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final bo0 f21217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sm0 f21218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f21219g;

    public vn0(a50 a50Var, v90 v90Var, bc0 bc0Var, ku0 ku0Var, bo0 bo0Var, sm0 sm0Var) {
        this.f21214b = a50Var;
        this.f21215c = v90Var;
        this.f21216d = bc0Var;
        this.f21219g = ku0Var;
        this.f21217e = bo0Var;
        this.f21218f = sm0Var;
    }

    @Override // com.google.android.gms.internal.ads.wn0
    public final uv0 c(ou0 ou0Var, Bundle bundle, du0 du0Var, ju0 ju0Var) {
        ku0 ku0Var;
        switch (this.f21213a) {
            case 0:
                v90 v90Var = this.f21215c;
                v90Var.f21136b = ou0Var;
                v90Var.f21137c = bundle;
                v90Var.f21139e = new vu0(ju0Var, du0Var, this.f21217e, 14);
                if (((Boolean) zzba.zzc().a(am.E4)).booleanValue()) {
                    v90Var.f21140f = this.f21218f;
                }
                a50 a50Var = this.f21214b.f11854b;
                w90 w90Var = new w90(v90Var);
                md0 md0Var = (md0) this.f21219g;
                vf vfVar = new vf(null, 15);
                bc0 bc0Var = this.f21216d;
                ic1.j(bc0Var, bc0.class);
                ic1.j(md0Var, md0.class);
                v80 v80Var = (v80) new y40(a50Var, vfVar, md0Var, new tc0(9), bc0Var, w90Var, new so0(29), null, null).f22116p.zzb();
                return v80Var.c(v80Var.b());
            case 1:
                v90 v90Var2 = this.f21215c;
                v90Var2.f21136b = ou0Var;
                v90Var2.f21137c = bundle;
                v90Var2.f21139e = new vu0(ju0Var, du0Var, this.f21217e, 14);
                if (((Boolean) zzba.zzc().a(am.E4)).booleanValue()) {
                    v90Var2.f21140f = this.f21218f;
                }
                a50 a50Var2 = this.f21214b.f11854b;
                w90 w90Var2 = new w90(v90Var2);
                so0 so0Var = (so0) this.f21219g;
                bc0 bc0Var2 = this.f21216d;
                ic1.j(bc0Var2, bc0.class);
                ic1.j(so0Var, so0.class);
                v80 v80Var2 = (v80) new i50(a50Var2, new tc0(9), bc0Var2, w90Var2, new so0(29), so0Var, null, null).f15589o.zzb();
                return v80Var2.c(v80Var2.b());
            default:
                v90 v90Var3 = this.f21215c;
                v90Var3.f21136b = ou0Var;
                v90Var3.f21137c = bundle;
                v90Var3.f21139e = new vu0(ju0Var, du0Var, this.f21217e, 14);
                if (((Boolean) zzba.zzc().a(am.D4)).booleanValue() && (ku0Var = (ku0) this.f21219g) != null) {
                    v90Var3.f21138d = ku0Var;
                }
                if (((Boolean) zzba.zzc().a(am.E4)).booleanValue()) {
                    v90Var3.f21140f = this.f21218f;
                }
                a50 a50Var3 = this.f21214b.f11854b;
                w90 w90Var3 = new w90(v90Var3);
                bc0 bc0Var3 = this.f21216d;
                ic1.j(bc0Var3, bc0.class);
                v80 v80VarZza = new m50(a50Var3, new tc0(9), bc0Var3, w90Var3, new so0(29), null, null).zza();
                return v80VarZza.c(v80VarZza.b());
        }
    }

    public vn0(a50 a50Var, v90 v90Var, so0 so0Var, bc0 bc0Var, bo0 bo0Var, sm0 sm0Var) {
        this.f21214b = a50Var;
        this.f21215c = v90Var;
        this.f21219g = so0Var;
        this.f21216d = bc0Var;
        this.f21217e = bo0Var;
        this.f21218f = sm0Var;
    }

    public vn0(a50 a50Var, md0 md0Var, v90 v90Var, bc0 bc0Var, bo0 bo0Var, sm0 sm0Var) {
        this.f21214b = a50Var;
        this.f21219g = md0Var;
        this.f21215c = v90Var;
        this.f21216d = bc0Var;
        this.f21217e = bo0Var;
        this.f21218f = sm0Var;
    }
}
