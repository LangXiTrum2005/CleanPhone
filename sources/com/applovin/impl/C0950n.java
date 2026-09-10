package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0950n implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaxAdFormat f11315c;
    private final C0952o d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f11316e;

    public C0950n(JSONObject jSONObject, Map map, com.applovin.impl.sdk.k kVar) {
        this.f11313a = JsonUtils.getString(jSONObject, "name", "");
        this.f11314b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f11315c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArrayV = androidx.media3.extractor.text.ttml.a.v("waterfalls", jSONObject);
        this.f11316e = new ArrayList(jSONArrayV.length());
        for (int i2 = 0; i2 < jSONArrayV.length(); i2++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayV, i2, (JSONObject) null);
            if (jSONObject2 != null) {
                this.f11316e.add(new C0952o(jSONObject2, map, this.f11315c, kVar));
            }
        }
        this.d = this.f11316e.isEmpty() ? null : (C0952o) this.f11316e.get(0);
    }

    public MaxAdFormat a() {
        return this.f11315c;
    }

    public String b() {
        MaxAdFormat maxAdFormat = this.f11315c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    public String c() {
        return this.f11313a;
    }

    public String d() {
        return this.f11314b;
    }

    public String e() {
        return "\n---------- " + this.f11314b + " ----------\nIdentifier - " + this.f11313a + "\nFormat     - " + b();
    }

    public C0952o f() {
        return this.d;
    }

    public List g() {
        return this.f11316e;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0950n c0950n) {
        return this.f11314b.compareToIgnoreCase(c0950n.f11314b);
    }
}
