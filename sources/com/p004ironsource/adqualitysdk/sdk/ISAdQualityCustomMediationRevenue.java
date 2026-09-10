package com.p004ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes5.dex */
public class ISAdQualityCustomMediationRevenue {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ISAdQualityMediationNetwork f35;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final ISAdQualityAdType f36;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final double f37;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final String f38;

    public static class Builder {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private ISAdQualityMediationNetwork f39 = ISAdQualityMediationNetwork.UNKNOWN;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ISAdQualityAdType f40 = ISAdQualityAdType.UNKNOWN;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f41;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private double f42;

        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f39, this.f40, this.f42, this.f41, (byte) 0);
        }

        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f40 = iSAdQualityAdType;
            return this;
        }

        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f39 = iSAdQualityMediationNetwork;
            return this;
        }

        public Builder setPlacement(String str) {
            this.f41 = str;
            return this;
        }

        public Builder setRevenue(double d) {
            this.f42 = d;
            return this;
        }
    }

    public /* synthetic */ ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str, byte b2) {
        this(iSAdQualityMediationNetwork, iSAdQualityAdType, d, str);
    }

    public ISAdQualityAdType getAdType() {
        return this.f36;
    }

    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f35;
    }

    public String getPlacement() {
        return this.f38;
    }

    public double getRevenue() {
        return this.f37;
    }

    private ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str) {
        this.f35 = iSAdQualityMediationNetwork;
        this.f36 = iSAdQualityAdType;
        this.f37 = d;
        this.f38 = str;
    }
}
