package svd;

import com.google.gson.annotations.SerializedName;
import com.ironsource.X3;
import p002kotlin.Metadata;

/* JADX INFO: renamed from: svd.marial, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lsvd/marial;", "", "", "attabal", "Z", X3.j.k0, "", "saneness", "D", X3.j.Y, "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class BatterySignals {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("is_charging")
    public boolean isCharging;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("battery_level")
    public double batteryLevel;

    public BatterySignals() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatterySignals)) {
            return false;
        }
        BatterySignals batterySignals = (BatterySignals) obj;
        return this.isCharging == batterySignals.isCharging && Double.compare(this.batteryLevel, batterySignals.batteryLevel) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.isCharging;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return Double.hashCode(this.batteryLevel) + (r0 * 31);
    }

    public final String toString() {
        return "BatterySignals(isCharging=" + this.isCharging + ", batteryLevel=" + this.batteryLevel + ")";
    }

    public BatterySignals(double d, boolean z) {
        this.isCharging = z;
        this.batteryLevel = d;
    }

    public /* synthetic */ BatterySignals(int i) {
        this(0.0d, false);
    }
}
