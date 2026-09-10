package cn;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends j1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6679h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f6680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p0 f6681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f6682g;

    public c(e eVar, l lVar) {
        this.f6682g = eVar;
        this.f6680e = lVar;
    }

    @Override // cn.j1
    public final boolean i() {
        return false;
    }

    @Override // cn.j1
    public final void j(Throwable th2) throws j0 {
        l lVar = this.f6680e;
        if (th2 != null) {
            lVar.getClass();
            hn.u uVarE = lVar.E(new u(th2, false), null);
            if (uVarE != null) {
                lVar.p(uVarE);
                d dVar = (d) f6679h.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f6701b;
        e eVar = this.f6682g;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            g0[] g0VarArr = eVar.f6702a;
            ArrayList arrayList = new ArrayList(g0VarArr.length);
            for (g0 g0Var : g0VarArr) {
                arrayList.add(g0Var.d());
            }
            lVar.resumeWith(arrayList);
        }
    }
}
