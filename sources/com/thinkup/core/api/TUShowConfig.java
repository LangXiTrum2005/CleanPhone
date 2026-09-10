package com.thinkup.core.api;

import com.thinkup.core.common.ooo.nn;

/* JADX INFO: loaded from: classes6.dex */
public class TUShowConfig {
    TUAdInfo atAdInfo;
    TUCustomContentResult atCustomContentResult;
    String scenarioId;
    String showCustomExt;

    public static final class Builder {
        private TUAdInfo atAdInfo;
        private TUCustomContentResult atCustomContentResult;
        private String scenarioId = "";
        private String showCustomExt = "";

        public final Builder adInfo(TUAdInfo tUAdInfo) {
            this.atAdInfo = tUAdInfo;
            return this;
        }

        public final TUShowConfig build() {
            TUShowConfig tUShowConfig = new TUShowConfig();
            tUShowConfig.scenarioId = this.scenarioId;
            tUShowConfig.showCustomExt = this.showCustomExt;
            tUShowConfig.atAdInfo = this.atAdInfo;
            tUShowConfig.atCustomContentResult = this.atCustomContentResult;
            return tUShowConfig;
        }

        public final Builder customContentResult(TUCustomContentResult tUCustomContentResult) {
            this.atCustomContentResult = tUCustomContentResult;
            return this;
        }

        public final Builder scenarioId(String str) {
            if (nn.n(str)) {
                this.scenarioId = str;
            }
            return this;
        }

        public final Builder showCustomExt(String str) {
            this.showCustomExt = str;
            return this;
        }
    }

    public final String getScenarioId() {
        return this.scenarioId;
    }

    public final String getShowCustomExt() {
        return this.showCustomExt;
    }

    public final TUAdInfo getTUAdInfo() {
        return this.atAdInfo;
    }

    public final TUCustomContentResult getTUCustomContentResult() {
        return this.atCustomContentResult;
    }

    private TUShowConfig() {
    }
}
