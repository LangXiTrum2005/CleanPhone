package com.smartdigimkt.sdk.core.bridge.entity;

import android.support.v4.media.a;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes6.dex */
public class DeviceInfoEntity extends BaseInfoEntity {

    @DataField("a_id")
    private String androidId;

    @DataField(MBridgeConstans.SP_GA_ID)
    private String gaid;

    @DataField("i_mei")
    private String imei;

    @DataField("im_si")
    private String imsi;

    @DataField("ip_v4")
    private String ipV4;

    @DataField("ip_v6")
    private String ipV6;

    @DataField("m_ac")
    private String mac;

    @DataField("oa_id")
    private String oaid;

    @DataField("ss_id")
    private String ssid;

    @DataField("up_id")
    private String upId;

    @DataField("ua")
    private String userAgent;

    public String getAndroidId() {
        return this.androidId;
    }

    public String getGaid() {
        return this.gaid;
    }

    public String getImei() {
        return this.imei;
    }

    public String getImsi() {
        return this.imsi;
    }

    public String getIpV4() {
        return this.ipV4;
    }

    public String getIpV6() {
        return this.ipV6;
    }

    public String getMac() {
        return this.mac;
    }

    public String getOaid() {
        return this.oaid;
    }

    public String getSsid() {
        return this.ssid;
    }

    public String getUpId() {
        return this.upId;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    public void setImsi(String str) {
        this.imsi = str;
    }

    public void setMac(String str) {
        this.mac = str;
    }

    public void setOaid(String str) {
        this.oaid = str;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceInfoEntity{upId='");
        sb.append(this.upId);
        sb.append("', oaid='");
        sb.append(this.oaid);
        sb.append("', androidId='");
        sb.append(this.androidId);
        sb.append("', imei='");
        sb.append(this.imei);
        sb.append("', imsi='");
        sb.append(this.imsi);
        sb.append("', mac='");
        sb.append(this.mac);
        sb.append("', ssid='");
        sb.append(this.ssid);
        sb.append("', gaid='");
        sb.append(this.gaid);
        sb.append("', userAgent='");
        sb.append(this.userAgent);
        sb.append("', ipV4='");
        sb.append(this.ipV4);
        sb.append("', ipV6='");
        return a.r(sb, this.ipV6, "'}");
    }
}
