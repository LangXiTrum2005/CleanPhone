package com.vungle.ads.internal.model;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.d9;
import com.p004ironsource.x4;
import com.vungle.ads.internal.Constants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000267B;\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0006\u0010%\u001a\u00020\u0007J\u0006\u0010&\u001a\u00020\u0007J\u0006\u0010'\u001a\u00020\u0007J\u0006\u0010(\u001a\u00020\u0007J\u0006\u0010)\u001a\u00020\u0007J\u0006\u0010*\u001a\u00020\u0007J\u0006\u0010+\u001a\u00020\u0007J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0017J\t\u0010/\u001a\u00020\u0005HÖ\u0001J!\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205HÇ\u0001R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0013R(\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u001d\u0012\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u00068"}, d2 = {"Lcom/vungle/ads/internal/model/Placement;", "", "seen1", "", "referenceId", "", "headerBidding", "", "type", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ZLjava/lang/String;)V", "getHeaderBidding$annotations", "()V", "getHeaderBidding", "()Z", "getReferenceId$annotations", "getReferenceId", "()Ljava/lang/String;", "getType$annotations", "getType", "wakeupTime", "", "getWakeupTime$annotations", "getWakeupTime", "()Ljava/lang/Long;", "setWakeupTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "isAppOpen", d9.v, "isInline", "isInterstitial", "isMREC", "isNative", "isRewardedVideo", "snooze", "", "sleepTime", "toString", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
public final /* data */ class Placement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean headerBidding;
    private final String referenceId;
    private final String type;
    private Long wakeupTime;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/Placement$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/Placement;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Placement> serializer() {
            return Placement$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ Placement(int i2, @SerialName("placement_ref_id") String str, @SerialName("is_hb") boolean z2, @SerialName("type") String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 1, Placement$$serializer.INSTANCE.getDescriptor());
        }
        this.referenceId = str;
        if ((i2 & 2) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z2;
        }
        if ((i2 & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        this.wakeupTime = null;
    }

    public static /* synthetic */ Placement copy$default(Placement placement, String str, boolean z2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = placement.referenceId;
        }
        if ((i2 & 2) != 0) {
            z2 = placement.headerBidding;
        }
        if ((i2 & 4) != 0) {
            str2 = placement.type;
        }
        return placement.copy(str, z2, str2);
    }

    @SerialName("is_hb")
    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    @SerialName("placement_ref_id")
    public static /* synthetic */ void getReferenceId$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @Transient
    public static /* synthetic */ void getWakeupTime$annotations() {
    }

    @JvmStatic
    public static final void write$Self(Placement self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.referenceId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.headerBidding) {
            output.encodeBooleanElement(serialDesc, 1, self.headerBidding);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.type == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Placement copy(String referenceId, boolean headerBidding, String type) {
        Intrinsics.f(referenceId, "referenceId");
        return new Placement(referenceId, headerBidding, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) other;
        return Intrinsics.a(this.referenceId, placement.referenceId) && this.headerBidding == placement.headerBidding && Intrinsics.a(this.type, placement.type);
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.referenceId.hashCode() * 31;
        boolean z2 = this.headerBidding;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        int i2 = (iHashCode + r1) * 31;
        String str = this.type;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public final boolean isAppOpen() {
        return Intrinsics.a(this.type, Constants.PLACEMENT_TYPE_APP_OPEN);
    }

    public final boolean isBanner() {
        return Intrinsics.a(this.type, "banner");
    }

    public final boolean isInline() {
        return Intrinsics.a(this.type, "in_line");
    }

    public final boolean isInterstitial() {
        return Intrinsics.a(this.type, "interstitial");
    }

    public final boolean isMREC() {
        return Intrinsics.a(this.type, "mrec");
    }

    public final boolean isNative() {
        return Intrinsics.a(this.type, "native");
    }

    public final boolean isRewardedVideo() {
        return Intrinsics.a(this.type, "rewarded");
    }

    public final void setWakeupTime(Long l2) {
        this.wakeupTime = l2;
    }

    public final void snooze(long sleepTime) {
        this.wakeupTime = Long.valueOf((sleepTime * ((long) 1000)) + System.currentTimeMillis());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Placement(referenceId=");
        sb.append(this.referenceId);
        sb.append(", headerBidding=");
        sb.append(this.headerBidding);
        sb.append(", type=");
        return a.p(sb, this.type, ')');
    }

    public Placement(String referenceId, boolean z2, String str) {
        Intrinsics.f(referenceId, "referenceId");
        this.referenceId = referenceId;
        this.headerBidding = z2;
        this.type = str;
    }

    public /* synthetic */ Placement(String str, boolean z2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : str2);
    }
}
