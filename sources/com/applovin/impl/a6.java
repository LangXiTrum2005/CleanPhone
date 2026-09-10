package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a6 extends t5 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f7402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f7403j;

    public a6(u uVar, long j10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        this(uVar, j10, appLovinAdLoadListener, "TaskFetchNextAd", lVar);
    }

    @Override // com.applovin.impl.t5
    public k5 a(JSONObject jSONObject) {
        return new g6(jSONObject, this.f9799g, this.f7402i, this.f7403j, this.f8297a);
    }

    @Override // com.applovin.impl.t5
    public String e() {
        return s0.a(this.f8297a);
    }

    @Override // com.applovin.impl.t5
    public String f() {
        return s0.b(this.f8297a);
    }

    public a6(u uVar, long j10, AppLovinAdLoadListener appLovinAdLoadListener, String str, com.applovin.impl.sdk.l lVar) {
        super(uVar, str, lVar);
        this.f7402i = j10;
        this.f7403j = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.t5
    public void a(int i10, String str) {
        super.a(i10, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f7403j;
        if (!(appLovinAdLoadListener instanceof o2)) {
            appLovinAdLoadListener.failedToReceiveAd(i10);
        } else {
            ((o2) this.f7403j).failedToReceiveAdV2(new AppLovinError(i10, str));
        }
    }
}
