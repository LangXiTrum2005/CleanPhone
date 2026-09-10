package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n3 extends s0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f8824e = {com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f8825f = {com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "settings", "signal_providers", "ad_unit_signal_providers"};

    public static String a(com.applovin.impl.sdk.l lVar) {
        return s0.a((String) lVar.a(t3.f9787v7), "1.0/mediate", lVar);
    }

    public static String b(com.applovin.impl.sdk.l lVar) {
        return s0.a((String) lVar.a(t3.f9785u7), "1.0/mediate", lVar);
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            r5.a(jSONObject, lVar);
        }
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            lVar.c(b5.G);
            return;
        }
        JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f8825f);
        lVar.b(b5.G, jSONObjectShallowCopy.toString());
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f8824e);
            lVar.b(b5.F, jSONObjectShallowCopy.toString());
            r5.a(jSONObjectShallowCopy);
        }
    }

    public static void g(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers") && JsonUtils.valueExists(jSONObject, "signal_providers")) {
            try {
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    hashSet.add(JsonUtils.getString(jSONArray.getJSONObject(i10), "name", null));
                }
                HashSet hashSet2 = new HashSet();
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
                Iterator it = JsonUtils.toList(jSONObject2.names()).iterator();
                while (it.hasNext()) {
                    hashSet2.addAll(JsonUtils.getList(jSONObject2, (String) it.next(), null));
                }
                if (hashSet.equals(hashSet2)) {
                    return;
                }
                Set differenceSet = CollectionUtils.getDifferenceSet(hashSet, hashSet2);
                com.applovin.impl.sdk.p.h("MediationConnectionUtils", "\"signal_providers\" contains extra network(s): " + differenceSet);
                Set differenceSet2 = CollectionUtils.getDifferenceSet(hashSet2, hashSet);
                com.applovin.impl.sdk.p.h("MediationConnectionUtils", "\"ad_unit_signal_providers\" contains extra network(s): " + differenceSet2);
                lVar.E().a(f2.f7857i1, "signalProvidersMismatch", CollectionUtils.hashMap("details", "extraSignalProviderNetworks=" + differenceSet + ",extraAdUnitSignalProviderNetworks=" + differenceSet2));
                m1.a("Networks within \"signal_providers\" and \"ad_unit_signal_providers\" do not match.", new Object[0]);
            } catch (JSONException e10) {
                com.applovin.impl.sdk.p.c("MediationConnectionUtils", "Failed to parse JSON", e10);
                lVar.E().a("MediationConnectionUtils", "verifyBidderNetworksMatchFromJson", e10);
                m1.a((Throwable) e10, "Failed to parse JSON in verifyBidderNetworksMatchFromJson", new Object[0]);
            }
        }
    }

    public static String h(com.applovin.impl.sdk.l lVar) {
        z4 z4Var = t3.J8;
        return s0.a((String) lVar.a(((Boolean) lVar.a(z4Var)).booleanValue() ? t3.I8 : t3.f9787v7), ((Boolean) lVar.a(z4Var)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", lVar);
    }

    public static String i(com.applovin.impl.sdk.l lVar) {
        z4 z4Var = t3.J8;
        return s0.a((String) lVar.a(((Boolean) lVar.a(z4Var)).booleanValue() ? t3.H8 : t3.f9785u7), ((Boolean) lVar.a(z4Var)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", lVar);
    }
}
