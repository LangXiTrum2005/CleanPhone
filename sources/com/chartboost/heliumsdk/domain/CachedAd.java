package com.chartboost.heliumsdk.domain;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.x4;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006'"}, d2 = {"Lcom/chartboost/heliumsdk/domain/CachedAd;", "", "auctionId", "", "(Ljava/lang/String;)V", "getAuctionId", "()Ljava/lang/String;", "customData", "getCustomData", "setCustomData", "ilrdJson", "Lkotlinx/serialization/json/JsonObject;", "getIlrdJson", "()Lkotlinx/serialization/json/JsonObject;", "setIlrdJson", "(Lkotlinx/serialization/json/JsonObject;)V", "loadId", "getLoadId", "setLoadId", "partnerAd", "Lcom/chartboost/heliumsdk/domain/PartnerAd;", "getPartnerAd", "()Lcom/chartboost/heliumsdk/domain/PartnerAd;", "setPartnerAd", "(Lcom/chartboost/heliumsdk/domain/PartnerAd;)V", "winningBidInfo", "", "getWinningBidInfo", "()Ljava/util/Map;", "setWinningBidInfo", "(Ljava/util/Map;)V", "component1", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CachedAd {
    private final String auctionId;
    private String customData;
    private JsonObject ilrdJson;
    private String loadId;
    private PartnerAd partnerAd;
    private Map<String, String> winningBidInfo;

    public CachedAd(String auctionId) {
        Intrinsics.f(auctionId, "auctionId");
        this.auctionId = auctionId;
        this.loadId = "";
        this.customData = "";
        this.winningBidInfo = EmptyMap.X;
    }

    public static /* synthetic */ CachedAd copy$default(CachedAd cachedAd, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cachedAd.auctionId;
        }
        return cachedAd.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuctionId() {
        return this.auctionId;
    }

    public final CachedAd copy(String auctionId) {
        Intrinsics.f(auctionId, "auctionId");
        return new CachedAd(auctionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CachedAd) && Intrinsics.a(this.auctionId, ((CachedAd) other).auctionId);
    }

    public final String getAuctionId() {
        return this.auctionId;
    }

    public final String getCustomData() {
        return this.customData;
    }

    public final JsonObject getIlrdJson() {
        return this.ilrdJson;
    }

    public final String getLoadId() {
        return this.loadId;
    }

    public final PartnerAd getPartnerAd() {
        return this.partnerAd;
    }

    public final Map<String, String> getWinningBidInfo() {
        return this.winningBidInfo;
    }

    public int hashCode() {
        return this.auctionId.hashCode();
    }

    public final void setCustomData(String str) {
        Intrinsics.f(str, "<set-?>");
        this.customData = str;
    }

    public final void setIlrdJson(JsonObject jsonObject) {
        this.ilrdJson = jsonObject;
    }

    public final void setLoadId(String str) {
        Intrinsics.f(str, "<set-?>");
        this.loadId = str;
    }

    public final void setPartnerAd(PartnerAd partnerAd) {
        this.partnerAd = partnerAd;
    }

    public final void setWinningBidInfo(Map<String, String> map) {
        Intrinsics.f(map, "<set-?>");
        this.winningBidInfo = map;
    }

    public String toString() {
        return a.p(new StringBuilder("CachedAd(auctionId="), this.auctionId, ')');
    }
}
