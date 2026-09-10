package ads_mobile_sdk;

import java.io.IOException;
import java.io.OutputStream;
import saneness.attraction;
import saneness.transpositive;

/* JADX INFO: loaded from: classes.dex */
public final class lr extends mr {
    public final byte[] c;
    public final int d;
    public int e;
    public final OutputStream f;

    public lr(OutputStream outputStream, int i) {
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f = outputStream;
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.c = new byte[iMax];
        this.d = iMax;
    }

    @Override // ads_mobile_sdk.mr
    public final void a(byte b) throws IOException {
        int i = this.e;
        if (i == this.d) {
            this.f.write(this.c, 0, i);
            this.e = 0;
        }
        int i2 = this.e;
        this.c[i2] = b;
        this.e = i2 + 1;
    }

    public final void b(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.d;
        int i4 = this.e;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.c, i4, i2);
            this.e += i2;
            return;
        }
        System.arraycopy(bArr, i, this.c, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        int i8 = this.d;
        this.e = i8;
        this.f.write(this.c, 0, i8);
        this.e = 0;
        if (i7 > this.d) {
            this.f.write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, this.c, 0, i7);
            this.e = i7;
        }
    }

    @Override // ads_mobile_sdk.mr
    public final void c(long j) throws IOException {
        p(8);
        e(j);
    }

    @Override // ads_mobile_sdk.mr
    public final void d(int i, long j) throws IOException {
        p(18);
        i(i, 1);
        e(j);
    }

    public final void e(long j) {
        int i = this.e;
        byte[] bArr = this.c;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.e = i + 8;
    }

    @Override // ads_mobile_sdk.mr
    public final void f(int i, int i2) throws IOException {
        p(20);
        i(i, 0);
        if (i2 >= 0) {
            o(i2);
        } else {
            f(i2);
        }
    }

    @Override // ads_mobile_sdk.mr
    public final void g(int i, int i2) throws IOException {
        p(5);
        o((i << 3) | i2);
    }

    @Override // ads_mobile_sdk.mr
    public final void h(int i, int i2) throws IOException {
        p(20);
        i(i, 0);
        o(i2);
    }

    public final void i(int i, int i2) {
        o((i << 3) | i2);
    }

    @Override // ads_mobile_sdk.mr
    public final void k(int i) throws IOException {
        p(4);
        n(i);
    }

    @Override // ads_mobile_sdk.mr
    public final void l(int i) throws IOException {
        if (i >= 0) {
            p(5);
            o(i);
        } else {
            p(10);
            f(i);
        }
    }

    @Override // ads_mobile_sdk.mr
    public final void m(int i) throws IOException {
        p(5);
        o(i);
    }

    public final void n(int i) {
        int i2 = this.e;
        byte[] bArr = this.c;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.e = i2 + 4;
    }

    public final void o(int i) {
        if (!mr.b) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.c;
                int i2 = this.e;
                this.e = i2 + 1;
                bArr[i2] = (byte) (i | 128);
                i >>>= 7;
            }
            byte[] bArr2 = this.c;
            int i3 = this.e;
            this.e = i3 + 1;
            bArr2[i3] = (byte) i;
            return;
        }
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.c;
            int i4 = this.e;
            this.e = i4 + 1;
            n53.c.a((Object) bArr3, n53.f + ((long) i4), (byte) (i | 128));
            i >>>= 7;
        }
        byte[] bArr4 = this.c;
        int i5 = this.e;
        this.e = i5 + 1;
        n53.c.a((Object) bArr4, n53.f + ((long) i5), (byte) i);
    }

    public final void p(int i) throws IOException {
        int i2 = this.d;
        int i3 = this.e;
        if (i2 - i3 < i) {
            this.f.write(this.c, 0, i3);
            this.e = 0;
        }
    }

    @Override // ads_mobile_sdk.mr
    public final void d(long j) throws IOException {
        p(10);
        f(j);
    }

    public final void f(long j) {
        if (mr.b) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.c;
                int i = this.e;
                this.e = i + 1;
                n53.c.a((Object) bArr, n53.f + ((long) i), (byte) (((int) j) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.c;
            int i2 = this.e;
            this.e = i2 + 1;
            n53.c.a((Object) bArr2, n53.f + ((long) i2), (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.c;
            int i3 = this.e;
            this.e = i3 + 1;
            bArr3[i3] = (byte) (((int) j) | 128);
            j >>>= 7;
        }
        byte[] bArr4 = this.c;
        int i4 = this.e;
        this.e = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    @Override // ads_mobile_sdk.mr
    public final void a(int i, boolean z) throws IOException {
        p(11);
        i(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.e;
        this.c[i2] = b;
        this.e = i2 + 1;
    }

    @Override // ads_mobile_sdk.mr
    public final void e(int i, int i2) throws IOException {
        p(14);
        i(i, 5);
        n(i2);
    }

    @Override // ads_mobile_sdk.mr
    public final void a(byte[] bArr, int i) throws IOException {
        p(5);
        o(i);
        b(bArr, 0, i);
    }

    @Override // ads_mobile_sdk.mr
    public final void b(int i, kn knVar) throws IOException {
        g(i, 2);
        b(knVar);
    }

    @Override // ads_mobile_sdk.mr
    public final void b(kn knVar) throws IOException {
        int size = knVar.size();
        p(5);
        o(size);
        knVar.a(this);
    }

    @Override // ads_mobile_sdk.mr
    public final void e(int i, long j) throws IOException {
        p(20);
        i(i, 0);
        f(j);
    }

    @Override // saneness.polder
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        b(bArr, i, i2);
    }

    @Override // ads_mobile_sdk.mr
    public final void a(String str) throws IOException {
        int length = str.length() * 3;
        int i = mr.i(length);
        int i2 = i + length;
        int i3 = this.d;
        if (i2 > i3) {
            byte[] bArr = new byte[length];
            int iAttabal = t63.a.attabal(str, bArr, 0, length);
            p(5);
            o(iAttabal);
            b(bArr, 0, iAttabal);
            return;
        }
        int i4 = this.e;
        if (i2 > i3 - i4) {
            this.f.write(this.c, 0, i4);
            this.e = 0;
        }
        int i5 = mr.i(str.length());
        int i6 = this.e;
        try {
            if (i5 == i) {
                int i7 = i6 + i5;
                this.e = i7;
                int iAttabal2 = t63.a.attabal(str, this.c, i7, this.d - i7);
                this.e = i6;
                o((iAttabal2 - i6) - i5);
                this.e = iAttabal2;
                return;
            }
            int iA = t63.a(str);
            o(iA);
            this.e = t63.a.attabal(str, this.c, this.e, iA);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new kr(e);
        }
    }

    @Override // ads_mobile_sdk.mr
    public final void b(transpositive transpositiveVar) throws IOException {
        xm0 xm0Var = (xm0) transpositiveVar;
        int iA = xm0Var.a((attraction) null);
        p(5);
        o(iA);
        xm0Var.a(this);
    }

    @Override // ads_mobile_sdk.mr
    public final void b(String str, int i) throws IOException {
        g(i, 2);
        a(str);
    }

    @Override // ads_mobile_sdk.mr
    public final int b() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
