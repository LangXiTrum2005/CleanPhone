package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3573j0 {
    private final ArrayList<String> a = new ArrayList<>(new C3556i0().a());
    private final N6 b = new N6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAdQualityKeyList)");
        return jSONObjectA;
    }
}
