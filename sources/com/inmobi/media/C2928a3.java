package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2928a3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f23425e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P9 f23426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeMap f23427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f23428c;
    public final R2 d;

    public C2928a3(U2 networkRequest, P9 mNetworkResponse) {
        Intrinsics.f(networkRequest, "networkRequest");
        Intrinsics.f(mNetworkResponse, "mNetworkResponse");
        this.f23426a = mNetworkResponse;
        TreeMap treeMap = new TreeMap(networkRequest.y);
        this.f23427b = treeMap;
        this.f23428c = new LinkedHashMap();
        I9 i9 = mNetworkResponse.d;
        Unit unit = null;
        if (i9 != null) {
            for (Map.Entry entry : treeMap.entrySet()) {
                Object value = entry.getValue();
                Intrinsics.e(value, "<get-value>(...)");
                W2 w2 = new W2(null, (Config) value);
                w2.f23315c = new R2((byte) 0, "Network error in fetching config.");
                LinkedHashMap linkedHashMap = this.f23428c;
                Object key = entry.getKey();
                Intrinsics.e(key, "<get-key>(...)");
                linkedHashMap.put(key, w2);
            }
            this.d = new R2((byte) 0, i9.f22887b);
            Pair pairA = V2.a(this.f23427b);
            LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("errorCode", Integer.valueOf(i9.f22886a.f23864a)), new Pair("name", (List) pairA.X), new Pair("lts", (List) pairA.f43249Y), new Pair("networkType", L3.q()));
            Pd pd = Pd.f23077a;
            Pd.b("InvalidConfig", linkedHashMapL, Td.SDK);
            unit = Unit.f43263a;
        }
        if (unit == null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f23426a.a());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    Config config = (Config) this.f23427b.get(next);
                    if (config != null) {
                        W2 w3 = new W2(jSONObject2, config);
                        LinkedHashMap linkedHashMap2 = this.f23428c;
                        Intrinsics.c(next);
                        linkedHashMap2.put(next, w3);
                    }
                }
                Pair pairA2 = V2.a(this.f23427b);
                LinkedHashMap linkedHashMapL2 = MapsKt.l(new Pair("name", (List) pairA2.X), new Pair("lts", (List) pairA2.f43249Y));
                Pd pd2 = Pd.f23077a;
                Pd.b("ConfigFetched", linkedHashMapL2, Td.SDK);
            } catch (JSONException e2) {
                String localizedMessage = e2.getLocalizedMessage();
                this.d = new R2((byte) 2, localizedMessage == null ? "Exception while parsing config" : localizedMessage);
                Pair pairA3 = V2.a(this.f23427b);
                LinkedHashMap linkedHashMapL3 = MapsKt.l(new Pair("errorCode", (short) 1), new Pair("name", (List) pairA3.X), new Pair("lts", (List) pairA3.f43249Y), new Pair("networkType", L3.q()));
                Pd pd3 = Pd.f23077a;
                Pd.b("InvalidConfig", linkedHashMapL3, Td.SDK);
            }
        }
    }

    public final boolean a() {
        EnumC3157o4 enumC3157o4;
        I9 i9 = this.f23426a.d;
        if ((i9 != null ? i9.f22886a : null) == EnumC3157o4.f23857i) {
            return true;
        }
        if (i9 == null || (enumC3157o4 = i9.f22886a) == null) {
            enumC3157o4 = EnumC3157o4.f23855e;
        }
        int i2 = enumC3157o4.f23864a;
        return 500 <= i2 && i2 < 600;
    }
}
