package com.android.billingclient.api;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzct {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f16554attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f16555saneness;

    public zzct(JSONObject jSONObject) throws JSONException {
        this.f16554attabal = jSONObject.getString("rentalPeriod");
        String strOptString = jSONObject.optString("rentalExpirationPeriod");
        this.f16555saneness = true == strOptString.isEmpty() ? null : strOptString;
    }
}
