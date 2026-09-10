package com.chartboost.sdk.impl;

import android.os.Build;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14022c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14023e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14024h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14025i;
    public final String j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f14026l;
    public final JSONObject m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f14027n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f14028p;
    public final p3 q;
    public final ce r;
    public final vf s;
    public final y8 t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final oe f14029u;
    public final og v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x4 f14030w;
    public final x5 x;
    public final mb y;

    public gf(String str, String str2, y8 y8Var, oe oeVar, p3 p3Var, vf vfVar, og ogVar, ce ceVar, x4 x4Var, x5 x5Var, mb mbVar) {
        String str3;
        this.t = y8Var;
        this.f14029u = oeVar;
        this.q = p3Var;
        this.s = vfVar;
        this.v = ogVar;
        this.r = ceVar;
        this.f14024h = str;
        this.f14025i = str2;
        this.f14030w = x4Var;
        this.x = x5Var;
        this.y = mbVar;
        String str4 = Build.PRODUCT;
        if ("sdk".equals(str4) || "google_sdk".equals(str4) || ((str3 = Build.MANUFACTURER) != null && str3.contains("Genymotion"))) {
            this.f14020a = "Android Simulator";
        } else {
            this.f14020a = Build.MODEL;
        }
        String str5 = Build.MANUFACTURER;
        this.k = str5 == null ? "unknown" : str5;
        StringBuilder sbX = android.support.v4.media.a.x(str5, " ");
        sbX.append(Build.MODEL);
        this.j = sbX.toString();
        this.f14026l = x5Var.b();
        this.f14021b = "Android " + Build.VERSION.RELEASE;
        this.f14022c = Locale.getDefault().getCountry();
        this.d = Locale.getDefault().getLanguage();
        this.g = "9.10.2";
        this.f14023e = x5Var.i();
        this.f = x5Var.g();
        this.f14027n = b(p3Var);
        this.m = a(p3Var);
        this.o = g3.a();
        this.f14028p = oeVar.a();
    }

    public final JSONObject a(p3 p3Var) {
        return p3Var != null ? a(p3Var, new r3()) : new JSONObject();
    }

    public final String b(p3 p3Var) {
        return p3Var != null ? p3Var.d() : "";
    }

    public y8 c() {
        return this.t;
    }

    public mb d() {
        return this.y;
    }

    public Integer e() {
        return Integer.valueOf(this.x.f());
    }

    public ce f() {
        return this.r;
    }

    public oe g() {
        return this.f14029u;
    }

    public vf h() {
        return this.s;
    }

    public int i() {
        vf vfVar = this.s;
        if (vfVar != null) {
            return vfVar.f();
        }
        return -1;
    }

    public og j() {
        return this.v;
    }

    public x4 a() {
        return this.f14030w;
    }

    public x5 b() {
        return this.x;
    }

    public JSONObject a(p3 p3Var, r3 r3Var) {
        if (r3Var != null) {
            return r3Var.a(p3Var);
        }
        return new JSONObject();
    }
}
