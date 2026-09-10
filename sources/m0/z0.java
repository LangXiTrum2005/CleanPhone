package m0;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 extends f1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowInsets.Builder f45767d;

    public z0() {
        this.f45767d = new WindowInsets.Builder();
    }

    @Override // m0.f1
    public r1 b() {
        a();
        r1 r1VarG = r1.g(null, this.f45767d.build());
        o1 o1Var = r1VarG.f45740a;
        o1Var.r(null);
        o1Var.q(null);
        o1Var.u(this.f45697b);
        o1Var.v(this.f45698c);
        return r1VarG;
    }

    @Override // m0.f1
    public void d(f0.b bVar) {
        this.f45767d.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // m0.f1
    public void e(f0.b bVar) {
        this.f45767d.setSystemGestureInsets(bVar.d());
    }

    @Override // m0.f1
    public void f(f0.b bVar) {
        this.f45767d.setSystemWindowInsets(bVar.d());
    }

    @Override // m0.f1
    public void g(f0.b bVar) {
        this.f45767d.setTappableElementInsets(bVar.d());
    }

    public z0(r1 r1Var) {
        WindowInsets.Builder builder;
        super(r1Var);
        WindowInsets windowInsetsF = r1Var.f();
        if (windowInsetsF != null) {
            builder = new WindowInsets.Builder(windowInsetsF);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.f45767d = builder;
    }
}
