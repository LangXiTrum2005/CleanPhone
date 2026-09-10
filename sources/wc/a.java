package wc;

import v0.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f53153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f53154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f53155e;

    public a(String str, String str2, String str3, b bVar, int i10) {
        this.f53151a = str;
        this.f53152b = str2;
        this.f53153c = str3;
        this.f53154d = bVar;
        this.f53155e = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = aVar.f53155e;
        b bVar = aVar.f53154d;
        String str = aVar.f53153c;
        String str2 = aVar.f53152b;
        String str3 = aVar.f53151a;
        String str4 = this.f53151a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f53152b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.f53153c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        b bVar2 = this.f53154d;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        int i11 = this.f53155e;
        if (i11 == 0) {
            return i10 == 0;
        }
        return i.b(i11, i10);
    }

    public final int hashCode() {
        String str = this.f53151a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f53152b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f53153c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f53154d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i10 = this.f53155e;
        return iHashCode4 ^ (i10 != 0 ? i.c(i10) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f53151a);
        sb2.append(", fid=");
        sb2.append(this.f53152b);
        sb2.append(", refreshToken=");
        sb2.append(this.f53153c);
        sb2.append(", authToken=");
        sb2.append(this.f53154d);
        sb2.append(", responseCode=");
        int i10 = this.f53155e;
        if (i10 != 1) {
            str = i10 != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
