package com.chartboost.heliumsdk.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010(\u001a\u00020)J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0096\u0002R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R-\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0018j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014`\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b#\u0010\u0016R\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Bids;", "", "Lcom/chartboost/heliumsdk/domain/Bid;", "adLoadParams", "Lcom/chartboost/heliumsdk/domain/AdLoadParams;", "bidsResponse", "Lcom/chartboost/heliumsdk/domain/BidsResponse;", "(Lcom/chartboost/heliumsdk/domain/AdLoadParams;Lcom/chartboost/heliumsdk/domain/BidsResponse;)V", "activeBid", "getActiveBid", "()Lcom/chartboost/heliumsdk/domain/Bid;", "activeBidIndex", "Ljava/util/concurrent/atomic/AtomicInteger;", "adIdentifier", "Lcom/chartboost/heliumsdk/domain/AdIdentifier;", "getAdIdentifier", "()Lcom/chartboost/heliumsdk/domain/AdIdentifier;", "getAdLoadParams", "()Lcom/chartboost/heliumsdk/domain/AdLoadParams;", "auctionId", "", "getAuctionId", "()Ljava/lang/String;", "bidInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getBidInfo", "()Ljava/util/HashMap;", "bids", "", "getBids", "()Ljava/util/List;", "getBidsResponse", "()Lcom/chartboost/heliumsdk/domain/BidsResponse;", "partnerId", "getPartnerId", "rewardedCallbackData", "Lcom/chartboost/heliumsdk/domain/RewardedCallbackData;", "getRewardedCallbackData", "()Lcom/chartboost/heliumsdk/domain/RewardedCallbackData;", "incrementActiveBid", "", "iterator", "", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Bids implements Iterable<Bid>, KMappedMarker {
    public static final String AUCTION_ID_KEY = "auction-id";
    private AtomicInteger activeBidIndex;
    private final AdLoadParams adLoadParams;
    private final String auctionId;
    private final List<Bid> bids;
    private final BidsResponse bidsResponse;
    private final RewardedCallbackData rewardedCallbackData;

    public Bids(AdLoadParams adLoadParams, BidsResponse bidsResponse) {
        JsonElement ilrd;
        Intrinsics.f(adLoadParams, "adLoadParams");
        Intrinsics.f(bidsResponse, "bidsResponse");
        this.adLoadParams = adLoadParams;
        this.bidsResponse = bidsResponse;
        this.activeBidIndex = new AtomicInteger(0);
        List<BidResponse> seatbid = bidsResponse.getSeatbid();
        ArrayList arrayList = new ArrayList(CollectionsKt.n(seatbid, 10));
        Iterator<T> it = seatbid.iterator();
        while (it.hasNext()) {
            arrayList.add(new Bid(this.adLoadParams.getBannerSize(), this.adLoadParams.getAdIdentifier(), (BidResponse) it.next(), this.adLoadParams.getLoadId()));
        }
        this.bids = arrayList;
        this.auctionId = this.bidsResponse.getId();
        BidsExt bidsExt = this.bidsResponse.getBidsExt();
        this.rewardedCallbackData = bidsExt != null ? bidsExt.getRewardedCallbackData() : null;
        BidsExt bidsExt2 = this.bidsResponse.getBidsExt();
        if (bidsExt2 == null || (ilrd = bidsExt2.getIlrd()) == null) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Bid) it2.next()).updateIlrd(JsonElementKt.getJsonObject(ilrd), false);
        }
    }

    public final Bid getActiveBid() {
        return (Bid) CollectionsKt.B(this.activeBidIndex.get(), this.bids);
    }

    public final AdIdentifier getAdIdentifier() {
        return this.adLoadParams.getAdIdentifier();
    }

    public final AdLoadParams getAdLoadParams() {
        return this.adLoadParams;
    }

    public final String getAuctionId() {
        return this.auctionId;
    }

    public final HashMap<String, String> getBidInfo() {
        HashMap<String, String> map;
        Bid bid = (Bid) CollectionsKt.B(this.activeBidIndex.get(), this.bids);
        if (bid == null || (map = bid.getBidInfo()) == null) {
            map = new HashMap<>();
        }
        map.put(AUCTION_ID_KEY, this.auctionId);
        return map;
    }

    public final List<Bid> getBids() {
        return this.bids;
    }

    public final BidsResponse getBidsResponse() {
        return this.bidsResponse;
    }

    public final String getPartnerId() {
        String partnerName;
        Bid bid = (Bid) CollectionsKt.B(this.activeBidIndex.get(), this.bids);
        return (bid == null || (partnerName = bid.getPartnerName()) == null) ? "" : partnerName;
    }

    public final RewardedCallbackData getRewardedCallbackData() {
        return this.rewardedCallbackData;
    }

    public final int incrementActiveBid() {
        return this.activeBidIndex.incrementAndGet();
    }

    @Override // java.lang.Iterable
    public Iterator<Bid> iterator() {
        return this.bids.iterator();
    }
}
