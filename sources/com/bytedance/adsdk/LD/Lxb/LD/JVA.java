package com.bytedance.adsdk.LD.Lxb.LD;

import android.graphics.PointF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class JVA extends ebl<PointF> {
    private final PointF ZU;

    public JVA(List<com.bytedance.adsdk.LD.ebl.Lxb<PointF>> list) {
        super(list);
        this.ZU = new PointF();
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb
    /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
    public PointF Lxb(com.bytedance.adsdk.LD.ebl.Lxb<PointF> lxb, float f) {
        return Lxb(lxb, f, f, f);
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb
    /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
    public PointF Lxb(com.bytedance.adsdk.LD.ebl.Lxb<PointF> lxb, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = lxb.Lxb;
        if (pointF2 == null || (pointF = lxb.LD) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.lk != null) {
            lxb.ebl.getClass();
            ZU();
            OY();
            throw null;
        }
        PointF pointF5 = this.ZU;
        float f4 = pointF3.x;
        float fW = AbstractC5044xl.w(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF5.set(fW, AbstractC5044xl.w(pointF4.y, f5, f3, f5));
        return this.ZU;
    }
}
