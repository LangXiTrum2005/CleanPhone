package com.bytedance.sdk.component.lr.ri.lr;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class xha extends ka {
    final transient int[] mj;
    final transient byte[][] xha;

    public xha(ri riVar, int i) {
        super(null);
        jbs.ri(riVar.lr, 0L, i);
        fi fiVar = riVar.ri;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = fiVar.ik;
            int i6 = fiVar.lr;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            fiVar = fiVar.di;
        }
        this.xha = new byte[i4][];
        this.mj = new int[i4 * 2];
        fi fiVar2 = riVar.ri;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.xha;
            bArr[i7] = fiVar2.ri;
            int i8 = fiVar2.ik;
            int i9 = fiVar2.lr;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.mj;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            fiVar2.ka = true;
            i7++;
            fiVar2 = fiVar2.di;
        }
    }

    private ka fi() {
        return new ka(ka());
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr.ka
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ka) {
            ka kaVar = (ka) obj;
            if (kaVar.ik() == ik() && ri(0, kaVar, 0, ik())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr.ka
    public int hashCode() {
        int i = this.fi;
        if (i != 0) {
            return i;
        }
        int length = this.xha.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.xha[i2];
            int[] iArr = this.mj;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.fi = i3;
        return i3;
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr.ka
    public int ik() {
        return this.mj[this.xha.length - 1];
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr.ka
    public byte[] ka() {
        int[] iArr = this.mj;
        byte[][] bArr = this.xha;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.mj;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.xha[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr.ka
    public String lr() {
        return fi().lr();
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr.ka
    public String ri() {
        return fi().ri();
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr.ka
    public String toString() {
        return fi().toString();
    }

    private int lr(int i) {
        int iBinarySearch = Arrays.binarySearch(this.mj, 0, this.xha.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr.ka
    public ka ri(int i, int i2) {
        return fi().ri(i, i2);
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr.ka
    public byte ri(int i) {
        jbs.ri(this.mj[this.xha.length - 1], i, 1L);
        int iLr = lr(i);
        int i2 = iLr == 0 ? 0 : this.mj[iLr - 1];
        int[] iArr = this.mj;
        byte[][] bArr = this.xha;
        return bArr[iLr][(i - i2) + iArr[bArr.length + iLr]];
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr.ka
    public boolean ri(int i, ka kaVar, int i2, int i3) {
        if (i < 0 || i > ik() - i3) {
            return false;
        }
        int iLr = lr(i);
        while (i3 > 0) {
            int i4 = iLr == 0 ? 0 : this.mj[iLr - 1];
            int iMin = Math.min(i3, ((this.mj[iLr] - i4) + i4) - i);
            int[] iArr = this.mj;
            byte[][] bArr = this.xha;
            if (!kaVar.ri(i2, bArr[iLr], (i - i4) + iArr[bArr.length + iLr], iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iLr++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.lr.ri.lr.ka
    public boolean ri(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > ik() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iLr = lr(i);
        while (i3 > 0) {
            int i4 = iLr == 0 ? 0 : this.mj[iLr - 1];
            int iMin = Math.min(i3, ((this.mj[iLr] - i4) + i4) - i);
            int[] iArr = this.mj;
            byte[][] bArr2 = this.xha;
            if (!jbs.ri(bArr2[iLr], (i - i4) + iArr[bArr2.length + iLr], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iLr++;
        }
        return true;
    }
}
