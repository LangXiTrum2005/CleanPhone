package com.smartdigimkt.e5;

import android.text.TextUtils;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;
import com.smartdigimkt.w6.l;
import com.smartdigimkt.y4.d;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static void a(g gVar, d dVar, int i2) {
        if (gVar == null || dVar == null) {
            return;
        }
        gVar.K0(dVar.m());
        if (i2 != 66) {
            gVar.z0(dVar.k());
        }
        gVar.b(dVar.c());
        gVar.Z(dVar.j());
        gVar.E0(dVar.i());
        gVar.u(dVar.e());
        gVar.n(dVar.d());
        gVar.C(dVar.b());
        gVar.B(dVar.a());
        gVar.g(dVar.f());
        gVar.C0(dVar.l());
    }

    public static void a(com.smartdigimkt.v6.a aVar, l lVar, d dVar) {
        if (aVar == null || lVar == null) {
            return;
        }
        g gVarI = lVar.i();
        a(gVarI, dVar, aVar.j);
        if (aVar.j == 67 && dVar != null) {
            if (dVar.n()) {
                lVar.m(1);
            } else {
                lVar.m(2);
            }
        }
        gVarI.M(aVar.f39164b);
        aVar.t = gVarI;
        if (!lVar.r0() && aVar.f39164b == 1) {
            g gVar = aVar.t;
            gVar.j(gVar.V0());
            aVar.t.w(1);
        }
        boolean z2 = !(lVar instanceof com.smartdigimkt.w6.d) || TextUtils.isEmpty(((com.smartdigimkt.w6.d) lVar).W0());
        if (!i.g(lVar, aVar)) {
            aVar.t.A0(2);
        }
        if (z2 && a(lVar, aVar.t)) {
            aVar.t.I0(0);
            aVar.t.k(0);
            aVar.t.w0(2);
            aVar.t.A0(2);
            aVar.t.i(1);
            aVar.t.y0(-2);
            aVar.t.e(false);
            aVar.t.f(false);
            aVar.t.d(false);
            aVar.t.p(2);
            if (lVar.v0()) {
                aVar.t.H(1);
            }
            aVar.t.w(0L);
            aVar.t.v(0L);
            aVar.t.J(1);
            aVar.t.T(1);
        }
        if (aVar.f39164b != 3 || i.g(lVar, aVar) || lVar.v0()) {
            aVar.t.v(0);
        }
        if (TextUtils.isEmpty(lVar.k())) {
            aVar.t.q0(1);
        }
        if (lVar.s0()) {
            com.smartdigimkt.k3.b.a().updateOfferInfoWithDataInfo(lVar);
        }
        if (lVar.v0()) {
            aVar.t.v(0L);
        }
        if (aVar.t.A1() > 0) {
            aVar.t.F0(2);
        }
        if (aVar.t.F() == 2) {
            aVar.t.y0(0);
            aVar.t.k(-1);
            if (TextUtils.isEmpty(lVar.g0())) {
                int i2 = aVar.f39164b;
                if (i2 == 1 || i2 == 3) {
                    lVar.P(com.smartdigimkt.m6.b.p().k().getString(h.a(com.smartdigimkt.m6.b.p().k(), "myoffer_sub_close_default_title", k.f38992h)));
                }
            }
        }
    }

    private static boolean a(f fVar, g gVar) {
        if (fVar == null || gVar == null || !TextUtils.isEmpty(fVar.k()) || !TextUtils.isEmpty(fVar.q())) {
            return false;
        }
        int iJ = fVar.j();
        if (iJ == 1 || iJ == 4) {
            return TextUtils.isEmpty(fVar.G());
        }
        if (iJ == 6) {
            return !a(fVar.o0());
        }
        if (iJ != 7) {
            return true;
        }
        return TextUtils.isEmpty(fVar.t());
    }

    private static boolean a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(com.smartdigimkt.n8.c.O())) {
            return false;
        }
        com.smartdigimkt.v6.d dVarN = com.smartdigimkt.n8.c.N();
        return (dVarN.c() == 1) && (dVarN.d() == 1);
    }
}
