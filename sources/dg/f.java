package dg;

import eb.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f38867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f38868b;

    public f(d0 d0Var, double d10) {
        this.f38868b = d0Var;
        this.f38867a = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((uf.a) this.f38868b.f39977c).e(this.f38867a);
    }
}
