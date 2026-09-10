package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes2.dex */
public final class Uh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3835a;
    public int b;
    public int c;
    public byte[] d;
    public int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Uh0(byte[] bArr, int i, Object obj) {
        this(bArr, bArr.length);
        this.f3835a = i;
        if (i == 2) {
        } else {
            this.d = bArr;
            this.b = bArr.length;
        }
    }

    public final void a() {
        int i;
        int i2;
        int i3;
        boolean z = false;
        switch (this.f3835a) {
            case 0:
                int i4 = this.c;
                if (i4 >= 0 && (i4 < (i = this.b) || (i4 == i && this.e == 0))) {
                    z = true;
                }
                FW.s(z);
                break;
            case 1:
            default:
                int i5 = this.c;
                if (i5 >= 0 && (i5 < (i3 = this.b) || (i5 == i3 && this.e == 0))) {
                    z = true;
                }
                FW.s(z);
                break;
            case 2:
                int i6 = this.b;
                if (i6 >= 0 && (i6 < (i2 = this.e) || (i6 == i2 && this.c == 0))) {
                    z = true;
                }
                FW.s(z);
                break;
        }
    }

    public final int b() {
        return ((this.e - this.b) * 8) - this.c;
    }

    public final void c() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.b++;
        a();
    }

    public final boolean d(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.b) {
                break;
            }
            if (q(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public final boolean e() {
        int i = this.c;
        int i2 = this.e;
        int i3 = 0;
        while (this.c < this.b && !h()) {
            i3++;
        }
        boolean z = this.c == this.b;
        this.c = i;
        this.e = i2;
        return !z && d((i3 * 2) + 1);
    }

    public final int f() {
        FW.s(this.c == 0);
        return this.b;
    }

    public final int g() {
        switch (this.f3835a) {
            case 0:
                return (this.c * 8) + this.e;
            default:
                return (this.b * 8) + this.c;
        }
    }

    public final boolean h() {
        boolean z;
        switch (this.f3835a) {
            case 0:
                z = (((this.d[this.c] & 255) >> this.e) & 1) == 1;
                s(1);
                break;
            case 1:
            default:
                z = (this.d[this.c] & (128 >> this.e)) != 0;
                r();
                break;
            case 2:
                z = (this.d[this.b] & (128 >> this.c)) != 0;
                r();
                break;
        }
        return z;
    }

    public final int i(int i) {
        switch (this.f3835a) {
            case 0:
                int i2 = this.c;
                int iMin = Math.min(i, 8 - this.e);
                int i3 = i2 + 1;
                int i4 = ((this.d[i2] & 255) >> this.e) & (255 >> (8 - iMin));
                while (iMin < i) {
                    i4 |= (this.d[i3] & 255) << iMin;
                    iMin += 8;
                    i3++;
                }
                int i5 = i4 & ((-1) >>> (32 - i));
                s(i);
                return i5;
            case 1:
            default:
                this.e += i;
                int i6 = 0;
                while (true) {
                    int i7 = this.e;
                    int i8 = 2;
                    if (i7 <= 8) {
                        byte[] bArr = this.d;
                        int i9 = this.c;
                        int i10 = ((-1) >>> (32 - i)) & (i6 | ((255 & bArr[i9]) >> (8 - i7)));
                        if (i7 == 8) {
                            this.e = 0;
                            this.c = i9 + (q(i9 + 1) ? 2 : 1);
                        }
                        a();
                        return i10;
                    }
                    int i11 = i7 - 8;
                    this.e = i11;
                    byte[] bArr2 = this.d;
                    int i12 = this.c;
                    i6 |= (bArr2[i12] & 255) << i11;
                    if (!q(i12 + 1)) {
                        i8 = 1;
                    }
                    this.c = i12 + i8;
                }
                break;
            case 2:
                if (i == 0) {
                    return 0;
                }
                this.c += i;
                int i13 = 0;
                while (true) {
                    int i14 = this.c;
                    if (i14 <= 8) {
                        byte[] bArr3 = this.d;
                        int i15 = this.b;
                        int i16 = ((-1) >>> (32 - i)) & (i13 | ((255 & bArr3[i15]) >> (8 - i14)));
                        if (i14 == 8) {
                            this.c = 0;
                            this.b = i15 + 1;
                        }
                        a();
                        return i16;
                    }
                    int i17 = i14 - 8;
                    this.c = i17;
                    byte[] bArr4 = this.d;
                    int i18 = this.b;
                    this.b = i18 + 1;
                    i13 |= (bArr4[i18] & 255) << i17;
                }
                break;
        }
    }

    public final void j(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.d;
            int i4 = this.b;
            int i5 = i4 + 1;
            this.b = i5;
            byte b = bArr2[i4];
            int i6 = this.c;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.d;
            int i9 = this.b;
            this.b = i9 + 1;
            bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.c = i8 - 8;
        }
        int i10 = this.c + i7;
        this.c = i10;
        byte[] bArr4 = this.d;
        int i11 = this.b;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i2]);
        if (i10 == 8) {
            this.c = 0;
            this.b = i11 + 1;
        }
        a();
    }

    public final void k(byte[] bArr, int i) {
        FW.s(this.c == 0);
        System.arraycopy(this.d, this.b, bArr, 0, i);
        this.b += i;
        a();
    }

    public final int l() {
        int i = 0;
        while (!h()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? i(i) : 0);
    }

    public final int m() {
        int iL = l();
        return ((iL + 1) / 2) * (iL % 2 == 0 ? -1 : 1);
    }

    public final void n(JT jt) {
        o(jt.f3266a, jt.c);
        p(jt.b * 8);
    }

    public final void o(byte[] bArr, int i) {
        this.d = bArr;
        this.b = 0;
        this.c = 0;
        this.e = i;
    }

    public final void p(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        a();
    }

    public final boolean q(int i) {
        if (2 <= i && i < this.b) {
            byte[] bArr = this.d;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void r() {
        switch (this.f3835a) {
            case 2:
                int i = this.c + 1;
                this.c = i;
                if (i == 8) {
                    this.c = 0;
                    this.b++;
                }
                a();
                break;
            default:
                int i2 = this.e + 1;
                this.e = i2;
                if (i2 == 8) {
                    this.e = 0;
                    int i3 = this.c;
                    this.c = i3 + (q(i3 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public final void s(int i) {
        switch (this.f3835a) {
            case 0:
                int i2 = i / 8;
                int i3 = this.c + i2;
                this.c = i3;
                int i4 = (i - (i2 * 8)) + this.e;
                this.e = i4;
                if (i4 > 7) {
                    this.c = i3 + 1;
                    this.e = i4 - 8;
                }
                a();
                break;
            case 1:
            default:
                int i5 = this.c;
                int i6 = i / 8;
                int i7 = i5 + i6;
                this.c = i7;
                int i8 = (i - (i6 * 8)) + this.e;
                this.e = i8;
                if (i8 > 7) {
                    this.c = i7 + 1;
                    this.e = i8 - 8;
                }
                while (true) {
                    i5++;
                    if (i5 > this.c) {
                        a();
                        break;
                    } else if (q(i5)) {
                        this.c++;
                        i5 += 2;
                    }
                }
                break;
            case 2:
                int i9 = i / 8;
                int i10 = this.b + i9;
                this.b = i10;
                int i11 = (i - (i9 * 8)) + this.c;
                this.c = i11;
                if (i11 > 7) {
                    this.b = i10 + 1;
                    this.c = i11 - 8;
                }
                a();
                break;
        }
    }

    public final void t(int i) {
        FW.s(this.c == 0);
        this.b += i;
        a();
    }

    public Uh0() {
        this.f3835a = 2;
        this.d = Ug0.e;
    }

    public Uh0(byte[] bArr, int i, int i2) {
        this.f3835a = 3;
        this.d = bArr;
        this.c = i;
        this.b = i2;
        this.e = 0;
        a();
    }

    public Uh0(byte[] bArr, int i) {
        this.f3835a = 2;
        this.d = bArr;
        this.e = i;
    }

    public Uh0(int i, int i2) {
        this.f3835a = 1;
        this.b = i;
        this.c = i2;
        this.d = new byte[(i2 * 2) - 1];
        this.e = 0;
    }
}
