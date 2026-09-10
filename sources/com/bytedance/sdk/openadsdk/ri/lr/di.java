package com.bytedance.sdk.openadsdk.ri.lr;

import com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;

/* JADX INFO: loaded from: classes2.dex */
public interface di extends PAGAdWrapperListener {
    boolean lr();

    void ri();

    void ri(PAGNativeAd pAGNativeAd);
}
