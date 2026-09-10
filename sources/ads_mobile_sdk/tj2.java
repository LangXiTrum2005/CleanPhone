package ads_mobile_sdk;

import com.google.gson.Gson;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.eliminate;
import svd.arytenoidectomy;

/* JADX INFO: loaded from: classes.dex */
public final class tj2 implements eliminate {
    public final List a;

    public tj2(List rtbAdapterDataList) {
        Intrinsics.checkNotNullParameter(rtbAdapterDataList, "rtbAdapterDataList");
        this.a = rtbAdapterDataList;
    }

    @Override // saneness.eliminate
    public final void a(arytenoidectomy signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        signals.realTimeBiddingSignals = new Gson().toJson(this.a);
        signals.dern(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tj2) && Intrinsics.wireman(this.a, ((tj2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RtbSignal(rtbAdapterDataList=" + this.a + ")";
    }
}
