package androidx.privacysandbox.ads.adservices.signals;

import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/signals/UpdateSignalsRequest;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFeatures.Ext12OptIn
public final class UpdateSignalsRequest {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateSignalsRequest)) {
            return false;
        }
        ((UpdateSignalsRequest) obj).getClass();
        return true;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "UpdateSignalsRequest: updateUri=null";
    }
}
