package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vr implements com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri, aw, sf {
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, PointF> di;
    private final com.bytedance.adsdk.lr.jbs fi;
    private final String ik;
    private final boolean ka;
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, Float> mj;
    private boolean sf;
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, PointF> xha;
    private final Path ri = new Path();
    private final RectF lr = new RectF();
    private final lr jbs = new lr();
    private com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> qt = null;

    public vr(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, com.bytedance.adsdk.lr.ik.lr.sf sfVar) {
        this.ik = sfVar.ri();
        this.ka = sfVar.fi();
        this.fi = jbsVar;
        com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> riVarRi = sfVar.ka().ri();
        this.di = riVarRi;
        com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> riVarRi2 = sfVar.ik().ri();
        this.xha = riVarRi2;
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi3 = sfVar.lr().ri();
        this.mj = riVarRi3;
        riVar.ri(riVarRi);
        riVar.ri(riVarRi2);
        riVar.ri(riVarRi3);
        riVarRi.ri(this);
        riVarRi2.ri(this);
        riVarRi3.ri(this);
    }

    private void lr() {
        this.sf = false;
        this.fi.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.aw
    public Path ka() {
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVar;
        if (this.sf) {
            return this.ri;
        }
        this.ri.reset();
        if (this.ka) {
            this.sf = true;
            return this.ri;
        }
        PointF pointFXha = this.xha.xha();
        float f = pointFXha.x / 2.0f;
        float f2 = pointFXha.y / 2.0f;
        com.bytedance.adsdk.lr.ri.lr.ri<?, Float> riVar2 = this.mj;
        float fJbs = riVar2 == null ? 0.0f : ((com.bytedance.adsdk.lr.ri.lr.ka) riVar2).jbs();
        if (fJbs == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (riVar = this.qt) != null) {
            fJbs = Math.min(riVar.xha().floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fJbs > fMin) {
            fJbs = fMin;
        }
        PointF pointFXha2 = this.di.xha();
        this.ri.moveTo(pointFXha2.x + f, (pointFXha2.y - f2) + fJbs);
        this.ri.lineTo(pointFXha2.x + f, (pointFXha2.y + f2) - fJbs);
        if (fJbs > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF = this.lr;
            float f3 = pointFXha2.x;
            float f4 = fJbs * 2.0f;
            float f5 = pointFXha2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.ri.arcTo(this.lr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false);
        }
        this.ri.lineTo((pointFXha2.x - f) + fJbs, pointFXha2.y + f2);
        if (fJbs > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF2 = this.lr;
            float f6 = pointFXha2.x;
            float f7 = pointFXha2.y;
            float f8 = fJbs * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.ri.arcTo(this.lr, 90.0f, 90.0f, false);
        }
        this.ri.lineTo(pointFXha2.x - f, (pointFXha2.y - f2) + fJbs);
        if (fJbs > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF3 = this.lr;
            float f9 = pointFXha2.x;
            float f10 = pointFXha2.y;
            float f11 = fJbs * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.ri.arcTo(this.lr, 180.0f, 90.0f, false);
        }
        this.ri.lineTo((pointFXha2.x + f) - fJbs, pointFXha2.y - f2);
        if (fJbs > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF4 = this.lr;
            float f12 = pointFXha2.x;
            float f13 = fJbs * 2.0f;
            float f14 = pointFXha2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.ri.arcTo(this.lr, 270.0f, 90.0f, false);
        }
        this.ri.close();
        this.jbs.ri(this.ri);
        this.sf = true;
        return this.ri;
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
    public void ri() {
        lr();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // com.bytedance.adsdk.lr.ri.ri.ik
    public void ri(List<ik> list, List<ik> list2) {
        for (int i = 0; i < list.size(); i++) {
            ik ikVar = list.get(i);
            if (ikVar instanceof ihz) {
                ihz ihzVar = (ihz) ikVar;
                if (ihzVar.lr() == com.bytedance.adsdk.lr.ik.lr.tan.ri.SIMULTANEOUSLY) {
                    this.jbs.ri(ihzVar);
                    ihzVar.ri(this);
                } else if (ikVar instanceof bu) {
                    this.qt = ((bu) ikVar).lr();
                }
            } else if (ikVar instanceof bu) {
                this.qt = ((bu) ikVar).lr();
            }
        }
    }
}
