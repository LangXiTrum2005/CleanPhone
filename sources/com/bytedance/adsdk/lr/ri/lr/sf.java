package com.bytedance.adsdk.lr.ri.lr;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class sf extends xha<PointF> {
    private final PointF ka;

    public sf(List<com.bytedance.adsdk.lr.xha.ri<PointF>> list) {
        super(list);
        this.ka = new PointF();
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public PointF ri(com.bytedance.adsdk.lr.xha.ri<PointF> riVar, float f) {
        return ri(riVar, f, f, f);
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public PointF ri(com.bytedance.adsdk.lr.xha.ri<PointF> riVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = riVar.ri;
        if (pointF2 == null || (pointF = riVar.lr) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.ik != null) {
            riVar.xha.getClass();
            ka();
            mj();
            throw null;
        }
        PointF pointF5 = this.ka;
        float f4 = pointF3.x;
        float f5 = f4 + (f2 * (pointF4.x - f4));
        float f6 = pointF3.y;
        pointF5.set(f5, f6 + (f3 * (pointF4.y - f6)));
        return this.ka;
    }
}
