package com.unity3d.ads.beta;

import android.content.Context;
import com.unity3d.services.core.log.DeviceLog;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aBI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/beta/InitializationConfiguration;", "", "context", "Landroid/content/Context;", "gameID", "", "isTestModeEnabled", "", "logLevel", "Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;", "extras", "", "mediationInfo", "Lcom/unity3d/ads/beta/MediationInfo;", "(Landroid/content/Context;Ljava/lang/String;ZLcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;Ljava/util/Map;Lcom/unity3d/ads/beta/MediationInfo;)V", "getContext", "()Landroid/content/Context;", "getExtras", "()Ljava/util/Map;", "getGameID", "()Ljava/lang/String;", "()Z", "getLogLevel", "()Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;", "getMediationInfo", "()Lcom/unity3d/ads/beta/MediationInfo;", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializationConfiguration {
    private final Context context;
    private final Map<String, String> extras;
    private final String gameID;
    private final boolean isTestModeEnabled;
    private final DeviceLog.UnityAdsLogLevel logLevel;
    private final MediationInfo mediationInfo;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;", "", "context", "Landroid/content/Context;", "gameID", "", "isTestModeEnabled", "", "(Landroid/content/Context;Ljava/lang/String;Z)V", "extras", "", "logLevel", "Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;", "mediationInfo", "Lcom/unity3d/ads/beta/MediationInfo;", "build", "Lcom/unity3d/ads/beta/InitializationConfiguration;", "withExtras", "withLogLevel", "withMediationInfo", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final Context context;
        private Map<String, String> extras;
        private final String gameID;
        private final boolean isTestModeEnabled;
        private DeviceLog.UnityAdsLogLevel logLevel;
        private MediationInfo mediationInfo;

        public Builder(Context context, String gameID, boolean z2) {
            Intrinsics.f(context, "context");
            Intrinsics.f(gameID, "gameID");
            this.context = context;
            this.gameID = gameID;
            this.isTestModeEnabled = z2;
            this.logLevel = DeviceLog.UnityAdsLogLevel.INFO;
            this.extras = EmptyMap.X;
        }

        public final InitializationConfiguration build() {
            return new InitializationConfiguration(this.context, this.gameID, this.isTestModeEnabled, this.logLevel, this.extras, this.mediationInfo);
        }

        public final Builder withExtras(Map<String, String> extras) {
            Intrinsics.f(extras, "extras");
            this.extras = extras;
            return this;
        }

        public final Builder withLogLevel(DeviceLog.UnityAdsLogLevel logLevel) {
            Intrinsics.f(logLevel, "logLevel");
            this.logLevel = logLevel;
            return this;
        }

        public final Builder withMediationInfo(MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }
    }

    public InitializationConfiguration(Context context, String gameID, boolean z2, DeviceLog.UnityAdsLogLevel logLevel, Map<String, String> extras, MediationInfo mediationInfo) {
        Intrinsics.f(context, "context");
        Intrinsics.f(gameID, "gameID");
        Intrinsics.f(logLevel, "logLevel");
        Intrinsics.f(extras, "extras");
        this.context = context;
        this.gameID = gameID;
        this.isTestModeEnabled = z2;
        this.logLevel = logLevel;
        this.extras = extras;
        this.mediationInfo = mediationInfo;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getGameID() {
        return this.gameID;
    }

    public final DeviceLog.UnityAdsLogLevel getLogLevel() {
        return this.logLevel;
    }

    public final MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    /* JADX INFO: renamed from: isTestModeEnabled, reason: from getter */
    public final boolean getIsTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    public /* synthetic */ InitializationConfiguration(Context context, String str, boolean z2, DeviceLog.UnityAdsLogLevel unityAdsLogLevel, Map map, MediationInfo mediationInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, z2, (i2 & 8) != 0 ? DeviceLog.UnityAdsLogLevel.INFO : unityAdsLogLevel, (i2 & 16) != 0 ? EmptyMap.X : map, (i2 & 32) != 0 ? null : mediationInfo);
    }
}
