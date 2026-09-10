package dg;

import eb.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38865a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f38866b;

    public e(d0 d0Var) {
        this.f38866b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38865a) {
            case 0:
                ((uf.a) this.f38866b.f39977c).c();
                break;
            default:
                ((uf.a) this.f38866b.f39977c).b();
                break;
        }
    }

    public e(d0 d0Var, int i10) {
        this.f38866b = d0Var;
    }
}
