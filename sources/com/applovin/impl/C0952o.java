package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0952o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k8 f11353c;
    private final List d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f11354e;
    private boolean f = false;

    public C0952o(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        this.f11351a = JsonUtils.getString(jSONObject, "name", "");
        this.f11352b = JsonUtils.getString(jSONObject, "experiment", null);
        this.f11353c = a(jSONObject);
        this.d = a("bidders", jSONObject, map, maxAdFormat, kVar);
        this.f11354e = a(com.p004ironsource.mediationsdk.d.f25770h, jSONObject, map, maxAdFormat, kVar);
    }

    public List a() {
        return this.d;
    }

    public String b() {
        return this.f11352b;
    }

    public String c() {
        return this.f11351a;
    }

    public k8 d() {
        return this.f11353c;
    }

    public List e() {
        return this.f11354e;
    }

    public boolean f() {
        return this.f;
    }

    private k8 a(JSONObject jSONObject) {
        return new k8(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, com.applovin.impl.sdk.k kVar) {
        e3 e3Var;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayV = androidx.media3.extractor.text.ttml.a.v(str, jSONObject);
        for (int i2 = 0; i2 < jSONArrayV.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayV, i2, (JSONObject) null);
            if (jSONObject2 != null && (e3Var = (e3) map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                if (e3Var.C()) {
                    this.f = true;
                }
                arrayList.add(new i8(jSONObject2, maxAdFormat, e3Var, kVar));
            }
        }
        return arrayList;
    }
}
