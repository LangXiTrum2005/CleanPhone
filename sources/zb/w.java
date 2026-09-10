package zb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54774b;

    public w(String str, String str2) {
        this.f54773a = str;
        this.f54774b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.n.a(this.f54773a, wVar.f54773a) && kotlin.jvm.internal.n.a(this.f54774b, wVar.f54774b);
    }

    public final int hashCode() {
        String str = this.f54773a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f54774b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.f54773a);
        sb2.append(", authToken=");
        return wi.d.k(sb2, this.f54774b, ')');
    }
}
