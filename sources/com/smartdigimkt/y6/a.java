package com.smartdigimkt.y6;

import com.smartdigimkt.sdk.api.SDMAdConst;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f40230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f40231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected double f40232c;
    protected double d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f40233e;
    public String f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f40234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f40235i;
    private String j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SDMAdConst.CURRENCY f40236l;
    public Object m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f40237n;

    public a(boolean z2, double d, String str, String str2, String str3, String str4, String str5, SDMAdConst.CURRENCY currency) {
        this.k = 1;
        this.f40230a = z2;
        this.f40231b = d;
        this.f40232c = d;
        this.d = d;
        this.f40233e = str;
        this.g = str2;
        this.f40234h = str3;
        this.f40235i = str4;
        this.f = str5;
        this.f40236l = currency;
    }

    public void a(double d) {
        this.f40232c = d;
    }

    public void b(double d) {
        this.d = d;
    }

    public Object c() {
        return this.m;
    }

    public double d() {
        return this.f40231b;
    }

    public String e() {
        return this.j;
    }

    public double f() {
        return this.f40232c;
    }

    public double g() {
        return this.f40237n;
    }

    public double h() {
        return this.d;
    }

    public boolean i() {
        return this.f40230a;
    }

    public boolean j() {
        return this.d == this.f40231b;
    }

    public boolean k() {
        return this.f40230a && this.k == 1;
    }

    public void a(Object obj) {
        this.m = obj;
    }

    public String b() {
        return this.f;
    }

    public void a(String str) {
        this.j = str;
    }

    public SDMAdConst.CURRENCY a() {
        return this.f40236l;
    }

    public a(boolean z2, double d, String str, String str2, SDMAdConst.CURRENCY currency) {
        this.k = 1;
        this.f40230a = z2;
        this.f40231b = d;
        this.f40232c = d;
        this.d = d;
        this.f40233e = str;
        this.f = str2;
        this.f40236l = currency;
    }

    public a(boolean z2, double d, double d2, String str, String str2, SDMAdConst.CURRENCY currency) {
        this(z2, d2, str, str2, currency);
        this.d = d;
    }
}
