package u3;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.b2;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import l1.x;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements n2.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f51844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f51846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f51847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s2.b f51848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n2.m f51849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f51850k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f51840a = new x(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.q f51842c = new l1.q(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f51841b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f51843d = new o(0);

    @Override // n2.k
    public final boolean a(n2.l lVar) {
        byte[] bArr = new byte[14];
        n2.h hVar = (n2.h) lVar;
        hVar.peekFully(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            hVar.b(bArr[13] & 7, false);
            hVar.peekFully(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // n2.k
    public final int b(n2.l lVar, q2 q2Var) {
        f hVar;
        long jC;
        long j10;
        this.f51849j.getClass();
        long length = lVar.getLength();
        o oVar = this.f51843d;
        if (length != -1 && !oVar.f51827d) {
            x xVar = oVar.f51825b;
            l1.q qVar = oVar.f51826c;
            if (!oVar.f51829f) {
                long length2 = lVar.getLength();
                int iMin = (int) Math.min(20000L, length2);
                long j11 = length2 - ((long) iMin);
                if (lVar.getPosition() != j11) {
                    q2Var.f18888a = j11;
                    return 1;
                }
                qVar.J(iMin);
                lVar.resetPeekPosition();
                lVar.peekFully(qVar.f44813a, 0, iMin);
                int i10 = qVar.f44814b;
                for (int i11 = qVar.f44815c - 4; i11 >= i10; i11--) {
                    if (o.b(i11, qVar.f44813a) == 442) {
                        qVar.M(i11 + 4);
                        long jC2 = o.c(qVar);
                        if (jC2 != C.TIME_UNSET) {
                            j10 = jC2;
                            oVar.f51831h = j10;
                            oVar.f51829f = true;
                            return 0;
                        }
                    }
                }
                j10 = -9223372036854775807L;
                oVar.f51831h = j10;
                oVar.f51829f = true;
                return 0;
            }
            if (oVar.f51831h == C.TIME_UNSET) {
                oVar.a(lVar);
                return 0;
            }
            if (oVar.f51828e) {
                long j12 = oVar.f51830g;
                if (j12 == C.TIME_UNSET) {
                    oVar.a(lVar);
                    return 0;
                }
                oVar.f51832i = xVar.c(oVar.f51831h) - xVar.b(j12);
                oVar.a(lVar);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, lVar.getLength());
            long j13 = 0;
            if (lVar.getPosition() != j13) {
                q2Var.f18888a = j13;
                return 1;
            }
            qVar.J(iMin2);
            lVar.resetPeekPosition();
            lVar.peekFully(qVar.f44813a, 0, iMin2);
            int i12 = qVar.f44815c;
            for (int i13 = qVar.f44814b; i13 < i12 - 3; i13++) {
                if (o.b(i13, qVar.f44813a) == 442) {
                    qVar.M(i13 + 4);
                    jC = o.c(qVar);
                    if (jC != C.TIME_UNSET) {
                        oVar.f51830g = jC;
                        oVar.f51828e = true;
                        return 0;
                    }
                }
            }
            jC = -9223372036854775807L;
            oVar.f51830g = jC;
            oVar.f51828e = true;
            return 0;
        }
        if (!this.f51850k) {
            this.f51850k = true;
            long j14 = oVar.f51832i;
            if (j14 != C.TIME_UNSET) {
                s2.b bVar = new s2.b(new j2.n(25), new s1(oVar.f51825b), j14, j14 + 1, 0L, length, 188L, 1000);
                this.f51848i = bVar;
                this.f51849j.u((n2.c) bVar.f14172b);
            } else {
                this.f51849j.u(new n2.o(j14));
            }
        }
        s2.b bVar2 = this.f51848i;
        if (bVar2 != null && ((b2) bVar2.f14174d) != null) {
            return bVar2.a(lVar, q2Var);
        }
        lVar.resetPeekPosition();
        long peekPosition = length != -1 ? length - lVar.getPeekPosition() : -1L;
        if (peekPosition != -1 && peekPosition < 4) {
            return -1;
        }
        l1.q qVar2 = this.f51842c;
        if (!lVar.peekFully(qVar2.f44813a, 0, 4, true)) {
            return -1;
        }
        qVar2.M(0);
        int iM = qVar2.m();
        if (iM == 441) {
            return -1;
        }
        if (iM == 442) {
            lVar.peekFully(qVar2.f44813a, 0, 10);
            qVar2.M(9);
            lVar.skipFully((qVar2.z() & 7) + 14);
            return 0;
        }
        if (iM == 443) {
            lVar.peekFully(qVar2.f44813a, 0, 2);
            qVar2.M(0);
            lVar.skipFully(qVar2.G() + 6);
            return 0;
        }
        if (((iM & (-256)) >> 8) != 1) {
            lVar.skipFully(1);
            return 0;
        }
        int i14 = iM & 255;
        SparseArray sparseArray = this.f51841b;
        p pVar = (p) sparseArray.get(i14);
        if (!this.f51844e) {
            if (pVar == null) {
                if (i14 == 189) {
                    hVar = new b("video/mp2p");
                    this.f51845f = true;
                    this.f51847h = lVar.getPosition();
                } else if ((iM & 224) == 192) {
                    hVar = new u9(0, 1, null, "video/mp2p");
                    this.f51845f = true;
                    this.f51847h = lVar.getPosition();
                } else if ((iM & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    hVar = new h(null, "video/mp2p");
                    this.f51846g = true;
                    this.f51847h = lVar.getPosition();
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    hVar.g(this.f51849j, new ga(i14, NotificationCompat.FLAG_LOCAL_ONLY));
                    pVar = new p(hVar, this.f51840a);
                    sparseArray.put(i14, pVar);
                }
            }
            if (lVar.getPosition() > ((this.f51845f && this.f51846g) ? this.f51847h + 8192 : 1048576L)) {
                this.f51844e = true;
                this.f51849j.endTracks();
            }
        }
        lVar.peekFully(qVar2.f44813a, 0, 2);
        qVar2.M(0);
        int iG = qVar2.G() + 6;
        if (pVar == null) {
            lVar.skipFully(iG);
            return 0;
        }
        qVar2.J(iG);
        lVar.readFully(qVar2.f44813a, 0, iG);
        qVar2.M(6);
        f fVar = pVar.f51833a;
        xd1 xd1Var = pVar.f51835c;
        qVar2.k(xd1Var.f21843b, 0, 3);
        xd1Var.q(0);
        xd1Var.t(8);
        pVar.f51836d = xd1Var.h();
        pVar.f51837e = xd1Var.h();
        xd1Var.t(6);
        qVar2.k(xd1Var.f21843b, 0, xd1Var.i(8));
        xd1Var.q(0);
        x xVar2 = pVar.f51834b;
        pVar.f51839g = 0L;
        if (pVar.f51836d) {
            xd1Var.t(4);
            long jI = ((long) xd1Var.i(3)) << 30;
            xd1Var.t(1);
            long jI2 = jI | ((long) (xd1Var.i(15) << 15));
            xd1Var.t(1);
            long jI3 = jI2 | ((long) xd1Var.i(15));
            xd1Var.t(1);
            if (!pVar.f51838f && pVar.f51837e) {
                xd1Var.t(4);
                long jI4 = ((long) xd1Var.i(3)) << 30;
                xd1Var.t(1);
                long jI5 = jI4 | ((long) (xd1Var.i(15) << 15));
                xd1Var.t(1);
                long jI6 = jI5 | ((long) xd1Var.i(15));
                xd1Var.t(1);
                xVar2.b(jI6);
                pVar.f51838f = true;
            }
            pVar.f51839g = xVar2.b(jI3);
        }
        fVar.h(4, pVar.f51839g);
        fVar.b(qVar2);
        fVar.d(false);
        qVar2.L(qVar2.f44813a.length);
        return 0;
    }

    @Override // n2.k
    public final void c(n2.m mVar) {
        this.f51849j = mVar;
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        long j12;
        SparseArray sparseArray = this.f51841b;
        x xVar = this.f51840a;
        synchronized (xVar) {
            j12 = xVar.f44827b;
        }
        boolean z10 = j12 == C.TIME_UNSET;
        if (!z10) {
            long jD = xVar.d();
            z10 = (jD == C.TIME_UNSET || jD == 0 || jD == j11) ? false : true;
        }
        if (z10) {
            xVar.f(j11);
        }
        s2.b bVar = this.f51848i;
        if (bVar != null) {
            bVar.c(j11);
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            p pVar = (p) sparseArray.valueAt(i10);
            pVar.f51838f = false;
            pVar.f51833a.seek();
        }
    }

    @Override // n2.k
    public final void release() {
    }
}
