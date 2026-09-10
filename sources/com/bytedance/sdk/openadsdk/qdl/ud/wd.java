package com.bytedance.sdk.openadsdk.qdl.ud;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.fco;

/* JADX INFO: loaded from: classes3.dex */
public class wd implements mo {
    private final PAGNativeAdInteractionListener qdl;

    public wd(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.qdl = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.wd.1
            @Override // java.lang.Runnable
            public void run() {
                if (wd.this.qdl != null) {
                    wd.this.qdl.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.ud.mo
    public boolean ud() {
        return this.qdl != null;
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.ud.mo
    public void qdl(PAGNativeAd pAGNativeAd) {
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.wd.2
            @Override // java.lang.Runnable
            public void run() {
                if (wd.this.qdl != null) {
                    wd.this.qdl.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.qdl.ud.mo
    public void qdl() {
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.wd.3
            @Override // java.lang.Runnable
            public void run() {
                if (wd.this.qdl != null) {
                    wd.this.qdl.onAdDismissed();
                }
            }
        });
    }
}
