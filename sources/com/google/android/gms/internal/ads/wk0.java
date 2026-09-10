package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wk0 implements xk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f21528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe1 f21529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb0 f21530c;

    public wk0(Map map, fe1 fe1Var, lb0 lb0Var) {
        this.f21528a = map;
        this.f21529b = fe1Var;
        this.f21530c = lb0Var;
    }

    @Override // com.google.android.gms.internal.ads.xk0
    public final ListenableFuture a(mx mxVar) {
        this.f21530c.q0(mxVar);
        sc1 sc1VarL = zw1.l(new ck0(3));
        for (String str : ((String) zzba.zzc().a(am.D9)).split(",")) {
            kx1 kx1Var = (kx1) this.f21528a.get(str.trim());
            if (kx1Var != null) {
                sc1VarL = zw1.u(sc1VarL, ck0.class, new ht(7, kx1Var, mxVar), this.f21529b);
            }
        }
        sc1VarL.addListener(new zd1(0, sc1VarL, new so0(this, 26)), l00.f16615h);
        return sc1VarL;
    }
}
