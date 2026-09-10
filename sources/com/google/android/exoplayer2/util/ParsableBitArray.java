package com.google.android.exoplayer2.util;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class ParsableBitArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f18952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18954c;
    public int d;

    public ParsableBitArray() {
        this.f18952a = Util.f;
    }

    public final void a() {
        int i2;
        int i3 = this.f18953b;
        Assertions.d(i3 >= 0 && (i3 < (i2 = this.d) || (i3 == i2 && this.f18954c == 0)));
    }

    public final int b() {
        return ((this.d - this.f18953b) * 8) - this.f18954c;
    }

    public final void c() {
        if (this.f18954c == 0) {
            return;
        }
        this.f18954c = 0;
        this.f18953b++;
        a();
    }

    public final int d() {
        Assertions.d(this.f18954c == 0);
        return this.f18953b;
    }

    public final int e() {
        return (this.f18953b * 8) + this.f18954c;
    }

    public final boolean f() {
        boolean z2 = (this.f18952a[this.f18953b] & (128 >> this.f18954c)) != 0;
        m();
        return z2;
    }

    public final int g(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.f18954c += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f18954c;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f18954c = i5;
            byte[] bArr = this.f18952a;
            int i6 = this.f18953b;
            this.f18953b = i6 + 1;
            i4 |= (bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i5;
        }
        byte[] bArr2 = this.f18952a;
        int i7 = this.f18953b;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i3)));
        if (i3 == 8) {
            this.f18954c = 0;
            this.f18953b = i7 + 1;
        }
        a();
        return i8;
    }

    public final void h(int i2, byte[] bArr) {
        int i3 = i2 >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.f18952a;
            int i5 = this.f18953b;
            int i6 = i5 + 1;
            this.f18953b = i6;
            byte b2 = bArr2[i5];
            int i7 = this.f18954c;
            byte b3 = (byte) (b2 << i7);
            bArr[i4] = b3;
            bArr[i4] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b3);
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        byte b4 = (byte) (bArr[i3] & (255 >> i8));
        bArr[i3] = b4;
        int i9 = this.f18954c;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.f18952a;
            int i10 = this.f18953b;
            this.f18953b = i10 + 1;
            bArr[i3] = (byte) (b4 | ((bArr3[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i9));
            this.f18954c = i9 - 8;
        }
        int i11 = this.f18954c + i8;
        this.f18954c = i11;
        byte[] bArr4 = this.f18952a;
        int i12 = this.f18953b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | bArr[i3]);
        if (i11 == 8) {
            this.f18954c = 0;
            this.f18953b = i12 + 1;
        }
        a();
    }

    public final void i(int i2, byte[] bArr) {
        Assertions.d(this.f18954c == 0);
        System.arraycopy(this.f18952a, this.f18953b, bArr, 0, i2);
        this.f18953b += i2;
        a();
    }

    public final void j(ParsableByteArray parsableByteArray) {
        k(parsableByteArray.f18956a, parsableByteArray.f18958c);
        l(parsableByteArray.f18957b * 8);
    }

    public final void k(byte[] bArr, int i2) {
        this.f18952a = bArr;
        this.f18953b = 0;
        this.f18954c = 0;
        this.d = i2;
    }

    public final void l(int i2) {
        int i3 = i2 / 8;
        this.f18953b = i3;
        this.f18954c = i2 - (i3 * 8);
        a();
    }

    public final void m() {
        int i2 = this.f18954c + 1;
        this.f18954c = i2;
        if (i2 == 8) {
            this.f18954c = 0;
            this.f18953b++;
        }
        a();
    }

    public final void n(int i2) {
        int i3 = i2 / 8;
        int i4 = this.f18953b + i3;
        this.f18953b = i4;
        int i5 = (i2 - (i3 * 8)) + this.f18954c;
        this.f18954c = i5;
        if (i5 > 7) {
            this.f18953b = i4 + 1;
            this.f18954c = i5 - 8;
        }
        a();
    }

    public final void o(int i2) {
        Assertions.d(this.f18954c == 0);
        this.f18953b += i2;
        a();
    }

    public ParsableBitArray(byte[] bArr, int i2) {
        this.f18952a = bArr;
        this.d = i2;
    }
}
