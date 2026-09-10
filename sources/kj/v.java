package kj;

import cc.a2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f44715a;

    public v(Long l) {
        this.f44715a = l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(v.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return a2.g(this.f44715a, ((v) obj).f44715a);
    }

    public final int hashCode() {
        return a2.i(this.f44715a) + (v.class.hashCode() * 31);
    }

    public final String toString() {
        return "VideoSelectionOptions(maxDurationSeconds=" + this.f44715a + ")";
    }
}
