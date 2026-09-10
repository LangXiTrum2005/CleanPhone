package com.chartboost.heliumsdk.network.model;

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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'BU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÂ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÂ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J!\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÇ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u000f¨\u0006("}, d2 = {"Lcom/chartboost/heliumsdk/network/model/AdLoadNotificationRequestBody;", "", "seen1", "", "placementName", "", "adType", "loadId", "queueId", "status", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdType$annotations", "()V", "getLoadId$annotations", "getPlacementName$annotations", "getQueueId$annotations", "getStatus$annotations", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class AdLoadNotificationRequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String adType;
    private final String loadId;
    private final String placementName;
    private final String queueId;
    private final String status;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/AdLoadNotificationRequestBody$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/AdLoadNotificationRequestBody;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdLoadNotificationRequestBody> serializer() {
            return AdLoadNotificationRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ AdLoadNotificationRequestBody(int i2, @SerialName("placement_name") String str, @SerialName("ad_type") String str2, @SerialName("load_id") String str3, @SerialName("queue_id") String str4, @SerialName("status") String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i2 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 31, AdLoadNotificationRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.placementName = str;
        this.adType = str2;
        this.loadId = str3;
        this.queueId = str4;
        this.status = str5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getPlacementName() {
        return this.placementName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getAdType() {
        return this.adType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getLoadId() {
        return this.loadId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final String getQueueId() {
        return this.queueId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getStatus() {
        return this.status;
    }

    public static /* synthetic */ AdLoadNotificationRequestBody copy$default(AdLoadNotificationRequestBody adLoadNotificationRequestBody, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = adLoadNotificationRequestBody.placementName;
        }
        if ((i2 & 2) != 0) {
            str2 = adLoadNotificationRequestBody.adType;
        }
        if ((i2 & 4) != 0) {
            str3 = adLoadNotificationRequestBody.loadId;
        }
        if ((i2 & 8) != 0) {
            str4 = adLoadNotificationRequestBody.queueId;
        }
        if ((i2 & 16) != 0) {
            str5 = adLoadNotificationRequestBody.status;
        }
        String str6 = str5;
        String str7 = str3;
        return adLoadNotificationRequestBody.copy(str, str2, str7, str4, str6);
    }

    @SerialName("ad_type")
    private static /* synthetic */ void getAdType$annotations() {
    }

    @SerialName("load_id")
    private static /* synthetic */ void getLoadId$annotations() {
    }

    @SerialName("placement_name")
    private static /* synthetic */ void getPlacementName$annotations() {
    }

    @SerialName("queue_id")
    private static /* synthetic */ void getQueueId$annotations() {
    }

    @SerialName("status")
    private static /* synthetic */ void getStatus$annotations() {
    }

    @JvmStatic
    public static final void write$Self(AdLoadNotificationRequestBody self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.placementName);
        output.encodeStringElement(serialDesc, 1, self.adType);
        output.encodeStringElement(serialDesc, 2, self.loadId);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.queueId);
        output.encodeStringElement(serialDesc, 4, self.status);
    }

    public final AdLoadNotificationRequestBody copy(String placementName, String adType, String loadId, String queueId, String status) {
        Intrinsics.f(placementName, "placementName");
        Intrinsics.f(adType, "adType");
        Intrinsics.f(loadId, "loadId");
        Intrinsics.f(status, "status");
        return new AdLoadNotificationRequestBody(placementName, adType, loadId, queueId, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdLoadNotificationRequestBody)) {
            return false;
        }
        AdLoadNotificationRequestBody adLoadNotificationRequestBody = (AdLoadNotificationRequestBody) other;
        return Intrinsics.a(this.placementName, adLoadNotificationRequestBody.placementName) && Intrinsics.a(this.adType, adLoadNotificationRequestBody.adType) && Intrinsics.a(this.loadId, adLoadNotificationRequestBody.loadId) && Intrinsics.a(this.queueId, adLoadNotificationRequestBody.queueId) && Intrinsics.a(this.status, adLoadNotificationRequestBody.status);
    }

    public int hashCode() {
        int iB = a.b(this.loadId, a.b(this.adType, this.placementName.hashCode() * 31, 31), 31);
        String str = this.queueId;
        return this.status.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdLoadNotificationRequestBody(placementName=");
        sb.append(this.placementName);
        sb.append(", adType=");
        sb.append(this.adType);
        sb.append(", loadId=");
        sb.append(this.loadId);
        sb.append(", queueId=");
        sb.append(this.queueId);
        sb.append(", status=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.status, ')');
    }

    public AdLoadNotificationRequestBody(String placementName, String adType, String loadId, String str, String status) {
        Intrinsics.f(placementName, "placementName");
        Intrinsics.f(adType, "adType");
        Intrinsics.f(loadId, "loadId");
        Intrinsics.f(status, "status");
        this.placementName = placementName;
        this.adType = adType;
        this.loadId = loadId;
        this.queueId = str;
        this.status = status;
    }
}
