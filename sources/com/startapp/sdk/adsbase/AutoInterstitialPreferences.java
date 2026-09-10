package com.startapp.sdk.adsbase;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class AutoInterstitialPreferences implements Serializable {
    private static final long serialVersionUID = -9010452850291284559L;
    private int activitiesBetweenAds;
    private int secondsBetweenAds;

    public AutoInterstitialPreferences() {
        setActivitiesBetweenAds(AdsCommonMetaData.k().f());
        setSecondsBetweenAds(AdsCommonMetaData.k().g());
    }

    public int getActivitiesBetweenAds() {
        return this.activitiesBetweenAds;
    }

    public int getSecondsBetweenAds() {
        return this.secondsBetweenAds;
    }

    public AutoInterstitialPreferences setActivitiesBetweenAds(int i2) {
        if (i2 < 1) {
            i2 = 1;
        }
        this.activitiesBetweenAds = i2;
        return this;
    }

    public AutoInterstitialPreferences setSecondsBetweenAds(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.secondsBetweenAds = i2;
        return this;
    }
}
