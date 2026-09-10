package androidx.privacysandbox.ads.adservices.appsetid;

import android.support.v4.media.a;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", "", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppSetId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7921b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId$Companion;", "", "", "SCOPE_APP", "I", "SCOPE_DEVELOPER", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public AppSetId(String str, int i2) {
        this.f7920a = str;
        this.f7921b = i2;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("Scope undefined.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return this.f7920a.equals(appSetId.f7920a) && this.f7921b == appSetId.f7921b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7921b) + (this.f7920a.hashCode() * 31);
    }

    public final String toString() {
        return a.s(new StringBuilder("AppSetId: id="), this.f7920a, ", scope=", this.f7921b == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
