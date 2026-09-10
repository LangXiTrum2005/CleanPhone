package com.bytedance.sdk.openadsdk.api.factory;

import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.common.mo;

/* JADX INFO: loaded from: classes3.dex */
public interface IADLoader<R extends PAGRequest, L extends mo> {
    void loadAd(String str, R r, L l2);
}
