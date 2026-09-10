package fo;

import com.applovin.shadow.okhttp3.internal.http2.Header;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lo.h f41204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final lo.h f41205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final lo.h f41206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final lo.h f41207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final lo.h f41208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final lo.h f41209i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lo.h f41210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lo.h f41211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41212c;

    static {
        lo.h hVar = lo.h.f45638d;
        f41204d = jj.d.v(":");
        f41205e = jj.d.v(Header.RESPONSE_STATUS_UTF8);
        f41206f = jj.d.v(Header.TARGET_METHOD_UTF8);
        f41207g = jj.d.v(Header.TARGET_PATH_UTF8);
        f41208h = jj.d.v(Header.TARGET_SCHEME_UTF8);
        f41209i = jj.d.v(Header.TARGET_AUTHORITY_UTF8);
    }

    public b(lo.h name, lo.h value) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(value, "value");
        this.f41210a = name;
        this.f41211b = value;
        this.f41212c = value.d() + name.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.n.a(this.f41210a, bVar.f41210a) && kotlin.jvm.internal.n.a(this.f41211b, bVar.f41211b);
    }

    public final int hashCode() {
        return this.f41211b.hashCode() + (this.f41210a.hashCode() * 31);
    }

    public final String toString() {
        return this.f41210a.m() + ": " + this.f41211b.m();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String name, String value) {
        this(jj.d.v(name), jj.d.v(value));
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(value, "value");
        lo.h hVar = lo.h.f45638d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(lo.h name, String value) {
        this(name, jj.d.v(value));
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(value, "value");
        lo.h hVar = lo.h.f45638d;
    }
}
