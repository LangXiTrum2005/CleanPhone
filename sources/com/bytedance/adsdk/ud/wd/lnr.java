package com.bytedance.adsdk.ud.wd;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    private float qdl;
    private float ud;

    public lnr(float f, float f2) {
        this.qdl = f;
        this.ud = f2;
    }

    public float qdl() {
        return this.qdl;
    }

    public String toString() {
        return qdl() + "x" + ud();
    }

    public float ud() {
        return this.ud;
    }

    public void qdl(float f, float f2) {
        this.qdl = f;
        this.ud = f2;
    }

    public boolean ud(float f, float f2) {
        return this.qdl == f && this.ud == f2;
    }

    public lnr() {
        this(1.0f, 1.0f);
    }
}
