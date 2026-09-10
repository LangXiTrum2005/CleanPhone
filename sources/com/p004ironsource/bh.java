package com.p004ironsource;

/* JADX INFO: loaded from: classes5.dex */
public class bh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f24430c;

    public bh() {
        this.f24428a = 0;
        this.f24429b = 0;
        this.f24430c = "";
    }

    public int a() {
        return this.f24429b;
    }

    public String b() {
        return this.f24430c;
    }

    public int c() {
        return this.f24428a;
    }

    public boolean d() {
        return this.f24429b > 0 && this.f24428a > 0;
    }

    public boolean e() {
        return this.f24429b == 0 && this.f24428a == 0;
    }

    public String toString() {
        return this.f24430c;
    }

    public bh(int i2, int i3, String str) {
        this.f24428a = i2;
        this.f24429b = i3;
        this.f24430c = str;
    }
}
