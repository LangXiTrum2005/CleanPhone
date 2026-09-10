package com.thinkup.core.api;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class TUNetworkConfig {
    List<TUInitConfig> mTUInitConfigList;

    public static class Builder {
        List<TUInitConfig> mTUInitConfigs;

        public TUNetworkConfig build() {
            TUNetworkConfig tUNetworkConfig = new TUNetworkConfig();
            tUNetworkConfig.mTUInitConfigList = this.mTUInitConfigs;
            return tUNetworkConfig;
        }

        public Builder withInitConfigList(List<TUInitConfig> list) {
            this.mTUInitConfigs = list;
            return this;
        }
    }

    public List<TUInitConfig> getTUInitConfigList() {
        return this.mTUInitConfigList;
    }
}
