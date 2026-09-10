package com.bytedance.adsdk.lr.di;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    private int lr;
    private float ri;

    public void ri(float f) {
        float f2 = this.ri + f;
        this.ri = f2;
        int i = this.lr + 1;
        this.lr = i;
        if (i == Integer.MAX_VALUE) {
            this.ri = f2 / 2.0f;
            this.lr = i / 2;
        }
    }
}
