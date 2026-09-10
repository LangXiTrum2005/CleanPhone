package f2;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends i1.p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1.y f40507b;

    public x(i1.y yVar) {
        this.f40507b = yVar;
    }

    @Override // i1.p0
    public final int b(Object obj) {
        return obj == w.f40499e ? 0 : -1;
    }

    @Override // i1.p0
    public final i1.n0 f(int i10, i1.n0 n0Var, boolean z10) {
        n0Var.h(z10 ? 0 : null, z10 ? w.f40499e : null, 0, C.TIME_UNSET, 0L, i1.c.f42523c, true);
        return n0Var;
    }

    @Override // i1.p0
    public final int h() {
        return 1;
    }

    @Override // i1.p0
    public final Object l(int i10) {
        return w.f40499e;
    }

    @Override // i1.p0
    public final i1.o0 m(int i10, i1.o0 o0Var, long j10) {
        Object obj = i1.o0.f42614q;
        o0Var.b(this.f40507b, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0L);
        o0Var.f42626k = true;
        return o0Var;
    }

    @Override // i1.p0
    public final int o() {
        return 1;
    }
}
