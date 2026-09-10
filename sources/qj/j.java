package qj;

import java.util.List;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f49065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f49066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f49067d;

    public j(long j10, long j11, long j12, long j13) {
        this.f49064a = j10;
        this.f49065b = j11;
        this.f49066c = j12;
        this.f49067d = j13;
    }

    public final List a() {
        return xj.o.Q(Long.valueOf(this.f49064a), Long.valueOf(this.f49065b), Long.valueOf(this.f49066c), Long.valueOf(this.f49067d));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i0.B(a(), ((j) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        StringBuilder sbL = wi.d.l(this.f49064a, "InitializationEvent(duration=", ", width=");
        sbL.append(this.f49065b);
        q4.a.r(sbL, ", height=", this.f49066c, ", rotationCorrection=");
        return defpackage.e.r(sbL, this.f49067d, ")");
    }
}
