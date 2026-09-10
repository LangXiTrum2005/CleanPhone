package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class z5 extends b6 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k f10304j;

    public z5(k kVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super(u.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, lVar);
        this.f10304j = kVar;
    }

    @Override // com.applovin.impl.t5
    public Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f10304j.b());
        map.put("adtoken_prefix", this.f10304j.d());
        return map;
    }
}
