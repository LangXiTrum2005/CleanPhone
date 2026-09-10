package com.thinkup.core.debugger.api;

/* JADX INFO: loaded from: classes6.dex */
public class DebuggerAdSourceInfo {
    private String adxOpenUnitGroupListStr;
    private String adxUnitGroupListStr;
    private String c2sDynamicPriceAdSourceListStr;
    private String c2sHeadBiddingUnitGroupListStr;
    private String customInHouseHeadBiddingUnitGroupListStr;
    private String defaultUnitGroupListStr;
    private String directlyUnitGroupListStr;
    private String fbInHouseHeadBiddingUnitGroupListStr;
    private String normalUnitGroupListStr;
    private String onlineUnitGroupListStr;
    private String s2sDynamicPriceAdSourceListStr;
    private String s2sHeadBiddingUnitGroupListStr;

    public static class Builder {
        private final DebuggerAdSourceInfo adSourceInfo = new DebuggerAdSourceInfo();

        public DebuggerAdSourceInfo build() {
            return this.adSourceInfo;
        }

        public Builder setAdxOpenUnitGroupListStr(String str) {
            this.adSourceInfo.adxOpenUnitGroupListStr = str;
            return this;
        }

        public Builder setAdxUnitGroupListStr(String str) {
            this.adSourceInfo.adxUnitGroupListStr = str;
            return this;
        }

        public Builder setC2sDynamicPriceAdSourceListStr(String str) {
            this.adSourceInfo.c2sDynamicPriceAdSourceListStr = str;
            return this;
        }

        public Builder setC2sHeadBiddingUnitGroupListStr(String str) {
            this.adSourceInfo.c2sHeadBiddingUnitGroupListStr = str;
            return this;
        }

        public Builder setCustomInHouseHeadBiddingUnitGroupListStr(String str) {
            this.adSourceInfo.customInHouseHeadBiddingUnitGroupListStr = str;
            return this;
        }

        public Builder setDefaultUnitGroupListStr(String str) {
            this.adSourceInfo.defaultUnitGroupListStr = str;
            return this;
        }

        public Builder setDirectlyUnitGroupListStr(String str) {
            this.adSourceInfo.directlyUnitGroupListStr = str;
            return this;
        }

        public Builder setFbInHouseHeadBiddingUnitGroupListStr(String str) {
            this.adSourceInfo.fbInHouseHeadBiddingUnitGroupListStr = str;
            return this;
        }

        public Builder setNormalUnitGroupListStr(String str) {
            this.adSourceInfo.normalUnitGroupListStr = str;
            return this;
        }

        public Builder setOnlineUnitGroupListStr(String str) {
            this.adSourceInfo.onlineUnitGroupListStr = str;
            return this;
        }

        public Builder setS2sDynamicPriceAdSourceListStr(String str) {
            this.adSourceInfo.s2sDynamicPriceAdSourceListStr = str;
            return this;
        }

        public Builder setS2sHeadBiddingUnitGroupListStr(String str) {
            this.adSourceInfo.s2sHeadBiddingUnitGroupListStr = str;
            return this;
        }
    }

    public String getAdxOpenUnitGroupListStr() {
        return this.adxOpenUnitGroupListStr;
    }

    public String getAdxUnitGroupListStr() {
        return this.adxUnitGroupListStr;
    }

    public String getC2sDynamicPriceAdSourceListStr() {
        return this.c2sDynamicPriceAdSourceListStr;
    }

    public String getC2sHeadBiddingUnitGroupListStr() {
        return this.c2sHeadBiddingUnitGroupListStr;
    }

    public String getCustomInHouseHeadBiddingUnitGroupListStr() {
        return this.customInHouseHeadBiddingUnitGroupListStr;
    }

    public String getDefaultUnitGroupListStr() {
        return this.defaultUnitGroupListStr;
    }

    public String getDirectlyUnitGroupListStr() {
        return this.directlyUnitGroupListStr;
    }

    public String getFbInHouseHeadBiddingUnitGroupListStr() {
        return this.fbInHouseHeadBiddingUnitGroupListStr;
    }

    public String getNormalUnitGroupListStr() {
        return this.normalUnitGroupListStr;
    }

    public String getOnlineUnitGroupListStr() {
        return this.onlineUnitGroupListStr;
    }

    public String getS2sDynamicPriceAdSourceListStr() {
        return this.s2sDynamicPriceAdSourceListStr;
    }

    public String getS2sHeadBiddingUnitGroupListStr() {
        return this.s2sHeadBiddingUnitGroupListStr;
    }

    private DebuggerAdSourceInfo() {
    }
}
