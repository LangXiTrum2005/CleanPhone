package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.api.AdComponentFrameLayout;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: loaded from: classes3.dex */
public class AdOptionsView extends AdComponentFrameLayout {
    private final AdOptionsViewApi mAdOptionsViewApi;

    public enum Orientation {
        HORIZONTAL,
        VERTICAL
    }

    public AdOptionsView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout) {
        super(context);
        AdOptionsViewApi adOptionsViewApiCreateAdOptionsView = DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, this);
        this.mAdOptionsViewApi = adOptionsViewApiCreateAdOptionsView;
        attachAdComponentViewApi(adOptionsViewApiCreateAdOptionsView);
    }

    public void setIconColor(int i2) {
        this.mAdOptionsViewApi.setIconColor(i2);
    }

    public void setIconSizeDp(int i2) {
        this.mAdOptionsViewApi.setIconSizeDp(i2);
    }

    public void setOnAdClosedListener(AdClosedListener adClosedListener) {
        this.mAdOptionsViewApi.setOnAdClosedListener(adClosedListener);
    }

    public void setSingleIcon(boolean z2) {
        this.mAdOptionsViewApi.setSingleIcon(z2);
    }

    public AdOptionsView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, Orientation orientation, int i2) {
        super(context);
        AdOptionsViewApi adOptionsViewApiCreateAdOptionsView = DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, orientation, i2, this);
        this.mAdOptionsViewApi = adOptionsViewApiCreateAdOptionsView;
        attachAdComponentViewApi(adOptionsViewApiCreateAdOptionsView);
    }
}
