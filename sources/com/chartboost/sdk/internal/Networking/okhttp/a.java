package com.chartboost.sdk.internal.Networking.okhttp;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f15790c = new d(null);
    public static final Map d = MapsKt.j(new Pair(400, "Bad Request"), new Pair(401, "Unauthorized"), new Pair(403, "Forbidden"), new Pair(404, "Not Found"), new Pair(408, "Request Timeout"), new Pair(409, "Conflict"), new Pair(Integer.valueOf(CommonGatewayClient.CODE_TOO_MANY_REQUESTS), "Too Many Requests"), new Pair(500, "Internal Server Error"), new Pair(502, "Bad Gateway"), new Pair(503, "Service Unavailable"), new Pair(504, "Gateway Timeout"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15791b;

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.Networking.okhttp.a$a, reason: collision with other inner class name */
    public static final class C0180a extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C0180a f15792e = new C0180a();

        public C0180a() {
            super(502, a.f15790c.a(502), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C0180a);
        }

        public int hashCode() {
            return -1600884457;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BadGateway";
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f15793e = new b();

        public b() {
            super(400, a.f15790c.a(400), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -316072606;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "BadRequest";
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f15794e;

        public c(int i2) {
            super(i2, a.f15790c.a(i2), null);
            this.f15794e = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f15794e == ((c) obj).f15794e;
        }

        public int hashCode() {
            return Integer.hashCode(this.f15794e);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return androidx.datastore.preferences.protobuf.a.k("ClientError(status=", this.f15794e, ")");
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a b(int i2) {
            if (i2 == 400) {
                return b.f15793e;
            }
            if (i2 == 401) {
                return n.f15804e;
            }
            if (i2 == 403) {
                return f.f15796e;
            }
            if (i2 == 404) {
                return i.f15799e;
            }
            if (i2 == 408) {
                return j.f15800e;
            }
            if (i2 == 409) {
                return e.f15795e;
            }
            if (i2 == 429) {
                return m.f15803e;
            }
            if (i2 == 500) {
                return h.f15798e;
            }
            if (i2 == 502) {
                return C0180a.f15792e;
            }
            if (i2 == 503) {
                return l.f15802e;
            }
            if (i2 == 504) {
                return g.f15797e;
            }
            if (400 > i2 || i2 >= 500) {
                return (500 > i2 || i2 >= 600) ? new o(i2) : new k(i2);
            }
            return new c(i2);
        }

        public d() {
        }

        public final String a(int i2) {
            String str = (String) a.d.get(Integer.valueOf(i2));
            if (str == null) {
                str = "Unknown";
            }
            return "HTTP " + i2 + " " + str;
        }
    }

    public static final class e extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f15795e = new e();

        public e() {
            super(409, a.f15790c.a(409), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 488153194;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Conflict";
        }
    }

    public static final class f extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final f f15796e = new f();

        public f() {
            super(403, a.f15790c.a(403), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 258062945;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Forbidden";
        }
    }

    public static final class g extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final g f15797e = new g();

        public g() {
            super(504, a.f15790c.a(504), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -1275433707;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "GatewayTimeout";
        }
    }

    public static final class h extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final h f15798e = new h();

        public h() {
            super(500, a.f15790c.a(500), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 693189104;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InternalServerError";
        }
    }

    public static final class i extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final i f15799e = new i();

        public i() {
            super(404, a.f15790c.a(404), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return -1673446137;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NotFound";
        }
    }

    public static final class j extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final j f15800e = new j();

        public j() {
            super(408, a.f15790c.a(408), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return -1845205398;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "RequestTimeout";
        }
    }

    public static final class k extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f15801e;

        public k(int i2) {
            super(i2, a.f15790c.a(i2), null);
            this.f15801e = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f15801e == ((k) obj).f15801e;
        }

        public int hashCode() {
            return Integer.hashCode(this.f15801e);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return androidx.datastore.preferences.protobuf.a.k("ServerError(status=", this.f15801e, ")");
        }
    }

    public static final class l extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final l f15802e = new l();

        public l() {
            super(503, a.f15790c.a(503), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public int hashCode() {
            return 315784435;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ServiceUnavailable";
        }
    }

    public static final class m extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final m f15803e = new m();

        public m() {
            super(CommonGatewayClient.CODE_TOO_MANY_REQUESTS, a.f15790c.a(CommonGatewayClient.CODE_TOO_MANY_REQUESTS), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public int hashCode() {
            return 1422549791;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "TooManyRequests";
        }
    }

    public static final class n extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final n f15804e = new n();

        public n() {
            super(401, a.f15790c.a(401), null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return 36815244;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Unauthorized";
        }
    }

    public static final class o extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f15805e;

        public o(int i2) {
            super(i2, a.f15790c.a(i2), null);
            this.f15805e = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f15805e == ((o) obj).f15805e;
        }

        public int hashCode() {
            return Integer.hashCode(this.f15805e);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return androidx.datastore.preferences.protobuf.a.k("Unknown(status=", this.f15805e, ")");
        }
    }

    public /* synthetic */ a(int i2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, str);
    }

    public final int b() {
        return this.f15791b;
    }

    public a(int i2, String str) {
        super(str);
        this.f15791b = i2;
    }
}
