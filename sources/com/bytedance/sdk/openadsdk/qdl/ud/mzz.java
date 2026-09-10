package com.bytedance.sdk.openadsdk.qdl.ud;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.fco;

/* JADX INFO: loaded from: classes3.dex */
public class mzz implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener qdl;

    public mzz(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.qdl = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.mo
    public void onError(final int i2, final String str) {
        if (this.qdl == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.mzz.1
            @Override // java.lang.Runnable
            public void run() {
                if (mzz.this.qdl != null) {
                    mzz.this.qdl.onError(i2, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.qdl == null) {
            return;
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qdl.ud.mzz.2
            @Override // java.lang.Runnable
            public void run() {
                if (mzz.this.qdl != null) {
                    mzz.this.qdl.onAdLoaded(pAGNativeAd);
                }
            }
        });
    }
}
