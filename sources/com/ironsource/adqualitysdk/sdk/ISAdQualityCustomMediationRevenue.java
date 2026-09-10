package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ISAdQualityCustomMediationRevenue {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final ISAdQualityMediationNetwork f25;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final ISAdQualityAdType f26;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final double f27;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final String f28;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Deprecated
    public static class Builder {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private double f30;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private String f31;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private ISAdQualityMediationNetwork f29 = ISAdQualityMediationNetwork.UNKNOWN;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ISAdQualityAdType f32 = ISAdQualityAdType.UNKNOWN;

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f29, this.f32, this.f30, this.f31, (byte) 0);
        }

        @Deprecated
        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f32 = iSAdQualityAdType;
            return this;
        }

        @Deprecated
        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f29 = iSAdQualityMediationNetwork;
            return this;
        }

        @Deprecated
        public Builder setPlacement(String str) {
            this.f31 = str;
            return this;
        }

        @Deprecated
        public Builder setRevenue(double d10) {
            this.f30 = d10;
            return this;
        }
    }

    public /* synthetic */ ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d10, String str, byte b10) {
        this(iSAdQualityMediationNetwork, iSAdQualityAdType, d10, str);
    }

    @Deprecated
    public ISAdQualityAdType getAdType() {
        return this.f26;
    }

    @Deprecated
    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f25;
    }

    @Deprecated
    public String getPlacement() {
        return this.f28;
    }

    @Deprecated
    public double getRevenue() {
        return this.f27;
    }

    private ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d10, String str) {
        this.f25 = iSAdQualityMediationNetwork;
        this.f26 = iSAdQualityAdType;
        this.f27 = d10;
        this.f28 = str;
    }
}
