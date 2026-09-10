package com.bytedance.adsdk.ud.lnr;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private final PointF lnr;
    private final PointF qdl;
    private final PointF ud;

    public qdl() {
        this.qdl = new PointF();
        this.ud = new PointF();
        this.lnr = new PointF();
    }

    public void lnr(float f, float f2) {
        this.lnr.set(f, f2);
    }

    public void qdl(float f, float f2) {
        this.qdl.set(f, f2);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.lnr.x), Float.valueOf(this.lnr.y), Float.valueOf(this.qdl.x), Float.valueOf(this.qdl.y), Float.valueOf(this.ud.x), Float.valueOf(this.ud.y));
    }

    public void ud(float f, float f2) {
        this.ud.set(f, f2);
    }

    public PointF lnr() {
        return this.lnr;
    }

    public PointF qdl() {
        return this.qdl;
    }

    public PointF ud() {
        return this.ud;
    }

    public qdl(PointF pointF, PointF pointF2, PointF pointF3) {
        this.qdl = pointF;
        this.ud = pointF2;
        this.lnr = pointF3;
    }
}
