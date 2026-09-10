package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileInputStream f4122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4129j = Integer.MAX_VALUE;

    public l(FileInputStream fileInputStream) {
        Charset charset = e0.f4067a;
        this.f4122c = fileInputStream;
        this.f4123d = new byte[4096];
        this.f4124e = 0;
        this.f4126g = 0;
        this.f4128i = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long A() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final boolean B(int i10) throws g0 {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                O(8);
                return true;
            }
            if (i11 == 2) {
                O(J());
                return true;
            }
            if (i11 == 3) {
                C();
                a(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw g0.g();
            }
            O(4);
            return true;
        }
        int i13 = this.f4124e - this.f4126g;
        byte[] bArr = this.f4123d;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f4126g;
                this.f4126g = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw g0.h();
        }
        while (i12 < 10) {
            if (this.f4126g == this.f4124e) {
                N(1);
            }
            int i15 = this.f4126g;
            this.f4126g = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw g0.h();
        return true;
    }

    public final byte[] E(int i10) throws IOException {
        byte[] bArrF = F(i10);
        if (bArrF != null) {
            return bArrF;
        }
        int i11 = this.f4126g;
        int i12 = this.f4124e;
        int length = i12 - i11;
        this.f4128i += i12;
        this.f4126g = 0;
        this.f4124e = 0;
        ArrayList<byte[]> arrayListG = G(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f4123d, i11, bArr, 0, length);
        for (byte[] bArr2 : arrayListG) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i10) throws IOException {
        if (i10 == 0) {
            return e0.f4068b;
        }
        if (i10 < 0) {
            throw g0.i();
        }
        int i11 = this.f4128i;
        int i12 = this.f4126g;
        int i13 = i11 + i12 + i10;
        if (i13 - Integer.MAX_VALUE > 0) {
            throw new g0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f4129j;
        if (i13 > i14) {
            O((i14 - i11) - i12);
            throw g0.j();
        }
        int i15 = this.f4124e - i12;
        int i16 = i10 - i15;
        FileInputStream fileInputStream = this.f4122c;
        if (i16 >= 4096) {
            try {
                if (i16 > fileInputStream.available()) {
                    return null;
                }
            } catch (g0 e10) {
                e10.f4081a = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f4123d, this.f4126g, bArr, 0, i15);
        this.f4128i += this.f4124e;
        this.f4126g = 0;
        this.f4124e = 0;
        while (i15 < i10) {
            try {
                int i17 = fileInputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw g0.j();
                }
                this.f4128i += i17;
                i15 += i17;
            } catch (g0 e11) {
                e11.f4081a = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f4122c.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw g0.j();
                }
                this.f4128i += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() throws g0 {
        int i10 = this.f4126g;
        if (this.f4124e - i10 < 4) {
            N(4);
            i10 = this.f4126g;
        }
        this.f4126g = i10 + 4;
        byte[] bArr = this.f4123d;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long I() throws g0 {
        int i10 = this.f4126g;
        if (this.f4124e - i10 < 8) {
            N(8);
            i10 = this.f4126g;
        }
        this.f4126g = i10 + 8;
        byte[] bArr = this.f4123d;
        return ((((long) bArr[i10 + 1]) & 255) << 8) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public final int J() {
        int i10;
        int i11 = this.f4126g;
        int i12 = this.f4124e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f4123d;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f4126g = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f4126g = i14;
                return i10;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f4126g;
        int i11 = this.f4124e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f4123d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f4126g = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j13 = (-2080896) ^ i18;
                        } else {
                            long j14 = i18;
                            i13 = i10 + 5;
                            long j15 = j14 ^ (((long) bArr[i17]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j15 = j16 ^ (((long) bArr[i17]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j16 = j15 ^ (((long) bArr[i13]) << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j17 = (j16 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j13 = j11 ^ j16;
                            }
                            j10 = j12 ^ j15;
                        }
                        i13 = i17;
                        j10 = j13;
                    }
                }
                this.f4126g = i13;
                return j10;
            }
        }
        return L();
    }

    public final long L() throws g0 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f4126g == this.f4124e) {
                N(1);
            }
            int i11 = this.f4126g;
            this.f4126g = i11 + 1;
            byte b10 = this.f4123d[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw g0.h();
    }

    public final void M() {
        int i10 = this.f4124e + this.f4125f;
        this.f4124e = i10;
        int i11 = this.f4128i + i10;
        int i12 = this.f4129j;
        if (i11 <= i12) {
            this.f4125f = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f4125f = i13;
        this.f4124e = i10 - i13;
    }

    public final void N(int i10) throws g0 {
        if (P(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f4128i) - this.f4126g) {
            throw g0.j();
        }
        throw new g0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void O(int i10) throws g0 {
        int i11 = this.f4124e;
        int i12 = this.f4126g;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f4126g = i12 + i10;
            return;
        }
        FileInputStream fileInputStream = this.f4122c;
        if (i10 < 0) {
            throw g0.i();
        }
        int i14 = this.f4128i;
        int i15 = i14 + i12;
        int i16 = i15 + i10;
        int i17 = this.f4129j;
        if (i16 > i17) {
            O((i17 - i14) - i12);
            throw g0.j();
        }
        this.f4128i = i15;
        this.f4124e = 0;
        this.f4126g = 0;
        while (i13 < i10) {
            long j10 = i10 - i13;
            try {
                try {
                    long jSkip = fileInputStream.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (g0 e10) {
                    e10.f4081a = true;
                    throw e10;
                }
            } catch (Throwable th2) {
                this.f4128i += i13;
                M();
                throw th2;
            }
        }
        this.f4128i += i13;
        M();
        if (i13 >= i10) {
            return;
        }
        int i18 = this.f4124e;
        int i19 = i18 - this.f4126g;
        this.f4126g = i18;
        N(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f4124e;
            if (i20 <= i21) {
                this.f4126g = i20;
                return;
            } else {
                i19 += i21;
                this.f4126g = i21;
                N(1);
            }
        }
    }

    public final boolean P(int i10) throws IOException {
        FileInputStream fileInputStream = this.f4122c;
        int i11 = this.f4126g;
        int i12 = i11 + i10;
        int i13 = this.f4124e;
        if (i12 <= i13) {
            throw new IllegalStateException(defpackage.e.h(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.f4128i;
        if (i10 <= (Integer.MAX_VALUE - i14) - i11 && i14 + i11 + i10 <= this.f4129j) {
            byte[] bArr = this.f4123d;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f4128i += i11;
                this.f4124e -= i11;
                this.f4126g = 0;
            }
            int i15 = this.f4124e;
            try {
                int i16 = fileInputStream.read(bArr, i15, Math.min(bArr.length - i15, (Integer.MAX_VALUE - this.f4128i) - i15));
                if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
                }
                if (i16 > 0) {
                    this.f4124e += i16;
                    M();
                    if (this.f4124e >= i10) {
                        return true;
                    }
                    return P(i10);
                }
            } catch (g0 e10) {
                e10.f4081a = true;
                throw e10;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final void a(int i10) throws g0 {
        if (this.f4127h != i10) {
            throw new g0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int d() {
        return this.f4128i + this.f4126g;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final boolean e() {
        return this.f4126g == this.f4124e && !P(1);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final void g(int i10) {
        this.f4129j = i10;
        M();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int h(int i10) throws g0 {
        if (i10 < 0) {
            throw g0.i();
        }
        int i11 = this.f4128i + this.f4126g + i10;
        if (i11 < 0) {
            throw new g0("Failed to parse the message.");
        }
        int i12 = this.f4129j;
        if (i11 > i12) {
            throw g0.j();
        }
        this.f4129j = i11;
        M();
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final boolean i() {
        return K() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final i j() throws IOException {
        int iJ = J();
        int i10 = this.f4124e;
        int i11 = this.f4126g;
        int i12 = i10 - i11;
        byte[] bArr = this.f4123d;
        if (iJ <= i12 && iJ > 0) {
            i iVarM = j.m(bArr, i11, iJ);
            this.f4126g += iJ;
            return iVarM;
        }
        if (iJ == 0) {
            return j.f4104b;
        }
        if (iJ < 0) {
            throw g0.i();
        }
        byte[] bArrF = F(iJ);
        if (bArrF != null) {
            return j.m(bArrF, 0, bArrF.length);
        }
        int i13 = this.f4126g;
        int i14 = this.f4124e;
        int length = i14 - i13;
        this.f4128i += i14;
        this.f4126g = 0;
        this.f4124e = 0;
        ArrayList<byte[]> arrayListG = G(iJ - length);
        byte[] bArr2 = new byte[iJ];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        for (byte[] bArr3 : arrayListG) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        i iVar = j.f4104b;
        return new i(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final double l() {
        return Double.longBitsToDouble(I());
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int m() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int n() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long o() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final float p() {
        return Float.intBitsToFloat(H());
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int q() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long r() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int s() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long t() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int u() {
        int iJ = J();
        return (-(iJ & 1)) ^ (iJ >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long v() {
        long jK = K();
        return (-(jK & 1)) ^ (jK >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final String w() throws g0 {
        int iJ = J();
        byte[] bArr = this.f4123d;
        if (iJ > 0) {
            int i10 = this.f4124e;
            int i11 = this.f4126g;
            if (iJ <= i10 - i11) {
                String str = new String(bArr, i11, iJ, e0.f4067a);
                this.f4126g += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw g0.i();
        }
        if (iJ > this.f4124e) {
            return new String(E(iJ), e0.f4067a);
        }
        N(iJ);
        String str2 = new String(bArr, this.f4126g, iJ, e0.f4067a);
        this.f4126g += iJ;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final String x() throws IOException {
        int iJ = J();
        int i10 = this.f4126g;
        int i11 = this.f4124e;
        int i12 = i11 - i10;
        byte[] bArrE = this.f4123d;
        if (iJ <= i12 && iJ > 0) {
            this.f4126g = i10 + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw g0.i();
            }
            i10 = 0;
            if (iJ <= i11) {
                N(iJ);
                this.f4126g = iJ;
            } else {
                bArrE = E(iJ);
            }
        }
        return t1.f4168a.f(bArrE, i10, iJ);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int y() throws g0 {
        if (e()) {
            this.f4127h = 0;
            return 0;
        }
        int iJ = J();
        this.f4127h = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new g0("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int z() {
        return J();
    }
}
