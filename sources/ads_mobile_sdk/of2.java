package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class of2 implements eliminate {
    public final String a;

    public of2(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.a = requestId;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.requestId = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof of2) && Intrinsics.wireman(this.a, ((of2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestIdSignal(requestId=" + this.a + ")";
    }
}
