package com.startapp.sdk.adsbase;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class VideoConfig implements Serializable {
    private static final long serialVersionUID = -1892737577014264972L;
    private int companionAdCloseDelay;
    private int maxCachedVideos = 3;
    private long minAvailableStorageRequired = 20;
    private int rewardGrantPercentage = 100;
    private int videoErrorsThreshold = 2;

    @TypeInfo(type = BackMode.class)
    private BackMode backMode = BackMode.DISABLED;
    private int nativePlayerProbability = 100;
    private int minTimeForCachingIndicator = 1;
    private int maxTimeForCachingIndicator = 10;
    private boolean videoFallback = false;
    private boolean progressive = false;
    private int progressiveBufferInPercentage = 20;
    private int progressiveInitialBufferInPercentage = 5;
    private int progressiveMinBufferToPlayFromCache = 30;
    private String soundMode = "default";
    private int maxVastLevels = 7;
    private int vastTimeout = 30000;
    private int vastRetryTimeout = 60000;
    private int maxVastCampaignExclude = 10;
    private int vastMediaPicker = 0;
    private int vastPreferredBitrate = 0;
    private long vastDefaultSkipIntervalMilli = 5000;

    public enum BackMode {
        DISABLED,
        SKIP,
        CLOSE,
        BOTH
    }

    public final BackMode a() {
        return this.backMode;
    }

    public final long b() {
        return this.companionAdCloseDelay;
    }

    public final int c() {
        return this.maxCachedVideos;
    }

    public final long d() {
        return TimeUnit.SECONDS.toMillis(this.maxTimeForCachingIndicator);
    }

    public final int e() {
        return this.maxVastCampaignExclude;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VideoConfig videoConfig = (VideoConfig) obj;
            if (this.maxCachedVideos == videoConfig.maxCachedVideos && this.minAvailableStorageRequired == videoConfig.minAvailableStorageRequired && this.rewardGrantPercentage == videoConfig.rewardGrantPercentage && this.videoErrorsThreshold == videoConfig.videoErrorsThreshold && this.nativePlayerProbability == videoConfig.nativePlayerProbability && this.minTimeForCachingIndicator == videoConfig.minTimeForCachingIndicator && this.maxTimeForCachingIndicator == videoConfig.maxTimeForCachingIndicator && this.videoFallback == videoConfig.videoFallback && this.progressive == videoConfig.progressive && this.progressiveBufferInPercentage == videoConfig.progressiveBufferInPercentage && this.progressiveInitialBufferInPercentage == videoConfig.progressiveInitialBufferInPercentage && this.progressiveMinBufferToPlayFromCache == videoConfig.progressiveMinBufferToPlayFromCache && this.maxVastLevels == videoConfig.maxVastLevels && this.vastTimeout == videoConfig.vastTimeout && this.vastRetryTimeout == videoConfig.vastRetryTimeout && this.maxVastCampaignExclude == videoConfig.maxVastCampaignExclude && this.vastMediaPicker == videoConfig.vastMediaPicker && this.vastPreferredBitrate == videoConfig.vastPreferredBitrate && this.vastDefaultSkipIntervalMilli == videoConfig.vastDefaultSkipIntervalMilli && this.backMode == videoConfig.backMode && this.companionAdCloseDelay == videoConfig.companionAdCloseDelay && vi.a((Object) this.soundMode, (Object) videoConfig.soundMode)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.maxVastLevels;
    }

    public final long g() {
        return this.minAvailableStorageRequired;
    }

    public final long h() {
        return TimeUnit.SECONDS.toMillis(this.minTimeForCachingIndicator);
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.maxCachedVideos), Long.valueOf(this.minAvailableStorageRequired), Integer.valueOf(this.rewardGrantPercentage), Integer.valueOf(this.videoErrorsThreshold), this.backMode, Integer.valueOf(this.nativePlayerProbability), Integer.valueOf(this.minTimeForCachingIndicator), Integer.valueOf(this.maxTimeForCachingIndicator), Boolean.valueOf(this.videoFallback), Boolean.valueOf(this.progressive), Integer.valueOf(this.progressiveBufferInPercentage), Integer.valueOf(this.progressiveInitialBufferInPercentage), Integer.valueOf(this.progressiveMinBufferToPlayFromCache), this.soundMode, Integer.valueOf(this.maxVastLevels), Integer.valueOf(this.vastTimeout), Integer.valueOf(this.vastRetryTimeout), Integer.valueOf(this.maxVastCampaignExclude), Integer.valueOf(this.vastMediaPicker), Integer.valueOf(this.vastPreferredBitrate), Long.valueOf(this.vastDefaultSkipIntervalMilli), Integer.valueOf(this.companionAdCloseDelay)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final int i() {
        return this.progressiveBufferInPercentage;
    }

    public final int j() {
        return this.progressiveInitialBufferInPercentage;
    }

    public final int k() {
        return this.progressiveMinBufferToPlayFromCache;
    }

    public final int l() {
        return this.rewardGrantPercentage;
    }

    public final String m() {
        return this.soundMode;
    }

    public final long n() {
        return this.vastDefaultSkipIntervalMilli;
    }

    public final int o() {
        return this.vastRetryTimeout;
    }

    public final int p() {
        return this.videoErrorsThreshold;
    }

    public final boolean q() {
        return this.progressive;
    }

    public final boolean r() {
        return this.videoFallback;
    }
}
