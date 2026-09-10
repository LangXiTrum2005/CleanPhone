package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0398j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f28917a = new ArrayList<>(new C0381i0().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q6 f28918b = new Q6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f28918b.a(this.f28917a);
        kotlin.jvm.internal.n.e(jSONObjectA, "mGlobalDataReader.getDataByKeys(mAdQualityKeyList)");
        return jSONObjectA;
    }
}
