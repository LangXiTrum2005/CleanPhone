package x3;

import f.n;
import f.t;
import fn.a1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f53583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53584b;

    public final void a() {
        c cVar = this.f53583a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f53584b) {
            cVar.c(this, null);
        }
        f fVar = cVar.f53578b;
        a4.a aVar = cVar.f53577a;
        fVar.getClass();
        if (equals(fVar.f53592h) && -1 == fVar.f53591g) {
            n nVarC = fVar.f53590f;
            if (nVarC == null) {
                nVarC = fVar.c(-1);
            }
            fVar.f53590f = null;
            fVar.f53591g = 0;
            fVar.f53592h = null;
            if (nVarC == null) {
                ((t) aVar.f3382b).f40252a.run();
            } else {
                nVarC.f40239d.b();
            }
            a1 a1Var = fVar.f53585a;
            a1Var.getClass();
            a1Var.e0(null, g.f53598e);
        }
        this.f53584b = false;
    }

    public void b(boolean z10) {
    }
}
