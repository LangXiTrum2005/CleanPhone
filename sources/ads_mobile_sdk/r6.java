package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class r6 implements eliminate {
    public final List a;

    public r6(ArrayList adTypes) {
        Intrinsics.checkNotNullParameter(adTypes, "adTypes");
        this.a = adTypes;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.adTypes.addAll(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6) && Intrinsics.wireman(this.a, ((r6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AdTypeSignal(adTypes=" + this.a + ")";
    }
}
