package com.chartboost.heliumsdk.domain;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.x4;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BC\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J/\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, d2 = {"Lcom/chartboost/heliumsdk/domain/BidsResponse;", "", "seen1", "", "id", "", BidsResponse.SEAT_BID_KEY, "", "Lcom/chartboost/heliumsdk/domain/BidResponse;", "bidsExt", "Lcom/chartboost/heliumsdk/domain/BidsExt;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Lcom/chartboost/heliumsdk/domain/BidsExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;Lcom/chartboost/heliumsdk/domain/BidsExt;)V", "getBidsExt$annotations", "()V", "getBidsExt", "()Lcom/chartboost/heliumsdk/domain/BidsExt;", "getId$annotations", "getId", "()Ljava/lang/String;", "getSeatbid$annotations", "getSeatbid", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class BidsResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final BidsResponse EMPTY_BIDS_RESPONSE = new BidsResponse("", EmptyList.X, null);
    private static final String EXT_KEY = "ext";
    private static final String ID_KEY = "id";
    private static final String SEAT_BID_KEY = "seatbid";
    private final BidsExt bidsExt;
    private final String id;
    private final List<BidResponse> seatbid;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fHÆ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/chartboost/heliumsdk/domain/BidsResponse$Companion;", "", "()V", "EMPTY_BIDS_RESPONSE", "Lcom/chartboost/heliumsdk/domain/BidsResponse;", "getEMPTY_BIDS_RESPONSE", "()Lcom/chartboost/heliumsdk/domain/BidsResponse;", "EXT_KEY", "", "ID_KEY", "SEAT_BID_KEY", "serializer", "Lkotlinx/serialization/KSerializer;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BidsResponse getEMPTY_BIDS_RESPONSE() {
            return BidsResponse.EMPTY_BIDS_RESPONSE;
        }

        public final KSerializer<BidsResponse> serializer() {
            return BidsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidsResponse(int i2, @SerialName("id") String str, @SerialName(SEAT_BID_KEY) List list, @SerialName(EXT_KEY) BidsExt bidsExt, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 3, BidsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.seatbid = list;
        if ((i2 & 4) == 0) {
            this.bidsExt = null;
        } else {
            this.bidsExt = bidsExt;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BidsResponse copy$default(BidsResponse bidsResponse, String str, List list, BidsExt bidsExt, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bidsResponse.id;
        }
        if ((i2 & 2) != 0) {
            list = bidsResponse.seatbid;
        }
        if ((i2 & 4) != 0) {
            bidsExt = bidsResponse.bidsExt;
        }
        return bidsResponse.copy(str, list, bidsExt);
    }

    @SerialName(EXT_KEY)
    public static /* synthetic */ void getBidsExt$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName(SEAT_BID_KEY)
    public static /* synthetic */ void getSeatbid$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidsResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, new ArrayListSerializer(BidResponse$$serializer.INSTANCE), self.seatbid);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.bidsExt == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, BidsExt$$serializer.INSTANCE, self.bidsExt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<BidResponse> component2() {
        return this.seatbid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BidsExt getBidsExt() {
        return this.bidsExt;
    }

    public final BidsResponse copy(String id, List<BidResponse> seatbid, BidsExt bidsExt) {
        Intrinsics.f(id, "id");
        Intrinsics.f(seatbid, "seatbid");
        return new BidsResponse(id, seatbid, bidsExt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidsResponse)) {
            return false;
        }
        BidsResponse bidsResponse = (BidsResponse) other;
        return Intrinsics.a(this.id, bidsResponse.id) && Intrinsics.a(this.seatbid, bidsResponse.seatbid) && Intrinsics.a(this.bidsExt, bidsResponse.bidsExt);
    }

    public final BidsExt getBidsExt() {
        return this.bidsExt;
    }

    public final String getId() {
        return this.id;
    }

    public final List<BidResponse> getSeatbid() {
        return this.seatbid;
    }

    public int hashCode() {
        int iC = a.c(this.id.hashCode() * 31, 31, this.seatbid);
        BidsExt bidsExt = this.bidsExt;
        return iC + (bidsExt == null ? 0 : bidsExt.hashCode());
    }

    public String toString() {
        return "BidsResponse(id=" + this.id + ", seatbid=" + this.seatbid + ", bidsExt=" + this.bidsExt + ')';
    }

    public BidsResponse(String id, List<BidResponse> seatbid, BidsExt bidsExt) {
        Intrinsics.f(id, "id");
        Intrinsics.f(seatbid, "seatbid");
        this.id = id;
        this.seatbid = seatbid;
        this.bidsExt = bidsExt;
    }

    public /* synthetic */ BidsResponse(String str, List list, BidsExt bidsExt, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i2 & 4) != 0 ? null : bidsExt);
    }
}
