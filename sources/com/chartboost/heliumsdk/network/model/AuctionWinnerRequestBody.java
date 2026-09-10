package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.chartboost.heliumsdk.domain.AdIdentifier;
import com.chartboost.heliumsdk.domain.Bid;
import com.chartboost.heliumsdk.domain.Bids;
import com.smartdigimkt.m6.a;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 92\u00020\u0001:\u000289B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u008b\u0001\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017Bu\b\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0018J!\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207HÇ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001e\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u001e\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001c\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001cR \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010+\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010*R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010.R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001c¨\u0006:"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/AuctionWinnerRequestBody;", "", "bids", "Lcom/chartboost/heliumsdk/domain/Bids;", "(Lcom/chartboost/heliumsdk/domain/Bids;)V", "seen1", "", "auctionId", "", "placementType", HandleInvocationsFromAdViewer.KEY_OM_PARTNER, "type", "lineItemId", "partnerPlacement", "price", "", "bidders", "", "Lcom/chartboost/heliumsdk/network/model/AuctionWinnerRequestBidder;", "size", "Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;)V", "getAuctionId$annotations", "()V", "getAuctionId", "()Ljava/lang/String;", "getBidders$annotations", "getBidders", "()Ljava/util/List;", "getLineItemId$annotations", "getLineItemId", "getPartnerName$annotations", "getPartnerName", "getPartnerPlacement$annotations", "getPartnerPlacement", "getPlacementType$annotations", "getPlacementType", "getPrice$annotations", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSize$annotations", "getSize", "()Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;", "getType$annotations", "getType", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class AuctionWinnerRequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String auctionId;
    private final List<AuctionWinnerRequestBidder> bidders;
    private final String lineItemId;
    private final String partnerName;
    private final String partnerPlacement;
    private final String placementType;
    private final Double price;
    private final BannerAdDimensions size;
    private final String type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/AuctionWinnerRequestBody$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/AuctionWinnerRequestBody;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AuctionWinnerRequestBody> serializer() {
            return AuctionWinnerRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ AuctionWinnerRequestBody(int i2, @SerialName("auction_id") String str, @SerialName("placement_type") String str2, @SerialName("winner") String str3, @SerialName("type") String str4, @SerialName("line_item_id") String str5, @SerialName("partner_placement") String str6, @SerialName("price") Double d, @SerialName("bidders") List list, @SerialName("size") BannerAdDimensions bannerAdDimensions, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i2 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 2, AuctionWinnerRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.auctionId = null;
        } else {
            this.auctionId = str;
        }
        this.placementType = str2;
        if ((i2 & 4) == 0) {
            this.partnerName = null;
        } else {
            this.partnerName = str3;
        }
        if ((i2 & 8) == 0) {
            this.type = null;
        } else {
            this.type = str4;
        }
        if ((i2 & 16) == 0) {
            this.lineItemId = null;
        } else {
            this.lineItemId = str5;
        }
        if ((i2 & 32) == 0) {
            this.partnerPlacement = null;
        } else {
            this.partnerPlacement = str6;
        }
        if ((i2 & 64) == 0) {
            this.price = null;
        } else {
            this.price = d;
        }
        if ((i2 & 128) == 0) {
            this.bidders = null;
        } else {
            this.bidders = list;
        }
        if ((i2 & 256) == 0) {
            this.size = null;
        } else {
            this.size = bannerAdDimensions;
        }
    }

    @SerialName("auction_id")
    public static /* synthetic */ void getAuctionId$annotations() {
    }

    @SerialName("bidders")
    public static /* synthetic */ void getBidders$annotations() {
    }

    @SerialName("line_item_id")
    public static /* synthetic */ void getLineItemId$annotations() {
    }

    @SerialName("winner")
    public static /* synthetic */ void getPartnerName$annotations() {
    }

    @SerialName("partner_placement")
    public static /* synthetic */ void getPartnerPlacement$annotations() {
    }

    @SerialName("placement_type")
    public static /* synthetic */ void getPlacementType$annotations() {
    }

    @SerialName("price")
    public static /* synthetic */ void getPrice$annotations() {
    }

    @SerialName("size")
    public static /* synthetic */ void getSize$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @JvmStatic
    public static final void write$Self(AuctionWinnerRequestBody self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.auctionId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.auctionId);
        }
        output.encodeStringElement(serialDesc, 1, self.placementType);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.partnerName != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.partnerName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.lineItemId != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.lineItemId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.partnerPlacement != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.partnerPlacement);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.price != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, DoubleSerializer.INSTANCE, self.price);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.bidders != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, new ArrayListSerializer(AuctionWinnerRequestBidder$$serializer.INSTANCE), self.bidders);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.size == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, BannerAdDimensions$$serializer.INSTANCE, self.size);
    }

    public final String getAuctionId() {
        return this.auctionId;
    }

    public final List<AuctionWinnerRequestBidder> getBidders() {
        return this.bidders;
    }

    public final String getLineItemId() {
        return this.lineItemId;
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPartnerPlacement() {
        return this.partnerPlacement;
    }

    public final String getPlacementType() {
        return this.placementType;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final BannerAdDimensions getSize() {
        return this.size;
    }

    public final String getType() {
        return this.type;
    }

    private AuctionWinnerRequestBody(String str, String str2, String str3, String str4, String str5, String str6, Double d, List<AuctionWinnerRequestBidder> list, BannerAdDimensions bannerAdDimensions) {
        this.auctionId = str;
        this.placementType = str2;
        this.partnerName = str3;
        this.type = str4;
        this.lineItemId = str5;
        this.partnerPlacement = str6;
        this.price = d;
        this.bidders = list;
        this.size = bannerAdDimensions;
    }

    public /* synthetic */ AuctionWinnerRequestBody(String str, String str2, String str3, String str4, String str5, String str6, Double d, List list, BannerAdDimensions bannerAdDimensions, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : d, (i2 & 128) != 0 ? null : list, (i2 & 256) != 0 ? null : bannerAdDimensions);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8 A[LOOP:0: B:48:0x00a2->B:50:0x00a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e6  */
    public AuctionWinnerRequestBody(Bids bids) {
        String str;
        String str2;
        Bid activeBid;
        String lineItemId;
        Bid activeBid2;
        String partnerPlacementName;
        Bid activeBid3;
        Double dValueOf;
        ArrayList arrayList;
        Iterator<Bid> it;
        Bid activeBid4;
        AdIdentifier adIdentifier;
        Bid activeBid5;
        HeliumBannerAd.HeliumBannerSize size;
        AdIdentifier adIdentifier2;
        String placementType;
        Intrinsics.f(bids, "bids");
        BannerAdDimensions bannerAdDimensions = null;
        String auctionId = bids.getActiveBid() == null ? null : bids.getAuctionId();
        Bid activeBid6 = bids.getActiveBid();
        String str3 = (activeBid6 == null || (adIdentifier2 = activeBid6.getAdIdentifier()) == null || (placementType = adIdentifier2.getPlacementType()) == null) ? "unknown" : placementType;
        Bid activeBid7 = bids.getActiveBid();
        String partnerName = activeBid7 != null ? activeBid7.getPartnerName() : null;
        Bid activeBid8 = bids.getActiveBid();
        Boolean boolValueOf = activeBid8 != null ? Boolean.valueOf(activeBid8.getIsMediation()) : null;
        if (!Intrinsics.a(boolValueOf, Boolean.TRUE)) {
            if (Intrinsics.a(boolValueOf, Boolean.FALSE)) {
                str2 = a.r.f36800z;
            } else {
                str = null;
            }
            activeBid = bids.getActiveBid();
            if (activeBid != null) {
                lineItemId = activeBid.getLineItemId();
            } else {
                lineItemId = null;
            }
            activeBid2 = bids.getActiveBid();
            if (activeBid2 != null) {
                partnerPlacementName = activeBid2.getIsMediation() ? activeBid2.getPartnerPlacementName() : null;
            } else {
                partnerPlacementName = null;
            }
            activeBid3 = bids.getActiveBid();
            if (activeBid3 != null) {
                dValueOf = Double.valueOf(activeBid3.getPrice());
            } else {
                dValueOf = null;
            }
            arrayList = new ArrayList(CollectionsKt.n(bids, 10));
            it = bids.iterator();
            while (it.hasNext()) {
                arrayList.add(new AuctionWinnerRequestBidder(it.next()));
            }
            activeBid4 = bids.getActiveBid();
            if (activeBid4 != null && (adIdentifier = activeBid4.getAdIdentifier()) != null && adIdentifier.getAdType() == 4) {
                activeBid5 = bids.getActiveBid();
                if (activeBid5 == null && (size = activeBid5.getSize()) != null) {
                    bannerAdDimensions = new BannerAdDimensions(size.getWidth(), size.getHeight());
                } else {
                    bannerAdDimensions = new BannerAdDimensions(0, 0);
                }
            }
            this(auctionId, str3, partnerName, str, lineItemId, partnerPlacementName, dValueOf, arrayList, bannerAdDimensions);
        }
        str2 = "mediation";
        str = str2;
        activeBid = bids.getActiveBid();
        if (activeBid != null) {
            lineItemId = activeBid.getLineItemId();
        } else {
            lineItemId = null;
        }
        activeBid2 = bids.getActiveBid();
        if (activeBid2 != null) {
            partnerPlacementName = activeBid2.getIsMediation() ? activeBid2.getPartnerPlacementName() : null;
        } else {
            partnerPlacementName = null;
        }
        activeBid3 = bids.getActiveBid();
        if (activeBid3 != null) {
            dValueOf = Double.valueOf(activeBid3.getPrice());
        } else {
            dValueOf = null;
        }
        arrayList = new ArrayList(CollectionsKt.n(bids, 10));
        it = bids.iterator();
        while (it.hasNext()) {
            arrayList.add(new AuctionWinnerRequestBidder(it.next()));
        }
        activeBid4 = bids.getActiveBid();
        if (activeBid4 != null) {
            activeBid5 = bids.getActiveBid();
            if (activeBid5 == null) {
                bannerAdDimensions = new BannerAdDimensions(0, 0);
            } else {
                bannerAdDimensions = new BannerAdDimensions(0, 0);
            }
        }
        this(auctionId, str3, partnerName, str, lineItemId, partnerPlacementName, dValueOf, arrayList, bannerAdDimensions);
    }
}
