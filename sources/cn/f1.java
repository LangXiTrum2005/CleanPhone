package cn;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface f1 extends ak.i {
    void a(CancellationException cancellationException);

    CancellationException h();

    boolean isActive();

    boolean isCancelled();

    p0 j(boolean z10, boolean z11, i1 i1Var);

    o k(q1 q1Var);

    p0 n(jk.b bVar);

    boolean start();
}
