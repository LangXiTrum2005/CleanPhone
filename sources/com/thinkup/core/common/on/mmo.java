package com.thinkup.core.common.on;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mmo {
    public static final String m0 = "business_type";
    public static final int mm = 1001;
    public static final int mo = 1000;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f42200n;
    public String o;
    public String o0;
    public long om;
    public String on;
    public String oo;

    public static String o(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("business_type", i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    public final String o() {
        return this.o0 + "--extra: " + this.on + "--requestType: " + this.m + "--content:" + this.oo;
    }
}
