package wj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f53275e = new c(2, 2, 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53279d;

    public c(int i10, int i11, int i12) {
        this.f53276a = i10;
        this.f53277b = i11;
        this.f53278c = i12;
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            this.f53279d = (i10 << 16) + (i11 << 8) + i12;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c other = (c) obj;
        kotlin.jvm.internal.n.f(other, "other");
        return this.f53279d - other.f53279d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && this.f53279d == cVar.f53279d;
    }

    public final int hashCode() {
        return this.f53279d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f53276a);
        sb2.append('.');
        sb2.append(this.f53277b);
        sb2.append('.');
        sb2.append(this.f53278c);
        return sb2.toString();
    }
}
