package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: loaded from: classes3.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize qdl;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.qdl = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.qdl;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.qdl = pAGBannerSize;
    }
}
