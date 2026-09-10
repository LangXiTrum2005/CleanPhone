package com.bytedance.sdk.component.ud.qdl.ud;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class wd extends mml {
    final transient int[] jpc;
    final transient byte[][] wd;

    public wd(qdl qdlVar, int i2) {
        super(null);
        tvp.qdl(qdlVar.ud, 0L, i2);
        mzz mzzVar = qdlVar.qdl;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = mzzVar.lnr;
            int i7 = mzzVar.ud;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            mzzVar = mzzVar.mo;
        }
        this.wd = new byte[i5][];
        this.jpc = new int[i5 * 2];
        mzz mzzVar2 = qdlVar.qdl;
        int i8 = 0;
        while (i3 < i2) {
            byte[][] bArr = this.wd;
            bArr[i8] = mzzVar2.qdl;
            int i9 = mzzVar2.lnr;
            int i10 = mzzVar2.ud;
            int i11 = (i9 - i10) + i3;
            i3 = i11 > i2 ? i2 : i11;
            int[] iArr = this.jpc;
            iArr[i8] = i3;
            iArr[bArr.length + i8] = i10;
            mzzVar2.mml = true;
            i8++;
            mzzVar2 = mzzVar2.mo;
        }
    }

    private mml mzz() {
        return new mml(mml());
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mml) {
            mml mmlVar = (mml) obj;
            if (mmlVar.lnr() == lnr() && qdl(0, mmlVar, 0, lnr())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public int hashCode() {
        int i2 = this.mzz;
        if (i2 != 0) {
            return i2;
        }
        int length = this.wd.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            byte[] bArr = this.wd[i3];
            int[] iArr = this.jpc;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.mzz = i4;
        return i4;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public int lnr() {
        return this.jpc[this.wd.length - 1];
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public byte[] mml() {
        int[] iArr = this.jpc;
        byte[][] bArr = this.wd;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr2 = this.jpc;
            int i4 = iArr2[length + i2];
            int i5 = iArr2[i2];
            System.arraycopy(this.wd[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public String qdl() {
        return mzz().qdl();
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public String toString() {
        return mzz().toString();
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public String ud() {
        return mzz().ud();
    }

    private int ud(int i2) {
        int iBinarySearch = Arrays.binarySearch(this.jpc, 0, this.wd.length, i2 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public mml qdl(int i2, int i3) {
        return mzz().qdl(i2, i3);
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public byte qdl(int i2) {
        tvp.qdl(this.jpc[this.wd.length - 1], i2, 1L);
        int iUd = ud(i2);
        int i3 = iUd == 0 ? 0 : this.jpc[iUd - 1];
        int[] iArr = this.jpc;
        byte[][] bArr = this.wd;
        return bArr[iUd][(i2 - i3) + iArr[bArr.length + iUd]];
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public boolean qdl(int i2, mml mmlVar, int i3, int i4) {
        if (i2 < 0 || i2 > lnr() - i4) {
            return false;
        }
        int iUd = ud(i2);
        while (i4 > 0) {
            int i5 = iUd == 0 ? 0 : this.jpc[iUd - 1];
            int iMin = Math.min(i4, ((this.jpc[iUd] - i5) + i5) - i2);
            int[] iArr = this.jpc;
            byte[][] bArr = this.wd;
            if (!mmlVar.qdl(i3, bArr[iUd], (i2 - i5) + iArr[bArr.length + iUd], iMin)) {
                return false;
            }
            i2 += iMin;
            i3 += iMin;
            i4 -= iMin;
            iUd++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.ud.mml
    public boolean qdl(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0 || i2 > lnr() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int iUd = ud(i2);
        while (i4 > 0) {
            int i5 = iUd == 0 ? 0 : this.jpc[iUd - 1];
            int iMin = Math.min(i4, ((this.jpc[iUd] - i5) + i5) - i2);
            int[] iArr = this.jpc;
            byte[][] bArr2 = this.wd;
            if (!tvp.qdl(bArr2[iUd], (i2 - i5) + iArr[bArr2.length + iUd], bArr, i3, iMin)) {
                return false;
            }
            i2 += iMin;
            i3 += iMin;
            i4 -= iMin;
            iUd++;
        }
        return true;
    }
}
