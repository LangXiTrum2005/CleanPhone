package bc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5539f;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f5535b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f5536c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f5537d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f5538e = str4;
        this.f5539f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            b bVar = (b) ((p) obj);
            if (this.f5535b.equals(bVar.f5535b) && this.f5536c.equals(bVar.f5536c) && this.f5537d.equals(bVar.f5537d) && this.f5538e.equals(bVar.f5538e) && this.f5539f == bVar.f5539f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f5535b.hashCode() ^ 1000003) * 1000003) ^ this.f5536c.hashCode()) * 1000003) ^ this.f5537d.hashCode()) * 1000003) ^ this.f5538e.hashCode()) * 1000003;
        long j10 = this.f5539f;
        return ((int) ((j10 >>> 32) ^ j10)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f5535b);
        sb2.append(", parameterKey=");
        sb2.append(this.f5536c);
        sb2.append(", parameterValue=");
        sb2.append(this.f5537d);
        sb2.append(", variantId=");
        sb2.append(this.f5538e);
        sb2.append(", templateVersion=");
        return defpackage.e.r(sb2, this.f5539f, "}");
    }
}
