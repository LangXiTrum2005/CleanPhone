package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface RewardedVideoSmashListener {
    void onRewardedVideoAdClicked();

    default void onRewardedVideoAdClicked(Map<String, Object> map) {
        onRewardedVideoAdClicked();
    }

    void onRewardedVideoAdClosed();

    default void onRewardedVideoAdClosed(Map<String, Object> map) {
        onRewardedVideoAdClosed();
    }

    void onRewardedVideoAdEnded();

    default void onRewardedVideoAdEnded(Map<String, Object> map) {
        onRewardedVideoAdEnded();
    }

    void onRewardedVideoAdOpened();

    default void onRewardedVideoAdOpened(Map<String, Object> map) {
        onRewardedVideoAdOpened();
    }

    void onRewardedVideoAdRewarded();

    default void onRewardedVideoAdRewarded(Map<String, Object> map) {
        onRewardedVideoAdRewarded();
    }

    void onRewardedVideoAdShowFailed(IronSourceError ironSourceError);

    default void onRewardedVideoAdShowFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onRewardedVideoAdShowFailed(ironSourceError);
    }

    void onRewardedVideoAdStarted();

    default void onRewardedVideoAdStarted(Map<String, Object> map) {
        onRewardedVideoAdStarted();
    }

    void onRewardedVideoAdVisible();

    default void onRewardedVideoAdVisible(Map<String, Object> map) {
        onRewardedVideoAdVisible();
    }

    void onRewardedVideoAvailabilityChanged(boolean z10);

    default void onRewardedVideoAvailabilityChanged(boolean z10, Map<String, Object> map) {
        onRewardedVideoAvailabilityChanged(z10);
    }

    void onRewardedVideoInitFailed(IronSourceError ironSourceError);

    default void onRewardedVideoInitFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onRewardedVideoInitFailed(ironSourceError);
    }

    void onRewardedVideoInitSuccess();

    default void onRewardedVideoInitSuccess(Map<String, Object> map) {
        onRewardedVideoInitSuccess();
    }

    void onRewardedVideoLoadFailed(IronSourceError ironSourceError);

    default void onRewardedVideoLoadFailed(IronSourceError ironSourceError, Map<String, Object> map) {
        onRewardedVideoLoadFailed(ironSourceError);
    }

    void onRewardedVideoLoadSuccess();

    default void onRewardedVideoLoadSuccess(Map<String, Object> map) {
        onRewardedVideoLoadSuccess();
    }
}
