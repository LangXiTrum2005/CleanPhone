package en;

import cn.d0;
import cn.g1;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends cn.a implements r, i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f40176d;

    public q(ak.k kVar, e eVar) {
        super(kVar, true);
        this.f40176d = eVar;
    }

    @Override // cn.q1, cn.f1
    public final void a(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new g1(w(), null, this);
        }
        u(cancellationException);
    }

    @Override // en.u
    public final Object b(ak.f fVar, Object obj) {
        return this.f40176d.b(fVar, obj);
    }

    @Override // cn.a
    public final void b0(Throwable th2, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (this.f40176d.j(th2, false) || z10) {
            return;
        }
        d0.t(this.f6670c, th2);
    }

    @Override // en.t
    public final Object c(gn.i iVar) {
        e eVar = this.f40176d;
        eVar.getClass();
        return e.B(eVar, iVar);
    }

    @Override // cn.a
    public final void c0(Object obj) {
        this.f40176d.h(null);
    }

    public final boolean e0(Throwable th2) {
        return this.f40176d.j(th2, false);
    }

    public final void f0(cl.a aVar) {
        e eVar = this.f40176d;
        eVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f40143j;
        while (!atomicReferenceFieldUpdater.compareAndSet(eVar, null, aVar)) {
            if (atomicReferenceFieldUpdater.get(eVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(eVar);
                    hn.u uVar = g.f40161q;
                    if (obj != uVar) {
                        if (obj == g.f40162r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    hn.u uVar2 = g.f40162r;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(eVar, uVar, uVar2)) {
                            aVar.invoke(eVar.p());
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(eVar) == uVar);
                }
            }
        }
    }

    @Override // en.u
    public final Object i(Object obj) {
        return this.f40176d.i(obj);
    }

    @Override // en.t
    public final Object l() {
        return this.f40176d.l();
    }

    @Override // cn.q1
    public final void u(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        this.f40176d.j(cancellationException, true);
        t(cancellationException);
    }
}
