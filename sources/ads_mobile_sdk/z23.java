package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class z23 implements eliminate {
    public final String a;

    public z23(String str) {
        this.a = str;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        String str = this.a;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                signals.personallyIdentifiableInformation.adsId = str;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z23) && Intrinsics.wireman(this.a, ((z23) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "TrustlessTokenSignal(trustlessToken=" + this.a + ")";
    }
}
