package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerApi31Ext11Impl;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopicsManagerApi31Ext11Impl extends TopicsManagerImplCommon {
    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public final android.adservices.topics.GetTopicsRequest b(GetTopicsRequest request) {
        Intrinsics.f(request, "request");
        return GetTopicsRequestHelper.a(request);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public final GetTopicsResponse c(android.adservices.topics.GetTopicsResponse response) {
        Intrinsics.f(response, "response");
        return GetTopicsResponseHelper.a(response);
    }
}
