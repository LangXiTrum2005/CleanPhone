package com.bytedance.adsdk.ugeno.di.lr;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements com.bytedance.adsdk.ugeno.mj.ik.fi {
    @Override // com.bytedance.adsdk.ugeno.mj.ik.fi
    public void ri(View view, float f) {
        float width = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            width = view.getWidth();
        }
        float height = view.getHeight() * 0.5f;
        view.setPivotX(width);
        view.setPivotY(height);
        view.setRotationY(f * 90.0f);
    }
}
