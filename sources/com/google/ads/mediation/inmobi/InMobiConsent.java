package com.google.ads.mediation.inmobi;

import com.inmobi.sdk.InMobiSdk;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiConsent {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static JSONObject f18879attabal = new JSONObject();

    public static JSONObject attabal() {
        return f18879attabal;
    }

    public static void updateGDPRConsent(JSONObject jSONObject) {
        if (InMobiSdk.isSDKInitialized()) {
            InMobiSdk.updateGDPRConsent(jSONObject);
        }
        f18879attabal = jSONObject;
    }
}
