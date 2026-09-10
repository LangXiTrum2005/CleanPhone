package com.chartboost.heliumsdk.domain;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\"\u001a\u00020\bJ\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/chartboost/heliumsdk/domain/MetricsEvent;", "", "eventType", "Lcom/chartboost/heliumsdk/domain/MetricsEvent$EventType;", "partner", "", "(Lcom/chartboost/heliumsdk/domain/MetricsEvent$EventType;Ljava/lang/String;)V", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "getError", "()Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "setError", "(Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;)V", "getEventType", "()Lcom/chartboost/heliumsdk/domain/MetricsEvent$EventType;", "isSuccess", "", "()Z", "setSuccess", "(Z)V", "getPartner", "()Ljava/lang/String;", "startTimestamp", "component1", "component2", "copy", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "getDuration", "hashCode", "", "toString", "EventType", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MetricsEvent {
    private long endTimestamp;
    private ChartboostMediationError error;
    private final EventType eventType;
    private boolean isSuccess;
    private final String partner;
    private final long startTimestamp;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/chartboost/heliumsdk/domain/MetricsEvent$EventType;", "", "(Ljava/lang/String;I)V", "INITIALIZATION", "PREBID", "LOAD", "SHOW", "CLICK", "EXPIRATION", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum EventType {
        INITIALIZATION,
        PREBID,
        LOAD,
        SHOW,
        CLICK,
        EXPIRATION
    }

    public MetricsEvent(EventType eventType, String partner) {
        Intrinsics.f(eventType, "eventType");
        Intrinsics.f(partner, "partner");
        this.eventType = eventType;
        this.partner = partner;
        this.startTimestamp = System.currentTimeMillis();
    }

    public static /* synthetic */ MetricsEvent copy$default(MetricsEvent metricsEvent, EventType eventType, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eventType = metricsEvent.eventType;
        }
        if ((i2 & 2) != 0) {
            str = metricsEvent.partner;
        }
        return metricsEvent.copy(eventType, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EventType getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPartner() {
        return this.partner;
    }

    public final MetricsEvent copy(EventType eventType, String partner) {
        Intrinsics.f(eventType, "eventType");
        Intrinsics.f(partner, "partner");
        return new MetricsEvent(eventType, partner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricsEvent)) {
            return false;
        }
        MetricsEvent metricsEvent = (MetricsEvent) other;
        return this.eventType == metricsEvent.eventType && Intrinsics.a(this.partner, metricsEvent.partner);
    }

    public final long getDuration() {
        long j = this.endTimestamp;
        if (j > 0) {
            return j - this.startTimestamp;
        }
        return 0L;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final ChartboostMediationError getError() {
        return this.error;
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    public final String getPartner() {
        return this.partner;
    }

    public int hashCode() {
        return this.partner.hashCode() + (this.eventType.hashCode() * 31);
    }

    /* JADX INFO: renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final void setEndTimestamp(long j) {
        this.endTimestamp = j;
    }

    public final void setError(ChartboostMediationError chartboostMediationError) {
        this.error = chartboostMediationError;
    }

    public final void setSuccess(boolean z2) {
        this.isSuccess = z2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MetricsEvent(eventType=");
        sb.append(this.eventType);
        sb.append(", partner=");
        return a.p(sb, this.partner, ')');
    }
}
