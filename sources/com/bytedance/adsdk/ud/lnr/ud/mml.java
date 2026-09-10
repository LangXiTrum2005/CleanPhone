package com.bytedance.adsdk.ud.lnr.ud;

import android.support.v4.media.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class mml {
    private final float[] qdl;
    private final int[] ud;

    public mml(float[] fArr, int[] iArr) {
        this.qdl = fArr;
        this.ud = iArr;
    }

    public int lnr() {
        return this.ud.length;
    }

    public float[] qdl() {
        return this.qdl;
    }

    public int[] ud() {
        return this.ud;
    }

    public void qdl(mml mmlVar, mml mmlVar2, float f) {
        if (mmlVar.ud.length != mmlVar2.ud.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(mmlVar.ud.length);
            sb.append(" vs ");
            throw new IllegalArgumentException(a.i(mmlVar2.ud.length, ")", sb));
        }
        for (int i2 = 0; i2 < mmlVar.ud.length; i2++) {
            this.qdl[i2] = com.bytedance.adsdk.ud.mo.mzz.qdl(mmlVar.qdl[i2], mmlVar2.qdl[i2], f);
            this.ud[i2] = com.bytedance.adsdk.ud.mo.ud.qdl(f, mmlVar.ud[i2], mmlVar2.ud[i2]);
        }
    }

    public mml qdl(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            iArr[i2] = qdl(fArr[i2]);
        }
        return new mml(fArr, iArr);
    }

    private int qdl(float f) {
        int iBinarySearch = Arrays.binarySearch(this.qdl, f);
        if (iBinarySearch >= 0) {
            return this.ud[iBinarySearch];
        }
        int i2 = -(iBinarySearch + 1);
        if (i2 == 0) {
            return this.ud[0];
        }
        int[] iArr = this.ud;
        if (i2 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.qdl;
        int i3 = i2 - 1;
        float f2 = fArr[i3];
        return com.bytedance.adsdk.ud.mo.ud.qdl((f - f2) / (fArr[i2] - f2), iArr[i3], iArr[i2]);
    }
}
