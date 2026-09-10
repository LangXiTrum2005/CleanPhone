package com.bytedance.adsdk.lr.ri.lr;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class qt extends xha<PointF> {
    private final PathMeasure di;
    private final float[] fi;
    private final PointF ka;
    private jbs xha;

    public qt(List<? extends com.bytedance.adsdk.lr.xha.ri<PointF>> list) {
        super(list);
        this.ka = new PointF();
        this.fi = new float[2];
        this.di = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public PointF ri(com.bytedance.adsdk.lr.xha.ri<PointF> riVar, float f) {
        jbs jbsVar = (jbs) riVar;
        Path pathLr = jbsVar.lr();
        if (pathLr == null) {
            return riVar.ri;
        }
        if (this.ik != null) {
            jbsVar.xha.getClass();
            ka();
            mj();
            throw null;
        }
        if (this.xha != jbsVar) {
            this.di.setPath(pathLr, false);
            this.xha = jbsVar;
        }
        PathMeasure pathMeasure = this.di;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.fi, null);
        PointF pointF = this.ka;
        float[] fArr = this.fi;
        pointF.set(fArr[0], fArr[1]);
        return this.ka;
    }
}
