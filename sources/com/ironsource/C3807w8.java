package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.ranges.IntRange;

/* JADX INFO: renamed from: com.ironsource.w8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3807w8 {
    public static final C3807w8 a = new C3807w8();

    private C3807w8() {
    }

    public static final String a() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getControllerConfigAsJSONObject().optJSONObject(X3.a.c);
        Object objOpt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt(A5.K) : null;
        if (objOpt == null || !(objOpt instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) objOpt;
        IntRange intRangeMonoploid = p002kotlin.ranges.wireman.monoploid(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeMonoploid.iterator();
        while (it.hasNext()) {
            Object objOpt2 = jSONArray.opt(((p002kotlin.collections.kattegat) it).nextInt());
            if (objOpt2 != null) {
                arrayList.add(objOpt2);
            }
        }
        return CollectionsKt.preterite(arrayList, ",", null, null, 0, null, null, 62, null);
    }
}
