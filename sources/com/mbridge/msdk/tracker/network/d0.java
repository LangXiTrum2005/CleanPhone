package com.mbridge.msdk.tracker.network;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f2040a;
    private long b;
    private int c;
    private String d;

    public d0() {
        this.c = 0;
        this.d = "";
        this.f2040a = null;
    }

    public abstract int a();

    public void a(long j) {
        this.b = j;
    }

    public String b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public void a(int i) {
        this.c = i;
    }

    public void a(String str) {
        this.d = str;
    }

    public d0(r rVar) {
        this.c = 0;
        this.d = "";
        this.f2040a = rVar;
    }

    public d0(String str) {
        super(str);
        this.c = 0;
        this.d = "";
        this.f2040a = null;
    }

    public d0(Throwable th) {
        super(th);
        this.c = 0;
        this.d = "";
        this.f2040a = null;
    }
}
