package cn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j1 extends hn.k implements p0, b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q1 f6723d;

    @Override // cn.b1
    public final t1 b() {
        return null;
    }

    @Override // cn.p0
    public final void dispose() {
        q1 q1VarH = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q1.f6757a;
            Object obj = atomicReferenceFieldUpdater.get(q1VarH);
            if (obj instanceof j1) {
                if (obj != this) {
                    return;
                }
                r0 r0Var = d0.f6697j;
                while (!atomicReferenceFieldUpdater.compareAndSet(q1VarH, obj, r0Var)) {
                    if (atomicReferenceFieldUpdater.get(q1VarH) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof b1) || ((b1) obj).b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = hn.k.f42439a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof hn.p) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                hn.k kVar = (hn.k) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = hn.k.f42441c;
                hn.p pVar = (hn.p) atomicReferenceFieldUpdater3.get(kVar);
                if (pVar == null) {
                    pVar = new hn.p(kVar);
                    atomicReferenceFieldUpdater3.set(kVar, pVar);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, pVar)) {
                        kVar.d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    public f1 getParent() {
        return h();
    }

    public final q1 h() {
        q1 q1Var = this.f6723d;
        if (q1Var != null) {
            return q1Var;
        }
        kotlin.jvm.internal.n.l("job");
        throw null;
    }

    public abstract boolean i();

    @Override // cn.b1
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th2);

    @Override // hn.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + d0.q(this) + "[job@" + d0.q(h()) + ']';
    }
}
