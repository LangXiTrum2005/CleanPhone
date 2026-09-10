package com.applovin.applovin_max;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.ironsource.mediationsdk.metadata.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
class AppLovinMAXAdViewWidget extends FrameLayout implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener {
    private final MaxAdView adView;

    @Nullable
    private AppLovinMAXAdView containerView;
    private final boolean shouldPreloadWidget;

    public AppLovinMAXAdViewWidget(String str, MaxAdFormat maxAdFormat, boolean z10, Context context) {
        this(str, maxAdFormat, z10, false, context);
    }

    public void attachAdView(AppLovinMAXAdView appLovinMAXAdView) {
        this.containerView = appLovinMAXAdView;
    }

    public void destroy() {
        detachAdView();
        this.adView.setListener(null);
        this.adView.setRevenueListener(null);
        this.adView.destroy();
    }

    public void detachAdView() {
        this.containerView = null;
    }

    public String getAdUnitId() {
        return this.adView.getAdUnitId();
    }

    public MaxAdView getAdView() {
        return this.adView;
    }

    public boolean hasContainerView() {
        return this.containerView != null;
    }

    public void loadAd() {
        this.adView.loadAd();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NonNull MaxAd maxAd) {
        if (this.containerView != null) {
            Map<String, Object> adInfo = AppLovinMAX.getInstance().getAdInfo(maxAd);
            adInfo.put("adViewId", Integer.valueOf(hashCode()));
            this.containerView.sendEvent("OnAdViewAdClickedEvent", adInfo);
        }
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(@NonNull MaxAd maxAd) {
        if (this.containerView != null) {
            Map<String, Object> adInfo = AppLovinMAX.getInstance().getAdInfo(maxAd);
            adInfo.put("adViewId", Integer.valueOf(hashCode()));
            this.containerView.sendEvent("OnAdViewAdCollapsedEvent", adInfo);
        }
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(@NonNull MaxAd maxAd) {
        if (this.containerView != null) {
            Map<String, Object> adInfo = AppLovinMAX.getInstance().getAdInfo(maxAd);
            adInfo.put("adViewId", Integer.valueOf(hashCode()));
            this.containerView.sendEvent("OnAdViewAdExpandedEvent", adInfo);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        Map<String, Object> adLoadFailedInfo = AppLovinMAX.getInstance().getAdLoadFailedInfo(str, maxError);
        adLoadFailedInfo.put("adViewId", Integer.valueOf(hashCode()));
        if (this.shouldPreloadWidget) {
            AppLovinMAX appLovinMAX = AppLovinMAX.getInstance();
            HashMap map = new HashMap(adLoadFailedInfo.size());
            for (Map.Entry<String, Object> entry : adLoadFailedInfo.entrySet()) {
                String key = entry.getKey();
                Objects.requireNonNull(key);
                Object value = entry.getValue();
                Objects.requireNonNull(value);
                map.put(key, value);
            }
            appLovinMAX.fireCallback("OnWidgetAdViewAdLoadFailedEvent", Collections.unmodifiableMap(map));
        }
        AppLovinMAXAdView appLovinMAXAdView = this.containerView;
        if (appLovinMAXAdView != null) {
            appLovinMAXAdView.sendEvent("OnAdViewAdLoadFailedEvent", adLoadFailedInfo);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        Map<String, Object> adInfo = AppLovinMAX.getInstance().getAdInfo(maxAd);
        adInfo.put("adViewId", Integer.valueOf(hashCode()));
        if (this.shouldPreloadWidget) {
            AppLovinMAX appLovinMAX = AppLovinMAX.getInstance();
            HashMap map = new HashMap(adInfo.size());
            for (Map.Entry<String, Object> entry : adInfo.entrySet()) {
                String key = entry.getKey();
                Objects.requireNonNull(key);
                Object value = entry.getValue();
                Objects.requireNonNull(value);
                map.put(key, value);
            }
            appLovinMAX.fireCallback("OnWidgetAdViewAdLoadedEvent", Collections.unmodifiableMap(map));
        }
        AppLovinMAXAdView appLovinMAXAdView = this.containerView;
        if (appLovinMAXAdView != null) {
            appLovinMAXAdView.sendEvent("OnAdViewAdLoadedEvent", adInfo);
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        if (this.containerView != null) {
            Map<String, Object> adInfo = AppLovinMAX.getInstance().getAdInfo(maxAd);
            adInfo.put("adViewId", Integer.valueOf(hashCode()));
            this.containerView.sendEvent("OnAdViewAdRevenuePaidEvent", adInfo);
        }
    }

    public void setAutoRefreshEnabled(boolean z10) {
        if (z10) {
            this.adView.startAutoRefresh();
        } else {
            this.adView.stopAutoRefresh();
        }
    }

    public void setCustomData(@Nullable String str) {
        this.adView.setCustomData(str);
    }

    public void setExtraParameters(@Nullable Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.adView.setExtraParameter(entry.getKey(), (String) entry.getValue());
        }
    }

    public void setLocalExtraParameters(@Nullable Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.adView.setLocalExtraParameter(entry.getKey(), entry.getValue());
        }
    }

    public void setPlacement(@Nullable String str) {
        this.adView.setPlacement(str);
    }

    public AppLovinMAXAdViewWidget(String str, MaxAdFormat maxAdFormat, boolean z10, boolean z11, Context context) {
        super(context);
        this.shouldPreloadWidget = z11;
        MaxAdViewConfiguration.Builder builder = MaxAdViewConfiguration.builder();
        if (maxAdFormat.isBannerOrLeaderAd()) {
            if (z10) {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.ANCHORED);
            } else {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.NONE);
            }
        }
        MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, builder.build());
        this.adView = maxAdView;
        maxAdView.setListener(this);
        maxAdView.setRevenueListener(this);
        maxAdView.setExtraParameter("allow_pause_auto_refresh_immediately", a.f29610g);
        maxAdView.stopAutoRefresh();
        addView(maxAdView);
        maxAdView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NonNull MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NonNull MaxAd maxAd) {
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
    }
}
