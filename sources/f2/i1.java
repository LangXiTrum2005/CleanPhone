package f2;

import com.google.android.gms.internal.ads.az1;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements a0, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f40372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f40374c;

    public i1(a0 a0Var, long j10) {
        this.f40372a = a0Var;
        this.f40373b = j10;
    }

    @Override // f2.a0
    public final long a(long j10, p1.e1 e1Var) {
        long j11 = this.f40373b;
        return this.f40372a.a(j10 - j11, e1Var) + j11;
    }

    @Override // f2.a0
    public final long c(i2.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        int i10 = 0;
        while (true) {
            c1 c1Var = null;
            if (i10 >= c1VarArr.length) {
                break;
            }
            h1 h1Var = (h1) c1VarArr[i10];
            if (h1Var != null) {
                c1Var = h1Var.f40365a;
            }
            c1VarArr2[i10] = c1Var;
            i10++;
        }
        a0 a0Var = this.f40372a;
        long j11 = this.f40373b;
        long jC = a0Var.c(rVarArr, zArr, c1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < c1VarArr.length; i11++) {
            c1 c1Var2 = c1VarArr2[i11];
            if (c1Var2 == null) {
                c1VarArr[i11] = null;
            } else {
                c1 c1Var3 = c1VarArr[i11];
                if (c1Var3 == null || ((h1) c1Var3).f40365a != c1Var2) {
                    c1VarArr[i11] = new h1(c1Var2, j11);
                }
            }
        }
        return jC + j11;
    }

    @Override // f2.a0
    public final void e(z zVar, long j10) {
        this.f40374c = zVar;
        this.f40372a.e(this, j10 - this.f40373b);
    }

    @Override // f2.e1
    public final boolean f(p1.k0 k0Var) {
        az1 az1Var = new az1();
        long j10 = k0Var.f48103a;
        az1Var.f12555b = k0Var.f48104b;
        az1Var.f12556c = k0Var.f48105c;
        az1Var.f12554a = j10 - this.f40373b;
        return this.f40372a.f(new p1.k0(az1Var));
    }

    @Override // f2.a0
    public final void g(long j10) {
        this.f40372a.g(j10 - this.f40373b);
    }

    @Override // f2.e1
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f40372a.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.f40373b;
    }

    @Override // f2.e1
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f40372a.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.f40373b;
    }

    @Override // f2.a0
    public final k1 getTrackGroups() {
        return this.f40372a.getTrackGroups();
    }

    @Override // f2.d1
    public final void h(e1 e1Var) {
        z zVar = this.f40374c;
        zVar.getClass();
        zVar.h(this);
    }

    @Override // f2.e1
    public final boolean isLoading() {
        return this.f40372a.isLoading();
    }

    @Override // f2.z
    public final void j(a0 a0Var) {
        z zVar = this.f40374c;
        zVar.getClass();
        zVar.j(this);
    }

    @Override // f2.a0
    public final void maybeThrowPrepareError() {
        this.f40372a.maybeThrowPrepareError();
    }

    @Override // f2.a0
    public final long readDiscontinuity() {
        long discontinuity = this.f40372a.readDiscontinuity();
        return discontinuity == C.TIME_UNSET ? C.TIME_UNSET : discontinuity + this.f40373b;
    }

    @Override // f2.e1
    public final void reevaluateBuffer(long j10) {
        this.f40372a.reevaluateBuffer(j10 - this.f40373b);
    }

    @Override // f2.a0
    public final long seekToUs(long j10) {
        long j11 = this.f40373b;
        return this.f40372a.seekToUs(j10 - j11) + j11;
    }
}
