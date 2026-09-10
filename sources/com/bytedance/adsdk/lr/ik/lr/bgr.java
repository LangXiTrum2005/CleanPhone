package com.bytedance.adsdk.lr.ik.lr;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class bgr {
    private boolean ik;
    private PointF lr;
    private final List<com.bytedance.adsdk.lr.ik.ri> ri;

    public bgr(PointF pointF, boolean z, List<com.bytedance.adsdk.lr.ik.ri> list) {
        this.lr = pointF;
        this.ik = z;
        this.ri = new ArrayList(list);
    }

    public List<com.bytedance.adsdk.lr.ik.ri> ik() {
        return this.ri;
    }

    public boolean lr() {
        return this.ik;
    }

    public void ri(float f, float f2) {
        if (this.lr == null) {
            this.lr = new PointF();
        }
        this.lr.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.ri.size() + "closed=" + this.ik + '}';
    }

    public PointF ri() {
        return this.lr;
    }

    public bgr() {
        this.ri = new ArrayList();
    }

    public void ri(boolean z) {
        this.ik = z;
    }

    public void ri(bgr bgrVar, bgr bgrVar2, float f) {
        if (this.lr == null) {
            this.lr = new PointF();
        }
        this.ik = bgrVar.lr() || bgrVar2.lr();
        if (bgrVar.ik().size() != bgrVar2.ik().size()) {
            bgrVar.ik().size();
            bgrVar2.ik().size();
        }
        int iMin = Math.min(bgrVar.ik().size(), bgrVar2.ik().size());
        if (this.ri.size() < iMin) {
            for (int size = this.ri.size(); size < iMin; size++) {
                this.ri.add(new com.bytedance.adsdk.lr.ik.ri());
            }
        } else if (this.ri.size() > iMin) {
            for (int size2 = this.ri.size() - 1; size2 >= iMin; size2--) {
                List<com.bytedance.adsdk.lr.ik.ri> list = this.ri;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFRi = bgrVar.ri();
        PointF pointFRi2 = bgrVar2.ri();
        ri(com.bytedance.adsdk.lr.di.fi.ri(pointFRi.x, pointFRi2.x, f), com.bytedance.adsdk.lr.di.fi.ri(pointFRi.y, pointFRi2.y, f));
        for (int size3 = this.ri.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.lr.ik.ri riVar = bgrVar.ik().get(size3);
            com.bytedance.adsdk.lr.ik.ri riVar2 = bgrVar2.ik().get(size3);
            PointF pointFRi3 = riVar.ri();
            PointF pointFLr = riVar.lr();
            PointF pointFIk = riVar.ik();
            PointF pointFRi4 = riVar2.ri();
            PointF pointFLr2 = riVar2.lr();
            PointF pointFIk2 = riVar2.ik();
            this.ri.get(size3).ri(com.bytedance.adsdk.lr.di.fi.ri(pointFRi3.x, pointFRi4.x, f), com.bytedance.adsdk.lr.di.fi.ri(pointFRi3.y, pointFRi4.y, f));
            this.ri.get(size3).lr(com.bytedance.adsdk.lr.di.fi.ri(pointFLr.x, pointFLr2.x, f), com.bytedance.adsdk.lr.di.fi.ri(pointFLr.y, pointFLr2.y, f));
            this.ri.get(size3).ik(com.bytedance.adsdk.lr.di.fi.ri(pointFIk.x, pointFIk2.x, f), com.bytedance.adsdk.lr.di.fi.ri(pointFIk.y, pointFIk2.y, f));
        }
    }
}
