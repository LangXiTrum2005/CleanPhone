package com.p004ironsource.adapters.ironsource;

import android.widget.FrameLayout;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.bh;
import com.p004ironsource.dh;
import com.p004ironsource.lp;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.sdk.BannerSmashListener;
import com.p004ironsource.mediationsdk.utils.ErrorBuilder;
import com.p004ironsource.zj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
class IronSourceBannerListener implements lp {
    private WeakReference<IronSourceAdapter> mAdapter;
    private final String mDemandSourceName;
    private final BannerSmashListener mListener;

    public IronSourceBannerListener(IronSourceAdapter ironSourceAdapter, BannerSmashListener bannerSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = bannerSmashListener;
        this.mAdapter = new WeakReference<>(ironSourceAdapter);
    }

    @Override // com.p004ironsource.lp
    public void onBannerClick() {
        a.y(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerAdClicked();
    }

    @Override // com.p004ironsource.lp
    public void onBannerInitFailed(String str) {
        a.y(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.p004ironsource.lp
    public void onBannerInitSuccess() {
        a.y(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
    }

    @Override // com.p004ironsource.lp
    public void onBannerLoadFail(String str) {
        a.y(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("load failed - error = " + str));
    }

    @Override // com.p004ironsource.lp
    public void onBannerLoadSuccess(zj zjVar, dh dhVar) {
        a.y(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        if (this.mAdapter.get() != null) {
            if (dhVar == null) {
                this.mListener.onBannerAdLoadFailed(ErrorBuilder.adContainerIsNull(this.mAdapter.get().getProviderName()));
                return;
            }
            ConcurrentHashMap<String, ArrayList<zj>> concurrentHashMap = this.mAdapter.get().mDemandSourceToBnAd;
            if (concurrentHashMap.get(this.mDemandSourceName) == null) {
                concurrentHashMap.put(this.mDemandSourceName, new ArrayList<>());
            }
            concurrentHashMap.get(this.mDemandSourceName).add(zjVar);
            bh size = dhVar.getSize();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size.c(), size.a());
            layoutParams.gravity = 17;
            this.mListener.onBannerAdLoaded(dhVar, layoutParams);
        }
    }

    @Override // com.p004ironsource.lp
    public void onBannerShowSuccess() {
        a.y(new StringBuilder(), this.mDemandSourceName, " onBannerShowSuccess", IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }
}
