package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class rf0 implements eliminate {
    public final String a;

    public rf0(String experimentIds) {
        Intrinsics.checkNotNullParameter(experimentIds, "experimentIds");
        this.a = experimentIds;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        if (StringsKt.empress(this.a)) {
            return;
        }
        signals.experimentIds = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rf0) && Intrinsics.wireman(this.a, ((rf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ExperimentIdsSignal(experimentIds=" + this.a + ")";
    }
}
