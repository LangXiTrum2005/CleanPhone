package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C0239a2;
import com.ironsource.C0375hc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class x5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c3 f9992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONArray f9993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f9994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.mediation.ads.a.InterfaceC0010a f9995j;

    public x5(c3 c3Var, JSONArray jSONArray, Context context, com.applovin.impl.sdk.l lVar, com.applovin.impl.mediation.ads.a.InterfaceC0010a interfaceC0010a) {
        super("TaskFetchMediatedAd", lVar, c3Var.b());
        this.f9992g = c3Var;
        this.f9993h = jSONArray;
        this.f9994i = context;
        this.f9995j = interfaceC0010a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            s0.c(jSONObject, this.f8297a);
            s0.b(jSONObject, this.f8297a);
            s0.a(jSONObject, this.f8297a);
            n3.f(jSONObject, this.f8297a);
            n3.d(jSONObject, this.f8297a);
            n3.e(jSONObject, this.f8297a);
            n3.g(jSONObject, this.f8297a);
            this.f8297a.n().a();
            MaxAdFormat maxAdFormatA = this.f9992g.a();
            MaxAdFormat fromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (maxAdFormatA == fromString) {
                a(jSONObject);
                return;
            }
            String strB = this.f9992g.b();
            if (fromString == null) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.b(this.f8298b, "Mediated ad response is missing the ad format field for ad unit " + strB);
                }
                if (jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    HashMap map = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", map);
                    CollectionUtils.putStringIfValid("ad_unit_id", strB, map);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), map);
                    this.f8297a.E().a(f2.f7857i1, this.f8298b, map);
                }
                this.f9995j.onAdLoadFailed(strB, MaxAdapterError.NO_FILL);
                return;
            }
            String label = fromString.getLabel();
            String label2 = maxAdFormatA.getLabel();
            String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + strB + ") is assigned to the correct ad format.";
            if (q7.a(maxAdFormatA, fromString)) {
                com.applovin.impl.sdk.p.j(this.f8298b, str);
                a(jSONObject);
                return;
            }
            m1.a(str, new Object[0]);
            com.applovin.impl.sdk.p.h(this.f8298b, str);
            this.f9995j.onAdLoadFailed(strB, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("ad_unit_id", strB);
            CollectionUtils.putStringIfValid("name", label2, mapHashMap);
            CollectionUtils.putStringIfValid("details", label, mapHashMap);
            this.f8297a.E().a(f2.f7836a1, "incompatible_ad_format", mapHashMap);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Unable to process mediated ad response for ad unit " + this.f9992g.b(), th2);
            }
            throw new RuntimeException("Unable to process ad: " + th2);
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f8297a.Z().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !q7.h(com.applovin.impl.sdk.l.p())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) {
        if (((Boolean) this.f8297a.a(z4.R4)).booleanValue()) {
            w3 w3VarA0 = this.f8297a.a0();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            u3 u3Var = u3.f9823f;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) w3VarA0.a(u3Var, v3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) w3VarA0.a(u3Var, v3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) w3VarA0.a(u3.f9824g, v3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return n3.a(this.f8297a);
    }

    private String f() {
        return n3.b(this.f8297a);
    }

    private JSONObject g() throws JSONException {
        Map mapA = this.f8297a.B().a((Map) null, false, true);
        mapA.putAll(this.f9992g.c());
        JSONObject jSONObject = new JSONObject(mapA);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private Map h() {
        HashMap map = new HashMap(4);
        map.put("AppLovin-Ad-Unit-Id", this.f9992g.b());
        map.put("AppLovin-Ad-Format", this.f9992g.a().getLabel());
        Map mapD = this.f9992g.d();
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", mapD.get("retry_attempt"), map);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", mapD.get("retry_delay_sec"), map);
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        x5 x5Var;
        MaxAdFormat maxAdFormatA = this.f9992g.a();
        String strB = this.f9992g.b();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Fetching next ad for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        m2.a();
        if (((Boolean) this.f8297a.a(z4.Z3)).booleanValue() && q7.k() && com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "User is connected to a VPN");
        }
        this.f8297a.R().a(f2.f7856i0, maxAdFormatA, strB, (MaxError) null);
        if (((Boolean) this.f8297a.a(z4.R4)).booleanValue()) {
            w3 w3VarA0 = this.f8297a.a0();
            u3 u3Var = u3.f9823f;
            w3VarA0.a(u3Var, v3.a(strB));
            w3VarA0.a(u3Var, v3.a(maxAdFormatA));
        }
        q7.a(this.f8297a, this.f8298b);
        try {
            JSONObject jSONObjectG = g();
            HashMap map = new HashMap();
            if (!((Boolean) this.f8297a.a(z4.G5)).booleanValue() && !((Boolean) this.f8297a.a(z4.E5)).booleanValue()) {
                map.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f8297a.a(z4.f10227p5)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8297a.k0());
            }
            if (this.f8297a.u0().c()) {
                map.put("test_mode", "1");
            }
            List listB = this.f8297a.u0().b();
            String str = this.f8297a.p0().getExtraParameters().get("fan");
            if (listB != null && !listB.isEmpty()) {
                String strJoin = String.join(",", listB);
                map.put("filter_ad_network", strJoin);
                if (!this.f8297a.u0().c()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f8297a.u0().d()) {
                    map.put("force_ad_network", strJoin);
                }
            } else if (StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            x5Var = this;
            try {
                a aVar = x5Var.new a(com.applovin.impl.sdk.network.a.a(this.f8297a).c(C0375hc.f28789b).a(h()).b(f()).a(e()).b(map).a(jSONObjectG).b(((Boolean) this.f8297a.a(t3.F8)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f8297a.a(t3.f9790x7)).intValue()).a(((Integer) this.f8297a.a(z4.f10109b3)).intValue()).b(((Long) this.f8297a.a(t3.f9788w7)).intValue()).a(w4.a.a(((Integer) this.f8297a.a(z4.f10270v5)).intValue())).f(true).a(), this.f8297a, strB, maxAdFormatA);
                aVar.c(t3.f9785u7);
                aVar.b(t3.f9787v7);
                x5Var.f8297a.s0().a(aVar);
            } catch (Throwable th2) {
                th = th2;
                if (com.applovin.impl.sdk.p.a()) {
                    x5Var.f8299c.a(x5Var.f8298b, "Unable to fetch ad for Ad Unit ID: " + strB, th);
                }
                x5Var.a("", 0, th.getMessage());
            }
        } catch (Throwable th3) {
            th = th3;
            x5Var = this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends o6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f9996n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f9997o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, String str, MaxAdFormat maxAdFormat) {
            super(aVar, lVar);
            this.f9996n = str;
            this.f9997o = maxAdFormat;
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 != 200) {
                x5.this.a(str, i10, (String) null);
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f8907m.a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f8907m.b());
            HashMap map = new HashMap(6);
            CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
            CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
            CollectionUtils.putStringIfValid("ad_unit_id", this.f9996n, map);
            CollectionUtils.putStringIfValid("ad_format", this.f9997o.getLabel(), map);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f8907m.a()), map);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f8907m.b()), map);
            this.f8297a.R().d(f2.f7859j0, map);
            x5.this.b(jSONObject);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            x5.this.a(str, i10, str2);
            this.f8297a.E().a("fetchMediatedAd", str, i10, str2);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        String strB = this.f9992g.b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", strB);
        jSONObject2.put("ad_format", this.f9992g.a().getLabel());
        Map map = CollectionUtils.map(this.f9992g.d());
        com.applovin.impl.sdk.q qVarC0 = this.f8297a.c0();
        CollectionUtils.putStringIfValid("previous_request_id", qVarC0.b(strB), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", qVarC0.a(strB), map);
        com.applovin.impl.sdk.q.a aVarC = qVarC0.c(strB);
        if (aVarC != null) {
            if (Boolean.parseBoolean(this.f8297a.p0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarC.a());
                map.put("previous_winning_network_name", aVarC.c());
            }
            if (this.f8297a.T() != null) {
                Queue<a3> queueC = this.f8297a.T().c(strB);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (a3 a3Var : queueC) {
                    arrayList.add(a3Var.c());
                    arrayList2.add(a3Var.getNetworkName());
                }
                CollectionUtils.putStringIfValid("queued_ad_networks", String.join(",", arrayList), map);
                CollectionUtils.putStringIfValid("queued_ad_network_names", String.join(",", arrayList2), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C0239a2.f28155e, new JSONArray(this.f8297a.V().a()));
            jSONObject2.put("installed", y3.b(this.f8297a));
            jSONObject2.put("initialized", this.f8297a.U().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f8297a.U().a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f8297a.V().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f8297a.V().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e10) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Failed to populate adapter classNames", e10);
            }
            throw new RuntimeException("Failed to populate classNames: " + e10);
        }
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        k5 h6Var;
        if (((Boolean) this.f8297a.a(t3.K8)).booleanValue()) {
            jSONObject2 = jSONObject;
            h6Var = new i6(this.f9992g, jSONObject2, this.f9994i, this.f8297a, this.f9995j);
        } else {
            jSONObject2 = jSONObject;
            h6Var = new h6(this.f9992g, jSONObject, this.f9994i, this.f8297a, this.f9995j);
        }
        long j10 = JsonUtils.getLong(jSONObject2, "process_waterfall_delay_ms", -1L);
        if (j10 > 0) {
            this.f8297a.s0().a(h6Var, f6.b.MEDIATION, j10, true);
        } else {
            this.f8297a.s0().a(h6Var);
        }
    }

    private void h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f9993h;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10, String str2) {
        MaxErrorImpl maxErrorImpl;
        String strB = this.f9992g.b();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.b(this.f8298b, "Unable to fetch ad for ad unit " + strB + ": server returned " + i10);
        }
        if (i10 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i10 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else if (StringUtils.isValidString(str2)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        HashMap map = new HashMap(5);
        CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
        CollectionUtils.putStringIfValid("code", String.valueOf(i10), map);
        CollectionUtils.putStringIfValid("error_message", str2, map);
        CollectionUtils.putStringIfValid("ad_unit_id", strB, map);
        CollectionUtils.putStringIfValid("ad_format", this.f9992g.a().getLabel(), map);
        this.f8297a.R().d(f2.f7862k0, map);
        v2.a(this.f9995j, strB, maxErrorImpl);
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f8297a.p0().getExtraParameters()));
    }
}
