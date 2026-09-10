package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Lg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f26515c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f26516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f26517b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final b a() {
            return new b();
        }

        public final Lg b() {
            return a().a();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Double f26518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f26519b;

        public final void a(Double d10) {
            this.f26519b = d10;
        }

        public final void b(Double d10) {
            this.f26518a = d10;
        }

        public final Double c() {
            return this.f26518a;
        }

        public final b a(double d10) {
            this.f26519b = Double.valueOf(d10);
            return this;
        }

        public final Double b() {
            return this.f26519b;
        }

        public final Lg a() {
            return new Lg(this, null);
        }

        public final b b(double d10) {
            this.f26518a = Double.valueOf(d10);
            return this;
        }
    }

    public /* synthetic */ Lg(b bVar, kotlin.jvm.internal.g gVar) {
        this(bVar);
    }

    public static final b a() {
        return f26515c.a();
    }

    public static final Lg b() {
        return f26515c.b();
    }

    public final Double c() {
        return this.f26517b;
    }

    public final Double d() {
        return this.f26516a;
    }

    public final String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.f26517b);
            jSONObject.put("floor", this.f26516a);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.getMessage());
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.n.e(string, "json.toString()");
        return string;
    }

    public String toString() {
        return defpackage.e.n("WaterfallConfiguration", e());
    }

    private Lg(b bVar) {
        this.f26516a = bVar.c();
        this.f26517b = bVar.b();
    }
}
