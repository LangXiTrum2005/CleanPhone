package t5;

import d5.u;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f50522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f50523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f50524g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f50518a = str;
        this.f50519b = str2;
        this.f50520c = str3;
        this.f50521d = str4;
        this.f50522e = str5;
        this.f50523f = str6;
        this.f50524g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return n.a(this.f50518a, hVar.f50518a) && n.a(this.f50519b, hVar.f50519b) && n.a(this.f50520c, hVar.f50520c) && n.a(this.f50521d, hVar.f50521d) && n.a(this.f50522e, hVar.f50522e) && n.a(this.f50523f, hVar.f50523f) && n.a(this.f50524g, hVar.f50524g);
    }

    public final int hashCode() {
        return this.f50524g.hashCode() + u.e(u.e(u.e(u.e(u.e(this.f50518a.hashCode() * 31, 31, this.f50519b), 31, this.f50520c), 31, this.f50521d), 31, this.f50522e), 31, this.f50523f);
    }

    public final String toString() {
        StringBuilder sbV = defpackage.e.v("Organization(company=", this.f50518a, ", title=", this.f50519b, ", department=");
        u.r(sbV, this.f50520c, ", jobDescription=", this.f50521d, ", symbol=");
        u.r(sbV, this.f50522e, ", phoneticName=", this.f50523f, ", officeLocation=");
        return defpackage.e.q(this.f50524g, ")", sbV);
    }
}
