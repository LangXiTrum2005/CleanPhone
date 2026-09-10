package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.IntRange;
import p002kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class AFj1bSDK {
    private static final List<Object> getMediationNetwork(JSONArray jSONArray) throws JSONException {
        IntRange intRangeMonoploid = p002kotlin.ranges.wireman.monoploid(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(intRangeMonoploid, 10));
        Iterator<Integer> it = intRangeMonoploid.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((p002kotlin.collections.kattegat) it).nextInt());
            Intrinsics.checkNotNullExpressionValue(obj, "");
            arrayList.add(getMediationNetwork(obj));
        }
        return arrayList;
    }

    public static final Map<String, Object> getMonetizationNetwork(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        Sequence sequenceCompetently = p002kotlin.sequences.arytenoidectomy.competently(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceCompetently) {
            Object obj2 = jSONObject.get((String) obj);
            Intrinsics.checkNotNullExpressionValue(obj2, "");
            linkedHashMap.put(obj, getMediationNetwork(obj2));
        }
        return linkedHashMap;
    }

    private static final Object getMediationNetwork(Object obj) {
        if (obj instanceof JSONArray) {
            return getMediationNetwork((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return getMonetizationNetwork((JSONObject) obj);
        }
        if (Intrinsics.wireman(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }
}
