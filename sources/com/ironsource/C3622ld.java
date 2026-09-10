package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3622ld {
    public static final a b = new a(null);
    public static final String c = "placements";
    public static final String d = "placementName";
    private final JSONArray a;

    /* JADX INFO: renamed from: com.ironsource.ld$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3622ld(JSONObject configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.a = configuration.optJSONArray(c);
    }

    public final <T> Map<String, T> a(Function1<? super JSONObject, ? extends T> valueExtractor) throws JSONException {
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jsonObject = jSONArray.getJSONObject(i);
                String key = jsonObject.optString("placementName");
                Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonObject");
                T tInvoke = valueExtractor.invoke(jsonObject);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, tInvoke);
            }
        }
        return linkedHashMap;
    }
}
