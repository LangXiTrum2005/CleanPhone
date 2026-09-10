package cn;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c2 extends j1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6684g = AtomicIntegerFieldUpdater.newUpdater(c2.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Thread f6685e = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p0 f6686f;

    public static void l(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    @Override // cn.j1
    public final boolean i() {
        return true;
    }

    @Override // cn.j1
    public final void j(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f6684g;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                l(i10);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 2));
        this.f6685e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6684g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        l(i10);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, 1)) {
                p0 p0Var = this.f6686f;
                if (p0Var != null) {
                    p0Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
