package com.ironsource;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.og, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0504og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f29942a = C0486ng.f29858a.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q6 f29943b = new Q6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f29943b.a(this.f29942a);
        kotlin.jvm.internal.n.e(jSONObjectA, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(jSONObjectA);
    }

    public final JSONObject a(Context context) {
        kotlin.jvm.internal.n.f(context, "context");
        JSONObject jSONObjectA = this.f29943b.a(context, this.f29942a);
        kotlin.jvm.internal.n.e(jSONObjectA, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(jSONObjectA);
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = R6.b(jSONObject.optJSONObject(O6.f26751u));
        if (jSONObjectB != null) {
            jSONObject.put(O6.f26751u, jSONObjectB);
        }
        return jSONObject;
    }
}
