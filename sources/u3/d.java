package u3;

import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.e0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n2.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.q f51697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xd1 f51698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n2.m f51699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f51700f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f51702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f51703i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f51695a = new e(null, 0, MimeTypes.AUDIO_AAC, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.q f51696b = new l1.q(com.ironsource.mediationsdk.metadata.a.f29616n);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f51701g = -1;

    public d(int i10) {
        l1.q qVar = new l1.q(10);
        this.f51697c = qVar;
        byte[] bArr = qVar.f44813a;
        this.f51698d = new xd1(bArr, bArr.length);
    }

    @Override // n2.k
    public final boolean a(n2.l lVar) {
        int i10 = 0;
        while (true) {
            l1.q qVar = this.f51697c;
            lVar.peekFully(qVar.f44813a, 0, 10);
            qVar.M(0);
            if (qVar.C() != 4801587) {
                break;
            }
            qVar.N(3);
            int iY = qVar.y();
            i10 += iY + 10;
            lVar.advancePeekPosition(iY);
        }
        lVar.resetPeekPosition();
        lVar.advancePeekPosition(i10);
        if (this.f51701g == -1) {
            this.f51701g = i10;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        do {
            l1.q qVar2 = this.f51697c;
            n2.h hVar = (n2.h) lVar;
            hVar.peekFully(qVar2.f44813a, 0, 2, false);
            qVar2.M(0);
            if ((qVar2.G() & 65526) == 65520) {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                hVar.peekFully(qVar2.f44813a, 0, 4, false);
                xd1 xd1Var = this.f51698d;
                xd1Var.q(14);
                int i14 = xd1Var.i(13);
                if (i14 <= 6) {
                    i11++;
                    hVar.f46468f = 0;
                    hVar.b(i11, false);
                } else {
                    hVar.b(i14 - 6, false);
                    i13 += i14;
                }
            } else {
                i11++;
                hVar.f46468f = 0;
                hVar.b(i11, false);
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - i10 < 8192);
        return false;
    }

    @Override // n2.k
    public final int b(n2.l lVar, q2 q2Var) throws e0 {
        this.f51699e.getClass();
        lVar.getLength();
        l1.q qVar = this.f51696b;
        int i10 = lVar.read(qVar.f44813a, 0, com.ironsource.mediationsdk.metadata.a.f29616n);
        boolean z10 = i10 == -1;
        if (!this.f51703i) {
            this.f51699e.u(new n2.o(C.TIME_UNSET));
            this.f51703i = true;
        }
        if (z10) {
            return -1;
        }
        qVar.M(0);
        qVar.L(i10);
        boolean z11 = this.f51702h;
        e eVar = this.f51695a;
        if (!z11) {
            eVar.f51724u = this.f51700f;
            this.f51702h = true;
        }
        eVar.b(qVar);
        return 0;
    }

    @Override // n2.k
    public final void c(n2.m mVar) {
        this.f51699e = mVar;
        this.f51695a.g(mVar, new ga(0, 1));
        mVar.endTracks();
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        this.f51702h = false;
        this.f51695a.seek();
        this.f51700f = j11;
    }

    @Override // n2.k
    public final void release() {
    }
}
