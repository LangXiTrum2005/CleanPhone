package com.p004ironsource;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.el, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0000\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a$\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\b2\b\u0010\u0002\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\"\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\t¨\u0006\u000b"}, d2 = {"Lorg/json/JSONObject;", "lhs", "rhs", "", "a", "Lorg/json/JSONArray;", "", "depth", "", "I", "DEPTH_LIMIT", "mediationsdk_release"}, k = 2, mv = {1, 8, 0})
public final class C3353el {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f24908a = 100;

    private static final boolean a(Object obj, Object obj2, int i2) {
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            return a((JSONObject) obj, (JSONObject) obj2, i2 + 1);
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            return a((JSONArray) obj, (JSONArray) obj2, i2 + 1);
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return ((Number) obj).doubleValue() == ((Number) obj2).doubleValue();
        }
        return Intrinsics.a(obj, obj2);
    }

    public static final boolean a(JSONArray lhs, JSONArray rhs) {
        Intrinsics.f(lhs, "lhs");
        Intrinsics.f(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    public static final boolean a(JSONObject lhs, JSONObject rhs) {
        Intrinsics.f(lhs, "lhs");
        Intrinsics.f(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    private static final boolean a(JSONObject jSONObject, JSONObject jSONObject2, int i2) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i2 > 100) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.e(itKeys, "lhs.keys()");
        for (String str : (ConstrainedOnceSequence) SequencesKt.b(itKeys)) {
            if (!jSONObject2.has(str) || !a(jSONObject.get(str), jSONObject2.get(str), i2)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean a(JSONArray jSONArray, JSONArray jSONArray2, int i2) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() == jSONArray2.length() && i2 <= 100) {
            Iterable iterableE = RangesKt.e(0, jSONArray.length());
            if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
                return true;
            }
            Iterator<Integer> it = iterableE.iterator();
            while (((IntProgressionIterator) it).Z) {
                int iA = ((IntIterator) it).a();
                if (!a(jSONArray.get(iA), jSONArray2.get(iA), i2)) {
                }
            }
            return true;
        }
        return false;
    }
}
