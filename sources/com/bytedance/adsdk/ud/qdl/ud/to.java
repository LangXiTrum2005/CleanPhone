package com.bytedance.adsdk.ud.qdl.ud;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class to extends wd<PointF> {
    private final PointF mml;
    private final PathMeasure mo;
    private final float[] mzz;
    private tvp wd;

    public to(List<? extends com.bytedance.adsdk.ud.wd.qdl<PointF>> list) {
        super(list);
        this.mml = new PointF();
        this.mzz = new float[2];
        this.mo = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public PointF qdl(com.bytedance.adsdk.ud.wd.qdl<PointF> qdlVar, float f) {
        tvp tvpVar = (tvp) qdlVar;
        Path pathUd = tvpVar.ud();
        if (pathUd == null) {
            return qdlVar.qdl;
        }
        if (this.lnr != null) {
            tvpVar.wd.getClass();
            mml();
            jpc();
            throw null;
        }
        if (this.wd != tvpVar) {
            this.mo.setPath(pathUd, false);
            this.wd = tvpVar;
        }
        PathMeasure pathMeasure = this.mo;
        pathMeasure.getPosTan(pathMeasure.getLength() * f, this.mzz, null);
        PointF pointF = this.mml;
        float[] fArr = this.mzz;
        pointF.set(fArr[0], fArr[1]);
        return this.mml;
    }
}
