package u3;

import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements n2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f51675a = new b(MimeTypes.AUDIO_AC3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.q f51676b = new l1.q(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f51677c;

    @Override // n2.k
    public final boolean a(n2.l lVar) {
        n2.h hVar;
        int iH;
        l1.q qVar = new l1.q(10);
        int i10 = 0;
        while (true) {
            hVar = (n2.h) lVar;
            hVar.peekFully(qVar.f44813a, 0, 10, false);
            qVar.M(0);
            if (qVar.C() != 4801587) {
                break;
            }
            qVar.N(3);
            int iY = qVar.y();
            i10 += iY + 10;
            hVar.b(iY, false);
        }
        hVar.f46468f = 0;
        hVar.b(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            hVar.peekFully(qVar.f44813a, 0, 6, false);
            qVar.M(0);
            if (qVar.G() != 2935) {
                hVar.f46468f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    break;
                }
                hVar.b(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = qVar.f44813a;
                if (bArr.length < 6) {
                    iH = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iH = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b10 = bArr[4];
                    iH = n2.b.h((b10 & 192) >> 6, b10 & Utf8.REPLACEMENT_BYTE);
                }
                if (iH == -1) {
                    break;
                }
                hVar.b(iH - 6, false);
            }
        }
        return false;
    }

    @Override // n2.k
    public final int b(n2.l lVar, q2 q2Var) {
        l1.q qVar = this.f51676b;
        int i10 = lVar.read(qVar.f44813a, 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        qVar.M(0);
        qVar.L(i10);
        boolean z10 = this.f51677c;
        b bVar = this.f51675a;
        if (!z10) {
            bVar.f51691o = 0L;
            this.f51677c = true;
        }
        bVar.b(qVar);
        return 0;
    }

    @Override // n2.k
    public final void c(n2.m mVar) {
        this.f51675a.g(mVar, new ga(0, 1));
        mVar.endTracks();
        mVar.u(new n2.o(C.TIME_UNSET));
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        this.f51677c = false;
        this.f51675a.seek();
    }

    @Override // n2.k
    public final void release() {
    }
}
