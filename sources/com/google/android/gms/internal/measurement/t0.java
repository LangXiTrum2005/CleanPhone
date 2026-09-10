package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.fs1;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends fs1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f23973d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23975f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23978i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23974e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23976g = 0;

    public /* synthetic */ t0(byte[] bArr) {
        this.f23973d = bArr;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int A() throws u1 {
        if (o()) {
            this.f23977h = 0;
            return 0;
        }
        int iG0 = g0();
        this.f23977h = iG0;
        if ((iG0 >>> 3) != 0) {
            return iG0;
        }
        throw new u1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void B(int i10) throws u1 {
        if (this.f23977h != i10) {
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
                t(g0());
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
        int i13 = this.f23974e - this.f23976g;
        byte[] bArr = this.f23973d;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f23976g;
                this.f23976g = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw new u1("CodedInputStream encountered a malformed varint.");
        }
        while (i12 < 10) {
            int i15 = this.f23976g;
            if (i15 == this.f23974e) {
                throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f23976g = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw new u1("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final double D() {
        return Double.longBitsToDouble(e0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final float E() {
        return Float.intBitsToFloat(d0());
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
        return g0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long I() {
        return e0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int J() {
        return d0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean K() {
        return b0() != 0;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final String L() throws u1 {
        int iG0 = g0();
        if (iG0 > 0) {
            int i10 = this.f23974e;
            int i11 = this.f23976g;
            if (iG0 <= i10 - i11) {
                String str = new String(this.f23973d, i11, iG0, StandardCharsets.UTF_8);
                this.f23976g += iG0;
                return str;
            }
        }
        if (iG0 == 0) {
            return "";
        }
        if (iG0 < 0) {
            throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final String M() throws u1 {
        int iG0 = g0();
        if (iG0 > 0) {
            int i10 = this.f23974e;
            int i11 = this.f23976g;
            if (iG0 <= i10 - i11) {
                String strD = b3.d(this.f23973d, i11, iG0);
                this.f23976g += iG0;
                return strD;
            }
        }
        if (iG0 == 0) {
            return "";
        }
        if (iG0 <= 0) {
            throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final r0 O() throws u1 {
        int iG0 = g0();
        if (iG0 > 0) {
            int i10 = this.f23974e;
            int i11 = this.f23976g;
            if (iG0 <= i10 - i11) {
                r0 r0VarT = s0.t(this.f23973d, i11, iG0);
                this.f23976g += iG0;
                return r0VarT;
            }
        }
        if (iG0 == 0) {
            return s0.f23949b;
        }
        byte[] bArrF0 = f0(iG0);
        r0 r0Var = s0.f23949b;
        return bArrF0.length == 0 ? s0.f23949b : new r0(bArrF0);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final byte[] Q() {
        return f0(g0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int R() {
        return g0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int S() {
        return g0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int T() {
        return d0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long W() {
        return e0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int X() {
        return fs1.y(g0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long Z() {
        return fs1.z(b0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int a0() {
        return g0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long b0() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f23976g;
        int i11 = this.f23974e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f23973d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f23976g = i12;
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
                this.f23976g = i13;
                return j10;
            }
        }
        return c0();
    }

    public final long c0() throws u1 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f23976g;
            if (i11 == this.f23974e) {
                throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f23976g = i11 + 1;
            byte b10 = this.f23973d[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw new u1("CodedInputStream encountered a malformed varint.");
    }

    public final int d0() throws u1 {
        int i10 = this.f23976g;
        if (this.f23974e - i10 < 4) {
            throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f23976g = i10 + 4;
        byte[] bArr = this.f23973d;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final long e0() throws u1 {
        int i10 = this.f23976g;
        if (this.f23974e - i10 < 8) {
            throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f23976g = i10 + 8;
        byte[] bArr = this.f23973d;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        long j14 = bArr[i10 + 4];
        return ((((long) bArr[i10 + 7]) & 255) << 56) | j11 | (j10 & 255) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final byte[] f0(int i10) throws u1 {
        if (i10 > 0) {
            int i11 = this.f23974e;
            int i12 = this.f23976g;
            if (i10 <= i11 - i12) {
                int i13 = i10 + i12;
                this.f23976g = i13;
                return Arrays.copyOfRange(this.f23973d, i12, i13);
            }
        }
        if (i10 > 0) {
            throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            return q1.f23877a;
        }
        throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int g0() {
        int i10;
        int i11 = this.f23976g;
        int i12 = this.f23974e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f23973d;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f23976g = i13;
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
                this.f23976g = i14;
                return i10;
            }
        }
        return (int) c0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int j(int i10) {
        if (i10 < 0) {
            throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + this.f23976g;
        if (i11 < 0) {
            throw new u1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.f23978i;
        if (i11 > i12) {
            throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f23978i = i11;
        int i13 = this.f23974e + this.f23975f;
        this.f23974e = i13;
        if (i13 <= i11) {
            this.f23975f = 0;
            return i12;
        }
        int i14 = i13 - i11;
        this.f23975f = i14;
        this.f23974e = i13 - i14;
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void m(int i10) {
        this.f23978i = i10;
        int i11 = this.f23974e + this.f23975f;
        this.f23974e = i11;
        if (i11 <= i10) {
            this.f23975f = 0;
            return;
        }
        int i12 = i11 - i10;
        this.f23975f = i12;
        this.f23974e = i11 - i12;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int n() {
        int i10 = this.f23978i;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - this.f23976g;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean o() {
        return this.f23976g == this.f23974e;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int p() {
        return this.f23976g;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int r(byte[] bArr, int i10, int i11) {
        if ((bArr.length - i10) - i11 < 0 || (i10 | i11) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(i11, this.f23974e - this.f23976g);
        if (iMin == 0) {
            return -1;
        }
        System.arraycopy(this.f23973d, this.f23976g, bArr, i10, iMin);
        this.f23976g += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void t(int i10) throws u1 {
        if (i10 >= 0) {
            int i11 = this.f23974e;
            int i12 = this.f23976g;
            if (i10 <= i11 - i12) {
                this.f23976g = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new u1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
