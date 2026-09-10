package i1;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f42555a;

    static {
        new SparseBooleanArray();
        go.k.t(!false);
        l1.y.G(0);
    }

    public h0(n nVar) {
        this.f42555a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            return this.f42555a.equals(((h0) obj).f42555a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42555a.f42581a.hashCode();
    }
}
