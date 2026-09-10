package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f26522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f26526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f26528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f26529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f26530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f26531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f26532k;
    private final JSONObject l;

    public M1(JSONObject config) {
        kotlin.jvm.internal.n.f(config, "config");
        this.f26522a = config;
        this.f26523b = config.optBoolean("isExternalArmEventsEnabled", true);
        String strOptString = config.optString("externalArmEventsUrl", Q5.f27088j);
        kotlin.jvm.internal.n.e(strOptString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.f26524c = strOptString;
        this.f26525d = config.optBoolean(O6.f26710e1, true);
        this.f26526e = config.optBoolean("radvid", false);
        this.f26527f = config.optInt("uaeh", 0);
        this.f26528g = config.optBoolean("sharedThreadPool", false);
        this.f26529h = config.optBoolean("sharedThreadPoolADP", true);
        this.f26530i = config.optInt(O6.V0, -1);
        this.f26531j = config.optBoolean("axal", false);
        this.f26532k = config.optBoolean("psrt", false);
        this.l = config.optJSONObject(X3.a.f27668c);
    }

    private final JSONObject a() {
        return this.f26522a;
    }

    public final int b() {
        return this.f26530i;
    }

    public final JSONObject c() {
        return this.l;
    }

    public final String d() {
        return this.f26524c;
    }

    public final boolean e() {
        return this.f26532k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M1) && kotlin.jvm.internal.n.a(this.f26522a, ((M1) obj).f26522a);
    }

    public final boolean f() {
        return this.f26526e;
    }

    public final boolean g() {
        return this.f26525d;
    }

    public final boolean h() {
        return this.f26528g;
    }

    public int hashCode() {
        return this.f26522a.hashCode();
    }

    public final boolean i() {
        return this.f26529h;
    }

    public final int j() {
        return this.f26527f;
    }

    public final boolean k() {
        return this.f26531j;
    }

    public final boolean l() {
        return this.f26523b;
    }

    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.f26522a + ")";
    }

    public final M1 a(JSONObject config) {
        kotlin.jvm.internal.n.f(config, "config");
        return new M1(config);
    }

    public static /* synthetic */ M1 a(M1 m7, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jSONObject = m7.f26522a;
        }
        return m7.a(jSONObject);
    }
}
