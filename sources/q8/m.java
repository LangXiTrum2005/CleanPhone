package q8;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f48867a;

    public m(ArrayList arrayList) {
        this.f48867a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return this.f48867a.equals(((m) ((w) obj)).f48867a);
    }

    public final int hashCode() {
        return this.f48867a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f48867a + "}";
    }
}
