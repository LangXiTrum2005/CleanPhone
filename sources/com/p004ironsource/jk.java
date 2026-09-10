package com.p004ironsource;

import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class jk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f25431a = "ManRewInst_";

    public static String a() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static String b() {
        return UUID.randomUUID().toString();
    }

    public static String a(zj zjVar) {
        mh.e eVar;
        if (zjVar.i()) {
            eVar = mh.e.Banner;
        } else {
            eVar = zjVar.n() ? mh.e.RewardedVideo : mh.e.Interstitial;
        }
        return eVar.toString();
    }

    public static String a(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("rewarded")) {
            return jSONObject.optString("name");
        }
        return f25431a + jSONObject.optString("name");
    }
}
