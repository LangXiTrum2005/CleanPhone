package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class wi implements eliminate {
    public final boolean a;

    public wi(boolean z) {
        this.a = z;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.isBannerRefreshRequest = Boolean.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi) && this.a == ((wi) obj).a;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "BannerRefreshSignal(isRefreshRequest=" + this.a + ")";
    }
}
