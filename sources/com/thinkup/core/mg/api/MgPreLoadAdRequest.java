package com.thinkup.core.mg.api;

/* JADX INFO: loaded from: classes6.dex */
public class MgPreLoadAdRequest {
    private int cpEcpmReceiveTime;
    private int cpEcpmSwitch;
    private long cpEcpmTimeout;
    private MgComparedResult mgComparedResult;
    private String placementId;
    private MgPreLoadCallbackRegister preLoadCallbackRegister;
    private String psId;
    private String requestId;

    public static class Builder {
        private final MgPreLoadAdRequest preLoadInfo = new MgPreLoadAdRequest();

        public MgPreLoadAdRequest build() {
            return this.preLoadInfo;
        }

        public Builder setCpCallbackRegister(MgPreLoadCallbackRegister mgPreLoadCallbackRegister) {
            this.preLoadInfo.preLoadCallbackRegister = mgPreLoadCallbackRegister;
            return this;
        }

        public Builder setCpEcpmSwitch(int i2) {
            this.preLoadInfo.cpEcpmSwitch = i2;
            return this;
        }

        public Builder setCpEcpmTimeout(long j) {
            this.preLoadInfo.cpEcpmTimeout = j;
            return this;
        }

        public Builder setPlacementId(String str) {
            this.preLoadInfo.placementId = str;
            return this;
        }

        public Builder setPsId(String str) {
            this.preLoadInfo.psId = str;
            return this;
        }

        public Builder setRequestId(String str) {
            this.preLoadInfo.requestId = str;
            return this;
        }
    }

    public int getCpEcpmReceiveTime() {
        return this.cpEcpmReceiveTime;
    }

    public int getCpEcpmSwitch() {
        return this.cpEcpmSwitch;
    }

    public long getCpEcpmTimeout() {
        return this.cpEcpmTimeout;
    }

    public MgComparedResult getMgComparedResult() {
        return this.mgComparedResult;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public MgPreLoadCallbackRegister getPreLoadCallbackRegister() {
        return this.preLoadCallbackRegister;
    }

    public String getPsId() {
        return this.psId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public boolean isEnableCpEcpm() {
        return this.cpEcpmSwitch == 1;
    }

    public void setCpEcpmReceiveTime(int i2) {
        this.cpEcpmReceiveTime = i2;
    }

    public void setMgComparedResult(MgComparedResult mgComparedResult) {
        this.mgComparedResult = mgComparedResult;
    }

    private MgPreLoadAdRequest() {
        this.cpEcpmTimeout = 1000L;
    }
}
