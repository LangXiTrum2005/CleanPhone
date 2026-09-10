package com.p004ironsource.adqualitysdk.sdk.i;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ek extends ef {
    public ek(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract boolean mo2099(int i2);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract boolean mo2100(Object obj, Object obj2);

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ee
    /* JADX INFO: renamed from: ｋ */
    public final du mo2050(dr drVar, cp cpVar) {
        Object objM2043 = m2091().m2086(drVar, cpVar).m2043();
        Object objM2044 = m2090().m2086(drVar, cpVar).m2043();
        try {
            return new du(Boolean.valueOf(mo2099(new BigDecimal(objM2043.toString()).compareTo(new BigDecimal(objM2044.toString())))));
        } catch (Exception unused) {
            return ((objM2043 instanceof String) && (objM2044 instanceof String)) ? new du(Boolean.valueOf(mo2101((String) objM2043, (String) objM2044))) : new du(Boolean.valueOf(mo2100(objM2043, objM2044)));
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract boolean mo2101(String str, String str2);
}
