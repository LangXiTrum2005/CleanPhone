package com.bytedance.adsdk.LD.Lxb.LD;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class STP extends Lxb<PointF, PointF> {
    protected com.bytedance.adsdk.LD.ebl.LD<Float> JXs;
    private final Lxb<Float, Float> OY;
    private final Lxb<Float, Float> QAg;
    protected com.bytedance.adsdk.LD.ebl.LD<Float> ZU;
    private final PointF ebl;
    private final PointF lc;

    public STP(Lxb<Float, Float> lxb, Lxb<Float, Float> lxb2) {
        super(Collections.emptyList());
        this.lc = new PointF();
        this.ebl = new PointF();
        this.OY = lxb;
        this.QAg = lxb2;
        Lxb(OY());
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb
    /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
    public PointF Lxb(com.bytedance.adsdk.LD.ebl.Lxb<PointF> lxb, float f) {
        if (this.ZU != null && this.OY.lk() != null) {
            this.OY.JXs();
            throw null;
        }
        if (this.JXs != null && this.QAg.lk() != null) {
            this.QAg.JXs();
            throw null;
        }
        this.ebl.set(this.lc.x, 0.0f);
        PointF pointF = this.ebl;
        pointF.set(pointF.x, this.lc.y);
        return this.ebl;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb
    /* JADX INFO: renamed from: QAg, reason: merged with bridge method [inline-methods] */
    public PointF ebl() {
        return Lxb(null, 0.0f);
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb
    public void Lxb(float f) {
        this.OY.Lxb(f);
        this.QAg.Lxb(f);
        this.lc.set(this.OY.ebl().floatValue(), this.QAg.ebl().floatValue());
        for (int i = 0; i < this.Lxb.size(); i++) {
            this.Lxb.get(i).Lxb();
        }
    }
}
