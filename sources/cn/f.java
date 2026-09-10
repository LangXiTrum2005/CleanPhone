package cn;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f6707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f6708e;

    public f(ak.k kVar, Thread thread, x0 x0Var) {
        super(kVar, true);
        this.f6707d = thread;
        this.f6708e = x0Var;
    }

    @Override // cn.q1
    public final void q(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f6707d;
        if (kotlin.jvm.internal.n.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
