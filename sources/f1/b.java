package f1;

import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import bc.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f0 {
    public final g9.d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f40265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f40266n;

    public b(g9.d dVar) {
        this.l = dVar;
        if (dVar.f41751a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f41751a = this;
    }

    @Override // androidx.lifecycle.e0
    public final void f() {
        g9.d dVar = this.l;
        dVar.f41752b = true;
        dVar.f41754d = false;
        dVar.f41753c = false;
        dVar.f41759i.drainPermits();
        dVar.c();
    }

    @Override // androidx.lifecycle.e0
    public final void g() {
        this.l.f41752b = false;
    }

    @Override // androidx.lifecycle.e0
    public final void i(g0 g0Var) {
        super.i(g0Var);
        this.f40265m = null;
        this.f40266n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.v, java.lang.Object] */
    public final void k() {
        ?? r0 = this.f40265m;
        i iVar = this.f40266n;
        if (r0 == 0 || iVar == null) {
            return;
        }
        super.i(iVar);
        d(r0, iVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
