package com.thinkup.core.api;

/* JADX INFO: loaded from: classes6.dex */
public interface TUCustomLoadListener {
    void onAdCacheLoaded(BaseAd... baseAdArr);

    void onAdDataLoaded();

    void onAdLoadError(String str, String str2);
}
