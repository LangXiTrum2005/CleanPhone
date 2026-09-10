package com.unity3d.ads.core.data.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.unity3d.ads.LogLevel;
import com.unity3d.ads.MediationInfo;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "isTestModeEnabled", "", "logLevel", "Lcom/unity3d/ads/LogLevel;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "(Ljava/lang/String;ZLcom/unity3d/ads/LogLevel;Ljava/util/Map;Lcom/unity3d/ads/MediationInfo;)V", "getExtras", "()Ljava/util/Map;", "getGameId", "()Ljava/lang/String;", "()Z", "getLogLevel", "()Lcom/unity3d/ads/LogLevel;", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final /* data */ class InitializationConfigurationInternal {
    private final Map<String, String> extras;
    private final String gameId;
    private final boolean isTestModeEnabled;
    private final LogLevel logLevel;
    private final MediationInfo mediationInfo;

    public InitializationConfigurationInternal(String gameId, boolean z10, LogLevel logLevel, Map<String, String> extras, MediationInfo mediationInfo) {
        n.f(gameId, "gameId");
        n.f(logLevel, "logLevel");
        n.f(extras, "extras");
        this.gameId = gameId;
        this.isTestModeEnabled = z10;
        this.logLevel = logLevel;
        this.extras = extras;
        this.mediationInfo = mediationInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InitializationConfigurationInternal copy$default(InitializationConfigurationInternal initializationConfigurationInternal, String str, boolean z10, LogLevel logLevel, Map map, MediationInfo mediationInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = initializationConfigurationInternal.gameId;
        }
        if ((i10 & 2) != 0) {
            z10 = initializationConfigurationInternal.isTestModeEnabled;
        }
        if ((i10 & 4) != 0) {
            logLevel = initializationConfigurationInternal.logLevel;
        }
        if ((i10 & 8) != 0) {
            map = initializationConfigurationInternal.extras;
        }
        if ((i10 & 16) != 0) {
            mediationInfo = initializationConfigurationInternal.mediationInfo;
        }
        MediationInfo mediationInfo2 = mediationInfo;
        LogLevel logLevel2 = logLevel;
        return initializationConfigurationInternal.copy(str, z10, logLevel2, map, mediationInfo2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    public final Map<String, String> component4() {
        return this.extras;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    public final InitializationConfigurationInternal copy(String gameId, boolean isTestModeEnabled, LogLevel logLevel, Map<String, String> extras, MediationInfo mediationInfo) {
        n.f(gameId, "gameId");
        n.f(logLevel, "logLevel");
        n.f(extras, "extras");
        return new InitializationConfigurationInternal(gameId, isTestModeEnabled, logLevel, extras, mediationInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitializationConfigurationInternal)) {
            return false;
        }
        InitializationConfigurationInternal initializationConfigurationInternal = (InitializationConfigurationInternal) other;
        return n.a(this.gameId, initializationConfigurationInternal.gameId) && this.isTestModeEnabled == initializationConfigurationInternal.isTestModeEnabled && this.logLevel == initializationConfigurationInternal.logLevel && n.a(this.extras, initializationConfigurationInternal.extras) && n.a(this.mediationInfo, initializationConfigurationInternal.mediationInfo);
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.gameId.hashCode() * 31;
        boolean z10 = this.isTestModeEnabled;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        int iHashCode2 = (this.extras.hashCode() + ((this.logLevel.hashCode() + ((iHashCode + r2) * 31)) * 31)) * 31;
        MediationInfo mediationInfo = this.mediationInfo;
        return iHashCode2 + (mediationInfo == null ? 0 : mediationInfo.hashCode());
    }

    public final boolean isTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    public String toString() {
        return "InitializationConfigurationInternal(gameId=" + this.gameId + ", isTestModeEnabled=" + this.isTestModeEnabled + ", logLevel=" + this.logLevel + ", extras=" + this.extras + ", mediationInfo=" + this.mediationInfo + ')';
    }

    public /* synthetic */ InitializationConfigurationInternal(String str, boolean z10, LogLevel logLevel, Map map, MediationInfo mediationInfo, int i10, g gVar) {
        this(str, z10, (i10 & 4) != 0 ? LogLevel.INFO : logLevel, (i10 & 8) != 0 ? w.f53867a : map, (i10 & 16) != 0 ? null : mediationInfo);
    }
}
