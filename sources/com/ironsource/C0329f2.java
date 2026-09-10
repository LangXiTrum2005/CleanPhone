package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0329f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O6.a f28608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f28609b = new ArrayList<>(new C0293d2().a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q6 f28610c = new Q6();

    public C0329f2(O6.a aVar) {
        this.f28608a = aVar;
    }

    public final JSONObject a() {
        O6.a aVar = this.f28608a;
        JSONObject jSONObjectA = aVar != null ? this.f28610c.a(this.f28609b, aVar) : null;
        if (jSONObjectA == null) {
            jSONObjectA = this.f28610c.a(this.f28609b);
            kotlin.jvm.internal.n.e(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
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
