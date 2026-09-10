package com.bytedance.adsdk.ugeno.di.lr;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements com.bytedance.adsdk.ugeno.mj.ik.fi {
    final float ri = 0.8f;
    final float lr = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.mj.ik.fi
    public void ri(View view, float f) {
        float f2 = ((f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.19999999f : -0.19999999f) * f) + 1.0f;
        float f3 = (f * (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.5f : -0.5f)) + 1.0f;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setAlpha(Math.abs(f3));
    }
}
