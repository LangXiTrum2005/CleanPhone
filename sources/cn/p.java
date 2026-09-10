package cn;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends j1 implements o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1 f6753e;

    public p(q1 q1Var) {
        this.f6753e = q1Var;
    }

    @Override // cn.o
    public final boolean a(Throwable th2) {
        return h().x(th2);
    }

    @Override // cn.j1
    public final boolean i() {
        return true;
    }

    @Override // cn.j1
    public final void j(Throwable th2) throws IllegalAccessException, InvocationTargetException {
        this.f6753e.t(h());
    }
}
