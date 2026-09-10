package ta;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends qk.i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f50613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f50614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f50615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f50616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f50617f;

    public g(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f50613b = atomicReferenceFieldUpdater;
        this.f50614c = atomicReferenceFieldUpdater2;
        this.f50615d = atomicReferenceFieldUpdater3;
        this.f50616e = atomicReferenceFieldUpdater4;
        this.f50617f = atomicReferenceFieldUpdater5;
    }

    @Override // qk.i0
    public final f F(r rVar) {
        return (f) this.f50616e.getAndSet(rVar, f.f50609d);
    }

    @Override // qk.i0
    public final q G(r rVar) {
        return (q) this.f50615d.getAndSet(rVar, q.f50639c);
    }

    @Override // qk.i0
    public final void X(q qVar, q qVar2) {
        this.f50614c.lazySet(qVar, qVar2);
    }

    @Override // qk.i0
    public final void Y(q qVar, Thread thread) {
        this.f50613b.lazySet(qVar, thread);
    }

    @Override // qk.i0
    public final boolean f(r rVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f50616e;
            if (atomicReferenceFieldUpdater.compareAndSet(rVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(rVar) == fVar);
        return false;
    }

    @Override // qk.i0
    public final boolean g(r rVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f50617f;
            if (atomicReferenceFieldUpdater.compareAndSet(rVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(rVar) == obj);
        return false;
    }

    @Override // qk.i0
    public final boolean h(r rVar, q qVar, q qVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f50615d;
            if (atomicReferenceFieldUpdater.compareAndSet(rVar, qVar, qVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(rVar) == qVar);
        return false;
    }
}
