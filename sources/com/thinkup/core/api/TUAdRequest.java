package com.thinkup.core.api;

import com.thinkup.core.basead.adx.api.TUAdxBidFloorInfo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.mg.api.MgPreLoadAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public class TUAdRequest {
    private TUAdxBidFloorInfo adxBidFloorInfo;
    private int channelSource;
    private MgPreLoadAdRequest preLoadInfo;

    public static class Builder {
        private TUAdxBidFloorInfo adxBidFloorInfo;
        private int channelSource = o0n.m().m00();
        private MgPreLoadAdRequest preLoadInfo;

        public TUAdRequest build() {
            TUAdRequest tUAdRequest = new TUAdRequest();
            tUAdRequest.channelSource = this.channelSource;
            tUAdRequest.adxBidFloorInfo = this.adxBidFloorInfo;
            tUAdRequest.preLoadInfo = this.preLoadInfo;
            return tUAdRequest;
        }

        public Builder setChannelSource(int i2) {
            this.channelSource = i2;
            return this;
        }

        public Builder setPreLoadInfo(MgPreLoadAdRequest mgPreLoadAdRequest) {
            this.preLoadInfo = mgPreLoadAdRequest;
            return this;
        }

        public Builder setTUAdxBidFloorInfo(TUAdxBidFloorInfo tUAdxBidFloorInfo) {
            this.adxBidFloorInfo = tUAdxBidFloorInfo;
            return this;
        }
    }

    public int getChannelSource() {
        return this.channelSource;
    }

    public MgPreLoadAdRequest getPreLoadInfo() {
        return this.preLoadInfo;
    }

    public TUAdxBidFloorInfo getTUAdxBidFloorInfo() {
        return this.adxBidFloorInfo;
    }

    public void setAdxBidFloorInfo(TUAdxBidFloorInfo tUAdxBidFloorInfo) {
        this.adxBidFloorInfo = tUAdxBidFloorInfo;
    }

    private TUAdRequest() {
    }
}
