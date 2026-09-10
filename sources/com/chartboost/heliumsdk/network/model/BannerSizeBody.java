package com.chartboost.heliumsdk.network.model;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J!\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0014¨\u0006,"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BannerSizeBody;", "", "seen1", "", "auctionId", "", "creativeSize", "Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;", "containerSize", "requestSize", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;)V", "getAuctionId$annotations", "()V", "getAuctionId", "()Ljava/lang/String;", "getContainerSize$annotations", "getContainerSize", "()Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;", "getCreativeSize$annotations", "getCreativeSize", "getRequestSize$annotations", "getRequestSize", "component1", "component2", "component3", "component4", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class BannerSizeBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String auctionId;
    private final BannerAdDimensions containerSize;
    private final BannerAdDimensions creativeSize;
    private final BannerAdDimensions requestSize;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BannerSizeBody$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/BannerSizeBody;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BannerSizeBody> serializer() {
            return BannerSizeBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BannerSizeBody(int i2, @SerialName("auction_id") String str, @SerialName("creative_size") BannerAdDimensions bannerAdDimensions, @SerialName("container_size") BannerAdDimensions bannerAdDimensions2, @SerialName("request_size") BannerAdDimensions bannerAdDimensions3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i2 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 15, BannerSizeBody$$serializer.INSTANCE.getDescriptor());
        }
        this.auctionId = str;
        this.creativeSize = bannerAdDimensions;
        this.containerSize = bannerAdDimensions2;
        this.requestSize = bannerAdDimensions3;
    }

    public static /* synthetic */ BannerSizeBody copy$default(BannerSizeBody bannerSizeBody, String str, BannerAdDimensions bannerAdDimensions, BannerAdDimensions bannerAdDimensions2, BannerAdDimensions bannerAdDimensions3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bannerSizeBody.auctionId;
        }
        if ((i2 & 2) != 0) {
            bannerAdDimensions = bannerSizeBody.creativeSize;
        }
        if ((i2 & 4) != 0) {
            bannerAdDimensions2 = bannerSizeBody.containerSize;
        }
        if ((i2 & 8) != 0) {
            bannerAdDimensions3 = bannerSizeBody.requestSize;
        }
        return bannerSizeBody.copy(str, bannerAdDimensions, bannerAdDimensions2, bannerAdDimensions3);
    }

    @SerialName("auction_id")
    public static /* synthetic */ void getAuctionId$annotations() {
    }

    @SerialName("container_size")
    public static /* synthetic */ void getContainerSize$annotations() {
    }

    @SerialName("creative_size")
    public static /* synthetic */ void getCreativeSize$annotations() {
    }

    @SerialName("request_size")
    public static /* synthetic */ void getRequestSize$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BannerSizeBody self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.auctionId);
        BannerAdDimensions$$serializer bannerAdDimensions$$serializer = BannerAdDimensions$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, bannerAdDimensions$$serializer, self.creativeSize);
        output.encodeSerializableElement(serialDesc, 2, bannerAdDimensions$$serializer, self.containerSize);
        output.encodeSerializableElement(serialDesc, 3, bannerAdDimensions$$serializer, self.requestSize);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuctionId() {
        return this.auctionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BannerAdDimensions getCreativeSize() {
        return this.creativeSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BannerAdDimensions getContainerSize() {
        return this.containerSize;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BannerAdDimensions getRequestSize() {
        return this.requestSize;
    }

    public final BannerSizeBody copy(String auctionId, BannerAdDimensions creativeSize, BannerAdDimensions containerSize, BannerAdDimensions requestSize) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(creativeSize, "creativeSize");
        Intrinsics.f(containerSize, "containerSize");
        Intrinsics.f(requestSize, "requestSize");
        return new BannerSizeBody(auctionId, creativeSize, containerSize, requestSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerSizeBody)) {
            return false;
        }
        BannerSizeBody bannerSizeBody = (BannerSizeBody) other;
        return Intrinsics.a(this.auctionId, bannerSizeBody.auctionId) && Intrinsics.a(this.creativeSize, bannerSizeBody.creativeSize) && Intrinsics.a(this.containerSize, bannerSizeBody.containerSize) && Intrinsics.a(this.requestSize, bannerSizeBody.requestSize);
    }

    public final String getAuctionId() {
        return this.auctionId;
    }

    public final BannerAdDimensions getContainerSize() {
        return this.containerSize;
    }

    public final BannerAdDimensions getCreativeSize() {
        return this.creativeSize;
    }

    public final BannerAdDimensions getRequestSize() {
        return this.requestSize;
    }

    public int hashCode() {
        return this.requestSize.hashCode() + ((this.containerSize.hashCode() + ((this.creativeSize.hashCode() + (this.auctionId.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "BannerSizeBody(auctionId=" + this.auctionId + ", creativeSize=" + this.creativeSize + ", containerSize=" + this.containerSize + ", requestSize=" + this.requestSize + ')';
    }

    public BannerSizeBody(String auctionId, BannerAdDimensions creativeSize, BannerAdDimensions containerSize, BannerAdDimensions requestSize) {
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(creativeSize, "creativeSize");
        Intrinsics.f(containerSize, "containerSize");
        Intrinsics.f(requestSize, "requestSize");
        this.auctionId = auctionId;
        this.creativeSize = creativeSize;
        this.containerSize = containerSize;
        this.requestSize = requestSize;
    }
}
