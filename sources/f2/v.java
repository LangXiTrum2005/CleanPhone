package f2;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements a0, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f40467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9.e f40469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f40470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0 f40471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z f40472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40473g = C.TIME_UNSET;

    public v(c0 c0Var, v9.e eVar, long j10) {
        this.f40467a = c0Var;
        this.f40469c = eVar;
        this.f40468b = j10;
    }

    @Override // f2.a0
    public final long a(long j10, p1.e1 e1Var) {
        a0 a0Var = this.f40471e;
        String str = l1.y.f44830a;
        return a0Var.a(j10, e1Var);
    }

    public final void b(c0 c0Var) {
        long j10 = this.f40473g;
        if (j10 == C.TIME_UNSET) {
            j10 = this.f40468b;
        }
        a aVar = this.f40470d;
        aVar.getClass();
        a0 a0VarC = aVar.c(c0Var, this.f40469c, j10);
        this.f40471e = a0VarC;
        if (this.f40472f != null) {
            a0VarC.e(this, j10);
        }
    }

    @Override // f2.a0
    public final long c(i2.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.f40473g;
        if (j11 != C.TIME_UNSET && j10 == this.f40468b) {
            j10 = j11;
        }
        this.f40473g = C.TIME_UNSET;
        a0 a0Var = this.f40471e;
        String str = l1.y.f44830a;
        return a0Var.c(rVarArr, zArr, c1VarArr, zArr2, j10);
    }

    @Override // f2.a0
    public final void e(z zVar, long j10) {
        this.f40472f = zVar;
        a0 a0Var = this.f40471e;
        if (a0Var != null) {
            long j11 = this.f40473g;
            if (j11 == C.TIME_UNSET) {
                j11 = this.f40468b;
            }
            a0Var.e(this, j11);
        }
    }

    @Override // f2.e1
    public final boolean f(p1.k0 k0Var) {
        a0 a0Var = this.f40471e;
        return a0Var != null && a0Var.f(k0Var);
    }

    @Override // f2.a0
    public final void g(long j10) {
        a0 a0Var = this.f40471e;
        String str = l1.y.f44830a;
        a0Var.g(j10);
    }

    @Override // f2.e1
    public final long getBufferedPositionUs() {
        a0 a0Var = this.f40471e;
        String str = l1.y.f44830a;
        return a0Var.getBufferedPositionUs();
    }

    @Override // f2.e1
    public final long getNextLoadPositionUs() {
        a0 a0Var = this.f40471e;
        String str = l1.y.f44830a;
        return a0Var.getNextLoadPositionUs();
    }

    @Override // f2.a0
    public final k1 getTrackGroups() {
        a0 a0Var = this.f40471e;
        String str = l1.y.f44830a;
        return a0Var.getTrackGroups();
    }

    @Override // f2.d1
    public final void h(e1 e1Var) {
        z zVar = this.f40472f;
        String str = l1.y.f44830a;
        zVar.h(this);
    }

    @Override // f2.e1
    public final boolean isLoading() {
        a0 a0Var = this.f40471e;
        return a0Var != null && a0Var.isLoading();
    }

    @Override // f2.z
    public final void j(a0 a0Var) {
        z zVar = this.f40472f;
        String str = l1.y.f44830a;
        zVar.j(this);
    }

    @Override // f2.a0
    public final void maybeThrowPrepareError() {
        a0 a0Var = this.f40471e;
        if (a0Var != null) {
            a0Var.maybeThrowPrepareError();
            return;
        }
        a aVar = this.f40470d;
        if (aVar != null) {
            aVar.m();
        }
    }

    @Override // f2.a0
    public final long readDiscontinuity() {
        a0 a0Var = this.f40471e;
        String str = l1.y.f44830a;
        return a0Var.readDiscontinuity();
    }

    @Override // f2.e1
    public final void reevaluateBuffer(long j10) {
        a0 a0Var = this.f40471e;
        String str = l1.y.f44830a;
        a0Var.reevaluateBuffer(j10);
    }

    @Override // f2.a0
    public final long seekToUs(long j10) {
        a0 a0Var = this.f40471e;
        String str = l1.y.f44830a;
        return a0Var.seekToUs(j10);
    }
}
