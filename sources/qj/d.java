package qj;

import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49036a;

    public d(String str) {
        this.f49036a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i0.B(j1.f.C(this.f49036a), j1.f.C(((d) obj).f49036a));
    }

    public final int hashCode() {
        return j1.f.C(this.f49036a).hashCode();
    }

    public final String toString() {
        return defpackage.e.o("AudioTrackChangedEvent(selectedTrackId=", this.f49036a, ")");
    }
}
