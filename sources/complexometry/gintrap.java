package complexometry;

import android.os.Bundle;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gintrap {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f24003attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map f24004dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Bundle f24005saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final formularize f24006wireman;

    public gintrap(String adUnitId, Bundle googleExtrasBundle, Map adSourceExtrasBundles, formularize baseRequest) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(googleExtrasBundle, "googleExtrasBundle");
        Intrinsics.checkNotNullParameter(adSourceExtrasBundles, "adSourceExtrasBundles");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        this.f24003attabal = adUnitId;
        this.f24005saneness = googleExtrasBundle;
        this.f24004dern = adSourceExtrasBundles;
        this.f24006wireman = baseRequest;
    }

    public final competently attabal() {
        return new competently(this.f24003attabal, this.f24006wireman.kowloon(), this.f24006wireman.getContentUrl(), this.f24006wireman.monoploid(), this.f24005saneness, this.f24006wireman.molybdenite(), this.f24006wireman.graveside(), this.f24004dern, this.f24006wireman.getPublisherProvidedId(), this.f24006wireman.getRequestAgent(), this.f24006wireman.getPlacementId());
    }
}
