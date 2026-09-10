package com.bytedance.adsdk.ugeno.di.lr;

import android.text.TextUtils;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ka implements com.bytedance.adsdk.ugeno.mj.ik.fi {
    private String ri;

    public void ri(String str) {
        this.ri = str;
    }

    @Override // com.bytedance.adsdk.ugeno.mj.ik.fi
    public void ri(View view, float f) {
        float height = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f < -1.0f || f > 1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f));
            view.setTranslationY(view.getHeight() * f);
        }
        if (TextUtils.equals(this.ri, "cube")) {
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                height = view.getHeight();
            }
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f * (-90.0f));
        }
    }
}
