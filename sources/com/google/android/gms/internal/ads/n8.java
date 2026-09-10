package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17696e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f17702k;
    public String l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f17705o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f17706p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i8 f17708r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f17710t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f17711u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17697f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17698g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17699h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17700i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17701j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17703m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17704n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17707q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f17709s = Float.MAX_VALUE;

    public final String a() {
        return this.f17710t;
    }

    public final String b() {
        return this.f17711u;
    }

    public final void c(n8 n8Var) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (n8Var != null) {
            if (!this.f17694c && n8Var.f17694c) {
                this.f17693b = n8Var.f17693b;
                this.f17694c = true;
            }
            if (this.f17699h == -1) {
                this.f17699h = n8Var.f17699h;
            }
            if (this.f17700i == -1) {
                this.f17700i = n8Var.f17700i;
            }
            if (this.f17692a == null && (str = n8Var.f17692a) != null) {
                this.f17692a = str;
            }
            if (this.f17697f == -1) {
                this.f17697f = n8Var.f17697f;
            }
            if (this.f17698g == -1) {
                this.f17698g = n8Var.f17698g;
            }
            if (this.f17704n == -1) {
                this.f17704n = n8Var.f17704n;
            }
            if (this.f17705o == null && (alignment2 = n8Var.f17705o) != null) {
                this.f17705o = alignment2;
            }
            if (this.f17706p == null && (alignment = n8Var.f17706p) != null) {
                this.f17706p = alignment;
            }
            if (this.f17707q == -1) {
                this.f17707q = n8Var.f17707q;
            }
            if (this.f17701j == -1) {
                this.f17701j = n8Var.f17701j;
                this.f17702k = n8Var.f17702k;
            }
            if (this.f17708r == null) {
                this.f17708r = n8Var.f17708r;
            }
            if (this.f17709s == Float.MAX_VALUE) {
                this.f17709s = n8Var.f17709s;
            }
            if (this.f17710t == null) {
                this.f17710t = n8Var.f17710t;
            }
            if (this.f17711u == null) {
                this.f17711u = n8Var.f17711u;
            }
            if (!this.f17696e && n8Var.f17696e) {
                this.f17695d = n8Var.f17695d;
                this.f17696e = true;
            }
            if (this.f17703m != -1 || (i10 = n8Var.f17703m) == -1) {
                return;
            }
            this.f17703m = i10;
        }
    }

    public final String d() {
        return this.l;
    }
}
