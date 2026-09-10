package liquory;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lliquory/wireman;", "", "", "attabal", "()V", "Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;", "adError", "saneness", "(Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;)V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface wireman {
    default void saneness(LoadAdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
    }

    default void attabal() {
    }
}
