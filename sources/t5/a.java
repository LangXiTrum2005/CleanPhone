package t5;

import d5.u;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f50484d;

    public a(String str, String str2, String str3, List list) {
        this.f50481a = str;
        this.f50482b = str2;
        this.f50483c = str3;
        this.f50484d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.a(this.f50481a, aVar.f50481a) && n.a(this.f50482b, aVar.f50482b) && n.a(this.f50483c, aVar.f50483c) && n.a(this.f50484d, aVar.f50484d);
    }

    public final int hashCode() {
        return this.f50484d.hashCode() + u.e(u.e(this.f50481a.hashCode() * 31, 31, this.f50482b), 31, this.f50483c);
    }

    public final String toString() {
        List list = this.f50484d;
        StringBuilder sbV = defpackage.e.v("Account(rawId=", this.f50481a, ", type=", this.f50482b, ", name=");
        sbV.append(this.f50483c);
        sbV.append(", mimetypes=");
        sbV.append(list);
        sbV.append(")");
        return sbV.toString();
    }
}
