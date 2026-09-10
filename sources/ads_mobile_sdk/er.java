package ads_mobile_sdk;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import saneness.unready;

/* JADX INFO: loaded from: classes.dex */
public abstract class er extends hr {
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public er(byte[] bArr, int i, int i2, boolean z) {
        this.d = bArr;
        this.e = i2 + i;
        this.g = i;
        this.h = i;
    }

    public final long A() throws x81 {
        long j;
        long j2;
        long j3;
        int i = this.g;
        int i2 = this.e;
        long j4 = 0;
        if (i2 != i) {
            byte[] bArr = this.d;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j = (-2080896) ^ i9;
                            i4 = i8;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i10]) << 42);
                                    if (j6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            j6 = j7 ^ (((long) bArr[i10]) << 56);
                                            if (j6 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j8 = j6 ^ (((long) bArr[i4]) << 63);
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j7 ^ j3;
                                i4 = i10;
                            }
                            j = j2 ^ j6;
                        }
                    }
                }
                this.g = i4;
                return j;
            }
        }
        for (int i12 = 0; i12 < 64; i12 += 7) {
            int i13 = this.g;
            if (i13 == this.e) {
                throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr2 = this.d;
            this.g = i13 + 1;
            byte b2 = bArr2[i13];
            j4 |= ((long) (b2 & 127)) << i12;
            if ((b2 & 128) == 0) {
                return j4;
            }
        }
        throw new x81("CodedInputStream encountered a malformed varint.");
    }

    @Override // ads_mobile_sdk.hr
    public final void a(int i) throws x81 {
        if (this.i != i) {
            throw new x81("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // ads_mobile_sdk.hr
    public final boolean b() {
        return this.g == this.e;
    }

    @Override // ads_mobile_sdk.hr
    public final void c(int i) {
        this.j = i;
        int i2 = this.e + this.f;
        this.e = i2;
        int i3 = i2 - this.h;
        if (i3 <= i) {
            this.f = 0;
            return;
        }
        int i4 = i3 - i;
        this.f = i4;
        this.e = i2 - i4;
    }

    @Override // ads_mobile_sdk.hr
    public final int d(int i) {
        if (i < 0) {
            throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.g;
        int i3 = this.h;
        int i4 = (i2 - i3) + i;
        if (i4 < 0) {
            throw new x81("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.j;
        if (i4 > i5) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.j = i4;
        int i6 = this.e + this.f;
        this.e = i6;
        int i7 = i6 - i3;
        if (i7 <= i4) {
            this.f = 0;
            return i5;
        }
        int i8 = i7 - i4;
        this.f = i8;
        this.e = i6 - i8;
        return i5;
    }

    @Override // ads_mobile_sdk.hr
    public final double e() {
        return Double.longBitsToDouble(w());
    }

    @Override // ads_mobile_sdk.hr
    public final int f() {
        return x();
    }

    @Override // ads_mobile_sdk.hr
    public final int g() {
        return v();
    }

    @Override // ads_mobile_sdk.hr
    public final long h() {
        return w();
    }

    @Override // ads_mobile_sdk.hr
    public final float i() {
        return Float.intBitsToFloat(v());
    }

    @Override // ads_mobile_sdk.hr
    public final int j() {
        return x();
    }

    @Override // ads_mobile_sdk.hr
    public final long k() {
        return A();
    }

    @Override // ads_mobile_sdk.hr
    public final int l() {
        return v();
    }

    @Override // ads_mobile_sdk.hr
    public final long m() {
        return w();
    }

    @Override // ads_mobile_sdk.hr
    public final int n() {
        return hr.b(y());
    }

    @Override // ads_mobile_sdk.hr
    public final long o() {
        return hr.a(A());
    }

    @Override // ads_mobile_sdk.hr
    public final String p() throws x81 {
        int iY = y();
        if (iY > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iY <= i - i2) {
                String str = new String(this.d, i2, iY, StandardCharsets.UTF_8);
                this.g += iY;
                return str;
            }
        }
        if (iY == 0) {
            return "";
        }
        if (iY < 0) {
            throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // ads_mobile_sdk.hr
    public final String q() throws x81 {
        int iY = y();
        String strSaneness = "";
        if (iY > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iY <= i - i2) {
                byte[] bArr = this.d;
                if (iY == 0) {
                    unready unreadyVar = t63.a;
                } else {
                    strSaneness = t63.a.saneness(bArr, i2, iY);
                }
                this.g += iY;
                return strSaneness;
            }
        }
        if (iY == 0) {
            return "";
        }
        if (iY <= 0) {
            throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // ads_mobile_sdk.hr
    public final int r() throws x81 {
        if (b()) {
            this.i = 0;
            return 0;
        }
        int iY = y();
        this.i = iY;
        if ((iY >>> 3) != 0) {
            return iY;
        }
        throw new x81("Protocol message contained an invalid tag (zero).");
    }

    @Override // ads_mobile_sdk.hr
    public final int s() {
        return y();
    }

    @Override // ads_mobile_sdk.hr
    public final long t() {
        return A();
    }

    public final int v() throws x81 {
        int i = this.g;
        if (this.e - i < 4) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.d;
        this.g = i + 4;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public final long w() throws x81 {
        int i = this.g;
        if (this.e - i < 8) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.d;
        this.g = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public abstract int x();

    public abstract int y();

    /* JADX WARN: Code duplicated, block: B:49:0x00a2 A[PHI: r3
  0x00a2: PHI (r3v11 int) = (r3v10 int), (r3v13 int) binds: [B:25:0x0053, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    public final int z() throws x81 {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            byte[] bArr = this.d;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                            i5 = i9;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                int i12 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i12] < 0) {
                                                int i13 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i7 = i13;
                                                }
                                            }
                                        } else {
                                            i7 = i12;
                                        }
                                    }
                                } else {
                                    i7 = i12;
                                }
                            }
                            i = i11;
                        }
                    }
                    i5 = i7;
                }
                this.g = i5;
                return i;
            }
        }
        long j = 0;
        for (int i14 = 0; i14 < 64; i14 += 7) {
            int i15 = this.g;
            if (i15 == this.e) {
                throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr2 = this.d;
            this.g = i15 + 1;
            byte b3 = bArr2[i15];
            j |= ((long) (b3 & 127)) << i14;
            if ((b3 & 128) == 0) {
                return (int) j;
            }
        }
        throw new x81("CodedInputStream encountered a malformed varint.");
    }

    @Override // ads_mobile_sdk.hr
    public final boolean e(int i) throws x81 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.e - this.g >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.d;
                    int i4 = this.g;
                    this.g = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw new x81("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                int i5 = this.g;
                if (i5 == this.e) {
                    throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.d;
                this.g = i5 + 1;
                if (bArr2[i5] < 0) {
                    i3++;
                }
            }
            throw new x81("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            f(8);
            return true;
        }
        if (i2 == 2) {
            f(y());
            return true;
        }
        if (i2 == 3) {
            u();
            a(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            if (this.b == 0) {
                a(0);
            }
            return false;
        }
        if (i2 == 5) {
            f(4);
            return true;
        }
        int i6 = x81.b;
        throw new w81();
    }

    public final void f(int i) throws x81 {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                this.g = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // ads_mobile_sdk.hr
    public final int a() {
        return this.g - this.h;
    }

    @Override // ads_mobile_sdk.hr
    public final boolean c() {
        return A() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    @Override // ads_mobile_sdk.hr
    public final in d() throws x81 {
        byte[] bArrCopyOfRange;
        int iY = y();
        if (iY > 0) {
            int i = this.e;
            int i2 = this.g;
            if (iY <= i - i2) {
                in inVarB = kn.b(this.d, i2, iY);
                this.g += iY;
                return inVarB;
            }
        }
        if (iY == 0) {
            return kn.b;
        }
        if (iY > 0) {
            int i3 = this.e;
            int i4 = this.g;
            if (iY <= i3 - i4) {
                int i5 = iY + i4;
                this.g = i5;
                bArrCopyOfRange = Arrays.copyOfRange(this.d, i4, i5);
            } else {
                if (iY <= 0) {
                    throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (iY == 0) {
                    bArrCopyOfRange = r21.a;
                } else {
                    throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
            }
        } else {
            if (iY <= 0) {
                throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (iY == 0) {
                bArrCopyOfRange = r21.a;
            } else {
                throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        in inVar = kn.b;
        if (bArrCopyOfRange.length == 0) {
            return kn.b;
        }
        return new in(bArrCopyOfRange);
    }
}
