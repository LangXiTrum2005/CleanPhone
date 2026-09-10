package u3;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements n2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f51692a = new b(0, 1, null, "audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.q f51693b = new l1.q(Http2.INITIAL_MAX_FRAME_SIZE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f51694c;

    @Override // n2.k
    public final boolean a(n2.l lVar) {
        n2.h hVar;
        int i10;
        l1.q qVar = new l1.q(10);
        int i11 = 0;
        while (true) {
            hVar = (n2.h) lVar;
            hVar.peekFully(qVar.f44813a, 0, 10, false);
            qVar.M(0);
            if (qVar.C() != 4801587) {
                break;
            }
            qVar.N(3);
            int iY = qVar.y();
            i11 += iY + 10;
            hVar.b(iY, false);
        }
        hVar.f46468f = 0;
        hVar.b(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            hVar.peekFully(qVar.f44813a, 0, 7, false);
            qVar.M(0);
            int iG = qVar.G();
            if (iG == 44096 || iG == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = qVar.f44813a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iG == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    break;
                }
                hVar.b(i10 - 7, false);
            } else {
                hVar.f46468f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    break;
                }
                hVar.b(i13, false);
                i12 = 0;
            }
        }
        return false;
    }

    @Override // n2.k
    public final int b(n2.l lVar, q2 q2Var) {
        l1.q qVar = this.f51693b;
        int i10 = lVar.read(qVar.f44813a, 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (i10 == -1) {
            return -1;
        }
        qVar.M(0);
        qVar.L(i10);
        boolean z10 = this.f51694c;
        b bVar = this.f51692a;
        if (!z10) {
            bVar.f51691o = 0L;
            this.f51694c = true;
        }
        bVar.b(qVar);
        return 0;
    }

    @Override // n2.k
    public final void c(n2.m mVar) {
        this.f51692a.g(mVar, new ga(0, 1));
        mVar.endTracks();
        mVar.u(new n2.o(C.TIME_UNSET));
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        this.f51694c = false;
        this.f51692a.seek();
    }

    @Override // n2.k
    public final void release() {
    }
}
