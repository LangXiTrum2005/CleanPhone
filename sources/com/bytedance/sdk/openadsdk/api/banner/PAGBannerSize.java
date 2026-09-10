package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.lnr;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class PAGBannerSize {
    private int lnr = 1;
    private int mml;
    private int qdl;
    private int ud;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i2, int i3) {
        this.qdl = i2;
        this.ud = i3;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i2) {
        int iQdl = lnr.qdl(context, i2, 0);
        if (iQdl == lnr.qdl) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i2, iQdl);
        pAGBannerSize.lnr = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i2) {
        int iQdl = lnr.qdl(context, 0);
        if (iQdl == lnr.qdl) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i2, 0);
        pAGBannerSize.mml = iQdl;
        pAGBannerSize.lnr = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i2, int i3) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i2, 0);
        pAGBannerSize.mml = i3;
        pAGBannerSize.lnr = 3;
        return pAGBannerSize;
    }

    public int getHeight() {
        return this.ud;
    }

    public int getMaxHeight() {
        return this.mml;
    }

    public int getType() {
        return this.lnr;
    }

    public int getWidth() {
        return this.qdl;
    }
}
