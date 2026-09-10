package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* JADX INFO: loaded from: classes3.dex */
public interface PAGLoadCallback<Ad> {
    void onAdLoaded(Ad ad);

    void onError(PAGErrorModel pAGErrorModel);
}
