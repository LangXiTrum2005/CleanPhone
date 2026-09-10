package com.chartboost.sdk.impl;

import com.chartboost.sdk.view.CBImpressionActivity;

/* JADX INFO: loaded from: classes3.dex */
public interface c9 {
    void attachViewToActivity(ij ijVar);

    void finishActivity();

    CBImpressionActivity getActivity();

    boolean isActivityHardwareAccelerated();

    void setFullscreen();
}
