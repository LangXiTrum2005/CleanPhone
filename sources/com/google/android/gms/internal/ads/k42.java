package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f16313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f16314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f16315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f16316f;

    public static c7 c(c7 c7Var, tx1 tx1Var, b2.d0 d0Var, np0 np0Var) {
        if (tx1Var.f(1073741824)) {
            long j10 = d0Var.f5245b;
            int iL = 1;
            np0Var.y(1);
            c7 c7VarE = e(c7Var, j10, np0Var.f17880a, 1);
            long j11 = j10 + 1;
            byte b10 = np0Var.f17880a[0];
            int i10 = b10 & 128;
            int i11 = b10 & 127;
            qx1 qx1Var = tx1Var.f20522d;
            byte[] bArr = qx1Var.f19230a;
            if (bArr == null) {
                qx1Var.f19230a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z10 = i10 != 0;
            c7Var = e(c7VarE, j11, qx1Var.f19230a, i11);
            long j12 = j11 + ((long) i11);
            if (z10) {
                np0Var.y(2);
                c7Var = e(c7Var, j12, np0Var.f17880a, 2);
                j12 += 2;
                iL = np0Var.L();
            }
            int[] iArr = qx1Var.f19233d;
            if (iArr == null || iArr.length < iL) {
                iArr = new int[iL];
            }
            int[] iArr2 = qx1Var.f19234e;
            if (iArr2 == null || iArr2.length < iL) {
                iArr2 = new int[iL];
            }
            if (z10) {
                int i12 = iL * 6;
                np0Var.y(i12);
                c7Var = e(c7Var, j12, np0Var.f17880a, i12);
                j12 += (long) i12;
                np0Var.E(0);
                for (int i13 = 0; i13 < iL; i13++) {
                    iArr[i13] = np0Var.L();
                    iArr2[i13] = np0Var.h();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = d0Var.f5246c - ((int) (j12 - d0Var.f5245b));
            }
            g3 g3Var = (g3) d0Var.f5247d;
            String str = uu0.f20901a;
            byte[] bArr2 = g3Var.f14691b;
            byte[] bArr3 = qx1Var.f19230a;
            int i14 = g3Var.f14690a;
            int i15 = g3Var.f14692c;
            int i16 = g3Var.f14693d;
            qx1Var.f19235f = iL;
            qx1Var.f19233d = iArr;
            qx1Var.f19234e = iArr2;
            qx1Var.f19231b = bArr2;
            qx1Var.f19230a = bArr3;
            qx1Var.f19232c = i14;
            qx1Var.f19236g = i15;
            qx1Var.f19237h = i16;
            MediaCodec.CryptoInfo cryptoInfo = qx1Var.f19238i;
            cryptoInfo.numSubSamples = iL;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            f81 f81Var = (f81) qx1Var.f19239j;
            f81Var.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) f81Var.f14318c;
            pattern.set(i15, i16);
            ((MediaCodec.CryptoInfo) f81Var.f14317b).setPattern(pattern);
            long j13 = d0Var.f5245b;
            int i17 = (int) (j12 - j13);
            d0Var.f5245b = j13 + ((long) i17);
            d0Var.f5246c -= i17;
        }
        if (!tx1Var.f(268435456)) {
            tx1Var.h(d0Var.f5246c);
            return d(c7Var, d0Var.f5245b, tx1Var.f20523e, d0Var.f5246c);
        }
        np0Var.y(4);
        c7 c7VarE2 = e(c7Var, d0Var.f5245b, np0Var.f17880a, 4);
        int iH = np0Var.h();
        d0Var.f5245b += 4;
        d0Var.f5246c -= 4;
        tx1Var.h(iH);
        c7 c7VarD = d(c7VarE2, d0Var.f5245b, tx1Var.f20523e, iH);
        d0Var.f5245b += (long) iH;
        int i18 = d0Var.f5246c - iH;
        d0Var.f5246c = i18;
        ByteBuffer byteBuffer = tx1Var.f20525g;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            tx1Var.f20525g = ByteBuffer.allocate(i18);
        } else {
            tx1Var.f20525g.clear();
        }
        return d(c7VarD, d0Var.f5245b, tx1Var.f20525g, d0Var.f5246c);
    }

    public static c7 d(c7 c7Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= c7Var.f13071b) {
            c7Var = (c7) c7Var.f13073d;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (c7Var.f13071b - j10));
            t tVar = (t) c7Var.f13072c;
            byte[] bArr = tVar.f20102a;
            long j11 = j10 - c7Var.f13070a;
            tVar.getClass();
            byteBuffer.put(bArr, (int) j11, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == c7Var.f13071b) {
                c7Var = (c7) c7Var.f13073d;
            }
        }
        return c7Var;
    }

    public static c7 e(c7 c7Var, long j10, byte[] bArr, int i10) {
        while (j10 >= c7Var.f13071b) {
            c7Var = (c7) c7Var.f13073d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (c7Var.f13071b - j10));
            t tVar = (t) c7Var.f13072c;
            byte[] bArr2 = tVar.f20102a;
            long j11 = j10 - c7Var.f13070a;
            tVar.getClass();
            System.arraycopy(bArr2, (int) j11, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == c7Var.f13071b) {
                c7Var = (c7) c7Var.f13073d;
            }
        }
        return c7Var;
    }

    public void a(long j10) {
        c7 c7Var;
        if (j10 != -1) {
            while (true) {
                c7Var = (c7) this.f16314d;
                if (j10 < c7Var.f13071b) {
                    break;
                }
                ((u) this.f16312b).a((t) c7Var.f13072c);
                c7 c7Var2 = (c7) this.f16314d;
                c7Var2.f13072c = null;
                c7 c7Var3 = (c7) c7Var2.f13073d;
                c7Var2.f13073d = null;
                this.f16314d = c7Var3;
            }
            if (((c7) this.f16315e).f13070a < c7Var.f13070a) {
                this.f16315e = c7Var;
            }
        }
    }

    public int b(int i10) {
        c7 c7Var = (c7) this.f16316f;
        if (((t) c7Var.f13072c) == null) {
            t tVarZza = ((u) this.f16312b).zza();
            c7 c7Var2 = new c7(((c7) this.f16316f).f13071b);
            c7Var.f13072c = tVarZza;
            c7Var.f13073d = c7Var2;
        }
        return Math.min(i10, (int) (((c7) this.f16316f).f13071b - this.f16311a));
    }
}
