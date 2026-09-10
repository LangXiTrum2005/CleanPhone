package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class H5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f26233a = new ArrayList<>(new G5().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q6 f26234b = new Q6();

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f26234b.a(this.f26233a);
        kotlin.jvm.internal.n.e(jSONObjectA, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return jSONObjectA;
    }
}
