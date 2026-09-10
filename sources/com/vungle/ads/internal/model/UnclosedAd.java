package com.vungle.ads.internal.model;

import androidx.media3.extractor.text.ttml.a;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.p004ironsource.x4;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÇ\u0001R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/model/UnclosedAd;", "", "seen1", "", "eventId", "", JsonStorageKeyNames.SESSION_ID_KEY, "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getEventId$annotations", "()V", "getEventId", "()Ljava/lang/String;", "getSessionId$annotations", "getSessionId", "setSessionId", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
public final /* data */ class UnclosedAd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String eventId;
    private String sessionId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/UnclosedAd$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/UnclosedAd;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnclosedAd> serializer() {
            return UnclosedAd$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ UnclosedAd(int i2, @SerialName("107") String str, @SerialName(StatisticData.ERROR_CODE_IO_ERROR) String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 1, UnclosedAd$$serializer.INSTANCE.getDescriptor());
        }
        this.eventId = str;
        if ((i2 & 2) == 0) {
            this.sessionId = "";
        } else {
            this.sessionId = str2;
        }
    }

    public static /* synthetic */ UnclosedAd copy$default(UnclosedAd unclosedAd, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = unclosedAd.eventId;
        }
        if ((i2 & 2) != 0) {
            str2 = unclosedAd.sessionId;
        }
        return unclosedAd.copy(str, str2);
    }

    @SerialName("107")
    public static /* synthetic */ void getEventId$annotations() {
    }

    @SerialName(StatisticData.ERROR_CODE_IO_ERROR)
    public static /* synthetic */ void getSessionId$annotations() {
    }

    @JvmStatic
    public static final void write$Self(UnclosedAd self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.eventId);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && Intrinsics.a(self.sessionId, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.sessionId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final UnclosedAd copy(String eventId, String sessionId) {
        Intrinsics.f(eventId, "eventId");
        Intrinsics.f(sessionId, "sessionId");
        return new UnclosedAd(eventId, sessionId);
    }

    public boolean equals(Object other) {
        if (other != null && UnclosedAd.class.equals(other.getClass())) {
            UnclosedAd unclosedAd = (UnclosedAd) other;
            if (Intrinsics.a(this.eventId, unclosedAd.eventId) && Intrinsics.a(this.sessionId, unclosedAd.sessionId)) {
                return true;
            }
        }
        return false;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return this.sessionId.hashCode() + (this.eventId.hashCode() * 31);
    }

    public final void setSessionId(String str) {
        Intrinsics.f(str, "<set-?>");
        this.sessionId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UnclosedAd(eventId=");
        sb.append(this.eventId);
        sb.append(", sessionId=");
        return a.p(sb, this.sessionId, ')');
    }

    public UnclosedAd(String eventId, String sessionId) {
        Intrinsics.f(eventId, "eventId");
        Intrinsics.f(sessionId, "sessionId");
        this.eventId = eventId;
        this.sessionId = sessionId;
    }

    public /* synthetic */ UnclosedAd(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2);
    }
}
