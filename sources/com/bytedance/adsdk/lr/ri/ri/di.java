package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.Path;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class di implements com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri, aw, sf {
    private final com.bytedance.adsdk.lr.ik.lr.lr di;
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, PointF> fi;
    private final com.bytedance.adsdk.lr.jbs ik;
    private final com.bytedance.adsdk.lr.ri.lr.ri<?, PointF> ka;
    private final String lr;
    private boolean mj;
    private final Path ri = new Path();
    private final lr xha = new lr();

    public di(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, com.bytedance.adsdk.lr.ik.lr.lr lrVar) {
        this.lr = lrVar.ri();
        this.ik = jbsVar;
        com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> riVarRi = lrVar.ik().ri();
        this.ka = riVarRi;
        com.bytedance.adsdk.lr.ri.lr.ri<PointF, PointF> riVarRi2 = lrVar.lr().ri();
        this.fi = riVarRi2;
        this.di = lrVar;
        riVar.ri(riVarRi);
        riVar.ri(riVarRi2);
        riVarRi.ri(this);
        riVarRi2.ri(this);
    }

    private void lr() {
        this.mj = false;
        this.ik.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.aw
    public Path ka() {
        if (this.mj) {
            return this.ri;
        }
        this.ri.reset();
        if (this.di.fi()) {
            this.mj = true;
            return this.ri;
        }
        PointF pointFXha = this.ka.xha();
        float f = pointFXha.x / 2.0f;
        float f2 = pointFXha.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.ri.reset();
        if (this.di.ka()) {
            float f5 = -f2;
            this.ri.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5);
            Path path = this.ri;
            float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f3;
            float f7 = -f;
            float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4;
            path.cubicTo(f6, f5, f7, f8, f7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Path path2 = this.ri;
            float f9 = f4 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path2.cubicTo(f7, f9, f6, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
            Path path3 = this.ri;
            float f10 = f3 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path3.cubicTo(f10, f2, f, f9, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.ri.cubicTo(f, f8, f10, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5);
        } else {
            float f11 = -f2;
            this.ri.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11);
            Path path4 = this.ri;
            float f12 = f3 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f4;
            path4.cubicTo(f12, f11, f, f13, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Path path5 = this.ri;
            float f14 = f4 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path5.cubicTo(f, f14, f12, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
            Path path6 = this.ri;
            float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f3;
            float f16 = -f;
            path6.cubicTo(f15, f2, f16, f14, f16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.ri.cubicTo(f16, f13, f15, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11);
        }
        PointF pointFXha2 = this.fi.xha();
        this.ri.offset(pointFXha2.x, pointFXha2.y);
        this.ri.close();
        this.xha.ri(this.ri);
        this.mj = true;
        return this.ri;
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
    public void ri() {
        lr();
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.ik
    public void ri(List<ik> list, List<ik> list2) {
        for (int i = 0; i < list.size(); i++) {
            ik ikVar = list.get(i);
            if (ikVar instanceof ihz) {
                ihz ihzVar = (ihz) ikVar;
                if (ihzVar.lr() == com.bytedance.adsdk.lr.ik.lr.tan.ri.SIMULTANEOUSLY) {
                    this.xha.ri(ihzVar);
                    ihzVar.ri(this);
                }
            }
        }
    }
}
