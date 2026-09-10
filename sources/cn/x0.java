package cn;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x0 extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f6784e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xj.j f6787d;

    public abstract void shutdown();

    public final void t(boolean z10) {
        long j10 = this.f6785b - (z10 ? 4294967296L : 1L);
        this.f6785b = j10;
        if (j10 <= 0 && this.f6786c) {
            shutdown();
        }
    }

    public final void u(l0 l0Var) {
        xj.j jVar = this.f6787d;
        if (jVar == null) {
            jVar = new xj.j();
            this.f6787d = jVar;
        }
        jVar.addLast(l0Var);
    }

    public abstract Thread v();

    public final void w(boolean z10) {
        this.f6785b = (z10 ? 4294967296L : 1L) + this.f6785b;
        if (z10) {
            return;
        }
        this.f6786c = true;
    }

    public abstract long x();

    public final boolean y() throws IllegalAccessException, InvocationTargetException {
        xj.j jVar = this.f6787d;
        if (jVar == null) {
            return false;
        }
        l0 l0Var = (l0) (jVar.isEmpty() ? null : jVar.removeFirst());
        if (l0Var == null) {
            return false;
        }
        l0Var.run();
        return true;
    }

    public void z(long j10, u0 u0Var) {
        e0.f6703i.E(j10, u0Var);
    }
}
