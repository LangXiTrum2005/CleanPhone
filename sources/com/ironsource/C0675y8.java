package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.y8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0675y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0675y8 f31294a = new C0675y8();

    private C0675y8() {
    }

    public static final String a() {
        JSONObject jSONObjectOptJSONObject = SDKUtils.getControllerConfigAsJSONObject().optJSONObject(X3.a.f27668c);
        Object objOpt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt(B5.K) : null;
        if (objOpt == null || !(objOpt instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) objOpt;
        pk.c cVarO = com.bumptech.glide.d.O(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        pk.b it = cVarO.iterator();
        while (it.f48398c) {
            Object objOpt2 = jSONArray.opt(it.nextInt());
            if (objOpt2 != null) {
                arrayList.add(objOpt2);
            }
        }
        return xj.n.u0(arrayList, ",", null, null, null, 62);
    }
}
