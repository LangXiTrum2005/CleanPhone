package com.bytedance.sdk.openadsdk.ri.lr;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public class ka implements PAGNativeAdData {
    private final ri ri;

    public ka(ri riVar) {
        this.ri = riVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        ri riVar = this.ri;
        if (riVar != null) {
            return riVar.sf();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        ri riVar = this.ri;
        if (riVar != null) {
            return riVar.qt();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        ri riVar = this.ri;
        if (riVar != null) {
            return riVar.di();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        ri riVar = this.ri;
        if (riVar != null) {
            return riVar.fi();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        ri riVar = this.ri;
        if (riVar != null) {
            return riVar.ik();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        return wjv.fi(this.ri.ri) ? PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo : PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        ri riVar = this.ri;
        if (riVar != null) {
            return riVar.xha();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        ri riVar = this.ri;
        if (riVar != null) {
            return riVar.ka();
        }
        return null;
    }
}
