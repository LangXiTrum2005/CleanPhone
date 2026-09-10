package f2;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f40328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f40329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f40330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f40331f;

    public f(i1.p0 p0Var, long j10, long j11) throws g {
        super(p0Var);
        if (j11 != Long.MIN_VALUE && j11 < j10) {
            throw new g(2, j10, j11);
        }
        boolean z10 = false;
        if (p0Var.h() != 1) {
            throw new g(0);
        }
        i1.o0 o0VarM = p0Var.m(0, new i1.o0(), 0L);
        long jMax = Math.max(0L, j10);
        if (!o0VarM.f42626k && jMax != 0 && !o0VarM.f42623h) {
            throw new g(1);
        }
        long jMax2 = j11 == Long.MIN_VALUE ? o0VarM.f42627m : Math.max(0L, j11);
        long j12 = o0VarM.f42627m;
        long j13 = C.TIME_UNSET;
        if (j12 != C.TIME_UNSET) {
            jMax2 = jMax2 > j12 ? j12 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f40328c = jMax;
        this.f40329d = jMax2;
        this.f40330e = jMax2 != C.TIME_UNSET ? jMax2 - jMax : j13;
        if (o0VarM.f42624i && (jMax2 == C.TIME_UNSET || (j12 != C.TIME_UNSET && jMax2 == j12))) {
            z10 = true;
        }
        this.f40331f = z10;
    }

    @Override // f2.s, i1.p0
    public final i1.n0 f(int i10, i1.n0 n0Var, boolean z10) {
        this.f40443b.f(0, n0Var, z10);
        long j10 = n0Var.f42586e - this.f40328c;
        long j11 = this.f40330e;
        long j12 = C.TIME_UNSET;
        if (j11 != C.TIME_UNSET) {
            j12 = j11 - j10;
        }
        n0Var.h(n0Var.f42582a, n0Var.f42583b, 0, j12, j10, i1.c.f42523c, false);
        return n0Var;
    }

    @Override // f2.s, i1.p0
    public final i1.o0 m(int i10, i1.o0 o0Var, long j10) {
        this.f40443b.m(0, o0Var, 0L);
        long j11 = o0Var.f42630p;
        long j12 = this.f40328c;
        o0Var.f42630p = j11 + j12;
        o0Var.f42627m = this.f40330e;
        o0Var.f42624i = this.f40331f;
        long j13 = o0Var.l;
        if (j13 != C.TIME_UNSET) {
            long jMax = Math.max(j13, j12);
            o0Var.l = jMax;
            long j14 = this.f40329d;
            if (j14 != C.TIME_UNSET) {
                jMax = Math.min(jMax, j14);
            }
            o0Var.l = jMax - j12;
        }
        long jZ = l1.y.Z(j12);
        long j15 = o0Var.f42620e;
        if (j15 != C.TIME_UNSET) {
            o0Var.f42620e = j15 + jZ;
        }
        long j16 = o0Var.f42621f;
        if (j16 != C.TIME_UNSET) {
            o0Var.f42621f = j16 + jZ;
        }
        return o0Var;
    }
}
