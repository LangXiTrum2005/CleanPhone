package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.cb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0284cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Se f28374a;

    public C0284cb(Se response) {
        kotlin.jvm.internal.n.f(response, "response");
        this.f28374a = response;
    }

    private final C0497o9 b(C0497o9 c0497o9, Map<String, C0497o9> map) {
        String strM;
        if (!kotlin.jvm.internal.n.a(c0497o9.l(), Boolean.TRUE) || (strM = c0497o9.m()) == null || strM.length() == 0 || kotlin.jvm.internal.n.a(c0497o9.m(), c0497o9.j())) {
            return null;
        }
        return map.get(c0497o9.m());
    }

    public final C0266bb a() {
        P3.a.c cVarF;
        P3.a.g gVarH;
        P3.a aVarE = this.f28374a.d().e();
        return new C0266bb((aVarE == null || (gVarH = aVarE.h()) == null) ? null : a(gVarH, this.f28374a.e().h()), (aVarE == null || (cVarF = aVarE.f()) == null) ? null : a(cVarF, this.f28374a.e().f()), null, a(this.f28374a.f()));
    }

    private final C0387i6 a(P3.a.g gVar, Map<String, ? extends List<String>> map) {
        P3.c cVarG = this.f28374a.d().g();
        P3.c.a aVarK = cVarG != null ? cVarG.k() : null;
        if (map == null) {
            map = xj.w.f53867a;
        }
        Map<String, ? extends List<String>> map2 = map;
        Integer numA = gVar.A();
        int iIntValue = numA != null ? numA.intValue() : 2;
        Integer numS = gVar.s();
        boolean z10 = true;
        if (numS != null && numS.intValue() != 1) {
            z10 = false;
        }
        boolean z11 = z10;
        Long lV = gVar.v();
        long jLongValue = lV != null ? lV.longValue() : Xa.C;
        C0505p c0505pA = a(aVarK, aVarK != null ? aVarK.A() : null);
        Integer numR = gVar.r();
        int iIntValue2 = numR != null ? numR.intValue() : 60;
        Integer numX = gVar.x();
        return new C0387i6(map2, iIntValue, z11, jLongValue, xj.v.f53866a, c0505pA, iIntValue2, Integer.valueOf(numX != null ? numX.intValue() : -1));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    private final C0387i6 a(P3.a.c cVar, Map<String, ? extends List<String>> map) {
        boolean z10;
        P3.c cVarG = this.f28374a.d().g();
        P3.c.a aVarK = cVarG != null ? cVarG.k() : null;
        if (map == null) {
            map = xj.w.f53867a;
        }
        Map<String, ? extends List<String>> map2 = map;
        Integer numA = cVar.A();
        int iIntValue = numA != null ? numA.intValue() : 2;
        Integer numS = cVar.s();
        if (numS != null) {
            z10 = numS.intValue() == 1;
        }
        boolean z11 = z10;
        Long lV = cVar.v();
        long jLongValue = lV != null ? lV.longValue() : Xa.C;
        C0505p c0505pA = a(aVarK, aVarK != null ? aVarK.y() : null);
        Integer numR = cVar.r();
        int iIntValue2 = numR != null ? numR.intValue() : 60;
        Integer numY = cVar.y();
        return new C0387i6(map2, iIntValue, z11, jLongValue, xj.v.f53866a, c0505pA, iIntValue2, Integer.valueOf(numY != null ? numY.intValue() : -1));
    }

    private final C0505p a(P3.c.a aVar, P3.c.a.C0045a c0045a) {
        String strO;
        String strS;
        String strX;
        Boolean boolL;
        Boolean boolB;
        Integer numW;
        Boolean boolV;
        Boolean boolU;
        Integer numP;
        Long lQ;
        Integer numR;
        if (aVar == null || (strO = aVar.o()) == null) {
            strO = "";
        }
        if (aVar == null || (strS = aVar.s()) == null) {
            strS = "";
        }
        if (aVar == null || (strX = aVar.x()) == null) {
            strX = "";
        }
        int iIntValue = 2;
        int iIntValue2 = (aVar == null || (numR = aVar.r()) == null) ? 2 : numR.intValue();
        long jLongValue = (aVar == null || (lQ = aVar.q()) == null) ? Xa.f27908s : lQ.longValue();
        int iIntValue3 = (aVar == null || (numP = aVar.p()) == null) ? 15 : numP.intValue();
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = (aVar == null || (boolU = aVar.u()) == null) ? false : boolU.booleanValue();
        if (aVar != null && (boolV = aVar.v()) != null) {
            zBooleanValue = boolV.booleanValue();
        }
        if (aVar != null && (numW = aVar.w()) != null) {
            iIntValue = numW.intValue();
        }
        int i10 = iIntValue;
        boolean zBooleanValue3 = true;
        boolean zBooleanValue4 = (aVar == null || (boolB = aVar.B()) == null) ? true : boolB.booleanValue();
        if (c0045a != null && (boolL = c0045a.l()) != null) {
            zBooleanValue3 = boolL.booleanValue();
        }
        return new C0505p(strO, strS, strX, iIntValue2, jLongValue, iIntValue3, zBooleanValue2, zBooleanValue, i10, zBooleanValue4, zBooleanValue3);
    }

    private final Map<String, Bd> a(Map<String, C0497o9> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C0497o9> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), a(entry.getValue(), map));
        }
        return linkedHashMap;
    }

    private final Bd a(C0497o9 c0497o9, Map<String, C0497o9> map) {
        C0497o9.a aVarI;
        C0497o9.a aVarI2;
        C0497o9.a aVarI3;
        C0497o9.a aVarI4;
        C0497o9 c0497o9B = b(c0497o9, map);
        JSONObject jSONObjectG = null;
        JSONObject jSONObjectA = a(c0497o9.k(), c0497o9B != null ? c0497o9B.k() : null);
        C0497o9.a aVarI5 = c0497o9.i();
        JSONObject jSONObjectA2 = a(aVarI5 != null ? aVarI5.h() : null, (c0497o9B == null || (aVarI4 = c0497o9B.i()) == null) ? null : aVarI4.h(), jSONObjectA);
        C0497o9.a aVarI6 = c0497o9.i();
        JSONObject jSONObjectA3 = a(aVarI6 != null ? aVarI6.f() : null, (c0497o9B == null || (aVarI3 = c0497o9B.i()) == null) ? null : aVarI3.f(), jSONObjectA);
        C0497o9.a aVarI7 = c0497o9.i();
        JSONObject jSONObjectA4 = a(aVarI7 != null ? aVarI7.e() : null, (c0497o9B == null || (aVarI2 = c0497o9B.i()) == null) ? null : aVarI2.e(), jSONObjectA);
        C0497o9.a aVarI8 = c0497o9.i();
        JSONObject jSONObjectG2 = aVarI8 != null ? aVarI8.g() : null;
        if (c0497o9B != null && (aVarI = c0497o9B.i()) != null) {
            jSONObjectG = aVarI.g();
        }
        return new Bd(jSONObjectA2, jSONObjectA3, jSONObjectA4, a(jSONObjectG2, jSONObjectG, jSONObjectA));
    }

    private final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        IronSourceUtils.b(jSONObject3, jSONObject);
        IronSourceUtils.b(jSONObject3, jSONObject2);
        return jSONObject3;
    }

    private final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObject4 = new JSONObject();
        IronSourceUtils.b(jSONObject4, jSONObject);
        IronSourceUtils.b(jSONObject4, jSONObject2);
        IronSourceUtils.b(jSONObject4, jSONObject3);
        return jSONObject4;
    }
}
