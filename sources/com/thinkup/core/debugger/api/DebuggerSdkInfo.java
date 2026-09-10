package com.thinkup.core.debugger.api;

import com.zg.adlib.util.AppUtil;

/* JADX INFO: loaded from: classes6.dex */
public class DebuggerSdkInfo {
    private String debugKey;
    private String[] deniedUploadDeviceInfo;
    private String versionName;
    private String appId = "";
    private String appKey = "";
    private boolean isHavePreInitNetwork = false;
    private boolean isHaveLoadAd = false;
    private boolean isInitSdk = false;

    public String getAppId() {
        return this.appId;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getDebugKey() {
        return this.debugKey;
    }

    public String[] getDeniedUploadDeviceInfo() {
        return this.deniedUploadDeviceInfo;
    }

    public String getIncompatibleVersion() {
        return AppUtil.VERSION;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public boolean isHaveLoadAd() {
        return this.isHaveLoadAd;
    }

    public boolean isHavePreInitNetwork() {
        return this.isHavePreInitNetwork;
    }

    public boolean isInitSdk() {
        return this.isInitSdk;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setDebugKey(String str) {
        this.debugKey = str;
    }

    public void setDeniedUploadDeviceInfo(String[] strArr) {
        this.deniedUploadDeviceInfo = strArr;
    }

    public void setHaveLoadAd(boolean z2) {
        this.isHaveLoadAd = z2;
    }

    public void setHavePreInitNetwork(boolean z2) {
        this.isHavePreInitNetwork = z2;
    }

    public void setInitSdk(boolean z2) {
        this.isInitSdk = z2;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public boolean shouldRebootForDebugMode() {
        return this.isHavePreInitNetwork || this.isHaveLoadAd;
    }
}
