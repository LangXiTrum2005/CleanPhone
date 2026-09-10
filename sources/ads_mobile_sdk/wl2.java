package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;
import saneness.eliminate;
import saneness.licking;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class wl2 implements eliminate {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public wl2(String afmaVersion, String additionalCapabilities, int i, String externalVersion, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(additionalCapabilities, "additionalCapabilities");
        Intrinsics.checkNotNullParameter(externalVersion, "externalVersion");
        this.a = afmaVersion;
        this.b = additionalCapabilities;
        this.c = i;
        this.d = externalVersion;
        this.e = z;
        this.f = z2;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.afmaVersion = this.a;
        signals.isDecagon = true;
        signals.additionalCapabilities = this.b;
        signals.targetApi = Integer.valueOf(this.c);
        signals.granularVersion = this.d;
        signals.sdkEnvironment.isInstantApp = Boolean.valueOf(this.e);
        signals.sdkEnvironment.isPrivilegedProcess = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl2)) {
            return false;
        }
        wl2 wl2Var = (wl2) obj;
        return Intrinsics.wireman(this.a, wl2Var.a) && Intrinsics.wireman(this.b, wl2Var.b) && this.c == wl2Var.c && Intrinsics.wireman(this.d, wl2Var.d) && this.e == wl2Var.e && this.f == wl2Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final int hashCode() {
        int iAttabal = licking.attabal(this.d, bonny.attabal(this.c, licking.attabal(this.b, this.a.hashCode() * 31, 31), 31), 31);
        boolean z = this.e;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iAttabal + r2) * 31;
        boolean z2 = this.f;
        return i + (z2 ? 1 : z2);
    }

    public final String toString() {
        return "SdkEnvironmentSignal(afmaVersion=" + this.a + ", additionalCapabilities=" + this.b + ", targetApi=" + this.c + ", externalVersion=" + this.d + ", isInstantApp=" + this.e + ", isPrivilegedProcess=" + this.f + ")";
    }
}
