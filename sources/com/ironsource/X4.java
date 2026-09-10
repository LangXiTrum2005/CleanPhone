package com.ironsource;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class X4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static X4 f27870h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f27874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f27876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0674y7 f27877g;

    private X4(Context context) {
        InterfaceC0674y7 interfaceC0674y7A = Kb.Y().a();
        this.f27877g = interfaceC0674y7A;
        this.f27871a = interfaceC0674y7A.q();
        this.f27872b = interfaceC0674y7A.l();
        this.f27873c = interfaceC0674y7A.f();
        this.f27874d = interfaceC0674y7A.i();
        this.f27875e = interfaceC0674y7A.e();
        this.f27876f = interfaceC0674y7A.v(context);
    }

    public static X4 b(Context context) {
        if (f27870h == null) {
            f27870h = new X4(context);
        }
        return f27870h;
    }

    public static void g() {
        f27870h = null;
    }

    public int a() {
        return this.f27875e;
    }

    public String c() {
        return this.f27872b;
    }

    public String d() {
        return this.f27871a;
    }

    public String e() {
        return this.f27873c;
    }

    public String f() {
        return this.f27874d;
    }

    public float a(Context context) {
        return this.f27877g.F(context);
    }

    public String b() {
        return this.f27876f;
    }
}
