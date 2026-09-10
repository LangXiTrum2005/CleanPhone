package cn;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends j1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6698f = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f6699e;

    public d1(i1 i1Var) {
        this.f6699e = i1Var;
    }

    @Override // cn.j1
    public final boolean i() {
        return true;
    }

    @Override // cn.j1
    public final void j(Throwable th2) {
        if (f6698f.compareAndSet(this, 0, 1)) {
            this.f6699e.invoke(th2);
        }
    }
}
