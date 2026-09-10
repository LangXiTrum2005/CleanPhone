package hj;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f42382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f42383b;

    public j(Map map, Map map2) {
        this.f42382a = map;
        this.f42383b = map2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(j.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        j jVar = (j) obj;
        return j1.f.n(this.f42382a, jVar.f42382a) && j1.f.n(this.f42383b, jVar.f42383b);
    }

    public final int hashCode() {
        return j1.f.o(this.f42383b) + ((j1.f.o(this.f42382a) + (j.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TraceAttributes(metrics=" + this.f42382a + ", attributes=" + this.f42383b + ")";
    }
}
