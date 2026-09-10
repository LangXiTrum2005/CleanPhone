package saneness;

import ads_mobile_sdk.h51;
import ads_mobile_sdk.k41;
import ads_mobile_sdk.kn0;
import ads_mobile_sdk.rn0;
import ads_mobile_sdk.tn0;
import com.google.android.libraries.ads.mobile.sdk.initialization.AdapterStatus;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import java.util.List;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class humidify {
    public static h51 attabal(humidify humidifyVar, AdapterStatus.InitializationState initializationState, String str, int i) {
        if ((i & 1) != 0) {
            initializationState = AdapterStatus.InitializationState.NOT_STARTED;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        humidifyVar.getClass();
        return new h51(initializationState, str, 0);
    }

    public static spartacist saneness(List nativeAdTypes, List customFormatIds, liquory.attabal attabalVar, Integer num) {
        Intrinsics.checkNotNullParameter(nativeAdTypes, "nativeAdTypes");
        Intrinsics.checkNotNullParameter(customFormatIds, "customFormatIds");
        if (nativeAdTypes.isEmpty()) {
            return new rn0("Native ad types cannot be empty.", k41.INVALID_REQUEST);
        }
        NativeAd.NativeAdType nativeAdType = NativeAd.NativeAdType.CUSTOM_NATIVE;
        if (nativeAdTypes.contains(nativeAdType) && customFormatIds.isEmpty()) {
            return new rn0("When requesting custom native ads, you must set at least one custom format ID.", k41.INVALID_REQUEST);
        }
        NativeAd.NativeAdType nativeAdType2 = NativeAd.NativeAdType.BANNER;
        if (nativeAdTypes.contains(nativeAdType2) && nativeAdTypes.size() == 1) {
            return new rn0("A native ad request for banner ads only is not allowed. Suggested action: Use BannerAd to request banner ads.", k41.INVALID_REQUEST);
        }
        if (nativeAdTypes.contains(nativeAdType2) && attabalVar == null) {
            return new rn0("When requesting a banner ad, you must set at least one AdSize. Suggested action: Call NativeRequest.setAdSizes() with at least one ad size.", k41.INVALID_REQUEST);
        }
        if (num != null && num.intValue() < 1) {
            return new rn0("Number of ads requested must be greater than 0.", k41.INVALID_REQUEST);
        }
        if (!customFormatIds.isEmpty() && !nativeAdTypes.contains(nativeAdType)) {
            kn0.c("Custom native ad format IDs were provided, but custom native ads were not requested.", null);
        }
        if (attabalVar != null && !nativeAdTypes.contains(nativeAdType2)) {
            kn0.c("AdSize was provided, but banner ads were not requested. Suggested action: Update NativeRequest.nativeAdTypes to add NativeAdType.BANNER.", null);
        }
        return new tn0(Unit.f29295attabal);
    }
}
