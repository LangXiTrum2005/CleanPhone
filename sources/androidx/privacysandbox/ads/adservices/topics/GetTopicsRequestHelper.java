package androidx.privacysandbox.ads.adservices.topics;

import com.google.android.gms.ads.MobileAds;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequestHelper;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetTopicsRequestHelper {
    public static android.adservices.topics.GetTopicsRequest a(GetTopicsRequest request) {
        Intrinsics.f(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = androidx.privacysandbox.ads.adservices.customaudience.a.i().setAdsSdkName(MobileAds.ERROR_DOMAIN).setShouldRecordObservation(request.f7958a).build();
        Intrinsics.e(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }
}
