package com.startapp.sdk.ads.nativead;

/* JADX INFO: loaded from: classes6.dex */
public interface NativeAdDisplayListener {
    void adClicked(NativeAdInterface nativeAdInterface);

    void adDisplayed(NativeAdInterface nativeAdInterface);

    void adHidden(NativeAdInterface nativeAdInterface);

    void adNotDisplayed(NativeAdInterface nativeAdInterface);
}
