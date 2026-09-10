package t5;

import d5.u;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50532c;

    public j(String str, String str2, String str3) {
        this.f50530a = str;
        this.f50531b = str2;
        this.f50532c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return n.a(this.f50530a, jVar.f50530a) && n.a(this.f50531b, jVar.f50531b) && n.a(this.f50532c, jVar.f50532c);
    }

    public final int hashCode() {
        return this.f50532c.hashCode() + u.e(this.f50530a.hashCode() * 31, 31, this.f50531b);
    }

    public final String toString() {
        return defpackage.e.q(this.f50532c, ")", defpackage.e.v("SocialMedia(userName=", this.f50530a, ", label=", this.f50531b, ", customLabel="));
    }
}
