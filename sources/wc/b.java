package wc;

import v0.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f53157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53158c;

    public b(int i10, long j10, String str) {
        this.f53156a = str;
        this.f53157b = j10;
        this.f53158c = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i10 = bVar.f53158c;
        String str = bVar.f53156a;
        String str2 = this.f53156a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f53157b != bVar.f53157b) {
            return false;
        }
        int i11 = this.f53158c;
        if (i11 == 0) {
            return i10 == 0;
        }
        return i.b(i11, i10);
    }

    public final int hashCode() {
        String str = this.f53156a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f53157b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        int i11 = this.f53158c;
        return i10 ^ (i11 != 0 ? i.c(i11) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f53156a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f53157b);
        sb2.append(", responseCode=");
        int i10 = this.f53158c;
        if (i10 == 1) {
            str = "OK";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
