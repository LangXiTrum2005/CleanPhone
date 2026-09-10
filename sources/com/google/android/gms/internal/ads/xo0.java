package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xo0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yo0 f21946b;

    public /* synthetic */ xo0(yo0 yo0Var, int i10) {
        this.f21945a = i10;
        this.f21946b = yo0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i10 = this.f21945a;
        yo0 yo0Var = this.f21946b;
        switch (i10) {
            case 0:
                yo0Var.c();
                break;
            case 1:
                yo0Var.c();
                break;
            default:
                yo0Var.getClass();
                yo0Var.f22336f.execute(new xo0(yo0Var, 1));
                break;
        }
    }
}
