package com.bytedance.sdk.openadsdk.ri.lr;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: loaded from: classes2.dex */
public class xha implements di {
    private final PAGNativeAdInteractionListener ri;

    public xha(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.ri = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.ri.lr.di
    public boolean lr() {
        return this.ri != null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.lr.xha.1
            @Override // java.lang.Runnable
            public void run() {
                if (xha.this.ri != null) {
                    xha.this.ri.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ri.lr.di
    public void ri(PAGNativeAd pAGNativeAd) {
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.lr.xha.2
            @Override // java.lang.Runnable
            public void run() {
                if (xha.this.ri != null) {
                    xha.this.ri.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.ri.lr.di
    public void ri() {
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.lr.xha.3
            @Override // java.lang.Runnable
            public void run() {
                if (xha.this.ri != null) {
                    xha.this.ri.onAdDismissed();
                }
            }
        });
    }
}
