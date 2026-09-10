package com.startapp.sdk.internal;

import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.PlacementConfig;
import com.startapp.sdk.ads.external.config.StrategyConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e7 {
    public static final boolean a(boolean z2, String str, boolean z3, boolean z4) {
        ExternalAdConfig externalAdConfigV;
        AdUnitConfig adUnitConfig;
        PlacementConfig rewarded;
        if (str == null || (externalAdConfigV = MetaData.E().v()) == null || (adUnitConfig = externalAdConfigV.getMapping().get(str)) == null || !adUnitConfig.isValid()) {
            return false;
        }
        StrategyConfig strategies = externalAdConfigV.getStrategies();
        if (z3) {
            rewarded = strategies.getBanner();
        } else {
            rewarded = z4 ? strategies.getRewarded() : strategies.getInterstitial();
        }
        return z2 ? rewarded.isFallbackActive() : vi.a(rewarded.getRatio());
    }
}
