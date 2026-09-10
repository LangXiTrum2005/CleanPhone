package k3;

import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.d0;
import i1.e0;
import i1.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import l1.q;
import l1.y;
import n2.a0;
import n2.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements n2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f44281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f44282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f44283c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a0 f44286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f44289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f44290j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f44285e = y.f44831b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f44284d = new q();

    public h(m mVar, p pVar) {
        p pVar2;
        this.f44281a = mVar;
        if (pVar != null) {
            i1.o oVarA = pVar.a();
            oVarA.f42600m = d0.n("application/x-media3-cues");
            oVarA.f42598j = pVar.f42643n;
            oVarA.K = mVar.i();
            pVar2 = new p(oVarA);
        } else {
            pVar2 = null;
        }
        this.f44282b = pVar2;
        this.f44283c = new ArrayList();
        this.f44288h = 0;
        this.f44289i = y.f44832c;
        this.f44290j = C.TIME_UNSET;
    }

    @Override // n2.k
    public final boolean a(n2.l lVar) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: RuntimeException -> 0x00ce, TryCatch #0 {RuntimeException -> 0x00ce, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:42:0x00c7, B:37:0x008c), top: B:67:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008c A[Catch: RuntimeException -> 0x00ce, TryCatch #0 {RuntimeException -> 0x00ce, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:42:0x00c7, B:37:0x008c), top: B:67:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[Catch: RuntimeException -> 0x00ce, LOOP:1: B:39:0x00b2->B:41:0x00b8, LOOP_END, TryCatch #0 {RuntimeException -> 0x00ce, blocks: (B:33:0x007e, B:35:0x0084, B:38:0x008f, B:39:0x00b2, B:41:0x00b8, B:42:0x00c7, B:37:0x008c), top: B:67:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:67:0x007e A[EXC_TOP_SPLITTER, PHI: r22
  0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // n2.k
    public final int b(n2.l lVar, q2 q2Var) throws e0 {
        int i10;
        long j10;
        l lVar2;
        int i11;
        int i12 = this.f44288h;
        go.k.t((i12 == 0 || i12 == 5) ? false : true);
        if (this.f44288h == 1) {
            int iC = lVar.getLength() != -1 ? com.bumptech.glide.c.c(lVar.getLength()) : 1024;
            if (iC > this.f44285e.length) {
                this.f44285e = new byte[iC];
            }
            this.f44287g = 0;
            this.f44288h = 2;
        }
        int i13 = this.f44288h;
        ArrayList arrayList = this.f44283c;
        if (i13 == 2) {
            byte[] bArr = this.f44285e;
            if (bArr.length == this.f44287g) {
                this.f44285e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f44285e;
            int i14 = this.f44287g;
            int i15 = lVar.read(bArr2, i14, bArr2.length - i14);
            if (i15 != -1) {
                this.f44287g += i15;
            }
            long length = lVar.getLength();
            if (length != -1) {
                i10 = 0;
                if (this.f44287g == length) {
                    try {
                        j10 = this.f44290j;
                        if (j10 != C.TIME_UNSET) {
                            lVar2 = new l(j10, true);
                        } else {
                            lVar2 = l.f44295c;
                        }
                        this.f44281a.e(this.f44285e, 0, this.f44287g, lVar2, new a4.a(this, 29));
                        Collections.sort(arrayList);
                        this.f44289i = new long[arrayList.size()];
                        for (i11 = i10; i11 < arrayList.size(); i11++) {
                            this.f44289i[i11] = ((g) arrayList.get(i11)).f44279a;
                        }
                        this.f44285e = y.f44831b;
                        this.f44288h = 4;
                    } catch (RuntimeException e10) {
                        throw e0.a(e10, "SubtitleParser failed.");
                    }
                }
            } else {
                i10 = 0;
            }
            if (i15 == -1) {
                j10 = this.f44290j;
                if (j10 != C.TIME_UNSET) {
                    lVar2 = new l(j10, true);
                } else {
                    lVar2 = l.f44295c;
                }
                this.f44281a.e(this.f44285e, 0, this.f44287g, lVar2, new a4.a(this, 29));
                Collections.sort(arrayList);
                this.f44289i = new long[arrayList.size()];
                while (i11 < arrayList.size()) {
                    this.f44289i[i11] = ((g) arrayList.get(i11)).f44279a;
                }
                this.f44285e = y.f44831b;
                this.f44288h = 4;
            }
        } else {
            i10 = 0;
        }
        if (this.f44288h == 3) {
            if (lVar.skip(lVar.getLength() != -1 ? com.bumptech.glide.c.c(lVar.getLength()) : 1024) == -1) {
                long j11 = this.f44290j;
                for (int iF = j11 == C.TIME_UNSET ? i10 : y.f(this.f44289i, j11, true); iF < arrayList.size(); iF++) {
                    e((g) arrayList.get(iF));
                }
                this.f44288h = 4;
            }
        }
        if (this.f44288h == 4) {
            return -1;
        }
        return i10;
    }

    @Override // n2.k
    public final void c(n2.m mVar) {
        go.k.t(this.f44288h == 0);
        a0 a0VarTrack = mVar.track(0, 3);
        this.f44286f = a0VarTrack;
        p pVar = this.f44282b;
        if (pVar != null) {
            a0VarTrack.b(pVar);
            mVar.endTracks();
            mVar.u(new r(new long[]{0}, new long[]{0}, C.TIME_UNSET));
        }
        this.f44288h = 1;
    }

    public final void e(g gVar) {
        this.f44286f.getClass();
        byte[] bArr = gVar.f44280b;
        int length = bArr.length;
        q qVar = this.f44284d;
        qVar.getClass();
        qVar.K(bArr, bArr.length);
        this.f44286f.g(length, qVar);
        this.f44286f.a(gVar.f44279a, 1, length, 0, null);
    }

    @Override // n2.k
    public final void release() {
        if (this.f44288h == 5) {
            return;
        }
        this.f44281a.reset();
        this.f44288h = 5;
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        int i10 = this.f44288h;
        go.k.t((i10 == 0 || i10 == 5) ? false : true);
        this.f44290j = j11;
        if (this.f44288h == 2) {
            this.f44288h = 1;
        }
        if (this.f44288h == 4) {
            this.f44288h = 3;
        }
    }
}
