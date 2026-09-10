package com.ironsource;

import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3708qa {
    private static final int a = 100;

    public static final boolean a(JSONObject lhs, JSONObject rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    public static final boolean a(JSONArray lhs, JSONArray rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    private static final boolean a(JSONObject jSONObject, JSONObject jSONObject2, int i) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i > 100) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "lhs.keys()");
        for (String str : p002kotlin.sequences.arytenoidectomy.competently(itKeys)) {
            if (!jSONObject2.has(str) || !a(jSONObject.get(str), jSONObject2.get(str), i)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean a(JSONArray jSONArray, JSONArray jSONArray2, int i) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() != jSONArray2.length() || i > 100) {
            return false;
        }
        Iterable iterableMonoploid = p002kotlin.ranges.wireman.monoploid(0, jSONArray.length());
        if (!(iterableMonoploid instanceof Collection) || !((Collection) iterableMonoploid).isEmpty()) {
            Iterator it = iterableMonoploid.iterator();
            while (it.hasNext()) {
                int iNextInt = ((p002kotlin.collections.kattegat) it).nextInt();
                if (!a(jSONArray.get(iNextInt), jSONArray2.get(iNextInt), i)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean a(Object obj, Object obj2, int i) {
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            return a((JSONObject) obj, (JSONObject) obj2, i + 1);
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            return a((JSONArray) obj, (JSONArray) obj2, i + 1);
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return ((Number) obj).doubleValue() == ((Number) obj2).doubleValue();
        }
        return Intrinsics.wireman(obj, obj2);
    }
}
