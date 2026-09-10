package com.bytedance.adsdk.lr.ik.ri;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class fi implements aw<PointF, PointF> {
    private final List<com.bytedance.adsdk.lr.xha.ri<PointF>> ri;

    public fi(List<com.bytedance.adsdk.lr.xha.ri<PointF>> list) {
        this.ri = list;
    }

    @Override // com.bytedance.adsdk.lr.ik.ri.aw
    public List<com.bytedance.adsdk.lr.xha.ri<PointF>> ik() {
        return this.ri;
    }

    @Override // com.bytedance.adsdk.lr.ik.ri.aw
    public boolean lr() {
        return this.ri.size() == 1 && this.ri.get(0).fi();
    }

    @Override // com.bytedance.adsdk.lr.ik.ri.aw
    public com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> ri() {
        return this.ri.get(0).fi() ? new com.bytedance.adsdk.lr.ri.lr.sf(this.ri) : new com.bytedance.adsdk.lr.ri.lr.qt(this.ri);
    }
}
