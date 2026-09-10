package od;

import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47381b;

    public a(String str, String str2) {
        this.f47380a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f47381b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f47380a.equals(aVar.f47380a) && this.f47381b.equals(aVar.f47381b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f47381b.hashCode() ^ ((this.f47380a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f47380a);
        sb2.append(", version=");
        return e.q(this.f47381b, "}", sb2);
    }
}
