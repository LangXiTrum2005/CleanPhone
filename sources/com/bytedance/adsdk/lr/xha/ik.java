package com.bytedance.adsdk.lr.xha;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private float lr;
    private float ri;

    public ik(float f, float f2) {
        this.ri = f;
        this.lr = f2;
    }

    public float lr() {
        return this.lr;
    }

    public float ri() {
        return this.ri;
    }

    public String toString() {
        return ri() + "x" + lr();
    }

    public boolean lr(float f, float f2) {
        return this.ri == f && this.lr == f2;
    }

    public void ri(float f, float f2) {
        this.ri = f;
        this.lr = f2;
    }

    public ik() {
        this(1.0f, 1.0f);
    }
}
