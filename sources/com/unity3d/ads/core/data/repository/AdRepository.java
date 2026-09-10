package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AdRepository;", "", "Lcom/google/protobuf/ByteString;", "opportunityId", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lwj/r;", "addAd", "(Lcom/google/protobuf/ByteString;Lcom/unity3d/ads/core/data/model/AdObject;)V", "getAd", "(Lcom/google/protobuf/ByteString;)Lcom/unity3d/ads/core/data/model/AdObject;", "", "placementId", "pollOpportunityIdForPlacement", "(Ljava/lang/String;)Lcom/google/protobuf/ByteString;", "enqueueOpportunityForPlacement", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;)V", "removeAd", "(Lcom/google/protobuf/ByteString;)V", "", "hasOpportunityId", "(Lcom/google/protobuf/ByteString;)Z", "", "getAllAds", "()Ljava/util/Map;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface AdRepository {
    void addAd(ByteString opportunityId, AdObject adObject);

    void enqueueOpportunityForPlacement(String placementId, ByteString opportunityId);

    AdObject getAd(ByteString opportunityId);

    Map<ByteString, AdObject> getAllAds();

    boolean hasOpportunityId(ByteString opportunityId);

    ByteString pollOpportunityIdForPlacement(String placementId);

    void removeAd(ByteString opportunityId);
}
