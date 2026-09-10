package com.bytedance.sdk.openadsdk.ri.lr;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: loaded from: classes2.dex */
public class fi implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener ri;

    public fi(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.ri = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
    public void onError(final int i, final String str) {
        if (this.ri == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.lr.fi.1
            @Override // java.lang.Runnable
            public void run() {
                if (fi.this.ri != null) {
                    fi.this.ri.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.ri == null) {
            return;
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ri.lr.fi.2
            @Override // java.lang.Runnable
            public void run() {
                if (fi.this.ri != null) {
                    fi.this.ri.onAdLoaded(pAGNativeAd);
                }
            }
        });
    }
}
