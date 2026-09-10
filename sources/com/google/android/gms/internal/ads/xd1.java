package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f21843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21846e;

    public xd1(byte[] bArr, int i10, byte b10) {
        this.f21842a = i10;
        switch (i10) {
            case 4:
                this.f21843b = bArr;
                this.f21844c = bArr.length;
                break;
            default:
                this.f21843b = bArr;
                this.f21844c = bArr.length;
                break;
        }
    }

    public void a() {
        int i10;
        int i11;
        switch (this.f21842a) {
            case 1:
                int i12 = this.f21844c;
                go.k.t(i12 >= 0 && (i12 < (i10 = this.f21846e) || (i12 == i10 && this.f21845d == 0)));
                break;
            default:
                int i13 = this.f21845d;
                go.k.t(i13 >= 0 && (i13 < (i11 = this.f21844c) || (i13 == i11 && this.f21846e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f21846e - this.f21844c) * 8) - this.f21845d;
    }

    public void c() {
        if (this.f21845d == 0) {
            return;
        }
        this.f21845d = 0;
        this.f21844c++;
        a();
    }

    public boolean d(int i10) {
        int i11 = this.f21845d;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f21846e + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f21844c) {
                break;
            }
            if (r(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f21844c;
        return i13 < i15 || (i13 == i15 && i14 == 0);
    }

    public boolean e() {
        int i10 = this.f21845d;
        int i11 = this.f21846e;
        int i12 = 0;
        while (this.f21845d < this.f21844c && !h()) {
            i12++;
        }
        boolean z10 = this.f21845d == this.f21844c;
        this.f21845d = i10;
        this.f21846e = i11;
        return !z10 && d((i12 * 2) + 1);
    }

    public int f() {
        go.k.t(this.f21845d == 0);
        return this.f21844c;
    }

    public int g() {
        return (this.f21844c * 8) + this.f21845d;
    }

    public boolean h() {
        switch (this.f21842a) {
            case 1:
                boolean z10 = (this.f21843b[this.f21844c] & (128 >> this.f21845d)) != 0;
                s();
                return z10;
            case 2:
            default:
                boolean z11 = (((this.f21843b[this.f21845d] & 255) >> this.f21846e) & 1) == 1;
                t(1);
                return z11;
            case 3:
                boolean z12 = (this.f21843b[this.f21845d] & (128 >> this.f21846e)) != 0;
                s();
                return z12;
        }
    }

    public int i(int i10) {
        switch (this.f21842a) {
            case 1:
                if (i10 == 0) {
                    return 0;
                }
                this.f21845d += i10;
                int i11 = 0;
                while (true) {
                    int i12 = this.f21845d;
                    if (i12 <= 8) {
                        byte[] bArr = this.f21843b;
                        int i13 = this.f21844c;
                        int i14 = ((-1) >>> (32 - i10)) & (i11 | ((bArr[i13] & 255) >> (8 - i12)));
                        if (i12 == 8) {
                            this.f21845d = 0;
                            this.f21844c = i13 + 1;
                        }
                        a();
                        return i14;
                    }
                    int i15 = i12 - 8;
                    this.f21845d = i15;
                    byte[] bArr2 = this.f21843b;
                    int i16 = this.f21844c;
                    this.f21844c = i16 + 1;
                    i11 |= (bArr2[i16] & 255) << i15;
                }
                break;
            case 2:
            default:
                int i17 = this.f21845d;
                int iMin = Math.min(i10, 8 - this.f21846e);
                byte[] bArr3 = this.f21843b;
                int i18 = i17 + 1;
                int i19 = ((bArr3[i17] & 255) >> this.f21846e) & (255 >> (8 - iMin));
                while (iMin < i10) {
                    i19 |= (bArr3[i18] & 255) << iMin;
                    iMin += 8;
                    i18++;
                }
                int i20 = i19 & ((-1) >>> (32 - i10));
                t(i10);
                return i20;
            case 3:
                this.f21846e += i10;
                int i21 = 0;
                while (true) {
                    int i22 = this.f21846e;
                    int i23 = 2;
                    if (i22 <= 8) {
                        byte[] bArr4 = this.f21843b;
                        int i24 = this.f21845d;
                        int i25 = ((-1) >>> (32 - i10)) & (i21 | ((bArr4[i24] & 255) >> (8 - i22)));
                        if (i22 == 8) {
                            this.f21846e = 0;
                            this.f21845d = i24 + (r(i24 + 1) ? 2 : 1);
                        }
                        a();
                        return i25;
                    }
                    int i26 = i22 - 8;
                    this.f21846e = i26;
                    byte[] bArr5 = this.f21843b;
                    int i27 = this.f21845d;
                    i21 |= (bArr5[i27] & 255) << i26;
                    if (!r(i27 + 1)) {
                        i23 = 1;
                    }
                    this.f21845d = i27 + i23;
                }
                break;
        }
    }

    public void j(int i10, byte[] bArr) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f21843b;
            int i13 = this.f21844c;
            int i14 = i13 + 1;
            this.f21844c = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f21845d;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.f21845d;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f21843b;
            int i18 = this.f21844c;
            this.f21844c = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f21845d = i17 - 8;
        }
        int i19 = this.f21845d + i16;
        this.f21845d = i19;
        byte[] bArr4 = this.f21843b;
        int i20 = this.f21844c;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f21845d = 0;
            this.f21844c = i20 + 1;
        }
        a();
    }

    public long k(int i10) {
        if (i10 <= 32) {
            int i11 = i(i10);
            String str = l1.y.f44830a;
            return ((long) i11) & 4294967295L;
        }
        int i12 = i(i10 - 32);
        int i13 = i(32);
        String str2 = l1.y.f44830a;
        return (((long) i13) & 4294967295L) | ((((long) i12) & 4294967295L) << 32);
    }

    public void l(int i10, byte[] bArr) {
        go.k.t(this.f21845d == 0);
        System.arraycopy(this.f21843b, this.f21844c, bArr, 0, i10);
        this.f21844c += i10;
        a();
    }

    public int m() {
        int i10 = 0;
        while (!h()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? i(i10) : 0);
    }

    public int n() {
        int iM = m();
        return ((iM + 1) / 2) * (iM % 2 == 0 ? -1 : 1);
    }

    public void o(l1.q qVar) {
        p(qVar.f44813a, qVar.f44815c);
        q(qVar.f44814b * 8);
    }

    public void p(byte[] bArr, int i10) {
        this.f21843b = bArr;
        this.f21844c = 0;
        this.f21845d = 0;
        this.f21846e = i10;
    }

    public void q(int i10) {
        int i11 = i10 / 8;
        this.f21844c = i11;
        this.f21845d = i10 - (i11 * 8);
        a();
    }

    public boolean r(int i10) {
        if (2 > i10 || i10 >= this.f21844c) {
            return false;
        }
        byte[] bArr = this.f21843b;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public void s() {
        switch (this.f21842a) {
            case 1:
                int i10 = this.f21845d + 1;
                this.f21845d = i10;
                if (i10 == 8) {
                    this.f21845d = 0;
                    this.f21844c++;
                }
                a();
                break;
            default:
                int i11 = this.f21846e + 1;
                this.f21846e = i11;
                if (i11 == 8) {
                    this.f21846e = 0;
                    int i12 = this.f21845d;
                    this.f21845d = i12 + (r(i12 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i10) {
        int i11;
        switch (this.f21842a) {
            case 1:
                int i12 = i10 / 8;
                int i13 = this.f21844c + i12;
                this.f21844c = i13;
                int i14 = (i10 - (i12 * 8)) + this.f21845d;
                this.f21845d = i14;
                if (i14 > 7) {
                    this.f21844c = i13 + 1;
                    this.f21845d = i14 - 8;
                }
                a();
                break;
            case 2:
            default:
                int i15 = i10 / 8;
                int i16 = this.f21845d + i15;
                this.f21845d = i16;
                int i17 = (i10 - (i15 * 8)) + this.f21846e;
                this.f21846e = i17;
                boolean z10 = true;
                if (i17 > 7) {
                    this.f21845d = i16 + 1;
                    this.f21846e = i17 - 8;
                }
                int i18 = this.f21845d;
                if (i18 < 0 || (i18 >= (i11 = this.f21844c) && (i18 != i11 || this.f21846e != 0))) {
                    z10 = false;
                }
                go.k.t(z10);
                break;
            case 3:
                int i19 = this.f21845d;
                int i20 = i10 / 8;
                int i21 = i19 + i20;
                this.f21845d = i21;
                int i22 = (i10 - (i20 * 8)) + this.f21846e;
                this.f21846e = i22;
                if (i22 > 7) {
                    this.f21845d = i21 + 1;
                    this.f21846e = i22 - 8;
                }
                while (true) {
                    i19++;
                    if (i19 > this.f21845d) {
                        a();
                        break;
                    } else if (r(i19)) {
                        this.f21845d++;
                        i19 += 2;
                    }
                }
                break;
        }
    }

    public void u(int i10) {
        go.k.t(this.f21845d == 0);
        this.f21844c += i10;
        a();
    }

    public boolean v() {
        int i10 = (this.f21843b[this.f21845d] & 255) >> this.f21846e;
        x(1);
        return 1 == (i10 & 1);
    }

    public int w(int i10) {
        int i11 = this.f21845d;
        int i12 = 8 - this.f21846e;
        int i13 = i11 + 1;
        byte[] bArr = this.f21843b;
        int iMin = Math.min(i10, i12);
        int i14 = ((bArr[i11] & 255) >> this.f21846e) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i14 |= (bArr[i13] & 255) << iMin;
            iMin += 8;
            i13++;
        }
        int i15 = i14 & ((-1) >>> (32 - i10));
        x(i10);
        return i15;
    }

    public void x(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f21845d + i12;
        this.f21845d = i13;
        int i14 = (i10 - (i12 * 8)) + this.f21846e;
        this.f21846e = i14;
        if (i14 > 7) {
            i13++;
            this.f21845d = i13;
            i14 -= 8;
            this.f21846e = i14;
        }
        boolean z10 = false;
        if (i13 >= 0 && (i13 < (i11 = this.f21844c) || (i13 == i11 && i14 == 0))) {
            z10 = true;
        }
        ps1.c0(z10);
    }

    public xd1() {
        this.f21842a = 1;
        this.f21843b = l1.y.f44831b;
    }

    public xd1(byte[] bArr, int i10, int i11) {
        this.f21842a = 3;
        this.f21843b = bArr;
        this.f21845d = i10;
        this.f21844c = i11;
        this.f21846e = 0;
        a();
    }

    public xd1(byte[] bArr, int i10) {
        this.f21842a = 1;
        this.f21843b = bArr;
        this.f21846e = i10;
    }

    public xd1(int i10, int i11) {
        this.f21842a = 2;
        this.f21844c = i10;
        this.f21845d = i11;
        this.f21843b = new byte[(i11 * 2) - 1];
        this.f21846e = 0;
    }
}
