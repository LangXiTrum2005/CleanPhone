package pk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f48400d = new c(1, 0, 1);

    @Override // pk.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f48393a == cVar.f48393a && this.f48394b == cVar.f48394b;
    }

    @Override // pk.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f48393a * 31) + this.f48394b;
    }

    @Override // pk.a
    public final boolean isEmpty() {
        return this.f48393a > this.f48394b;
    }

    @Override // pk.a
    public final String toString() {
        return this.f48393a + ".." + this.f48394b;
    }
}
