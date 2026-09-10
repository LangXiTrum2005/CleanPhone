package t5;

import d5.u;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f50489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f50490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f50491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f50492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f50493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f50494j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f50495k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f50496m;

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.f50485a = str;
        this.f50486b = str2;
        this.f50487c = str3;
        this.f50488d = str4;
        this.f50489e = str5;
        this.f50490f = str6;
        this.f50491g = str7;
        this.f50492h = str8;
        this.f50493i = str9;
        this.f50494j = str10;
        this.f50495k = str11;
        this.l = str12;
        this.f50496m = str13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.a(this.f50485a, bVar.f50485a) && n.a(this.f50486b, bVar.f50486b) && n.a(this.f50487c, bVar.f50487c) && n.a(this.f50488d, bVar.f50488d) && n.a(this.f50489e, bVar.f50489e) && n.a(this.f50490f, bVar.f50490f) && n.a(this.f50491g, bVar.f50491g) && n.a(this.f50492h, bVar.f50492h) && n.a(this.f50493i, bVar.f50493i) && n.a(this.f50494j, bVar.f50494j) && n.a(this.f50495k, bVar.f50495k) && n.a(this.l, bVar.l) && n.a(this.f50496m, bVar.f50496m);
    }

    public final int hashCode() {
        return this.f50496m.hashCode() + u.e(u.e(u.e(u.e(u.e(u.e(u.e(u.e(u.e(u.e(u.e(this.f50485a.hashCode() * 31, 31, this.f50486b), 31, this.f50487c), 31, this.f50488d), 31, this.f50489e), 31, this.f50490f), 31, this.f50491g), 31, this.f50492h), 31, this.f50493i), 31, this.f50494j), 31, this.f50495k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbV = defpackage.e.v("Address(address=", this.f50485a, ", label=", this.f50486b, ", customLabel=");
        u.r(sbV, this.f50487c, ", street=", this.f50488d, ", pobox=");
        u.r(sbV, this.f50489e, ", neighborhood=", this.f50490f, ", city=");
        u.r(sbV, this.f50491g, ", state=", this.f50492h, ", postalCode=");
        u.r(sbV, this.f50493i, ", country=", this.f50494j, ", isoCountry=");
        u.r(sbV, this.f50495k, ", subAdminArea=", this.l, ", subLocality=");
        return defpackage.e.q(this.f50496m, ")", sbV);
    }
}
