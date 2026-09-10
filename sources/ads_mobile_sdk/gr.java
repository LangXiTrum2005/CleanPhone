package ads_mobile_sdk;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import saneness.unready;

/* JADX INFO: loaded from: classes.dex */
public final class gr extends hr {
    public final InputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public gr(InputStream inputStream) {
        r21.a(inputStream, "input");
        this.d = inputStream;
        this.e = new byte[4096];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    @Override // ads_mobile_sdk.hr
    public final void a(int i) throws x81 {
        if (this.i != i) {
            throw new x81("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // ads_mobile_sdk.hr
    public final boolean b() {
        return this.h == this.f && !l(1);
    }

    @Override // ads_mobile_sdk.hr
    public final void c(int i) {
        this.k = i;
        z();
    }

    @Override // ads_mobile_sdk.hr
    public final int d(int i) throws x81 {
        if (i < 0) {
            throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.j + this.h + i;
        if (i2 < 0) {
            throw new x81("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.k;
        if (i2 > i3) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.k = i2;
        z();
        return i3;
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
        return y();
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
        return hr.b(x());
    }

    @Override // ads_mobile_sdk.hr
    public final long o() {
        return hr.a(y());
    }

    @Override // ads_mobile_sdk.hr
    public final String p() throws x81 {
        int iX = x();
        if (iX > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iX <= i - i2) {
                String str = new String(this.e, i2, iX, StandardCharsets.UTF_8);
                this.h += iX;
                return str;
            }
        }
        if (iX == 0) {
            return "";
        }
        if (iX < 0) {
            throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iX > this.f) {
            return new String(f(iX), StandardCharsets.UTF_8);
        }
        i(iX);
        String str2 = new String(this.e, this.h, iX, StandardCharsets.UTF_8);
        this.h += iX;
        return str2;
    }

    @Override // ads_mobile_sdk.hr
    public final String q() throws IOException {
        byte[] bArrF;
        int iX = x();
        int i = this.h;
        int i2 = this.f;
        if (iX <= i2 - i && iX > 0) {
            bArrF = this.e;
            this.h = i + iX;
        } else {
            if (iX == 0) {
                return "";
            }
            if (iX < 0) {
                throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (iX <= i2) {
                i(iX);
                bArrF = this.e;
                this.h = iX;
            } else {
                bArrF = f(iX);
            }
        }
        if (iX != 0) {
            return t63.a.saneness(bArrF, i, iX);
        }
        unready unreadyVar = t63.a;
        return "";
    }

    @Override // ads_mobile_sdk.hr
    public final int r() throws x81 {
        if (b()) {
            this.i = 0;
            return 0;
        }
        int iX = x();
        this.i = iX;
        if ((iX >>> 3) != 0) {
            return iX;
        }
        throw new x81("Protocol message contained an invalid tag (zero).");
    }

    @Override // ads_mobile_sdk.hr
    public final int s() {
        return x();
    }

    @Override // ads_mobile_sdk.hr
    public final long t() {
        return y();
    }

    public final int v() throws x81 {
        int i = this.h;
        if (this.f - i < 4) {
            i(4);
            i = this.h;
        }
        byte[] bArr = this.e;
        this.h = i + 4;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public final long w() throws x81 {
        int i = this.h;
        if (this.f - i < 8) {
            i(8);
            i = this.h;
        }
        byte[] bArr = this.e;
        this.h = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a0 A[PHI: r3
  0x00a0: PHI (r3v13 int) = (r3v12 int), (r3v15 int) binds: [B:25:0x0053, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    public final int x() throws x81 {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            byte[] bArr = this.e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
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
                this.h = i5;
                return i;
            }
        }
        long j = 0;
        for (int i14 = 0; i14 < 64; i14 += 7) {
            if (this.h == this.f) {
                i(1);
            }
            byte[] bArr2 = this.e;
            int i15 = this.h;
            this.h = i15 + 1;
            byte b3 = bArr2[i15];
            j |= ((long) (b3 & 127)) << i14;
            if ((b3 & 128) == 0) {
                return (int) j;
            }
        }
        throw new x81("CodedInputStream encountered a malformed varint.");
    }

    public final long y() throws x81 {
        long j;
        long j2;
        long j3;
        int i = this.h;
        int i2 = this.f;
        long j4 = 0;
        if (i2 != i) {
            byte[] bArr = this.e;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
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
                this.h = i4;
                return j;
            }
        }
        for (int i12 = 0; i12 < 64; i12 += 7) {
            if (this.h == this.f) {
                i(1);
            }
            byte[] bArr2 = this.e;
            int i13 = this.h;
            this.h = i13 + 1;
            byte b2 = bArr2[i13];
            j4 |= ((long) (b2 & 127)) << i12;
            if ((b2 & 128) == 0) {
                return j4;
            }
        }
        throw new x81("CodedInputStream encountered a malformed varint.");
    }

    public final void z() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j + i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    @Override // ads_mobile_sdk.hr
    public final boolean e(int i) throws x81 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f - this.h >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.e;
                    int i4 = this.h;
                    this.h = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw new x81("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                if (this.h == this.f) {
                    i(1);
                }
                byte[] bArr2 = this.e;
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr2[i5] < 0) {
                    i3++;
                }
            }
            throw new x81("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            j(8);
            return true;
        }
        if (i2 == 2) {
            j(x());
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
            j(4);
            return true;
        }
        int i6 = x81.b;
        throw new w81();
    }

    public final byte[] f(int i) throws IOException {
        byte[] bArrG = g(i);
        if (bArrG != null) {
            return bArrG;
        }
        int i2 = this.h;
        int i3 = this.f;
        int length = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList<byte[]> arrayListH = h(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListH) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] g(int i) throws IOException {
        if (i == 0) {
            return r21.a;
        }
        if (i < 0) {
            throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new x81("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.k;
        if (i4 > i5) {
            j((i5 - i2) - i3);
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.f - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.d.available()) {
                    return null;
                }
            } catch (x81 e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, this.h, bArr, 0, i6);
        this.j += this.f;
        this.h = 0;
        this.f = 0;
        while (i6 < i) {
            try {
                int i8 = this.d.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.j += i8;
                i6 += i8;
            } catch (x81 e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList h(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.d.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.j += i3;
                    i2 += i3;
                } catch (x81 e) {
                    e.a = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void i(int i) throws x81 {
        if (l(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.j) - this.h) {
            throw new x81("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new x81("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final void j(int i) throws x81 {
        int i2 = this.f;
        int i3 = this.h;
        if (i > i2 - i3 || i < 0) {
            k(i);
        } else {
            this.h = i3 + i;
        }
    }

    public final void k(int i) throws x81 {
        if (i < 0) {
            throw x81.b();
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i2 + i3;
        int i5 = i4 + i;
        int i6 = this.k;
        if (i5 > i6) {
            j((i6 - i2) - i3);
            throw x81.d();
        }
        this.j = i4;
        int i7 = this.f - i3;
        this.f = 0;
        this.h = 0;
        while (i7 < i) {
            try {
                long j = i - i7;
                try {
                    long jSkip = this.d.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(this.d.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i7 += (int) jSkip;
                    }
                } catch (x81 e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.j += i7;
                z();
                throw th;
            }
        }
        this.j += i7;
        z();
        if (i7 >= i) {
            return;
        }
        int i8 = this.f;
        int i9 = i8 - this.h;
        this.h = i8;
        i(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.f;
            if (i10 <= i11) {
                this.h = i10;
                return;
            } else {
                i9 += i11;
                this.h = i11;
                i(1);
            }
        }
    }

    public final boolean l(int i) throws IOException {
        int i2 = this.h;
        int i3 = i2 + i;
        int i4 = this.f;
        if (i3 <= i4) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i5 = this.j;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.k) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.e;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            this.j += i2;
            this.f -= i2;
            this.h = 0;
        }
        InputStream inputStream = this.d;
        byte[] bArr2 = this.e;
        int i6 = this.f;
        try {
            int i7 = inputStream.read(bArr2, i6, Math.min(bArr2.length - i6, (Integer.MAX_VALUE - this.j) - i6));
            if (i7 != 0 && i7 >= -1 && i7 <= this.e.length) {
                if (i7 <= 0) {
                    return false;
                }
                this.f += i7;
                z();
                return this.f >= i || l(i);
            }
            throw new IllegalStateException(String.valueOf(this.d.getClass()) + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
        } catch (x81 e) {
            e.a = true;
            throw e;
        }
    }

    @Override // ads_mobile_sdk.hr
    public final boolean c() {
        return y() != 0;
    }

    @Override // ads_mobile_sdk.hr
    public final int a() {
        return this.j + this.h;
    }

    @Override // ads_mobile_sdk.hr
    public final in d() throws IOException {
        int iX = x();
        int i = this.f;
        int i2 = this.h;
        if (iX <= i - i2 && iX > 0) {
            in inVarB = kn.b(this.e, i2, iX);
            this.h += iX;
            return inVarB;
        }
        if (iX == 0) {
            return kn.b;
        }
        if (iX >= 0) {
            byte[] bArrG = g(iX);
            if (bArrG != null) {
                return kn.b(bArrG, 0, bArrG.length);
            }
            int i3 = this.h;
            int i4 = this.f;
            int length = i4 - i3;
            this.j += i4;
            this.h = 0;
            this.f = 0;
            ArrayList<byte[]> arrayListH = h(iX - length);
            byte[] bArr = new byte[iX];
            System.arraycopy(this.e, i3, bArr, 0, length);
            for (byte[] bArr2 : arrayListH) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            in inVar = kn.b;
            try {
                if (iX == 0) {
                    return kn.b;
                }
                return new in(bArr);
            } catch (x81 e) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            }
        }
        throw new x81("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
