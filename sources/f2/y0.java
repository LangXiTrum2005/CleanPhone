package f2;

import android.media.MediaCodec;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.internal.ads.qx1;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9.e f40527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.q f40529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c7 f40530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c7 f40531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c7 f40532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f40533g;

    public y0(v9.e eVar) {
        int i10;
        this.f40527a = eVar;
        synchronized (eVar) {
            i10 = ((p1.f) eVar.f52505d).f48012c.f43634b;
        }
        this.f40528b = i10;
        this.f40529c = new l1.q(32);
        c7 c7Var = new c7(0L, i10);
        this.f40530d = c7Var;
        this.f40531e = c7Var;
        this.f40532f = c7Var;
    }

    public static c7 c(c7 c7Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= c7Var.f13071b) {
            c7Var = (c7) c7Var.f13073d;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (c7Var.f13071b - j10));
            j2.a aVar = (j2.a) c7Var.f13072c;
            byteBuffer.put(aVar.f43624a, ((int) (j10 - c7Var.f13070a)) + aVar.f43625b, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == c7Var.f13071b) {
                c7Var = (c7) c7Var.f13073d;
            }
        }
        return c7Var;
    }

    public static c7 d(c7 c7Var, long j10, byte[] bArr, int i10) {
        while (j10 >= c7Var.f13071b) {
            c7Var = (c7) c7Var.f13073d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (c7Var.f13071b - j10));
            j2.a aVar = (j2.a) c7Var.f13072c;
            System.arraycopy(aVar.f43624a, ((int) (j10 - c7Var.f13070a)) + aVar.f43625b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == c7Var.f13071b) {
                c7Var = (c7) c7Var.f13073d;
            }
        }
        return c7Var;
    }

    public static c7 e(c7 c7Var, o1.d dVar, b2.d0 d0Var, l1.q qVar) {
        if (dVar.c(1073741824)) {
            long j10 = d0Var.f5245b;
            int iG = 1;
            qVar.J(1);
            c7 c7VarD = d(c7Var, j10, qVar.f44813a, 1);
            long j11 = j10 + 1;
            byte b10 = qVar.f44813a[0];
            boolean z10 = (b10 & 128) != 0;
            int i10 = b10 & 127;
            qx1 qx1Var = dVar.f47034d;
            byte[] bArr = qx1Var.f19230a;
            if (bArr == null) {
                qx1Var.f19230a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c7Var = d(c7VarD, j11, qx1Var.f19230a, i10);
            long j12 = j11 + ((long) i10);
            if (z10) {
                qVar.J(2);
                c7Var = d(c7Var, j12, qVar.f44813a, 2);
                j12 += 2;
                iG = qVar.G();
            }
            int[] iArr = qx1Var.f19233d;
            if (iArr == null || iArr.length < iG) {
                iArr = new int[iG];
            }
            int[] iArr2 = qx1Var.f19234e;
            if (iArr2 == null || iArr2.length < iG) {
                iArr2 = new int[iG];
            }
            if (z10) {
                int i11 = iG * 6;
                qVar.J(i11);
                c7Var = d(c7Var, j12, qVar.f44813a, i11);
                j12 += (long) i11;
                qVar.M(0);
                for (int i12 = 0; i12 < iG; i12++) {
                    iArr[i12] = qVar.G();
                    iArr2[i12] = qVar.D();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = d0Var.f5246c - ((int) (j12 - d0Var.f5245b));
            }
            n2.z zVar = (n2.z) d0Var.f5247d;
            String str = l1.y.f44830a;
            byte[] bArr2 = zVar.f46505b;
            byte[] bArr3 = qx1Var.f19230a;
            int i13 = zVar.f46504a;
            int i14 = zVar.f46506c;
            int i15 = zVar.f46507d;
            qx1Var.f19235f = iG;
            qx1Var.f19233d = iArr;
            qx1Var.f19234e = iArr2;
            qx1Var.f19231b = bArr2;
            qx1Var.f19230a = bArr3;
            qx1Var.f19232c = i13;
            qx1Var.f19236g = i14;
            qx1Var.f19237h = i15;
            MediaCodec.CryptoInfo cryptoInfo = qx1Var.f19238i;
            cryptoInfo.numSubSamples = iG;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            s1 s1Var = (s1) qx1Var.f19239j;
            s1Var.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) s1Var.f45752c;
            pattern.set(i14, i15);
            ((MediaCodec.CryptoInfo) s1Var.f45751b).setPattern(pattern);
            long j13 = d0Var.f5245b;
            int i16 = (int) (j12 - j13);
            d0Var.f5245b = j13 + ((long) i16);
            d0Var.f5246c -= i16;
        }
        if (!dVar.c(268435456)) {
            dVar.i(d0Var.f5246c);
            return c(c7Var, d0Var.f5245b, dVar.f47035e, d0Var.f5246c);
        }
        qVar.J(4);
        c7 c7VarD2 = d(c7Var, d0Var.f5245b, qVar.f44813a, 4);
        int iD = qVar.D();
        d0Var.f5245b += 4;
        d0Var.f5246c -= 4;
        dVar.i(iD);
        c7 c7VarC = c(c7VarD2, d0Var.f5245b, dVar.f47035e, iD);
        d0Var.f5245b += (long) iD;
        int i17 = d0Var.f5246c - iD;
        d0Var.f5246c = i17;
        ByteBuffer byteBuffer = dVar.f47038h;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            dVar.f47038h = ByteBuffer.allocate(i17);
        } else {
            dVar.f47038h.clear();
        }
        return c(c7VarC, d0Var.f5245b, dVar.f47038h, d0Var.f5246c);
    }

    public final void a(long j10) {
        c7 c7Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            c7Var = this.f40530d;
            if (j10 < c7Var.f13071b) {
                break;
            }
            v9.e eVar = this.f40527a;
            j2.a aVar = (j2.a) c7Var.f13072c;
            synchronized (eVar) {
                try {
                    j2.e eVar2 = ((p1.f) eVar.f52505d).f48012c;
                    synchronized (eVar2) {
                        try {
                            j2.a[] aVarArr = eVar2.f43638f;
                            int i10 = eVar2.f43637e;
                            eVar2.f43637e = i10 + 1;
                            aVarArr[i10] = aVar;
                            eVar2.f43636d--;
                            eVar2.notifyAll();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    eVar.J(aVar);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            c7 c7Var2 = this.f40530d;
            c7Var2.f13072c = null;
            c7 c7Var3 = (c7) c7Var2.f13073d;
            c7Var2.f13073d = null;
            this.f40530d = c7Var3;
        }
        if (this.f40531e.f13070a < c7Var.f13070a) {
            this.f40531e = c7Var;
        }
    }

    public final int b(int i10) {
        j2.a aVarA;
        c7 c7Var = this.f40532f;
        if (((j2.a) c7Var.f13072c) == null) {
            v9.e eVar = this.f40527a;
            synchronized (eVar) {
                aVarA = ((p1.f) eVar.f52505d).f48012c.a();
                ((HashMap) eVar.f52503b).put(aVarA, (q1.j) eVar.f52504c);
                p1.e eVar2 = (p1.e) ((p1.f) eVar.f52505d).f48024p.get((q1.j) eVar.f52504c);
                if (eVar2 != null) {
                    synchronized (eVar2) {
                        eVar2.f48000d++;
                    }
                }
            }
            c7 c7Var2 = new c7(this.f40532f.f13071b, this.f40528b);
            c7Var.f13072c = aVarA;
            c7Var.f13073d = c7Var2;
        }
        return Math.min(i10, (int) (this.f40532f.f13071b - this.f40533g));
    }
}
