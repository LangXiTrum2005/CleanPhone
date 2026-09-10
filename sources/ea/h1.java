package ea;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f39453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j1 j1Var, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.f39453d = j1Var;
        long andIncrement = j1.f39498k.getAndIncrement();
        this.f39450a = andIncrement;
        this.f39452c = str;
        this.f39451b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            s0 s0Var = ((m1) j1Var.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39753f.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h1 h1Var = (h1) obj;
        boolean z10 = h1Var.f39451b;
        boolean z11 = this.f39451b;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j10 = h1Var.f39450a;
        long j11 = this.f39450a;
        if (j11 < j10) {
            return -1;
        }
        if (j11 > j10) {
            return 1;
        }
        s0 s0Var = ((m1) this.f39453d.f3623a).f39587f;
        m1.h(s0Var);
        s0Var.f39754g.c(Long.valueOf(j11), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        s0 s0Var = ((m1) this.f39453d.f3623a).f39587f;
        m1.h(s0Var);
        s0Var.f39753f.c(th2, this.f39452c);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j1 j1Var, Callable callable, boolean z10) {
        super(callable);
        this.f39453d = j1Var;
        long andIncrement = j1.f39498k.getAndIncrement();
        this.f39450a = andIncrement;
        this.f39452c = "Task exception on worker thread";
        this.f39451b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            s0 s0Var = ((m1) j1Var.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39753f.b("Tasks index overflow");
        }
    }
}
