package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45395b;

    public j(String str, String str2) {
        this.f45394a = str;
        this.f45395b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(j.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        j jVar = (j) obj;
        return t9.e.d(this.f45394a, jVar.f45394a) && t9.e.d(this.f45395b, jVar.f45395b);
    }

    public final int hashCode() {
        return t9.e.e(this.f45395b) + l1.d.c(j.class.hashCode() * 31, 31, this.f45394a);
    }

    public final String toString() {
        return l1.d.h("PlatformAccountIdentifiers(obfuscatedAccountId=", this.f45394a, ", obfuscatedProfileId=", this.f45395b, ")");
    }
}
