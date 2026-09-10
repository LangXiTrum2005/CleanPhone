package com.thinkup.core.api;

import com.applovin.impl.Z;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class TUSharedPlacementConfig {
    Map<String, Object> bannerLocalExtra;
    Map<String, Object> interstitialLocalExtra;
    Map<String, Object> nativeLocalExtra;
    Map<String, Object> rewardVideoLocalExtra;
    Map<String, Object> splashLocalExtra;

    public static class Builder {
        Map<String, Object> bannerLocalExtra;
        Map<String, Object> interstitialLocalExtra;
        Map<String, Object> nativeLocalExtra;
        Map<String, Object> rewardVideoLocalExtra;
        Map<String, Object> splashLocalExtra;

        public Builder bannerLocalExtra(Map<String, Object> map) {
            this.bannerLocalExtra = map;
            return this;
        }

        public TUSharedPlacementConfig build() {
            return new TUSharedPlacementConfig(this);
        }

        public Builder interstitialLocalExtra(Map<String, Object> map) {
            this.interstitialLocalExtra = map;
            return this;
        }

        public Builder nativeLocalExtra(Map<String, Object> map) {
            this.nativeLocalExtra = map;
            return this;
        }

        public Builder rewardVideoLocalExtra(Map<String, Object> map) {
            this.rewardVideoLocalExtra = map;
            return this;
        }

        public Builder splashLocalExtra(Map<String, Object> map) {
            this.splashLocalExtra = map;
            return this;
        }
    }

    public Map<String, Object> getBannerLocalExtra() {
        return this.bannerLocalExtra;
    }

    public Map<String, Object> getInterstitialLocalExtra() {
        return this.interstitialLocalExtra;
    }

    public Map<String, Object> getNativeLocalExtra() {
        return this.nativeLocalExtra;
    }

    public Map<String, Object> getRewardVideoLocalExtra() {
        return this.rewardVideoLocalExtra;
    }

    public Map<String, Object> getSplashLocalExtra() {
        return this.splashLocalExtra;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TUSharedPlacementConfig{rewardVideoLocalExtra=");
        sb.append(this.rewardVideoLocalExtra);
        sb.append(", interstitialLocalExtra=");
        sb.append(this.interstitialLocalExtra);
        sb.append(", splashLocalExtra=");
        sb.append(this.splashLocalExtra);
        sb.append(", bannerLocalExtra=");
        sb.append(this.bannerLocalExtra);
        sb.append(", nativeLocalExtra=");
        return Z.o(sb, this.nativeLocalExtra, AbstractJsonLexerKt.END_OBJ);
    }

    private TUSharedPlacementConfig(Builder builder) {
        this.rewardVideoLocalExtra = builder.rewardVideoLocalExtra;
        this.interstitialLocalExtra = builder.interstitialLocalExtra;
        this.splashLocalExtra = builder.splashLocalExtra;
        this.bannerLocalExtra = builder.bannerLocalExtra;
        this.nativeLocalExtra = builder.nativeLocalExtra;
    }
}
