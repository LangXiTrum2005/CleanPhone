package com.mbridge.msdk.setting;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f35661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35662h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35655a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35656b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35657c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35658d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35659e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35663i = 0;

    public static d a(String str) {
        Exception e10;
        d dVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            dVar = new d();
            try {
                dVar.b(jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f33855f));
                dVar.c(jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f33861k));
                dVar.c(jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.utils.d.h().f33864o));
                dVar.d(jSONObject.optInt("type", 1));
                dVar.b(jSONObject.optInt("d_t", 30));
                dVar.a(jSONObject.optInt("d_a", 0));
                return dVar;
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
                return dVar;
            }
        } catch (Exception e12) {
            e10 = e12;
            dVar = null;
        }
    }

    public int b() {
        return this.f35658d;
    }

    public String c() {
        return this.f35660f;
    }

    public String d() {
        return this.f35661g;
    }

    public int e() {
        return this.f35662h;
    }

    public void b(int i10) {
        this.f35658d = i10;
    }

    public void c(String str) {
        this.f35661g = str;
    }

    public void d(int i10) {
        this.f35663i = i10;
    }

    public void b(String str) {
        this.f35660f = str;
    }

    public void c(int i10) {
        this.f35662h = i10;
    }

    public int a() {
        return this.f35657c;
    }

    public void a(int i10) {
        this.f35657c = i10;
    }
}
