package tb;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f50695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50697c;

    public h(int i10, int i11, Class cls) {
        this(q.a(cls), i10, i11);
    }

    public static h a(Class cls) {
        return new h(0, 1, cls);
    }

    public static h b(Class cls) {
        return new h(1, 0, cls);
    }

    public static h c(q qVar) {
        return new h(qVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f50695a.equals(hVar.f50695a) && this.f50696b == hVar.f50696b && this.f50697c == hVar.f50697c;
    }

    public final int hashCode() {
        return this.f50697c ^ ((((this.f50695a.hashCode() ^ 1000003) * 1000003) ^ this.f50696b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f50695a);
        sb2.append(", type=");
        int i10 = this.f50696b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f50697c;
        if (i11 == 0) {
            str2 = "direct";
        } else if (i11 == 1) {
            str2 = IronSourceConstants.EVENTS_PROVIDER;
        } else {
            if (i11 != 2) {
                throw new AssertionError(l1.d.e(i11, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return defpackage.e.q(str2, "}", sb2);
    }

    public h(q qVar, int i10, int i11) {
        a.a.f(qVar, "Null dependency anInterface.");
        this.f50695a = qVar;
        this.f50696b = i10;
        this.f50697c = i11;
    }
}
