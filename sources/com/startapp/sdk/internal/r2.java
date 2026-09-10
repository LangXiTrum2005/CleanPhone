package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class r2 extends q2 {
    public r2(x2 x2Var) {
        super(x2Var);
    }

    @Override // com.startapp.sdk.internal.q2
    public final boolean a() {
        jh jhVar = ih.f41097a;
        AdPreferences.Placement placement = this.f41383a.f41659l;
        return (jhVar.f41155e || jhVar.f41154c) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    @Override // com.startapp.sdk.internal.q2
    public final long b() {
        ?? r0 = this.f41383a.o;
        if (r0 == 0) {
            return -1L;
        }
        Long adCacheTtl = r0.getAdCacheTtl();
        Long lastLoadTime = r0.getLastLoadTime();
        if (adCacheTtl == null || lastLoadTime == null) {
            return -1L;
        }
        long jLongValue = adCacheTtl.longValue() - (System.currentTimeMillis() - lastLoadTime.longValue());
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return 0L;
    }
}
