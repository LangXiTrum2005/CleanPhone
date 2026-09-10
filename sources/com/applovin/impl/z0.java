package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class z0 extends w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f10089c;

    public z0(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        super(jSONObject, lVar);
    }

    public Map f() {
        return this.f10089c;
    }

    public String g() {
        return JsonUtils.getString(this.f9918b, "name", null);
    }

    @Override // com.applovin.impl.w0
    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + ", name=" + g() + "}";
    }
}
