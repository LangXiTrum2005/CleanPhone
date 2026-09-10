package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.pd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0519pd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30010b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f30011c = "placements";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f30012d = "placementName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONArray f30013a;

    /* JADX INFO: renamed from: com.ironsource.pd$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public C0519pd(JSONObject configuration) {
        kotlin.jvm.internal.n.f(configuration, "configuration");
        this.f30013a = configuration.optJSONArray(f30011c);
    }

    public final <T> Map<String, T> a(jk.b valueExtractor) throws JSONException {
        kotlin.jvm.internal.n.f(valueExtractor, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f30013a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String key = jSONObject.optString("placementName");
                Object objInvoke = valueExtractor.invoke(jSONObject);
                kotlin.jvm.internal.n.e(key, "key");
                linkedHashMap.put(key, objInvoke);
            }
        }
        return linkedHashMap;
    }
}
