package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3504f2 {
    private final L6.a a;
    private final ArrayList<String> b = new ArrayList<>(new C3468d2().a());
    private final N6 c = new N6();

    public C3504f2(L6.a aVar) {
        this.a = aVar;
    }

    public final JSONObject a() {
        L6.a aVar = this.a;
        JSONObject jSONObjectA = aVar != null ? this.c.a(this.b, aVar) : null;
        if (jSONObjectA == null) {
            jSONObjectA = this.c.a(this.b);
            Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return a(jSONObjectA);
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = O6.b(jSONObject.optJSONObject(L6.u));
        if (jSONObjectB != null) {
            jSONObject.put(L6.u, jSONObjectB);
        }
        return jSONObject;
    }
}
