package com.chartboost.heliumsdk.domain;

import com.chartboost.heliumsdk.utils.HeliumJsonKt;
import com.p004ironsource.mediationsdk.metadata.a;
import com.p004ironsource.x4;
import com.thinkup.core.oo.n0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 Y2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002XYB³\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aBI\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\u001bJ\u0011\u0010A\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0000H\u0096\u0002J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003JQ\u0010I\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010J\u001a\u00020\u000e2\b\u0010B\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010L\u001a\u00020\u0003HÖ\u0001J\t\u0010M\u001a\u00020\u0005HÖ\u0001J\u0016\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020\u000eJ!\u0010R\u001a\u00020O2\u0006\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WHÇ\u0001R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010#R-\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050%j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010!\u001a\u0004\b*\u0010+R\u001a\u0010\u0013\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010!\u001a\u0004\b3\u0010#R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u00108R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010#\"\u0004\b:\u0010;R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010!\u001a\u0004\b=\u0010#R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@¨\u0006Z"}, d2 = {"Lcom/chartboost/heliumsdk/domain/BidResponse;", "", "seen1", "", "id", "", "bidId", "currency", "bidInfoArray", "", "Lcom/chartboost/heliumsdk/domain/BidInfo;", HandleInvocationsFromAdViewer.KEY_OM_PARTNER, "heliumBidId", "isMediation", "", "partnerPlacementName", "lineItemId", "adRevenue", "", "cpmPrice", n0.o.mo, "Lkotlinx/serialization/json/JsonElement;", "partnerSettings", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;DDLkotlinx/serialization/json/JsonElement;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAdRevenue", "()D", "setAdRevenue", "(D)V", "getBidId$annotations", "()V", "getBidId", "()Ljava/lang/String;", "bidInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getBidInfo", "()Ljava/util/HashMap;", "getBidInfoArray$annotations", "getBidInfoArray", "()Ljava/util/List;", "getCpmPrice", "setCpmPrice", "getCurrency$annotations", "getCurrency", "getHeliumBidId$annotations", "getHeliumBidId", "getId$annotations", "getId", "getIlrd", "()Lkotlinx/serialization/json/JsonElement;", "setIlrd", "(Lkotlinx/serialization/json/JsonElement;)V", "()Z", "getLineItemId", "setLineItemId", "(Ljava/lang/String;)V", "getPartnerName$annotations", "getPartnerName", "getPartnerPlacementName", "getPartnerSettings", "()Ljava/util/Map;", "compareTo", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "hashCode", "toString", "updateIlrd", "", "updatedIlrdJson", "overwriteExisting", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class BidResponse implements Comparable<BidResponse> {
    private static final String BID_ARRAY_KEY = "bid";
    private static final String BID_ID_KEY = "bidid";
    private static final String CURRENCY_KEY = "cur";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String HELIUM_BID_ID_KEY = "helium_bid_id";
    private static final String HELIUM_KEY = "helium";
    private static final String ID_KEY = "id";
    private static final String LINE_ITEM_ID_KEY = "line_item_id";
    private static final String LINE_ITEM_NAME_KEY = "line_item_name";
    private static final String MEDIATION_KEY = "MEDIATION";
    private static final String PARTNER_ID_KEY = "partner_id";
    private static final String PRICE_KEY = "price";
    private static final String SEAT_KEY = "seat";
    private double adRevenue;
    private final String bidId;
    private final List<BidInfo> bidInfoArray;
    private double cpmPrice;
    private final String currency;
    private final String heliumBidId;
    private final String id;
    private JsonElement ilrd;
    private final boolean isMediation;
    private String lineItemId;
    private final String partnerName;
    private final String partnerPlacementName;
    private final Map<String, String> partnerSettings;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/chartboost/heliumsdk/domain/BidResponse$Companion;", "", "()V", "BID_ARRAY_KEY", "", "BID_ID_KEY", "CURRENCY_KEY", "HELIUM_BID_ID_KEY", "HELIUM_KEY", "ID_KEY", "LINE_ITEM_ID_KEY", "LINE_ITEM_NAME_KEY", "MEDIATION_KEY", "PARTNER_ID_KEY", "PRICE_KEY", "SEAT_KEY", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/domain/BidResponse;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidResponse> serializer() {
            return BidResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidResponse(int i2, @SerialName("id") String str, @SerialName(BID_ID_KEY) String str2, @SerialName("cur") String str3, @SerialName("bid") List list, @SerialName(SEAT_KEY) String str4, @SerialName(HELIUM_BID_ID_KEY) String str5, boolean z2, String str6, String str7, double d, double d2, JsonElement jsonElement, Map map, SerializationConstructorMarker serializationConstructorMarker) throws Throwable {
        JsonElement ilrd;
        Map linkedHashMap;
        BidInfoExt ext;
        BidInfoExt ext2;
        JsonElement bidderInfo;
        JsonObject jsonObject;
        JsonElement jsonElement2;
        JsonObject jsonObject2;
        BidInfoExt ext3;
        BidInfoExt ext4;
        Double cpmPrice;
        BidInfoExt ext5;
        Double adRevenue;
        BidInfoExt ext6;
        String partnerPlacementName;
        if (48 != (i2 & 48)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 48, BidResponse$$serializer.INSTANCE.getDescriptor());
        }
        Unit unit = null;
        if ((i2 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i2 & 2) == 0) {
            this.bidId = null;
        } else {
            this.bidId = str2;
        }
        if ((i2 & 4) == 0) {
            this.currency = null;
        } else {
            this.currency = str3;
        }
        if ((i2 & 8) == 0) {
            this.bidInfoArray = EmptyList.X;
        } else {
            this.bidInfoArray = list;
        }
        this.partnerName = str4;
        this.heliumBidId = str5;
        if ((i2 & 64) == 0) {
            BidInfo bidInfo = (BidInfo) CollectionsKt.y(this.bidInfoArray);
            this.isMediation = StringsKt.r(bidInfo != null ? bidInfo.getId() : null, MEDIATION_KEY, true);
        } else {
            this.isMediation = z2;
        }
        if ((i2 & 128) == 0) {
            BidInfo bidInfo2 = (BidInfo) CollectionsKt.y(this.bidInfoArray);
            this.partnerPlacementName = (bidInfo2 == null || (ext6 = bidInfo2.getExt()) == null || (partnerPlacementName = ext6.getPartnerPlacementName()) == null) ? "" : partnerPlacementName;
        } else {
            this.partnerPlacementName = str6;
        }
        if ((i2 & 256) == 0) {
            this.lineItemId = null;
        } else {
            this.lineItemId = str7;
        }
        double dDoubleValue = Double.NaN;
        if ((i2 & 512) == 0) {
            BidInfo bidInfo3 = (BidInfo) CollectionsKt.y(this.bidInfoArray);
            this.adRevenue = (bidInfo3 == null || (ext5 = bidInfo3.getExt()) == null || (adRevenue = ext5.getAdRevenue()) == null) ? Double.NaN : adRevenue.doubleValue();
        } else {
            this.adRevenue = d;
        }
        if ((i2 & 1024) == 0) {
            BidInfo bidInfo4 = (BidInfo) CollectionsKt.y(this.bidInfoArray);
            if (bidInfo4 != null && (ext4 = bidInfo4.getExt()) != null && (cpmPrice = ext4.getCpmPrice()) != null) {
                dDoubleValue = cpmPrice.doubleValue();
            }
            this.cpmPrice = dDoubleValue;
        } else {
            this.cpmPrice = d2;
        }
        if ((i2 & a.f25965n) == 0) {
            BidInfo bidInfo5 = (BidInfo) CollectionsKt.y(this.bidInfoArray);
            ilrd = (bidInfo5 == null || (ext3 = bidInfo5.getExt()) == null) ? null : ext3.getIlrd();
        } else {
            ilrd = jsonElement;
        }
        this.ilrd = ilrd;
        if ((i2 & 4096) == 0) {
            linkedHashMap = new LinkedHashMap();
            BidInfo bidInfo6 = (BidInfo) CollectionsKt.y(this.bidInfoArray);
            if (bidInfo6 != null && (ext2 = bidInfo6.getExt()) != null && (bidderInfo = ext2.getBidderInfo()) != null && (jsonObject = JsonElementKt.getJsonObject(bidderInfo)) != null && (jsonElement2 = (JsonElement) MapsKt.f(jsonObject, HELIUM_KEY)) != null && (jsonObject2 = JsonElementKt.getJsonObject(jsonElement2)) != null) {
                for (String str8 : jsonObject2.keySet()) {
                    Json heliumJson = HeliumJsonKt.getHeliumJson();
                    JsonElement jsonElement3 = (JsonElement) MapsKt.f(jsonObject2, str8);
                    heliumJson.getSerializersModule();
                    linkedHashMap.put(str8, (String) heliumJson.decodeFromJsonElement(StringSerializer.INSTANCE, jsonElement3));
                }
            }
        } else {
            linkedHashMap = map;
        }
        this.partnerSettings = linkedHashMap;
        if (this.isMediation) {
            BidInfo bidInfo7 = (BidInfo) CollectionsKt.y(this.bidInfoArray);
            if (bidInfo7 != null && (ext = bidInfo7.getExt()) != null) {
                this.lineItemId = ext.getLineItemId();
                unit = Unit.f43263a;
            }
            if (unit == null) {
                throw new Throwable("ext cannot be null when mediating.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BidResponse copy$default(BidResponse bidResponse, String str, String str2, String str3, List list, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bidResponse.id;
        }
        if ((i2 & 2) != 0) {
            str2 = bidResponse.bidId;
        }
        if ((i2 & 4) != 0) {
            str3 = bidResponse.currency;
        }
        if ((i2 & 8) != 0) {
            list = bidResponse.bidInfoArray;
        }
        if ((i2 & 16) != 0) {
            str4 = bidResponse.partnerName;
        }
        if ((i2 & 32) != 0) {
            str5 = bidResponse.heliumBidId;
        }
        String str6 = str4;
        String str7 = str5;
        return bidResponse.copy(str, str2, str3, list, str6, str7);
    }

    @SerialName(BID_ID_KEY)
    public static /* synthetic */ void getBidId$annotations() {
    }

    @SerialName("bid")
    public static /* synthetic */ void getBidInfoArray$annotations() {
    }

    @SerialName("cur")
    public static /* synthetic */ void getCurrency$annotations() {
    }

    @SerialName(HELIUM_BID_ID_KEY)
    public static /* synthetic */ void getHeliumBidId$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName(SEAT_KEY)
    public static /* synthetic */ void getPartnerName$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a  */
    /* JADX WARN: Code duplicated, block: B:81:0x013a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0164  */
    @JvmStatic
    public static final void write$Self(BidResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        BidInfoExt ext;
        JsonElement bidderInfo;
        JsonObject jsonObject;
        JsonElement jsonElement;
        JsonObject jsonObject2;
        BidInfoExt ext2;
        BidInfoExt ext3;
        Double cpmPrice;
        BidInfoExt ext4;
        Double adRevenue;
        String partnerPlacementName;
        BidInfoExt ext5;
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.bidId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.bidId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.currency != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.currency);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.a(self.bidInfoArray, EmptyList.X)) {
            output.encodeSerializableElement(serialDesc, 3, new ArrayListSerializer(BidInfo$$serializer.INSTANCE), self.bidInfoArray);
        }
        output.encodeStringElement(serialDesc, 4, self.partnerName);
        output.encodeStringElement(serialDesc, 5, self.heliumBidId);
        JsonElement ilrd = null;
        if (output.shouldEncodeElementDefault(serialDesc, 6)) {
            output.encodeBooleanElement(serialDesc, 6, self.isMediation);
        } else {
            boolean z2 = self.isMediation;
            BidInfo bidInfo = (BidInfo) CollectionsKt.y(self.bidInfoArray);
            if (z2 != StringsKt.r(bidInfo != null ? bidInfo.getId() : null, MEDIATION_KEY, true)) {
                output.encodeBooleanElement(serialDesc, 6, self.isMediation);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7)) {
            output.encodeStringElement(serialDesc, 7, self.partnerPlacementName);
        } else {
            String str = self.partnerPlacementName;
            BidInfo bidInfo2 = (BidInfo) CollectionsKt.y(self.bidInfoArray);
            if (bidInfo2 == null || (ext5 = bidInfo2.getExt()) == null || (partnerPlacementName = ext5.getPartnerPlacementName()) == null) {
                partnerPlacementName = "";
            }
            if (!Intrinsics.a(str, partnerPlacementName)) {
                output.encodeStringElement(serialDesc, 7, self.partnerPlacementName);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.lineItemId != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.lineItemId);
        }
        double dDoubleValue = Double.NaN;
        if (output.shouldEncodeElementDefault(serialDesc, 9)) {
            output.encodeDoubleElement(serialDesc, 9, self.adRevenue);
        } else {
            double d = self.adRevenue;
            BidInfo bidInfo3 = (BidInfo) CollectionsKt.y(self.bidInfoArray);
            if (Double.compare(d, (bidInfo3 == null || (ext4 = bidInfo3.getExt()) == null || (adRevenue = ext4.getAdRevenue()) == null) ? Double.NaN : adRevenue.doubleValue()) != 0) {
                output.encodeDoubleElement(serialDesc, 9, self.adRevenue);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10)) {
            output.encodeDoubleElement(serialDesc, 10, self.cpmPrice);
        } else {
            double d2 = self.cpmPrice;
            BidInfo bidInfo4 = (BidInfo) CollectionsKt.y(self.bidInfoArray);
            if (bidInfo4 != null && (ext3 = bidInfo4.getExt()) != null && (cpmPrice = ext3.getCpmPrice()) != null) {
                dDoubleValue = cpmPrice.doubleValue();
            }
            if (Double.compare(d2, dDoubleValue) != 0) {
                output.encodeDoubleElement(serialDesc, 10, self.cpmPrice);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11)) {
            output.encodeNullableSerializableElement(serialDesc, 11, JsonElementSerializer.INSTANCE, self.ilrd);
        } else {
            JsonElement jsonElement2 = self.ilrd;
            BidInfo bidInfo5 = (BidInfo) CollectionsKt.y(self.bidInfoArray);
            if (bidInfo5 != null && (ext2 = bidInfo5.getExt()) != null) {
                ilrd = ext2.getIlrd();
            }
            if (!Intrinsics.a(jsonElement2, ilrd)) {
                output.encodeNullableSerializableElement(serialDesc, 11, JsonElementSerializer.INSTANCE, self.ilrd);
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12)) {
            Map<String, String> map = self.partnerSettings;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            BidInfo bidInfo6 = (BidInfo) CollectionsKt.y(self.bidInfoArray);
            if (bidInfo6 != null && (ext = bidInfo6.getExt()) != null && (bidderInfo = ext.getBidderInfo()) != null && (jsonObject = JsonElementKt.getJsonObject(bidderInfo)) != null && (jsonElement = (JsonElement) MapsKt.f(jsonObject, HELIUM_KEY)) != null && (jsonObject2 = JsonElementKt.getJsonObject(jsonElement)) != null) {
                for (String str2 : jsonObject2.keySet()) {
                    Json heliumJson = HeliumJsonKt.getHeliumJson();
                    JsonElement jsonElement3 = (JsonElement) MapsKt.f(jsonObject2, str2);
                    heliumJson.getSerializersModule();
                    linkedHashMap.put(str2, (String) heliumJson.decodeFromJsonElement(StringSerializer.INSTANCE, jsonElement3));
                }
            }
            if (Intrinsics.a(map, linkedHashMap)) {
                return;
            }
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 12, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.partnerSettings);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBidId() {
        return this.bidId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final List<BidInfo> component4() {
        return this.bidInfoArray;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPartnerName() {
        return this.partnerName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHeliumBidId() {
        return this.heliumBidId;
    }

    public final BidResponse copy(String id, String bidId, String currency, List<BidInfo> bidInfoArray, String partnerName, String heliumBidId) {
        Intrinsics.f(bidInfoArray, "bidInfoArray");
        Intrinsics.f(partnerName, "partnerName");
        Intrinsics.f(heliumBidId, "heliumBidId");
        return new BidResponse(id, bidId, currency, bidInfoArray, partnerName, heliumBidId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidResponse)) {
            return false;
        }
        BidResponse bidResponse = (BidResponse) other;
        return Intrinsics.a(this.id, bidResponse.id) && Intrinsics.a(this.bidId, bidResponse.bidId) && Intrinsics.a(this.currency, bidResponse.currency) && Intrinsics.a(this.bidInfoArray, bidResponse.bidInfoArray) && Intrinsics.a(this.partnerName, bidResponse.partnerName) && Intrinsics.a(this.heliumBidId, bidResponse.heliumBidId);
    }

    public final double getAdRevenue() {
        return this.adRevenue;
    }

    public final String getBidId() {
        return this.bidId;
    }

    public final HashMap<String, String> getBidInfo() {
        BidInfoExt ext;
        JsonElement ilrd;
        JsonObject jsonObject;
        JsonPrimitive jsonPrimitive;
        String content;
        HashMap<String, String> map = new HashMap<>();
        if (!Double.isNaN(this.cpmPrice)) {
            map.put("price", String.valueOf(this.cpmPrice));
        }
        map.put(PARTNER_ID_KEY, this.partnerName);
        String str = this.lineItemId;
        if (str != null) {
            map.put(LINE_ITEM_ID_KEY, str);
        }
        BidInfo bidInfo = (BidInfo) CollectionsKt.y(this.bidInfoArray);
        if (bidInfo != null && (ext = bidInfo.getExt()) != null && (ilrd = ext.getIlrd()) != null && (jsonObject = JsonElementKt.getJsonObject(ilrd)) != null && jsonObject.containsKey((Object) LINE_ITEM_NAME_KEY) && (jsonPrimitive = (JsonPrimitive) ((JsonElement) jsonObject.get((Object) LINE_ITEM_NAME_KEY))) != null && (content = jsonPrimitive.getContent()) != null) {
            map.put(LINE_ITEM_NAME_KEY, content);
        }
        return map;
    }

    public final List<BidInfo> getBidInfoArray() {
        return this.bidInfoArray;
    }

    public final double getCpmPrice() {
        return this.cpmPrice;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getHeliumBidId() {
        return this.heliumBidId;
    }

    public final String getId() {
        return this.id;
    }

    public final JsonElement getIlrd() {
        return this.ilrd;
    }

    public final String getLineItemId() {
        return this.lineItemId;
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

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bidId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        return this.heliumBidId.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.partnerName, androidx.media3.extractor.text.ttml.a.c((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.bidInfoArray), 31);
    }

    /* JADX INFO: renamed from: isMediation, reason: from getter */
    public final boolean getIsMediation() {
        return this.isMediation;
    }

    public final void setAdRevenue(double d) {
        this.adRevenue = d;
    }

    public final void setCpmPrice(double d) {
        this.cpmPrice = d;
    }

    public final void setIlrd(JsonElement jsonElement) {
        this.ilrd = jsonElement;
    }

    public final void setLineItemId(String str) {
        this.lineItemId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BidResponse(id=");
        sb.append(this.id);
        sb.append(", bidId=");
        sb.append(this.bidId);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", bidInfoArray=");
        sb.append(this.bidInfoArray);
        sb.append(", partnerName=");
        sb.append(this.partnerName);
        sb.append(", heliumBidId=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.heliumBidId, ')');
    }

    public final void updateIlrd(JsonElement updatedIlrdJson, boolean overwriteExisting) {
        Intrinsics.f(updatedIlrdJson, "updatedIlrdJson");
        JsonElement jsonElement = this.ilrd;
        if (jsonElement != null) {
            JsonObject jsonObject = JsonElementKt.getJsonObject(jsonElement);
            Intrinsics.d(jsonObject, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlinx.serialization.json.JsonElement>");
            LinkedHashMap linkedHashMapS = MapsKt.s(jsonObject);
            JsonObject jsonObject2 = JsonElementKt.getJsonObject(updatedIlrdJson);
            Intrinsics.d(jsonObject2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlinx.serialization.json.JsonElement>");
            for (String str : jsonObject2.keySet()) {
                if (overwriteExisting || !linkedHashMapS.containsKey(str)) {
                    JsonElement jsonElement2 = jsonObject2.get((Object) str);
                    Intrinsics.d(jsonElement2, "null cannot be cast to non-null type kotlinx.serialization.json.JsonElement");
                    linkedHashMapS.put(str, jsonElement2);
                }
            }
            updatedIlrdJson = new JsonObject(linkedHashMapS);
        }
        this.ilrd = updatedIlrdJson;
    }

    @Override // java.lang.Comparable
    public int compareTo(BidResponse other) {
        Intrinsics.f(other, "other");
        BidInfo bidInfo = (BidInfo) CollectionsKt.y(this.bidInfoArray);
        if (bidInfo != null) {
            return bidInfo.compareTo((BidInfo) CollectionsKt.w(other.bidInfoArray));
        }
        return -1;
    }

    public BidResponse(String str, String str2, String str3, List<BidInfo> bidInfoArray, String partnerName, String heliumBidId) throws Throwable {
        BidInfoExt ext;
        BidInfoExt ext2;
        JsonElement bidderInfo;
        JsonObject jsonObject;
        JsonElement jsonElement;
        JsonObject jsonObject2;
        BidInfoExt ext3;
        BidInfoExt ext4;
        Double cpmPrice;
        BidInfoExt ext5;
        Double adRevenue;
        BidInfoExt ext6;
        String partnerPlacementName;
        Intrinsics.f(bidInfoArray, "bidInfoArray");
        Intrinsics.f(partnerName, "partnerName");
        Intrinsics.f(heliumBidId, "heliumBidId");
        this.id = str;
        this.bidId = str2;
        this.currency = str3;
        this.bidInfoArray = bidInfoArray;
        this.partnerName = partnerName;
        this.heliumBidId = heliumBidId;
        BidInfo bidInfo = (BidInfo) CollectionsKt.y(bidInfoArray);
        Unit unit = null;
        this.isMediation = StringsKt.r(bidInfo != null ? bidInfo.getId() : null, MEDIATION_KEY, true);
        BidInfo bidInfo2 = (BidInfo) CollectionsKt.y(bidInfoArray);
        this.partnerPlacementName = (bidInfo2 == null || (ext6 = bidInfo2.getExt()) == null || (partnerPlacementName = ext6.getPartnerPlacementName()) == null) ? "" : partnerPlacementName;
        BidInfo bidInfo3 = (BidInfo) CollectionsKt.y(bidInfoArray);
        double dDoubleValue = Double.NaN;
        this.adRevenue = (bidInfo3 == null || (ext5 = bidInfo3.getExt()) == null || (adRevenue = ext5.getAdRevenue()) == null) ? Double.NaN : adRevenue.doubleValue();
        BidInfo bidInfo4 = (BidInfo) CollectionsKt.y(bidInfoArray);
        if (bidInfo4 != null && (ext4 = bidInfo4.getExt()) != null && (cpmPrice = ext4.getCpmPrice()) != null) {
            dDoubleValue = cpmPrice.doubleValue();
        }
        this.cpmPrice = dDoubleValue;
        BidInfo bidInfo5 = (BidInfo) CollectionsKt.y(bidInfoArray);
        this.ilrd = (bidInfo5 == null || (ext3 = bidInfo5.getExt()) == null) ? null : ext3.getIlrd();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        BidInfo bidInfo6 = (BidInfo) CollectionsKt.y(bidInfoArray);
        if (bidInfo6 != null && (ext2 = bidInfo6.getExt()) != null && (bidderInfo = ext2.getBidderInfo()) != null && (jsonObject = JsonElementKt.getJsonObject(bidderInfo)) != null && (jsonElement = (JsonElement) MapsKt.f(jsonObject, HELIUM_KEY)) != null && (jsonObject2 = JsonElementKt.getJsonObject(jsonElement)) != null) {
            for (String str4 : jsonObject2.keySet()) {
                Json heliumJson = HeliumJsonKt.getHeliumJson();
                JsonElement jsonElement2 = (JsonElement) MapsKt.f(jsonObject2, str4);
                heliumJson.getSerializersModule();
                linkedHashMap.put(str4, (String) heliumJson.decodeFromJsonElement(StringSerializer.INSTANCE, jsonElement2));
            }
        }
        this.partnerSettings = linkedHashMap;
        if (this.isMediation) {
            BidInfo bidInfo7 = (BidInfo) CollectionsKt.y(this.bidInfoArray);
            if (bidInfo7 != null && (ext = bidInfo7.getExt()) != null) {
                this.lineItemId = ext.getLineItemId();
                unit = Unit.f43263a;
            }
            if (unit == null) {
                throw new Throwable("ext cannot be null when mediating.");
            }
        }
    }

    public /* synthetic */ BidResponse(String str, String str2, String str3, List list, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? EmptyList.X : list, str4, str5);
    }
}
