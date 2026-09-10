package s1;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2.e f50031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.m f50032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1.b f50033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f50034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f50035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f50036f;

    public h(long j10, t1.m mVar, t1.b bVar, g2.e eVar, long j11, g gVar) {
        this.f50035e = j10;
        this.f50032b = mVar;
        this.f50033c = bVar;
        this.f50036f = j11;
        this.f50031a = eVar;
        this.f50034d = gVar;
    }

    public final h a(long j10, t1.m mVar) throws f2.b {
        long jK;
        long jK2;
        g gVarB = this.f50032b.b();
        g gVarB2 = mVar.b();
        if (gVarB == null) {
            return new h(j10, mVar, this.f50033c, this.f50031a, this.f50036f, gVarB);
        }
        if (!gVarB.z()) {
            return new h(j10, mVar, this.f50033c, this.f50031a, this.f50036f, gVarB2);
        }
        long jQ = gVarB.q(j10);
        if (jQ == 0) {
            return new h(j10, mVar, this.f50033c, this.f50031a, this.f50036f, gVarB2);
        }
        gVarB2.getClass();
        long jA = gVarB.A();
        long timeUs = gVarB.getTimeUs(jA);
        long j11 = jQ + jA;
        long j12 = j11 - 1;
        long jD = gVarB.d(j12, j10) + gVarB.getTimeUs(j12);
        long jA2 = gVarB2.A();
        long timeUs2 = gVarB2.getTimeUs(jA2);
        long j13 = this.f50036f;
        if (jD != timeUs2) {
            if (jD < timeUs2) {
                throw new f2.b();
            }
            if (timeUs2 < timeUs) {
                jK2 = j13 - (gVarB2.k(timeUs, j10) - jA);
            } else {
                jK = gVarB.k(timeUs2, j10) - jA2;
            }
            return new h(j10, mVar, this.f50033c, this.f50031a, jK2, gVarB2);
        }
        jK = j11 - jA2;
        jK2 = jK + j13;
        return new h(j10, mVar, this.f50033c, this.f50031a, jK2, gVarB2);
    }

    public final long b(long j10) {
        g gVar = this.f50034d;
        gVar.getClass();
        long j11 = this.f50035e;
        long jG = gVar.g(j11, j10) + this.f50036f;
        gVar.getClass();
        return (gVar.B(j11, j10) + jG) - 1;
    }

    public final long c() {
        g gVar = this.f50034d;
        gVar.getClass();
        return gVar.q(this.f50035e);
    }

    public final long d(long j10) {
        long jE = e(j10);
        g gVar = this.f50034d;
        gVar.getClass();
        return gVar.d(j10 - this.f50036f, this.f50035e) + jE;
    }

    public final long e(long j10) {
        g gVar = this.f50034d;
        gVar.getClass();
        return gVar.getTimeUs(j10 - this.f50036f);
    }

    public final boolean f(long j10, long j11) {
        g gVar = this.f50034d;
        gVar.getClass();
        return gVar.z() || j11 == C.TIME_UNSET || d(j10) <= j11;
    }
}
