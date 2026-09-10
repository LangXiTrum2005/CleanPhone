package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ph0 f18272b;

    public /* synthetic */ oh0(ph0 ph0Var, int i10) {
        this.f18271a = i10;
        this.f18272b = ph0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f18271a) {
            case 0:
                ph0 ph0Var = this.f18272b;
                ph0Var.f18654c.execute(new oh0(ph0Var, 1));
                break;
            case 1:
                this.f18272b.a();
                break;
            default:
                this.f18272b.a();
                break;
        }
    }
}
