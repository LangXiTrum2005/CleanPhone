package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface AppLovinNativeAd {
    void destroy();

    long getAdIdNumber();

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Uri getIconUri();

    AppLovinMediaView getMediaView();

    AppLovinOptionsView getOptionsView();

    Double getStarRating();

    String getTitle();

    void registerViewsForInteraction(List<View> list, ViewGroup viewGroup);

    void unregisterViewsForInteraction();
}
