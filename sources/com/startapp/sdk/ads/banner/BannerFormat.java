package com.startapp.sdk.ads.banner;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes6.dex */
public enum BannerFormat {
    BANNER(0, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50),
    MREC(1, 300, 250),
    COVER(2, 300, 157);

    final int heightDp;
    final int type;
    final int widthDp;

    BannerFormat(int i2, int i3, int i4) {
        this.type = i2;
        this.widthDp = i3;
        this.heightDp = i4;
    }
}
