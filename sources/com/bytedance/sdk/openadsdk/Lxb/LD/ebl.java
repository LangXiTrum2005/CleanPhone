package com.bytedance.sdk.openadsdk.Lxb.LD;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class ebl implements lc {
    private final PAGNativeAdInteractionListener Lxb;

    public ebl(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.Lxb = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.LD.lc
    public boolean LD() {
        return this.Lxb != null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.ebl.1
            @Override // java.lang.Runnable
            public void run() {
                if (ebl.this.Lxb != null) {
                    ebl.this.Lxb.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.LD.lc
    public void Lxb(PAGNativeAd pAGNativeAd) {
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.ebl.2
            @Override // java.lang.Runnable
            public void run() {
                if (ebl.this.Lxb != null) {
                    ebl.this.Lxb.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.Lxb.LD.lc
    public void Lxb() {
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.Lxb.LD.ebl.3
            @Override // java.lang.Runnable
            public void run() {
                if (ebl.this.Lxb != null) {
                    ebl.this.Lxb.onAdDismissed();
                }
            }
        });
    }
}
