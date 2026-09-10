package com.chartboost.heliumsdk.domain;

import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.p004ironsource.m5;
import com.p004ironsource.x4;
import com.thinkup.core.oo.n0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0000H\u0096\u0002J\u0018\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010!2\u0006\u0010D\u001a\u00020'R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R-\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0019j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\b&\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0015R\u0011\u0010-\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0015R\u0011\u0010/\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0015R\u0011\u00101\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0015R\u0011\u00103\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0015R\u001d\u00105\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t06¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u00109\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0010R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010;\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=¨\u0006E"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Bid;", "", "requestedSize", "Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;", "adIdentifier", "Lcom/chartboost/heliumsdk/domain/AdIdentifier;", "bidResponse", "Lcom/chartboost/heliumsdk/domain/BidResponse;", "loadRequestId", "", "(Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;Lcom/chartboost/heliumsdk/domain/AdIdentifier;Lcom/chartboost/heliumsdk/domain/BidResponse;Ljava/lang/String;)V", "getAdIdentifier", "()Lcom/chartboost/heliumsdk/domain/AdIdentifier;", "adRevenue", "", "getAdRevenue", "()D", "setAdRevenue", "(D)V", "adm", "getAdm", "()Ljava/lang/String;", "setAdm", "(Ljava/lang/String;)V", "bidInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getBidInfo", "()Ljava/util/HashMap;", "cpmPrice", "getCpmPrice", "setCpmPrice", n0.o.mo, "Lkotlinx/serialization/json/JsonObject;", "getIlrd", "()Lkotlinx/serialization/json/JsonObject;", "setIlrd", "(Lkotlinx/serialization/json/JsonObject;)V", "isMediation", "", "()Z", "lineItemId", "getLineItemId", "setLineItemId", "getLoadRequestId", m5.f25678z, "getLurl", m5.f25674A, "getNurl", HandleInvocationsFromAdViewer.KEY_OM_PARTNER, "getPartnerName", "partnerPlacementName", "getPartnerPlacementName", "partnerSettings", "", "getPartnerSettings", "()Ljava/util/Map;", "price", "getPrice", "size", "getSize", "()Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;", "compareTo", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "updateIlrd", "", "updatedIlrdJson", "overwriteExisting", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Bid implements Comparable<Bid> {
    private final AdIdentifier adIdentifier;
    private double adRevenue;
    private String adm;
    private final HashMap<String, String> bidInfo;
    private final BidResponse bidResponse;
    private double cpmPrice;
    private JsonObject ilrd;
    private final boolean isMediation;
    private String lineItemId;
    private final String loadRequestId;
    private final String lurl;
    private final String nurl;
    private final String partnerName;
    private final String partnerPlacementName;
    private final Map<String, String> partnerSettings;
    private final double price;
    private final HeliumBannerAd.HeliumBannerSize requestedSize;
    private final HeliumBannerAd.HeliumBannerSize size;

    public Bid(HeliumBannerAd.HeliumBannerSize heliumBannerSize, AdIdentifier adIdentifier, BidResponse bidResponse, String loadRequestId) {
        BidInfoExt ext;
        JsonElement ilrd;
        String lurl;
        String nurl;
        Intrinsics.f(adIdentifier, "adIdentifier");
        Intrinsics.f(bidResponse, "bidResponse");
        Intrinsics.f(loadRequestId, "loadRequestId");
        this.requestedSize = heliumBannerSize;
        this.adIdentifier = adIdentifier;
        this.bidResponse = bidResponse;
        this.loadRequestId = loadRequestId;
        this.partnerName = bidResponse.getPartnerName();
        BidInfo bidInfo = (BidInfo) CollectionsKt.y(bidResponse.getBidInfoArray());
        String str = "";
        this.nurl = (bidInfo == null || (nurl = bidInfo.getNurl()) == null) ? "" : nurl;
        BidInfo bidInfo2 = (BidInfo) CollectionsKt.y(bidResponse.getBidInfoArray());
        if (bidInfo2 != null && (lurl = bidInfo2.getLurl()) != null) {
            str = lurl;
        }
        this.lurl = str;
        BidInfo bidInfo3 = (BidInfo) CollectionsKt.y(bidResponse.getBidInfoArray());
        this.price = bidInfo3 != null ? bidInfo3.getPrice() : Double.NaN;
        this.partnerPlacementName = bidResponse.getPartnerPlacementName();
        this.isMediation = bidResponse.getIsMediation();
        this.partnerSettings = bidResponse.getPartnerSettings();
        this.bidInfo = bidResponse.getBidInfo();
        this.lineItemId = bidResponse.getLineItemId();
        BidInfo bidInfo4 = (BidInfo) CollectionsKt.y(bidResponse.getBidInfoArray());
        this.ilrd = (bidInfo4 == null || (ext = bidInfo4.getExt()) == null || (ilrd = ext.getIlrd()) == null) ? null : JsonElementKt.getJsonObject(ilrd);
        this.adRevenue = bidResponse.getAdRevenue();
        this.cpmPrice = bidResponse.getCpmPrice();
        BidInfo bidInfo5 = (BidInfo) CollectionsKt.y(bidResponse.getBidInfoArray());
        this.adm = bidInfo5 != null ? bidInfo5.getAdm() : null;
        BidInfo bidInfo6 = (BidInfo) CollectionsKt.y(bidResponse.getBidInfoArray());
        Integer adaptiveBannerWidth = bidInfo6 != null ? bidInfo6.getAdaptiveBannerWidth() : null;
        BidInfo bidInfo7 = (BidInfo) CollectionsKt.y(bidResponse.getBidInfoArray());
        Integer adaptiveBannerHeight = bidInfo7 != null ? bidInfo7.getAdaptiveBannerHeight() : null;
        if (heliumBannerSize != null && heliumBannerSize.isAdaptive() && adaptiveBannerWidth != null && adaptiveBannerHeight != null) {
            heliumBannerSize = HeliumBannerAd.HeliumBannerSize.INSTANCE.bannerSize(adaptiveBannerWidth.intValue(), adaptiveBannerHeight.intValue());
        }
        this.size = heliumBannerSize;
    }

    public final AdIdentifier getAdIdentifier() {
        return this.adIdentifier;
    }

    public final double getAdRevenue() {
        return this.adRevenue;
    }

    public final String getAdm() {
        return this.adm;
    }

    public final HashMap<String, String> getBidInfo() {
        return this.bidInfo;
    }

    public final double getCpmPrice() {
        return this.cpmPrice;
    }

    public final JsonObject getIlrd() {
        return this.ilrd;
    }

    public final String getLineItemId() {
        return this.lineItemId;
    }

    public final String getLoadRequestId() {
        return this.loadRequestId;
    }

    public final String getLurl() {
        return this.lurl;
    }

    public final String getNurl() {
        return this.nurl;
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPartnerPlacementName() {
        return this.partnerPlacementName;
    }

    public final Map<String, String> getPartnerSettings() {
        return this.partnerSettings;
    }

    public final double getPrice() {
        return this.price;
    }

    public final HeliumBannerAd.HeliumBannerSize getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: isMediation, reason: from getter */
    public final boolean getIsMediation() {
        return this.isMediation;
    }

    public final void setAdRevenue(double d) {
        this.adRevenue = d;
    }

    public final void setAdm(String str) {
        this.adm = str;
    }

    public final void setCpmPrice(double d) {
        this.cpmPrice = d;
    }

    public final void setIlrd(JsonObject jsonObject) {
        this.ilrd = jsonObject;
    }

    public final void setLineItemId(String str) {
        this.lineItemId = str;
    }

    public final void updateIlrd(JsonObject updatedIlrdJson, boolean overwriteExisting) {
        if (updatedIlrdJson != null) {
            JsonObject jsonObject = this.ilrd;
            if (jsonObject != null) {
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                for (Map.Entry entry : jsonObject.entrySet()) {
                    jsonObjectBuilder.put((String) entry.getKey(), (JsonElement) entry.getValue());
                }
                for (String str : updatedIlrdJson.keySet()) {
                    if (overwriteExisting || !jsonObject.containsKey((Object) str)) {
                        jsonObjectBuilder.put(str, (JsonElement) MapsKt.f(updatedIlrdJson, str));
                    }
                }
                JsonObject jsonObjectBuild = jsonObjectBuilder.build();
                if (jsonObjectBuild != null) {
                    updatedIlrdJson = jsonObjectBuild;
                }
            }
            this.ilrd = updatedIlrdJson;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Bid other) {
        Intrinsics.f(other, "other");
        return Double.compare(this.price, other.price);
    }
}
