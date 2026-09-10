package com.ironsource;

import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class T2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f27200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, b> f27201b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27202a = new a();

        public a() {
            super(1);
        }

        @Override // jk.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(JSONObject it) {
            kotlin.jvm.internal.n.f(it, "it");
            return new b(it);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f27203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f27205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f27206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f27207e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<String> f27208f;

        public b(JSONObject features) {
            kotlin.jvm.internal.n.f(features, "features");
            JSONObject jSONObject = features.has(V2.f27331a) ? features : null;
            JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject(V2.f27331a) : null;
            this.f27203a = jSONObjectOptJSONObject;
            int iOptInt = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt(V2.f27332b, 25000) : 25000;
            this.f27204b = iOptInt;
            this.f27205c = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optBoolean("enabled", true) : true;
            this.f27206d = (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has(V2.f27334d) || jSONObjectOptJSONObject.isNull(V2.f27334d)) ? iOptInt : jSONObjectOptJSONObject.optLong(V2.f27334d);
            this.f27207e = features.has(V2.f27335e) ? features.optInt(V2.f27335e) / 100.0f : 0.15f;
            List<String> listB = features.has(V2.f27336f) ? C0391ia.b(features.getJSONArray(V2.f27336f)) : xj.o.Q(com.ironsource.mediationsdk.j.f29553a, com.ironsource.mediationsdk.j.f29556d);
            kotlin.jvm.internal.n.e(listB, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f27208f = listB;
        }

        public final List<String> a() {
            return this.f27208f;
        }

        public final float b() {
            return this.f27207e;
        }

        public final int c() {
            return this.f27204b;
        }

        public final long d() {
            return this.f27206d;
        }

        public final boolean e() {
            return this.f27205c;
        }
    }

    public T2(JSONObject bannerConfigurations) {
        kotlin.jvm.internal.n.f(bannerConfigurations, "bannerConfigurations");
        this.f27200a = new b(bannerConfigurations);
        this.f27201b = new C0238a1(bannerConfigurations).a(a.f27202a);
    }

    public final Map<String, b> a() {
        return this.f27201b;
    }

    public final b b() {
        return this.f27200a;
    }
}
