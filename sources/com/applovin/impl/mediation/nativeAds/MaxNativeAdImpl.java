package com.applovin.impl.mediation.nativeAds;

import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.b;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdImpl {
    private b adViewTracker;
    private List<View> clickableViews;

    @Nullable
    public b getAdViewTracker() {
        return this.adViewTracker;
    }

    @Nullable
    public List<View> getClickableViews() {
        return this.clickableViews;
    }

    public void setAdViewTracker(b bVar) {
        this.adViewTracker = bVar;
    }

    public void setClickableViews(List<View> list) {
        this.clickableViews = list;
    }
}
