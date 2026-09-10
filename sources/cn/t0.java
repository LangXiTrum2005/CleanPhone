package cn;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f6769c;

    public t0(long j10, e2 e2Var) {
        super(j10);
        this.f6769c = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        this.f6769c.run();
    }

    @Override // cn.u0
    public final String toString() {
        return super.toString() + this.f6769c;
    }
}
