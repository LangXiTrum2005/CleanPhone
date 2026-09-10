package com.thinkup.network.vungle;

import android.content.Context;
import android.view.View;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.core.api.TUCustomLoadListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class VungleTUBanner {
    public abstract void destroy();

    public abstract View getBannerView();

    public abstract boolean isAdReady();

    public abstract void loadAd(Context context, String str, TUCustomLoadListener tUCustomLoadListener, CustomBannerAdapter customBannerAdapter);
}
