package cc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f6083i;

    public f0(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f6075a = i10;
        this.f6076b = str;
        this.f6077c = i11;
        this.f6078d = i12;
        this.f6079e = j10;
        this.f6080f = j11;
        this.f6081g = j12;
        this.f6082h = str2;
        this.f6083i = list;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            f0 f0Var = (f0) ((u1) obj);
            List list2 = f0Var.f6083i;
            String str2 = f0Var.f6082h;
            if (this.f6075a == f0Var.f6075a && this.f6076b.equals(f0Var.f6076b) && this.f6077c == f0Var.f6077c && this.f6078d == f0Var.f6078d && this.f6079e == f0Var.f6079e && this.f6080f == f0Var.f6080f && this.f6081g == f0Var.f6081g && ((str = this.f6082h) != null ? str.equals(str2) : str2 == null) && ((list = this.f6083i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f6075a ^ 1000003) * 1000003) ^ this.f6076b.hashCode()) * 1000003) ^ this.f6077c) * 1000003) ^ this.f6078d) * 1000003;
        long j10 = this.f6079e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f6080f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f6081g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f6082h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f6083i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f6075a + ", processName=" + this.f6076b + ", reasonCode=" + this.f6077c + ", importance=" + this.f6078d + ", pss=" + this.f6079e + ", rss=" + this.f6080f + ", timestamp=" + this.f6081g + ", traceFile=" + this.f6082h + ", buildIdMappingForArch=" + this.f6083i + "}";
    }
}
