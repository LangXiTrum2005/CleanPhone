package com.smartdigimkt.sdk.api;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SDMInitConfig {
    private String appId;
    private String appKey;
    private String bundleName;
    private SDMDebuggerConfig debuggerConfig;
    private Map<String, Object> extraMap;
    private String systemDevFrameworkType;

    public static class Builder {
        private final String appId;
        private final String appKey;
        private String bundleName;
        private SDMDebuggerConfig debuggerConfig;
        private String systemDevFrameworkType = "";
        private Map<String, Object> extraMap = new HashMap();

        public Builder(String str, String str2) {
            this.appId = str;
            this.appKey = str2;
        }

        public SDMInitConfig build() {
            return new SDMInitConfig(this);
        }

        public Builder setBundleName(String str) {
            this.bundleName = str;
            return this;
        }

        public Builder setDebuggerConfig(SDMDebuggerConfig sDMDebuggerConfig) {
            this.debuggerConfig = sDMDebuggerConfig;
            return this;
        }

        public Builder setExtraMap(Map<String, Object> map) {
            this.extraMap = map;
            return this;
        }

        public Builder setSystemDevFrameworkType(String str) {
            this.systemDevFrameworkType = str;
            return this;
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getBundleName() {
        return this.bundleName;
    }

    public SDMDebuggerConfig getDebuggerConfig() {
        return this.debuggerConfig;
    }

    public Map<String, Object> getExtraMap() {
        return this.extraMap;
    }

    public String getSystemDevFrameworkType() {
        return this.systemDevFrameworkType;
    }

    private SDMInitConfig() {
        this.systemDevFrameworkType = "";
    }

    private SDMInitConfig(Builder builder) {
        this.systemDevFrameworkType = "";
        this.appId = builder.appId;
        this.appKey = builder.appKey;
        this.bundleName = builder.bundleName;
        this.debuggerConfig = builder.debuggerConfig;
        this.systemDevFrameworkType = builder.systemDevFrameworkType;
        this.extraMap = builder.extraMap;
    }
}
