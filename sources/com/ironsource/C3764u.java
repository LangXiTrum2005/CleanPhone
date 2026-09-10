package com.ironsource;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3764u {
    public static final c d = new c(null);
    public static final String e = "capping";
    public static final String f = "pacing";
    public static final String g = "delivery";
    public static final String h = "progressiveLoadingConfig";
    public static final String i = "expiredDurationInMinutes";
    public static final String j = "reward";
    public static final String k = "name";
    public static final String l = "amount";
    public static final String m = "virtualItemName";
    public static final String n = "virtualItemCount";
    public static final long o = 60;
    private final Map<String, d> a;
    private final d b;
    private final Map<String, d> c;

    /* JADX INFO: renamed from: com.ironsource.u$a */
    public static final class a extends Lambda implements Function1<JSONObject, d> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u$b */
    public static final class b extends Lambda implements Function1<JSONObject, d> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new d(it);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.u$d */
    public static final class d {
        private final C3 a;
        private final Wc b;
        private final L4 c;
        private final Long d;
        private final Dd e;
        private final Dd f;
        private final C3676od g;

        public d(JSONObject features) throws JSONException {
            C3 c3;
            Wc wc;
            Intrinsics.checkNotNullParameter(features, "features");
            C3676od c3676od = null;
            if (features.has(C3764u.e)) {
                JSONObject jSONObject = features.getJSONObject(C3764u.e);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "features.getJSONObject(key)");
                c3 = new C3(jSONObject);
            } else {
                c3 = null;
            }
            this.a = c3;
            if (features.has(C3764u.f)) {
                JSONObject jSONObject2 = features.getJSONObject(C3764u.f);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "features.getJSONObject(key)");
                wc = new Wc(jSONObject2);
            } else {
                wc = null;
            }
            this.b = wc;
            this.c = features.has(C3764u.g) ? new L4(features.getBoolean(C3764u.g)) : null;
            this.d = features.has(C3764u.i) ? Long.valueOf(features.getLong(C3764u.i)) : null;
            JSONObject jSONObjectOptJSONObject = features.optJSONObject(C3764u.j);
            this.e = jSONObjectOptJSONObject != null ? new Dd(jSONObjectOptJSONObject, "name", "amount") : null;
            Dd dd = new Dd(features, C3764u.m, C3764u.n);
            String strB = dd.b();
            this.f = (strB == null || strB.length() == 0 || dd.a() == null) ? null : dd;
            if (features.has(C3764u.h)) {
                JSONObject jSONObject3 = features.getJSONObject(C3764u.h);
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "features.getJSONObject(key)");
                c3676od = new C3676od(jSONObject3);
            }
            this.g = c3676od;
        }

        public final Dd a() {
            return this.e;
        }

        public final C3 b() {
            return this.a;
        }

        public final L4 c() {
            return this.c;
        }

        public final Long d() {
            return this.d;
        }

        public final Wc e() {
            return this.b;
        }

        public final Dd f() {
            return this.f;
        }

        public final C3676od g() {
            return this.g;
        }
    }

    public C3764u(JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.a = new C3622ld(configurations).a(b.a);
        this.b = new d(configurations);
        this.c = new C3413a1(configurations).a(a.a);
    }

    public final Map<String, d> a() {
        return this.c;
    }

    public final d b() {
        return this.b;
    }

    public final Map<String, d> c() {
        return this.a;
    }
}
