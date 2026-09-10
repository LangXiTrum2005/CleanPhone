package td;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f50738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f50739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f50740f;

    public c(String str, String str2, String str3, String str4, long j10) {
        this.f50736b = str;
        this.f50737c = str2;
        this.f50738d = str3;
        this.f50739e = str4;
        this.f50740f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            c cVar = (c) ((e) obj);
            if (this.f50736b.equals(cVar.f50736b) && this.f50737c.equals(cVar.f50737c) && this.f50738d.equals(cVar.f50738d) && this.f50739e.equals(cVar.f50739e) && this.f50740f == cVar.f50740f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f50736b.hashCode() ^ 1000003) * 1000003) ^ this.f50737c.hashCode()) * 1000003) ^ this.f50738d.hashCode()) * 1000003) ^ this.f50739e.hashCode()) * 1000003;
        long j10 = this.f50740f;
        return ((int) ((j10 >>> 32) ^ j10)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f50736b);
        sb2.append(", variantId=");
        sb2.append(this.f50737c);
        sb2.append(", parameterKey=");
        sb2.append(this.f50738d);
        sb2.append(", parameterValue=");
        sb2.append(this.f50739e);
        sb2.append(", templateVersion=");
        return defpackage.e.r(sb2, this.f50740f, "}");
    }
}
