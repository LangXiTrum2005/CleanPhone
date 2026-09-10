package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: loaded from: classes3.dex */
public class PAGRewardItem {
    private final int qdl;
    private final String ud;

    public PAGRewardItem(int i2, String str) {
        this.qdl = i2;
        this.ud = str;
    }

    public int getRewardAmount() {
        return this.qdl;
    }

    public String getRewardName() {
        return this.ud;
    }
}
