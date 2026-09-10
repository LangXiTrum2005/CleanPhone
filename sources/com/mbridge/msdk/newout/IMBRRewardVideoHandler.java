package com.mbridge.msdk.newout;

/* JADX INFO: loaded from: classes2.dex */
public interface IMBRRewardVideoHandler {
    boolean isReady();

    void load();

    void load(String str);

    void setRewardVideoListener(RewardVideoListener rewardVideoListener);

    void show(String str);
}
