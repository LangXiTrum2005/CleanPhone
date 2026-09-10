package com.ironsource;

import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ta, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0587ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f30727a = 100;

    public static final boolean a(JSONObject lhs, JSONObject rhs) {
        kotlin.jvm.internal.n.f(lhs, "lhs");
        kotlin.jvm.internal.n.f(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    public static final boolean a(JSONArray lhs, JSONArray rhs) {
        kotlin.jvm.internal.n.f(lhs, "lhs");
        kotlin.jvm.internal.n.f(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    private static final boolean a(JSONObject jSONObject, JSONObject jSONObject2, int i10) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i10 > 100) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        kotlin.jvm.internal.n.e(itKeys, "lhs.keys()");
        for (String str : (zm.a) zm.l.M(itKeys)) {
            if (!jSONObject2.has(str) || !a(jSONObject.get(str), jSONObject2.get(str), i10)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean a(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() != jSONArray2.length() || i10 > 100) {
            return false;
        }
        Iterable iterableO = com.bumptech.glide.d.O(0, jSONArray.length());
        if (!(iterableO instanceof Collection) || !((Collection) iterableO).isEmpty()) {
            pk.b it = iterableO.iterator();
            while (it.f48398c) {
                int iNextInt = it.nextInt();
                if (!a(jSONArray.get(iNextInt), jSONArray2.get(iNextInt), i10)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean a(Object obj, Object obj2, int i10) {
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            return a((JSONObject) obj, (JSONObject) obj2, i10 + 1);
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            return a((JSONArray) obj, (JSONArray) obj2, i10 + 1);
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return ((Number) obj).doubleValue() == ((Number) obj2).doubleValue();
        }
        return kotlin.jvm.internal.n.a(obj, obj2);
    }
}
