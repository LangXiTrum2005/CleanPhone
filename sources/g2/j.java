package g2;

import b2.w;
import ea.b0;
import java.util.List;
import p1.e1;
import p1.k0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface j {
    long a(long j10, e1 e1Var);

    void b(f fVar);

    void c(k0 k0Var, long j10, List list, bc.i iVar);

    boolean d(f fVar, boolean z10, w wVar, b0 b0Var);

    boolean e(long j10, f fVar, List list);

    int getPreferredQueueSize(long j10, List list);

    void maybeThrowError();

    void release();
}
