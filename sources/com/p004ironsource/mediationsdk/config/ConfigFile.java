package com.p004ironsource.mediationsdk.config;

import com.adcolony.sdk.AdColonyAppOptions;

/* JADX INFO: loaded from: classes5.dex */
public class ConfigFile {
    private static ConfigFile mInstance;
    private String mPluginFrameworkVersion;
    private String mPluginType;
    private String mPluginVersion;
    private String[] mSupportedPlugins = {"AdobeAir", "Cocos2dx", "Cordova", AdColonyAppOptions.CORONA, "Defold", "Flutter", "ReactNative", AdColonyAppOptions.UNITY, "Unreal", "MAUI", "Other"};

    public static synchronized ConfigFile getConfigFile() {
        try {
            if (mInstance == null) {
                mInstance = new ConfigFile();
            }
        } catch (Throwable th) {
            throw th;
        }
        return mInstance;
    }

    public String getPluginFrameworkVersion() {
        return this.mPluginFrameworkVersion;
    }

    public String getPluginType() {
        return this.mPluginType;
    }

    public String getPluginVersion() {
        return this.mPluginVersion;
    }

    public void setPluginData(String str, String str2, String str3) {
        this.mPluginType = null;
        if (str != null) {
            for (String str4 : this.mSupportedPlugins) {
                if (str.equalsIgnoreCase(str4)) {
                    this.mPluginType = str4;
                    break;
                }
            }
        }
        if (str2 != null) {
            this.mPluginVersion = str2;
        }
        if (str3 != null) {
            this.mPluginFrameworkVersion = str3;
        }
    }
}
