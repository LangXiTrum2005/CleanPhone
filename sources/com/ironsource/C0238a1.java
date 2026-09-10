package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0238a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28148b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f28149c = "adUnits";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f28150a;

    /* JADX INFO: renamed from: com.ironsource.a1$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public C0238a1(JSONObject configurations) {
        kotlin.jvm.internal.n.f(configurations, "configurations");
        this.f28150a = configurations.optJSONObject(f28149c);
    }

    public final <T> Map<String, T> a(jk.b valueExtractor) throws JSONException {
        kotlin.jvm.internal.n.f(valueExtractor, "valueExtractor");
        JSONObject jSONObject = this.f28150a;
        if (jSONObject == null) {
            return xj.w.f53867a;
        }
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.n.e(itKeys, "adUnits.keys()");
        zm.i iVarM = zm.l.M(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (zm.a) iVarM) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) obj);
            kotlin.jvm.internal.n.e(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(obj, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
