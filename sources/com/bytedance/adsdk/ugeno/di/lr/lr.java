package com.bytedance.adsdk.ugeno.di.lr;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements com.bytedance.adsdk.ugeno.mj.ik.fi {
    @Override // com.bytedance.adsdk.ugeno.mj.ik.fi
    public void ri(View view, float f) {
        int width = view.getWidth();
        if (f < -1.0f || f > 1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setTranslationX((-width) * f);
        } else {
            view.setTranslationX(width);
            view.setTranslationX((-width) * f);
        }
        view.setAlpha(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - Math.abs(f)));
    }
}
