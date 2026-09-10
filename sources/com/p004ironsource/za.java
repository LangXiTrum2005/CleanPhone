package com.p004ironsource;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class za {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static za f27875h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27878c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27879e;
    private String f;
    private final vf g;

    private za(Context context) {
        vf vfVarF = on.U().f();
        this.g = vfVarF;
        this.f27876a = vfVarF.g();
        this.f27877b = vfVarF.e();
        this.f27878c = vfVarF.m();
        this.d = vfVarF.p();
        this.f27879e = vfVarF.l();
        this.f = vfVarF.j(context);
    }

    public static za b(Context context) {
        if (f27875h == null) {
            f27875h = new za(context);
        }
        return f27875h;
    }

    public static void g() {
        f27875h = null;
    }

    public float a(Context context) {
        return this.g.m(context);
    }

    public String c() {
        return this.f27877b;
    }

    public String d() {
        return this.f27876a;
    }

    public String e() {
        return this.f27878c;
    }

    public String f() {
        return this.d;
    }

    public int a() {
        return this.f27879e;
    }

    public String b() {
        return this.f;
    }
}
