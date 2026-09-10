package com.smartdigimkt.o;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final int f37246c = 1;
    protected static final int d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final int f37247e = 4;
    protected static final int f = 8;
    protected static final int g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final int f37248h = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37249a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f37250b;

    public int a() {
        return this.f37249a;
    }

    public boolean b() {
        return this.f37249a == 32;
    }

    public boolean c() {
        return this.f37249a == 4;
    }

    public boolean d() {
        return this.f37249a == 2;
    }

    public boolean e() {
        int i2 = this.f37249a;
        return i2 == 8 || i2 == 16;
    }

    public void f() {
        this.f37249a = 8;
    }

    public void a(int i2) {
        this.f37249a = i2;
    }

    public void a(e eVar) {
        this.f37250b = eVar;
    }
}
