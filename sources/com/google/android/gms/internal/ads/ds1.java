package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ds1 extends fs1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13668i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13669j = Integer.MAX_VALUE;

    public /* synthetic */ ds1(byte[] bArr, int i10, int i11) {
        this.f13663d = bArr;
        this.f13664e = i11 + i10;
        this.f13666g = i10;
        this.f13667h = i10;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int A() throws et1 {
        if (k()) {
            this.f13668i = 0;
            return 0;
        }
        int iF0 = f0();
        this.f13668i = iF0;
        if ((iF0 >>> 3) != 0) {
            return iF0;
        }
        throw new et1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void B(int i10) throws et1 {
        if (this.f13668i != i10) {
            throw new et1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean C(int i10) throws et1 {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                d0(8);
                return true;
            }
            if (i11 == 2) {
                d0(f0());
                return true;
            }
            if (i11 == 3) {
                s();
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
                throw new dt1();
            }
            d0(4);
            return true;
        }
        int i13 = this.f13664e - this.f13666g;
        byte[] bArr = this.f13663d;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f13666g;
                this.f13666g = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw new et1("CodedInputStream encountered a malformed varint.");
        }
        while (i12 < 10) {
            int i15 = this.f13666g;
            if (i15 == this.f13664e) {
                throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f13666g = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw new et1("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final double D() {
        return Double.longBitsToDouble(c0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final float E() {
        return Float.intBitsToFloat(i0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long F() {
        return g0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long G() {
        return g0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int H() {
        return f0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long I() {
        return c0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int J() {
        return i0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean K() {
        return g0() != 0;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final String L() throws et1 {
        int iF0 = f0();
        if (iF0 > 0) {
            int i10 = this.f13664e;
            int i11 = this.f13666g;
            if (iF0 <= i10 - i11) {
                String str = new String(this.f13663d, i11, iF0, StandardCharsets.UTF_8);
                this.f13666g += iF0;
                return str;
            }
        }
        if (iF0 == 0) {
            return "";
        }
        if (iF0 < 0) {
            throw new et1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final String M() throws et1 {
        int iF0 = f0();
        if (iF0 > 0) {
            int i10 = this.f13664e;
            int i11 = this.f13666g;
            if (iF0 <= i10 - i11) {
                String strD = pu1.d(this.f13663d, i11, iF0);
                this.f13666g += iF0;
                return strD;
            }
        }
        if (iF0 == 0) {
            return "";
        }
        if (iF0 <= 0) {
            throw new et1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final as1 N() throws et1 {
        int iF0 = f0();
        byte[] bArr = this.f13663d;
        if (iF0 > 0) {
            int i10 = this.f13664e;
            int i11 = this.f13666g;
            if (iF0 <= i10 - i11) {
                as1 as1VarE = cs1.E(bArr, i11, iF0);
                this.f13666g += iF0;
                return as1VarE;
            }
        }
        if (iF0 == 0) {
            return cs1.f13248b;
        }
        if (iF0 > 0) {
            int i12 = this.f13664e;
            int i13 = this.f13666g;
            if (iF0 <= i12 - i13) {
                int i14 = iF0 + i13;
                this.f13666g = i14;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
                as1 as1Var = cs1.f13248b;
                return bArrCopyOfRange.length == 0 ? cs1.f13248b : new as1(bArrCopyOfRange);
            }
        }
        if (iF0 <= 0) {
            throw new et1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int P() {
        return f0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int R() {
        return f0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int S() {
        return i0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long U() {
        return c0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int V() {
        return fs1.u(f0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long Y() {
        return fs1.w(g0());
    }

    public final long c0() throws et1 {
        int i10 = this.f13666g;
        if (this.f13664e - i10 < 8) {
            throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f13666g = i10 + 8;
        byte[] bArr = this.f13663d;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        long j14 = bArr[i10 + 4];
        return ((((long) bArr[i10 + 7]) & 255) << 56) | j11 | (j10 & 255) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final void d0(int i10) throws et1 {
        if (i10 >= 0) {
            int i11 = this.f13664e;
            int i12 = this.f13666g;
            if (i10 <= i11 - i12) {
                this.f13666g = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new et1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final void e0() {
        int i10 = this.f13664e + this.f13665f;
        this.f13664e = i10;
        int i11 = i10 - this.f13667h;
        int i12 = this.f13669j;
        if (i11 <= i12) {
            this.f13665f = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f13665f = i13;
        this.f13664e = i10 - i13;
    }

    public final int f0() {
        int i10;
        int i11 = this.f13666g;
        int i12 = this.f13664e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f13663d;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f13666g = i13;
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
                this.f13666g = i14;
                return i10;
            }
        }
        return (int) h0();
    }

    public final long g0() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f13666g;
        int i11 = this.f13664e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f13663d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f13666g = i12;
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
                this.f13666g = i13;
                return j10;
            }
        }
        return h0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int h(int i10) throws et1 {
        if (i10 < 0) {
            throw new et1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = (this.f13666g - this.f13667h) + i10;
        if (i11 < 0) {
            throw new et1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.f13669j;
        if (i11 > i12) {
            throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f13669j = i11;
        e0();
        return i12;
    }

    public final long h0() throws et1 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f13666g;
            if (i11 == this.f13664e) {
                throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f13666g = i11 + 1;
            byte b10 = this.f13663d[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw new et1("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void i(int i10) {
        this.f13669j = i10;
        e0();
    }

    public final int i0() throws et1 {
        int i10 = this.f13666g;
        if (this.f13664e - i10 < 4) {
            throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f13666g = i10 + 4;
        byte[] bArr = this.f13663d;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean k() {
        return this.f13666g == this.f13664e;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int l() {
        return this.f13666g - this.f13667h;
    }
}
