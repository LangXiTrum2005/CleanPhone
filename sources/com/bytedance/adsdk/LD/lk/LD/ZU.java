package com.bytedance.adsdk.LD.lk.LD;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ZU {
    private final int[] LD;
    private final float[] Lxb;

    public ZU(float[] fArr, int[] iArr) {
        this.Lxb = fArr;
        this.LD = iArr;
    }

    public int[] LD() {
        return this.LD;
    }

    public float[] Lxb() {
        return this.Lxb;
    }

    public int lk() {
        return this.LD.length;
    }

    public void Lxb(ZU zu, ZU zu2, float f) {
        if (zu.LD.length != zu2.LD.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(zu.LD.length);
            sb.append(" vs ");
            throw new IllegalArgumentException(AbstractC5044xl.o(sb, zu2.LD.length, ")"));
        }
        for (int i = 0; i < zu.LD.length; i++) {
            this.Lxb[i] = com.bytedance.adsdk.LD.lc.JXs.Lxb(zu.Lxb[i], zu2.Lxb[i], f);
            this.LD[i] = com.bytedance.adsdk.LD.lc.LD.Lxb(f, zu.LD[i], zu2.LD[i]);
        }
    }

    public ZU Lxb(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = Lxb(fArr[i]);
        }
        return new ZU(fArr, iArr);
    }

    private int Lxb(float f) {
        int iBinarySearch = Arrays.binarySearch(this.Lxb, f);
        if (iBinarySearch >= 0) {
            return this.LD[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        if (i == 0) {
            return this.LD[0];
        }
        int[] iArr = this.LD;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.Lxb;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return com.bytedance.adsdk.LD.lc.LD.Lxb((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }
}
