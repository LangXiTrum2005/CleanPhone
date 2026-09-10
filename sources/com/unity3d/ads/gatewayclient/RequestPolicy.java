package com.unity3d.ads.gatewayclient;

import androidx.core.app.NotificationCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import defpackage.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000eHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006-"}, d2 = {"Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "", "maxDuration", "", "retryMaxInterval", "retryWaitBase", "retryJitterPct", "", "retryScalingFactor", "connectTimeout", "readTimeout", "writeTimeout", "overallTimeout", "shouldStoreLocally", "", "(IIIFFIIIIZ)V", "getConnectTimeout", "()I", "getMaxDuration", "getOverallTimeout", "getReadTimeout", "getRetryJitterPct", "()F", "getRetryMaxInterval", "getRetryScalingFactor", "getRetryWaitBase", "getShouldStoreLocally", "()Z", "getWriteTimeout", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class RequestPolicy {
    private final int connectTimeout;
    private final int maxDuration;
    private final int overallTimeout;
    private final int readTimeout;
    private final float retryJitterPct;
    private final int retryMaxInterval;
    private final float retryScalingFactor;
    private final int retryWaitBase;
    private final boolean shouldStoreLocally;
    private final int writeTimeout;

    public RequestPolicy(int i10, int i11, int i12, float f10, float f11, int i13, int i14, int i15, int i16, boolean z10) {
        this.maxDuration = i10;
        this.retryMaxInterval = i11;
        this.retryWaitBase = i12;
        this.retryJitterPct = f10;
        this.retryScalingFactor = f11;
        this.connectTimeout = i13;
        this.readTimeout = i14;
        this.writeTimeout = i15;
        this.overallTimeout = i16;
        this.shouldStoreLocally = z10;
    }

    public static /* synthetic */ RequestPolicy copy$default(RequestPolicy requestPolicy, int i10, int i11, int i12, float f10, float f11, int i13, int i14, int i15, int i16, boolean z10, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i10 = requestPolicy.maxDuration;
        }
        if ((i17 & 2) != 0) {
            i11 = requestPolicy.retryMaxInterval;
        }
        if ((i17 & 4) != 0) {
            i12 = requestPolicy.retryWaitBase;
        }
        if ((i17 & 8) != 0) {
            f10 = requestPolicy.retryJitterPct;
        }
        if ((i17 & 16) != 0) {
            f11 = requestPolicy.retryScalingFactor;
        }
        if ((i17 & 32) != 0) {
            i13 = requestPolicy.connectTimeout;
        }
        if ((i17 & 64) != 0) {
            i14 = requestPolicy.readTimeout;
        }
        if ((i17 & 128) != 0) {
            i15 = requestPolicy.writeTimeout;
        }
        if ((i17 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            i16 = requestPolicy.overallTimeout;
        }
        if ((i17 & 512) != 0) {
            z10 = requestPolicy.shouldStoreLocally;
        }
        int i18 = i16;
        boolean z11 = z10;
        int i19 = i14;
        int i20 = i15;
        float f12 = f11;
        int i21 = i13;
        return requestPolicy.copy(i10, i11, i12, f10, f12, i21, i19, i20, i18, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxDuration() {
        return this.maxDuration;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getRetryScalingFactor() {
        return this.retryScalingFactor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getReadTimeout() {
        return this.readTimeout;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getOverallTimeout() {
        return this.overallTimeout;
    }

    public final RequestPolicy copy(int maxDuration, int retryMaxInterval, int retryWaitBase, float retryJitterPct, float retryScalingFactor, int connectTimeout, int readTimeout, int writeTimeout, int overallTimeout, boolean shouldStoreLocally) {
        return new RequestPolicy(maxDuration, retryMaxInterval, retryWaitBase, retryJitterPct, retryScalingFactor, connectTimeout, readTimeout, writeTimeout, overallTimeout, shouldStoreLocally);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestPolicy)) {
            return false;
        }
        RequestPolicy requestPolicy = (RequestPolicy) other;
        return this.maxDuration == requestPolicy.maxDuration && this.retryMaxInterval == requestPolicy.retryMaxInterval && this.retryWaitBase == requestPolicy.retryWaitBase && Float.compare(this.retryJitterPct, requestPolicy.retryJitterPct) == 0 && Float.compare(this.retryScalingFactor, requestPolicy.retryScalingFactor) == 0 && this.connectTimeout == requestPolicy.connectTimeout && this.readTimeout == requestPolicy.readTimeout && this.writeTimeout == requestPolicy.writeTimeout && this.overallTimeout == requestPolicy.overallTimeout && this.shouldStoreLocally == requestPolicy.shouldStoreLocally;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final int getMaxDuration() {
        return this.maxDuration;
    }

    public final int getOverallTimeout() {
        return this.overallTimeout;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final float getRetryJitterPct() {
        return this.retryJitterPct;
    }

    public final int getRetryMaxInterval() {
        return this.retryMaxInterval;
    }

    public final float getRetryScalingFactor() {
        return this.retryScalingFactor;
    }

    public final int getRetryWaitBase() {
        return this.retryWaitBase;
    }

    public final boolean getShouldStoreLocally() {
        return this.shouldStoreLocally;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iF = d.f(this.overallTimeout, d.f(this.writeTimeout, d.f(this.readTimeout, d.f(this.connectTimeout, (Float.hashCode(this.retryScalingFactor) + ((Float.hashCode(this.retryJitterPct) + d.f(this.retryWaitBase, d.f(this.retryMaxInterval, Integer.hashCode(this.maxDuration) * 31, 31), 31)) * 31)) * 31, 31), 31), 31), 31);
        boolean z10 = this.shouldStoreLocally;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        return iF + r3;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RequestPolicy(maxDuration=");
        sb2.append(this.maxDuration);
        sb2.append(", retryMaxInterval=");
        sb2.append(this.retryMaxInterval);
        sb2.append(", retryWaitBase=");
        sb2.append(this.retryWaitBase);
        sb2.append(", retryJitterPct=");
        sb2.append(this.retryJitterPct);
        sb2.append(", retryScalingFactor=");
        sb2.append(this.retryScalingFactor);
        sb2.append(", connectTimeout=");
        sb2.append(this.connectTimeout);
        sb2.append(", readTimeout=");
        sb2.append(this.readTimeout);
        sb2.append(", writeTimeout=");
        sb2.append(this.writeTimeout);
        sb2.append(", overallTimeout=");
        sb2.append(this.overallTimeout);
        sb2.append(", shouldStoreLocally=");
        return e.t(sb2, this.shouldStoreLocally, ')');
    }
}
