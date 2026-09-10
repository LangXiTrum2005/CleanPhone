package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes6.dex */
public interface f {
    boolean a(String str);

    Long getAdCacheTtl();

    Long getLastLoadTime();

    Ad.AdState getState();

    boolean getVideoCancelCallBack();

    boolean hasAdCacheTtlPassed();

    boolean isBelowMinCPM();

    boolean isReady();

    void load(AdPreferences adPreferences, AdEventListener adEventListener, String str);

    void setActivityExtra(ActivityExtra activityExtra);

    void setVideoCancelCallBack(boolean z2);
}
