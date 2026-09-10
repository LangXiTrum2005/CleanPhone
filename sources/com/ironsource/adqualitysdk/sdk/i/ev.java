package com.ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ev extends em {
    public ev(ef efVar, ef efVar2) {
        super(efVar, efVar2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        Object objM2124 = m2177().m2165(eeVar, clVar).m2124();
        Object objM2125 = m2178().m2165(eeVar, clVar).m2124();
        try {
            return new ea(Boolean.valueOf(mo2197(new BigDecimal(objM2124.toString()).compareTo(new BigDecimal(objM2125.toString())))));
        } catch (Exception unused) {
            return ((objM2124 instanceof String) && (objM2125 instanceof String)) ? new ea(Boolean.valueOf(mo2196((String) objM2124, (String) objM2125))) : new ea(Boolean.valueOf(mo2195(objM2124, objM2125)));
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public abstract boolean mo2195(Object obj, Object obj2);

    /* JADX INFO: renamed from: ﾇ */
    public abstract boolean mo2196(String str, String str2);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract boolean mo2197(int i10);
}
