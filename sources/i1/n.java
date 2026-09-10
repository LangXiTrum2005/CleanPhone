package i1;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f42581a;

    public n(SparseBooleanArray sparseBooleanArray) {
        this.f42581a = sparseBooleanArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f42581a.equals(((n) obj).f42581a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42581a.hashCode();
    }
}
