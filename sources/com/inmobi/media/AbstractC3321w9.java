package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.location.Location;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kurbash.formularize;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3321w9 {
    public final String a;

    public AbstractC3321w9(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    public static void a(LinkedHashMap linkedHashMap) {
        boolean z;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (AbstractC2919g5.a(Ji.a) != null) {
            C2968i4 c2968i4 = Y3.a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            if (((AdConfig) Y3.a.a(AdConfig.class)).getCctEnabled()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        linkedHashMap.put("cct-enabled", String.valueOf(z));
    }

    public static void b(LinkedHashMap linkedHashMap) {
        Pair pair;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C3342x5.a.getClass();
        Pair pairH = C3342x5.h();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairH != null) {
            linkedHashMap.put(pairH.getFirst(), pairH.getSecond());
        }
        Pair pairJ = C3342x5.j();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairJ != null) {
            linkedHashMap.put(pairJ.getFirst(), pairJ.getSecond());
        }
        Pair pair2 = C3342x5.i;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair2 != null) {
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        Context context = Ji.a;
        Pair pair3 = null;
        if (context == null) {
            pair = null;
        } else {
            Intent intentA = F3.a(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            pair = new Pair("d-bat-chrg", (intentA != null ? intentA.getIntExtra("status", -1) : -1) == 2 ? "1" : "0");
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair != null) {
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        Pair pairO = C3342x5.o();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairO != null) {
            linkedHashMap.put(pairO.getFirst(), pairO.getSecond());
        }
        Pair pairE = C3342x5.e();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairE != null) {
            linkedHashMap.put(pairE.getFirst(), pairE.getSecond());
        }
        Context context2 = Ji.a;
        if (context2 != null) {
            Intent intentA2 = F3.a(context2, (BroadcastReceiver) null, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            pair3 = (intentA2 == null || intentA2.getIntExtra("state", 0) != 1) ? new Pair("d-w-h", "0") : new Pair("d-w-h", "1");
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pair3 != null) {
            linkedHashMap.put(pair3.getFirst(), pair3.getSecond());
        }
        Pair pairF = C3342x5.f();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairF != null) {
            linkedHashMap.put(pairF.getFirst(), pairF.getSecond());
        }
        Pair pairG = C3342x5.g();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairG != null) {
            linkedHashMap.put(pairG.getFirst(), pairG.getSecond());
        }
        Pair pairD = C3342x5.d();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairD != null) {
            linkedHashMap.put(pairD.getFirst(), pairD.getSecond());
        }
        Pair pairI = C3342x5.i();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (pairI != null) {
            linkedHashMap.put(pairI.getFirst(), pairI.getSecond());
        }
    }

    public static void c(LinkedHashMap linkedHashMap) {
        SharedPreferences sharedPreferencesA;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        String strValueOf = "";
        if (Ji.a != null && (sharedPreferencesA = Ri.a()) != null && sharedPreferencesA.contains("IABGPP_HDR_GppString")) {
            strValueOf = String.valueOf(sharedPreferencesA.getString("IABGPP_HDR_GppString", ""));
        }
        if (F3.a(strValueOf)) {
            linkedHashMap.put("gpp", strValueOf);
        }
    }

    public static void d(LinkedHashMap linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C3074mb c3074mb = C3074mb.a;
        HashMap map = new HashMap();
        C3180qh c3180qh = Yi.a;
        Location locationA = (Ji.b() == null || Yi.a().getLocationEnabled()) ? C3074mb.a() : null;
        HashMap mapA = locationA != null ? C3074mb.a(locationA, true, Kf.a(Ji.a, "android.permission.ACCESS_FINE_LOCATION") ? C3074mb.a(1, 3) : null) : C3074mb.a(Tg.b(), false, null);
        for (Map.Entry entry : mapA.entrySet()) {
            map.put((String) entry.getKey(), entry.getValue().toString());
        }
        linkedHashMap.putAll(map);
        C3074mb c3074mb2 = C3074mb.a;
        HashMap map2 = new HashMap();
        String str = "DENIED";
        if (C3074mb.d() && C3074mb.e()) {
            str = "AUTHORISED";
        }
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = str.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        map2.put("loc-consent-status", lowerCase);
        linkedHashMap.putAll(map2);
    }

    public static void e(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Qi qi = Qi.a;
        qi.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (Qi.a(0)) {
            linkedHashMap2.put("st", Long.valueOf(Qi.f));
        }
        if (Qi.a(5)) {
            I1 i1 = Qi.j;
            formularize[] formularizeVarArr = Qi.b;
            if (((Number) i1.getValue(qi, formularizeVarArr[0])).intValue() != -1) {
                linkedHashMap2.put("cnt", Integer.valueOf(((Number) i1.getValue(qi, formularizeVarArr[0])).intValue()));
            }
        }
        if (Qi.a(6)) {
            I1 i2 = Qi.k;
            formularize[] formularizeVarArr2 = Qi.b;
            if (((Number) i2.getValue(qi, formularizeVarArr2[1])).intValue() != -1) {
                linkedHashMap2.put("u-ret", Integer.valueOf(((Number) i2.getValue(qi, formularizeVarArr2[1])).intValue()));
            }
        }
        List listBasify = CollectionsKt.basify(Qi.g);
        if (!Qi.a(1)) {
            listBasify.set(0, -1);
        }
        if (!Qi.a(2)) {
            listBasify.set(1, -1);
        }
        if (!Qi.a(3)) {
            listBasify.set(2, -1);
        }
        if (!Qi.a(4)) {
            listBasify.set(3, -1);
        }
        if (!(listBasify instanceof Collection) || !listBasify.isEmpty()) {
            Iterator it = listBasify.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() != -1) {
                    linkedHashMap2.put("dep", listBasify);
                    break;
                }
            }
        }
        try {
            jSONObject = new JSONObject(linkedHashMap2);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        if (jSONObject.length() > 0) {
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            linkedHashMap.put("sData", string);
        }
    }

    public static JSONObject a(String str) throws JSONException {
        if (Intrinsics.wireman(str, "banner")) {
            return W8.c.a();
        }
        if (Intrinsics.wireman("audio", str)) {
            T8 t8 = T8.c;
            JSONObject jSONObject = new JSONObject();
            long j = t8.a / 1000;
            if (j != 0) {
                jSONObject.put("a-lastAudioPlayedTs", String.valueOf(j));
            }
            int i = t8.b;
            if (i > 0) {
                jSONObject.put("a-audioFreq", String.valueOf(i));
            }
            Context context = Ji.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.b;
                Ea eaA = Da.a(context, "audio_pref_file");
                Intrinsics.checkNotNullParameter("user_mute_count", com.ironsource.X3.i.W);
                int i2 = eaA.a.getInt("user_mute_count", -1);
                if (i2 > 0) {
                    jSONObject.put("a-umc", String.valueOf(i2));
                }
            }
            return jSONObject;
        }
        return new JSONObject();
    }
}
