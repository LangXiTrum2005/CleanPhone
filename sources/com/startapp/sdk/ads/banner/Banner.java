package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.r1;

/* JADX INFO: loaded from: classes6.dex */
public class Banner extends BannerStandard {
    public Banner(Context context) {
        super(context);
    }

    public Banner(Context context, AdPreferences adPreferences) {
        super(context, adPreferences);
    }

    public Banner(Context context, BannerListener bannerListener) {
        super(context, bannerListener);
    }

    public Banner(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, adPreferences, bannerListener);
    }

    public Banner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Banner(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public Banner(Context context, boolean z2, AdPreferences adPreferences, r1 r1Var) {
        super(context, z2, adPreferences, r1Var);
    }
}
