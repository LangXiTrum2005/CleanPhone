package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.mo;

/* JADX INFO: loaded from: classes3.dex */
public interface PAGLoadListener<Ad> extends mo {
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.mo
    void onError(int i2, String str);
}
