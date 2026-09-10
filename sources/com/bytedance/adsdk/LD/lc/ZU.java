package com.bytedance.adsdk.LD.lc;

/* JADX INFO: loaded from: classes.dex */
public class ZU {
    private int LD;
    private float Lxb;

    public void Lxb(float f) {
        float f2 = this.Lxb + f;
        this.Lxb = f2;
        int i = this.LD + 1;
        this.LD = i;
        if (i == Integer.MAX_VALUE) {
            this.Lxb = f2 / 2.0f;
            this.LD = i / 2;
        }
    }
}
