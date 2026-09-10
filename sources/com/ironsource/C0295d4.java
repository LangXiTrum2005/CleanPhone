package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.d4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0295d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f28415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f28417d;

    public C0295d4(String str) {
        this.f28414a = str;
    }

    public String a() {
        return this.f28417d;
    }

    public String b() {
        return this.f28414a;
    }

    public JSONObject c() {
        return this.f28415b;
    }

    public String d() {
        return this.f28416c;
    }

    public C0295d4(String str, JSONObject jSONObject) {
        this.f28414a = str;
        this.f28415b = jSONObject;
    }

    public C0295d4(String str, String str2, String str3) {
        this.f28414a = str;
        this.f28416c = str2;
        this.f28417d = str3;
    }

    public C0295d4(String str, JSONObject jSONObject, String str2, String str3) {
        this.f28414a = str;
        this.f28415b = jSONObject;
        this.f28416c = str2;
        this.f28417d = str3;
    }
}
