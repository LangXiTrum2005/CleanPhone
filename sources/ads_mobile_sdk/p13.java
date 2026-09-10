package ads_mobile_sdk;

import java.util.Arrays;
import java.util.UUID;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p13 {
    public final UUID a;
    public final o12[] b;

    public p13(UUID rootTraceId, o12[] perTraceMeta) {
        Intrinsics.checkNotNullParameter(rootTraceId, "rootTraceId");
        Intrinsics.checkNotNullParameter(perTraceMeta, "perTraceMeta");
        this.a = rootTraceId;
        this.b = perTraceMeta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p13)) {
            return false;
        }
        p13 p13Var = (p13) obj;
        return Intrinsics.wireman(this.a, p13Var.a) && Intrinsics.wireman(this.b, p13Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TraceSnapshot(rootTraceId=" + this.a + ", perTraceMeta=" + Arrays.toString(this.b) + ")";
    }
}
