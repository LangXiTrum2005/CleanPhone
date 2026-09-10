package o8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f47206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f47207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f47208c;

    public a(Object obj, d dVar, b bVar) {
        this.f47206a = obj;
        this.f47207b = dVar;
        this.f47208c = bVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.f47208c;
            if (this.f47206a.equals(aVar.f47206a) && this.f47207b.equals(aVar.f47207b) && ((bVar = this.f47208c) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f47206a.hashCode()) * 1000003) ^ this.f47207b.hashCode()) * 1000003;
        b bVar = this.f47208c;
        return ((bVar == null ? 0 : bVar.hashCode()) ^ iHashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f47206a + ", priority=" + this.f47207b + ", productData=" + this.f47208c + ", eventContext=null}";
    }
}
