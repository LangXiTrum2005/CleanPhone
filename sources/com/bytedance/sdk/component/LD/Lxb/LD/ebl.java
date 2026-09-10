package com.bytedance.sdk.component.LD.Lxb.LD;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class ebl extends ZU {
    final transient int[] OY;
    final transient byte[][] ebl;

    public ebl(Lxb lxb, int i) {
        super(null);
        QAg.Lxb(lxb.LD, 0L, i);
        JXs jXs = lxb.Lxb;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = jXs.lk;
            int i6 = jXs.LD;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            jXs = jXs.lc;
        }
        this.ebl = new byte[i4][];
        this.OY = new int[i4 * 2];
        JXs jXs2 = lxb.Lxb;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.ebl;
            bArr[i7] = jXs2.Lxb;
            int i8 = jXs2.lk;
            int i9 = jXs2.LD;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.OY;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            jXs2.ZU = true;
            i7++;
            jXs2 = jXs2.lc;
        }
    }

    private ZU JXs() {
        return new ZU(ZU());
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD.ZU
    public String LD() {
        return JXs().LD();
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD.ZU
    public String Lxb() {
        return JXs().Lxb();
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD.ZU
    public byte[] ZU() {
        int[] iArr = this.OY;
        byte[][] bArr = this.ebl;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.OY;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.ebl[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD.ZU
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ZU) {
            ZU zu = (ZU) obj;
            if (zu.lk() == lk() && Lxb(0, zu, 0, lk())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD.ZU
    public int hashCode() {
        int i = this.JXs;
        if (i != 0) {
            return i;
        }
        int length = this.ebl.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.ebl[i2];
            int[] iArr = this.OY;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.JXs = i4;
        return i4;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD.ZU
    public int lk() {
        return this.OY[this.ebl.length - 1];
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD.ZU
    public String toString() {
        return JXs().toString();
    }

    private int LD(int i) {
        int iBinarySearch = Arrays.binarySearch(this.OY, 0, this.ebl.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD.ZU
    public ZU Lxb(int i, int i2) {
        return JXs().Lxb(i, i2);
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD.ZU
    public byte Lxb(int i) {
        QAg.Lxb(this.OY[this.ebl.length - 1], i, 1L);
        int iLD = LD(i);
        int i2 = iLD == 0 ? 0 : this.OY[iLD - 1];
        int[] iArr = this.OY;
        byte[][] bArr = this.ebl;
        return bArr[iLD][(i - i2) + iArr[bArr.length + iLD]];
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD.ZU
    public boolean Lxb(int i, ZU zu, int i2, int i3) {
        if (i < 0 || i > lk() - i3) {
            return false;
        }
        int iLD = LD(i);
        while (i3 > 0) {
            int i4 = iLD == 0 ? 0 : this.OY[iLD - 1];
            int iMin = Math.min(i3, ((this.OY[iLD] - i4) + i4) - i);
            int[] iArr = this.OY;
            byte[][] bArr = this.ebl;
            if (!zu.Lxb(i2, bArr[iLD], (i - i4) + iArr[bArr.length + iLD], iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iLD++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.LD.ZU
    public boolean Lxb(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > lk() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iLD = LD(i);
        while (i3 > 0) {
            int i4 = iLD == 0 ? 0 : this.OY[iLD - 1];
            int iMin = Math.min(i3, ((this.OY[iLD] - i4) + i4) - i);
            int[] iArr = this.OY;
            byte[][] bArr2 = this.ebl;
            if (!QAg.Lxb(bArr2[iLD], (i - i4) + iArr[bArr2.length + iLD], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iLD++;
        }
        return true;
    }
}
