package com.ironsource.adapters.ironsource;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class LoadAdData {
    private final JSONObject localAdData;

    public LoadAdData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String adUnitId() {
        String it = this.localAdData.optString("adUnitId");
        n.e(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final boolean isMultipleAdObjectsFlow() {
        return this.localAdData.optBoolean("isMultipleAdUnits", false);
    }

    public LoadAdData(JSONObject jSONObject) {
        this.localAdData = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public /* synthetic */ LoadAdData(JSONObject jSONObject, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : jSONObject);
    }
}
