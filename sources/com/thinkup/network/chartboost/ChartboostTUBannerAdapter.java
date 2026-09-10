package com.thinkup.network.chartboost;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ChartboostTUBannerAdapter extends CustomBannerAdapter {
    Banner o0;
    boolean om;
    private final String on = "ChartboostTUBannerAdapter";
    String o = "";
    String m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f42538n = false;
    boolean oo = false;

    /* JADX INFO: renamed from: com.thinkup.network.chartboost.ChartboostTUBannerAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements MediationInitCallback {
        final /* synthetic */ Context o;

        public AnonymousClass1(Context context) {
            this.o = context;
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onFail(String str) {
            if (((TUBaseAdInternalAdapter) ChartboostTUBannerAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) ChartboostTUBannerAdapter.this).mLoadListener.onAdLoadError("", str);
            }
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onSuccess() {
            try {
                ChartboostTUBannerAdapter.this.startload(this.o);
            } catch (Throwable th) {
                if (((TUBaseAdInternalAdapter) ChartboostTUBannerAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) ChartboostTUBannerAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    private static void m() {
    }

    public static /* synthetic */ void o() {
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        Banner banner = this.o0;
        if (banner != null) {
            banner.clearCache();
            this.o0 = null;
        }
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.o0;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return ChartboostTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.o;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return ChartboostTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        Banner banner = this.o0;
        return (banner == null || !banner.isCached() || this.om) ? false : true;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = TUInitMediation.getStringFromMap(map, "app_id");
        String stringFromMap2 = TUInitMediation.getStringFromMap(map, "app_signature");
        this.o = TUInitMediation.getStringFromMap(map, "location");
        this.m = TUInitMediation.getStringFromMap(map, "size");
        this.f42538n = TUInitMediation.getIntFromMap(map, "nw_rft") > 0;
        if (TextUtils.isEmpty(stringFromMap) || TextUtils.isEmpty(stringFromMap2) || TextUtils.isEmpty(this.o)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", " app_id ,app_signature or location is empty.");
                return;
            }
            return;
        }
        if (context instanceof Activity) {
            ChartboostTUInitManager.getInstance().initSDK(context, map, new AnonymousClass1(context));
        } else {
            this.mLoadListener.onAdLoadError("", " context must be activity.");
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return ChartboostTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    /* JADX WARN: switch over string: strings are not added: [[320x50]] */
    public void startload(Context context) {
        Banner.BannerSize bannerSize = Banner.BannerSize.STANDARD;
        if (!TextUtils.isEmpty(this.m)) {
            String str = this.m;
            str.getClass();
            switch (str) {
                case "300x250":
                    bannerSize = Banner.BannerSize.MEDIUM;
                    break;
                case "728x90":
                    bannerSize = Banner.BannerSize.LEADERBOARD;
                    break;
            }
        }
        Banner banner = new Banner(context, this.o, bannerSize, new BannerCallback() { // from class: com.thinkup.network.chartboost.ChartboostTUBannerAdapter.2
            @Override // com.chartboost.sdk.callbacks.AdCallback
            public final void onAdClicked(ClickEvent clickEvent, ClickError clickError) {
                ChartboostTUBannerAdapter.o();
                CustomBannerEventListener customBannerEventListener = ChartboostTUBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }

            @Override // com.chartboost.sdk.callbacks.AdCallback
            public final void onAdExpired(ExpirationEvent expirationEvent) {
                if (expirationEvent != null) {
                    "onAdExpired() >>> ".concat(String.valueOf(expirationEvent));
                    ChartboostTUBannerAdapter.o();
                }
                ChartboostTUBannerAdapter.this.om = true;
            }

            @Override // com.chartboost.sdk.callbacks.AdCallback
            public final void onAdLoaded(CacheEvent cacheEvent, CacheError cacheError) {
                ChartboostTUBannerAdapter.this.om = false;
                ChartboostTUBannerAdapter.o();
                if (((TUBaseAdInternalAdapter) ChartboostTUBannerAdapter.this).mLoadListener != null) {
                    if (cacheError == null) {
                        ((TUBaseAdInternalAdapter) ChartboostTUBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    } else {
                        ((TUBaseAdInternalAdapter) ChartboostTUBannerAdapter.this).mLoadListener.onAdLoadError(String.valueOf(cacheError.getCode().getErrorCode()), cacheError.getException() == null ? "" : cacheError.getException().getMessage());
                    }
                }
            }

            @Override // com.chartboost.sdk.callbacks.AdCallback
            public final void onAdRequestedToShow(ShowEvent showEvent) {
                ChartboostTUBannerAdapter.o();
            }

            @Override // com.chartboost.sdk.callbacks.AdCallback
            public final void onAdShown(ShowEvent showEvent, ShowError showError) {
                ChartboostTUBannerAdapter.o();
                CustomBannerEventListener customBannerEventListener = ChartboostTUBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdShow();
                }
            }

            @Override // com.chartboost.sdk.callbacks.AdCallback
            public final void onImpressionRecorded(ImpressionEvent impressionEvent) {
                ChartboostTUBannerAdapter.o();
            }
        }, ChartboostTUInitManager.MEDIATION);
        this.o0 = banner;
        banner.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.o0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.thinkup.network.chartboost.ChartboostTUBannerAdapter.3
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                ChartboostTUBannerAdapter chartboostTUBannerAdapter = ChartboostTUBannerAdapter.this;
                Banner banner2 = chartboostTUBannerAdapter.o0;
                if (banner2 == null || chartboostTUBannerAdapter.oo) {
                    return;
                }
                chartboostTUBannerAdapter.oo = true;
                banner2.show();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
            }
        });
        this.o0.cache();
    }

    private void o(Context context, Map<String, Object> map) {
        ChartboostTUInitManager.getInstance().initSDK(context, map, new AnonymousClass1(context));
    }
}
