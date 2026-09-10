package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b6 extends t5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f7570i;

    public b6(u uVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super(uVar, str, lVar);
        this.f7570i = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.t5
    public k5 a(JSONObject jSONObject) {
        return new j6(jSONObject, this.f7570i, this.f8297a);
    }

    @Override // com.applovin.impl.t5
    public String e() {
        return s0.d(this.f8297a);
    }

    @Override // com.applovin.impl.t5
    public String f() {
        return s0.e(this.f8297a);
    }

    @Override // com.applovin.impl.t5
    public void a(int i10, String str) {
        super.a(i10, str);
        this.f7570i.onNativeAdLoadFailed(new AppLovinError(i10, str));
    }
}
