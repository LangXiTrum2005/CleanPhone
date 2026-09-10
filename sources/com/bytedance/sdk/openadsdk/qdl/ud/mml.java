package com.bytedance.sdk.openadsdk.qdl.ud;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes3.dex */
public class mml implements PAGNativeAdData {
    private final qdl qdl;

    public mml(qdl qdlVar) {
        this.qdl = qdlVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        qdl qdlVar = this.qdl;
        if (qdlVar != null) {
            return qdlVar.rq();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        qdl qdlVar = this.qdl;
        if (qdlVar != null) {
            return qdlVar.to();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        qdl qdlVar = this.qdl;
        if (qdlVar != null) {
            return qdlVar.mo();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        qdl qdlVar = this.qdl;
        if (qdlVar != null) {
            return qdlVar.mzz();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        qdl qdlVar = this.qdl;
        if (qdlVar != null) {
            return qdlVar.lnr();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        return ljh.mzz(this.qdl.qdl) ? PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo : PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        qdl qdlVar = this.qdl;
        if (qdlVar != null) {
            return qdlVar.wd();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        qdl qdlVar = this.qdl;
        if (qdlVar != null) {
            return qdlVar.mml();
        }
        return null;
    }
}
