package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;
import saneness.eliminate;
import svd.DeviceSignals;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class ww2 implements eliminate {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public ww2(String carrierCode, int i, int i2, int i3, boolean z, int i4) {
        Intrinsics.checkNotNullParameter(carrierCode, "carrierCode");
        this.a = carrierCode;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww2)) {
            return false;
        }
        ww2 ww2Var = (ww2) obj;
        return Intrinsics.wireman(this.a, ww2Var.a) && this.b == ww2Var.b && this.c == ww2Var.c && this.d == ww2Var.d && this.e == ww2Var.e && this.f == ww2Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final int hashCode() {
        int iAttabal = bonny.attabal(this.d, bonny.attabal(this.c, bonny.attabal(this.b, this.a.hashCode() * 31, 31), 31), 31);
        boolean z = this.e;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return Integer.hashCode(this.f) + ((iAttabal + r2) * 31);
    }

    public final String toString() {
        return "TelephonySignal(carrierCode=" + this.a + ", networkTypeCoarse=" + this.b + ", networkTypeFine=" + this.c + ", phoneType=" + this.d + ", isActiveNetworkMetered=" + this.e + ", activeNetworkState=" + this.f + ")";
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.carrierCode = this.a;
        signals.networkTypeCoarse = Integer.valueOf(this.b);
        signals.networkTypeFine = Integer.valueOf(this.c);
        signals.com.ironsource.X3.j.S java.lang.String = Integer.valueOf(this.d);
        DeviceSignals deviceSignals = signals.deviceSignals;
        deviceSignals.networkSignals.isActiveNetworkMetered = Boolean.valueOf(this.e);
        deviceSignals.networkSignals.activeNetworkState = Integer.valueOf(this.f);
    }
}
