package com.bytedance.sdk.openadsdk.api.bidding;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;

/* JADX INFO: loaded from: classes3.dex */
public class PAGBiddingRequest {
    private PAGBannerSize qdl = null;
    private String ud = null;
    private String lnr = null;

    public String getAdxId() {
        return this.lnr;
    }

    public PAGBannerSize getBannerSize() {
        return this.qdl;
    }

    public String getSlotId() {
        return this.ud;
    }

    public void setAdxId(String str) {
        this.lnr = str;
    }

    public void setBannerSize(PAGBannerSize pAGBannerSize) {
        this.qdl = pAGBannerSize;
    }

    public void setSlotId(String str) {
        this.ud = str;
    }
}
