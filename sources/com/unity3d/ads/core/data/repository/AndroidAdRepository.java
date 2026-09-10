package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidAdRepository;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "<init>", "()V", "Lcom/google/protobuf/ByteString;", "opportunityId", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lwj/r;", "addAd", "(Lcom/google/protobuf/ByteString;Lcom/unity3d/ads/core/data/model/AdObject;)V", "getAd", "(Lcom/google/protobuf/ByteString;)Lcom/unity3d/ads/core/data/model/AdObject;", "", "placementId", "pollOpportunityIdForPlacement", "(Ljava/lang/String;)Lcom/google/protobuf/ByteString;", "enqueueOpportunityForPlacement", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;)V", "removeAd", "(Lcom/google/protobuf/ByteString;)V", "", "hasOpportunityId", "(Lcom/google/protobuf/ByteString;)Z", "", "getAllAds", "()Ljava/util/Map;", "Ljava/util/concurrent/ConcurrentHashMap;", "loadedAds", "Ljava/util/concurrent/ConcurrentHashMap;", "", "placementsLoadedAds", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidAdRepository implements AdRepository {
    private final ConcurrentHashMap<ByteString, AdObject> loadedAds = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, List<ByteString>> placementsLoadedAds = new ConcurrentHashMap<>();

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void addAd(ByteString opportunityId, AdObject adObject) {
        n.f(opportunityId, "opportunityId");
        n.f(adObject, "adObject");
        this.loadedAds.put(opportunityId, adObject);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void enqueueOpportunityForPlacement(String placementId, ByteString opportunityId) {
        List<ByteString> listPutIfAbsent;
        n.f(placementId, "placementId");
        n.f(opportunityId, "opportunityId");
        ConcurrentHashMap<String, List<ByteString>> concurrentHashMap = this.placementsLoadedAds;
        List<ByteString> arrayList = concurrentHashMap.get(placementId);
        if (arrayList == null && (listPutIfAbsent = concurrentHashMap.putIfAbsent(placementId, (arrayList = new ArrayList<>()))) != null) {
            arrayList = listPutIfAbsent;
        }
        arrayList.add(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public AdObject getAd(ByteString opportunityId) {
        n.f(opportunityId, "opportunityId");
        return this.loadedAds.get(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Map<ByteString, AdObject> getAllAds() {
        return b0.X(this.loadedAds);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public boolean hasOpportunityId(ByteString opportunityId) {
        n.f(opportunityId, "opportunityId");
        return this.loadedAds.containsKey(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public ByteString pollOpportunityIdForPlacement(String placementId) {
        n.f(placementId, "placementId");
        List<ByteString> list = this.placementsLoadedAds.get(placementId);
        if (list != null) {
            return list.isEmpty() ? null : list.remove(0);
        }
        return null;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void removeAd(ByteString opportunityId) {
        n.f(opportunityId, "opportunityId");
        this.loadedAds.remove(opportunityId);
    }
}
