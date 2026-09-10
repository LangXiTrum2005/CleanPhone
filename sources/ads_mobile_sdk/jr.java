package ads_mobile_sdk;

import java.util.Locale;
import saneness.attraction;
import saneness.transpositive;

/* JADX INFO: loaded from: classes.dex */
public final class jr extends mr {
    public final byte[] c;
    public final int d;
    public int e;

    public jr(byte[] bArr, int i) {
        if (((bArr.length - i) | i) >= 0) {
            this.c = bArr;
            this.e = 0;
            this.d = i;
        } else {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("Array range is invalid. Buffer.length=" + bArr.length + ", offset=0, length=" + i);
        }
    }

    @Override // ads_mobile_sdk.mr
    public final void a(byte b) throws kr {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.c[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new kr(i, this.d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // ads_mobile_sdk.mr
    public final int b() {
        return this.d - this.e;
    }

    @Override // ads_mobile_sdk.mr
    public final void c(long j) throws kr {
        int i = this.e;
        try {
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
        } catch (IndexOutOfBoundsException e) {
            throw new kr(i, this.d, 8, e);
        }
    }

    @Override // ads_mobile_sdk.mr
    public final void d(int i, long j) throws kr {
        g(i, 1);
        c(j);
    }

    @Override // ads_mobile_sdk.mr
    public final void e(int i, int i2) throws kr {
        g(i, 5);
        k(i2);
    }

    @Override // ads_mobile_sdk.mr
    public final void f(int i, int i2) throws kr {
        g(i, 0);
        l(i2);
    }

    @Override // ads_mobile_sdk.mr
    public final void g(int i, int i2) throws kr {
        m((i << 3) | i2);
    }

    @Override // ads_mobile_sdk.mr
    public final void h(int i, int i2) throws kr {
        g(i, 0);
        m(i2);
    }

    @Override // ads_mobile_sdk.mr
    public final void k(int i) throws kr {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new kr(i2, this.d, 4, e);
        }
    }

    @Override // ads_mobile_sdk.mr
    public final void l(int i) throws kr {
        if (i >= 0) {
            m(i);
        } else {
            d(i);
        }
    }

    @Override // ads_mobile_sdk.mr
    public final void m(int i) throws kr {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.e;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.c[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i3 = i2;
                    throw new kr(i3, this.d, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new kr(i3, this.d, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.c[i3] = (byte) i;
        this.e = i2;
    }

    @Override // ads_mobile_sdk.mr
    public final void b(int i, kn knVar) throws kr {
        g(i, 2);
        m(knVar.size());
        knVar.a(this);
    }

    @Override // ads_mobile_sdk.mr
    public final void d(long j) throws kr {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.e;
        if (mr.b && this.d - i2 >= 10) {
            while ((j & (-128)) != 0) {
                n53.c.a((Object) this.c, n53.f + ((long) i2), (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            n53.c.a((Object) this.c, n53.f + ((long) i2), (byte) j);
        } else {
            int i3 = i2;
            while ((j & (-128)) != 0) {
                try {
                    int i4 = i3 + 1;
                    try {
                        this.c[i3] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i3 = i4;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i4;
                        throw new kr(i3, this.d, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                }
            }
            i = i3 + 1;
            try {
                this.c[i3] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i3 = i;
                throw new kr(i3, this.d, 1, indexOutOfBoundsException);
            }
        }
        this.e = i;
    }

    @Override // ads_mobile_sdk.mr
    public final void e(int i, long j) throws kr {
        g(i, 0);
        d(j);
    }

    @Override // ads_mobile_sdk.mr
    public final void b(kn knVar) throws kr {
        m(knVar.size());
        knVar.a(this);
    }

    @Override // ads_mobile_sdk.mr
    public final void a(int i, boolean z) throws kr {
        g(i, 0);
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // ads_mobile_sdk.mr
    public final void b(transpositive transpositiveVar) throws kr {
        xm0 xm0Var = (xm0) transpositiveVar;
        m(xm0Var.a((attraction) null));
        xm0Var.a(this);
    }

    @Override // ads_mobile_sdk.mr
    public final void a(byte[] bArr, int i) throws kr {
        m(i);
        try {
            System.arraycopy(bArr, 0, this.c, this.e, i);
            this.e += i;
        } catch (IndexOutOfBoundsException e) {
            throw new kr(this.e, this.d, i, e);
        }
    }

    @Override // ads_mobile_sdk.mr
    public final void b(String str, int i) throws kr {
        g(i, 2);
        a(str);
    }

    @Override // saneness.polder
    public final void a(byte[] bArr, int i, int i2) throws kr {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new kr(this.e, this.d, i2, e);
        }
    }

    @Override // ads_mobile_sdk.mr
    public final void a(String str) throws kr {
        int i = this.e;
        try {
            int i2 = mr.i(str.length() * 3);
            int i3 = mr.i(str.length());
            if (i3 == i2) {
                int i4 = i + i3;
                this.e = i4;
                byte[] bArr = this.c;
                int iAttabal = t63.a.attabal(str, bArr, i4, bArr.length - i4);
                this.e = i;
                m((iAttabal - i) - i3);
                this.e = iAttabal;
                return;
            }
            m(t63.a(str));
            byte[] bArr2 = this.c;
            int i5 = this.e;
            this.e = t63.a.attabal(str, bArr2, i5, bArr2.length - i5);
        } catch (IndexOutOfBoundsException e) {
            throw new kr(e);
        }
    }
}
