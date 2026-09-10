package com.google.crypto.tink.shaded.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends androidx.datastore.preferences.protobuf.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ByteArrayInputStream f24589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f24590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24596j = Integer.MAX_VALUE;

    public k(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = b0.f24539a;
        this.f24589c = byteArrayInputStream;
        this.f24590d = new byte[4096];
        this.f24591e = 0;
        this.f24593g = 0;
        this.f24595i = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long A() {
        return K();
    }

    public final byte[] E(int i10) throws IOException {
        byte[] bArrF = F(i10);
        if (bArrF != null) {
            return bArrF;
        }
        int i11 = this.f24593g;
        int i12 = this.f24591e;
        int length = i12 - i11;
        this.f24595i += i12;
        this.f24593g = 0;
        this.f24591e = 0;
        ArrayList<byte[]> arrayListG = G(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f24590d, i11, bArr, 0, length);
        for (byte[] bArr2 : arrayListG) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i10) throws IOException {
        if (i10 == 0) {
            return b0.f24540b;
        }
        if (i10 < 0) {
            throw d0.j();
        }
        int i11 = this.f24595i;
        int i12 = this.f24593g;
        int i13 = i11 + i12 + i10;
        if (i13 - Integer.MAX_VALUE > 0) {
            throw new d0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i14 = this.f24596j;
        if (i13 > i14) {
            O((i14 - i11) - i12);
            throw d0.l();
        }
        int i15 = this.f24591e - i12;
        int i16 = i10 - i15;
        ByteArrayInputStream byteArrayInputStream = this.f24589c;
        if (i16 >= 4096) {
            try {
                if (i16 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (d0 e10) {
                e10.f24549a = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f24590d, this.f24593g, bArr, 0, i15);
        this.f24595i += this.f24591e;
        this.f24593g = 0;
        this.f24591e = 0;
        while (i15 < i10) {
            try {
                int i17 = byteArrayInputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw d0.l();
                }
                this.f24595i += i17;
                i15 += i17;
            } catch (d0 e11) {
                e11.f24549a = true;
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
                int i12 = this.f24589c.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw d0.l();
                }
                this.f24595i += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() throws d0 {
        int i10 = this.f24593g;
        if (this.f24591e - i10 < 4) {
            N(4);
            i10 = this.f24593g;
        }
        this.f24593g = i10 + 4;
        byte[] bArr = this.f24590d;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long I() throws d0 {
        int i10 = this.f24593g;
        if (this.f24591e - i10 < 8) {
            N(8);
            i10 = this.f24593g;
        }
        this.f24593g = i10 + 8;
        byte[] bArr = this.f24590d;
        return ((((long) bArr[i10 + 1]) & 255) << 8) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public final int J() {
        int i10;
        int i11 = this.f24593g;
        int i12 = this.f24591e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f24590d;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f24593g = i13;
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
                this.f24593g = i14;
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
        int i10 = this.f24593g;
        int i11 = this.f24591e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f24590d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f24593g = i12;
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
                this.f24593g = i13;
                return j10;
            }
        }
        return L();
    }

    public final long L() throws d0 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f24593g == this.f24591e) {
                N(1);
            }
            int i11 = this.f24593g;
            this.f24593g = i11 + 1;
            byte b10 = this.f24590d[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw d0.i();
    }

    public final void M() {
        int i10 = this.f24591e + this.f24592f;
        this.f24591e = i10;
        int i11 = this.f24595i + i10;
        int i12 = this.f24596j;
        if (i11 <= i12) {
            this.f24592f = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f24592f = i13;
        this.f24591e = i10 - i13;
    }

    public final void N(int i10) throws d0 {
        if (P(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f24595i) - this.f24593g) {
            throw d0.l();
        }
        throw new d0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final void O(int i10) throws d0 {
        int i11 = this.f24591e;
        int i12 = this.f24593g;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f24593g = i12 + i10;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f24589c;
        if (i10 < 0) {
            throw d0.j();
        }
        int i14 = this.f24595i;
        int i15 = i14 + i12;
        int i16 = i15 + i10;
        int i17 = this.f24596j;
        if (i16 > i17) {
            O((i17 - i14) - i12);
            throw d0.l();
        }
        this.f24595i = i15;
        this.f24591e = 0;
        this.f24593g = 0;
        while (i13 < i10) {
            long j10 = i10 - i13;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (d0 e10) {
                    e10.f24549a = true;
                    throw e10;
                }
            } catch (Throwable th2) {
                this.f24595i += i13;
                M();
                throw th2;
            }
        }
        this.f24595i += i13;
        M();
        if (i13 >= i10) {
            return;
        }
        int i18 = this.f24591e;
        int i19 = i18 - this.f24593g;
        this.f24593g = i18;
        N(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f24591e;
            if (i20 <= i21) {
                this.f24593g = i20;
                return;
            } else {
                i19 += i21;
                this.f24593g = i21;
                N(1);
            }
        }
    }

    public final boolean P(int i10) throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f24589c;
        int i11 = this.f24593g;
        int i12 = i11 + i10;
        int i13 = this.f24591e;
        if (i12 <= i13) {
            throw new IllegalStateException(defpackage.e.h(i10, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i14 = this.f24595i;
        if (i10 <= (Integer.MAX_VALUE - i14) - i11 && i14 + i11 + i10 <= this.f24596j) {
            byte[] bArr = this.f24590d;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f24595i += i11;
                this.f24591e -= i11;
                this.f24593g = 0;
            }
            int i15 = this.f24591e;
            try {
                int i16 = byteArrayInputStream.read(bArr, i15, Math.min(bArr.length - i15, (Integer.MAX_VALUE - this.f24595i) - i15));
                if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
                    throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
                }
                if (i16 > 0) {
                    this.f24591e += i16;
                    M();
                    if (this.f24591e >= i10 || P(i10)) {
                        return true;
                    }
                }
            } catch (d0 e10) {
                e10.f24549a = true;
                throw e10;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final void a(int i10) throws d0 {
        if (this.f24594h != i10) {
            throw new d0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int d() {
        return this.f24595i + this.f24593g;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final boolean e() {
        return this.f24593g == this.f24591e && !P(1);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final void g(int i10) {
        this.f24596j = i10;
        M();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int h(int i10) throws d0 {
        if (i10 < 0) {
            throw d0.j();
        }
        int i11 = this.f24595i + this.f24593g + i10;
        if (i11 < 0) {
            throw new d0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.f24596j;
        if (i11 > i12) {
            throw d0.l();
        }
        this.f24596j = i11;
        M();
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final boolean i() {
        return K() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final h k() throws IOException {
        int iJ = J();
        int i10 = this.f24591e;
        int i11 = this.f24593g;
        int i12 = i10 - i11;
        byte[] bArr = this.f24590d;
        if (iJ <= i12 && iJ > 0) {
            h hVarM = i.m(bArr, i11, iJ);
            this.f24593g += iJ;
            return hVarM;
        }
        if (iJ == 0) {
            return i.f24569b;
        }
        if (iJ < 0) {
            throw d0.j();
        }
        byte[] bArrF = F(iJ);
        if (bArrF != null) {
            return i.m(bArrF, 0, bArrF.length);
        }
        int i13 = this.f24593g;
        int i14 = this.f24591e;
        int length = i14 - i13;
        this.f24595i += i14;
        this.f24593g = 0;
        this.f24591e = 0;
        ArrayList<byte[]> arrayListG = G(iJ - length);
        byte[] bArr2 = new byte[iJ];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        for (byte[] bArr3 : arrayListG) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        h hVar = i.f24569b;
        return new h(bArr2);
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
        return androidx.datastore.preferences.protobuf.m.b(J());
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final long v() {
        return androidx.datastore.preferences.protobuf.m.c(K());
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final String w() throws d0 {
        int iJ = J();
        byte[] bArr = this.f24590d;
        if (iJ > 0) {
            int i10 = this.f24591e;
            int i11 = this.f24593g;
            if (iJ <= i10 - i11) {
                String str = new String(bArr, i11, iJ, b0.f24539a);
                this.f24593g += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw d0.j();
        }
        if (iJ > this.f24591e) {
            return new String(E(iJ), b0.f24539a);
        }
        N(iJ);
        String str2 = new String(bArr, this.f24593g, iJ, b0.f24539a);
        this.f24593g += iJ;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final String x() throws IOException {
        int iJ = J();
        int i10 = this.f24593g;
        int i11 = this.f24591e;
        int i12 = i11 - i10;
        byte[] bArrE = this.f24590d;
        if (iJ <= i12 && iJ > 0) {
            this.f24593g = i10 + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw d0.j();
            }
            i10 = 0;
            if (iJ <= i11) {
                N(iJ);
                this.f24593g = iJ;
            } else {
                bArrE = E(iJ);
            }
        }
        return l1.f24607a.A(bArrE, i10, iJ);
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int y() throws d0 {
        if (e()) {
            this.f24594h = 0;
            return 0;
        }
        int iJ = J();
        this.f24594h = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw d0.d();
    }

    @Override // androidx.datastore.preferences.protobuf.m
    public final int z() {
        return J();
    }
}
