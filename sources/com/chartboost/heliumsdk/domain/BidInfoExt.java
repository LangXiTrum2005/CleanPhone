package com.chartboost.heliumsdk.domain;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.x4;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000267Ba\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBK\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0010J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003JV\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u000bHÖ\u0001J!\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205HÇ\u0001R \u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0015\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0015\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0018R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u001f¨\u00068"}, d2 = {"Lcom/chartboost/heliumsdk/domain/BidInfoExt;", "", "seen1", "", "bidderInfo", "Lkotlinx/serialization/json/JsonElement;", "ilrd", "cpmPrice", "", "adRevenue", "partnerPlacementName", "", "lineItemId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getAdRevenue$annotations", "()V", "getAdRevenue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBidderInfo$annotations", "getBidderInfo", "()Lkotlinx/serialization/json/JsonElement;", "getCpmPrice$annotations", "getCpmPrice", "getIlrd$annotations", "getIlrd", "getLineItemId$annotations", "getLineItemId", "()Ljava/lang/String;", "getPartnerPlacementName$annotations", "getPartnerPlacementName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/chartboost/heliumsdk/domain/BidInfoExt;", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class BidInfoExt {
    private static final String AD_REVENUE_KEY = "ad_revenue";
    private static final String BIDDER_KEY = "bidder";
    private static final String CPM_PRICE_KEY = "cpm_price";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String ILRD_KEY = "ilrd";
    private static final String LINE_ITEM_ID_KEY = "line_item_id";
    private static final String PARTNER_PLACEMENT_KEY = "partner_placement";
    private final Double adRevenue;
    private final JsonElement bidderInfo;
    private final Double cpmPrice;
    private final JsonElement ilrd;
    private final String lineItemId;
    private final String partnerPlacementName;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/chartboost/heliumsdk/domain/BidInfoExt$Companion;", "", "()V", "AD_REVENUE_KEY", "", "BIDDER_KEY", "CPM_PRICE_KEY", "ILRD_KEY", "LINE_ITEM_ID_KEY", "PARTNER_PLACEMENT_KEY", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/domain/BidInfoExt;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidInfoExt> serializer() {
            return BidInfoExt$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidInfoExt(int i2, @SerialName(BIDDER_KEY) JsonElement jsonElement, @SerialName("ilrd") JsonElement jsonElement2, @SerialName(CPM_PRICE_KEY) Double d, @SerialName(AD_REVENUE_KEY) Double d2, @SerialName(PARTNER_PLACEMENT_KEY) String str, @SerialName(LINE_ITEM_ID_KEY) String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (16 != (i2 & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 16, BidInfoExt$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.bidderInfo = null;
        } else {
            this.bidderInfo = jsonElement;
        }
        if ((i2 & 2) == 0) {
            this.ilrd = null;
        } else {
            this.ilrd = jsonElement2;
        }
        if ((i2 & 4) == 0) {
            this.cpmPrice = null;
        } else {
            this.cpmPrice = d;
        }
        if ((i2 & 8) == 0) {
            this.adRevenue = null;
        } else {
            this.adRevenue = d2;
        }
        this.partnerPlacementName = str;
        if ((i2 & 32) == 0) {
            this.lineItemId = null;
        } else {
            this.lineItemId = str2;
        }
    }

    public static /* synthetic */ BidInfoExt copy$default(BidInfoExt bidInfoExt, JsonElement jsonElement, JsonElement jsonElement2, Double d, Double d2, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jsonElement = bidInfoExt.bidderInfo;
        }
        if ((i2 & 2) != 0) {
            jsonElement2 = bidInfoExt.ilrd;
        }
        if ((i2 & 4) != 0) {
            d = bidInfoExt.cpmPrice;
        }
        if ((i2 & 8) != 0) {
            d2 = bidInfoExt.adRevenue;
        }
        if ((i2 & 16) != 0) {
            str = bidInfoExt.partnerPlacementName;
        }
        if ((i2 & 32) != 0) {
            str2 = bidInfoExt.lineItemId;
        }
        String str3 = str;
        String str4 = str2;
        return bidInfoExt.copy(jsonElement, jsonElement2, d, d2, str3, str4);
    }

    @SerialName(AD_REVENUE_KEY)
    public static /* synthetic */ void getAdRevenue$annotations() {
    }

    @SerialName(BIDDER_KEY)
    public static /* synthetic */ void getBidderInfo$annotations() {
    }

    @SerialName(CPM_PRICE_KEY)
    public static /* synthetic */ void getCpmPrice$annotations() {
    }

    @SerialName("ilrd")
    public static /* synthetic */ void getIlrd$annotations() {
    }

    @SerialName(LINE_ITEM_ID_KEY)
    public static /* synthetic */ void getLineItemId$annotations() {
    }

    @SerialName(PARTNER_PLACEMENT_KEY)
    public static /* synthetic */ void getPartnerPlacementName$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidInfoExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.bidderInfo != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, JsonElementSerializer.INSTANCE, self.bidderInfo);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ilrd != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, JsonElementSerializer.INSTANCE, self.ilrd);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.cpmPrice != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, DoubleSerializer.INSTANCE, self.cpmPrice);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.adRevenue != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, DoubleSerializer.INSTANCE, self.adRevenue);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.partnerPlacementName);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.lineItemId == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.lineItemId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonElement getBidderInfo() {
        return this.bidderInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonElement getIlrd() {
        return this.ilrd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getCpmPrice() {
        return this.cpmPrice;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getAdRevenue() {
        return this.adRevenue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPartnerPlacementName() {
        return this.partnerPlacementName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLineItemId() {
        return this.lineItemId;
    }

    public final BidInfoExt copy(JsonElement bidderInfo, JsonElement ilrd, Double cpmPrice, Double adRevenue, String partnerPlacementName, String lineItemId) {
        return new BidInfoExt(bidderInfo, ilrd, cpmPrice, adRevenue, partnerPlacementName, lineItemId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidInfoExt)) {
            return false;
        }
        BidInfoExt bidInfoExt = (BidInfoExt) other;
        return Intrinsics.a(this.bidderInfo, bidInfoExt.bidderInfo) && Intrinsics.a(this.ilrd, bidInfoExt.ilrd) && Intrinsics.a(this.cpmPrice, bidInfoExt.cpmPrice) && Intrinsics.a(this.adRevenue, bidInfoExt.adRevenue) && Intrinsics.a(this.partnerPlacementName, bidInfoExt.partnerPlacementName) && Intrinsics.a(this.lineItemId, bidInfoExt.lineItemId);
    }

    public final Double getAdRevenue() {
        return this.adRevenue;
    }

    public final JsonElement getBidderInfo() {
        return this.bidderInfo;
    }

    public final Double getCpmPrice() {
        return this.cpmPrice;
    }

    public final JsonElement getIlrd() {
        return this.ilrd;
    }

    public final String getLineItemId() {
        return this.lineItemId;
    }

    public final String getPartnerPlacementName() {
        return this.partnerPlacementName;
    }

    public int hashCode() {
        JsonElement jsonElement = this.bidderInfo;
        int iHashCode = (jsonElement == null ? 0 : jsonElement.hashCode()) * 31;
        JsonElement jsonElement2 = this.ilrd;
        int iHashCode2 = (iHashCode + (jsonElement2 == null ? 0 : jsonElement2.hashCode())) * 31;
        Double d = this.cpmPrice;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.adRevenue;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.partnerPlacementName;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lineItemId;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BidInfoExt(bidderInfo=");
        sb.append(this.bidderInfo);
        sb.append(", ilrd=");
        sb.append(this.ilrd);
        sb.append(", cpmPrice=");
        sb.append(this.cpmPrice);
        sb.append(", adRevenue=");
        sb.append(this.adRevenue);
        sb.append(", partnerPlacementName=");
        sb.append(this.partnerPlacementName);
        sb.append(", lineItemId=");
        return a.p(sb, this.lineItemId, ')');
    }

    public BidInfoExt(JsonElement jsonElement, JsonElement jsonElement2, Double d, Double d2, String str, String str2) {
        this.bidderInfo = jsonElement;
        this.ilrd = jsonElement2;
        this.cpmPrice = d;
        this.adRevenue = d2;
        this.partnerPlacementName = str;
        this.lineItemId = str2;
    }

    public /* synthetic */ BidInfoExt(JsonElement jsonElement, JsonElement jsonElement2, Double d, Double d2, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : jsonElement, (i2 & 2) != 0 ? null : jsonElement2, (i2 & 4) != 0 ? null : d, (i2 & 8) != 0 ? null : d2, str, (i2 & 32) != 0 ? null : str2);
    }
}
