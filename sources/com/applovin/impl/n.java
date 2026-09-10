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
public class n implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f8801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f8802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f8803e;

    public n(JSONObject jSONObject, Map map, com.applovin.impl.sdk.l lVar) {
        this.f8799a = JsonUtils.getString(jSONObject, "name", "");
        this.f8800b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f8801c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArrayX = defpackage.e.x("waterfalls", jSONObject);
        this.f8803e = new ArrayList(jSONArrayX.length());
        for (int i10 = 0; i10 < jSONArrayX.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayX, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f8803e.add(new o(jSONObject2, map, this.f8801c, lVar));
            }
        }
        this.f8802d = this.f8803e.isEmpty() ? null : (o) this.f8803e.get(0);
    }

    public MaxAdFormat a() {
        return this.f8801c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f8801c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.f8799a;
    }

    public String d() {
        return this.f8800b;
    }

    public String e() {
        return "\n---------- " + this.f8800b + " ----------\nIdentifier - " + this.f8799a + "\nFormat     - " + b();
    }

    public o f() {
        return this.f8802d;
    }

    public List g() {
        return this.f8803e;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        return this.f8800b.compareToIgnoreCase(nVar.f8800b);
    }
}
