package com.mbridge.msdk.setting;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f35560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35561g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35555a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35556b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35557c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35558d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35562h = 0;

    public static a a(String str) {
        Exception e10;
        a aVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar = new a();
            try {
                aVar.b(jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f33858h));
                aVar.c(jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().l));
                aVar.e(jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.utils.d.h().f33865p));
                aVar.f(jSONObject.optInt("type", 0));
                aVar.a(jSONObject.optInt("batch_size", 1));
                aVar.c(jSONObject.optInt(IronSourceConstants.EVENTS_DURATION, 0));
                aVar.b(jSONObject.optInt("disable", 0));
                aVar.d(jSONObject.optInt("e_t_l", 0));
                return aVar;
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
                return aVar;
            }
        } catch (Exception e12) {
            e10 = e12;
            aVar = null;
        }
    }

    public int b() {
        return this.f35556b;
    }

    public int c() {
        return this.f35557c;
    }

    public int d() {
        return this.f35558d;
    }

    public String e() {
        return this.f35559e;
    }

    public String f() {
        return this.f35560f;
    }

    public int g() {
        return this.f35561g;
    }

    public int h() {
        return this.f35562h;
    }

    public void b(int i10) {
        this.f35556b = i10;
    }

    public void c(int i10) {
        this.f35557c = i10;
    }

    public void d(int i10) {
        this.f35558d = i10;
    }

    public void e(int i10) {
        this.f35561g = i10;
    }

    public void f(int i10) {
        this.f35562h = i10;
    }

    public void b(String str) {
        this.f35559e = str;
    }

    public void c(String str) {
        this.f35560f = str;
    }

    public int a() {
        return this.f35555a;
    }

    public void a(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f35555a = i10;
    }
}
