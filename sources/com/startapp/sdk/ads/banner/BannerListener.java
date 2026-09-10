package com.startapp.sdk.ads.banner;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public interface BannerListener {
    void onClick(View view);

    void onFailedToReceiveAd(View view);

    void onImpression(View view);

    void onReceiveAd(View view);
}
