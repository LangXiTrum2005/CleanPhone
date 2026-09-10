package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ws0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xs0 f21603b;

    public /* synthetic */ ws0(xs0 xs0Var, int i10) {
        this.f21602a = i10;
        this.f21603b = xs0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f21602a) {
            case 0:
                xs0 xs0Var = this.f21603b;
                xs0Var.f21990a.b().execute(new ws0(xs0Var, 1));
                break;
            default:
                this.f21603b.x1(5);
                break;
        }
    }
}
