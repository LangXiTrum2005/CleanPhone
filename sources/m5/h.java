package m5;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45881b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f45881b != hVar.f45881b) {
            return false;
        }
        return this.f45880a.equals(hVar.f45880a);
    }

    public final int hashCode() {
        return v0.i.c(this.f45881b) + (this.f45880a.hashCode() * 31);
    }
}
