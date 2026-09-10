package com.smartdigimkt.a7;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f33777h = "business_type";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f33778i = 1000;
    public static final int j = 1001;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33781c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33782e;
    public long f;
    public String g;

    public static String a(int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("business_type", i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    public String a() {
        return this.d + "--extra: " + this.g + "--requestType: " + this.f33780b + "--content:" + this.f33782e;
    }
}
