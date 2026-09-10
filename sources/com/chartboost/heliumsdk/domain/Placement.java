package com.chartboost.heliumsdk.domain;

import androidx.datastore.preferences.protobuf.a;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201BO\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB3\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J;\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001J!\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/HÇ\u0001R\u001c\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0016¨\u00062"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Placement;", "", "seen1", "", "autoRefreshRate", "chartboostPlacement", "", "format", "Lcom/chartboost/heliumsdk/domain/AdFormat;", "adQueueingEnabled", "", "queueSize", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Lcom/chartboost/heliumsdk/domain/AdFormat;ZILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;Lcom/chartboost/heliumsdk/domain/AdFormat;ZI)V", "getAdQueueingEnabled$annotations", "()V", "getAdQueueingEnabled", "()Z", "getAutoRefreshRate$annotations", "getAutoRefreshRate", "()I", "getChartboostPlacement$annotations", "getChartboostPlacement", "()Ljava/lang/String;", "getFormat$annotations", "getFormat", "()Lcom/chartboost/heliumsdk/domain/AdFormat;", "getQueueSize$annotations", "getQueueSize", "component1", "component2", "component3", "component4", "component5", "copy", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class Placement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean adQueueingEnabled;
    private final int autoRefreshRate;
    private final String chartboostPlacement;
    private final AdFormat format;
    private final int queueSize;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Placement$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/domain/Placement;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    public /* synthetic */ Placement(int i2, @SerialName("auto_refresh_rate") int i3, @SerialName("chartboost_placement") String str, @SerialName("format") @Serializable(with = AdFormatEnumSetSerializer.class) AdFormat adFormat, @SerialName("ad_queueing_enabled") boolean z2, @SerialName("queue_size") int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i2 & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 6, Placement$$serializer.INSTANCE.getDescriptor());
        }
        this.autoRefreshRate = (i2 & 1) == 0 ? 0 : i3;
        this.chartboostPlacement = str;
        this.format = adFormat;
        if ((i2 & 8) == 0) {
            this.adQueueingEnabled = true;
        } else {
            this.adQueueingEnabled = z2;
        }
        if ((i2 & 16) == 0) {
            this.queueSize = 2;
        } else {
            this.queueSize = i4;
        }
    }

    public static /* synthetic */ Placement copy$default(Placement placement, int i2, String str, AdFormat adFormat, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = placement.autoRefreshRate;
        }
        if ((i4 & 2) != 0) {
            str = placement.chartboostPlacement;
        }
        if ((i4 & 4) != 0) {
            adFormat = placement.format;
        }
        if ((i4 & 8) != 0) {
            z2 = placement.adQueueingEnabled;
        }
        if ((i4 & 16) != 0) {
            i3 = placement.queueSize;
        }
        int i5 = i3;
        AdFormat adFormat2 = adFormat;
        return placement.copy(i2, str, adFormat2, z2, i5);
    }

    @SerialName("ad_queueing_enabled")
    public static /* synthetic */ void getAdQueueingEnabled$annotations() {
    }

    @SerialName("auto_refresh_rate")
    public static /* synthetic */ void getAutoRefreshRate$annotations() {
    }

    @SerialName("chartboost_placement")
    public static /* synthetic */ void getChartboostPlacement$annotations() {
    }

    @SerialName("format")
    @Serializable(with = AdFormatEnumSetSerializer.class)
    public static /* synthetic */ void getFormat$annotations() {
    }

    @SerialName("queue_size")
    public static /* synthetic */ void getQueueSize$annotations() {
    }

    @JvmStatic
    public static final void write$Self(Placement self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.autoRefreshRate != 0) {
            output.encodeIntElement(serialDesc, 0, self.autoRefreshRate);
        }
        output.encodeStringElement(serialDesc, 1, self.chartboostPlacement);
        output.encodeSerializableElement(serialDesc, 2, AdFormatEnumSetSerializer.INSTANCE, self.format);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !self.adQueueingEnabled) {
            output.encodeBooleanElement(serialDesc, 3, self.adQueueingEnabled);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.queueSize == 2) {
            return;
        }
        output.encodeIntElement(serialDesc, 4, self.queueSize);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAutoRefreshRate() {
        return this.autoRefreshRate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChartboostPlacement() {
        return this.chartboostPlacement;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AdFormat getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getAdQueueingEnabled() {
        return this.adQueueingEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getQueueSize() {
        return this.queueSize;
    }

    public final Placement copy(int autoRefreshRate, String chartboostPlacement, AdFormat format, boolean adQueueingEnabled, int queueSize) {
        Intrinsics.f(chartboostPlacement, "chartboostPlacement");
        Intrinsics.f(format, "format");
        return new Placement(autoRefreshRate, chartboostPlacement, format, adQueueingEnabled, queueSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Placement)) {
            return false;
        }
        Placement placement = (Placement) other;
        return this.autoRefreshRate == placement.autoRefreshRate && Intrinsics.a(this.chartboostPlacement, placement.chartboostPlacement) && this.format == placement.format && this.adQueueingEnabled == placement.adQueueingEnabled && this.queueSize == placement.queueSize;
    }

    public final boolean getAdQueueingEnabled() {
        return this.adQueueingEnabled;
    }

    public final int getAutoRefreshRate() {
        return this.autoRefreshRate;
    }

    public final String getChartboostPlacement() {
        return this.chartboostPlacement;
    }

    public final AdFormat getFormat() {
        return this.format;
    }

    public final int getQueueSize() {
        return this.queueSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    public int hashCode() {
        int iHashCode = (this.format.hashCode() + a.b(this.chartboostPlacement, Integer.hashCode(this.autoRefreshRate) * 31, 31)) * 31;
        boolean z2 = this.adQueueingEnabled;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        return Integer.hashCode(this.queueSize) + ((iHashCode + r0) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Placement(autoRefreshRate=");
        sb.append(this.autoRefreshRate);
        sb.append(", chartboostPlacement=");
        sb.append(this.chartboostPlacement);
        sb.append(", format=");
        sb.append(this.format);
        sb.append(", adQueueingEnabled=");
        sb.append(this.adQueueingEnabled);
        sb.append(", queueSize=");
        return android.support.v4.media.a.p(sb, this.queueSize, ')');
    }

    public Placement(int i2, String chartboostPlacement, AdFormat format, boolean z2, int i3) {
        Intrinsics.f(chartboostPlacement, "chartboostPlacement");
        Intrinsics.f(format, "format");
        this.autoRefreshRate = i2;
        this.chartboostPlacement = chartboostPlacement;
        this.format = format;
        this.adQueueingEnabled = z2;
        this.queueSize = i3;
    }

    public /* synthetic */ Placement(int i2, String str, AdFormat adFormat, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i2, str, adFormat, (i4 & 8) != 0 ? true : z2, (i4 & 16) != 0 ? 2 : i3);
    }
}
