package com.chartboost.heliumsdk.network.model;

import androidx.datastore.preferences.protobuf.a;
import com.chartboost.heliumsdk.HeliumSdk;
import com.p004ironsource.x4;
import com.smartdigimkt.f3.b;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-B]\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB;\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÂ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÂ\u0003JL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÇ\u0001R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010\u0011\u0012\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0010¨\u0006."}, d2 = {"Lcom/chartboost/heliumsdk/network/model/QueueRequestBody;", "", "seen1", "", b.f35043u, "", "placementName", "actualMaxQueueSize", "queueCapacity", "currentQueueDepth", "queueId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IILjava/lang/String;)V", "getActualMaxQueueSize$annotations", "()V", "Ljava/lang/Integer;", "getAppId$annotations", "getCurrentQueueDepth$annotations", "getPlacementName$annotations", "getQueueCapacity$annotations", "getQueueId$annotations", "component1", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IILjava/lang/String;)Lcom/chartboost/heliumsdk/network/model/QueueRequestBody;", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class QueueRequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer actualMaxQueueSize;
    private final String appId;
    private final int currentQueueDepth;
    private final String placementName;
    private final int queueCapacity;
    private final String queueId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/QueueRequestBody$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/QueueRequestBody;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QueueRequestBody> serializer() {
            return QueueRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ QueueRequestBody(int i2, @SerialName("app_id") String str, @SerialName("placement_name") String str2, @SerialName("actual_max_queue_size") Integer num, @SerialName("queue_capacity") int i3, @SerialName("current_queue_depth") int i4, @SerialName("queue_id") String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (58 != (i2 & 58)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 58, QueueRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0 && (str = HeliumSdk.INSTANCE.getAppId()) == null) {
            str = "";
        }
        this.appId = str;
        this.placementName = str2;
        if ((i2 & 4) == 0) {
            this.actualMaxQueueSize = null;
        } else {
            this.actualMaxQueueSize = num;
        }
        this.queueCapacity = i3;
        this.currentQueueDepth = i4;
        this.queueId = str3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getPlacementName() {
        return this.placementName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final Integer getActualMaxQueueSize() {
        return this.actualMaxQueueSize;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final int getQueueCapacity() {
        return this.queueCapacity;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final int getCurrentQueueDepth() {
        return this.currentQueueDepth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final String getQueueId() {
        return this.queueId;
    }

    public static /* synthetic */ QueueRequestBody copy$default(QueueRequestBody queueRequestBody, String str, String str2, Integer num, int i2, int i3, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = queueRequestBody.appId;
        }
        if ((i4 & 2) != 0) {
            str2 = queueRequestBody.placementName;
        }
        if ((i4 & 4) != 0) {
            num = queueRequestBody.actualMaxQueueSize;
        }
        if ((i4 & 8) != 0) {
            i2 = queueRequestBody.queueCapacity;
        }
        if ((i4 & 16) != 0) {
            i3 = queueRequestBody.currentQueueDepth;
        }
        if ((i4 & 32) != 0) {
            str3 = queueRequestBody.queueId;
        }
        int i5 = i3;
        String str4 = str3;
        return queueRequestBody.copy(str, str2, num, i2, i5, str4);
    }

    @SerialName("actual_max_queue_size")
    private static /* synthetic */ void getActualMaxQueueSize$annotations() {
    }

    @SerialName("app_id")
    private static /* synthetic */ void getAppId$annotations() {
    }

    @SerialName("current_queue_depth")
    private static /* synthetic */ void getCurrentQueueDepth$annotations() {
    }

    @SerialName("placement_name")
    private static /* synthetic */ void getPlacementName$annotations() {
    }

    @SerialName("queue_capacity")
    private static /* synthetic */ void getQueueCapacity$annotations() {
    }

    @SerialName("queue_id")
    private static /* synthetic */ void getQueueId$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    @JvmStatic
    public static final void write$Self(QueueRequestBody self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeStringElement(serialDesc, 0, self.appId);
        } else {
            String str = self.appId;
            String appId = HeliumSdk.INSTANCE.getAppId();
            if (appId == null) {
                appId = "";
            }
            if (!Intrinsics.a(str, appId)) {
                output.encodeStringElement(serialDesc, 0, self.appId);
            }
        }
        output.encodeStringElement(serialDesc, 1, self.placementName);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.actualMaxQueueSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.actualMaxQueueSize);
        }
        output.encodeIntElement(serialDesc, 3, self.queueCapacity);
        output.encodeIntElement(serialDesc, 4, self.currentQueueDepth);
        output.encodeStringElement(serialDesc, 5, self.queueId);
    }

    public final QueueRequestBody copy(String appId, String placementName, Integer actualMaxQueueSize, int queueCapacity, int currentQueueDepth, String queueId) {
        Intrinsics.f(appId, "appId");
        Intrinsics.f(placementName, "placementName");
        Intrinsics.f(queueId, "queueId");
        return new QueueRequestBody(appId, placementName, actualMaxQueueSize, queueCapacity, currentQueueDepth, queueId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueueRequestBody)) {
            return false;
        }
        QueueRequestBody queueRequestBody = (QueueRequestBody) other;
        return Intrinsics.a(this.appId, queueRequestBody.appId) && Intrinsics.a(this.placementName, queueRequestBody.placementName) && Intrinsics.a(this.actualMaxQueueSize, queueRequestBody.actualMaxQueueSize) && this.queueCapacity == queueRequestBody.queueCapacity && this.currentQueueDepth == queueRequestBody.currentQueueDepth && Intrinsics.a(this.queueId, queueRequestBody.queueId);
    }

    public int hashCode() {
        int iB = a.b(this.placementName, this.appId.hashCode() * 31, 31);
        Integer num = this.actualMaxQueueSize;
        return this.queueId.hashCode() + androidx.media3.extractor.text.ttml.a.a(this.currentQueueDepth, androidx.media3.extractor.text.ttml.a.a(this.queueCapacity, (iB + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("QueueRequestBody(appId=");
        sb.append(this.appId);
        sb.append(", placementName=");
        sb.append(this.placementName);
        sb.append(", actualMaxQueueSize=");
        sb.append(this.actualMaxQueueSize);
        sb.append(", queueCapacity=");
        sb.append(this.queueCapacity);
        sb.append(", currentQueueDepth=");
        sb.append(this.currentQueueDepth);
        sb.append(", queueId=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.queueId, ')');
    }

    public QueueRequestBody(String appId, String placementName, Integer num, int i2, int i3, String queueId) {
        Intrinsics.f(appId, "appId");
        Intrinsics.f(placementName, "placementName");
        Intrinsics.f(queueId, "queueId");
        this.appId = appId;
        this.placementName = placementName;
        this.actualMaxQueueSize = num;
        this.queueCapacity = i2;
        this.currentQueueDepth = i3;
        this.queueId = queueId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ QueueRequestBody(String str, String str2, Integer num, int i2, int i3, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i4 & 1) != 0 && (str = HeliumSdk.INSTANCE.getAppId()) == null) {
            str = "";
        }
        this(str, str2, (i4 & 4) != 0 ? null : num, i2, i3, str3);
    }
}
