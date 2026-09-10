package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class s02 implements eliminate {
    public final rc2 a;

    public s02(rc2 recursiveAdData) {
        Intrinsics.checkNotNullParameter(recursiveAdData, "recursiveAdData");
        this.a = recursiveAdData;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        rc2 rc2Var = this.a;
        signals.parentAdConfig = rc2Var.a;
        signals.parentCommonConfig = rc2Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s02) && Intrinsics.wireman(this.a, ((s02) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ParentAdConfigSignal(recursiveAdData=" + this.a + ")";
    }
}
