package a7;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f3440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f3441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f3442c;

    public n(Class cls, Class cls2, Class cls3) {
        this.f3440a = cls;
        this.f3441b = cls2;
        this.f3442c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f3440a.equals(nVar.f3440a) && this.f3441b.equals(nVar.f3441b) && p.b(this.f3442c, nVar.f3442c);
    }

    public final int hashCode() {
        int iHashCode = (this.f3441b.hashCode() + (this.f3440a.hashCode() * 31)) * 31;
        Class cls = this.f3442c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f3440a + ", second=" + this.f3441b + '}';
    }
}
