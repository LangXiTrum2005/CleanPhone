package acidy;

import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lacidy/competently;", "", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;", "ad", "<init>", "(Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;)V", "attabal", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;", "()Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final NativeAd ad;

    public competently(NativeAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.ad = ad;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final NativeAd getAd() {
        return this.ad;
    }
}
