package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class es1 extends fs1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputStream f14067d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14070g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14072i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14074k = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f14068e = new byte[4096];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14069f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14071h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14073j = 0;

    public /* synthetic */ es1(InputStream inputStream) {
        this.f14067d = inputStream;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int A() throws et1 {
        if (k()) {
            this.f14072i = 0;
            return 0;
        }
        int iJ0 = j0();
        this.f14072i = iJ0;
        if ((iJ0 >>> 3) != 0) {
            return iJ0;
        }
        throw new et1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void B(int i10) throws et1 {
        if (this.f14072i != i10) {
            throw new et1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean C(int i10) throws et1 {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                c0(8);
                return true;
            }
            if (i11 == 2) {
                c0(j0());
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
            c0(4);
            return true;
        }
        int i13 = this.f14069f - this.f14071h;
        byte[] bArr = this.f14068e;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f14071h;
                this.f14071h = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw new et1("CodedInputStream encountered a malformed varint.");
        }
        while (i12 < 10) {
            if (this.f14071h == this.f14069f) {
                e0(1);
            }
            int i15 = this.f14071h;
            this.f14071h = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw new et1("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final double D() {
        return Double.longBitsToDouble(m0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final float E() {
        return Float.intBitsToFloat(a0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long F() {
        return k0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long G() {
        return k0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int H() {
        return j0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long I() {
        return m0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int J() {
        return a0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean K() {
        return k0() != 0;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final String L() throws et1 {
        int iJ0 = j0();
        byte[] bArr = this.f14068e;
        if (iJ0 > 0) {
            int i10 = this.f14069f;
            int i11 = this.f14071h;
            if (iJ0 <= i10 - i11) {
                String str = new String(bArr, i11, iJ0, StandardCharsets.UTF_8);
                this.f14071h += iJ0;
                return str;
            }
        }
        if (iJ0 == 0) {
            return "";
        }
        if (iJ0 < 0) {
            throw new et1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iJ0 > this.f14069f) {
            return new String(g0(iJ0), StandardCharsets.UTF_8);
        }
        e0(iJ0);
        String str2 = new String(bArr, this.f14071h, iJ0, StandardCharsets.UTF_8);
        this.f14071h += iJ0;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final String M() throws IOException {
        int iJ0 = j0();
        int i10 = this.f14071h;
        int i11 = this.f14069f;
        int i12 = i11 - i10;
        byte[] bArrG0 = this.f14068e;
        if (iJ0 <= i12 && iJ0 > 0) {
            this.f14071h = i10 + iJ0;
        } else {
            if (iJ0 == 0) {
                return "";
            }
            if (iJ0 < 0) {
                throw new et1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i10 = 0;
            if (iJ0 <= i11) {
                e0(iJ0);
                this.f14071h = iJ0;
            } else {
                bArrG0 = g0(iJ0);
            }
        }
        return pu1.d(bArrG0, i10, iJ0);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final as1 N() throws IOException {
        int iJ0 = j0();
        int i10 = this.f14069f;
        int i11 = this.f14071h;
        int i12 = i10 - i11;
        byte[] bArr = this.f14068e;
        if (iJ0 <= i12 && iJ0 > 0) {
            as1 as1VarE = cs1.E(bArr, i11, iJ0);
            this.f14071h += iJ0;
            return as1VarE;
        }
        if (iJ0 == 0) {
            return cs1.f13248b;
        }
        if (iJ0 < 0) {
            throw new et1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrH0 = h0(iJ0);
        if (bArrH0 != null) {
            return cs1.E(bArrH0, 0, bArrH0.length);
        }
        int i13 = this.f14071h;
        int i14 = this.f14069f;
        int i15 = i14 - i13;
        this.f14073j += i14;
        this.f14071h = 0;
        this.f14069f = 0;
        ArrayList<byte[]> arrayListI0 = i0(iJ0 - i15);
        byte[] bArr2 = new byte[iJ0];
        System.arraycopy(bArr, i13, bArr2, 0, i15);
        for (byte[] bArr3 : arrayListI0) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i15, length);
            i15 += length;
        }
        as1 as1Var = cs1.f13248b;
        try {
            return iJ0 == 0 ? cs1.f13248b : new as1(bArr2);
        } catch (et1 e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int P() {
        return j0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int R() {
        return j0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int S() {
        return a0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long U() {
        return m0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int V() {
        return fs1.u(j0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final long Y() {
        return fs1.w(k0());
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int a0() throws et1 {
        int i10 = this.f14071h;
        if (this.f14069f - i10 < 4) {
            e0(4);
            i10 = this.f14071h;
        }
        this.f14071h = i10 + 4;
        byte[] bArr = this.f14068e;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final void c0(int i10) throws et1 {
        InputStream inputStream = this.f14067d;
        int i11 = this.f14069f;
        int i12 = this.f14071h;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f14071h = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new et1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f14073j;
        int i15 = i14 + i12;
        int i16 = this.f14074k;
        if (i15 + i10 > i16) {
            c0((i16 - i14) - i12);
            throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f14073j = i15;
        this.f14069f = 0;
        this.f14071h = 0;
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
                } catch (et1 e10) {
                    e10.f14078a = true;
                    throw e10;
                }
            } catch (Throwable th2) {
                this.f14073j += i13;
                d0();
                throw th2;
            }
        }
        this.f14073j += i13;
        d0();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.f14069f;
        int i18 = i17 - this.f14071h;
        this.f14071h = i17;
        e0(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.f14069f;
            if (i19 <= i20) {
                this.f14071h = i19;
                return;
            } else {
                i18 += i20;
                this.f14071h = i20;
                e0(1);
            }
        }
    }

    public final void d0() {
        int i10 = this.f14069f + this.f14070g;
        this.f14069f = i10;
        int i11 = this.f14073j + i10;
        int i12 = this.f14074k;
        if (i11 <= i12) {
            this.f14070g = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f14070g = i13;
        this.f14069f = i10 - i13;
    }

    public final void e0(int i10) throws et1 {
        if (f0(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f14073j) - this.f14071h) {
            throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new et1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final boolean f0(int i10) throws IOException {
        InputStream inputStream = this.f14067d;
        int i11 = this.f14071h;
        int i12 = i11 + i10;
        int i13 = this.f14069f;
        if (i12 <= i13) {
            throw new IllegalStateException(com.applovin.impl.ca.m(new StringBuilder(String.valueOf(i10).length() + 66), "refillBuffer() called when ", i10, " bytes were already available in buffer"));
        }
        int i14 = this.f14073j;
        if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.f14074k) {
            return false;
        }
        byte[] bArr = this.f14068e;
        if (i11 > 0) {
            if (i13 > i11) {
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.f14073j + i11;
            this.f14073j = i14;
            i13 = this.f14069f - i11;
            this.f14069f = i13;
            this.f14071h = 0;
        }
        try {
            int i15 = inputStream.read(bArr, i13, Math.min(4096 - i13, (Integer.MAX_VALUE - i14) - i13));
            if (i15 != 0 && i15 >= -1 && i15 <= 4096) {
                if (i15 <= 0) {
                    return false;
                }
                this.f14069f += i15;
                d0();
                return this.f14069f >= i10 || f0(i10);
            }
            String strValueOf = String.valueOf(inputStream.getClass());
            StringBuilder sb2 = new StringBuilder(String.valueOf(i15).length() + strValueOf.length() + 39 + 41);
            sb2.append(strValueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(i15);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        } catch (et1 e10) {
            e10.f14078a = true;
            throw e10;
        }
    }

    public final byte[] g0(int i10) throws IOException {
        byte[] bArrH0 = h0(i10);
        if (bArrH0 != null) {
            return bArrH0;
        }
        int i11 = this.f14071h;
        int i12 = this.f14069f;
        int i13 = i12 - i11;
        this.f14073j += i12;
        this.f14071h = 0;
        this.f14069f = 0;
        ArrayList<byte[]> arrayListI0 = i0(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f14068e, i11, bArr, 0, i13);
        for (byte[] bArr2 : arrayListI0) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int h(int i10) throws et1 {
        if (i10 < 0) {
            throw new et1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f14073j + this.f14071h + i10;
        if (i11 < 0) {
            throw new et1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.f14074k;
        if (i11 > i12) {
            throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f14074k = i11;
        d0();
        return i12;
    }

    public final byte[] h0(int i10) throws IOException {
        if (i10 == 0) {
            return bt1.f12888a;
        }
        int i11 = this.f14073j;
        int i12 = this.f14071h;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw new et1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i14 = this.f14074k;
        if (i13 > i14) {
            c0((i14 - i11) - i12);
            throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.f14069f - i12;
        int i16 = i10 - i15;
        InputStream inputStream = this.f14067d;
        if (i16 >= 4096) {
            try {
                if (i16 > inputStream.available()) {
                    return null;
                }
            } catch (et1 e10) {
                e10.f14078a = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f14068e, this.f14071h, bArr, 0, i15);
        this.f14073j += this.f14069f;
        this.f14071h = 0;
        this.f14069f = 0;
        while (i15 < i10) {
            try {
                int i17 = inputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f14073j += i17;
                i15 += i17;
            } catch (et1 e11) {
                e11.f14078a = true;
                throw e11;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final void i(int i10) {
        this.f14074k = i10;
        d0();
    }

    public final ArrayList i0(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                try {
                    int i12 = this.f14067d.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw new et1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.f14073j += i12;
                    i11 += i12;
                } catch (et1 e10) {
                    e10.f14078a = true;
                    throw e10;
                }
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int j0() {
        int i10;
        int i11 = this.f14071h;
        int i12 = this.f14069f;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f14068e;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f14071h = i13;
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
                this.f14071h = i14;
                return i10;
            }
        }
        return (int) l0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final boolean k() {
        return this.f14071h == this.f14069f && !f0(1);
    }

    public final long k0() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f14071h;
        int i11 = this.f14069f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f14068e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f14071h = i12;
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
                this.f14071h = i13;
                return j10;
            }
        }
        return l0();
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int l() {
        return this.f14073j + this.f14071h;
    }

    public final long l0() throws et1 {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f14071h == this.f14069f) {
                e0(1);
            }
            int i11 = this.f14071h;
            this.f14071h = i11 + 1;
            byte b10 = this.f14068e[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw new et1("CodedInputStream encountered a malformed varint.");
    }

    public final long m0() throws et1 {
        int i10 = this.f14071h;
        if (this.f14069f - i10 < 8) {
            e0(8);
            i10 = this.f14071h;
        }
        this.f14071h = i10 + 8;
        byte[] bArr = this.f14068e;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        long j14 = bArr[i10 + 4];
        return ((((long) bArr[i10 + 7]) & 255) << 56) | j11 | (j10 & 255) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
