package com.thinkup.rewardvideo.api;

import com.thinkup.core.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public interface TURewardVideoAutoLoadListener {
    void onRewardVideoAutoLoadFail(String str, AdError adError);

    void onRewardVideoAutoLoaded(String str);
}
