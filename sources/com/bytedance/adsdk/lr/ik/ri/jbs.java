package com.bytedance.adsdk.lr.ik.ri;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class jbs implements aw<PointF, PointF> {
    private final lr lr;
    private final lr ri;

    public jbs(lr lrVar, lr lrVar2) {
        this.ri = lrVar;
        this.lr = lrVar2;
    }

    @Override // com.bytedance.adsdk.lr.ik.ri.aw
    public List<com.bytedance.adsdk.lr.xha.ri<PointF>> ik() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.lr.ik.ri.aw
    public boolean lr() {
        return this.ri.lr() && this.lr.lr();
    }

    @Override // com.bytedance.adsdk.lr.ik.ri.aw
    public com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> ri() {
        return new com.bytedance.adsdk.lr.ri.lr.bgr(this.ri.ri(), this.lr.ri());
    }
}
