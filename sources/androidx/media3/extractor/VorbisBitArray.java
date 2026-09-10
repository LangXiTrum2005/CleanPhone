package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes.dex */
public final class VorbisBitArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6814c;
    public int d;

    public VorbisBitArray(byte[] bArr) {
        this.f6812a = bArr;
        this.f6813b = bArr.length;
    }

    public final boolean a() {
        boolean z2 = (((this.f6812a[this.f6814c] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.d) & 1) == 1;
        c(1);
        return z2;
    }

    public final int b(int i2) {
        int i3 = this.f6814c;
        int iMin = Math.min(i2, 8 - this.d);
        int i4 = i3 + 1;
        byte[] bArr = this.f6812a;
        int i5 = ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.d) & (255 >> (8 - iMin));
        while (iMin < i2) {
            i5 |= (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << iMin;
            iMin += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i2));
        c(i2);
        return i6;
    }

    public final void c(int i2) {
        int i3;
        int i4 = i2 / 8;
        int i5 = this.f6814c + i4;
        this.f6814c = i5;
        int i6 = (i2 - (i4 * 8)) + this.d;
        this.d = i6;
        boolean z2 = true;
        if (i6 > 7) {
            this.f6814c = i5 + 1;
            this.d = i6 - 8;
        }
        int i7 = this.f6814c;
        if (i7 < 0 || (i7 >= (i3 = this.f6813b) && (i7 != i3 || this.d != 0))) {
            z2 = false;
        }
        Assertions.e(z2);
    }
}
