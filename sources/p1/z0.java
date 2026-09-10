package p1;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f48203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f48204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f48206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f48207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f48208f;

    public z0(x0 x0Var, y0 y0Var, i1.p0 p0Var, int i10, Looper looper) {
        this.f48204b = x0Var;
        this.f48203a = y0Var;
        this.f48207e = looper;
    }

    public final synchronized void a(boolean z10) {
        notifyAll();
    }

    public final void b() {
        go.k.t(!this.f48208f);
        this.f48208f = true;
        h0 h0Var = (h0) this.f48204b;
        if (!h0Var.J && h0Var.f48057j.getThread().isAlive()) {
            h0Var.f48055h.a(14, this).b();
        } else {
            l1.a.s("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
