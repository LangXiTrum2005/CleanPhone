package com.chartboost.heliumsdk.domain;

import android.util.Size;
import com.chartboost.heliumsdk.network.Endpoints;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.smartdigimkt.m6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001FB\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010E\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\r8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00038FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR \u0010\u0015\u001a\u0004\u0018\u00010\u00168FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR\u001c\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\tR\u001c\u0010-\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR\u001c\u00100\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000bR\u001c\u00103\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\t\"\u0004\b5\u0010\u000bR\u001c\u00106\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\t\"\u0004\b8\u0010\u000bR\u001c\u00109\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010\u000bR\u001c\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010B\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\bC\u0010\u0018\"\u0004\bD\u0010\u001a¨\u0006G"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Metrics;", "", "partner", "", "event", "Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event;", "(Ljava/lang/String;Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event;)V", "auctionId", "getAuctionId", "()Ljava/lang/String;", "setAuctionId", "(Ljava/lang/String;)V", "chartboostMediationError", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "getChartboostMediationError", "()Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "setChartboostMediationError", "(Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;)V", "chartboostMediationErrorMessage", "getChartboostMediationErrorMessage", "setChartboostMediationErrorMessage", "duration", "", "getDuration", "()Ljava/lang/Long;", "setDuration", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", TtmlNode.END, "getEnd", "setEnd", "getEvent", "()Lcom/chartboost/heliumsdk/network/Endpoints$Sdk$Event;", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "lineItemId", "getLineItemId", "setLineItemId", "networkType", "getNetworkType", "setNetworkType", "getPartner", "partnerAdapterVersion", "getPartnerAdapterVersion", "setPartnerAdapterVersion", "partnerPlacement", "getPartnerPlacement", "setPartnerPlacement", "partnerSdkVersion", "getPartnerSdkVersion", "setPartnerSdkVersion", "placementType", "getPlacementType", "setPlacementType", "queueId", "getQueueId", "setQueueId", "size", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "setSize", "(Landroid/util/Size;)V", "start", "getStart", "setStart", "getTimeoutForEvent", "NetworkType", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Metrics {
    private String auctionId;
    private ChartboostMediationError chartboostMediationError;
    private String chartboostMediationErrorMessage;
    private Long duration;
    private Long end;
    private final Endpoints.Sdk.Event event;
    private boolean isSuccess;
    private String lineItemId;
    private String networkType;
    private final String partner;
    private String partnerAdapterVersion;
    private String partnerPlacement;
    private String partnerSdkVersion;
    private String placementType;
    private String queueId;
    private Size size;
    private Long start;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Metrics$NetworkType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MEDIATION", "BIDDING", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum NetworkType {
        MEDIATION("mediation"),
        BIDDING(a.r.f36800z);


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Metrics$NetworkType$Companion;", "", "()V", "getType", "", "isMediation", "", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String getType(boolean isMediation) {
                return (isMediation ? NetworkType.MEDIATION : NetworkType.BIDDING).getValue();
            }

            private Companion() {
            }
        }

        NetworkType(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Endpoints.Sdk.Event.values().length];
            try {
                iArr[Endpoints.Sdk.Event.INITIALIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Endpoints.Sdk.Event.PREBID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Endpoints.Sdk.Event.LOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Endpoints.Sdk.Event.SHOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Metrics(String str, Endpoints.Sdk.Event event) {
        Intrinsics.f(event, "event");
        this.partner = str;
        this.event = event;
    }

    private final ChartboostMediationError getTimeoutForEvent(Endpoints.Sdk.Event event) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i2 == 1) {
            return ChartboostMediationError.CM_INITIALIZATION_FAILURE_TIMEOUT;
        }
        if (i2 == 2) {
            return ChartboostMediationError.CM_PREBID_FAILURE_TIMEOUT;
        }
        if (i2 != 3) {
            return i2 != 4 ? ChartboostMediationError.CM_UNKNOWN_ERROR : ChartboostMediationError.CM_SHOW_FAILURE_TIMEOUT;
        }
        return ChartboostMediationError.CM_LOAD_FAILURE_TIMEOUT;
    }

    public final String getAuctionId() {
        return this.auctionId;
    }

    public final ChartboostMediationError getChartboostMediationError() {
        if (this.isSuccess || this.chartboostMediationError != null) {
            return this.chartboostMediationError;
        }
        ChartboostMediationError timeoutForEvent = getTimeoutForEvent(this.event);
        this.chartboostMediationError = timeoutForEvent;
        return timeoutForEvent;
    }

    public final String getChartboostMediationErrorMessage() {
        if (this.isSuccess || this.chartboostMediationErrorMessage != null) {
            return this.chartboostMediationErrorMessage;
        }
        String message = getTimeoutForEvent(this.event).getMessage();
        this.chartboostMediationErrorMessage = message;
        return message;
    }

    public final Long getDuration() {
        long jValueOf = this.duration;
        if (jValueOf == null) {
            Long l2 = this.end;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                Long l3 = this.start;
                jValueOf = Long.valueOf(jLongValue - (l3 != null ? l3.longValue() : 0L));
            } else {
                jValueOf = 0L;
            }
            this.duration = jValueOf;
        }
        return jValueOf;
    }

    public final Long getEnd() {
        return this.end;
    }

    public final Endpoints.Sdk.Event getEvent() {
        return this.event;
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

    public final String getPlacementType() {
        return this.placementType;
    }

    public final String getQueueId() {
        return this.queueId;
    }

    public final Size getSize() {
        return this.size;
    }

    public final Long getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final void setAuctionId(String str) {
        this.auctionId = str;
    }

    public final void setChartboostMediationError(ChartboostMediationError chartboostMediationError) {
        this.chartboostMediationError = chartboostMediationError;
    }

    public final void setChartboostMediationErrorMessage(String str) {
        this.chartboostMediationErrorMessage = str;
    }

    public final void setDuration(Long l2) {
        this.duration = l2;
    }

    public final void setEnd(Long l2) {
        this.end = l2;
    }

    public final void setLineItemId(String str) {
        this.lineItemId = str;
    }

    public final void setNetworkType(String str) {
        this.networkType = str;
    }

    public final void setPartnerAdapterVersion(String str) {
        this.partnerAdapterVersion = str;
    }

    public final void setPartnerPlacement(String str) {
        this.partnerPlacement = str;
    }

    public final void setPartnerSdkVersion(String str) {
        this.partnerSdkVersion = str;
    }

    public final void setPlacementType(String str) {
        this.placementType = str;
    }

    public final void setQueueId(String str) {
        this.queueId = str;
    }

    public final void setSize(Size size) {
        this.size = size;
    }

    public final void setStart(Long l2) {
        this.start = l2;
    }

    public final void setSuccess(boolean z2) {
        this.isSuccess = z2;
    }
}
