package com.bytedance.adsdk.LD.lk.Lxb;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class QAg implements NXR<PointF, PointF> {
    private final LD LD;
    private final LD Lxb;

    public QAg(LD ld, LD ld2) {
        this.Lxb = ld;
        this.LD = ld2;
    }

    @Override // com.bytedance.adsdk.LD.lk.Lxb.NXR
    public boolean LD() {
        return this.Lxb.LD() && this.LD.LD();
    }

    @Override // com.bytedance.adsdk.LD.lk.Lxb.NXR
    public com.bytedance.adsdk.LD.Lxb.LD.Lxb<PointF, PointF> Lxb() {
        return new com.bytedance.adsdk.LD.Lxb.LD.STP(this.Lxb.Lxb(), this.LD.Lxb());
    }

    @Override // com.bytedance.adsdk.LD.lk.Lxb.NXR
    public List<com.bytedance.adsdk.LD.ebl.Lxb<PointF>> lk() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
