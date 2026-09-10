package androidx.media3.container;

import androidx.media3.common.util.Assertions;
import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ParsableNalUnitBitArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f5717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5719c;
    public int d = 0;

    public ParsableNalUnitBitArray(byte[] bArr, int i2, int i3) {
        this.f5717a = bArr;
        this.f5719c = i2;
        this.f5718b = i3;
        a();
    }

    public final void a() {
        int i2;
        int i3 = this.f5719c;
        Assertions.e(i3 >= 0 && (i3 < (i2 = this.f5718b) || (i3 == i2 && this.d == 0)));
    }

    public final boolean b(int i2) {
        int i3 = this.f5719c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.d + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 >= this.f5718b) {
                break;
            }
            if (h(i3)) {
                i5++;
                i3 += 2;
            }
        }
        int i7 = this.f5718b;
        if (i5 >= i7) {
            return i5 == i7 && i6 == 0;
        }
        return true;
    }

    public final boolean c() {
        int i2 = this.f5719c;
        int i3 = this.d;
        int i4 = 0;
        while (this.f5719c < this.f5718b && !d()) {
            i4++;
        }
        boolean z2 = this.f5719c == this.f5718b;
        this.f5719c = i2;
        this.d = i3;
        return !z2 && b((i4 * 2) + 1);
    }

    public final boolean d() {
        boolean z2 = (this.f5717a[this.f5719c] & (128 >> this.d)) != 0;
        i();
        return z2;
    }

    public final int e(int i2) {
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
            byte[] bArr = this.f5717a;
            int i7 = this.f5719c;
            i4 |= (bArr[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i6;
            if (!h(i7 + 1)) {
                i5 = 1;
            }
            this.f5719c = i7 + i5;
        }
        byte[] bArr2 = this.f5717a;
        int i8 = this.f5719c;
        int i9 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i8] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i3)));
        if (i3 == 8) {
            this.d = 0;
            this.f5719c = i8 + (h(i8 + 1) ? 2 : 1);
        }
        a();
        return i9;
    }

    public final int f() {
        int i2 = 0;
        while (!d()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? e(i2) : 0);
    }

    public final int g() {
        int iF = f();
        return ((iF + 1) / 2) * (iF % 2 == 0 ? -1 : 1);
    }

    public final boolean h(int i2) {
        if (2 > i2 || i2 >= this.f5718b) {
            return false;
        }
        byte[] bArr = this.f5717a;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 - 1] == 0;
    }

    public final void i() {
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == 8) {
            this.d = 0;
            int i3 = this.f5719c;
            this.f5719c = i3 + (h(i3 + 1) ? 2 : 1);
        }
        a();
    }

    public final void j(int i2) {
        int i3 = this.f5719c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.f5719c = i5;
        int i6 = (i2 - (i4 * 8)) + this.d;
        this.d = i6;
        if (i6 > 7) {
            this.f5719c = i5 + 1;
            this.d = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.f5719c) {
                a();
                return;
            } else if (h(i3)) {
                this.f5719c++;
                i3 += 2;
            }
        }
    }
}
