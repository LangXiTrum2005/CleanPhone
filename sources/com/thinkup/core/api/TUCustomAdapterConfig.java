package com.thinkup.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class TUCustomAdapterConfig {
    private long adCacheTime;
    private int lossNoticePosition;
    private boolean realTimeBidSwitch;

    public static class Builder {
        private boolean realTimeBidSwitch = false;
        private long adCacheTime = 1800000;
        private int lossNoticePosition = -1;

        public Builder adCacheTime(long j) {
            this.adCacheTime = j;
            return this;
        }

        public TUCustomAdapterConfig build() {
            TUCustomAdapterConfig tUCustomAdapterConfig = new TUCustomAdapterConfig();
            tUCustomAdapterConfig.realTimeBidSwitch = this.realTimeBidSwitch;
            tUCustomAdapterConfig.adCacheTime = this.adCacheTime;
            tUCustomAdapterConfig.lossNoticePosition = this.lossNoticePosition;
            return tUCustomAdapterConfig;
        }

        public Builder lossNoticePosition(int i2) {
            this.lossNoticePosition = i2;
            return this;
        }

        public Builder realTimeBidSwitch(boolean z2) {
            this.realTimeBidSwitch = z2;
            return this;
        }
    }

    public long getAdCacheTime() {
        return this.adCacheTime;
    }

    public int getLossNoticePostion() {
        return this.lossNoticePosition;
    }

    public boolean isRealTimeBidSwitch() {
        return this.realTimeBidSwitch;
    }

    private TUCustomAdapterConfig() {
    }
}
