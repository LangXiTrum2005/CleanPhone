package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.c9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3457c9 {
    private final ArrayList<String> a = new ArrayList<>(new Z8().a());
    private final N6 b = new N6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.b.a(this.a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectA, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return jSONObjectA;
    }
}
