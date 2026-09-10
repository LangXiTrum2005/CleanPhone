package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class m6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f8408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f8409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f8410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f8411j;

    public m6(JSONObject jSONObject, JSONObject jSONObject2, long j10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskRenderAppLovinAd", lVar);
        this.f8408g = jSONObject;
        this.f8409h = jSONObject2;
        this.f8410i = j10;
        this.f8411j = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.f8408g, this.f8409h, this.f8297a);
        Boolean bool = JsonUtils.getBoolean(this.f8408g, "gs_load_immediately", Boolean.FALSE);
        Boolean bool2 = JsonUtils.getBoolean(this.f8408g, "vs_load_immediately", Boolean.TRUE);
        o5 o5Var = new o5(aVar, this.f8410i, this.f8297a, this.f8411j);
        o5Var.c(bool2.booleanValue());
        o5Var.b(bool.booleanValue());
        this.f8297a.s0().a((k5) o5Var, f6.b.CACHING);
    }
}
