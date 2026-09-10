package com.bytedance.adsdk.LD.lk;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class Lxb {
    private final PointF LD;
    private final PointF Lxb;
    private final PointF lk;

    public Lxb() {
        this.Lxb = new PointF();
        this.LD = new PointF();
        this.lk = new PointF();
    }

    public void LD(float f, float f2) {
        this.LD.set(f, f2);
    }

    public void Lxb(float f, float f2) {
        this.Lxb.set(f, f2);
    }

    public void lk(float f, float f2) {
        this.lk.set(f, f2);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.lk.x), Float.valueOf(this.lk.y), Float.valueOf(this.Lxb.x), Float.valueOf(this.Lxb.y), Float.valueOf(this.LD.x), Float.valueOf(this.LD.y));
    }

    public PointF LD() {
        return this.LD;
    }

    public PointF Lxb() {
        return this.Lxb;
    }

    public PointF lk() {
        return this.lk;
    }

    public Lxb(PointF pointF, PointF pointF2, PointF pointF3) {
        this.Lxb = pointF;
        this.LD = pointF2;
        this.lk = pointF3;
    }
}
