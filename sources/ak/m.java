package ak;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements f, ck.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3621b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f3622a;
    private volatile Object result;

    public m(f fVar) {
        bk.a aVar = bk.a.f5709b;
        this.f3622a = fVar;
        this.result = aVar;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        bk.a aVar = bk.a.f5709b;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3621b;
            bk.a aVar2 = bk.a.f5708a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return bk.a.f5708a;
        }
        if (obj == bk.a.f5710c) {
            return bk.a.f5708a;
        }
        if (obj instanceof wj.g) {
            throw ((wj.g) obj).f53285a;
        }
        return obj;
    }

    @Override // ck.d
    public final ck.d getCallerFrame() {
        f fVar = this.f3622a;
        if (fVar instanceof ck.d) {
            return (ck.d) fVar;
        }
        return null;
    }

    @Override // ak.f
    public final k getContext() {
        return this.f3622a.getContext();
    }

    @Override // ak.f
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            bk.a aVar = bk.a.f5709b;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3621b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            bk.a aVar2 = bk.a.f5708a;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3621b;
            bk.a aVar3 = bk.a.f5710c;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.f3622a.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f3622a;
    }
}
