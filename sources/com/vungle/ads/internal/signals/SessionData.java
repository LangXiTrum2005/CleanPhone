package com.vungle.ads.internal.signals;

import androidx.media3.extractor.text.ttml.a;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.p004ironsource.x4;
import com.thinkup.core.api.TUAdConst;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.model.UnclosedAd$$serializer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002OPB£\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0001\u0010\f\u001a\u00020\b\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0019J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u0013\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\t\u0010G\u001a\u00020\u0006HÖ\u0001J!\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020NHÇ\u0001R$\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0019R$\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u0011\u0010\u001d\"\u0004\b \u0010\u0019R$\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\u0012\u0010\u001d\"\u0004\b\"\u0010\u0019R$\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u0019R$\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001dR$\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b0\u0010\u001b\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u0019R$\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b3\u0010\u001b\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001b\u001a\u0004\b7\u00108R*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b9\u0010\u001b\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b>\u0010\u001b\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=¨\u0006Q"}, d2 = {"Lcom/vungle/ads/internal/signals/SessionData;", "", "seen1", "", "sessionCount", JsonStorageKeyNames.SESSION_ID_KEY, "", "sessionCreationTime", "", "signaledAd", "", "Lcom/vungle/ads/internal/signals/SignaledAd;", "sessionDuration", "sessionDepthCounter", "unclosedAd", "", "Lcom/vungle/ads/internal/model/UnclosedAd;", "isDevice", "isVPNConnected", "overlayGranted", "sensorCount", "httpProxyEnabled", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;JLjava/util/List;JILjava/util/List;IIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(I)V", "getHttpProxyEnabled$annotations", "()V", "getHttpProxyEnabled", "()I", "setHttpProxyEnabled", "isDevice$annotations", "setDevice", "isVPNConnected$annotations", "setVPNConnected", "getOverlayGranted$annotations", "getOverlayGranted", "setOverlayGranted", "getSensorCount$annotations", "getSensorCount", "setSensorCount", "getSessionCount$annotations", "getSessionCount", "getSessionCreationTime$annotations", "getSessionCreationTime", "()J", "setSessionCreationTime", "(J)V", "getSessionDepthCounter$annotations", "getSessionDepthCounter", "setSessionDepthCounter", "getSessionDuration$annotations", "getSessionDuration", "setSessionDuration", "getSessionId$annotations", "getSessionId", "()Ljava/lang/String;", "getSignaledAd$annotations", "getSignaledAd", "()Ljava/util/List;", "setSignaledAd", "(Ljava/util/List;)V", "getUnclosedAd$annotations", "getUnclosedAd", "setUnclosedAd", "component1", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
public final /* data */ class SessionData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int httpProxyEnabled;
    private int isDevice;
    private int isVPNConnected;
    private int overlayGranted;
    private int sensorCount;
    private final int sessionCount;
    private long sessionCreationTime;
    private int sessionDepthCounter;
    private long sessionDuration;
    private final String sessionId;
    private List<SignaledAd> signaledAd;
    private List<UnclosedAd> unclosedAd;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/signals/SessionData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/signals/SessionData;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SessionData> serializer() {
            return SessionData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SessionData(int i2) {
        this.sessionCount = i2;
        this.sessionId = a.m("randomUUID().toString()");
        this.sessionCreationTime = System.currentTimeMillis() / 1000;
        this.signaledAd = new ArrayList();
        this.unclosedAd = new ArrayList();
    }

    public static /* synthetic */ SessionData copy$default(SessionData sessionData, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = sessionData.sessionCount;
        }
        return sessionData.copy(i2);
    }

    @SerialName("116")
    public static /* synthetic */ void getHttpProxyEnabled$annotations() {
    }

    @SerialName("114")
    public static /* synthetic */ void getOverlayGranted$annotations() {
    }

    @SerialName("115")
    public static /* synthetic */ void getSensorCount$annotations() {
    }

    @SerialName("103")
    public static /* synthetic */ void getSessionCount$annotations() {
    }

    @SerialName("100")
    public static /* synthetic */ void getSessionCreationTime$annotations() {
    }

    @SerialName(TUAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_FLOOR)
    public static /* synthetic */ void getSessionDepthCounter$annotations() {
    }

    @SerialName("102")
    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    @SerialName(StatisticData.ERROR_CODE_IO_ERROR)
    public static /* synthetic */ void getSessionId$annotations() {
    }

    @SerialName("106")
    public static /* synthetic */ void getSignaledAd$annotations() {
    }

    @SerialName("105")
    public static /* synthetic */ void getUnclosedAd$annotations() {
    }

    @SerialName("112")
    public static /* synthetic */ void isDevice$annotations() {
    }

    @SerialName("113")
    public static /* synthetic */ void isVPNConnected$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @JvmStatic
    public static final void write$Self(SessionData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.sessionCount);
        if (output.shouldEncodeElementDefault(serialDesc, 1)) {
            output.encodeStringElement(serialDesc, 1, self.sessionId);
        } else {
            String str = self.sessionId;
            String string = UUID.randomUUID().toString();
            Intrinsics.e(string, "randomUUID().toString()");
            if (!Intrinsics.a(str, string)) {
                output.encodeStringElement(serialDesc, 1, self.sessionId);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.sessionCreationTime != System.currentTimeMillis() / 1000) {
            output.encodeLongElement(serialDesc, 2, self.sessionCreationTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.a(self.signaledAd, new ArrayList())) {
            output.encodeSerializableElement(serialDesc, 3, new ArrayListSerializer(SignaledAd$$serializer.INSTANCE), self.signaledAd);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.sessionDuration != 0) {
            output.encodeLongElement(serialDesc, 4, self.sessionDuration);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.sessionDepthCounter != 0) {
            output.encodeIntElement(serialDesc, 5, self.sessionDepthCounter);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.a(self.unclosedAd, new ArrayList())) {
            output.encodeSerializableElement(serialDesc, 6, new ArrayListSerializer(UnclosedAd$$serializer.INSTANCE), self.unclosedAd);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.isDevice != 0) {
            output.encodeIntElement(serialDesc, 7, self.isDevice);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.isVPNConnected != 0) {
            output.encodeIntElement(serialDesc, 8, self.isVPNConnected);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.overlayGranted != 0) {
            output.encodeIntElement(serialDesc, 9, self.overlayGranted);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.sensorCount != 0) {
            output.encodeIntElement(serialDesc, 10, self.sensorCount);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 11) && self.httpProxyEnabled == 0) {
            return;
        }
        output.encodeIntElement(serialDesc, 11, self.httpProxyEnabled);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final SessionData copy(int sessionCount) {
        return new SessionData(sessionCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SessionData) && this.sessionCount == ((SessionData) other).sessionCount;
    }

    public final int getHttpProxyEnabled() {
        return this.httpProxyEnabled;
    }

    public final int getOverlayGranted() {
        return this.overlayGranted;
    }

    public final int getSensorCount() {
        return this.sensorCount;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionCreationTime() {
        return this.sessionCreationTime;
    }

    public final int getSessionDepthCounter() {
        return this.sessionDepthCounter;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<SignaledAd> getSignaledAd() {
        return this.signaledAd;
    }

    public final List<UnclosedAd> getUnclosedAd() {
        return this.unclosedAd;
    }

    public int hashCode() {
        return Integer.hashCode(this.sessionCount);
    }

    /* JADX INFO: renamed from: isDevice, reason: from getter */
    public final int getIsDevice() {
        return this.isDevice;
    }

    /* JADX INFO: renamed from: isVPNConnected, reason: from getter */
    public final int getIsVPNConnected() {
        return this.isVPNConnected;
    }

    public final void setDevice(int i2) {
        this.isDevice = i2;
    }

    public final void setHttpProxyEnabled(int i2) {
        this.httpProxyEnabled = i2;
    }

    public final void setOverlayGranted(int i2) {
        this.overlayGranted = i2;
    }

    public final void setSensorCount(int i2) {
        this.sensorCount = i2;
    }

    public final void setSessionCreationTime(long j) {
        this.sessionCreationTime = j;
    }

    public final void setSessionDepthCounter(int i2) {
        this.sessionDepthCounter = i2;
    }

    public final void setSessionDuration(long j) {
        this.sessionDuration = j;
    }

    public final void setSignaledAd(List<SignaledAd> list) {
        Intrinsics.f(list, "<set-?>");
        this.signaledAd = list;
    }

    public final void setUnclosedAd(List<UnclosedAd> list) {
        Intrinsics.f(list, "<set-?>");
        this.unclosedAd = list;
    }

    public final void setVPNConnected(int i2) {
        this.isVPNConnected = i2;
    }

    public String toString() {
        return android.support.v4.media.a.p(new StringBuilder("SessionData(sessionCount="), this.sessionCount, ')');
    }

    @Deprecated
    public /* synthetic */ SessionData(int i2, @SerialName("103") int i3, @SerialName(StatisticData.ERROR_CODE_IO_ERROR) String str, @SerialName("100") long j, @SerialName("106") List list, @SerialName("102") long j2, @SerialName(TUAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_FLOOR) int i4, @SerialName("105") List list2, @SerialName("112") int i5, @SerialName("113") int i6, @SerialName("114") int i7, @SerialName("115") int i8, @SerialName("116") int i9, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 1, SessionData$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionCount = i3;
        if ((i2 & 2) == 0) {
            this.sessionId = a.m("randomUUID().toString()");
        } else {
            this.sessionId = str;
        }
        if ((i2 & 4) == 0) {
            this.sessionCreationTime = System.currentTimeMillis() / 1000;
        } else {
            this.sessionCreationTime = j;
        }
        if ((i2 & 8) == 0) {
            this.signaledAd = new ArrayList();
        } else {
            this.signaledAd = list;
        }
        if ((i2 & 16) == 0) {
            this.sessionDuration = 0L;
        } else {
            this.sessionDuration = j2;
        }
        if ((i2 & 32) == 0) {
            this.sessionDepthCounter = 0;
        } else {
            this.sessionDepthCounter = i4;
        }
        if ((i2 & 64) == 0) {
            this.unclosedAd = new ArrayList();
        } else {
            this.unclosedAd = list2;
        }
        if ((i2 & 128) == 0) {
            this.isDevice = 0;
        } else {
            this.isDevice = i5;
        }
        if ((i2 & 256) == 0) {
            this.isVPNConnected = 0;
        } else {
            this.isVPNConnected = i6;
        }
        if ((i2 & 512) == 0) {
            this.overlayGranted = 0;
        } else {
            this.overlayGranted = i7;
        }
        if ((i2 & 1024) == 0) {
            this.sensorCount = 0;
        } else {
            this.sensorCount = i8;
        }
        if ((i2 & com.p004ironsource.mediationsdk.metadata.a.f25965n) == 0) {
            this.httpProxyEnabled = 0;
        } else {
            this.httpProxyEnabled = i9;
        }
    }
}
