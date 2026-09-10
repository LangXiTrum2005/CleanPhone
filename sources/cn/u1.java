package cn;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u1 extends ak.a implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1 f6774a = new u1(e1.f6705a);

    @Override // cn.f1
    public final CancellationException h() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // cn.f1
    public final boolean isActive() {
        return true;
    }

    @Override // cn.f1
    public final boolean isCancelled() {
        return false;
    }

    @Override // cn.f1
    public final p0 j(boolean z10, boolean z11, i1 i1Var) {
        return v1.f6778a;
    }

    @Override // cn.f1
    public final o k(q1 q1Var) {
        return v1.f6778a;
    }

    @Override // cn.f1
    public final p0 n(jk.b bVar) {
        return v1.f6778a;
    }

    @Override // cn.f1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // cn.f1
    public final void a(CancellationException cancellationException) {
    }
}
