package com.thinkup.network.adx;

import com.smartdigimkt.sdk.api.format.SDMNativeAd;
import com.thinkup.core.api.TUAdAppInfo;

/* JADX INFO: loaded from: classes6.dex */
public class AdxAppInfo extends TUAdAppInfo {
    public String appName;
    public String appPrivacyLink;
    public String appVersion;
    public String apppermissionLink;
    public String functionLink;
    public String publisher;

    public AdxAppInfo(SDMNativeAd sDMNativeAd) {
        this.publisher = sDMNativeAd.getPublisher();
        this.appVersion = sDMNativeAd.getAppVersion();
        this.appPrivacyLink = sDMNativeAd.getPrivacyUrl();
        this.apppermissionLink = sDMNativeAd.getPermissionUrl();
        this.appName = sDMNativeAd.getAppName();
        this.functionLink = sDMNativeAd.getFunctionUrl();
    }

    @Override // com.thinkup.core.api.TUAdAppInfo
    public String getAppName() {
        return this.appName;
    }

    @Override // com.thinkup.core.api.TUAdAppInfo
    public String getAppPackageName() {
        return "";
    }

    @Override // com.thinkup.core.api.TUAdAppInfo
    public String getAppPermissonUrl() {
        return this.apppermissionLink;
    }

    @Override // com.thinkup.core.api.TUAdAppInfo
    public String getAppPrivacyUrl() {
        return this.appPrivacyLink;
    }

    @Override // com.thinkup.core.api.TUAdAppInfo
    public long getAppSize() {
        return 0L;
    }

    @Override // com.thinkup.core.api.TUAdAppInfo
    public String getAppVersion() {
        return this.appVersion;
    }

    @Override // com.thinkup.core.api.TUAdAppInfo
    public String getDownloadCount() {
        return "";
    }

    @Override // com.thinkup.core.api.TUAdAppInfo
    public String getFunctionUrl() {
        return this.functionLink;
    }

    @Override // com.thinkup.core.api.TUAdAppInfo
    public String getPublisher() {
        return this.publisher;
    }
}
