package hn;

import cn.e2;
import cn.f0;
import cn.i0;
import cn.p0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends cn.w implements i0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42432g = AtomicIntegerFieldUpdater.newUpdater(h.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f42433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cn.w f42434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f42436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f42437f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public h(cn.w wVar, int i10) {
        i0 i0Var = wVar instanceof i0 ? (i0) wVar : null;
        this.f42433b = i0Var == null ? f0.f6709a : i0Var;
        this.f42434c = wVar;
        this.f42435d = i10;
        this.f42436e = new l();
        this.f42437f = new Object();
    }

    @Override // cn.i0
    public final p0 b(long j10, e2 e2Var, ak.k kVar) {
        return this.f42433b.b(j10, e2Var, kVar);
    }

    @Override // cn.i0
    public final void c(long j10, cn.l lVar) {
        this.f42433b.c(j10, lVar);
    }

    @Override // cn.w
    public final void p(ak.k kVar, Runnable runnable) {
        Runnable runnableT;
        this.f42436e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42432g;
        if (atomicIntegerFieldUpdater.get(this) >= this.f42435d || !u() || (runnableT = t()) == null) {
            return;
        }
        try {
            b.i(this.f42434c, this, new ta.i0(this, false, runnableT, 25));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // cn.w
    public final void q(ak.k kVar, Runnable runnable) {
        Runnable runnableT;
        this.f42436e.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42432g;
        if (atomicIntegerFieldUpdater.get(this) >= this.f42435d || !u() || (runnableT = t()) == null) {
            return;
        }
        try {
            this.f42434c.q(this, new ta.i0(this, false, runnableT, 25));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    public final Runnable t() {
        while (true) {
            Runnable runnable = (Runnable) this.f42436e.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f42437f) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42432g;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f42436e.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // cn.w
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f42434c);
        sb2.append(".limitedParallelism(");
        return d5.u.g(sb2, this.f42435d, ')');
    }

    public final boolean u() {
        synchronized (this.f42437f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42432g;
            if (atomicIntegerFieldUpdater.get(this) >= this.f42435d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
