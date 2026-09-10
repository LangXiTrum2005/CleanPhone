package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p10 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f18430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18431d;

    public /* synthetic */ p10(Object obj, boolean z10, long j10, int i10) {
        this.f18428a = i10;
        this.f18431d = obj;
        this.f18429b = z10;
        this.f18430c = j10;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f18428a) {
            case 0:
                q10 q10Var = (q10) this.f18431d;
                q10Var.f18857c.B(this.f18430c, this.f18429b);
                break;
            default:
                ((b30) this.f18431d).B(this.f18430c, this.f18429b);
                break;
        }
    }
}
