package androidx.privacysandbox.ads.adservices.adid;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdId;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7902b;

    public AdId(String str, boolean z2) {
        this.f7901a = str;
        this.f7902b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdId)) {
            return false;
        }
        AdId adId = (AdId) obj;
        return Intrinsics.a(this.f7901a, adId.f7901a) && this.f7902b == adId.f7902b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7902b) + (this.f7901a.hashCode() * 31);
    }

    public final String toString() {
        return "AdId: adId=" + this.f7901a + ", isLimitAdTrackingEnabled=" + this.f7902b;
    }
}
