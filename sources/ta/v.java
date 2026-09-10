package ta;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends r9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f50663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f50664d;

    public v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f50663c = atomicReferenceFieldUpdater;
        this.f50664d = atomicIntegerFieldUpdater;
    }

    @Override // r9.b
    public final void c(b0 b0Var, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f50663c;
            if (atomicReferenceFieldUpdater.compareAndSet(b0Var, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(b0Var) == null);
    }

    @Override // r9.b
    public final int g(b0 b0Var) {
        return this.f50664d.decrementAndGet(b0Var);
    }
}
