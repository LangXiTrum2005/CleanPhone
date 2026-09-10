package com.ironsource.mediationsdk.config;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ConfigFile {
    private static ConfigFile mInstance;
    private String mPluginFrameworkVersion;
    private String mPluginType;
    private String mPluginVersion;
    private String[] mSupportedPlugins = {"AdobeAir", "Cocos2dx", "Cordova", "Corona", "Defold", "Flutter", "ReactNative", "Unity", "Unreal", "MAUI", "Other"};

    public static synchronized ConfigFile getConfigFile() {
        try {
            if (mInstance == null) {
                mInstance = new ConfigFile();
            }
        } catch (Throwable th2) {
            throw th2;
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
