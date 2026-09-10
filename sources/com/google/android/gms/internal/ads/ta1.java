package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ta1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f20278e;

    public ta1(byte[] bArr, int i10, int i11) {
        this.f20278e = bArr;
        this.f20275b = i10;
        this.f20276c = i10;
        this.f20274a = i11;
        this.f20277d = 0;
        i();
    }

    public void a() {
        int i10 = this.f20277d + 1;
        this.f20277d = i10;
        if (i10 == 8) {
            this.f20277d = 0;
            int i11 = this.f20276c;
            this.f20276c = i11 + (true == h(i11 + 1) ? 2 : 1);
        }
        i();
    }

    public void b(int i10) {
        int i11 = this.f20276c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f20276c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f20277d;
        this.f20277d = i14;
        if (i14 > 7) {
            this.f20276c = i13 + 1;
            this.f20277d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f20276c) {
                i();
                return;
            } else if (h(i11)) {
                this.f20276c++;
                i11 += 2;
            }
        }
    }

    public boolean c(int i10) {
        int i11;
        int i12 = this.f20276c;
        int i13 = i10 / 8;
        int i14 = i12 + i13;
        int i15 = (this.f20277d + i10) - (i13 * 8);
        if (i15 > 7) {
            i14++;
            i15 -= 8;
        }
        while (true) {
            i12++;
            i11 = this.f20274a;
            if (i12 > i14 || i14 > i11) {
                break;
            }
            if (h(i12)) {
                i14++;
                i12 += 2;
            }
        }
        if (i14 >= i11) {
            return i14 == i11 && i15 == 0;
        }
        return true;
    }

    public boolean d() {
        int i10 = this.f20278e[this.f20276c] & (128 >> this.f20277d);
        a();
        return i10 != 0;
    }

    public int e(int i10) {
        int i11;
        byte[] bArr;
        this.f20277d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f20277d;
            int i13 = 2;
            bArr = this.f20278e;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f20277d = i14;
            int i15 = this.f20276c;
            i12 |= (bArr[i15] & 255) << i14;
            if (true != h(i15 + 1)) {
                i13 = 1;
            }
            this.f20276c = i15 + i13;
        }
        int i16 = this.f20276c;
        int i17 = i12 | ((bArr[i16] & 255) >> (8 - i11));
        int i18 = 32 - i10;
        if (i11 == 8) {
            this.f20277d = 0;
            this.f20276c = i16 + (true != h(i16 + 1) ? 1 : 2);
        }
        int i19 = ((-1) >>> i18) & i17;
        i();
        return i19;
    }

    public int f() {
        int iG = g();
        int i10 = iG % 2;
        return ((iG + 1) / 2) * (i10 == 0 ? -1 : 1);
    }

    public int g() {
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? e(i10) : 0);
    }

    public boolean h(int i10) {
        int i11 = i10 - 2;
        if (this.f20275b > i11 || i10 >= this.f20274a) {
            return false;
        }
        byte[] bArr = this.f20278e;
        return bArr[i10] == 3 && bArr[i11] == 0 && bArr[i10 + (-1)] == 0;
    }

    public void i() {
        int i10;
        int i11 = this.f20276c;
        boolean z10 = false;
        if (i11 >= 0 && (i11 < (i10 = this.f20274a) || (i11 == i10 && this.f20277d == 0))) {
            z10 = true;
        }
        ps1.c0(z10);
    }

    public ta1(int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f20274a = i11;
        this.f20275b = i12;
        this.f20276c = i13;
        this.f20277d = i14;
        this.f20278e = bArr;
    }
}
