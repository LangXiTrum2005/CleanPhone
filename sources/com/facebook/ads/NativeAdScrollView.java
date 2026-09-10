package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: loaded from: classes3.dex */
public class NativeAdScrollView extends LinearLayout {
    public static final int DEFAULT_INSET = 20;
    public static final int DEFAULT_MAX_ADS = 10;
    private final NativeAdScrollViewApi mNativeAdScrollViewApi;

    public interface AdViewProvider {
        View createView(NativeAd nativeAd, int i2);

        void destroyView(NativeAd nativeAd, View view);
    }

    private NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, int i2, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i3) {
        super(context);
        this.mNativeAdScrollViewApi = DynamicLoaderFactory.makeLoader(context).createNativeAdScrollViewApi(this, context, nativeAdsManager, adViewProvider, i2, type, nativeAdViewAttributes, i3);
    }

    public void setInset(int i2) {
        this.mNativeAdScrollViewApi.setInset(i2);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider) {
        this(context, nativeAdsManager, adViewProvider, 0, null, null, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, int i2) {
        this(context, nativeAdsManager, adViewProvider, 0, null, null, i2);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i2) {
        this(context, nativeAdsManager, null, i2, null, null, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i2, NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, null, i2, null, nativeAdViewAttributes, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i2, NativeAdViewAttributes nativeAdViewAttributes, int i3) {
        this(context, nativeAdsManager, null, i2, null, nativeAdViewAttributes, i3);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type) {
        this(context, nativeAdsManager, null, 0, type, null, 10);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, null, 0, type, nativeAdViewAttributes, 10);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i2) {
        this(context, nativeAdsManager, null, 0, type, nativeAdViewAttributes, i2);
    }
}
