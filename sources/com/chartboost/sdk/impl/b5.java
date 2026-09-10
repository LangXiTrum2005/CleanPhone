package com.chartboost.sdk.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b5 implements tg {
    @Override // com.chartboost.sdk.impl.tg
    public JSONObject a() throws JSONException {
        String strE = w3.f15454b.e();
        String strB = t6.f15176a.b();
        String strM = androidx.media3.extractor.text.ttml.a.m("toString(...)");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", strE);
        jSONObject.put("app_version", strB);
        jSONObject.put("load-id", strM);
        jSONObject.put("load_id", strM);
        jSONObject.put("sdk", "Chartboost-Android-SDK");
        jSONObject.put(com.smartdigimkt.b0.a.s1, "9.10.2");
        return jSONObject;
    }
}
