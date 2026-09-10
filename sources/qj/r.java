package qj;

import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49083a;

    public r(long j10) {
        this.f49083a = j10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i0.B(j1.f.C(Long.valueOf(this.f49083a)), j1.f.C(Long.valueOf(((r) obj).f49083a)));
    }

    public final int hashCode() {
        return j1.f.C(Long.valueOf(this.f49083a)).hashCode();
    }

    public final String toString() {
        return defpackage.e.j(this.f49083a, "PlatformVideoViewCreationParams(playerId=", ")");
    }
}
