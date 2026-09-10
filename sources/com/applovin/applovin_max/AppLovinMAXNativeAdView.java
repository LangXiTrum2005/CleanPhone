package com.applovin.applovin_max;

import a4.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import io.flutter.plugin.platform.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import xi.f;
import xi.m;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinMAXNativeAdView implements d, MaxAdRevenueListener {
    private static final int ADVERTISER_VIEW_TAG = 8;
    private static final int BODY_VIEW_TAG = 4;
    private static final int CALL_TO_ACTION_VIEW_TAG = 5;
    private static final int ICON_VIEW_TAG = 3;
    private static final int MEDIA_VIEW_CONTAINER_TAG = 2;
    private static final int TITLE_LABEL_TAG = 1;

    @Nullable
    private MaxNativeAdLoader adLoader;
    private final String adUnitId;

    @Nullable
    private View advertiserView;

    @Nullable
    private View bodyView;

    @Nullable
    private View callToActionView;
    private final p channel;
    private final Context context;

    @Nullable
    private final String customData;

    @Nullable
    private final Map<String, Object> extraParameters;

    @Nullable
    private ImageView iconView;

    @Nullable
    private final Map<String, Object> localExtraParameters;

    @Nullable
    private RelativeLayout mediaViewContainer;

    @Nullable
    private MaxAd nativeAd;
    private final FrameLayout nativeAdView;

    @Nullable
    private FrameLayout optionsViewContainer;

    @Nullable
    private final String placement;
    private final AppLovinSdk sdk;

    @Nullable
    private View titleView;
    private final AtomicBoolean isLoading = new AtomicBoolean();
    private final List<View> clickableViews = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class NativeAdListener extends MaxNativeAdListener {
        private NativeAdListener() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(@NonNull MaxAd maxAd) {
            AppLovinMAXNativeAdView.this.sendEvent("OnNativeAdClickedEvent", maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
            AppLovinMAXNativeAdView.this.handleAdLoadFailed("Failed to load native ad for Ad Unit ID " + str + " with error: " + maxError, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(@Nullable MaxNativeAdView maxNativeAdView, @NonNull MaxAd maxAd) {
            AppLovinMAX.d("Native ad loaded: " + maxAd);
            if (maxNativeAdView != null) {
                AppLovinMAXNativeAdView.this.handleAdLoadFailed("Native ad is of template type, failing ad load...", null);
                return;
            }
            AppLovinMAXNativeAdView.this.maybeDestroyCurrentAd();
            AppLovinMAXNativeAdView.this.nativeAd = maxAd;
            AppLovinMAXNativeAdView.this.sendAdLoadedReactNativeEventForAd(maxAd.getNativeAd());
        }
    }

    public AppLovinMAXNativeAdView(int i10, String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, Object> map, @Nullable Map<String, Object> map2, f fVar, AppLovinSdk appLovinSdk, Context context) {
        this.adUnitId = str;
        this.placement = str2;
        this.customData = str3;
        this.sdk = appLovinSdk;
        this.context = context;
        this.extraParameters = map;
        this.localExtraParameters = map2;
        p pVar = new p(fVar, l1.d.e(i10, "applovin_max/nativeadview_"));
        this.channel = pVar;
        pVar.b(new a(this, 10));
        this.nativeAdView = new FrameLayout(context);
        loadAd();
    }

    private void addAdvertiserView(m mVar, MaxAd maxAd) {
        if (maxAd == null || maxAd.getNativeAd().getAdvertiser() == null) {
            return;
        }
        if (this.advertiserView == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            this.advertiserView = frameLayout;
            this.nativeAdView.addView(frameLayout);
        }
        this.advertiserView.setTag(8);
        this.clickableViews.add(this.advertiserView);
        updateViewLayout(this.nativeAdView, this.advertiserView, getRect(mVar));
    }

    private void addBodyView(m mVar, MaxAd maxAd) {
        if (maxAd == null || maxAd.getNativeAd().getBody() == null) {
            return;
        }
        if (this.bodyView == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            this.bodyView = frameLayout;
            this.nativeAdView.addView(frameLayout);
        }
        this.bodyView.setTag(4);
        this.clickableViews.add(this.bodyView);
        updateViewLayout(this.nativeAdView, this.bodyView, getRect(mVar));
    }

    private void addCallToActionView(m mVar, MaxAd maxAd) {
        if (maxAd == null || maxAd.getNativeAd().getCallToAction() == null) {
            return;
        }
        if (this.callToActionView == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            this.callToActionView = frameLayout;
            this.nativeAdView.addView(frameLayout);
        }
        this.callToActionView.setTag(5);
        this.clickableViews.add(this.callToActionView);
        updateViewLayout(this.nativeAdView, this.callToActionView, getRect(mVar));
    }

    private void addIconView(m mVar, MaxAd maxAd) {
        if (maxAd == null) {
            return;
        }
        MaxNativeAd.MaxNativeAdImage icon = maxAd.getNativeAd().getIcon();
        ImageView imageView = (ImageView) maxAd.getNativeAd().getIconView();
        if (icon == null && imageView == null) {
            ImageView imageView2 = this.iconView;
            if (imageView2 != null) {
                imageView2.setImageDrawable(null);
                return;
            }
            return;
        }
        if (this.iconView == null) {
            ImageView imageView3 = new ImageView(this.context);
            this.iconView = imageView3;
            this.nativeAdView.addView(imageView3);
        }
        this.iconView.setTag(3);
        this.clickableViews.add(this.iconView);
        updateViewLayout(this.nativeAdView, this.iconView, getRect(mVar));
        if (icon == null) {
            if (imageView != null) {
                this.iconView.setImageDrawable(imageView.getDrawable());
            }
        } else if (icon.getUri() != null) {
            AppLovinSdkUtils.setImageUrl(icon.getUri().toString(), this.iconView, this.sdk);
        } else if (icon.getDrawable() != null) {
            this.iconView.setImageDrawable(icon.getDrawable());
        }
    }

    private void addMediaView(m mVar, MaxAd maxAd) {
        View mediaView;
        if (maxAd == null || (mediaView = maxAd.getNativeAd().getMediaView()) == null) {
            return;
        }
        if (this.mediaViewContainer == null) {
            RelativeLayout relativeLayout = new RelativeLayout(this.context);
            this.mediaViewContainer = relativeLayout;
            relativeLayout.setId(2);
            this.nativeAdView.addView(this.mediaViewContainer);
        }
        this.mediaViewContainer.setTag(2);
        this.clickableViews.add(this.mediaViewContainer);
        Rect rect = getRect(mVar);
        if (mediaView.getParent() == null) {
            this.mediaViewContainer.addView(mediaView, new RelativeLayout.LayoutParams(-1, -1));
        }
        updateViewLayout(this.nativeAdView, this.mediaViewContainer, rect);
    }

    private void addOptionsView(m mVar, MaxAd maxAd) {
        View optionsView;
        if (maxAd == null || (optionsView = maxAd.getNativeAd().getOptionsView()) == null) {
            return;
        }
        if (this.optionsViewContainer == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            this.optionsViewContainer = frameLayout;
            this.nativeAdView.addView(frameLayout);
        }
        if (optionsView.getParent() == null) {
            this.optionsViewContainer.addView(optionsView);
            optionsView.getLayoutParams().height = -1;
            optionsView.getLayoutParams().width = -1;
        }
        updateViewLayout(this.nativeAdView, this.optionsViewContainer, getRect(mVar));
    }

    private void addTitleView(m mVar, MaxAd maxAd) {
        if (maxAd == null || maxAd.getNativeAd().getTitle() == null) {
            return;
        }
        if (this.titleView == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            this.titleView = frameLayout;
            this.nativeAdView.addView(frameLayout);
        }
        this.titleView.setTag(1);
        this.clickableViews.add(this.titleView);
        updateViewLayout(this.nativeAdView, this.titleView, getRect(mVar));
    }

    private Rect getRect(m mVar) {
        int iIntValue = ((Integer) mVar.a("x")).intValue();
        int iIntValue2 = ((Integer) mVar.a("y")).intValue();
        return new Rect(iIntValue, iIntValue2, ((Integer) mVar.a("width")).intValue() + iIntValue, ((Integer) mVar.a("height")).intValue() + iIntValue2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAdLoadFailed(String str, @Nullable MaxError maxError) {
        this.isLoading.set(false);
        AppLovinMAX.e(str);
        AppLovinMAX.getInstance().fireCallback("OnNativeAdLoadFailedEvent", AppLovinMAX.getInstance().getAdLoadFailedInfo(this.adUnitId, maxError), this.channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(m mVar, o oVar) {
        String str = mVar.f53822a;
        String str2 = mVar.f53822a;
        if ("addTitleView".equals(str)) {
            MaxAd maxAd = this.nativeAd;
            if (maxAd != null) {
                addTitleView(mVar, maxAd);
            }
            oVar.a(null);
            return;
        }
        if ("addAdvertiserView".equals(str2)) {
            MaxAd maxAd2 = this.nativeAd;
            if (maxAd2 != null) {
                addAdvertiserView(mVar, maxAd2);
            }
            oVar.a(null);
            return;
        }
        if ("addBodyView".equals(str2)) {
            MaxAd maxAd3 = this.nativeAd;
            if (maxAd3 != null) {
                addBodyView(mVar, maxAd3);
            }
            oVar.a(null);
            return;
        }
        if ("addCallToActionView".equals(str2)) {
            MaxAd maxAd4 = this.nativeAd;
            if (maxAd4 != null) {
                addCallToActionView(mVar, maxAd4);
            }
            oVar.a(null);
            return;
        }
        if ("addIconView".equals(str2)) {
            MaxAd maxAd5 = this.nativeAd;
            if (maxAd5 != null) {
                addIconView(mVar, maxAd5);
            }
            oVar.a(null);
            return;
        }
        if ("addOptionsView".equals(str2)) {
            MaxAd maxAd6 = this.nativeAd;
            if (maxAd6 != null) {
                addOptionsView(mVar, maxAd6);
            }
            oVar.a(null);
            return;
        }
        if ("addMediaView".equals(str2)) {
            MaxAd maxAd7 = this.nativeAd;
            if (maxAd7 != null) {
                addMediaView(mVar, maxAd7);
            }
            oVar.a(null);
            return;
        }
        if ("renderAd".equals(str2)) {
            MaxAd maxAd8 = this.nativeAd;
            if (maxAd8 != null) {
                renderAd(maxAd8);
            }
            oVar.a(null);
            return;
        }
        if (!"loadAd".equals(str2)) {
            oVar.c();
        } else {
            loadAd();
            oVar.a(null);
        }
    }

    private void loadAd() {
        if (!this.isLoading.compareAndSet(false, true)) {
            AppLovinMAX.e("Ignoring request to load native ad for Ad Unit ID " + this.adUnitId + ", another ad load in progress");
            return;
        }
        AppLovinMAX.d("Loading a native ad for Ad Unit ID: " + this.adUnitId + "...");
        MaxNativeAdLoader maxNativeAdLoader = this.adLoader;
        if (maxNativeAdLoader == null || !this.adUnitId.equals(maxNativeAdLoader.getAdUnitId())) {
            MaxNativeAdLoader maxNativeAdLoader2 = new MaxNativeAdLoader(this.adUnitId, this.sdk, this.context);
            this.adLoader = maxNativeAdLoader2;
            maxNativeAdLoader2.setRevenueListener(this);
            this.adLoader.setNativeAdListener(new NativeAdListener());
        }
        this.adLoader.setPlacement(this.placement);
        this.adLoader.setCustomData(this.customData);
        Map<String, Object> map = this.extraParameters;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                this.adLoader.setExtraParameter(entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, Object> map2 = this.localExtraParameters;
        if (map2 != null) {
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                this.adLoader.setLocalExtraParameter(entry2.getKey(), entry2.getValue());
            }
        }
        this.adLoader.loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeDestroyCurrentAd() {
        if (this.nativeAd != null) {
            RelativeLayout relativeLayout = this.mediaViewContainer;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            FrameLayout frameLayout = this.optionsViewContainer;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            this.adLoader.destroy(this.nativeAd);
            this.nativeAd = null;
        }
        this.clickableViews.clear();
    }

    private void renderAd(MaxAd maxAd) {
        MaxNativeAdLoader maxNativeAdLoader;
        if (maxAd == null || (maxNativeAdLoader = this.adLoader) == null) {
            AppLovinMAX.e("Attempting to render ad before ad has been loaded for Ad Unit ID " + this.adUnitId);
        } else {
            maxNativeAdLoader.a(this.clickableViews, this.nativeAdView, maxAd);
            this.adLoader.b(maxAd);
        }
        this.isLoading.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAdLoadedReactNativeEventForAd(MaxNativeAd maxNativeAd) {
        HashMap map = new HashMap(10);
        map.put("title", maxNativeAd.getTitle());
        map.put(X3.i.F0, maxNativeAd.getAdvertiser());
        map.put("body", maxNativeAd.getBody());
        map.put("callToAction", maxNativeAd.getCallToAction());
        if (maxNativeAd.getStarRating() != null) {
            map.put("starRating", maxNativeAd.getStarRating());
        }
        if (maxNativeAd.getMediaContentAspectRatio() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            map.put("mediaContentAspectRatio", Float.valueOf(maxNativeAd.getMediaContentAspectRatio()));
        }
        map.put("isIconImageAvailable", Boolean.valueOf((maxNativeAd.getIcon() == null && maxNativeAd.getIconView() == null) ? false : true));
        map.put("isOptionsViewAvailable", Boolean.valueOf(maxNativeAd.getOptionsView() != null));
        map.put("isMediaViewAvailable", Boolean.valueOf(maxNativeAd.getMediaView() != null));
        Map<String, Object> adInfo = AppLovinMAX.getInstance().getAdInfo(this.nativeAd);
        adInfo.put("nativeAd", map);
        AppLovinMAX.getInstance().fireCallback("OnNativeAdLoadedEvent", adInfo, this.channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, MaxAd maxAd) {
        AppLovinMAX.getInstance().fireCallback(str, maxAd, this.channel);
    }

    private void updateViewLayout(ViewGroup viewGroup, View view, Rect rect) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
        layoutParams.leftMargin = rect.left;
        layoutParams.topMargin = rect.top;
        viewGroup.updateViewLayout(view, layoutParams);
    }

    @Override // io.flutter.plugin.platform.d
    public void dispose() {
        maybeDestroyCurrentAd();
        View view = this.titleView;
        if (view != null) {
            this.nativeAdView.removeView(view);
        }
        View view2 = this.advertiserView;
        if (view2 != null) {
            this.nativeAdView.removeView(view2);
        }
        View view3 = this.bodyView;
        if (view3 != null) {
            this.nativeAdView.removeView(view3);
        }
        View view4 = this.callToActionView;
        if (view4 != null) {
            this.nativeAdView.removeView(view4);
        }
        ImageView imageView = this.iconView;
        if (imageView != null) {
            this.nativeAdView.removeView(imageView);
        }
        MaxNativeAdLoader maxNativeAdLoader = this.adLoader;
        if (maxNativeAdLoader != null) {
            maxNativeAdLoader.destroy();
            this.adLoader = null;
        }
        p pVar = this.channel;
        if (pVar != null) {
            pVar.b(null);
        }
    }

    @Override // io.flutter.plugin.platform.d
    @Nullable
    public View getView() {
        return this.nativeAdView;
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        sendEvent("OnNativeAdRevenuePaidEvent", maxAd);
    }

    @Override // io.flutter.plugin.platform.d
    public void onFlutterViewDetached() {
    }

    @Override // io.flutter.plugin.platform.d
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
    }

    @Override // io.flutter.plugin.platform.d
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
    }

    @Override // io.flutter.plugin.platform.d
    public void onFlutterViewAttached(@NonNull View view) {
    }
}
