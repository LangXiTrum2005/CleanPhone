package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f36906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36909d;

    public b0() {
        this.f36908c = 0;
        this.f36909d = "";
        this.f36906a = null;
    }

    public void a(long j10) {
        this.f36907b = j10;
    }

    public abstract int d();

    public int g() {
        return this.f36908c;
    }

    public void a(int i10) {
        this.f36908c = i10;
    }

    public b0(q qVar) {
        this.f36908c = 0;
        this.f36909d = "";
        this.f36906a = qVar;
    }

    public b0(String str) {
        super(str);
        this.f36908c = 0;
        this.f36909d = "";
        this.f36906a = null;
    }

    public b0(Throwable th2) {
        super(th2);
        this.f36908c = 0;
        this.f36909d = "";
        this.f36906a = null;
    }
}
