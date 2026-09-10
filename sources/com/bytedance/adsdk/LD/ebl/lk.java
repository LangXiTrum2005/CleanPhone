package com.bytedance.adsdk.LD.ebl;

/* JADX INFO: loaded from: classes.dex */
public class lk {
    private float LD;
    private float Lxb;

    public lk(float f, float f2) {
        this.Lxb = f;
        this.LD = f2;
    }

    public float LD() {
        return this.LD;
    }

    public float Lxb() {
        return this.Lxb;
    }

    public String toString() {
        return Lxb() + "x" + LD();
    }

    public boolean LD(float f, float f2) {
        return this.Lxb == f && this.LD == f2;
    }

    public void Lxb(float f, float f2) {
        this.Lxb = f;
        this.LD = f2;
    }

    public lk() {
        this(1.0f, 1.0f);
    }
}
