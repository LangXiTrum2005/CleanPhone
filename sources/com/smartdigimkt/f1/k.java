package com.smartdigimkt.f1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public class k implements Serializable, com.smartdigimkt.w1.a, com.smartdigimkt.f0.c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final long f34981u = 1;
    public static final int v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f34982w = 2;
    public static final int x = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f34988i;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f34989l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f34990n;
    private Drawable o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f34991p;
    private r q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34983a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34984b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34985c = "";
    private String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f34986e = "";
    private String f = "";
    private String g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f34987h = 0;
    private int j = 33333;
    private int m = 1;
    private int r = 0;
    private int s = 0;
    private int t = 0;

    @Override // com.smartdigimkt.f0.c
    public void a(String str, String str2) {
    }

    public void b(r rVar) {
        this.q = rVar;
        if (TextUtils.isEmpty(k())) {
            return;
        }
        com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(k(), this);
    }

    public void c(r rVar) {
        this.q = rVar;
    }

    public void d(String str) {
        this.f34985c = str;
    }

    public String e() {
        return this.d;
    }

    public void f(String str) {
        this.f34983a = str;
    }

    public Drawable g() {
        return this.f34991p;
    }

    public Drawable h() {
        return this.o;
    }

    public String i() {
        return this.f;
    }

    public String j() {
        return this.f34983a;
    }

    public String k() {
        return this.g;
    }

    public Object l() {
        return this.f34989l;
    }

    public int m() {
        return this.j;
    }

    public String n() {
        return this.f34984b;
    }

    public double o() {
        return this.f34988i;
    }

    public String p() {
        return this.f34986e;
    }

    public String q() {
        return this.f34990n;
    }

    public long r() {
        return this.f34987h;
    }

    public int s() {
        return this.m;
    }

    public int t() {
        return this.t;
    }

    public void a(r rVar) {
        this.q = rVar;
        if (TextUtils.isEmpty(i())) {
            return;
        }
        com.smartdigimkt.f0.b.a(com.smartdigimkt.m6.b.p().k()).a(i(), this);
    }

    public void c(int i2) {
        if (i2 > 0) {
            this.j = i2;
        }
    }

    public void d(int i2) {
        this.m = i2;
    }

    public void e(String str) {
        this.f = str;
    }

    public String f() {
        return this.f34985c;
    }

    public void g(String str) {
        this.g = str;
    }

    public void h(String str) {
        this.f34984b = str;
    }

    public void i(String str) {
        this.f34986e = str;
    }

    public void j(String str) {
        this.f34990n = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public int d() {
        return this.r;
    }

    public void e(int i2) {
        this.t = i2;
    }

    public String b() {
        return this.k;
    }

    public int c() {
        return this.s;
    }

    @Override // com.smartdigimkt.f0.c
    public void a(Bitmap bitmap, String str) {
        if (!TextUtils.isEmpty(k()) && k().equals(str) && bitmap != null) {
            a(a(bitmap));
            r rVar = this.q;
            if (rVar != null) {
                rVar.a(a(bitmap), 3);
            }
        }
        if (TextUtils.isEmpty(i()) || i() == null || !i().equals(str) || bitmap == null) {
            return;
        }
        b(a(bitmap));
        r rVar2 = this.q;
        if (rVar2 != null) {
            rVar2.a(a(bitmap), 2);
        }
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.k = str;
    }

    public void b(int i2) {
        this.r = i2;
    }

    public void b(Drawable drawable) {
        this.o = drawable;
    }

    public void a(double d) {
        this.f34988i = d;
    }

    public void a(Object obj) {
        this.f34989l = obj;
    }

    public void a(long j) {
        this.f34987h = j;
    }

    public void a(int i2) {
        this.s = i2;
    }

    private Drawable a(Bitmap bitmap) {
        return new BitmapDrawable(bitmap);
    }

    public void a(Drawable drawable) {
        this.f34991p = drawable;
    }
}
