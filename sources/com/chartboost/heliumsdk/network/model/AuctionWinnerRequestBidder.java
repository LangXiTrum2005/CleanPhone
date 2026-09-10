package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.domain.Bid;
import com.p004ironsource.m5;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002$%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BI\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB7\b\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0010J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÇ\u0001R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001a\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014¨\u0006&"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/AuctionWinnerRequestBidder;", "", "bid", "Lcom/chartboost/heliumsdk/domain/Bid;", "(Lcom/chartboost/heliumsdk/domain/Bid;)V", "seen1", "", "seat", "", "price", "", m5.f25678z, m5.f25674A, "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getLurl$annotations", "()V", "getLurl", "()Ljava/lang/String;", "getNurl$annotations", "getNurl", "getPrice$annotations", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSeat$annotations", "getSeat", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class AuctionWinnerRequestBidder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String lurl;
    private final String nurl;
    private final Double price;
    private final String seat;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/AuctionWinnerRequestBidder$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/AuctionWinnerRequestBidder;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AuctionWinnerRequestBidder> serializer() {
            return AuctionWinnerRequestBidder$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ AuctionWinnerRequestBidder(int i2, @SerialName("seat") String str, @SerialName("price") Double d, @SerialName(m5.f25678z) String str2, @SerialName(m5.f25674A) String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.seat = null;
        } else {
            this.seat = str;
        }
        if ((i2 & 2) == 0) {
            this.price = null;
        } else {
            this.price = d;
        }
        if ((i2 & 4) == 0) {
            this.lurl = null;
        } else {
            this.lurl = str2;
        }
        if ((i2 & 8) == 0) {
            this.nurl = null;
        } else {
            this.nurl = str3;
        }
    }

    @SerialName(m5.f25678z)
    public static /* synthetic */ void getLurl$annotations() {
    }

    @SerialName(m5.f25674A)
    public static /* synthetic */ void getNurl$annotations() {
    }

    @SerialName("price")
    public static /* synthetic */ void getPrice$annotations() {
    }

    @SerialName("seat")
    public static /* synthetic */ void getSeat$annotations() {
    }

    @JvmStatic
    public static final void write$Self(AuctionWinnerRequestBidder self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.seat != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.seat);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.price != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, DoubleSerializer.INSTANCE, self.price);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.lurl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.lurl);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.nurl == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.nurl);
    }

    public final String getLurl() {
        return this.lurl;
    }

    public final String getNurl() {
        return this.nurl;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final String getSeat() {
        return this.seat;
    }

    private AuctionWinnerRequestBidder(String str, Double d, String str2, String str3) {
        this.seat = str;
        this.price = d;
        this.lurl = str2;
        this.nurl = str3;
    }

    public /* synthetic */ AuctionWinnerRequestBidder(String str, Double d, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : d, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuctionWinnerRequestBidder(Bid bid) {
        Intrinsics.f(bid, "bid");
        String partnerName = bid.getPartnerName();
        Double dValueOf = Double.valueOf(bid.getPrice());
        String lurl = bid.getLurl();
        lurl = lurl.length() <= 0 ? null : lurl;
        String nurl = bid.getNurl();
        this(partnerName, dValueOf, lurl, nurl.length() > 0 ? nurl : null);
    }
}
