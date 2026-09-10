package com.bytedance.adsdk.lr.ik.lr;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private final int[] lr;
    private final float[] ri;

    public ka(float[] fArr, int[] iArr) {
        this.ri = fArr;
        this.lr = iArr;
    }

    public int ik() {
        return this.lr.length;
    }

    public int[] lr() {
        return this.lr;
    }

    public float[] ri() {
        return this.ri;
    }

    public void ri(ka kaVar, ka kaVar2, float f) {
        if (kaVar.lr.length == kaVar2.lr.length) {
            for (int i = 0; i < kaVar.lr.length; i++) {
                this.ri[i] = com.bytedance.adsdk.lr.di.fi.ri(kaVar.ri[i], kaVar2.ri[i], f);
                this.lr[i] = com.bytedance.adsdk.lr.di.lr.ri(f, kaVar.lr[i], kaVar2.lr[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + kaVar.lr.length + " vs " + kaVar2.lr.length + ")");
    }

    public ka ri(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = ri(fArr[i]);
        }
        return new ka(fArr, iArr);
    }

    private int ri(float f) {
        int iBinarySearch = Arrays.binarySearch(this.ri, f);
        if (iBinarySearch >= 0) {
            return this.lr[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        if (i == 0) {
            return this.lr[0];
        }
        int[] iArr = this.lr;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.ri;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return com.bytedance.adsdk.lr.di.lr.ri((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }
}
