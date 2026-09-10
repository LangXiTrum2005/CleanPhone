package com.bytedance.sdk.openadsdk.api.model;

/* JADX INFO: loaded from: classes3.dex */
public class PAGErrorModel {
    private final int qdl;
    private final String ud;

    public PAGErrorModel(int i2, String str) {
        this.qdl = i2;
        this.ud = str;
    }

    public int getErrorCode() {
        return this.qdl;
    }

    public String getErrorMessage() {
        return this.ud;
    }
}
