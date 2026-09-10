package cl;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements jk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6522c;

    public /* synthetic */ i(int i10, Object obj, Object obj2) {
        this.f6520a = i10;
        this.f6522c = obj;
        this.f6521b = obj2;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f6520a) {
            case 0:
                pm.j0.f48443b.getClass();
                pm.j0 j0Var = pm.j0.f48444c;
                pm.n0 n0VarN = ((k) this.f6522c).n();
                List list = Collections.EMPTY_LIST;
                h hVar = new h(this, 0);
                om.b NO_LOCKS = om.l.f47582e;
                kotlin.jvm.internal.n.e(NO_LOCKS, "NO_LOCKS");
                return pm.f.s(new im.j(NO_LOCKS, hVar), list, j0Var, n0VarN, false);
            case 1:
                ym.f fVar = new ym.f();
                Iterator it = ((y) this.f6522c).f().iterator();
                while (it.hasNext()) {
                    fVar.add(((zk.s) it.next()).b((pm.w0) this.f6521b));
                }
                return fVar;
            default:
                fo.n nVar = (fo.n) this.f6522c;
                fo.r rVar = (fo.r) this.f6521b;
                try {
                    if (!rVar.a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (rVar.a(false, this)) {
                    }
                    nVar.a(1, 9, null);
                    yn.a.d(rVar);
                    return wj.r.f53297a;
                } catch (IOException e10) {
                    nVar.a(2, 2, e10);
                } catch (Throwable th2) {
                    nVar.a(3, 3, null);
                    yn.a.d(rVar);
                    throw th2;
                }
                break;
        }
    }
}
