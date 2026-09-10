package ta;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f50630a;

    public o0(p0 p0Var) {
        this.f50630a = p0Var;
    }

    public static void a(o0 o0Var, Thread thread) {
        o0Var.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f50630a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
