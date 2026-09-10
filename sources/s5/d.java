package s5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50148b;

    public d(int i10, String str) {
        this.f50147a = i10;
        this.f50148b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f50147a == dVar.f50147a && this.f50148b.equals(dVar.f50148b);
    }

    public final int hashCode() {
        return this.f50148b.hashCode() + (Integer.hashCode(this.f50147a) * 31);
    }

    public final String toString() {
        return "EventLabelPair(label=" + this.f50147a + ", customLabel=" + this.f50148b + ")";
    }
}
