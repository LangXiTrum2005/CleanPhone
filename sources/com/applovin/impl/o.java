package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m8 f8869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f8870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f8871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8872f = false;

    public o(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.l lVar) {
        this.f8867a = JsonUtils.getString(jSONObject, "name", "");
        this.f8868b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f8869c = a(jSONObject);
        this.f8870d = a("bidders", jSONObject, map, maxAdFormat, lVar);
        this.f8871e = a(com.ironsource.mediationsdk.d.f29337h, jSONObject, map, maxAdFormat, lVar);
    }

    public List a() {
        return this.f8870d;
    }

    public String b() {
        return this.f8868b;
    }

    public String c() {
        return this.f8867a;
    }

    public m8 d() {
        return this.f8869c;
    }

    public List e() {
        return this.f8871e;
    }

    public boolean f() {
        return this.f8872f;
    }

    private m8 a(JSONObject jSONObject) {
        return new m8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.l lVar) {
        g3 g3Var;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayX = defpackage.e.x(str, jSONObject);
        for (int i10 = 0; i10 < jSONArrayX.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayX, i10, (JSONObject) null);
            if (jSONObject2 != null && (g3Var = (g3) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (g3Var.C()) {
                    this.f8872f = true;
                }
                arrayList.add(new k8(jSONObject2, maxAdFormat, g3Var, lVar));
            }
        }
        return arrayList;
    }
}
