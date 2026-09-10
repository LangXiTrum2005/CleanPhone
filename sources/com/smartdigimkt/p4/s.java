package com.smartdigimkt.p4;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f37616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37618c;

    public s() {
    }

    public int A() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = i2 + 2;
        int i4 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f37617b = i2 + 3;
        return (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i4;
    }

    public int B() {
        int i2 = i();
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalStateException(android.support.v4.media.a.h(i2, "Top bit not zero: "));
    }

    public long C() {
        long jT = t();
        if (jT >= 0) {
            return jT;
        }
        throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.i(jT, "Top bit not zero: "));
    }

    public int D() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = i2 + 1;
        int i4 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f37617b = i2 + 2;
        return (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i4;
    }

    public long E() {
        int i2;
        int i3;
        long j = this.f37616a[this.f37617b];
        int i4 = 7;
        while (true) {
            if (i4 >= 0) {
                int i5 = 1 << i4;
                if ((((long) i5) & j) == 0) {
                    if (i4 < 6) {
                        j &= (long) (i5 - 1);
                        i3 = 7 - i4;
                        break;
                    }
                    if (i4 == 7) {
                        i3 = 1;
                        break;
                    }
                } else {
                    i4--;
                }
            }
            i3 = 0;
            break;
        }
        if (i3 == 0) {
            throw new NumberFormatException(androidx.datastore.preferences.protobuf.a.i(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i2 = 1; i2 < i3; i2++) {
            byte b2 = this.f37616a[this.f37617b + i2];
            if ((b2 & 192) != 128) {
                throw new NumberFormatException(androidx.datastore.preferences.protobuf.a.i(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b2 & 63));
        }
        this.f37617b += i3;
        return j;
    }

    public void F() {
        this.f37617b = 0;
        this.f37618c = 0;
    }

    public void a(byte[] bArr, int i2) {
        this.f37616a = bArr;
        this.f37618c = i2;
        this.f37617b = 0;
    }

    public int b() {
        byte[] bArr = this.f37616a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public void c(int i2) {
        a(b() < i2 ? new byte[i2] : this.f37616a, i2);
    }

    public int d() {
        return this.f37618c;
    }

    public void e(int i2) {
        a.a(i2 >= 0 && i2 <= this.f37618c);
        this.f37617b = i2;
    }

    public void f(int i2) {
        e(this.f37617b + i2);
    }

    public double g() {
        return Double.longBitsToDouble(t());
    }

    public float h() {
        return Float.intBitsToFloat(i());
    }

    public int i() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
        int i4 = i2 + 3;
        int i5 = i3 | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.f37617b = i2 + 4;
        return (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i5;
    }

    public int j() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = i2 + 2;
        int i4 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8);
        this.f37617b = i2 + 3;
        return (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i4;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    public String k() {
        int i2;
        if (a() == 0) {
            return null;
        }
        int i3 = this.f37617b;
        while (i3 < this.f37618c && !f0.h(this.f37616a[i3])) {
            i3++;
        }
        int i4 = this.f37617b;
        if (i3 - i4 >= 3) {
            byte[] bArr = this.f37616a;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f37617b = i4 + 3;
            }
        }
        byte[] bArr2 = this.f37616a;
        int i5 = this.f37617b;
        String strA = f0.a(bArr2, i5, i3 - i5);
        this.f37617b = i3;
        int i6 = this.f37618c;
        if (i3 != i6) {
            byte[] bArr3 = this.f37616a;
            if (bArr3[i3] == 13) {
                int i7 = i3 + 1;
                this.f37617b = i7;
                if (i7 != i6) {
                    i2 = this.f37617b;
                    if (bArr3[i2] == 10) {
                        this.f37617b = i2 + 1;
                    }
                }
            } else {
                i2 = this.f37617b;
                if (bArr3[i2] == 10) {
                    this.f37617b = i2 + 1;
                }
            }
        }
        return strA;
    }

    public int l() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int i4 = i2 + 3;
        int i5 = i3 | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f37617b = i2 + 4;
        return ((bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i5;
    }

    public int m() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = i2 + 2;
        int i4 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.f37617b = i2 + 3;
        return ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i4;
    }

    public long n() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = i2 + 7;
        long j = (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        this.f37617b = i2 + 8;
        return ((((long) bArr[i3]) & 255) << 56) | j;
    }

    public short o() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f37617b = i2 + 2;
        return (short) (((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i4);
    }

    public long p() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = i2 + 3;
        long j = (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16);
        this.f37617b = i2 + 4;
        return ((((long) bArr[i3]) & 255) << 24) | j;
    }

    public int q() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = i2 + 2;
        int i4 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.f37617b = i2 + 3;
        return ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i4;
    }

    public int r() {
        int iL = l();
        if (iL >= 0) {
            return iL;
        }
        throw new IllegalStateException(android.support.v4.media.a.h(iL, "Top bit not zero: "));
    }

    public int s() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f37617b = i2 + 2;
        return ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i4;
    }

    public long t() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = i2 + 7;
        long j = ((((long) bArr[i2]) & 255) << 56) | ((((long) bArr[i2 + 1]) & 255) << 48) | ((((long) bArr[i2 + 2]) & 255) << 40) | ((((long) bArr[i2 + 3]) & 255) << 32) | ((((long) bArr[i2 + 4]) & 255) << 24) | ((((long) bArr[i2 + 5]) & 255) << 16) | ((((long) bArr[i2 + 6]) & 255) << 8);
        this.f37617b = i2 + 8;
        return (((long) bArr[i3]) & 255) | j;
    }

    public String u() {
        if (a() == 0) {
            return null;
        }
        int i2 = this.f37617b;
        while (i2 < this.f37618c && this.f37616a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f37616a;
        int i3 = this.f37617b;
        String strA = f0.a(bArr, i3, i2 - i3);
        this.f37617b = i2;
        if (i2 < this.f37618c) {
            this.f37617b = i2 + 1;
        }
        return strA;
    }

    public short v() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = i2 + 1;
        int i4 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f37617b = i2 + 2;
        return (short) ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i4);
    }

    public int w() {
        return (x() << 21) | (x() << 14) | (x() << 7) | x();
    }

    public int x() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        this.f37617b = i2 + 1;
        return bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public int y() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = (bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.f37617b = i2 + 4;
        return i3;
    }

    public long z() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        int i3 = i2 + 3;
        long j = ((((long) bArr[i2]) & 255) << 24) | ((((long) bArr[i2 + 1]) & 255) << 16) | ((((long) bArr[i2 + 2]) & 255) << 8);
        this.f37617b = i2 + 4;
        return (((long) bArr[i3]) & 255) | j;
    }

    public s(int i2) {
        this.f37616a = new byte[i2];
        this.f37618c = i2;
    }

    public String b(int i2) {
        return a(i2, Charset.forName("UTF-8"));
    }

    public int c() {
        return this.f37617b;
    }

    public void d(int i2) {
        a.a(i2 >= 0 && i2 <= this.f37616a.length);
        this.f37618c = i2;
    }

    public int f() {
        return this.f37616a[this.f37617b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public char e() {
        byte[] bArr = this.f37616a;
        int i2 = this.f37617b;
        return (char) ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }

    public int a() {
        return this.f37618c - this.f37617b;
    }

    public s(byte[] bArr) {
        this.f37616a = bArr;
        this.f37618c = bArr.length;
    }

    public void a(r rVar, int i2) {
        a(rVar.f37613a, 0, i2);
        rVar.b(0);
    }

    public void a(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f37616a, this.f37617b, bArr, i2, i3);
        this.f37617b += i3;
    }

    public s(byte[] bArr, int i2) {
        this.f37616a = bArr;
        this.f37618c = i2;
    }

    public void a(ByteBuffer byteBuffer, int i2) {
        byteBuffer.put(this.f37616a, this.f37617b, i2);
        this.f37617b += i2;
    }

    public String a(int i2, Charset charset) {
        String str = new String(this.f37616a, this.f37617b, i2, charset);
        this.f37617b += i2;
        return str;
    }

    public String a(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.f37617b;
        int i4 = (i3 + i2) - 1;
        String strA = f0.a(this.f37616a, i3, (i4 >= this.f37618c || this.f37616a[i4] != 0) ? i2 : i2 - 1);
        this.f37617b += i2;
        return strA;
    }
}
