package com.smartdigimkt.sdk.api;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public interface ISDMDirectlyOfferSetting {
    Drawable getDirectlySplashAdCTAButtongBgDrawable();

    String getDirectlySplashAdShakeIconString();

    View getDirectlySplashCTAButton();

    Boolean getDirectlySplashMuteIconVisible();

    View getDirectlySplashShakeButton();

    void setDirectlySplashAdCTAButtongBgDrawable(Drawable drawable);

    void setDirectlySplashAdShakeIconString(String str);

    void setDirectlySplashCTAButton(View view);

    void setDirectlySplashMuteIconVisible(boolean z2);

    void setDirectlySplashShakeButton(View view);
}
