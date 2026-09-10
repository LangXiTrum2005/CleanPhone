package com.bytedance.adsdk.LD.Lxb.LD;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class nBu extends ebl<PointF> {
    private final float[] JXs;
    private final PointF ZU;
    private QAg ebl;
    private final PathMeasure lc;

    public nBu(List<? extends com.bytedance.adsdk.LD.ebl.Lxb<PointF>> list) {
        super(list);
        this.ZU = new PointF();
        this.JXs = new float[2];
        this.lc = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb
    /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
    public PointF Lxb(com.bytedance.adsdk.LD.ebl.Lxb<PointF> lxb, float f) {
        QAg qAg = (QAg) lxb;
        Path pathLD = qAg.LD();
        if (pathLD == null) {
            return lxb.Lxb;
        }
        if (this.lk != null) {
            qAg.ebl.getClass();
            ZU();
            OY();
            throw null;
        }
        if (this.ebl != qAg) {
            this.lc.setPath(pathLD, false);
            this.ebl = qAg;
        }
        PathMeasure pathMeasure = this.lc;
        pathMeasure.getPosTan(pathMeasure.getLength() * f, this.JXs, null);
        PointF pointF = this.ZU;
        float[] fArr = this.JXs;
        pointF.set(fArr[0], fArr[1]);
        return this.ZU;
    }
}
