package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f7751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f7752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f7755e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        TCF_VENDOR,
        ATP_NETWORK,
        OTHER;

        /* JADX INFO: Access modifiers changed from: private */
        public static a b(int i10) {
            if (i10 != 0) {
                return i10 != 1 ? OTHER : ATP_NETWORK;
            }
            return TCF_VENDOR;
        }
    }

    public d7(JSONObject jSONObject, String str) {
        this.f7754d = str;
        this.f7751a = a.b(JsonUtils.getInt(jSONObject, "type", a.OTHER.ordinal()));
        this.f7752b = JsonUtils.getInteger(jSONObject, "id", null);
        this.f7753c = JsonUtils.getString(jSONObject, "name", null);
    }

    public void a(Boolean bool) {
        this.f7755e = bool;
    }

    public String b() {
        return this.f7754d;
    }

    public String c() {
        return this.f7753c;
    }

    public Integer d() {
        return this.f7752b;
    }

    public String e() {
        Boolean bool = this.f7755e;
        return q4.a.j(new StringBuilder("\n"), this.f7754d, " - ", bool != null ? String.valueOf(bool) : q0.b().a(com.applovin.impl.sdk.l.p()));
    }

    public a f() {
        return this.f7751a;
    }

    public Boolean a() {
        return this.f7755e;
    }
}
