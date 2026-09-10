package com.smartdigimkt.l7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements Runnable {
    public static final int g0 = 1;
    public static final int h0 = 2;
    public static final int i0 = 3;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    protected e f36388Y;
    protected boolean X = true;
    protected int Z = 1;
    private long e0 = 0;
    private String f0 = "sdm_default_thread";

    public void a(long j) {
        this.e0 = j;
    }

    public long b() {
        return this.e0;
    }

    public String c() {
        return this.f0;
    }

    public abstract void d();

    @Override // java.lang.Runnable
    public void run() {
        Thread.currentThread().setName(this.f0);
        e eVar = this.f36388Y;
        if (eVar != null) {
            eVar.b(this);
        }
        d();
        e eVar2 = this.f36388Y;
        if (eVar2 != null) {
            eVar2.a(this);
        }
    }

    public void a(e eVar) {
        this.f36388Y = eVar;
    }

    public void a(String str) {
        this.f0 = str;
    }
}
