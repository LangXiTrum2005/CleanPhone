package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class lv0 implements eliminate {
    public final Map a;

    public lv0(Map inMemorySdkCoreData) {
        Intrinsics.checkNotNullParameter(inMemorySdkCoreData, "inMemorySdkCoreData");
        this.a = inMemorySdkCoreData;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        if (this.a.isEmpty()) {
            return;
        }
        signals.inMemorySdkCoreData = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv0) && Intrinsics.wireman(this.a, ((lv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InMemorySdkCoreDataSignal(inMemorySdkCoreData=" + this.a + ")";
    }
}
