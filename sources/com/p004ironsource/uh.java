package com.p004ironsource;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class uh {
    public static fc a(JSONObject jSONObject) {
        return new fc.a(jSONObject.optString(dc.r)).b().b(jSONObject.optBoolean("enabled")).a(new sh()).a(a()).a(false).a();
    }

    public static mh.e a(va vaVar, mh.e eVar) {
        if (vaVar == null || vaVar.g() == null || vaVar.g().get("rewarded") == null) {
            return eVar;
        }
        return Boolean.parseBoolean(vaVar.g().get("rewarded")) ? mh.e.RewardedVideo : mh.e.Interstitial;
    }

    public static rh a(Context context, String str, String str2, Map<String, String> map) throws Exception {
        rh.b bVar = new rh.b();
        if (map != null && map.containsKey("sessionid")) {
            bVar.c(map.get("sessionid"));
        }
        bVar.a(context);
        return bVar.d(str).a(str2).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", "application/json"));
        arrayList.add(new Pair<>(dc.M, "utf-8"));
        return arrayList;
    }

    public static boolean a(va vaVar) {
        if (vaVar == null || vaVar.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(vaVar.g().get("inAppBidding"));
    }
}
