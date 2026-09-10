package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class rh {
    public final String a(JSONObject jSONObject) {
        String strOptString = jSONObject != null ? jSONObject.optString("url", "") : null;
        return strOptString == null ? "" : strOptString;
    }

    public final f3 b(JSONObject jSONObject) {
        return new f3(a(jSONObject), c(jSONObject));
    }

    public final Boolean c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return t2.a(jSONObject, "shouldDismiss");
        }
        return null;
    }
}
