package com.unity3d.ads;

import com.facebook.appevents.iap.InAppPurchaseConstants;
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
@UnityAdsExperimental
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016BC\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/InitializationConfiguration;", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "isTestModeEnabled", "", "logLevel", "Lcom/unity3d/ads/LogLevel;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", "(Ljava/lang/String;ZLcom/unity3d/ads/LogLevel;Ljava/util/Map;Lcom/unity3d/ads/MediationInfo;)V", "getExtras", "()Ljava/util/Map;", "getGameId", "()Ljava/lang/String;", "()Z", "getLogLevel", "()Lcom/unity3d/ads/LogLevel;", "getMediationInfo", "()Lcom/unity3d/ads/MediationInfo;", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InitializationConfiguration {
    private final Map<String, String> extras;
    private final String gameId;
    private final boolean isTestModeEnabled;
    private final LogLevel logLevel;
    private final MediationInfo mediationInfo;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/InitializationConfiguration$Builder;", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "(Ljava/lang/String;)V", HandleInvocationsFromAdViewer.KEY_EXTRAS, "", "isTestModeEnabled", "", "logLevel", "Lcom/unity3d/ads/LogLevel;", "mediationInfo", "Lcom/unity3d/ads/MediationInfo;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/unity3d/ads/InitializationConfiguration;", "withExtras", "withLogLevel", "withMediationInfo", "withTestMode", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Builder {
        private Map<String, String> extras;
        private final String gameId;
        private boolean isTestModeEnabled;
        private LogLevel logLevel;
        private MediationInfo mediationInfo;

        public Builder(String gameId) {
            n.f(gameId, "gameId");
            this.gameId = gameId;
            this.logLevel = LogLevel.INFO;
            this.extras = w.f53867a;
        }

        public final InitializationConfiguration build() {
            return new InitializationConfiguration(this.gameId, this.isTestModeEnabled, this.logLevel, this.extras, this.mediationInfo);
        }

        public final Builder withExtras(Map<String, String> extras) {
            n.f(extras, "extras");
            this.extras = extras;
            return this;
        }

        public final Builder withLogLevel(LogLevel logLevel) {
            n.f(logLevel, "logLevel");
            this.logLevel = logLevel;
            return this;
        }

        public final Builder withMediationInfo(MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }

        public final Builder withTestMode(boolean isTestModeEnabled) {
            this.isTestModeEnabled = isTestModeEnabled;
            return this;
        }
    }

    public InitializationConfiguration(String gameId, boolean z10, LogLevel logLevel, Map<String, String> extras, MediationInfo mediationInfo) {
        n.f(gameId, "gameId");
        n.f(logLevel, "logLevel");
        n.f(extras, "extras");
        this.gameId = gameId;
        this.isTestModeEnabled = z10;
        this.logLevel = logLevel;
        this.extras = extras;
        this.mediationInfo = mediationInfo;
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

    /* JADX INFO: renamed from: isTestModeEnabled, reason: from getter */
    public final boolean getIsTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    public /* synthetic */ InitializationConfiguration(String str, boolean z10, LogLevel logLevel, Map map, MediationInfo mediationInfo, int i10, g gVar) {
        this(str, z10, (i10 & 4) != 0 ? LogLevel.INFO : logLevel, (i10 & 8) != 0 ? w.f53867a : map, (i10 & 16) != 0 ? null : mediationInfo);
    }
}
