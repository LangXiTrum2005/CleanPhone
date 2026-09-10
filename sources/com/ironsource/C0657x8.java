package com.ironsource;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.x8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0657x8 {
    public static C0603u8 a(Context context, String str, String str2, String str3, Map<String, String> map) throws Exception {
        C0603u8.a aVar = new C0603u8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.d(map.get("sessionid"));
        }
        aVar.a(context);
        aVar.b(str3);
        return aVar.e(str).a(str2).a();
    }

    public static D5 a(JSONObject jSONObject) {
        return new D5.a(jSONObject.optString(B5.f25704r)).b().b(jSONObject.optBoolean("enabled")).a(new C0621v8()).a(a()).a(false).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", B5.M));
        arrayList.add(new Pair<>(B5.N, B5.O));
        return arrayList;
    }

    public static boolean a(T4 t10) {
        if (t10 == null || t10.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(t10.g().get("inAppBidding"));
    }

    public static C0514p8.e a(T4 t10, C0514p8.e eVar) {
        if (t10 == null || t10.g() == null || t10.g().get("rewarded") == null) {
            return eVar;
        }
        if (Boolean.parseBoolean(t10.g().get("rewarded"))) {
            return C0514p8.e.RewardedVideo;
        }
        return C0514p8.e.Interstitial;
    }
}
