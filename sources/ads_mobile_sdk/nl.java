package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.BatterySignals;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class nl implements eliminate {
    public final double a;
    public final boolean b;

    public nl(double d, boolean z) {
        this.a = d;
        this.b = z;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        BatterySignals batterySignals = signals.deviceSignals.batterySignals;
        batterySignals.isCharging = this.b;
        batterySignals.batteryLevel = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl)) {
            return false;
        }
        nl nlVar = (nl) obj;
        return Double.compare(this.a, nlVar.a) == 0 && this.b == nlVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = Double.hashCode(this.a) * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        return "BatterySignal(batteryLevel=" + this.a + ", isCharging=" + this.b + ")";
    }
}
