package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.network.Endpoints;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.mediationsdk.metadata.a;
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
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 C2\u00020\u0001:\u0002BCB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B³\u0001\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aB\u009f\u0001\b\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u001bJ!\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AHÇ\u0001R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\"R \u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010(\u0012\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010'R \u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010(\u0012\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010'R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001d\u001a\u0004\b\u0010\u0010,R\u001e\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010\"R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\"R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001d\u001a\u0004\b2\u0010\"R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001d\u001a\u0004\b4\u0010\"R\u001e\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u001d\u001a\u0004\b6\u0010\"R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u001d\u001a\u0004\b8\u0010\"R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010(\u0012\u0004\b9\u0010\u001d\u001a\u0004\b:\u0010'¨\u0006D"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/MetricsData;", "", "metrics", "Lcom/chartboost/heliumsdk/domain/Metrics;", "(Lcom/chartboost/heliumsdk/domain/Metrics;)V", "seen1", "", "networkType", "", "lineItemId", "partnerPlacement", "partner", "start", "", TtmlNode.END, "duration", "isSuccess", "", "chartboostMediationError", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "chartboostMediationErrorCode", "chartboostMediationErrorMessage", "partnerSdkVersion", "partnerAdapterVersion", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ZLcom/chartboost/heliumsdk/domain/ChartboostMediationError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ZLcom/chartboost/heliumsdk/domain/ChartboostMediationError;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChartboostMediationError$annotations", "()V", "getChartboostMediationError", "()Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "getChartboostMediationErrorCode$annotations", "getChartboostMediationErrorCode", "()Ljava/lang/String;", "getChartboostMediationErrorMessage$annotations", "getChartboostMediationErrorMessage", "getDuration$annotations", "getDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEnd$annotations", "getEnd", "isSuccess$annotations", "()Z", "getLineItemId$annotations", "getLineItemId", "getNetworkType$annotations", "getNetworkType", "getPartner$annotations", "getPartner", "getPartnerAdapterVersion$annotations", "getPartnerAdapterVersion", "getPartnerPlacement$annotations", "getPartnerPlacement", "getPartnerSdkVersion$annotations", "getPartnerSdkVersion", "getStart$annotations", "getStart", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class MetricsData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile long startLastKnownGood = System.currentTimeMillis();
    private final ChartboostMediationError chartboostMediationError;
    private final String chartboostMediationErrorCode;
    private final String chartboostMediationErrorMessage;
    private final Long duration;
    private final Long end;
    private final boolean isSuccess;
    private final String lineItemId;
    private final String networkType;
    private final String partner;
    private final String partnerAdapterVersion;
    private final String partnerPlacement;
    private final String partnerSdkVersion;
    private final Long start;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/MetricsData$Companion;", "", "()V", "startLastKnownGood", "", "didPartnerTimeOut", "", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "resolveStartTime", "metrics", "Lcom/chartboost/heliumsdk/domain/Metrics;", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/MetricsData;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean didPartnerTimeOut(ChartboostMediationError error) {
            return error == ChartboostMediationError.CM_INITIALIZATION_FAILURE_TIMEOUT || error == ChartboostMediationError.CM_PREBID_FAILURE_TIMEOUT || error == ChartboostMediationError.CM_LOAD_FAILURE_TIMEOUT || error == ChartboostMediationError.CM_SHOW_FAILURE_TIMEOUT || error == ChartboostMediationError.CM_INVALIDATE_FAILURE_TIMEOUT;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long resolveStartTime(Metrics metrics) {
            Endpoints.Sdk.Event event = metrics.getEvent();
            Long start = metrics.getStart();
            Long end = metrics.getEnd();
            if (event != Endpoints.Sdk.Event.INITIALIZATION) {
                return start != null ? start.longValue() : System.currentTimeMillis();
            }
            if (start != null && (end == null || start.longValue() <= end.longValue())) {
                MetricsData.startLastKnownGood = start.longValue();
                return start.longValue();
            }
            if (start != null && end != null && start.longValue() > end.longValue()) {
                return end.longValue();
            }
            Long lValueOf = Long.valueOf(MetricsData.startLastKnownGood);
            if (lValueOf.longValue() > (end != null ? end.longValue() : Long.MAX_VALUE)) {
                lValueOf = null;
            }
            return lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis();
        }

        public final KSerializer<MetricsData> serializer() {
            return MetricsData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ MetricsData(int i2, @SerialName("network_type") String str, @SerialName("line_item_id") String str2, @SerialName("partner_placement") String str3, @SerialName("partner") String str4, @SerialName("start") Long l2, @SerialName(TtmlNode.END) Long l3, @SerialName("duration") Long l4, @SerialName("is_success") boolean z2, @SerialName("helium_error") ChartboostMediationError chartboostMediationError, @SerialName("helium_error_code") String str5, @SerialName("helium_error_message") String str6, @SerialName("partner_sdk_version") String str7, @SerialName("partner_adapter_version") String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (128 != (i2 & 128)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 128, MetricsData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.networkType = null;
        } else {
            this.networkType = str;
        }
        if ((i2 & 2) == 0) {
            this.lineItemId = null;
        } else {
            this.lineItemId = str2;
        }
        if ((i2 & 4) == 0) {
            this.partnerPlacement = null;
        } else {
            this.partnerPlacement = str3;
        }
        if ((i2 & 8) == 0) {
            this.partner = null;
        } else {
            this.partner = str4;
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
        this.isSuccess = z2;
        if ((i2 & 256) == 0) {
            this.chartboostMediationError = null;
        } else {
            this.chartboostMediationError = chartboostMediationError;
        }
        if ((i2 & 512) == 0) {
            this.chartboostMediationErrorCode = null;
        } else {
            this.chartboostMediationErrorCode = str5;
        }
        if ((i2 & 1024) == 0) {
            this.chartboostMediationErrorMessage = null;
        } else {
            this.chartboostMediationErrorMessage = str6;
        }
        if ((i2 & a.f25965n) == 0) {
            this.partnerSdkVersion = null;
        } else {
            this.partnerSdkVersion = str7;
        }
        if ((i2 & 4096) == 0) {
            this.partnerAdapterVersion = null;
        } else {
            this.partnerAdapterVersion = str8;
        }
    }

    @SerialName("helium_error")
    public static /* synthetic */ void getChartboostMediationError$annotations() {
    }

    @SerialName("helium_error_code")
    public static /* synthetic */ void getChartboostMediationErrorCode$annotations() {
    }

    @SerialName("helium_error_message")
    public static /* synthetic */ void getChartboostMediationErrorMessage$annotations() {
    }

    @SerialName("duration")
    public static /* synthetic */ void getDuration$annotations() {
    }

    @SerialName(TtmlNode.END)
    public static /* synthetic */ void getEnd$annotations() {
    }

    @SerialName("line_item_id")
    public static /* synthetic */ void getLineItemId$annotations() {
    }

    @SerialName("network_type")
    public static /* synthetic */ void getNetworkType$annotations() {
    }

    @SerialName("partner")
    public static /* synthetic */ void getPartner$annotations() {
    }

    @SerialName("partner_adapter_version")
    public static /* synthetic */ void getPartnerAdapterVersion$annotations() {
    }

    @SerialName("partner_placement")
    public static /* synthetic */ void getPartnerPlacement$annotations() {
    }

    @SerialName("partner_sdk_version")
    public static /* synthetic */ void getPartnerSdkVersion$annotations() {
    }

    @SerialName("start")
    public static /* synthetic */ void getStart$annotations() {
    }

    @SerialName("is_success")
    public static /* synthetic */ void isSuccess$annotations() {
    }

    @JvmStatic
    public static final void write$Self(MetricsData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.networkType != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.networkType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.lineItemId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.lineItemId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.partnerPlacement != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.partnerPlacement);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.partner != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.partner);
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
        output.encodeBooleanElement(serialDesc, 7, self.isSuccess);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.chartboostMediationError != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, EnumsKt.createSimpleEnumSerializer("com.chartboost.heliumsdk.domain.ChartboostMediationError", ChartboostMediationError.values()), self.chartboostMediationError);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.chartboostMediationErrorCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.chartboostMediationErrorCode);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.chartboostMediationErrorMessage != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.chartboostMediationErrorMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.partnerSdkVersion != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.partnerSdkVersion);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 12) && self.partnerAdapterVersion == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.partnerAdapterVersion);
    }

    public final ChartboostMediationError getChartboostMediationError() {
        return this.chartboostMediationError;
    }

    public final String getChartboostMediationErrorCode() {
        return this.chartboostMediationErrorCode;
    }

    public final String getChartboostMediationErrorMessage() {
        return this.chartboostMediationErrorMessage;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final Long getEnd() {
        return this.end;
    }

    public final String getLineItemId() {
        return this.lineItemId;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final String getPartner() {
        return this.partner;
    }

    public final String getPartnerAdapterVersion() {
        return this.partnerAdapterVersion;
    }

    public final String getPartnerPlacement() {
        return this.partnerPlacement;
    }

    public final String getPartnerSdkVersion() {
        return this.partnerSdkVersion;
    }

    public final Long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    private MetricsData(String str, String str2, String str3, String str4, Long l2, Long l3, Long l4, boolean z2, ChartboostMediationError chartboostMediationError, String str5, String str6, String str7, String str8) {
        this.networkType = str;
        this.lineItemId = str2;
        this.partnerPlacement = str3;
        this.partner = str4;
        this.start = l2;
        this.end = l3;
        this.duration = l4;
        this.isSuccess = z2;
        this.chartboostMediationError = chartboostMediationError;
        this.chartboostMediationErrorCode = str5;
        this.chartboostMediationErrorMessage = str6;
        this.partnerSdkVersion = str7;
        this.partnerAdapterVersion = str8;
    }

    public /* synthetic */ MetricsData(String str, String str2, String str3, String str4, Long l2, Long l3, Long l4, boolean z2, ChartboostMediationError chartboostMediationError, String str5, String str6, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : l2, (i2 & 32) != 0 ? null : l3, (i2 & 64) != 0 ? null : l4, z2, (i2 & 256) != 0 ? null : chartboostMediationError, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : str6, (i2 & a.f25965n) != 0 ? null : str7, (i2 & 4096) != 0 ? null : str8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MetricsData(Metrics metrics) {
        Long duration;
        Intrinsics.f(metrics, "metrics");
        String networkType = metrics.getNetworkType();
        String lineItemId = metrics.getLineItemId();
        String partnerPlacement = metrics.getPartnerPlacement();
        String partner = metrics.getPartner();
        Companion companion = INSTANCE;
        Long lValueOf = Long.valueOf(companion.resolveStartTime(metrics));
        Long end = companion.didPartnerTimeOut(metrics.getChartboostMediationError()) ? null : metrics.getEnd();
        Long duration2 = (companion.didPartnerTimeOut(metrics.getChartboostMediationError()) || (duration = metrics.getDuration()) == null || Long.signum(duration.longValue()) != 1) ? null : metrics.getDuration();
        boolean isSuccess = metrics.getIsSuccess();
        ChartboostMediationError chartboostMediationError = metrics.getChartboostMediationError();
        ChartboostMediationError chartboostMediationError2 = metrics.getChartboostMediationError();
        this(networkType, lineItemId, partnerPlacement, partner, lValueOf, end, duration2, isSuccess, chartboostMediationError, chartboostMediationError2 != null ? chartboostMediationError2.getCode() : null, metrics.getChartboostMediationErrorMessage(), metrics.getPartnerSdkVersion(), metrics.getPartnerAdapterVersion());
    }
}
