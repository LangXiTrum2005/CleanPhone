package oi;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47434c;

    public a(String str, String str2) {
        this.f47432a = str;
        this.f47433b = null;
        this.f47434c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f47432a.equals(aVar.f47432a)) {
            return this.f47434c.equals(aVar.f47434c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47434c.hashCode() + (this.f47432a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DartEntrypoint( bundle path: ");
        sb2.append(this.f47432a);
        sb2.append(", function: ");
        return defpackage.e.q(this.f47434c, " )", sb2);
    }

    public a(String str, String str2, String str3) {
        this.f47432a = str;
        this.f47433b = str2;
        this.f47434c = str3;
    }
}
