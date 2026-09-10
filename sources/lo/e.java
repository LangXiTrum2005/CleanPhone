package lo;

import com.google.android.gms.internal.measurement.lc;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f45636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45637b;

    public final void a(e out, long j10, long j11) {
        kotlin.jvm.internal.n.f(out, "out");
        long j12 = j10;
        com.google.android.gms.internal.auth.i.b(this.f45637b, j12, j11);
        if (j11 == 0) {
            return;
        }
        out.f45637b += j11;
        o oVar = this.f45636a;
        while (true) {
            kotlin.jvm.internal.n.c(oVar);
            long j13 = oVar.f45661c - oVar.f45660b;
            if (j12 < j13) {
                break;
            }
            j12 -= j13;
            oVar = oVar.f45664f;
        }
        long j14 = j11;
        while (j14 > 0) {
            kotlin.jvm.internal.n.c(oVar);
            o oVarC = oVar.c();
            int i10 = oVarC.f45660b + ((int) j12);
            oVarC.f45660b = i10;
            oVarC.f45661c = Math.min(i10 + ((int) j14), oVarC.f45661c);
            o oVar2 = out.f45636a;
            if (oVar2 == null) {
                oVarC.f45665g = oVarC;
                oVarC.f45664f = oVarC;
                out.f45636a = oVarC;
            } else {
                o oVar3 = oVar2.f45665g;
                kotlin.jvm.internal.n.c(oVar3);
                oVar3.b(oVarC);
            }
            j14 -= (long) (oVarC.f45661c - oVarC.f45660b);
            oVar = oVar.f45664f;
            j12 = 0;
        }
    }

    public final Object clone() {
        e eVar = new e();
        if (this.f45637b == 0) {
            return eVar;
        }
        o oVar = this.f45636a;
        kotlin.jvm.internal.n.c(oVar);
        o oVarC = oVar.c();
        eVar.f45636a = oVarC;
        oVarC.f45665g = oVarC;
        oVarC.f45664f = oVarC;
        for (o oVar2 = oVar.f45664f; oVar2 != oVar; oVar2 = oVar2.f45664f) {
            o oVar3 = oVarC.f45665g;
            kotlin.jvm.internal.n.c(oVar3);
            kotlin.jvm.internal.n.c(oVar2);
            oVar3.b(oVar2.c());
        }
        eVar.f45637b = this.f45637b;
        return eVar;
    }

    @Override // lo.r
    public final void e(long j10, e source) {
        o oVarB;
        kotlin.jvm.internal.n.f(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        com.google.android.gms.internal.auth.i.b(source.f45637b, 0L, j10);
        while (j10 > 0) {
            o oVar = source.f45636a;
            kotlin.jvm.internal.n.c(oVar);
            int i10 = oVar.f45661c;
            o oVar2 = source.f45636a;
            kotlin.jvm.internal.n.c(oVar2);
            long j11 = i10 - oVar2.f45660b;
            int i11 = 0;
            if (j10 < j11) {
                o oVar3 = this.f45636a;
                o oVar4 = oVar3 != null ? oVar3.f45665g : null;
                if (oVar4 != null && oVar4.f45663e) {
                    if ((((long) oVar4.f45661c) + j10) - ((long) (oVar4.f45662d ? 0 : oVar4.f45660b)) <= 8192) {
                        o oVar5 = source.f45636a;
                        kotlin.jvm.internal.n.c(oVar5);
                        oVar5.d(oVar4, (int) j10);
                        source.f45637b -= j10;
                        this.f45637b += j10;
                        return;
                    }
                }
                o oVar6 = source.f45636a;
                kotlin.jvm.internal.n.c(oVar6);
                int i12 = (int) j10;
                if (i12 <= 0 || i12 > oVar6.f45661c - oVar6.f45660b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i12 >= 1024) {
                    oVarB = oVar6.c();
                } else {
                    oVarB = p.b();
                    byte[] bArr = oVar6.f45659a;
                    byte[] bArr2 = oVarB.f45659a;
                    int i13 = oVar6.f45660b;
                    xj.k.g0(bArr, 0, i13, bArr2, i13 + i12);
                }
                oVarB.f45661c = oVarB.f45660b + i12;
                oVar6.f45660b += i12;
                o oVar7 = oVar6.f45665g;
                kotlin.jvm.internal.n.c(oVar7);
                oVar7.b(oVarB);
                source.f45636a = oVarB;
            }
            o oVar8 = source.f45636a;
            kotlin.jvm.internal.n.c(oVar8);
            long j12 = oVar8.f45661c - oVar8.f45660b;
            source.f45636a = oVar8.a();
            o oVar9 = this.f45636a;
            if (oVar9 == null) {
                this.f45636a = oVar8;
                oVar8.f45665g = oVar8;
                oVar8.f45664f = oVar8;
            } else {
                o oVar10 = oVar9.f45665g;
                kotlin.jvm.internal.n.c(oVar10);
                oVar10.b(oVar8);
                o oVar11 = oVar8.f45665g;
                if (oVar11 == oVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.n.c(oVar11);
                if (oVar11.f45663e) {
                    int i14 = oVar8.f45661c - oVar8.f45660b;
                    o oVar12 = oVar8.f45665g;
                    kotlin.jvm.internal.n.c(oVar12);
                    int i15 = 8192 - oVar12.f45661c;
                    o oVar13 = oVar8.f45665g;
                    kotlin.jvm.internal.n.c(oVar13);
                    if (!oVar13.f45662d) {
                        o oVar14 = oVar8.f45665g;
                        kotlin.jvm.internal.n.c(oVar14);
                        i11 = oVar14.f45660b;
                    }
                    if (i14 <= i15 + i11) {
                        o oVar15 = oVar8.f45665g;
                        kotlin.jvm.internal.n.c(oVar15);
                        oVar8.d(oVar15, i14);
                        oVar8.a();
                        p.a(oVar8);
                    }
                }
            }
            source.f45637b -= j12;
            this.f45637b += j12;
            j10 -= j12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        long j10 = this.f45637b;
        e eVar = (e) obj;
        if (j10 != eVar.f45637b) {
            return false;
        }
        if (j10 == 0) {
            return true;
        }
        o oVar = this.f45636a;
        kotlin.jvm.internal.n.c(oVar);
        o oVar2 = eVar.f45636a;
        kotlin.jvm.internal.n.c(oVar2);
        int i10 = oVar.f45660b;
        int i11 = oVar2.f45660b;
        long j11 = 0;
        while (j11 < this.f45637b) {
            long jMin = Math.min(oVar.f45661c - i10, oVar2.f45661c - i11);
            long j12 = 0;
            while (j12 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (oVar.f45659a[i10] != oVar2.f45659a[i11]) {
                    return false;
                }
                j12++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == oVar.f45661c) {
                oVar = oVar.f45664f;
                kotlin.jvm.internal.n.c(oVar);
                i10 = oVar.f45660b;
            }
            if (i11 == oVar2.f45661c) {
                oVar2 = oVar2.f45664f;
                kotlin.jvm.internal.n.c(oVar2);
                i11 = oVar2.f45660b;
            }
            j11 += jMin;
        }
        return true;
    }

    public final boolean exhausted() {
        return this.f45637b == 0;
    }

    @Override // lo.f
    public final /* bridge */ /* synthetic */ f g(h hVar) {
        o(hVar);
        return this;
    }

    public final byte h(long j10) {
        com.google.android.gms.internal.auth.i.b(this.f45637b, j10, 1L);
        o oVar = this.f45636a;
        if (oVar == null) {
            kotlin.jvm.internal.n.c(null);
            throw null;
        }
        long j11 = this.f45637b;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                oVar = oVar.f45665g;
                kotlin.jvm.internal.n.c(oVar);
                j11 -= (long) (oVar.f45661c - oVar.f45660b);
            }
            return oVar.f45659a[(int) ((((long) oVar.f45660b) + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            int i10 = oVar.f45661c;
            int i11 = oVar.f45660b;
            long j13 = ((long) (i10 - i11)) + j12;
            if (j13 > j10) {
                return oVar.f45659a[(int) ((((long) i11) + j10) - j12)];
            }
            oVar = oVar.f45664f;
            kotlin.jvm.internal.n.c(oVar);
            j12 = j13;
        }
    }

    public final int hashCode() {
        o oVar = this.f45636a;
        if (oVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = oVar.f45661c;
            for (int i12 = oVar.f45660b; i12 < i11; i12++) {
                i10 = (i10 * 31) + oVar.f45659a[i12];
            }
            oVar = oVar.f45664f;
            kotlin.jvm.internal.n.c(oVar);
        } while (oVar != this.f45636a);
        return i10;
    }

    @Override // lo.f
    public final /* bridge */ /* synthetic */ f i(int i10, byte[] bArr) {
        n(i10, bArr);
        return this;
    }

    public final long indexOf(byte b10, long j10, long j11) {
        o oVar;
        long j12 = 0;
        if (0 > j10 || j10 > j11) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(this.f45637b);
            q4.a.r(sb2, " fromIndex=", j10, " toIndex=");
            sb2.append(j11);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        long j13 = this.f45637b;
        if (j11 > j13) {
            j11 = j13;
        }
        if (j10 == j11 || (oVar = this.f45636a) == null) {
            return -1L;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                oVar = oVar.f45665g;
                kotlin.jvm.internal.n.c(oVar);
                j13 -= (long) (oVar.f45661c - oVar.f45660b);
            }
            while (j13 < j11) {
                byte[] bArr = oVar.f45659a;
                int iMin = (int) Math.min(oVar.f45661c, (((long) oVar.f45660b) + j11) - j13);
                for (int i10 = (int) ((((long) oVar.f45660b) + j10) - j13); i10 < iMin; i10++) {
                    if (bArr[i10] == b10) {
                        return ((long) (i10 - oVar.f45660b)) + j13;
                    }
                }
                j13 += (long) (oVar.f45661c - oVar.f45660b);
                oVar = oVar.f45664f;
                kotlin.jvm.internal.n.c(oVar);
                j10 = j13;
            }
            return -1L;
        }
        while (true) {
            long j14 = ((long) (oVar.f45661c - oVar.f45660b)) + j12;
            if (j14 > j10) {
                break;
            }
            oVar = oVar.f45664f;
            kotlin.jvm.internal.n.c(oVar);
            j12 = j14;
        }
        while (j12 < j11) {
            byte[] bArr2 = oVar.f45659a;
            int iMin2 = (int) Math.min(oVar.f45661c, (((long) oVar.f45660b) + j11) - j12);
            for (int i11 = (int) ((((long) oVar.f45660b) + j10) - j12); i11 < iMin2; i11++) {
                if (bArr2[i11] == b10) {
                    return ((long) (i11 - oVar.f45660b)) + j12;
                }
            }
            j12 += (long) (oVar.f45661c - oVar.f45660b);
            oVar = oVar.f45664f;
            kotlin.jvm.internal.n.c(oVar);
            j10 = j12;
        }
        return -1L;
    }

    @Override // lo.g
    public final InputStream inputStream() {
        return new lc(this, 3);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final h j(int i10) {
        if (i10 == 0) {
            return h.f45638d;
        }
        com.google.android.gms.internal.auth.i.b(this.f45637b, 0L, i10);
        o oVar = this.f45636a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            kotlin.jvm.internal.n.c(oVar);
            int i14 = oVar.f45661c;
            int i15 = oVar.f45660b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            oVar = oVar.f45664f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        o oVar2 = this.f45636a;
        int i16 = 0;
        while (i11 < i10) {
            kotlin.jvm.internal.n.c(oVar2);
            bArr[i16] = oVar2.f45659a;
            i11 += oVar2.f45661c - oVar2.f45660b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = oVar2.f45660b;
            oVar2.f45662d = true;
            i16++;
            oVar2 = oVar2.f45664f;
        }
        return new q(bArr, iArr);
    }

    public final o k(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        o oVar = this.f45636a;
        if (oVar == null) {
            o oVarB = p.b();
            this.f45636a = oVarB;
            oVarB.f45665g = oVarB;
            oVarB.f45664f = oVarB;
            return oVarB;
        }
        o oVar2 = oVar.f45665g;
        kotlin.jvm.internal.n.c(oVar2);
        if (oVar2.f45661c + i10 <= 8192 && oVar2.f45663e) {
            return oVar2;
        }
        o oVarB2 = p.b();
        oVar2.b(oVarB2);
        return oVarB2;
    }

    @Override // lo.t
    public final long l(long j10, e sink) {
        kotlin.jvm.internal.n.f(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "byteCount < 0: ").toString());
        }
        long j11 = this.f45637b;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        sink.e(j10, this);
        return j10;
    }

    public final void n(int i10, byte[] source) {
        kotlin.jvm.internal.n.f(source, "source");
        int i11 = 0;
        long j10 = i10;
        com.google.android.gms.internal.auth.i.b(source.length, 0, j10);
        while (i11 < i10) {
            o oVarK = k(1);
            int iMin = Math.min(i10 - i11, 8192 - oVarK.f45661c);
            int i12 = i11 + iMin;
            xj.k.g0(source, oVarK.f45661c, i11, oVarK.f45659a, i12);
            oVarK.f45661c += iMin;
            i11 = i12;
        }
        this.f45637b += j10;
    }

    public final void o(h byteString) {
        kotlin.jvm.internal.n.f(byteString, "byteString");
        byteString.n(this, byteString.d());
    }

    public final void p(t source) {
        kotlin.jvm.internal.n.f(source, "source");
        while (source.l(8192L, this) != -1) {
        }
    }

    public final void q(int i10) {
        o oVarK = k(1);
        byte[] bArr = oVarK.f45659a;
        int i11 = oVarK.f45661c;
        oVarK.f45661c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f45637b++;
    }

    public final void r(long j10) {
        if (j10 == 0) {
            q(48);
            return;
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        o oVarK = k(i10);
        byte[] bArr = oVarK.f45659a;
        int i11 = oVarK.f45661c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = mo.a.f46262a[(int) (15 & j10)];
            j10 >>>= 4;
        }
        oVarK.f45661c += i10;
        this.f45637b += (long) i10;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.n.f(sink, "sink");
        o oVar = this.f45636a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), oVar.f45661c - oVar.f45660b);
        sink.put(oVar.f45659a, oVar.f45660b, iMin);
        int i10 = oVar.f45660b + iMin;
        oVar.f45660b = i10;
        this.f45637b -= (long) iMin;
        if (i10 == oVar.f45661c) {
            this.f45636a = oVar.a();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // lo.g
    public final byte readByte() throws EOFException {
        if (this.f45637b == 0) {
            throw new EOFException();
        }
        o oVar = this.f45636a;
        kotlin.jvm.internal.n.c(oVar);
        int i10 = oVar.f45660b;
        int i11 = oVar.f45661c;
        int i12 = i10 + 1;
        byte b10 = oVar.f45659a[i10];
        this.f45637b--;
        if (i12 != i11) {
            oVar.f45660b = i12;
            return b10;
        }
        this.f45636a = oVar.a();
        p.a(oVar);
        return b10;
    }

    @Override // lo.g
    public final byte[] readByteArray() {
        return readByteArray(this.f45637b);
    }

    @Override // lo.g
    public final h readByteString(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "byteCount: ").toString());
        }
        if (this.f45637b < j10) {
            throw new EOFException();
        }
        if (j10 < 4096) {
            return new h(readByteArray(j10));
        }
        h hVarJ = j((int) j10);
        skip(j10);
        return hVarJ;
    }

    @Override // lo.g
    public final long readHexadecimalUnsignedLong() throws EOFException {
        int i10;
        if (this.f45637b == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            o oVar = this.f45636a;
            kotlin.jvm.internal.n.c(oVar);
            byte[] bArr = oVar.f45659a;
            int i12 = oVar.f45660b;
            int i13 = oVar.f45661c;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        z10 = true;
                        if (i11 != 0) {
                            break;
                        }
                        char[] cArr = mo.b.f46263a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b10 >> 4) & 15], cArr[b10 & 15]})));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    e eVar = new e();
                    eVar.r(j10);
                    eVar.q(b10);
                    throw new NumberFormatException("Number too large: ".concat(eVar.readUtf8()));
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f45636a = oVar.a();
                p.a(oVar);
            } else {
                oVar.f45660b = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f45636a != null);
        this.f45637b -= (long) i11;
        return j10;
    }

    @Override // lo.g
    public final int readInt() throws EOFException {
        if (this.f45637b < 4) {
            throw new EOFException();
        }
        o oVar = this.f45636a;
        kotlin.jvm.internal.n.c(oVar);
        int i10 = oVar.f45660b;
        int i11 = oVar.f45661c;
        if (i11 - i10 < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = oVar.f45659a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        this.f45637b -= 4;
        if (i14 != i11) {
            oVar.f45660b = i14;
            return i15;
        }
        this.f45636a = oVar.a();
        p.a(oVar);
        return i15;
    }

    @Override // lo.g
    public final short readShort() throws EOFException {
        if (this.f45637b < 2) {
            throw new EOFException();
        }
        o oVar = this.f45636a;
        kotlin.jvm.internal.n.c(oVar);
        int i10 = oVar.f45660b;
        int i11 = oVar.f45661c;
        if (i11 - i10 < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = oVar.f45659a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f45637b -= 2;
        if (i14 == i11) {
            this.f45636a = oVar.a();
            p.a(oVar);
        } else {
            oVar.f45660b = i14;
        }
        return (short) i15;
    }

    public final String readString(long j10, Charset charset) throws EOFException {
        kotlin.jvm.internal.n.f(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "byteCount: ").toString());
        }
        if (this.f45637b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        o oVar = this.f45636a;
        kotlin.jvm.internal.n.c(oVar);
        int i10 = oVar.f45660b;
        if (((long) i10) + j10 > oVar.f45661c) {
            return new String(readByteArray(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(oVar.f45659a, i10, i11, charset);
        int i12 = oVar.f45660b + i11;
        oVar.f45660b = i12;
        this.f45637b -= j10;
        if (i12 == oVar.f45661c) {
            this.f45636a = oVar.a();
            p.a(oVar);
        }
        return str;
    }

    public final String readUtf8() {
        return readString(this.f45637b, an.a.f3768a);
    }

    @Override // lo.g
    public final String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // lo.g
    public final void require(long j10) throws EOFException {
        if (this.f45637b < j10) {
            throw new EOFException();
        }
    }

    public final void s(int i10) {
        o oVarK = k(4);
        byte[] bArr = oVarK.f45659a;
        int i11 = oVarK.f45661c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        oVarK.f45661c = i11 + 4;
        this.f45637b += 4;
    }

    @Override // lo.g
    public final void skip(long j10) throws EOFException {
        while (j10 > 0) {
            o oVar = this.f45636a;
            if (oVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, oVar.f45661c - oVar.f45660b);
            long j11 = iMin;
            this.f45637b -= j11;
            j10 -= j11;
            int i10 = oVar.f45660b + iMin;
            oVar.f45660b = i10;
            if (i10 == oVar.f45661c) {
                this.f45636a = oVar.a();
                p.a(oVar);
            }
        }
    }

    public final void t(int i10) {
        o oVarK = k(2);
        byte[] bArr = oVarK.f45659a;
        int i11 = oVarK.f45661c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        oVarK.f45661c = i11 + 2;
        this.f45637b += 2;
    }

    @Override // lo.t
    public final v timeout() {
        return v.f45672d;
    }

    public final String toString() {
        long j10 = this.f45637b;
        if (j10 <= 2147483647L) {
            return j((int) j10).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f45637b).toString());
    }

    public final void u(int i10, int i11, String string) {
        char cCharAt;
        kotlin.jvm.internal.n.f(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(l1.d.e(i10, "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(defpackage.e.g(i11, i10, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i11 > string.length()) {
            StringBuilder sbU = defpackage.e.u(i11, "endIndex > string.length: ", " > ");
            sbU.append(string.length());
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                o oVarK = k(1);
                byte[] bArr = oVarK.f45659a;
                int i12 = oVarK.f45661c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = oVarK.f45661c;
                int i15 = (i12 + i10) - i14;
                oVarK.f45661c = i14 + i15;
                this.f45637b += (long) i15;
            } else {
                if (cCharAt2 < 2048) {
                    o oVarK2 = k(2);
                    byte[] bArr2 = oVarK2.f45659a;
                    int i16 = oVarK2.f45661c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    oVarK2.f45661c = i16 + 2;
                    this.f45637b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    o oVarK3 = k(3);
                    byte[] bArr3 = oVarK3.f45659a;
                    int i17 = oVarK3.f45661c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    oVarK3.f45661c = i17 + 3;
                    this.f45637b += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        q(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        o oVarK4 = k(4);
                        byte[] bArr4 = oVarK4.f45659a;
                        int i20 = oVarK4.f45661c;
                        bArr4[i20] = (byte) ((i19 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        oVarK4.f45661c = i20 + 4;
                        this.f45637b += 4;
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    public final void v(String string) {
        kotlin.jvm.internal.n.f(string, "string");
        u(0, string.length(), string);
    }

    public final void w(int i10) {
        String strG0;
        if (i10 < 128) {
            q(i10);
            return;
        }
        if (i10 < 2048) {
            o oVarK = k(2);
            byte[] bArr = oVarK.f45659a;
            int i11 = oVarK.f45661c;
            bArr[i11] = (byte) ((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            oVarK.f45661c = i11 + 2;
            this.f45637b += 2;
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            q(63);
            return;
        }
        if (i10 < 65536) {
            o oVarK2 = k(3);
            byte[] bArr2 = oVarK2.f45659a;
            int i12 = oVarK2.f45661c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            oVarK2.f45661c = i12 + 3;
            this.f45637b += 3;
            return;
        }
        if (i10 <= 1114111) {
            o oVarK3 = k(4);
            byte[] bArr3 = oVarK3.f45659a;
            int i13 = oVarK3.f45661c;
            bArr3[i13] = (byte) ((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            oVarK3.f45661c = i13 + 4;
            this.f45637b += 4;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
        if (i10 != 0) {
            char[] cArr = mo.b.f46263a;
            int i14 = 0;
            char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
            while (i14 < 8 && cArr2[i14] == '0') {
                i14++;
            }
            strG0 = an.p.g0(cArr2, i14, 8);
        } else {
            strG0 = "0";
        }
        sb2.append(strG0);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.n.f(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            o oVarK = k(1);
            int iMin = Math.min(i10, 8192 - oVarK.f45661c);
            source.get(oVarK.f45659a, oVarK.f45661c, iMin);
            i10 -= iMin;
            oVarK.f45661c += iMin;
        }
        this.f45637b += (long) iRemaining;
        return iRemaining;
    }

    @Override // lo.f
    public final /* bridge */ /* synthetic */ f writeByte(int i10) {
        q(i10);
        return this;
    }

    @Override // lo.f
    public final /* bridge */ /* synthetic */ f writeHexadecimalUnsignedLong(long j10) {
        r(j10);
        return this;
    }

    @Override // lo.f
    public final /* bridge */ /* synthetic */ f writeInt(int i10) {
        s(i10);
        return this;
    }

    @Override // lo.f
    public final /* bridge */ /* synthetic */ f writeShort(int i10) {
        t(i10);
        return this;
    }

    @Override // lo.f
    public final /* bridge */ /* synthetic */ f writeUtf8(String str) {
        v(str);
        return this;
    }

    @Override // lo.g
    public final String readUtf8LineStrict(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "limit < 0: ").toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return mo.a.a(jIndexOf, this);
        }
        if (j11 < this.f45637b && h(j11 - 1) == 13 && h(j11) == 10) {
            return mo.a.a(j11, this);
        }
        e eVar = new e();
        a(eVar, 0L, Math.min(32, this.f45637b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f45637b, j10) + " content=" + eVar.readByteString(eVar.f45637b).g() + (char) 8230);
    }

    public final byte[] readByteArray(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(defpackage.e.i(j10, "byteCount: ").toString());
        }
        if (this.f45637b >= j10) {
            int i10 = (int) j10;
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = read(bArr, i11, i10 - i11);
                if (i12 == -1) {
                    throw new EOFException();
                }
                i11 += i12;
            }
            return bArr;
        }
        throw new EOFException();
    }

    @Override // lo.f
    public final f write(byte[] bArr) {
        n(bArr.length, bArr);
        return this;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        com.google.android.gms.internal.auth.i.b(bArr.length, i10, i11);
        o oVar = this.f45636a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, oVar.f45661c - oVar.f45660b);
        byte[] bArr2 = oVar.f45659a;
        int i12 = oVar.f45660b;
        xj.k.g0(bArr2, i10, i12, bArr, i12 + iMin);
        int i13 = oVar.f45660b + iMin;
        oVar.f45660b = i13;
        this.f45637b -= (long) iMin;
        if (i13 == oVar.f45661c) {
            this.f45636a = oVar.a();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, lo.r
    public final void close() {
    }

    @Override // lo.f, lo.r, java.io.Flushable
    public final void flush() {
    }
}
