package com.p004ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class fv extends fq {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private el f2036;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private fk f2037;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private fk f2038;

    public fv(fk fkVar, fk fkVar2, el elVar) {
        this.f2037 = fkVar;
        this.f2038 = fkVar2;
        this.f2036 = elVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fv.class == obj.getClass()) {
            fv fvVar = (fv) obj;
            fk fkVar = this.f2037;
            if (fkVar == null ? fvVar.f2037 != null : !fkVar.equals(fvVar.f2037)) {
                return false;
            }
            fk fkVar2 = this.f2038;
            if (fkVar2 == null ? fvVar.f2038 != null : !fkVar2.equals(fvVar.f2038)) {
                return false;
            }
            el elVar = this.f2036;
            el elVar2 = fvVar.f2036;
            if (elVar != null) {
                return elVar.equals(elVar2);
            }
            if (elVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        fk fkVar = this.f2037;
        int iHashCode = (fkVar != null ? fkVar.hashCode() : 0) * 31;
        fk fkVar2 = this.f2038;
        int iHashCode2 = (iHashCode + (fkVar2 != null ? fkVar2.hashCode() : 0)) * 31;
        el elVar = this.f2036;
        return iHashCode2 + (elVar != null ? elVar.hashCode() : 0);
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.fq
    /* JADX INFO: renamed from: ｋ */
    public final du mo2122(dr drVar, cp cpVar) {
        try {
            fk fkVar = this.f2037;
            if (fkVar != null) {
                return fkVar.mo2122(new dr(drVar), cpVar);
            }
        } catch (Throwable th) {
            if (this.f2038 != null) {
                HashMap map = new HashMap();
                el elVar = this.f2036;
                if (elVar != null) {
                    map.put(dw.m2051(elVar.m2103()), th);
                }
                return this.f2038.mo2122(new dr(map, drVar), cpVar);
            }
        }
        return new du(null);
    }
}
