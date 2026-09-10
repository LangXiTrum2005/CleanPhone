package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.domain.MetricsError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 >2\u00020\u0001:\u0002=>B£\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017B\u008b\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0018J!\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<HÇ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010 \u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR \u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010 \u0012\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001fR \u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010 \u0012\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010'R\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010*R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001cR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010\u001cR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001cR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001a\u001a\u0004\b2\u00103R \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010 \u0012\u0004\b4\u0010\u001a\u001a\u0004\b5\u0010\u001f¨\u0006?"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/MetricsRequestBody;", "", "seen1", "", "auctionId", "", "queueId", "placementType", "size", "Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;", "start", "", TtmlNode.END, "duration", "backgroundDurationMs", "result", "metrics", "", "Lcom/chartboost/heliumsdk/network/model/MetricsData;", "error", "Lcom/chartboost/heliumsdk/domain/MetricsError;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Set;Lcom/chartboost/heliumsdk/domain/MetricsError;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Set;Lcom/chartboost/heliumsdk/domain/MetricsError;)V", "getAuctionId$annotations", "()V", "getAuctionId", "()Ljava/lang/String;", "getBackgroundDurationMs$annotations", "getBackgroundDurationMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDuration$annotations", "getDuration", "getEnd$annotations", "getEnd", "getError$annotations", "getError", "()Lcom/chartboost/heliumsdk/domain/MetricsError;", "getMetrics$annotations", "getMetrics", "()Ljava/util/Set;", "getPlacementType$annotations", "getPlacementType", "getQueueId$annotations", "getQueueId", "getResult$annotations", "getResult", "getSize$annotations", "getSize", "()Lcom/chartboost/heliumsdk/network/model/BannerAdDimensions;", "getStart$annotations", "getStart", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class MetricsRequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String auctionId;
    private final Long backgroundDurationMs;
    private final Long duration;
    private final Long end;
    private final MetricsError error;
    private final Set<MetricsData> metrics;
    private final String placementType;
    private final String queueId;
    private final String result;
    private final BannerAdDimensions size;
    private final Long start;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/MetricsRequestBody$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/MetricsRequestBody;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MetricsRequestBody> serializer() {
            return MetricsRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ MetricsRequestBody(int i2, @SerialName("auction_id") String str, @SerialName("queue_id") String str2, @SerialName("placement_type") String str3, @SerialName("size") BannerAdDimensions bannerAdDimensions, @SerialName("start") Long l2, @SerialName(TtmlNode.END) Long l3, @SerialName("duration") Long l4, @SerialName("background_duration") Long l5, @SerialName("result") String str4, @SerialName("metrics") Set set, @SerialName("error") MetricsError metricsError, SerializationConstructorMarker serializationConstructorMarker) {
        if (512 != (i2 & 512)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 512, MetricsRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.auctionId = null;
        } else {
            this.auctionId = str;
        }
        if ((i2 & 2) == 0) {
            this.queueId = null;
        } else {
            this.queueId = str2;
        }
        if ((i2 & 4) == 0) {
            this.placementType = null;
        } else {
            this.placementType = str3;
        }
        if ((i2 & 8) == 0) {
            this.size = null;
        } else {
            this.size = bannerAdDimensions;
        }
        if ((i2 & 16) == 0) {
            this.start = null;
        } else {
            this.start = l2;
        }
        if ((i2 & 32) == 0) {
            this.end = null;
        } else {
            this.end = l3;
        }
        if ((i2 & 64) == 0) {
            this.duration = null;
        } else {
            this.duration = l4;
        }
        if ((i2 & 128) == 0) {
            this.backgroundDurationMs = null;
        } else {
            this.backgroundDurationMs = l5;
        }
        if ((i2 & 256) == 0) {
            this.result = null;
        } else {
            this.result = str4;
        }
        this.metrics = set;
        if ((i2 & 1024) == 0) {
            this.error = null;
        } else {
            this.error = metricsError;
        }
    }

    @SerialName("auction_id")
    public static /* synthetic */ void getAuctionId$annotations() {
    }

    @SerialName("background_duration")
    public static /* synthetic */ void getBackgroundDurationMs$annotations() {
    }

    @SerialName("duration")
    public static /* synthetic */ void getDuration$annotations() {
    }

    @SerialName(TtmlNode.END)
    public static /* synthetic */ void getEnd$annotations() {
    }

    @SerialName("error")
    public static /* synthetic */ void getError$annotations() {
    }

    @SerialName("metrics")
    public static /* synthetic */ void getMetrics$annotations() {
    }

    @SerialName("placement_type")
    public static /* synthetic */ void getPlacementType$annotations() {
    }

    @SerialName("queue_id")
    public static /* synthetic */ void getQueueId$annotations() {
    }

    @SerialName("result")
    public static /* synthetic */ void getResult$annotations() {
    }

    @SerialName("size")
    public static /* synthetic */ void getSize$annotations() {
    }

    @SerialName("start")
    public static /* synthetic */ void getStart$annotations() {
    }

    @JvmStatic
    public static final void write$Self(MetricsRequestBody self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.auctionId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.auctionId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.queueId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.queueId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.placementType != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.placementType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.size != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, BannerAdDimensions$$serializer.INSTANCE, self.size);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.start != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, LongSerializer.INSTANCE, self.start);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.end != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.end);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.duration != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, LongSerializer.INSTANCE, self.duration);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.backgroundDurationMs != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, LongSerializer.INSTANCE, self.backgroundDurationMs);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.result != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, new ContextualSerializer(Reflection.f43333a.b(String.class), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), new KSerializer[0]), self.result);
        }
        output.encodeSerializableElement(serialDesc, 9, new LinkedHashSetSerializer(MetricsData$$serializer.INSTANCE), self.metrics);
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.error == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, new ContextualSerializer(Reflection.f43333a.b(MetricsError.class), BuiltinSerializersKt.getNullable(MetricsError.INSTANCE.serializer()), new KSerializer[0]), self.error);
    }

    public final String getAuctionId() {
        return this.auctionId;
    }

    public final Long getBackgroundDurationMs() {
        return this.backgroundDurationMs;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final Long getEnd() {
        return this.end;
    }

    public final MetricsError getError() {
        return this.error;
    }

    public final Set<MetricsData> getMetrics() {
        return this.metrics;
    }

    public final String getPlacementType() {
        return this.placementType;
    }

    public final String getQueueId() {
        return this.queueId;
    }

    public final String getResult() {
        return this.result;
    }

    public final BannerAdDimensions getSize() {
        return this.size;
    }

    public final Long getStart() {
        return this.start;
    }

    public MetricsRequestBody(String str, String str2, String str3, BannerAdDimensions bannerAdDimensions, Long l2, Long l3, Long l4, Long l5, String str4, Set<MetricsData> metrics, MetricsError metricsError) {
        Intrinsics.f(metrics, "metrics");
        this.auctionId = str;
        this.queueId = str2;
        this.placementType = str3;
        this.size = bannerAdDimensions;
        this.start = l2;
        this.end = l3;
        this.duration = l4;
        this.backgroundDurationMs = l5;
        this.result = str4;
        this.metrics = metrics;
        this.error = metricsError;
    }

    public /* synthetic */ MetricsRequestBody(String str, String str2, String str3, BannerAdDimensions bannerAdDimensions, Long l2, Long l3, Long l4, Long l5, String str4, Set set, MetricsError metricsError, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : bannerAdDimensions, (i2 & 16) != 0 ? null : l2, (i2 & 32) != 0 ? null : l3, (i2 & 64) != 0 ? null : l4, (i2 & 128) != 0 ? null : l5, (i2 & 256) != 0 ? null : str4, set, (i2 & 1024) != 0 ? null : metricsError);
    }
}
