package com.bytedance.adsdk.lr.ri.lr;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class bgr extends ri<PointF, PointF> {
    private final PointF di;
    protected com.bytedance.adsdk.lr.xha.lr<Float> fi;
    private final ri<Float, Float> jbs;
    protected com.bytedance.adsdk.lr.xha.lr<Float> ka;
    private final ri<Float, Float> mj;
    private final PointF xha;

    public bgr(ri<Float, Float> riVar, ri<Float, Float> riVar2) {
        super(Collections.EMPTY_LIST);
        this.di = new PointF();
        this.xha = new PointF();
        this.mj = riVar;
        this.jbs = riVar2;
        ri(mj());
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri
    /* JADX INFO: renamed from: jbs, reason: merged with bridge method [inline-methods] */
    public PointF xha() {
        return ri(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public PointF ri(com.bytedance.adsdk.lr.xha.ri<PointF> riVar, float f) {
        if (this.ka != null && this.mj.ik() != null) {
            this.mj.fi();
            throw null;
        }
        if (this.fi != null && this.jbs.ik() != null) {
            this.jbs.fi();
            throw null;
        }
        this.xha.set(this.di.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        PointF pointF = this.xha;
        pointF.set(pointF.x, this.di.y);
        return this.xha;
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri
    public void ri(float f) {
        this.mj.ri(f);
        this.jbs.ri(f);
        this.di.set(this.mj.xha().floatValue(), this.jbs.xha().floatValue());
        for (int i = 0; i < this.ri.size(); i++) {
            this.ri.get(i).ri();
        }
    }
}
