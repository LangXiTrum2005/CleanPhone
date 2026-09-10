package cc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6155a;

    public l1(List list) {
        this.f6155a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        return this.f6155a.equals(((l1) ((p2) obj)).f6155a);
    }

    public final int hashCode() {
        return this.f6155a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f6155a + "}";
    }
}
