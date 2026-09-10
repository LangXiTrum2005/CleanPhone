package com.thinkup.core.api;

/* JADX INFO: loaded from: classes6.dex */
public class TUOsDmEntity {
    private final String bidDm;
    private final String cdnTcpDm;
    private final String daDm;
    private final String mainDm;
    private final String ruBpDm;
    private final String smartWFDm;
    private final String tkDm;
    private final String trafficType;

    public TUOsDmEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.mainDm = str;
        this.tkDm = str2;
        this.daDm = str3;
        this.bidDm = str4;
        this.ruBpDm = str5;
        this.smartWFDm = str6;
        this.trafficType = str7;
        this.cdnTcpDm = str8;
    }

    public String getBidDm() {
        return this.bidDm;
    }

    public String getCdnTcpDm() {
        return this.cdnTcpDm;
    }

    public String getDaDm() {
        return this.daDm;
    }

    public String getMainDm() {
        return this.mainDm;
    }

    public String getRuBpDm() {
        return this.ruBpDm;
    }

    public String getSmartWFDm() {
        return this.smartWFDm;
    }

    public String getTkDm() {
        return this.tkDm;
    }

    public String getTrafficType() {
        return this.trafficType;
    }
}
