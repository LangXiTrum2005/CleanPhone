package com.startapp.sdk.ads.banner;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.r1;

/* JADX INFO: loaded from: classes6.dex */
public class Cover extends BannerStandard {
    public Cover(Activity activity) {
        super(activity);
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, com.startapp.sdk.ads.banner.BannerBase
    public String getBannerName() {
        return "StartApp Cover";
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard
    public int getBannerType() {
        return 2;
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, com.startapp.sdk.ads.banner.BannerBase
    public int getHeightInDp() {
        return 157;
    }

    @Override // com.startapp.sdk.ads.banner.bannerstandard.BannerStandard, com.startapp.sdk.ads.banner.BannerBase
    public int getWidthInDp() {
        return 300;
    }

    public Cover(Activity activity, AdPreferences adPreferences) {
        super(activity, adPreferences);
    }

    public Cover(Activity activity, BannerListener bannerListener) {
        super(activity, bannerListener);
    }

    public Cover(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        super(activity, adPreferences, bannerListener);
    }

    public Cover(Activity activity, AttributeSet attributeSet) {
        super(activity, attributeSet);
    }

    public Cover(Activity activity, AttributeSet attributeSet, int i2) {
        super(activity, attributeSet, i2);
    }

    @Deprecated
    public Cover(Context context) {
        super(context);
    }

    @Deprecated
    public Cover(Context context, AdPreferences adPreferences) {
        super(context, adPreferences);
    }

    @Deprecated
    public Cover(Context context, BannerListener bannerListener) {
        super(context, bannerListener);
    }

    @Deprecated
    public Cover(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        super(context, adPreferences, bannerListener);
    }

    @Deprecated
    public Cover(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Deprecated
    public Cover(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public Cover(Context context, boolean z2, AdPreferences adPreferences, r1 r1Var) {
        super(context, z2, adPreferences, r1Var);
    }
}
