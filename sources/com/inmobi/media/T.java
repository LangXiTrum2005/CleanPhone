package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.p004ironsource.ko;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class T extends N9 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f23189A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f23190B;
    public String C;
    public Map D;
    public final Z y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final X9 f23191z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(String str, C3262ue c3262ue, String str2, Z adPlacement, X9 x9, InterfaceC3333z5 interfaceC3333z5, boolean z2) {
        super(ko.f25535b, str, c3262ue, false, interfaceC3333z5, com.smartdigimkt.o0.b.f37293e, z2);
        Intrinsics.f(adPlacement, "adPlacement");
        this.y = adPlacement;
        this.f23191z = x9;
        this.f23189A = "json";
        this.m = Uc.b();
        HashMap map = this.k;
        if (map != null) {
            map.putAll(U3.c());
            String str3 = C2994e1.f23538b;
            if (str3 != null) {
            }
            map.put("client-request-id", adPlacement.d());
            if (str2 != null) {
                map.put("u-appcache", str2);
            }
            map.put("sdk-flavor", "row");
        }
    }

    public static JSONObject a(String adType) throws JSONException {
        Intrinsics.f(adType, "adType");
        if (adType.equals("banner")) {
            return C3269v5.f24048c.a();
        }
        if (!"audio".equals(adType)) {
            return new JSONObject();
        }
        C3205r5 c3205r5 = C3205r5.f23952c;
        JSONObject jSONObject = new JSONObject();
        long j = c3205r5.f23148a / 1000;
        if (j != 0) {
            jSONObject.put("a-lastAudioPlayedTs", String.valueOf(j));
        }
        int i2 = c3205r5.f23149b;
        if (i2 > 0) {
            jSONObject.put("a-audioFreq", String.valueOf(i2));
        }
        Context contextD = Uc.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = C6.f22734b;
            int i3 = B6.a(contextD, "audio_pref_file").f22735a.getInt("user_mute_count", -1);
            if (i3 > 0) {
                jSONObject.put("a-umc", String.valueOf(i3));
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0263  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d7  */
    @Override // com.inmobi.media.N9
    public final void f() {
        boolean z2;
        String strValueOf;
        AppSetIdInfo appSetIdInfo;
        String strE;
        SignalsConfig.PublisherConfig publisher;
        Map map;
        super.f();
        HashMap map2 = this.k;
        if (map2 != null) {
            Ae aeA = AbstractC3342ze.a();
            String str = aeA.f22703a;
            if (str != null) {
            }
            map2.put("is-unifid-service-used", String.valueOf(aeA.f22704b));
            map2.put("format", this.f23189A);
            String str2 = this.f23190B;
            if (str2 != null) {
            }
            map2.putAll(X6.f23341a.b());
            HashMap map3 = new HashMap();
            String str3 = "DENIED";
            if (X6.c() && X6.e()) {
                str3 = "AUTHORISED";
            }
            Locale locale = Locale.ENGLISH;
            map3.put("loc-consent-status", com.applovin.impl.Z.p(locale, "ENGLISH", str3, locale, "this as java.lang.String).toLowerCase(locale)"));
            map2.putAll(map3);
            map2.putAll(AbstractC3043h2.a());
            map2.putAll(AbstractC3043h2.b());
            map2.putAll(AbstractC3043h2.c());
            X9 x9 = this.f23191z;
            if (x9 != null && (map = x9.f23346a) != null) {
                map2.putAll(map);
            }
            LinkedHashMap linkedHashMap = O2.f23027a;
            Config configA = M2.a("signals", this.m, null);
            SignalsConfig signalsConfig = configA instanceof SignalsConfig ? (SignalsConfig) configA : null;
            int i2 = 1;
            if (signalsConfig != null && (publisher = signalsConfig.getPublisher()) != null && publisher.getEnableMCO()) {
                Ya ya = Ya.f23374a;
                ya.getClass();
                JSONObject jSONObject = (JSONObject) Ya.d.getValue(ya, Ya.f23375b[0]);
                if (jSONObject.length() > 0) {
                    String string = jSONObject.toString();
                    Intrinsics.e(string, "toString(...)");
                    map2.put(com.ironsource.d9.h.l0, string);
                }
            }
            HashMap map4 = new HashMap();
            map4.putAll(F2.f22806a);
            map2.putAll(map4);
            String str4 = this.C;
            if (str4 != null) {
            }
            map2.put("m10n_context", "others".equals(this.y.j()) ? "M10N_CONTEXT_OTHER" : "M10N_CONTEXT_ACTIVITY");
            Map<String, String> mapF = this.y.f();
            if (mapF != null) {
                for (Map.Entry<String, String> entry : mapF.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!map2.containsKey(key)) {
                        map2.put(key, value);
                    }
                }
            }
            Map map5 = this.D;
            if (map5 != null) {
                map2.putAll(map5);
            }
            if (this.y.g() != Long.MIN_VALUE) {
                map2.put("im-plid", String.valueOf(this.y.g()));
            }
            map2.put("int-origin", this.y.h());
            LinkedHashMap linkedHashMap2 = O2.f23027a;
            Config configA2 = M2.a("signals", this.m, null);
            SignalsConfig signalsConfig2 = configA2 instanceof SignalsConfig ? (SignalsConfig) configA2 : null;
            JSONObject ext = signalsConfig2 != null ? signalsConfig2.getExt() : null;
            if (ext != null && ext.length() > 0) {
                String string2 = ext.toString();
                Intrinsics.e(string2, "toString(...)");
                map2.put("im-ext", string2);
            }
            String str5 = C2987db.f23526a;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            String str6 = C2987db.f23526a;
            if (str6 != null) {
                linkedHashMap3.put("u-nip", str6);
            } else {
                linkedHashMap3 = null;
            }
            if (linkedHashMap3 != null) {
                map2.putAll(linkedHashMap3);
            }
            L3 l3 = L3.f22938a;
            if (l3.y() && (strE = U3.e()) != null) {
                map2.put("d-device-gesture-margins", strE);
            }
            if (AbstractC3299x3.a(Uc.d()) != null) {
                Config configA3 = M2.a("ads", this.m, null);
                AdConfig adConfig = configA3 instanceof AdConfig ? (AdConfig) configA3 : null;
                if (adConfig == null || !adConfig.getCctEnabled()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            map2.put("cct-enabled", String.valueOf(z2));
            Lazy lazy = C3009f0.f23596c;
            if (!((CopyOnWriteArrayList) lazy.getX()).isEmpty()) {
                String string3 = new JSONArray((Collection) lazy.getX()).toString();
                Intrinsics.e(string3, "toString(...)");
                map2.put("u-r-crid", string3);
            }
            String str7 = this.f23190B;
            if (str7 != null && a(str7).length() > 0) {
                String string4 = a(str7).toString();
                Intrinsics.e(string4, "toString(...)");
                map2.put("audioObject", string4);
            }
            map2.putAll(AbstractC2936ab.a());
            if (Uc.d() != null) {
                Context contextD = Uc.d();
                SharedPreferences sharedPreferences = contextD != null ? contextD.getSharedPreferences(android.support.v4.media.a.r(new StringBuilder(), contextD != null ? contextD.getPackageName() : null, "_preferences"), 0) : null;
                if (sharedPreferences == null || !sharedPreferences.contains("IABGPP_HDR_GppString")) {
                    strValueOf = "";
                } else {
                    strValueOf = String.valueOf(sharedPreferences.getString("IABGPP_HDR_GppString", ""));
                }
            } else {
                strValueOf = "";
            }
            if (B2.a(strValueOf)) {
                map2.put("gpp", strValueOf);
            }
            Pair<String, String> pairI = l3.i();
            if (pairI != null) {
                map2.put(pairI.X, pairI.f43249Y);
            }
            Pair<String, String> pairK = l3.k();
            if (pairK != null) {
                map2.put(pairK.X, pairK.f43249Y);
            }
            Pair<String, String> pairC = l3.c();
            if (pairC != null) {
                map2.put(pairC.X, pairC.f43249Y);
            }
            Pair<String, String> pairF = l3.f();
            if (pairF != null) {
                map2.put(pairF.X, pairF.f43249Y);
            }
            Pair<String, String> pairT = l3.t();
            if (pairT != null) {
                map2.put(pairT.X, pairT.f43249Y);
            }
            Pair<String, String> pairD = l3.d();
            if (pairD != null) {
                map2.put(pairD.X, pairD.f43249Y);
            }
            Pair<String, String> pairU = l3.u();
            if (pairU != null) {
                map2.put(pairU.X, pairU.f43249Y);
            }
            Pair<String, String> pairG = l3.g();
            if (pairG != null) {
                map2.put(pairG.X, pairG.f43249Y);
            }
            Pair<String, String> pairH = l3.h();
            if (pairH != null) {
                map2.put(pairH.X, pairH.f43249Y);
            }
            Pair<String, String> pairB = l3.b();
            if (pairB != null) {
                map2.put(pairB.X, pairB.f43249Y);
            }
            Pair<String, String> pairJ = l3.j();
            if (pairJ != null) {
                map2.put(pairJ.X, pairJ.f43249Y);
            }
            if (AbstractC3026g1.a() && (appSetIdInfo = AbstractC3026g1.f23620a) != null) {
                String id = appSetIdInfo.getId();
                Intrinsics.e(id, "getId(...)");
                map2.put("d-app-set-id", id);
            }
            if (C3044h3.d()) {
                map2.put("ik", C3044h3.g);
                map2.put("c_data", C3044h3.c());
                StringBuilder sb = new StringBuilder("");
                Context contextD2 = Uc.d();
                if (contextD2 != null) {
                    ConcurrentHashMap concurrentHashMap = C6.f22734b;
                    i2 = B6.a(contextD2, "c_data_store").f22735a.getInt("akv", 1);
                }
                sb.append(i2);
                map2.put("aKV", sb.toString());
            }
            JSONObject jSONObjectB = Zc.f23411a.b();
            if (jSONObjectB.length() > 0) {
                String string5 = jSONObjectB.toString();
                Intrinsics.e(string5, "toString(...)");
                map2.put("sData", string5);
            }
        }
    }
}
