package t5;

import d5.u;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f50529e;

    public i(String str, String str2, String str3, String str4, boolean z10) {
        this.f50525a = str;
        this.f50526b = str2;
        this.f50527c = str3;
        this.f50528d = str4;
        this.f50529e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return n.a(this.f50525a, iVar.f50525a) && n.a(this.f50526b, iVar.f50526b) && n.a(this.f50527c, iVar.f50527c) && n.a(this.f50528d, iVar.f50528d) && this.f50529e == iVar.f50529e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f50529e) + u.e(u.e(u.e(this.f50525a.hashCode() * 31, 31, this.f50526b), 31, this.f50527c), 31, this.f50528d);
    }

    public final String toString() {
        StringBuilder sbV = defpackage.e.v("Phone(number=", this.f50525a, ", normalizedNumber=", this.f50526b, ", label=");
        u.r(sbV, this.f50527c, ", customLabel=", this.f50528d, ", isPrimary=");
        sbV.append(this.f50529e);
        sbV.append(")");
        return sbV.toString();
    }
}
