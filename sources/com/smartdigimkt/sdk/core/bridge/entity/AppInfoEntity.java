package com.smartdigimkt.sdk.core.bridge.entity;

import android.support.v4.media.a;

/* JADX INFO: loaded from: classes6.dex */
public class AppInfoEntity extends BaseInfoEntity {

    @DataField("med_app_id")
    private String mediationAppId;

    @DataField("med_app_key")
    private String mediationAppKey;

    @DataField("med_plat")
    private int mediationPlatform;

    @DataField("med_version")
    private String mediationVersion;

    public String getMediationAppId() {
        return this.mediationAppId;
    }

    public String getMediationAppKey() {
        return this.mediationAppKey;
    }

    public int getMediationPlatform() {
        return this.mediationPlatform;
    }

    public String getMediationVersion() {
        return this.mediationVersion;
    }

    public void setMediationAppId(String str) {
        this.mediationAppId = str;
    }

    public void setMediationAppKey(String str) {
        this.mediationAppKey = str;
    }

    public void setMediationPlatform(int i2) {
        this.mediationPlatform = i2;
    }

    public void setMediationVersion(String str) {
        this.mediationVersion = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppInfoEntity{mediationPlatform=");
        sb.append(this.mediationPlatform);
        sb.append(", mediationVersion='");
        sb.append(this.mediationVersion);
        sb.append("', mediationAppId='");
        sb.append(this.mediationAppId);
        sb.append("', mediationAppKey='");
        return a.r(sb, this.mediationAppKey, "'}");
    }
}
