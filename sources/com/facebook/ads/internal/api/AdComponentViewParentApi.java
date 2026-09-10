package com.facebook.ads.internal.api;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public interface AdComponentViewParentApi extends AdComponentView {
    void bringChildToFront(View view);

    void onAttachedToWindow();

    void onDetachedFromWindow();

    void onMeasure(int i2, int i3);

    void onVisibilityChanged(View view, int i2);

    void setMeasuredDimension(int i2, int i3);
}
