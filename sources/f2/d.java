package f2;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a0, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f40312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f40313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c[] f40314c = new c[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f40315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f40317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f40319h;

    public d(a0 a0Var, boolean z10, long j10, long j11) {
        this.f40312a = a0Var;
        this.f40315d = z10 ? j10 : -9223372036854775807L;
        this.f40316e = C.TIME_UNSET;
        this.f40317f = j10;
        this.f40318g = j11;
    }

    @Override // f2.a0
    public final long a(long j10, p1.e1 e1Var) {
        long j11 = this.f40317f;
        if (j10 == j11) {
            return j11;
        }
        long jK = l1.y.k(e1Var.f48007a, 0L, j10 - j11);
        long j12 = e1Var.f48008b;
        long j13 = this.f40318g;
        long jK2 = l1.y.k(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10);
        if (jK != e1Var.f48007a || jK2 != e1Var.f48008b) {
            e1Var = new p1.e1(jK, jK2);
        }
        return this.f40312a.a(j10, e1Var);
    }

    public final boolean b() {
        return this.f40315d != C.TIME_UNSET;
    }

    @Override // f2.a0
    public final long c(i2.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        long j11;
        this.f40314c = new c[c1VarArr.length];
        c1[] c1VarArr2 = new c1[c1VarArr.length];
        for (int i10 = 0; i10 < c1VarArr.length; i10++) {
            c[] cVarArr = this.f40314c;
            c cVar = (c) c1VarArr[i10];
            cVarArr[i10] = cVar;
            c1VarArr2[i10] = cVar != null ? cVar.f40304a : null;
        }
        long jC = this.f40312a.c(rVarArr, zArr, c1VarArr2, zArr2, j10);
        long j12 = this.f40318g;
        long jMax = Math.max(jC, j10);
        if (j12 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j12);
        }
        if (b()) {
            if (jC >= j10) {
                if (jC != 0) {
                    int length = rVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            i2.r rVar = rVarArr[i11];
                            if (rVar != null) {
                                i1.p selectedFormat = rVar.getSelectedFormat();
                                if (!i1.d0.a(selectedFormat.f42643n, selectedFormat.f42641k)) {
                                }
                            }
                            i11++;
                        }
                    }
                }
                j11 = C.TIME_UNSET;
            }
            j11 = jMax;
        } else {
            j11 = C.TIME_UNSET;
        }
        this.f40315d = j11;
        for (int i12 = 0; i12 < c1VarArr.length; i12++) {
            c1 c1Var = c1VarArr2[i12];
            if (c1Var == null) {
                this.f40314c[i12] = null;
            } else {
                c[] cVarArr2 = this.f40314c;
                c cVar2 = cVarArr2[i12];
                if (cVar2 == null || cVar2.f40304a != c1Var) {
                    cVarArr2[i12] = new c(this, c1Var);
                }
            }
            c1VarArr[i12] = this.f40314c[i12];
        }
        return jMax;
    }

    @Override // f2.a0
    public final void e(z zVar, long j10) {
        this.f40313b = zVar;
        this.f40312a.e(this, j10);
    }

    @Override // f2.e1
    public final boolean f(p1.k0 k0Var) {
        return this.f40312a.f(k0Var);
    }

    @Override // f2.a0
    public final void g(long j10) {
        this.f40312a.g(j10);
    }

    @Override // f2.e1
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f40312a.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f40318g;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // f2.e1
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f40312a.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f40318g;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // f2.a0
    public final k1 getTrackGroups() {
        return this.f40312a.getTrackGroups();
    }

    @Override // f2.d1
    public final void h(e1 e1Var) {
        z zVar = this.f40313b;
        zVar.getClass();
        zVar.h(this);
    }

    @Override // f2.e1
    public final boolean isLoading() {
        return this.f40312a.isLoading();
    }

    @Override // f2.z
    public final void j(a0 a0Var) {
        if (this.f40319h != null) {
            return;
        }
        z zVar = this.f40313b;
        zVar.getClass();
        zVar.j(this);
    }

    @Override // f2.a0
    public final void maybeThrowPrepareError() throws g {
        g gVar = this.f40319h;
        if (gVar != null) {
            throw gVar;
        }
        this.f40312a.maybeThrowPrepareError();
    }

    @Override // f2.a0
    public final long readDiscontinuity() {
        if (b()) {
            long j10 = this.f40315d;
            this.f40315d = C.TIME_UNSET;
            this.f40316e = j10;
            long discontinuity = readDiscontinuity();
            return discontinuity != C.TIME_UNSET ? discontinuity : j10;
        }
        long discontinuity2 = this.f40312a.readDiscontinuity();
        if (discontinuity2 != C.TIME_UNSET) {
            long j11 = this.f40317f;
            long j12 = this.f40318g;
            long jMax = Math.max(discontinuity2, j11);
            if (j12 != Long.MIN_VALUE) {
                jMax = Math.min(jMax, j12);
            }
            if (jMax != this.f40316e) {
                this.f40316e = jMax;
                return jMax;
            }
        }
        return C.TIME_UNSET;
    }

    @Override // f2.e1
    public final void reevaluateBuffer(long j10) {
        this.f40312a.reevaluateBuffer(j10);
    }

    @Override // f2.a0
    public final long seekToUs(long j10) {
        this.f40315d = C.TIME_UNSET;
        for (c cVar : this.f40314c) {
            if (cVar != null) {
                cVar.f40305b = false;
            }
        }
        long jSeekToUs = this.f40312a.seekToUs(j10);
        long j11 = this.f40317f;
        long j12 = this.f40318g;
        long jMax = Math.max(jSeekToUs, j11);
        return j12 != Long.MIN_VALUE ? Math.min(jMax, j12) : jMax;
    }
}
