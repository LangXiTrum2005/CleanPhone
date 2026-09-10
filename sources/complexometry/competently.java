package complexometry;

import android.os.Bundle;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0091\u0001\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcomplexometry/competently;", "Lcomplexometry/formularize;", "", "adUnitId", "", "categoryExclusions", "contentUrl", "", "customTargeting", "Landroid/os/Bundle;", "googleExtrasBundle", "keywords", "neighboringContentUrls", "adSourceExtrasBundles", "publisherProvidedId", "requestAgent", "", "placementId", "<init>", "(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Map;Landroid/os/Bundle;Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;J)V", "formularize", "Ljava/lang/String;", "triweekly", "()Ljava/lang/String;", "attabal", "com/google/android/libraries/ads/mobile/sdk/common/b", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public class competently extends formularize {

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public final String adUnitId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public competently(String adUnitId, Set<String> categoryExclusions, String str, Map<String, String> customTargeting, Bundle googleExtrasBundle, Set<String> keywords, Set<String> neighboringContentUrls, Map<String, Bundle> adSourceExtrasBundles, String str2, String str3, long j) {
        super(adUnitId, categoryExclusions, str, customTargeting, googleExtrasBundle, keywords, neighboringContentUrls, adSourceExtrasBundles, str2, str3, j);
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(categoryExclusions, "categoryExclusions");
        Intrinsics.checkNotNullParameter(customTargeting, "customTargeting");
        Intrinsics.checkNotNullParameter(googleExtrasBundle, "googleExtrasBundle");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        Intrinsics.checkNotNullParameter(neighboringContentUrls, "neighboringContentUrls");
        Intrinsics.checkNotNullParameter(adSourceExtrasBundles, "adSourceExtrasBundles");
        this.adUnitId = adUnitId;
    }

    @Override // complexometry.formularize
    /* JADX INFO: renamed from: triweekly, reason: from getter */
    public String getAdUnitId() {
        return this.adUnitId;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcomplexometry/competently$attabal;", "Lcomplexometry/cutely;", "", "adUnitId", "<init>", "(Ljava/lang/String;)V", "adultoid", "()Lcomplexometry/competently$attabal;", "Lcomplexometry/competently;", "graveside", "()Lcomplexometry/competently;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class attabal extends cutely<attabal> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public attabal(String adUnitId) {
            super(adUnitId);
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        }

        public final competently graveside() {
            String strWireman = getF24011attabal();
            if (strWireman != null) {
                return new competently(strWireman, getF24018saneness(), getF24015dern(), getF24020wireman(), getF24017marial(), getF24012beachfront(), getF24013competently(), getF24016impromptu(), getF24019taiyuan(), getF24014cutely(), getF24010apical());
            }
            throw new IllegalArgumentException("Ad unit ID cannot be null.");
        }

        @Override // complexometry.impassible
        /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
        public attabal kowloon() {
            return this;
        }
    }
}
