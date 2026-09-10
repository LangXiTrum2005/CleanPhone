package com.thinkup.core.common.on;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class omo {
    public static final int m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f42245n = 3;
    public static final int o = 1;
    public int o0 = 1;
    public int oo = 1;
    public int om = 1;
    public int on = 1;
    public int m0 = 1;

    private omo() {
    }

    public static omo o() {
        omo omoVar = new omo();
        omoVar.o0 = 3;
        omoVar.oo = 3;
        omoVar.om = 3;
        omoVar.on = 3;
        omoVar.m0 = 1;
        return omoVar;
    }

    public final String toString() {
        return super.toString();
    }

    public static omo o(String str) {
        omo omoVar = new omo();
        try {
            JSONObject jSONObject = new JSONObject(str);
            omoVar.o0 = jSONObject.optInt("b_e", 1);
            omoVar.oo = jSONObject.optInt("r_s", 1);
            omoVar.om = jSONObject.optInt("r_f", 1);
            omoVar.on = jSONObject.optInt("g_ad", 1);
            omoVar.m0 = jSONObject.optInt("ip_af", 1);
        } catch (Throwable unused) {
        }
        return omoVar;
    }
}
