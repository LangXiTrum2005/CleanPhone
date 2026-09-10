package com.p004ironsource;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f25332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25333c;
    private String d;

    public i9(String str) {
        this.f25331a = str;
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.f25331a;
    }

    public JSONObject c() {
        return this.f25332b;
    }

    public String d() {
        return this.f25333c;
    }

    public i9(String str, String str2, String str3) {
        this.f25331a = str;
        this.f25333c = str2;
        this.d = str3;
    }

    public i9(String str, JSONObject jSONObject) {
        this.f25331a = str;
        this.f25332b = jSONObject;
    }

    public i9(String str, JSONObject jSONObject, String str2, String str3) {
        this.f25331a = str;
        this.f25332b = jSONObject;
        this.f25333c = str2;
        this.d = str3;
    }
}
