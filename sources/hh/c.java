package hh;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f42352a;

    public c(Map map) {
        this.f42352a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f42352a.equals(((c) obj).f42352a);
    }

    public final int hashCode() {
        return this.f42352a.hashCode();
    }

    public final String toString() {
        return "CGAssetsFileStorage(assetsDictionary=" + this.f42352a + ")";
    }
}
