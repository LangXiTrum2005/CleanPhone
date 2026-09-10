package hh;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42353a;

    public d(Map map) {
        this.f42353a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f42353a.equals(((d) obj).f42353a);
    }

    public final int hashCode() {
        return this.f42353a.hashCode();
    }

    public final String toString() {
        return "DuplicateReferenceStorage(duplicates=" + this.f42353a + ")";
    }
}
