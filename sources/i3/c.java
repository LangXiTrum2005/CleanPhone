package i3;

import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.g7;
import com.google.android.gms.internal.ads.h7;
import com.google.android.gms.internal.ads.k7;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import ea.b0;
import eb.d0;
import i1.e0;
import i1.p;
import java.util.Arrays;
import l1.q;
import l1.y;
import n2.a0;
import n2.k;
import n2.l;
import n2.m;
import n2.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f42845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k7 f42846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42847c;

    @Override // n2.k
    public final boolean a(l lVar) {
        try {
            return e(lVar);
        } catch (e0 unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0195 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0196  */
    @Override // n2.k
    public final int b(l lVar, q2 q2Var) throws e0 {
        byte[] bArr;
        this.f42845a.getClass();
        if (this.f42846b == null) {
            if (!e(lVar)) {
                throw e0.a(null, "Failed to determine bitstream type");
            }
            lVar.resetPeekPosition();
        }
        if (!this.f42847c) {
            a0 a0VarTrack = this.f42845a.track(0, 1);
            this.f42845a.endTracks();
            k7 k7Var = this.f42846b;
            k7Var.f16357k = this.f42845a;
            k7Var.f16356j = a0VarTrack;
            k7Var.d(true);
            this.f42847c = true;
        }
        k7 k7Var2 = this.f42846b;
        g7 g7Var = (g7) k7Var2.f16355i;
        ((a0) k7Var2.f16356j).getClass();
        String str = y.f44830a;
        int i10 = k7Var2.f16350d;
        if (i10 != 0) {
            if (i10 == 1) {
                lVar.skipFully((int) k7Var2.f16348b);
                k7Var2.f16350d = 2;
                return 0;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long jA = ((d) k7Var2.l).a(lVar);
            if (jA >= 0) {
                q2Var.f18888a = jA;
                return 1;
            }
            if (jA < -1) {
                k7Var2.a(-(jA + 2));
            }
            if (!k7Var2.f16353g) {
                t tVarCreateSeekMap = ((d) k7Var2.l).createSeekMap();
                tVarCreateSeekMap.getClass();
                ((m) k7Var2.f16357k).u(tVarCreateSeekMap);
                ((a0) k7Var2.f16356j).e(tVarCreateSeekMap.getDurationUs());
                k7Var2.f16353g = true;
            }
            if (k7Var2.f16352f <= 0 && !g7Var.b(lVar)) {
                k7Var2.f16350d = 3;
                return -1;
            }
            k7Var2.f16352f = 0L;
            q qVar = (q) g7Var.f14781e;
            long jB = k7Var2.b(qVar);
            if (jB >= 0) {
                long j10 = k7Var2.f16349c;
                if (j10 + jB >= k7Var2.f16347a) {
                    long j11 = (j10 * 1000000) / ((long) k7Var2.f16351e);
                    ((a0) k7Var2.f16356j).g(qVar.f44815c, qVar);
                    ((a0) k7Var2.f16356j).a(j11, 1, qVar.f44815c, 0, null);
                    k7Var2.f16347a = -1L;
                }
            }
            k7Var2.f16349c += jB;
            return 0;
        }
        while (true) {
            boolean zB = g7Var.b(lVar);
            q qVar2 = (q) g7Var.f14781e;
            if (!zB) {
                k7Var2.f16350d = 3;
                return -1;
            }
            long position = lVar.getPosition();
            long j12 = k7Var2.f16348b;
            k7Var2.f16352f = position - j12;
            if (!k7Var2.c(qVar2, j12, (d0) k7Var2.f16358m)) {
                p pVar = (p) ((d0) k7Var2.f16358m).f39976b;
                k7Var2.f16351e = pVar.G;
                if (!k7Var2.f16354h) {
                    ((a0) k7Var2.f16356j).b(pVar);
                    k7Var2.f16354h = true;
                }
                c7 c7Var = (c7) ((d0) k7Var2.f16358m).f39977c;
                if (c7Var == null) {
                    if (lVar.getLength() == -1) {
                        k7Var2.l = new b0(26);
                    } else {
                        h7 h7Var = (h7) g7Var.f14780d;
                        k7Var2.l = new b7(k7Var2, k7Var2.f16348b, lVar.getLength(), h7Var.f15190d + h7Var.f15191e, h7Var.f15188b, (h7Var.f15187a & 4) != 0, false);
                    }
                    k7Var2.f16350d = 2;
                    bArr = qVar2.f44813a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    qVar2.K(Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, qVar2.f44815c)), qVar2.f44815c);
                    return 0;
                }
                k7Var2.l = c7Var;
                k7Var2.f16350d = 2;
                bArr = qVar2.f44813a;
                if (bArr.length == 65025) {
                    return 0;
                }
                qVar2.K(Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, qVar2.f44815c)), qVar2.f44815c);
                return 0;
            }
            k7Var2.f16348b = lVar.getPosition();
        }
    }

    @Override // n2.k
    public final void c(m mVar) {
        this.f42845a = mVar;
    }

    public final boolean e(l lVar) {
        boolean zB;
        h7 h7Var = new h7(1);
        if (h7Var.a(lVar, true) && (h7Var.f15187a & 2) == 2) {
            int iMin = Math.min(h7Var.f15191e, 8);
            q qVar = new q(iMin);
            lVar.peekFully(qVar.f44813a, 0, iMin);
            qVar.M(0);
            if (qVar.a() >= 5 && qVar.z() == 127 && qVar.B() == 1179402563) {
                this.f42846b = new b(1);
                return true;
            }
            qVar.M(0);
            try {
                zB = n2.b.B(1, qVar, true);
            } catch (e0 unused) {
                zB = false;
            }
            if (zB) {
                this.f42846b = new g(1);
            } else {
                qVar.M(0);
                if (e.i(qVar, e.f42848o)) {
                    this.f42846b = new e(1);
                }
            }
            return true;
        }
        return false;
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        k7 k7Var = this.f42846b;
        if (k7Var != null) {
            g7 g7Var = (g7) k7Var.f16355i;
            h7 h7Var = (h7) g7Var.f14780d;
            h7Var.f15187a = 0;
            h7Var.f15188b = 0L;
            h7Var.f15189c = 0;
            h7Var.f15190d = 0;
            h7Var.f15191e = 0;
            ((q) g7Var.f14781e).J(0);
            g7Var.f14777a = -1;
            g7Var.f14779c = false;
            if (j10 == 0) {
                k7Var.d(!k7Var.f16353g);
                return;
            }
            if (k7Var.f16350d != 0) {
                long j12 = (((long) k7Var.f16351e) * j11) / 1000000;
                k7Var.f16347a = j12;
                d dVar = (d) k7Var.l;
                String str = y.f44830a;
                dVar.startSeek(j12);
                k7Var.f16350d = 2;
            }
        }
    }

    @Override // n2.k
    public final void release() {
    }
}
