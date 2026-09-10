package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f14921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14924d;

    public gp0(byte[] bArr, int i10) {
        this.f14921a = bArr;
        this.f14924d = i10;
    }

    public final void a(np0 np0Var) {
        byte[] bArr = np0Var.f17880a;
        int i10 = np0Var.f17882c;
        this.f14921a = bArr;
        this.f14922b = 0;
        this.f14923c = 0;
        this.f14924d = i10;
        d(np0Var.f17881b * 8);
    }

    public final int b() {
        return ((this.f14924d - this.f14922b) * 8) - this.f14923c;
    }

    public final int c() {
        ps1.c0(this.f14923c == 0);
        return this.f14922b;
    }

    public final void d(int i10) {
        int i11 = i10 / 8;
        this.f14922b = i11;
        this.f14923c = i10 - (i11 * 8);
        m();
    }

    public final void e() {
        int i10 = this.f14923c + 1;
        this.f14923c = i10;
        if (i10 == 8) {
            this.f14923c = 0;
            this.f14922b++;
        }
        m();
    }

    public final void f(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f14922b + i11;
        this.f14922b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f14923c;
        this.f14923c = i13;
        if (i13 > 7) {
            this.f14922b = i12 + 1;
            this.f14923c = i13 - 8;
        }
        m();
    }

    public final boolean g() {
        int i10 = this.f14921a[this.f14922b] & (128 >> this.f14923c);
        e();
        return i10 != 0;
    }

    public final int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f14923c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f14923c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f14923c = i13;
            byte[] bArr = this.f14921a;
            int i14 = this.f14922b;
            this.f14922b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f14921a;
        int i15 = this.f14922b;
        int i16 = i12 | ((bArr2[i15] & 255) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.f14923c = 0;
            this.f14922b = i15 + 1;
        }
        int i18 = ((-1) >>> i17) & i16;
        m();
        return i18;
    }

    public final long i(int i10) {
        if (i10 <= 32) {
            int iH = h(i10);
            String str = uu0.f20901a;
            return ((long) iH) & 4294967295L;
        }
        int iH2 = h(i10 - 32);
        int iH3 = h(32);
        String str2 = uu0.f20901a;
        return ((((long) iH2) & 4294967295L) << 32) | (4294967295L & ((long) iH3));
    }

    public final void j(int i10, byte[] bArr) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i10 >> 3;
            if (i12 >= i11) {
                break;
            }
            byte[] bArr2 = this.f14921a;
            int i13 = this.f14922b;
            int i14 = i13 + 1;
            this.f14922b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f14923c;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((bArr2[i14] & 255) >> (8 - i15)) | b11);
            i12++;
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.f14923c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f14921a;
            int i18 = this.f14922b;
            this.f14922b = i18 + 1;
            b12 = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            bArr[i11] = b12;
            i17 -= 8;
        }
        int i19 = i17 + i16;
        this.f14923c = i19;
        byte[] bArr4 = this.f14921a;
        int i20 = this.f14922b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | b12);
        if (i19 == 8) {
            this.f14923c = 0;
            this.f14922b = i20 + 1;
        }
        m();
    }

    public final void k() {
        if (this.f14923c == 0) {
            return;
        }
        this.f14923c = 0;
        this.f14922b++;
        m();
    }

    public final void l(int i10) {
        ps1.c0(this.f14923c == 0);
        this.f14922b += i10;
        m();
    }

    public final void m() {
        int i10;
        int i11 = this.f14922b;
        boolean z10 = false;
        if (i11 >= 0 && (i11 < (i10 = this.f14924d) || (i11 == i10 && this.f14923c == 0))) {
            z10 = true;
        }
        ps1.c0(z10);
    }

    public gp0() {
        this.f14921a = uu0.f20902b;
    }
}
