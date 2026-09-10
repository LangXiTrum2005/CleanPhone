package hj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f42381b;

    public i(String str, g gVar) {
        this.f42380a = str;
        this.f42381b = gVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(i.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        i iVar = (i) obj;
        return j1.f.n(this.f42380a, iVar.f42380a) && j1.f.n(this.f42381b, iVar.f42381b);
    }

    public final int hashCode() {
        return j1.f.o(this.f42381b) + ((j1.f.o(this.f42380a) + (i.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "HttpMetricOptions(url=" + this.f42380a + ", httpMethod=" + this.f42381b + ")";
    }
}
