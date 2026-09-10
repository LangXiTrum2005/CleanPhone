package com.smartdigimkt.p4;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f37619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37621c;
    private int d;

    public t(byte[] bArr, int i2, int i3) {
        a(bArr, i2, i3);
    }

    public void a(byte[] bArr, int i2, int i3) {
        this.f37619a = bArr;
        this.f37621c = i2;
        this.f37620b = i3;
        this.d = 0;
        a();
    }

    public int b(int i2) {
        int i3;
        this.d += i2;
        int i4 = 0;
        while (true) {
            i3 = this.d;
            int i5 = 2;
            if (i3 <= 8) {
                break;
            }
            int i6 = i3 - 8;
            this.d = i6;
            byte[] bArr = this.f37619a;
            int i7 = this.f37621c;
            i4 |= (bArr[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i6;
            if (!c(i7 + 1)) {
                i5 = 1;
            }
            this.f37621c = i7 + i5;
        }
        byte[] bArr2 = this.f37619a;
        int i8 = this.f37621c;
        int i9 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i8] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i3)));
        if (i3 == 8) {
            this.d = 0;
            this.f37621c = i8 + (c(i8 + 1) ? 2 : 1);
        }
        a();
        return i9;
    }

    public boolean c() {
        boolean z2 = (this.f37619a[this.f37621c] & (128 >> this.d)) != 0;
        g();
        return z2;
    }

    public void d(int i2) {
        int i3 = this.f37621c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.f37621c = i5;
        int i6 = (i2 - (i4 * 8)) + this.d;
        this.d = i6;
        if (i6 > 7) {
            this.f37621c = i5 + 1;
            this.d = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.f37621c) {
                a();
                return;
            } else if (c(i3)) {
                this.f37621c++;
                i3 += 2;
            }
        }
    }

    public int e() {
        int iD = d();
        return ((iD + 1) / 2) * (iD % 2 == 0 ? -1 : 1);
    }

    public int f() {
        return d();
    }

    public void g() {
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == 8) {
            this.d = 0;
            int i3 = this.f37621c;
            this.f37621c = i3 + (c(i3 + 1) ? 2 : 1);
        }
        a();
    }

    private boolean c(int i2) {
        if (2 > i2 || i2 >= this.f37620b) {
            return false;
        }
        byte[] bArr = this.f37619a;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 - 1] == 0;
    }

    public boolean a(int i2) {
        int i3 = this.f37621c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.d + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            int i7 = i3 + 1;
            if (i7 > i5 || i5 >= this.f37620b) {
                break;
            }
            if (c(i7)) {
                i5++;
                i3 += 3;
            } else {
                i3 = i7;
            }
        }
        int i8 = this.f37620b;
        if (i5 >= i8) {
            return i5 == i8 && i6 == 0;
        }
        return true;
    }

    public boolean b() {
        int i2 = this.f37621c;
        int i3 = this.d;
        int i4 = 0;
        while (this.f37621c < this.f37620b && !c()) {
            i4++;
        }
        boolean z2 = this.f37621c == this.f37620b;
        this.f37621c = i2;
        this.d = i3;
        return !z2 && a((i4 * 2) + 1);
    }

    private int d() {
        int i2 = 0;
        while (!c()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? b(i2) : 0);
    }

    private void a() {
        int i2;
        int i3 = this.f37621c;
        a.b(i3 >= 0 && (i3 < (i2 = this.f37620b) || (i3 == i2 && this.d == 0)));
    }
}
