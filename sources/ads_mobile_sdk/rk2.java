package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class rk2 implements eliminate {
    public final String a;

    public rk2(String signalType) {
        Intrinsics.checkNotNullParameter(signalType, "signalType");
        this.a = signalType;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.signalType = this.a;
        signals.isScarRequest = Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rk2) && Intrinsics.wireman(this.a, ((rk2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScarSignalTypeSignal(signalType=" + this.a + ")";
    }
}
