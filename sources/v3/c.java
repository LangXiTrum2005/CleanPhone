package v3;

import android.util.Pair;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.ta1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.e0;
import java.nio.ByteOrder;
import java.util.Arrays;
import l1.q;
import l1.y;
import n2.a0;
import n2.k;
import n2.l;
import n2.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f52466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a0 f52467b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f52470e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52468c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f52469d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52471f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f52472g = -1;

    @Override // n2.k
    public final boolean a(l lVar) {
        return d.a(lVar);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0228  */
    @Override // n2.k
    public final int b(l lVar, q2 q2Var) throws e0 {
        byte[] bArr;
        int i10;
        this.f52467b.getClass();
        String str = y.f44830a;
        int i11 = this.f52468c;
        int iC = 4;
        if (i11 == 0) {
            go.k.t(lVar.getPosition() == 0);
            int i12 = this.f52471f;
            if (i12 != -1) {
                lVar.skipFully(i12);
                this.f52468c = 4;
                return 0;
            }
            if (!d.a(lVar)) {
                throw e0.a(null, "Unsupported or unrecognized wav file type.");
            }
            lVar.skipFully((int) (lVar.getPeekPosition() - lVar.getPosition()));
            this.f52468c = 1;
            return 0;
        }
        long jP = -1;
        if (i11 == 1) {
            q qVar = new q(8);
            com.google.android.gms.internal.ads.a0 a0VarB = com.google.android.gms.internal.ads.a0.b(lVar, qVar);
            if (a0VarB.f11791a != 1685272116) {
                lVar.resetPeekPosition();
            } else {
                lVar.advancePeekPosition(8);
                qVar.M(0);
                lVar.peekFully(qVar.f44813a, 0, 8);
                jP = qVar.p();
                lVar.skipFully(((int) a0VarB.f11792b) + 8);
            }
            this.f52469d = jP;
            this.f52468c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                go.k.t(this.f52472g != -1);
                long position = this.f52472g - lVar.getPosition();
                b bVar = this.f52470e;
                bVar.getClass();
                return bVar.d(lVar, position) ? -1 : 0;
            }
            lVar.resetPeekPosition();
            com.google.android.gms.internal.ads.a0 a0VarB2 = d.b(1684108385, lVar, new q(8));
            lVar.skipFully(8);
            Pair pairCreate = Pair.create(Long.valueOf(lVar.getPosition()), Long.valueOf(a0VarB2.f11792b));
            this.f52471f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j10 = this.f52469d;
            if (j10 != -1 && jLongValue == 4294967295L) {
                jLongValue = j10;
            }
            this.f52472g = ((long) this.f52471f) + jLongValue;
            long length = lVar.getLength();
            if (length != -1 && this.f52472g > length) {
                l1.a.s("WavExtractor", "Data exceeds input length: " + this.f52472g + ", " + length);
                this.f52472g = length;
            }
            b bVar2 = this.f52470e;
            bVar2.getClass();
            bVar2.b(this.f52471f, this.f52472g);
            this.f52468c = 4;
            return 0;
        }
        q qVar2 = new q(16);
        long j11 = d.b(1718449184, lVar, qVar2).f11792b;
        go.k.t(j11 >= 16);
        lVar.peekFully(qVar2.f44813a, 0, 16);
        qVar2.M(0);
        int iS = qVar2.s();
        int iS2 = qVar2.s();
        int iR = qVar2.r();
        qVar2.r();
        int iS3 = qVar2.s();
        int iS4 = qVar2.s();
        int i13 = ((int) j11) - 16;
        if (i13 > 0) {
            bArr = new byte[i13];
            lVar.peekFully(bArr, 0, i13);
            if (iS == 65534 && i13 == 24) {
                q qVar3 = new q(bArr);
                qVar3.s();
                int iS5 = qVar3.s();
                if (iS5 != 0 && iS5 != iS4) {
                    throw e0.c("validBits ( " + iS5 + ")  != bitsPerSample( " + iS4 + ") are not supported");
                }
                int iR2 = qVar3.r();
                if ((iR2 >> 18) != 0) {
                    throw e0.c("invalid channel mask " + iR2);
                }
                if (iR2 != 0 && Integer.bitCount(iR2) != iS2) {
                    throw e0.c("invalid number of channels (" + Integer.bitCount(iR2) + ") in channel mask " + iR2);
                }
                iS = qVar3.s();
                byte[] bArr2 = new byte[14];
                qVar3.k(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, d.f52473a) && !Arrays.equals(bArr2, d.f52474b)) {
                    throw e0.c("invalid wav format extension guid");
                }
            }
        } else {
            bArr = y.f44831b;
        }
        byte[] bArr3 = bArr;
        int i14 = iS;
        lVar.skipFully((int) (lVar.getPeekPosition() - lVar.getPosition()));
        ta1 ta1Var = new ta1(i14, iS2, iR, iS3, iS4, bArr3);
        if (i14 == 17) {
            this.f52470e = new a(this.f52466a, this.f52467b, ta1Var);
        } else if (i14 == 6) {
            this.f52470e = new ka(this.f52466a, this.f52467b, ta1Var, MimeTypes.AUDIO_ALAW, -1);
        } else if (i14 == 7) {
            this.f52470e = new ka(this.f52466a, this.f52467b, ta1Var, MimeTypes.AUDIO_MLAW, -1);
        } else {
            if (i14 == 1) {
                iC = y.C(iS4, ByteOrder.LITTLE_ENDIAN);
                i10 = iC;
            } else {
                if (i14 != 3) {
                    if (i14 == 65534) {
                        iC = y.C(iS4, ByteOrder.LITTLE_ENDIAN);
                        i10 = iC;
                    }
                } else if (iS4 == 32) {
                    i10 = iC;
                }
                i10 = 0;
            }
            if (i10 == 0) {
                throw e0.c("Unsupported WAV format type: " + i14);
            }
            this.f52470e = new ka(this.f52466a, this.f52467b, ta1Var, MimeTypes.AUDIO_RAW, i10);
        }
        this.f52468c = 3;
        return 0;
    }

    @Override // n2.k
    public final void c(m mVar) {
        this.f52466a = mVar;
        this.f52467b = mVar.track(0, 1);
        mVar.endTracks();
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        this.f52468c = j10 == 0 ? 0 : 4;
        b bVar = this.f52470e;
        if (bVar != null) {
            bVar.e(j11);
        }
    }

    @Override // n2.k
    public final void release() {
    }
}
