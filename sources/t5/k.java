package t5;

import d5.u;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50535c;

    public k(String str, String str2, String str3) {
        this.f50533a = str;
        this.f50534b = str2;
        this.f50535c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return n.a(this.f50533a, kVar.f50533a) && n.a(this.f50534b, kVar.f50534b) && n.a(this.f50535c, kVar.f50535c);
    }

    public final int hashCode() {
        return this.f50535c.hashCode() + u.e(this.f50533a.hashCode() * 31, 31, this.f50534b);
    }

    public final String toString() {
        return defpackage.e.q(this.f50535c, ")", defpackage.e.v("Website(url=", this.f50533a, ", label=", this.f50534b, ", customLabel="));
    }
}
