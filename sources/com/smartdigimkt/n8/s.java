package com.smartdigimkt.n8;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.smartdigimkt.sdk.api.SDMSDK;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class s {
    public static com.smartdigimkt.a7.a a(com.smartdigimkt.s8.b bVar) {
        com.smartdigimkt.a7.a aVar = new com.smartdigimkt.a7.a();
        aVar.a(bVar.t());
        aVar.u(bVar.n());
        aVar.v(bVar.o());
        aVar.o(bVar.k());
        aVar.n(0);
        aVar.r(2);
        aVar.m(0);
        com.smartdigimkt.t8.b bVarP = bVar.p();
        if (bVarP != null) {
            aVar.h(bVarP.g());
            aVar.i(bVarP.f());
            aVar.f(bVarP.e());
        }
        if (bVar.t()) {
            a(aVar, bVar.e());
        } else {
            a(aVar, bVar.m());
        }
        aVar.t(0);
        return aVar;
    }

    public static void a(com.smartdigimkt.a7.a aVar, com.smartdigimkt.v6.a aVar2) {
        if (aVar == null || aVar2 == null) {
            return;
        }
        if (aVar2.f39164b == 1) {
            aVar.x("1");
        } else {
            aVar.x("0");
        }
        aVar.m(String.valueOf(aVar2.f39164b));
    }

    public static void a(com.smartdigimkt.a7.a aVar, com.smartdigimkt.l8.e eVar) {
        if (aVar == null || eVar == null) {
            return;
        }
        if (eVar.v() == Integer.parseInt("1")) {
            aVar.x("1");
        } else {
            aVar.x("0");
        }
        aVar.a(eVar.l());
        aVar.m(String.valueOf(eVar.v()));
        aVar.o(eVar.r());
        aVar.p(eVar.s());
        aVar.h(eVar.g());
        aVar.l(eVar.f());
        JSONObject jSONObjectG = eVar.G();
        if (jSONObjectG != null) {
            aVar.c(jSONObjectG);
        }
    }

    public static void a(com.smartdigimkt.a7.a aVar, com.smartdigimkt.s8.b bVar) {
        com.smartdigimkt.l8.f fVarQ;
        com.smartdigimkt.y6.b bVarD;
        String str;
        if (aVar == null || bVar == null || bVar.m() == null || (fVarQ = bVar.q()) == null || (bVarD = fVarQ.D()) == null) {
            return;
        }
        if (fVarQ.D() != null) {
            aVar.d(fVarQ.Q());
            aVar.e(bVarD.f40231b);
        }
        try {
            aVar.t(SDMSDK.getInstance().getSDKVersion());
        } catch (Throwable unused) {
        }
        aVar.n(fVarQ.J());
        aVar.b(fVarQ.j());
        aVar.a(fVarQ.k());
        aVar.A(fVarQ.t0());
        aVar.y(fVarQ.h());
        aVar.B(fVarQ.Q0());
        aVar.x(fVarQ.I());
        aVar.y(fVarQ.T());
        aVar.s(fVarQ.L());
        if (fVarQ.b()) {
            aVar.i(fVarQ.V());
            aVar.g(fVarQ.R0());
            aVar.f(fVarQ.I0());
        } else {
            aVar.i(0.0d);
            aVar.g(0.0d);
            aVar.f(0.0d);
        }
        if (fVarQ.m1()) {
            if (fVarQ.L0() != 2) {
                if (bVarD.q() == 3) {
                    str = "ecpm_api";
                } else {
                    str = bVarD.H;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "exact";
                }
                aVar.q(str);
                aVar.b(aVar.H() * fVarQ.V());
                aVar.c(fVarQ.I0());
            }
            aVar.a(aVar.H() * fVarQ.q());
        } else {
            aVar.b(fVarQ.e());
            aVar.c(fVarQ.I0());
            String strY = fVarQ.Y();
            if (TextUtils.isEmpty(strY)) {
                strY = "publisher_defined";
            }
            aVar.q(strY);
        }
        aVar.u(fVarQ.z());
        aVar.z(fVarQ.L0());
        try {
            Map<String, Object> mapM = fVarQ.M();
            JSONObject jSONObject = new JSONObject();
            if ("0".equals(aVar.I()) && (3 == fVarQ.k() || 7 == fVarQ.k())) {
                String strE = h.e(mapM, MBridgeConstans.PROPERTIES_LAYOUT_TYPE);
                if (TextUtils.isEmpty(strE) || strE.equals("0")) {
                    strE = "2";
                }
                jSONObject.put("tpl_type", strE);
            }
            aVar.d(jSONObject.toString());
            aVar.q(h.a(mapM, "render_type", 0));
            aVar.p(h.a(mapM, "template_type", 0));
        } catch (Throwable unused2) {
        }
        aVar.i(bVarD.v);
        aVar.e(fVarQ.v0());
        aVar.i(fVarQ.A());
        a(aVar, fVarQ);
        if (bVarD.q() > 0) {
            aVar.h(bVarD.r());
        }
        aVar.g(bVarD.o());
        aVar.k(bVarD.u());
        aVar.f(bVarD.e());
    }

    private static void a(com.smartdigimkt.a7.a aVar, com.smartdigimkt.l8.f fVar) {
        com.smartdigimkt.l8.c cVarW = fVar.W();
        if (cVarW == null) {
            return;
        }
        aVar.b(cVarW.e());
        aVar.c(cVarW.f());
        aVar.k(cVarW.c());
        aVar.j(cVarW.g());
        fVar.h();
    }

    public static void a(com.smartdigimkt.a7.a aVar, com.smartdigimkt.s8.b bVar, com.smartdigimkt.y4.c cVar) {
        com.smartdigimkt.t8.b bVarP;
        if (aVar == null || bVar == null || (bVarP = bVar.p()) == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        aVar.c(System.currentTimeMillis() - bVarP.g());
        aVar.b(jElapsedRealtime);
        aVar.e(System.currentTimeMillis() - bVarP.g());
        aVar.d(jElapsedRealtime);
        aVar.h(cVar.j());
    }
}
