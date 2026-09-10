package com.facebook.ads.internal.api;

import com.facebook.ads.AdClosedListener;

/* JADX INFO: loaded from: classes3.dex */
public interface AdOptionsViewApi extends AdComponentViewApiProvider {
    void setIconColor(int i2);

    void setIconSizeDp(int i2);

    void setOnAdClosedListener(AdClosedListener adClosedListener);

    void setSingleIcon(boolean z2);
}
