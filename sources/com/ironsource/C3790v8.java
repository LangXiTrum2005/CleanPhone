package com.ironsource;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3790v8 {
    public static C3739s8 a(Context context, String str, String str2, String str3, Map<String, String> map) throws Exception {
        C3739s8.a aVar = new C3739s8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.d(map.get("sessionid"));
        }
        aVar.a(context);
        aVar.b(str3);
        return aVar.e(str).a(str2).a();
    }

    public static C5 a(JSONObject jSONObject) {
        return new C5.a(jSONObject.optString(A5.r)).b().b(jSONObject.optBoolean("enabled")).a(new C3756t8()).a(a()).a(false).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", A5.M));
        arrayList.add(new Pair<>(A5.N, A5.O));
        return arrayList;
    }

    public static boolean a(S4 s4) {
        if (s4 == null || s4.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(s4.g().get("inAppBidding"));
    }

    public static C3653n8.e a(S4 s4, C3653n8.e eVar) {
        if (s4 == null || s4.g() == null || s4.g().get("rewarded") == null) {
            return eVar;
        }
        if (Boolean.parseBoolean(s4.g().get("rewarded"))) {
            return C3653n8.e.RewardedVideo;
        }
        return C3653n8.e.Interstitial;
    }
}
