package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class i6 implements eliminate {
    public final String a;

    public i6(String querySignal) {
        Intrinsics.checkNotNullParameter(querySignal, "querySignal");
        this.a = querySignal;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.adShieldSignal = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6) && Intrinsics.wireman(this.a, ((i6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AdSpamSignal(querySignal=" + this.a + ")";
    }
}
