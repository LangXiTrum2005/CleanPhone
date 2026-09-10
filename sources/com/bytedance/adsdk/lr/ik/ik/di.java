package com.bytedance.adsdk.lr.ik.ik;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class di extends ri {
    public di(com.bytedance.adsdk.lr.jbs jbsVar, fi fiVar) {
        super(jbsVar, fiVar);
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri
    public void lr(Canvas canvas, Matrix matrix, int i) {
        super.lr(canvas, matrix, i);
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri, com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(RectF rectF, Matrix matrix, boolean z) {
        super.ri(rectF, matrix, z);
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
