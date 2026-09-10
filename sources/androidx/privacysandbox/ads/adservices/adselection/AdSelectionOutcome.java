package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdSelectionOutcome {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f7917b;

    @ExperimentalFeatures.Ext10OptIn
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome$Companion;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        Uri EMPTY = Uri.EMPTY;
        Intrinsics.e(EMPTY, "EMPTY");
        new AdSelectionOutcome(0L, EMPTY);
    }

    public AdSelectionOutcome(long j, Uri uri) {
        this.f7916a = j;
        this.f7917b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionOutcome)) {
            return false;
        }
        AdSelectionOutcome adSelectionOutcome = (AdSelectionOutcome) obj;
        return this.f7916a == adSelectionOutcome.f7916a && Intrinsics.a(this.f7917b, adSelectionOutcome.f7917b);
    }

    public final int hashCode() {
        return this.f7917b.hashCode() + (Long.hashCode(this.f7916a) * 31);
    }

    public final String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.f7916a + ", renderUri=" + this.f7917b;
    }

    public AdSelectionOutcome(android.adservices.adselection.AdSelectionOutcome response) {
        Intrinsics.f(response, "response");
        long adSelectionId = response.getAdSelectionId();
        Uri renderUri = response.getRenderUri();
        Intrinsics.e(renderUri, "response.renderUri");
        this.f7916a = adSelectionId;
        this.f7917b = renderUri;
    }
}
