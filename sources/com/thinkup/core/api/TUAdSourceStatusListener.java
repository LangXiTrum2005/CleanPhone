package com.thinkup.core.api;

/* JADX INFO: loaded from: classes6.dex */
public interface TUAdSourceStatusListener {
    void onAdSourceAttempt(TUAdInfo tUAdInfo);

    void onAdSourceBiddingAttempt(TUAdInfo tUAdInfo);

    void onAdSourceBiddingFail(TUAdInfo tUAdInfo, AdError adError);

    void onAdSourceBiddingFilled(TUAdInfo tUAdInfo);

    void onAdSourceLoadFail(TUAdInfo tUAdInfo, AdError adError);

    void onAdSourceLoadFilled(TUAdInfo tUAdInfo);
}
