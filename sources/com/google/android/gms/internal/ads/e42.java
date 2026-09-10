package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e42 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h42 f13835b;

    public /* synthetic */ e42(h42 h42Var, int i10) {
        this.f13834a = i10;
        this.f13835b = h42Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.p32, java.lang.Object] */
    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f13834a) {
            case 0:
                h42 h42Var = this.f13835b;
                if (!h42Var.N) {
                    ?? r0 = h42Var.f15138p;
                    r0.getClass();
                    r0.e(h42Var);
                }
                break;
            case 1:
                this.f13835b.H = true;
                break;
            default:
                this.f13835b.p();
                break;
        }
    }
}
