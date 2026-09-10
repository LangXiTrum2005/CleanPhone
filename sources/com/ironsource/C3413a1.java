package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.sequences.Sequence;

/* JADX INFO: renamed from: com.ironsource.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3413a1 {
    public static final a b = new a(null);
    public static final String c = "adUnits";
    private final JSONObject a;

    /* JADX INFO: renamed from: com.ironsource.a1$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3413a1(JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.a = configurations.optJSONObject(c);
    }

    public final <T> Map<String, T> a(Function1<? super JSONObject, ? extends T> valueExtractor) throws JSONException {
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        JSONObject jSONObject = this.a;
        if (jSONObject == null) {
            return p002kotlin.collections.seminary.taiyuan();
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "adUnits.keys()");
        Sequence sequenceCompetently = p002kotlin.sequences.arytenoidectomy.competently(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : sequenceCompetently) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) t);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(t, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
