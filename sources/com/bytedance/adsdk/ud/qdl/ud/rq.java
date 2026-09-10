package com.bytedance.adsdk.ud.qdl.ud;

import android.graphics.PointF;
import android.support.v4.media.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class rq extends wd<PointF> {
    private final PointF mml;

    public rq(List<com.bytedance.adsdk.ud.wd.qdl<PointF>> list) {
        super(list);
        this.mml = new PointF();
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public PointF qdl(com.bytedance.adsdk.ud.wd.qdl<PointF> qdlVar, float f) {
        return qdl(qdlVar, f, f, f);
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public PointF qdl(com.bytedance.adsdk.ud.wd.qdl<PointF> qdlVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = qdlVar.qdl;
        if (pointF2 == null || (pointF = qdlVar.ud) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.lnr != null) {
            qdlVar.wd.getClass();
            mml();
            jpc();
            throw null;
        }
        PointF pointF5 = this.mml;
        float f4 = pointF3.x;
        float fA = a.a(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF5.set(fA, a.a(pointF4.y, f5, f3, f5));
        return this.mml;
    }
}
