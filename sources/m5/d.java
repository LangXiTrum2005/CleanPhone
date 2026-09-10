package m5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45875b;

    public d(String str, int i10) {
        this.f45874a = str;
        this.f45875b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f45875b != dVar.f45875b) {
            return false;
        }
        return this.f45874a.equals(dVar.f45874a);
    }

    public final int hashCode() {
        return (this.f45874a.hashCode() * 31) + this.f45875b;
    }
}
