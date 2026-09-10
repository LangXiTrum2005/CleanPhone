package com.ironsource;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0594u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f30740d = new c(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f30741e = "capping";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f30742f = "pacing";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f30743g = "delivery";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f30744h = "progressiveLoadingConfig";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f30745i = "expiredDurationInMinutes";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f30746j = "reward";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f30747k = "name";
    public static final String l = "amount";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f30748m = "virtualItemName";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f30749n = "virtualItemCount";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f30750o = 60;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, d> f30751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f30752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, d> f30753c;

    /* JADX INFO: renamed from: com.ironsource.u$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30754a = new a();

        public a() {
            super(1);
        }

        @Override // jk.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            kotlin.jvm.internal.n.f(it, "it");
            return new d(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends kotlin.jvm.internal.o implements jk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30755a = new b();

        public b() {
            super(1);
        }

        @Override // jk.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            kotlin.jvm.internal.n.f(it, "it");
            return new d(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C3 f30756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0268bd f30757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final M4 f30758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Long f30759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Qd f30760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Qd f30761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Ad f30762g;

        public d(JSONObject features) throws JSONException {
            C3 c4;
            C0268bd c0268bd;
            kotlin.jvm.internal.n.f(features, "features");
            Ad ad2 = null;
            if (features.has(C0594u.f30741e)) {
                JSONObject jSONObject = features.getJSONObject(C0594u.f30741e);
                kotlin.jvm.internal.n.e(jSONObject, "features.getJSONObject(key)");
                c4 = new C3(jSONObject);
            } else {
                c4 = null;
            }
            this.f30756a = c4;
            if (features.has(C0594u.f30742f)) {
                JSONObject jSONObject2 = features.getJSONObject(C0594u.f30742f);
                kotlin.jvm.internal.n.e(jSONObject2, "features.getJSONObject(key)");
                c0268bd = new C0268bd(jSONObject2);
            } else {
                c0268bd = null;
            }
            this.f30757b = c0268bd;
            this.f30758c = features.has(C0594u.f30743g) ? new M4(features.getBoolean(C0594u.f30743g)) : null;
            this.f30759d = features.has(C0594u.f30745i) ? Long.valueOf(features.getLong(C0594u.f30745i)) : null;
            JSONObject jSONObjectOptJSONObject = features.optJSONObject(C0594u.f30746j);
            this.f30760e = jSONObjectOptJSONObject != null ? new Qd(jSONObjectOptJSONObject, "name", "amount") : null;
            Qd qd2 = new Qd(features, C0594u.f30748m, C0594u.f30749n);
            String strB = qd2.b();
            this.f30761f = (strB == null || strB.length() == 0 || qd2.a() == null) ? null : qd2;
            if (features.has(C0594u.f30744h)) {
                JSONObject jSONObject3 = features.getJSONObject(C0594u.f30744h);
                kotlin.jvm.internal.n.e(jSONObject3, "features.getJSONObject(key)");
                ad2 = new Ad(jSONObject3);
            }
            this.f30762g = ad2;
        }

        public final Qd a() {
            return this.f30760e;
        }

        public final C3 b() {
            return this.f30756a;
        }

        public final M4 c() {
            return this.f30758c;
        }

        public final Long d() {
            return this.f30759d;
        }

        public final C0268bd e() {
            return this.f30757b;
        }

        public final Qd f() {
            return this.f30761f;
        }

        public final Ad g() {
            return this.f30762g;
        }
    }

    public C0594u(JSONObject configurations) {
        kotlin.jvm.internal.n.f(configurations, "configurations");
        this.f30751a = new C0519pd(configurations).a(b.f30755a);
        this.f30752b = new d(configurations);
        this.f30753c = new C0238a1(configurations).a(a.f30754a);
    }

    public final Map<String, d> a() {
        return this.f30753c;
    }

    public final d b() {
        return this.f30752b;
    }

    public final Map<String, d> c() {
        return this.f30751a;
    }
}
