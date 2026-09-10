package complexometry;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import complexometry.attabal;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003:\u0002\u0004\u0005\u0082\u0001\u0002\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcomplexometry/marial;", "Lcomplexometry/attabal;", "AdT", "", "attabal", "saneness", "Lcomplexometry/marial$attabal;", "Lcomplexometry/marial$saneness;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface marial<AdT extends complexometry.attabal> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcomplexometry/marial$attabal;", "Lcomplexometry/attabal;", "AdT", "Lcomplexometry/marial;", "Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;", "error", "<init>", "(Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;)V", "attabal", "Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;", "getError", "()Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class attabal<AdT extends complexometry.attabal> implements marial<AdT> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final LoadAdError error;

        public attabal(LoadAdError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcomplexometry/marial$saneness;", "Lcomplexometry/attabal;", "AdT", "Lcomplexometry/marial;", "ad", "<init>", "(Lcomplexometry/attabal;)V", "attabal", "Lcomplexometry/attabal;", "()Lcomplexometry/attabal;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class saneness<AdT extends complexometry.attabal> implements marial<AdT> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final complexometry.attabal ad;

        public saneness(AdT ad) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            this.ad = ad;
        }

        public final AdT attabal() {
            return (AdT) this.ad;
        }
    }
}
