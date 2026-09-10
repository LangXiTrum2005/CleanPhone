package com.thinkup.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class TUAdMixBidInfo {
    private static TUAdMixBidInfo sInstance;
    private XBiddingInfo xBiddingInfo;

    public static class BidEntity {
        private String adPackageName;
        private String adTittle;
        private String adUserName;

        public BidEntity() {
        }

        public String getAdPackageName() {
            return this.adPackageName;
        }

        public String getAdTittle() {
            return this.adTittle;
        }

        public String getAdUserName() {
            return this.adUserName;
        }

        public void setAdPackageName(String str) {
            this.adPackageName = str;
        }

        public void setAdTittle(String str) {
            this.adTittle = str;
        }

        public void setAdUserName(String str) {
            this.adUserName = str;
        }

        public BidEntity(String str, String str2) {
            this.adTittle = str;
            this.adUserName = str2;
        }
    }

    public static abstract class XBiddingInfo {
        public abstract BidEntity getBiddingInfo(TUAdInfo tUAdInfo);
    }

    public static TUAdMixBidInfo getInstance() {
        TUAdMixBidInfo tUAdMixBidInfo;
        synchronized (TUAdMixBidInfo.class) {
            try {
                if (sInstance == null) {
                    sInstance = new TUAdMixBidInfo();
                }
                tUAdMixBidInfo = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tUAdMixBidInfo;
    }

    public XBiddingInfo getXBiddingInfo() {
        return this.xBiddingInfo;
    }

    public void registerMixBiddingInfo(XBiddingInfo xBiddingInfo) {
        this.xBiddingInfo = xBiddingInfo;
    }
}
