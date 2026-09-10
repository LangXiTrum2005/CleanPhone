package qj;

import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f49086a;

    public t(o oVar) {
        this.f49086a = oVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i0.B(j1.f.C(this.f49086a), j1.f.C(((t) obj).f49086a));
    }

    public final int hashCode() {
        return j1.f.C(this.f49086a).hashCode();
    }

    public final String toString() {
        return "PlaybackStateChangeEvent(state=" + this.f49086a + ")";
    }
}
