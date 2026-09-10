package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wq0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xq0 f21584b;

    public /* synthetic */ wq0(xq0 xq0Var, int i10) {
        this.f21583a = i10;
        this.f21584b = xq0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f21583a) {
            case 0:
                xq0 xq0Var = this.f21584b;
                xq0Var.f21966a.set(new vq0(xq0Var.f21970e.zza(), xq0Var.f21971f, xq0Var.f21968c));
                break;
            default:
                xq0 xq0Var2 = this.f21584b;
                xq0Var2.f21969d.execute(new wq0(xq0Var2, 0));
                break;
        }
    }
}
