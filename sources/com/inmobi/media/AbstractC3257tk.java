package com.inmobi.media;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.AbstractC3257tk;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.download.Command;
import duvetyn.wireman;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Charsets;
import patroclinal.formularize;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3257tk {
    public static String a(Map map, String str) throws JSONException {
        Map map2;
        String string;
        C3097n9 c3097n9A = Jh.a("getToken", "AB");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            String str2 = (String) map.get("tp");
            if (!TextUtils.isEmpty(str2)) {
                Ki.b = str2;
            }
            String str3 = (String) map.get("tp-v");
            if (!TextUtils.isEmpty(str3)) {
                Ki.a = str3;
            }
        }
        a();
        if (!Ji.d()) {
            if (c3097n9A != null) {
                Intrinsics.checkNotNullExpressionValue("com.inmobi.media.tk", "LOG_TAG");
                c3097n9A.b("com.inmobi.media.tk", "InMobi SDK is not initialised. Cannot fetch a token.");
            }
            a(90, jCurrentTimeMillis, c3097n9A);
            return null;
        }
        Context context = Ji.a;
        C2903ff c2903ff = context != null ? new C2903ff(context, c3097n9A) : null;
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        C2968i4 c2968i5 = Y3.a;
        if (((RootConfig) c2968i5.a(RootConfig.class)).getMonetizationDisabled()) {
            a(2012, jCurrentTimeMillis, c3097n9A);
            if (c3097n9A != null) {
                Intrinsics.checkNotNullExpressionValue("com.inmobi.media.tk", "LOG_TAG");
                c3097n9A.b("com.inmobi.media.tk", "Monetization disabled. cannot provide token");
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        Ak uidMap = new Ak(((AdConfig) c2968i5.a(AdConfig.class)).getIncludeIds());
        C3282uk metaData = new C3282uk(str, map);
        C2852df c2852dfA = c2903ff != null ? c2903ff.a() : null;
        Intrinsics.checkNotNullParameter(uidMap, "uidMap");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter("https://www.123.com", "url");
        Intrinsics.checkNotNullParameter("https://www.123.com", "url");
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) c2968i5.a(SignalsConfig.class);
        LinkedHashMap payload = new LinkedHashMap();
        String strA = AbstractC3345x8.a();
        if (strA != null) {
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        Pk pkA = Ok.a();
        String str4 = pkA.a;
        if (str4 != null) {
        }
        payload.put("is-unifid-service-used", String.valueOf(pkA.b));
        AbstractC3321w9.d(payload);
        payload.put("d-media-volume", String.valueOf(C3342x5.a.a(Ji.a, false)));
        payload.putAll(uidMap.a());
        String str5 = metaData.a;
        if (str5 != null) {
        }
        HashMap map3 = new HashMap();
        map3.putAll(X3.a);
        payload.putAll(map3);
        Map map4 = metaData.b;
        Intrinsics.checkNotNullParameter(payload, "<this>");
        if (map4 != null) {
            for (Map.Entry entry : map4.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!payload.containsKey(str6)) {
                    payload.put(str6, str7);
                }
            }
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        C2968i4 c2968i6 = Y3.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) Y3.a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String string2 = ext.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            payload.put("im-ext", string2);
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        C3342x5 c3342x5 = C3342x5.a;
        c3342x5.getClass();
        if (C3342x5.q()) {
            if (J5.e) {
                string = null;
            } else {
                string = J5.c;
                if (string == null) {
                    Context context2 = Ji.a;
                    if (context2 == null) {
                        string = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Ea.b;
                        Ea eaA = Da.a(context2, "display_info_store");
                        Intrinsics.checkNotNullParameter("gesture_margin", com.ironsource.X3.i.W);
                        string = eaA.a.getString("gesture_margin", null);
                    }
                    J5.c = string;
                }
            }
            if (string != null) {
                payload.put("d-device-gesture-margins", string);
            }
        }
        AbstractC3321w9.c(payload);
        AbstractC3321w9.e(payload);
        AbstractC3321w9.a(payload);
        AbstractC3321w9.b(payload);
        payload.put("h-user-agent", Ji.c());
        Intrinsics.checkNotNullParameter(payload, "<this>");
        String str8 = Vg.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str9 = Vg.a;
        if (str9 != null) {
            linkedHashMap.put("u-nip", str9);
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            payload.putAll(linkedHashMap);
        }
        payload.putAll(Tg.a());
        payload.putAll(J5.c());
        payload.putAll(O2.a());
        if (c2852dfA != null && (map2 = c2852dfA.a) != null) {
            payload.putAll(map2);
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        taiyuan taiyuanVar = E0.c;
        if (!((CopyOnWriteArrayList) taiyuanVar.getValue()).isEmpty()) {
            String string3 = new JSONArray((Collection) taiyuanVar.getValue()).toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            payload.put("u-r-crid", string3);
        }
        JSONObject jSONObjectA = W8.c.a();
        if (jSONObjectA.length() > 0) {
            String string4 = jSONObjectA.toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            payload.put("audioObject", string4);
        }
        AppSetIdInfo appSetIdInfo = B1.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        B1.a(linkedHashMap2);
        payload.putAll(linkedHashMap2);
        if (signalsConfig.getPublisher().getEnableAB()) {
            Intrinsics.checkNotNullParameter(payload, "<this>");
            JSONObject jSONObjectE = Og.a.e();
            if (jSONObjectE.length() > 0) {
                String string5 = jSONObjectE.toString();
                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                payload.put(com.ironsource.X3.i.l0, string5);
            }
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        payload.put("u-appsecure", String.valueOf((int) A1.f));
        Intrinsics.checkNotNullParameter(payload, "<this>");
        if (K4.e() && F3.a(K4.d())) {
            payload.put("ik", K4.f);
            payload.put("c_data", K4.d());
            Context context3 = Ji.a;
            int i = 1;
            if (context3 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.b;
                Ea eaA2 = Da.a(context3, "c_data_store");
                Intrinsics.checkNotNullParameter("akv", com.ironsource.X3.i.W);
                i = eaA2.a.getInt("akv", 1);
            }
            payload.put("aKV", String.valueOf(i));
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string6 = jSONObjectB.toString();
            Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
            payload.put("consentObject", string6);
        }
        Intrinsics.checkNotNullParameter(payload, "<this>");
        payload.putAll(A1.e);
        payload.putAll(c3342x5.a(false));
        payload.putAll(AbstractC3395z8.a());
        Intrinsics.checkNotNullParameter(payload, "mHttpHeaders");
        payload.put(Command.HTTP_HEADER_USER_AGENT, Ji.c());
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!W6.a()) {
            if (c3097n9A != null) {
                Intrinsics.checkNotNullExpressionValue("com.inmobi.media.tk", "LOG_TAG");
                c3097n9A.b("com.inmobi.media.tk", "get Signals failed - GDPR Compliance");
            }
            a(2141, jCurrentTimeMillis, c3097n9A);
            return null;
        }
        a(jCurrentTimeMillis, c3097n9A);
        if (c3097n9A != null) {
            Intrinsics.checkNotNullExpressionValue("com.inmobi.media.tk", "LOG_TAG");
            c3097n9A.a("com.inmobi.media.tk", "get signals success");
        }
        byte[] bArrEncode = Base64.encode(new wireman().writeUtf8(F3.a(payload)).readByteArray(), 8);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
        return new String(bArrEncode, Charsets.UTF_8);
    }

    public static final void b() {
        HashMap mapApical = seminary.apical(formularize.attabal("networkType", C3342x5.m()), formularize.attabal("plType", "AB"));
        Wj wj = Wj.a;
        Wj.b("AdGetSignalsCalled", mapApical, EnumC2779ak.SDK);
    }

    public static void a(final int i, final long j, C3097n9 c3097n9) {
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("com.inmobi.media.tk", "LOG_TAG");
            c3097n9.c("com.inmobi.media.tk", "submitAdGetSignalsFailed - errorCode - " + i + ", startTime - " + j);
        }
        Runnable runnable = new Runnable() { // from class: adsuki.profanatory
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3257tk.a(j, i);
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
        if (c3097n9 != null) {
            c3097n9.a();
        }
    }

    public static final void a(long j, int i) {
        HashMap mapApical = seminary.apical(formularize.attabal("latency", Long.valueOf(System.currentTimeMillis() - j)), formularize.attabal("networkType", C3342x5.m()), formularize.attabal(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)), formularize.attabal("plType", "AB"));
        Wj wj = Wj.a;
        Wj.b("AdGetSignalsFailed", mapApical, EnumC2779ak.SDK);
    }

    public static void a(final long j, C3097n9 c3097n9) {
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("com.inmobi.media.tk", "LOG_TAG");
            c3097n9.c("com.inmobi.media.tk", "submitAdGetSignalsSucceeded - startTime - " + j);
        }
        Runnable runnable = new Runnable() { // from class: adsuki.eddy
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3257tk.a(j);
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
        if (c3097n9 != null) {
            c3097n9.a();
        }
    }

    public static final void a(long j) {
        HashMap mapApical = seminary.apical(formularize.attabal("latency", Long.valueOf(System.currentTimeMillis() - j)), formularize.attabal("networkType", C3342x5.m()), formularize.attabal("plType", "AB"));
        Wj wj = Wj.a;
        Wj.b("AdGetSignalsSucceeded", mapApical, EnumC2779ak.SDK);
    }

    public static void a() {
        Runnable runnable = new Runnable() { // from class: adsuki.nhl
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3257tk.b();
            }
        };
        Context context = Ji.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.g.submit(runnable);
    }
}
