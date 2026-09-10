package com.ironsource;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class W9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f27567a = "ManRewInst_";

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f27567a + jSONObject.optString("name");
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String a(K9 k10) {
        if (k10.i()) {
            return C0514p8.e.Banner.toString();
        }
        if (k10.n()) {
            return C0514p8.e.RewardedVideo.toString();
        }
        return C0514p8.e.Interstitial.toString();
    }
}
