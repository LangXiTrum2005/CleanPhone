package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.mbridge.msdk.foundation.download.Command;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3138p0 extends AbstractC3321w9 {
    public final Ak b;
    public final C3088n0 c;
    public final C3158pk d;
    public final C2852df e;
    public final C3097n9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3138p0(String str, Ak ak, C3088n0 metaData, C3158pk timeoutConfig, C2852df c2852df, C3097n9 c3097n9, boolean z) {
        super(str == null ? AdConfig.DEFAULT_AD_SERVER_URL : str);
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.b = ak;
        this.c = metaData;
        this.d = timeoutConfig;
        this.e = c2852df;
        this.f = c3097n9;
    }

    public final Le a() throws JSONException {
        String string;
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = Ji.c;
        if (str == null) {
            throw new IllegalArgumentException("Account Id cannot be null");
        }
        linkedHashMap.put("account_id", str);
        linkedHashMap.putAll(J5.c());
        String str2 = A1.b;
        if (str2 != null) {
        }
        linkedHashMap.put("client-request-id", this.c.a);
        linkedHashMap.put("sdk-flavor", "row");
        this.c.getClass();
        linkedHashMap.put("format", "unifiedSdkJson");
        String str3 = this.c.e;
        if (str3 != null) {
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Pk pkA = Ok.a();
        String str4 = pkA.a;
        if (str4 != null) {
        }
        linkedHashMap.put("is-unifid-service-used", String.valueOf(pkA.b));
        long j = this.c.c;
        if (j != Long.MIN_VALUE) {
            linkedHashMap.put("im-plid", String.valueOf(j));
        }
        AbstractC3321w9.d(linkedHashMap);
        linkedHashMap.putAll(O2.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(O2.b());
        linkedHashMap.putAll(O2.c());
        C2852df c2852df = this.e;
        if (c2852df != null && (map = c2852df.a) != null) {
            linkedHashMap.putAll(map);
        }
        HashMap map2 = new HashMap();
        map2.putAll(X3.a);
        linkedHashMap.putAll(map2);
        String str5 = this.c.g;
        if (str5 != null) {
        }
        Map map3 = this.c.f;
        if (map3 != null) {
            linkedHashMap.putAll(map3);
        }
        this.c.getClass();
        linkedHashMap.put("int-origin", "im");
        AbstractC3321w9.c(linkedHashMap);
        AbstractC3321w9.e(linkedHashMap);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        taiyuan taiyuanVar = E0.c;
        if (!((CopyOnWriteArrayList) taiyuanVar.getValue()).isEmpty()) {
            String string2 = new JSONArray((Collection) taiyuanVar.getValue()).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            linkedHashMap.put("u-r-crid", string2);
        }
        linkedHashMap.put("m10n_context", Intrinsics.wireman("others", this.c.d) ? "M10N_CONTEXT_OTHER" : "M10N_CONTEXT_ACTIVITY");
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C3342x5.a.getClass();
        if (C3342x5.q()) {
            if (J5.e) {
                string = null;
            } else {
                string = J5.c;
                if (string == null) {
                    Context context = Ji.a;
                    if (context == null) {
                        string = null;
                    } else {
                        ConcurrentHashMap concurrentHashMap = Ea.b;
                        Ea eaA = Da.a(context, "display_info_store");
                        Intrinsics.checkNotNullParameter("gesture_margin", com.ironsource.X3.i.W);
                        string = eaA.a.getString("gesture_margin", null);
                    }
                    J5.c = string;
                }
            }
            if (string != null) {
                linkedHashMap.put("d-device-gesture-margins", string);
            }
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        C2968i4 c2968i4 = Y3.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        JSONObject ext = ((SignalsConfig) Y3.a.a(SignalsConfig.class)).getExt();
        if (ext != null && ext.length() > 0) {
            String string3 = ext.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            linkedHashMap.put("im-ext", string3);
        }
        Map map4 = this.c.b;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (map4 != null) {
            for (Map.Entry entry : map4.entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                if (!linkedHashMap.containsKey(str6)) {
                    linkedHashMap.put(str6, str7);
                }
            }
        }
        AbstractC3321w9.a(linkedHashMap);
        C3088n0 metaData = this.c;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Intrinsics.checkNotNullParameter(metaData, "metaData");
        String str8 = metaData.e;
        if (str8 != null && AbstractC3321w9.a(str8).length() > 0) {
            String string4 = AbstractC3321w9.a(str8).toString();
            Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
            linkedHashMap.put("audioObject", string4);
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        String str9 = Vg.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str10 = Vg.a;
        if (str10 != null) {
            linkedHashMap2.put("u-nip", str10);
        } else {
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        linkedHashMap.putAll(Tg.a());
        AppSetIdInfo appSetIdInfo = B1.a;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        B1.a(linkedHashMap3);
        linkedHashMap.putAll(linkedHashMap3);
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (K4.e() && F3.a(K4.d())) {
            linkedHashMap.put("ik", K4.f);
            linkedHashMap.put("c_data", K4.d());
            Context context2 = Ji.a;
            int i = 1;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = Ea.b;
                Ea eaA2 = Da.a(context2, "c_data_store");
                Intrinsics.checkNotNullParameter("akv", com.ironsource.X3.i.W);
                i = eaA2.a.getInt("akv", 1);
            }
            linkedHashMap.put("aKV", String.valueOf(i));
        }
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put("u-appsecure", String.valueOf((int) A1.f));
        Ak ak = this.b;
        HashMap mapA = ak != null ? ak.a() : null;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (mapA != null) {
            for (Map.Entry entry2 : mapA.entrySet()) {
                linkedHashMap.put((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        C2968i4 c2968i5 = Y3.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        if (((SignalsConfig) Y3.a.a(SignalsConfig.class)).getPublisher().getEnableMCO()) {
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            JSONObject jSONObjectE = Og.a.e();
            if (jSONObjectE.length() > 0) {
                String string5 = jSONObjectE.toString();
                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                linkedHashMap.put(com.ironsource.X3.i.l0, string5);
            }
        }
        AbstractC3321w9.b(linkedHashMap);
        boolean z = this.c.h;
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.putAll(A1.e);
        linkedHashMap.putAll(C3342x5.a.a(z));
        linkedHashMap.putAll(AbstractC3395z8.a());
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        JSONObject jSONObjectB = W6.b();
        if (jSONObjectB != null) {
            String string6 = jSONObjectB.toString();
            Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
            linkedHashMap.put("consentObject", string6);
        }
        this.c.getClass();
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            c3097n9.c("AdNetworkRequest", linkedHashMap.toString());
        }
        String str11 = this.a;
        LinkedHashMap mHttpHeaders = new LinkedHashMap();
        Intrinsics.checkNotNullParameter(mHttpHeaders, "mHttpHeaders");
        mHttpHeaders.put(Command.HTTP_HEADER_USER_AGENT, Ji.c());
        return new Le(str11, mHttpHeaders, this.d, new Y6(linkedHashMap), null, 48);
    }
}
