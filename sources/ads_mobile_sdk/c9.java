package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class c9 implements eliminate {
    public final Map a;

    public c9(Map adapterNameToVersionsMap) {
        Intrinsics.checkNotNullParameter(adapterNameToVersionsMap, "adapterNameToVersionsMap");
        this.a = adapterNameToVersionsMap;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.adapterVersionData.putAll(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9) && Intrinsics.wireman(this.a, ((c9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AdapterVersionsSignal(adapterNameToVersionsMap=" + this.a + ")";
    }
}
