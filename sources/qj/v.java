package qj;

import java.util.List;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f49089b;

    public v(long j10, long j11) {
        this.f49088a = j10;
        this.f49089b = j11;
    }

    public final List a() {
        return xj.o.Q(Long.valueOf(this.f49088a), Long.valueOf(this.f49089b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i0.B(a(), ((v) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return defpackage.e.r(wi.d.l(this.f49088a, "TexturePlayerIds(playerId=", ", textureId="), this.f49089b, ")");
    }
}
