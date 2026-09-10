package com.chartboost.sdk.impl;

import com.iab.omid.library.chartboost.Omid;
import com.iab.omid.library.chartboost.adsession.Partner;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class cd implements tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f13594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final id f13595b;

    public cd(AtomicReference sdkConfigRef, id openMeasurementManager) {
        Intrinsics.f(sdkConfigRef, "sdkConfigRef");
        Intrinsics.f(openMeasurementManager, "openMeasurementManager");
        this.f13594a = sdkConfigRef;
        this.f13595b = openMeasurementManager;
    }

    @Override // com.chartboost.sdk.impl.tg
    public JSONObject a() throws JSONException {
        qf qfVar = (qf) this.f13594a.get();
        if (qfVar == null) {
            return new JSONObject();
        }
        dd ddVarB = qfVar.b();
        if (ddVarB == null || !ddVarB.g()) {
            return new JSONObject();
        }
        Partner partnerC = this.f13595b.c();
        JSONObject jSONObject = new JSONObject();
        if (partnerC != null) {
            jSONObject.put("omidpn", partnerC.getName());
            jSONObject.put("omidpv", partnerC.getVersion());
        }
        jSONObject.put("omidv", Omid.getVersion());
        return jSONObject;
    }
}
