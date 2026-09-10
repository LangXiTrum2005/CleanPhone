package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.fs1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends fs1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputStream f24004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f24005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24011k = Integer.MAX_VALUE;

    public /* synthetic */ u0(InputStream inputStream, int i10) {
        this.f24004d = inputStream;
        this.f24005e = new byte[i10 < 8 ? 8 : i10];
        this.f24006f = 0;
        this.f24008h = 0;
        this.f24010j = 0;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int A() throws u1 {
        if (o()) {
            this.f24009i = 0;
            return 0;
        }
        int iA0 = a0();
        this.f24009i = iA0;
        if ((iA0 >>> 3) != 0) {
            return iA0;
        }
        throw new u1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void B(int i10) throws u1 {
        if (this.f24009i != i10) {
            throw new u1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean C(int i10) throws u1 {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                t(8);
                return true;
            }
            if (i11 == 2) {
                t(a0());
                return true;
            }
            if (i11 == 3) {
                x();
                B(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                if (this.f14524b == 0) {
                    B(0);
                }
                return false;
            }
            if (i11 != 5) {
                throw new t1();
            }
            t(4);
            return true;
        }
        int i13 = this.f24006f - this.f24008h;
        byte[] bArr = this.f24005e;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f24008h;
                this.f24008h = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw new u1("CodedInputStream encountered a malformed varint.");
        }
        while (i12 < 10) {
            if (this.f24008h == this.f24006f) {
                i(1);
            }
            int i15 = this.f24008h;
            this.f24008h = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw new u1("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final double D() {
        return Double.longBitsToDouble(j0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final float E() {
        return Float.intBitsToFloat(i0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long F() {
        return b0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long G() {
        return b0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int H() {
        return a0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long I() {
        return j0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int J() {
        return i0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean K() {
        return b0() != 0;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final String L() throws u1 {
        int iA0 = a0();
        byte[] bArr = this.f24005e;
        if (iA0 > 0) {
            int i10 = this.f24006f;
            int i11 = this.f24008h;
            if (iA0 <= i10 - i11) {
                String str = new String(bArr, i11, iA0, StandardCharsets.UTF_8);
                this.f24008h += iA0;
                return str;
            }
        }
        if (iA0 == 0) {
            return "";
        }
        if (iA0 < 0) {
            throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iA0 > this.f24006f) {
            return new String(e0(iA0), StandardCharsets.UTF_8);
        }
        i(iA0);
        String str2 = new String(bArr, this.f24008h, iA0, StandardCharsets.UTF_8);
        this.f24008h += iA0;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final String M() throws IOException {
        int iA0 = a0();
        int i10 = this.f24008h;
        int i11 = this.f24006f;
        int i12 = i11 - i10;
        byte[] bArrE0 = this.f24005e;
        if (iA0 <= i12 && iA0 > 0) {
            this.f24008h = i10 + iA0;
        } else {
            if (iA0 == 0) {
                return "";
            }
            if (iA0 < 0) {
                throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i10 = 0;
            if (iA0 <= i11) {
                i(iA0);
                this.f24008h = iA0;
            } else {
                bArrE0 = e0(iA0);
            }
        }
        return b3.d(bArrE0, i10, iA0);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final r0 O() throws IOException {
        int iA0 = a0();
        int i10 = this.f24006f;
        int i11 = this.f24008h;
        int i12 = i10 - i11;
        byte[] bArr = this.f24005e;
        if (iA0 <= i12 && iA0 > 0) {
            r0 r0VarT = s0.t(bArr, i11, iA0);
            this.f24008h += iA0;
            return r0VarT;
        }
        if (iA0 == 0) {
            return s0.f23949b;
        }
        if (iA0 < 0) {
            throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrF0 = f0(iA0);
        if (bArrF0 != null) {
            return s0.t(bArrF0, 0, bArrF0.length);
        }
        int i13 = this.f24008h;
        int i14 = this.f24006f;
        int i15 = i14 - i13;
        this.f24010j += i14;
        this.f24008h = 0;
        this.f24006f = 0;
        ArrayList<byte[]> arrayListG0 = g0(iA0 - i15);
        byte[] bArr2 = new byte[iA0];
        System.arraycopy(bArr, i13, bArr2, 0, i15);
        for (byte[] bArr3 : arrayListG0) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i15, length);
            i15 += length;
        }
        try {
            r0 r0Var = s0.f23949b;
            return iA0 == 0 ? s0.f23949b : new r0(bArr2);
        } catch (u1 e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final byte[] Q() throws u1 {
        int iA0 = a0();
        int i10 = this.f24006f;
        int i11 = this.f24008h;
        if (iA0 > i10 - i11 || iA0 <= 0) {
            if (iA0 >= 0) {
                return e0(iA0);
            }
            throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f24005e, i11, i11 + iA0);
        this.f24008h += iA0;
        return bArrCopyOfRange;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int R() {
        return a0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int S() {
        return a0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int T() {
        return i0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long W() {
        return j0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int X() {
        return fs1.y(a0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long Z() {
        return fs1.z(b0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int a0() {
        int i10;
        int i11 = this.f24008h;
        int i12 = this.f24006f;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f24005e;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f24008h = i13;
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
                this.f24008h = i14;
                return i10;
            }
        }
        return (int) h0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long b0() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f24008h;
        int i11 = this.f24006f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f24005e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f24008h = i12;
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
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            long j13 = (-2080896) ^ i18;
                            i13 = i17;
                            j10 = j13;
                        } else {
                            i15 = i10 + 5;
                            long j14 = ((long) i18) ^ (((long) bArr[i17]) << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                int i19 = i10 + 6;
                                long j15 = j14 ^ (((long) bArr[i15]) << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i15 = i10 + 7;
                                    j14 = j15 ^ (((long) bArr[i19]) << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i19 = i10 + 8;
                                        j15 = j14 ^ (((long) bArr[i15]) << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i15 = i10 + 9;
                                            j14 = j15 ^ (((long) bArr[i19]) << 56);
                                            if (j14 >= 0) {
                                                j11 = 71499008037633920L;
                                            } else {
                                                int i20 = i10 + 10;
                                                long j16 = j14 ^ (((long) bArr[i15]) << 63);
                                                if (j16 >= 0) {
                                                    j10 = j16 ^ (-9151873028817141888L);
                                                    i13 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                j10 = j15 ^ j12;
                                i13 = i19;
                            }
                            j10 = j14 ^ j11;
                        }
                    }
                    i13 = i15;
                }
                this.f24008h = i13;
                return j10;
            }
        }
        return h0();
    }

    public final void c0() {
        int i10 = this.f24006f + this.f24007g;
        this.f24006f = i10;
        int i11 = this.f24010j + i10;
        int i12 = this.f24011k;
        if (i11 <= i12) {
            this.f24007g = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f24007g = i13;
        this.f24006f = i10 - i13;
    }

    public final boolean d0(int i10) throws IOException {
        InputStream inputStream = this.f24004d;
        int i11 = this.f24008h;
        int i12 = i11 + i10;
        int i13 = this.f24006f;
        if (i12 <= i13) {
            throw new IllegalStateException(com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i10).length() + 66), "refillBuffer() called when ", i10, " bytes were already available in buffer"));
        }
        int i14 = this.f24010j;
        if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.f24011k) {
            return false;
        }
        byte[] bArr = this.f24005e;
        if (i11 > 0) {
            if (i13 > i11) {
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.f24010j + i11;
            this.f24010j = i14;
            i13 = this.f24006f - i11;
            this.f24006f = i13;
            this.f24008h = 0;
        }
        try {
            int i15 = inputStream.read(bArr, i13, Math.min(bArr.length - i13, (Integer.MAX_VALUE - i14) - i13));
            if (i15 != 0 && i15 >= -1 && i15 <= bArr.length) {
                if (i15 <= 0) {
                    return false;
                }
                this.f24006f += i15;
                c0();
                return this.f24006f >= i10 || d0(i10);
            }
            String strValueOf = String.valueOf(inputStream.getClass());
            StringBuilder sb2 = new StringBuilder(String.valueOf(i15).length() + strValueOf.length() + 39 + 41);
            sb2.append(strValueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(i15);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        } catch (u1 e10) {
            e10.f24012a = true;
            throw e10;
        }
    }

    public final byte[] e0(int i10) throws IOException {
        byte[] bArrF0 = f0(i10);
        if (bArrF0 != null) {
            return bArrF0;
        }
        int i11 = this.f24008h;
        int i12 = this.f24006f;
        int i13 = i12 - i11;
        this.f24010j += i12;
        this.f24008h = 0;
        this.f24006f = 0;
        ArrayList<byte[]> arrayListG0 = g0(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f24005e, i11, bArr, 0, i13);
        for (byte[] bArr2 : arrayListG0) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    public final byte[] f0(int i10) throws IOException {
        if (i10 == 0) {
            return q1.f23877a;
        }
        int i11 = this.f24010j;
        int i12 = this.f24008h;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw new u1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i14 = this.f24011k;
        if (i13 > i14) {
            t((i14 - i11) - i12);
            throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.f24006f - i12;
        int i16 = i10 - i15;
        InputStream inputStream = this.f24004d;
        if (i16 >= 4096) {
            try {
                if (i16 > inputStream.available()) {
                    return null;
                }
            } catch (u1 e10) {
                e10.f24012a = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f24005e, this.f24008h, bArr, 0, i15);
        this.f24010j += this.f24006f;
        this.f24008h = 0;
        this.f24006f = 0;
        while (i15 < i10) {
            try {
                int i17 = inputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f24010j += i17;
                i15 += i17;
            } catch (u1 e11) {
                e11.f24012a = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final ArrayList g0(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                try {
                    int i12 = this.f24004d.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.f24010j += i12;
                    i11 += i12;
                } catch (u1 e10) {
                    e10.f24012a = true;
                    throw e10;
                }
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final long h0() throws u1 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f24008h == this.f24006f) {
                i(1);
            }
            int i11 = this.f24008h;
            this.f24008h = i11 + 1;
            byte b10 = this.f24005e[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw new u1("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void i(int i10) throws u1 {
        if (d0(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f24010j) - this.f24008h) {
            throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new u1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final int i0() throws u1 {
        int i10 = this.f24008h;
        if (this.f24006f - i10 < 4) {
            i(4);
            i10 = this.f24008h;
        }
        this.f24008h = i10 + 4;
        byte[] bArr = this.f24005e;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int j(int i10) throws u1 {
        if (i10 < 0) {
            throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f24010j + this.f24008h + i10;
        if (i11 < 0) {
            throw new u1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.f24011k;
        if (i11 > i12) {
            throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f24011k = i11;
        c0();
        return i12;
    }

    public final long j0() throws u1 {
        int i10 = this.f24008h;
        if (this.f24006f - i10 < 8) {
            i(8);
            i10 = this.f24008h;
        }
        this.f24008h = i10 + 8;
        byte[] bArr = this.f24005e;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        long j14 = bArr[i10 + 4];
        return ((((long) bArr[i10 + 7]) & 255) << 56) | j11 | (j10 & 255) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void m(int i10) {
        this.f24011k = i10;
        c0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int n() {
        int i10 = this.f24011k;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f24010j + this.f24008h);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean o() {
        return this.f24008h == this.f24006f && !d0(1);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int p() {
        return this.f24010j + this.f24008h;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int r(byte[] bArr, int i10, int i11) throws IOException {
        if ((bArr.length - i10) - i11 < 0 || (i10 | i11) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f24006f;
        int i13 = this.f24008h;
        int i14 = i12 - i13;
        if (i14 > 0) {
            int iMin = Math.min(i11, i14);
            System.arraycopy(this.f24005e, this.f24008h, bArr, i10, iMin);
            this.f24008h += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i11, (this.f24011k - this.f24010j) - i13);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i15 = this.f24004d.read(bArr, i10, iMin2);
            if (i15 != -1) {
                this.f24010j += i15;
            }
            return i15;
        } catch (u1 e10) {
            e10.f24012a = true;
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void t(int i10) throws u1 {
        InputStream inputStream = this.f24004d;
        int i11 = this.f24006f;
        int i12 = this.f24008h;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f24008h = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f24010j;
        int i15 = i14 + i12;
        int i16 = this.f24011k;
        if (i15 + i10 > i16) {
            t((i16 - i14) - i12);
            throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f24010j = i15;
        this.f24006f = 0;
        this.f24008h = 0;
        while (i13 < i10) {
            long j10 = i10 - i13;
            try {
                try {
                    long jSkip = inputStream.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        String strValueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb2.append(strValueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(jSkip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (u1 e10) {
                    e10.f24012a = true;
                    throw e10;
                }
            } catch (Throwable th2) {
                this.f24010j += i13;
                c0();
                throw th2;
            }
        }
        this.f24010j += i13;
        c0();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.f24006f;
        int i18 = i17 - this.f24008h;
        this.f24008h = i17;
        i(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.f24006f;
            if (i19 <= i20) {
                this.f24008h = i19;
                return;
            } else {
                i18 += i20;
                this.f24008h = i20;
                i(1);
            }
        }
    }
}
