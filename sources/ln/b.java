package ln;

import ak.k;
import cn.j0;
import cn.j2;
import cn.l;
import com.ironsource.sdk.controller.y;
import hn.s;
import hn.u;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements cn.j, j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f45602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f45603b;

    public b(c cVar, l lVar) {
        this.f45603b = cVar;
        this.f45602a = lVar;
    }

    @Override // cn.j2
    public final void b(s sVar, int i10) {
        this.f45602a.b(sVar, i10);
    }

    @Override // cn.j
    public final void e(Object obj, jk.b bVar) throws IllegalAccessException, j0, InvocationTargetException {
        this.f45602a.e((r) obj, bVar);
    }

    @Override // cn.j
    public final boolean f(Throwable th2) {
        return this.f45602a.f(th2);
    }

    @Override // cn.j
    public final void g(Object obj, jk.d dVar) throws IllegalAccessException, j0, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f45604h;
        c cVar = this.f45603b;
        atomicReferenceFieldUpdater.set(cVar, null);
        this.f45602a.e(r.f53297a, new y(cVar, this));
    }

    @Override // ak.f
    public final k getContext() {
        return this.f45602a.f6734e;
    }

    @Override // cn.j
    public final boolean isActive() {
        return this.f45602a.isActive();
    }

    @Override // cn.j
    public final u m(Object obj, jk.d dVar) {
        c cVar = this.f45603b;
        cn.k kVar = new cn.k(cVar, this);
        u uVarE = this.f45602a.E((r) obj, kVar);
        if (uVarE != null) {
            c.f45604h.set(cVar, null);
        }
        return uVarE;
    }

    @Override // cn.j
    public final void p(Object obj) throws j0 {
        this.f45602a.p(obj);
    }

    @Override // ak.f
    public final void resumeWith(Object obj) {
        this.f45602a.resumeWith(obj);
    }
}
