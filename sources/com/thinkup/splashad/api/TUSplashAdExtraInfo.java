package com.thinkup.splashad.api;

/* JADX INFO: loaded from: classes6.dex */
public class TUSplashAdExtraInfo {
    private ITUSplashEyeAd atSplashEyeAd;
    private int dismissType;

    public TUSplashAdExtraInfo(int i2, ITUSplashEyeAd iTUSplashEyeAd) {
        this.dismissType = i2;
        this.atSplashEyeAd = iTUSplashEyeAd;
    }

    public ITUSplashEyeAd getAtSplashEyeAd() {
        return this.atSplashEyeAd;
    }

    public int getDismissType() {
        return this.dismissType;
    }
}
