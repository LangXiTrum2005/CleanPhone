package com.smartdigimkt.p4;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f37613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37615c;
    private int d;

    public r() {
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public int b() {
        return ((this.d - this.f37614b) * 8) - this.f37615c;
    }

    public void c(int i2) {
        int i3 = i2 / 8;
        int i4 = this.f37614b + i3;
        this.f37614b = i4;
        int i5 = (i2 - (i3 * 8)) + this.f37615c;
        this.f37615c = i5;
        if (i5 > 7) {
            this.f37614b = i4 + 1;
            this.f37615c = i5 - 8;
        }
        a();
    }

    public int d() {
        a.b(this.f37615c == 0);
        return this.f37614b;
    }

    public int e() {
        return (this.f37614b * 8) + this.f37615c;
    }

    public boolean f() {
        boolean z2 = (this.f37613a[this.f37614b] & (128 >> this.f37615c)) != 0;
        g();
        return z2;
    }

    public void g() {
        int i2 = this.f37615c + 1;
        this.f37615c = i2;
        if (i2 == 8) {
            this.f37615c = 0;
            this.f37614b++;
        }
        a();
    }

    public r(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public void a(s sVar) {
        a(sVar.f37616a, sVar.d());
        b(sVar.c() * 8);
    }

    public void b(int i2) {
        int i3 = i2 / 8;
        this.f37614b = i3;
        this.f37615c = i2 - (i3 * 8);
        a();
    }

    public r(byte[] bArr, int i2) {
        this.f37613a = bArr;
        this.d = i2;
    }

    public void d(int i2) {
        a.b(this.f37615c == 0);
        this.f37614b += i2;
        a();
    }

    public void a(byte[] bArr, int i2) {
        this.f37613a = bArr;
        this.f37614b = 0;
        this.f37615c = 0;
        this.d = i2;
    }

    public void b(byte[] bArr, int i2, int i3) {
        a.b(this.f37615c == 0);
        System.arraycopy(this.f37613a, this.f37614b, bArr, i2, i3);
        this.f37614b += i3;
        a();
    }

    public void c() {
        if (this.f37615c == 0) {
            return;
        }
        this.f37615c = 0;
        this.f37614b++;
        a();
    }

    public int a(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.f37615c += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f37615c;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f37615c = i5;
            byte[] bArr = this.f37613a;
            int i6 = this.f37614b;
            this.f37614b = i6 + 1;
            i4 |= (bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i5;
        }
        byte[] bArr2 = this.f37613a;
        int i7 = this.f37614b;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i3)));
        if (i3 == 8) {
            this.f37615c = 0;
            this.f37614b = i7 + 1;
        }
        a();
        return i8;
    }

    public void a(byte[] bArr, int i2, int i3) {
        int i4 = (i3 >> 3) + i2;
        while (i2 < i4) {
            byte[] bArr2 = this.f37613a;
            int i5 = this.f37614b;
            int i6 = i5 + 1;
            this.f37614b = i6;
            byte b2 = bArr2[i5];
            int i7 = this.f37615c;
            byte b3 = (byte) (b2 << i7);
            bArr[i2] = b3;
            bArr[i2] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b3);
            i2++;
        }
        int i8 = i3 & 7;
        if (i8 == 0) {
            return;
        }
        byte b4 = (byte) (bArr[i4] & (255 >> i8));
        bArr[i4] = b4;
        int i9 = this.f37615c;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.f37613a;
            int i10 = this.f37614b;
            this.f37614b = i10 + 1;
            bArr[i4] = (byte) (b4 | ((bArr3[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i9));
            this.f37615c = i9 - 8;
        }
        int i11 = this.f37615c + i8;
        this.f37615c = i11;
        byte[] bArr4 = this.f37613a;
        int i12 = this.f37614b;
        bArr[i4] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | bArr[i4]);
        if (i11 == 8) {
            this.f37615c = 0;
            this.f37614b = i12 + 1;
        }
        a();
    }

    public void a(int i2, int i3) {
        if (i3 < 32) {
            i2 &= (1 << i3) - 1;
        }
        int iMin = Math.min(8 - this.f37615c, i3);
        int i4 = this.f37615c;
        int i5 = (8 - i4) - iMin;
        byte[] bArr = this.f37613a;
        int i6 = this.f37614b;
        byte b2 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b2;
        int i7 = i3 - iMin;
        bArr[i6] = (byte) (b2 | ((i2 >>> i7) << i5));
        int i8 = i6 + 1;
        while (i7 > 8) {
            this.f37613a[i8] = (byte) (i2 >>> (i7 - 8));
            i7 -= 8;
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.f37613a;
        byte b3 = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = b3;
        bArr2[i8] = (byte) (((i2 & ((1 << i7) - 1)) << i9) | b3);
        c(i3);
        a();
    }

    private void a() {
        int i2;
        int i3 = this.f37614b;
        a.b(i3 >= 0 && (i3 < (i2 = this.d) || (i3 == i2 && this.f37615c == 0)));
    }
}
