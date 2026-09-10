package m0;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 extends g1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f0.b f45714h;

    public h1(r1 r1Var, WindowInsets windowInsets) {
        super(r1Var, windowInsets);
        this.f45714h = null;
    }

    @Override // m0.o1
    public r1 b() {
        return r1.g(null, this.f45700c.consumeStableInsets());
    }

    @Override // m0.o1
    public r1 c() {
        return r1.g(null, this.f45700c.consumeSystemWindowInsets());
    }

    @Override // m0.o1
    public final f0.b i() {
        if (this.f45714h == null) {
            WindowInsets windowInsets = this.f45700c;
            this.f45714h = f0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f45714h;
    }

    @Override // m0.o1
    public boolean n() {
        return this.f45700c.isConsumed();
    }
}
