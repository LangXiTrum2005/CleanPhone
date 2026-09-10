package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class j6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f8219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f8220h;

    public j6(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskProcessNativeAdResponse", lVar);
        this.f8219g = jSONObject;
        this.f8220h = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayX = defpackage.e.x(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, this.f8219g);
        if (jSONArrayX.length() > 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Processing ad...");
            }
            this.f8297a.s0().a(new com.applovin.impl.sdk.nativeAd.b(JsonUtils.getJSONObject(jSONArrayX, 0, new JSONObject()), this.f8219g, this.f8220h, this.f8297a));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.k(this.f8298b, "No ads were returned from the server");
        }
        q7.a("native_native", MaxAdFormat.NATIVE, this.f8219g, this.f8297a);
        this.f8220h.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
