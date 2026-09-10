package f2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f40370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f40371c;

    public /* synthetic */ i0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, c0 c0Var) {
        this.f40371c = copyOnWriteArrayList;
        this.f40369a = i10;
        this.f40370b = c0Var;
    }

    public void a(l1.g gVar) {
        for (h0 h0Var : this.f40371c) {
            l1.y.Q(h0Var.f40363a, new com.unity3d.services.ads.operation.show.b(15, gVar, h0Var.f40364b));
        }
    }

    public void b(int i10, i1.p pVar, int i11, Object obj, long j10) {
        a(new cj.h(18, this, new c2.g(1, i10, pVar, i11, obj, l1.y.Z(j10), C.TIME_UNSET)));
    }

    public void c(u uVar, int i10, int i11, i1.p pVar, int i12, Object obj, long j10, long j11) {
        a(new f0(this, uVar, new c2.g(i10, i11, pVar, i12, obj, l1.y.Z(j10), l1.y.Z(j11)), 1));
    }

    public void d(u uVar, int i10) {
        e(uVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
    }

    public void e(u uVar, int i10, int i11, i1.p pVar, int i12, Object obj, long j10, long j11) {
        a(new f0(this, uVar, new c2.g(i10, i11, pVar, i12, obj, l1.y.Z(j10), l1.y.Z(j11)), 0));
    }

    public void f(u uVar, int i10, int i11, i1.p pVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        a(new g0(this, uVar, new c2.g(i10, i11, pVar, i12, obj, l1.y.Z(j10), l1.y.Z(j11)), iOException, z10));
    }

    public void g(u uVar, int i10, IOException iOException, boolean z10) {
        f(uVar, i10, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, z10);
    }

    public void h(u uVar, int i10, int i11, i1.p pVar, int i12, Object obj, long j10, long j11, int i13) {
        a(new e0(this, uVar, new c2.g(i10, i11, pVar, i12, obj, l1.y.Z(j10), l1.y.Z(j11)), i13));
    }

    public void i(int i10, long j10, long j11) {
        c2.g gVar = new c2.g(1, i10, null, 3, null, l1.y.Z(j10), l1.y.Z(j11));
        c0 c0Var = this.f40370b;
        c0Var.getClass();
        a(new ac.a(this, c0Var, gVar, 7));
    }
}
