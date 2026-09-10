package com.bytedance.sdk.openadsdk.Lxb.LD;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.tD;

/* JADX INFO: loaded from: classes2.dex */
public class ZU implements PAGNativeAdData {
    private final Lxb Lxb;

    public ZU(Lxb lxb) {
        this.Lxb = lxb;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        Lxb lxb = this.Lxb;
        if (lxb != null) {
            return lxb.JVA();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        Lxb lxb = this.Lxb;
        if (lxb != null) {
            return lxb.nBu();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        Lxb lxb = this.Lxb;
        if (lxb != null) {
            return lxb.lc();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        Lxb lxb = this.Lxb;
        if (lxb != null) {
            return lxb.JXs();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        Lxb lxb = this.Lxb;
        if (lxb != null) {
            return lxb.lk();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        return tD.JXs(this.Lxb.Lxb) ? PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo : PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        Lxb lxb = this.Lxb;
        if (lxb != null) {
            return lxb.ebl();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        Lxb lxb = this.Lxb;
        if (lxb != null) {
            return lxb.ZU();
        }
        return null;
    }
}
