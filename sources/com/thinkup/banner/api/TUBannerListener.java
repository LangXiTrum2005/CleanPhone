package com.thinkup.banner.api;

import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface TUBannerListener {
    void onBannerAutoRefreshFail(AdError adError);

    void onBannerAutoRefreshed(TUAdInfo tUAdInfo);

    void onBannerClicked(TUAdInfo tUAdInfo);

    void onBannerClose(TUAdInfo tUAdInfo);

    void onBannerFailed(AdError adError);

    void onBannerLoaded();

    void onBannerShow(TUAdInfo tUAdInfo);
}
