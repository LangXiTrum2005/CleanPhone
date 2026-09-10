package qj;

import java.util.List;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f49085b;

    public s(long j10, long j11) {
        this.f49084a = j10;
        this.f49085b = j11;
    }

    public final List a() {
        return xj.o.Q(Long.valueOf(this.f49084a), Long.valueOf(this.f49085b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i0.B(a(), ((s) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return defpackage.e.r(wi.d.l(this.f49084a, "PlaybackState(playPosition=", ", bufferPosition="), this.f49085b, ")");
    }
}
