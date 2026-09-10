package com.smartdigimkt.d3;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34424b;

    public a(String str, String str2) {
        this.f34423a = str;
        this.f34424b = str2;
    }

    public String a() {
        return this.f34423a;
    }

    public String b() {
        return this.f34424b;
    }

    public void a(String str) {
        this.f34423a = str;
    }

    public void b(String str) {
        this.f34424b = str;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new a(jSONObject.optString(com.smartdigimkt.f3.b.f35043u), jSONObject.optString("placementId"));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
