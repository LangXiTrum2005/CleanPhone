package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o10 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q10 f18082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18083c;

    public /* synthetic */ o10(q10 q10Var, String str, int i10) {
        this.f18081a = i10;
        this.f18082b = q10Var;
        this.f18083c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18081a) {
            case 0:
                d10 d10Var = this.f18082b.f18861g;
                if (d10Var != null) {
                    d10Var.c("exception", "what", "ExoPlayerAdapter exception", "extra", this.f18083c);
                }
                break;
            default:
                d10 d10Var2 = this.f18082b.f18861g;
                if (d10Var2 != null) {
                    d10Var2.c("error", "what", "ExoPlayerAdapter error", "extra", this.f18083c);
                }
                break;
        }
    }
}
