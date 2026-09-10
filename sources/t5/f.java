package t5;

import d5.u;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f50512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f50513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f50514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f50515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f50516i;

    public f(String str, String str2, String str3, String str4, String str5, String nickname, String str6, String str7, String str8) {
        n.f(nickname, "nickname");
        this.f50508a = str;
        this.f50509b = str2;
        this.f50510c = str3;
        this.f50511d = str4;
        this.f50512e = str5;
        this.f50513f = nickname;
        this.f50514g = str6;
        this.f50515h = str7;
        this.f50516i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return n.a(this.f50508a, fVar.f50508a) && n.a(this.f50509b, fVar.f50509b) && n.a(this.f50510c, fVar.f50510c) && n.a(this.f50511d, fVar.f50511d) && n.a(this.f50512e, fVar.f50512e) && n.a(this.f50513f, fVar.f50513f) && n.a(this.f50514g, fVar.f50514g) && n.a(this.f50515h, fVar.f50515h) && n.a(this.f50516i, fVar.f50516i);
    }

    public final int hashCode() {
        return this.f50516i.hashCode() + u.e(u.e(u.e(u.e(u.e(u.e(u.e(this.f50508a.hashCode() * 31, 31, this.f50509b), 31, this.f50510c), 31, this.f50511d), 31, this.f50512e), 31, this.f50513f), 31, this.f50514g), 31, this.f50515h);
    }

    public final String toString() {
        String str = this.f50513f;
        StringBuilder sbV = defpackage.e.v("Name(first=", this.f50508a, ", last=", this.f50509b, ", middle=");
        u.r(sbV, this.f50510c, ", prefix=", this.f50511d, ", suffix=");
        u.r(sbV, this.f50512e, ", nickname=", str, ", firstPhonetic=");
        u.r(sbV, this.f50514g, ", lastPhonetic=", this.f50515h, ", middlePhonetic=");
        return defpackage.e.q(this.f50516i, ")", sbV);
    }
}
