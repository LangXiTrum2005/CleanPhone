package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.MemorySignals;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class cf1 implements eliminate {
    public final long a;
    public final long b;
    public final long c;
    public final int d;

    public cf1(long j, long j2, long j3, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        MemorySignals memorySignals = signals.deviceSignals.memorySignals;
        memorySignals.runtimeFreeMemory = Long.valueOf(this.a);
        memorySignals.runtimeMaxMemory = Long.valueOf(this.b);
        memorySignals.runtimeTotalMemory = Long.valueOf(this.c);
        memorySignals.webviewCount = Integer.valueOf(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf1)) {
            return false;
        }
        cf1 cf1Var = (cf1) obj;
        return this.a == cf1Var.a && this.b == cf1Var.b && this.c == cf1Var.c && this.d == cf1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((Long.hashCode(this.c) + ((Long.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MemorySignal(runtimeFreeMemory=" + this.a + ", runtimeMaxMemory=" + this.b + ", runtimeTotalMemory=" + this.c + ", webviewCount=" + this.d + ")";
    }
}
