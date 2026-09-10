package com.applovin.impl;

import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class c6 extends a6 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k f7656k;

    public c6(k kVar, long j10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super(u.a("adtoken_zone"), j10, appLovinAdLoadListener, "TaskFetchTokenAd", lVar);
        this.f7656k = kVar;
    }

    @Override // com.applovin.impl.t5
    public Map h() {
        HashMap map = new HashMap(2);
        map.put("adtoken", this.f7656k.b());
        map.put("adtoken_prefix", this.f7656k.d());
        return map;
    }
}
