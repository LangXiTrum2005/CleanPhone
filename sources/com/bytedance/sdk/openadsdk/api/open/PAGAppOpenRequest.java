package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: loaded from: classes3.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int qdl;

    public int getTimeout() {
        return this.qdl;
    }

    public void setTimeout(int i2) {
        this.qdl = i2;
    }
}
