package h6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f42221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f42223c;

    public d(e eVar) {
        this.f42221a = eVar;
    }

    @Override // h6.g
    public final void a() {
        this.f42221a.D0(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f42222b == dVar.f42222b && this.f42223c == dVar.f42223c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f42222b * 31;
        Class cls = this.f42223c;
        return i10 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f42222b + "array=" + this.f42223c + '}';
    }
}
