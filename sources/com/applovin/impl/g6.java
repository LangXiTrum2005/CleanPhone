package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class g6 extends k5 implements o2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONObject f8024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final u f8025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f8026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinAdLoadListener f8027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f8028k;

    public g6(JSONObject jSONObject, u uVar, long j10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        this(jSONObject, uVar, j10, false, appLovinAdLoadListener, lVar);
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Starting task for AppLovin ad...");
            }
            this.f8297a.s0().a(new m6(jSONObject, this.f8024g, this.f8026i, this, this.f8297a));
            return;
        }
        if ("vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Starting task for VAST ad...");
            }
            this.f8297a.s0().a(k6.a(jSONObject, this.f8024g, this, this.f8297a));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.b(this.f8298b, "Unable to process ad of unknown type: " + string);
        }
        failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, defpackage.e.n("Unknown ad type: ", string)));
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8027j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.f8028k || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.f8297a.g().a(f2.B, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, ""));
    }

    @Override // com.applovin.impl.o2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8027j;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof o2) {
            ((o2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.f8028k) {
            return;
        }
        this.f8297a.g().a(f2.C, this.f8025h, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArrayX = defpackage.e.x(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, this.f8024g);
        if (jSONArrayX.length() > 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArrayX, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.k(this.f8298b, "No ads were returned from the server");
            }
            q7.a(this.f8025h.e(), this.f8025h.d(), this.f8024g, this.f8297a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }

    public g6(JSONObject jSONObject, u uVar, long j10, boolean z10, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskProcessAdResponse", lVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f8024g = jSONObject;
        this.f8025h = uVar;
        this.f8026i = j10;
        this.f8027j = appLovinAdLoadListener;
        this.f8028k = z10;
    }
}
