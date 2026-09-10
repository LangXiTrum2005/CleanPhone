package t5;

import d5.u;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50500d;

    public c(String str, String str2, String str3, boolean z10) {
        this.f50497a = str;
        this.f50498b = str2;
        this.f50499c = str3;
        this.f50500d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n.a(this.f50497a, cVar.f50497a) && n.a(this.f50498b, cVar.f50498b) && n.a(this.f50499c, cVar.f50499c) && this.f50500d == cVar.f50500d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50500d) + u.e(u.e(this.f50497a.hashCode() * 31, 31, this.f50498b), 31, this.f50499c);
    }

    public final String toString() {
        StringBuilder sbV = defpackage.e.v("Email(address=", this.f50497a, ", label=", this.f50498b, ", customLabel=");
        sbV.append(this.f50499c);
        sbV.append(", isPrimary=");
        sbV.append(this.f50500d);
        sbV.append(")");
        return sbV.toString();
    }
}
