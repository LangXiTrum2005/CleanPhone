package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class JT {
    public static final char[] d = {'\r', '\n'};
    public static final char[] e = {'\n'};
    public static final KC f = KC.i(5, AbstractC2333Ce.f2932a, AbstractC2333Ce.c, AbstractC2333Ce.f, AbstractC2333Ce.d, AbstractC2333Ce.e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f3266a;
    public int b;
    public int c;

    public JT() {
        this.f3266a = Ug0.e;
    }

    public final Charset A() {
        if (a() >= 3) {
            byte[] bArr = this.f3266a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return AbstractC2333Ce.c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f3266a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.b = i2 + 2;
            return AbstractC2333Ce.d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return AbstractC2333Ce.e;
    }

    public final void B(int i) {
        byte[] bArr = this.f3266a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        C(bArr, i);
    }

    public final void C(byte[] bArr, int i) {
        this.f3266a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void D(int i) {
        FW.h(i >= 0 && i <= this.f3266a.length);
        this.c = i;
    }

    public final void E(int i) {
        FW.h(i >= 0 && i <= this.c);
        this.b = i;
    }

    public final void F(int i) {
        E(this.b + i);
    }

    public final int a() {
        return this.c - this.b;
    }

    public final void b(int i) {
        byte[] bArr = this.f3266a;
        if (i > bArr.length) {
            this.f3266a = Arrays.copyOf(bArr, i);
        }
    }

    public final int c() {
        return this.f3266a[this.b] & 255;
    }

    public final void d(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f3266a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final char e(Charset charset, char[] cArr) {
        char c;
        int i;
        byte b;
        byte b2;
        if ((charset.equals(AbstractC2333Ce.c) || charset.equals(AbstractC2333Ce.f2932a)) && a() >= 1) {
            long j = this.f3266a[this.b] & 255;
            c = (char) j;
            if (c != j) {
                throw new IllegalArgumentException(FW.L("Out of range: %s", Long.valueOf(j)));
            }
            i = 1;
        } else {
            i = 2;
            if ((!charset.equals(AbstractC2333Ce.f) && !charset.equals(AbstractC2333Ce.d)) || a() < 2) {
                if (charset.equals(AbstractC2333Ce.e) && a() >= 2) {
                    byte[] bArr = this.f3266a;
                    int i2 = this.b;
                    b = bArr[i2 + 1];
                    b2 = bArr[i2];
                }
                return (char) 0;
            }
            byte[] bArr2 = this.f3266a;
            int i3 = this.b;
            b = bArr2[i3];
            b2 = bArr2[i3 + 1];
            c = (char) ((b2 & 255) | (b << 8));
        }
        for (char c2 : cArr) {
            if (c2 == c) {
                this.b += i;
                long j2 = c;
                char c3 = (char) j2;
                if (c3 == j2) {
                    return c3;
                }
                throw new IllegalArgumentException(FW.L("Out of range: %s", Long.valueOf(j2)));
            }
        }
        return (char) 0;
    }

    public final int f() {
        byte[] bArr = this.f3266a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 8);
        this.b = i + 4;
        return (bArr[i3] & 255) | i4;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6 A[SYNTHETIC] */
    public final String g(Charset charset) {
        int i;
        byte[] bArr;
        FW.i(f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = AbstractC2333Ce.f2932a;
        if (!charset.equals(charset2)) {
            A();
        }
        if (charset.equals(AbstractC2333Ce.c) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(AbstractC2333Ce.f) && !charset.equals(AbstractC2333Ce.e) && !charset.equals(AbstractC2333Ce.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(AbstractC2333Ce.c) || charset.equals(AbstractC2333Ce.f2932a)) && Ug0.J(this.f3266a[i2])) {
                break;
            }
            if (charset.equals(AbstractC2333Ce.f) || charset.equals(AbstractC2333Ce.d)) {
                byte[] bArr2 = this.f3266a;
                if (bArr2[i2] == 0 && Ug0.J(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(AbstractC2333Ce.e)) {
                    bArr = this.f3266a;
                    if (bArr[i2 + 1] == 0 && Ug0.J(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(AbstractC2333Ce.e)) {
                    bArr = this.f3266a;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strR = r(i2 - this.b, charset);
        if (this.b != this.c && e(charset, d) == '\r') {
            e(charset, e);
        }
        return strR;
    }

    public final int h() {
        byte[] bArr = this.f3266a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i3] & 255) << 24) | i4;
    }

    public final long i() {
        byte[] bArr = this.f3266a;
        int i = this.b;
        int i2 = i + 7;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        this.b = i + 8;
        return ((((long) bArr[i2]) & 255) << 56) | j;
    }

    public final short j() {
        byte[] bArr = this.f3266a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final long k() {
        byte[] bArr = this.f3266a;
        int i = this.b;
        int i2 = i + 3;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16);
        this.b = i + 4;
        return ((((long) bArr[i2]) & 255) << 24) | j;
    }

    public final int l() {
        int iH = h();
        if (iH >= 0) {
            return iH;
        }
        throw new IllegalStateException(AbstractC3950lJ.p("Top bit not zero: ", iH));
    }

    public final int m() {
        byte[] bArr = this.f3266a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final long n() {
        byte[] bArr = this.f3266a;
        int i = this.b;
        int i2 = i + 7;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        this.b = i + 8;
        return (((long) bArr[i2]) & 255) | j;
    }

    public final String o() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.f3266a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f3266a;
        int i2 = this.b;
        int i3 = Ug0.f3833a;
        String str = new String(bArr, i2, i - i2, AbstractC2333Ce.c);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str;
    }

    public final String p(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.f3266a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f3266a;
        int i5 = Ug0.f3833a;
        String str = new String(bArr, i2, i4, AbstractC2333Ce.c);
        this.b += i;
        return str;
    }

    public final short q() {
        byte[] bArr = this.f3266a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public final String r(int i, Charset charset) {
        String str = new String(this.f3266a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int s() {
        return (t() << 21) | (t() << 14) | (t() << 7) | t();
    }

    public final int t() {
        byte[] bArr = this.f3266a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final long u() {
        byte[] bArr = this.f3266a;
        int i = this.b;
        int i2 = i + 3;
        long j = ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i + 1]) & 255) << 16) | ((((long) bArr[i + 2]) & 255) << 8);
        this.b = i + 4;
        return (((long) bArr[i2]) & 255) | j;
    }

    public final int v() {
        byte[] bArr = this.f3266a;
        int i = this.b;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
        this.b = i + 3;
        return (bArr[i2] & 255) | i3;
    }

    public final int w() {
        int iF = f();
        if (iF >= 0) {
            return iF;
        }
        throw new IllegalStateException(AbstractC3950lJ.p("Top bit not zero: ", iF));
    }

    public final long x() {
        long jN = n();
        if (jN >= 0) {
            return jN;
        }
        throw new IllegalStateException(AbstractC5044xl.h("Top bit not zero: ", jN));
    }

    public final int y() {
        byte[] bArr = this.f3266a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public final long z() {
        int i;
        int i2;
        long j = this.f3266a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 >= 0) {
                int i4 = 1 << i3;
                if ((((long) i4) & j) == 0) {
                    if (i3 < 6) {
                        j &= (long) (i4 - 1);
                        i2 = 7 - i3;
                        break;
                    }
                    if (i3 == 7) {
                        i2 = 1;
                        break;
                    }
                } else {
                    i3--;
                }
            }
            i2 = 0;
            break;
        }
        if (i2 == 0) {
            throw new NumberFormatException(AbstractC5044xl.h("Invalid UTF-8 sequence first byte: ", j));
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f3266a[this.b + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException(AbstractC5044xl.h("Invalid UTF-8 sequence continuation byte: ", j));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.b += i2;
        return j;
    }

    public JT(int i) {
        this.f3266a = new byte[i];
        this.c = i;
    }

    public JT(byte[] bArr) {
        this.f3266a = bArr;
        this.c = bArr.length;
    }

    public JT(byte[] bArr, int i) {
        this.f3266a = bArr;
        this.c = i;
    }
}
