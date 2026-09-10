package com.bytedance.sdk.openadsdk.api.init;

/* JADX INFO: loaded from: classes2.dex */
public class PAGBidError {
    private String lr;
    private int ri;

    public PAGBidError(int i, String str) {
        this.ri = i;
        this.lr = str;
    }

    public int getCode() {
        return this.ri;
    }

    public String getMessage() {
        return this.lr;
    }
}
