package com.bytedance.adsdk.LD.lk.LD;

import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.google.android.material.color.utilities.Contrast;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class STP {
    private PointF LD;
    private final List<com.bytedance.adsdk.LD.lk.Lxb> Lxb;
    private boolean lk;

    public STP(PointF pointF, boolean z, List<com.bytedance.adsdk.LD.lk.Lxb> list) {
        this.LD = pointF;
        this.lk = z;
        this.Lxb = new ArrayList(list);
    }

    public boolean LD() {
        return this.lk;
    }

    public void Lxb(float f, float f2) {
        if (this.LD == null) {
            this.LD = new PointF();
        }
        this.LD.set(f, f2);
    }

    public List<com.bytedance.adsdk.LD.lk.Lxb> lk() {
        return this.Lxb;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.Lxb.size() + "closed=" + this.lk + '}';
    }

    public PointF Lxb() {
        return this.LD;
    }

    public STP() {
        this.Lxb = new ArrayList();
    }

    public void Lxb(boolean z) {
        this.lk = z;
    }

    public void Lxb(STP stp, STP stp2, @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f) {
        if (this.LD == null) {
            this.LD = new PointF();
        }
        this.lk = stp.LD() || stp2.LD();
        if (stp.lk().size() != stp2.lk().size()) {
            stp.lk().size();
            stp2.lk().size();
        }
        int iMin = Math.min(stp.lk().size(), stp2.lk().size());
        if (this.Lxb.size() < iMin) {
            for (int size = this.Lxb.size(); size < iMin; size++) {
                this.Lxb.add(new com.bytedance.adsdk.LD.lk.Lxb());
            }
        } else if (this.Lxb.size() > iMin) {
            for (int size2 = this.Lxb.size() - 1; size2 >= iMin; size2--) {
                List<com.bytedance.adsdk.LD.lk.Lxb> list = this.Lxb;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFLxb = stp.Lxb();
        PointF pointFLxb2 = stp2.Lxb();
        Lxb(com.bytedance.adsdk.LD.lc.JXs.Lxb(pointFLxb.x, pointFLxb2.x, f), com.bytedance.adsdk.LD.lc.JXs.Lxb(pointFLxb.y, pointFLxb2.y, f));
        for (int size3 = this.Lxb.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.LD.lk.Lxb lxb = stp.lk().get(size3);
            com.bytedance.adsdk.LD.lk.Lxb lxb2 = stp2.lk().get(size3);
            PointF pointFLxb3 = lxb.Lxb();
            PointF pointFLD = lxb.LD();
            PointF pointFLk = lxb.lk();
            PointF pointFLxb4 = lxb2.Lxb();
            PointF pointFLD2 = lxb2.LD();
            PointF pointFLk2 = lxb2.lk();
            this.Lxb.get(size3).Lxb(com.bytedance.adsdk.LD.lc.JXs.Lxb(pointFLxb3.x, pointFLxb4.x, f), com.bytedance.adsdk.LD.lc.JXs.Lxb(pointFLxb3.y, pointFLxb4.y, f));
            this.Lxb.get(size3).LD(com.bytedance.adsdk.LD.lc.JXs.Lxb(pointFLD.x, pointFLD2.x, f), com.bytedance.adsdk.LD.lc.JXs.Lxb(pointFLD.y, pointFLD2.y, f));
            this.Lxb.get(size3).lk(com.bytedance.adsdk.LD.lc.JXs.Lxb(pointFLk.x, pointFLk2.x, f), com.bytedance.adsdk.LD.lc.JXs.Lxb(pointFLk.y, pointFLk2.y, f));
        }
    }
}
