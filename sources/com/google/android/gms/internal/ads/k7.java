package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f16355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f16356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f16357k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f16358m;

    public k7(int i10) {
        switch (i10) {
            case 1:
                this.f16355i = new g7(1);
                this.f16358m = new eb.d0(19, false);
                break;
            default:
                this.f16355i = new g7(0);
                this.f16358m = new md0(4);
                break;
        }
    }

    public void a(long j10) {
        this.f16349c = j10;
    }

    public abstract long b(l1.q qVar);

    public abstract boolean c(l1.q qVar, long j10, eb.d0 d0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f16358m = new eb.d0(19, false);
            this.f16348b = 0L;
            this.f16350d = 0;
        } else {
            this.f16350d = 1;
        }
        this.f16347a = -1L;
        this.f16349c = 0L;
    }

    public void e(boolean z10) {
        int i10;
        if (z10) {
            this.f16358m = new md0(4);
            this.f16348b = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f16350d = i10;
        this.f16347a = -1L;
        this.f16349c = 0L;
    }

    public abstract long f(np0 np0Var);

    public abstract boolean g(np0 np0Var, long j10, md0 md0Var);

    public void h(long j10) {
        this.f16349c = j10;
    }
}
