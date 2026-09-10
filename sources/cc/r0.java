package cc;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f6256i;

    public r0(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f6248a = i10;
        this.f6249b = str;
        this.f6250c = i11;
        this.f6251d = j10;
        this.f6252e = j11;
        this.f6253f = z10;
        this.f6254g = i12;
        this.f6255h = str2;
        this.f6256i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c2) {
            r0 r0Var = (r0) ((c2) obj);
            if (this.f6248a == r0Var.f6248a && this.f6249b.equals(r0Var.f6249b) && this.f6250c == r0Var.f6250c && this.f6251d == r0Var.f6251d && this.f6252e == r0Var.f6252e && this.f6253f == r0Var.f6253f && this.f6254g == r0Var.f6254g && this.f6255h.equals(r0Var.f6255h) && this.f6256i.equals(r0Var.f6256i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f6248a ^ 1000003) * 1000003) ^ this.f6249b.hashCode()) * 1000003) ^ this.f6250c) * 1000003;
        long j10 = this.f6251d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f6252e;
        return this.f6256i.hashCode() ^ ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f6253f ? 1231 : 1237)) * 1000003) ^ this.f6254g) * 1000003) ^ this.f6255h.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f6248a);
        sb2.append(", model=");
        sb2.append(this.f6249b);
        sb2.append(", cores=");
        sb2.append(this.f6250c);
        sb2.append(", ram=");
        sb2.append(this.f6251d);
        sb2.append(", diskSpace=");
        sb2.append(this.f6252e);
        sb2.append(", simulator=");
        sb2.append(this.f6253f);
        sb2.append(", state=");
        sb2.append(this.f6254g);
        sb2.append(", manufacturer=");
        sb2.append(this.f6255h);
        sb2.append(", modelClass=");
        return defpackage.e.q(this.f6256i, "}", sb2);
    }
}
