package com.thinkup.splashad.api;

import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public interface ITUSplashEyeAd {
    void destroy();

    int[] getSuggestedSize(Context context);

    void onFinished();

    void setEyeAdContainer(ViewGroup viewGroup);

    void show(Context context, Rect rect, TUSplashEyeAdListener tUSplashEyeAdListener);
}
