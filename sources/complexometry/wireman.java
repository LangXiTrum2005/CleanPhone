package complexometry;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.ironsource.If;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcomplexometry/wireman;", "AdT", "", "ad", "", If.j, "(Ljava/lang/Object;)V", "Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;", "adError", "onAdFailedToLoad", "(Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;)V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface wireman<AdT> {
    default void onAdFailedToLoad(LoadAdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
    }

    default void onAdLoaded(AdT ad) {
    }
}
