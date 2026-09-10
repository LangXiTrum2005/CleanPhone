package hn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42422a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42423b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(s sVar) {
        this._prev$volatile = sVar;
    }

    public final void b() {
        f42423b.set(this, null);
    }

    public final c c() {
        Object obj = f42422a.get(this);
        if (obj == b.f42415a) {
            return null;
        }
        return (c) obj;
    }

    public abstract boolean d();

    public final void e() {
        c cVarC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42423b;
            c cVar = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar != null && cVar.d()) {
                cVar = (c) atomicReferenceFieldUpdater.get(cVar);
            }
            c cVarC2 = c();
            kotlin.jvm.internal.n.c(cVarC2);
            while (cVarC2.d() && (cVarC = cVarC2.c()) != null) {
                cVarC2 = cVarC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(cVarC2);
                c cVar2 = ((c) obj) == null ? null : cVar;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(cVarC2, obj, cVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(cVarC2) != obj) {
                    }
                }
            }
            if (cVar != null) {
                f42422a.set(cVar, cVarC2);
            }
            if (!cVarC2.d() || cVarC2.c() == null) {
                if (cVar == null || !cVar.d()) {
                    return;
                }
            }
        }
    }
}
