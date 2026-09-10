package com.bytedance.adsdk.lr.ik;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private final PointF ik;
    private final PointF lr;
    private final PointF ri;

    public ri() {
        this.ri = new PointF();
        this.lr = new PointF();
        this.ik = new PointF();
    }

    public void ik(float f, float f2) {
        this.ik.set(f, f2);
    }

    public void lr(float f, float f2) {
        this.lr.set(f, f2);
    }

    public void ri(float f, float f2) {
        this.ri.set(f, f2);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.ik.x), Float.valueOf(this.ik.y), Float.valueOf(this.ri.x), Float.valueOf(this.ri.y), Float.valueOf(this.lr.x), Float.valueOf(this.lr.y));
    }

    public PointF ik() {
        return this.ik;
    }

    public PointF lr() {
        return this.lr;
    }

    public PointF ri() {
        return this.ri;
    }

    public ri(PointF pointF, PointF pointF2, PointF pointF3) {
        this.ri = pointF;
        this.lr = pointF2;
        this.ik = pointF3;
    }
}
