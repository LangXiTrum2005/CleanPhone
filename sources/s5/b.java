package s5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50144b;

    public b(int i10, String str) {
        this.f50143a = i10;
        this.f50144b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f50143a == bVar.f50143a && this.f50144b.equals(bVar.f50144b);
    }

    public final int hashCode() {
        return this.f50144b.hashCode() + (Integer.hashCode(this.f50143a) * 31);
    }

    public final String toString() {
        return "AddressLabelPair(label=" + this.f50143a + ", customLabel=" + this.f50144b + ")";
    }
}
