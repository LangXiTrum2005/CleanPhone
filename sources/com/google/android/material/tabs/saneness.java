package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: FadeTabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness extends dern {
    @Override // com.google.android.material.tabs.dern
    public void wireman(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFAttabal = dern.attabal(tabLayout, view);
        float fSaneness = f < 0.5f ? phrasemonger.saneness.saneness(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, f) : phrasemonger.saneness.saneness(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFAttabal.left, drawable.getBounds().top, (int) rectFAttabal.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fSaneness * 255.0f));
    }
}
