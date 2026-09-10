package kj;

import cc.a2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f44706a;

    public r(q qVar) {
        this.f44706a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(r.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return a2.g(this.f44706a, ((r) obj).f44706a);
    }

    public final int hashCode() {
        return a2.i(this.f44706a) + (r.class.hashCode() * 31);
    }

    public final String toString() {
        return "MediaSelectionOptions(imageSelectionOptions=" + this.f44706a + ")";
    }
}
