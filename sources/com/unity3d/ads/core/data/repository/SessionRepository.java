package com.unity3d.ads.core.data.repository;

import ak.f;
import com.google.protobuf.ByteString;
import com.ironsource.X3;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import fn.e;
import fn.r0;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0004J\u001b\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\u0013\u0010\u000b\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0004J\u001b\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H&¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0006H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0006H&¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u000eJ\u0013\u0010\u0013\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\u0006H&¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0006H&¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\u0006H&¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\u0006H&¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\u0006H&¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H&¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0019H&¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0019H&¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u0006H&¢\u0006\u0004\b!\u0010\u000eJ\u000f\u0010\"\u001a\u00020\u0006H&¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010#\u001a\u00020\u0006H&¢\u0006\u0004\b#\u0010\u000eR\u001c\u0010(\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010+\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u001c\u00101\u001a\u00020,8&@&X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00107\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u000209088&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001c\u0010B\u001a\u00020=8&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001e\u0010H\u001a\u0004\u0018\u00010C8&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010N\u001a\b\u0012\u0004\u0012\u00020J0I8&@&X¦\u000e¢\u0006\f\u001a\u0004\bK\u0010;\"\u0004\bL\u0010MR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020=0O8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020S8&X¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020S8&X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010UR\u0014\u0010W\u001a\u00020S8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010UR\u001c\u0010]\u001a\u00020X8&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001c\u0010c\u001a\u00020^8&@&X¦\u000e¢\u0006\f\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001e\u0010f\u001a\u0004\u0018\u0001028&@&X¦\u000e¢\u0006\f\u001a\u0004\bd\u00104\"\u0004\be\u00106R\u001c\u0010j\u001a\u00020S8&@&X¦\u000e¢\u0006\f\u001a\u0004\bg\u0010U\"\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010%R\u0014\u0010m\u001a\u00020S8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010UR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020o0n8&X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8&X¦\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010y\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0014\u0010z\u001a\u00020S8&X¦\u0004¢\u0006\u0006\u001a\u0004\bz\u0010UR\u0014\u0010{\u001a\u00020S8&X¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010UR\u0016\u0010}\u001a\u0004\u0018\u0001028&X¦\u0004¢\u0006\u0006\u001a\u0004\b|\u00104R\u0016\u0010\u007f\u001a\u0004\u0018\u0001028&X¦\u0004¢\u0006\u0006\u001a\u0004\b~\u00104R+\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0080\u00018&@&X¦\u000e¢\u0006\u0017\u0012\u0005\b\u0085\u0001\u0010\u000e\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0087\u0001"}, d2 = {"Lcom/unity3d/ads/core/data/repository/SessionRepository;", "", "Lcom/google/protobuf/ByteString;", "getGatewayCache", "(Lak/f;)Ljava/lang/Object;", X3.i.X, "Lwj/r;", "setGatewayCache", "(Lcom/google/protobuf/ByteString;Lak/f;)Ljava/lang/Object;", "getPrivacy", "setPrivacy", "getPrivacyFsm", "setPrivacyFsm", "incrementLoadRequestCount", "()V", "incrementLoadRequestAdmCount", "incrementBannerLoadRequestCount", "incrementBannerLoadRequestAdmCount", "incrementBannerImpressionCount", "persistNativeConfiguration", "incrementTokenSequenceNumber", "incrementTokenWinsCount", "incrementTokenStartsCount", "resetTokenCounters", "incrementGlobalAdsFocusChangeCount", "", "timeMs", "addTimeToGlobalAdsFocusTime", "(I)V", "incrementFocusChangeCount", "ms", "setInitializationLatency", "setLastLoadLatency", "incrementAllErrorsCount", "incrementCacheTimeoutErrorsCount", "incrementSuccessCount", "getSessionToken", "()Lcom/google/protobuf/ByteString;", "setSessionToken", "(Lcom/google/protobuf/ByteString;)V", "sessionToken", "getGatewayState", "setGatewayState", "gatewayState", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "nativeConfiguration", "", "getGatewayUrl", "()Ljava/lang/String;", "setGatewayUrl", "(Ljava/lang/String;)V", "gatewayUrl", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "getScarEligibleFormats", "()Ljava/util/List;", "scarEligibleFormats", "Lcom/unity3d/ads/core/data/model/InitializationState;", "getInitializationState", "()Lcom/unity3d/ads/core/data/model/InitializationState;", "setInitializationState", "(Lcom/unity3d/ads/core/data/model/InitializationState;)V", "initializationState", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "getInitializationError", "()Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "setInitializationError", "(Lcom/unity3d/ads/core/data/model/exception/InitializationException;)V", "initializationError", "", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "getRequestUrlOverrides", "setRequestUrlOverrides", "(Ljava/util/List;)V", "requestUrlOverrides", "Lfn/e;", "getObserveInitializationState", "()Lfn/e;", "observeInitializationState", "", "isSdkInitialized", "()Z", "isNativeConfigReady", "isDiagnosticsEnabled", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", "sessionCounters", "Lcom/unity3d/ads/core/data/model/TokenCounters;", "getTokenCounters", "()Lcom/unity3d/ads/core/data/model/TokenCounters;", "setTokenCounters", "(Lcom/unity3d/ads/core/data/model/TokenCounters;)V", "tokenCounters", "getGameId", "setGameId", AndroidGetAdPlayerContext.KEY_GAME_ID, "getShouldInitialize", "setShouldInitialize", "(Z)V", "shouldInitialize", "getSessionId", JsonStorageKeyNames.SESSION_ID_KEY, "isTestModeEnabled", "Lfn/r0;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "getOnChange", "()Lfn/r0;", "onChange", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "featureFlags", "getHeaderBiddingTokenCounter", "()I", "headerBiddingTokenCounter", "isOmEnabled", "isFirstInitAttempt", "getUnityInstallationId", "unityInstallationId", "getUnityMegaSessionId", "unityMegaSessionId", "Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "getInitializationConfiguration", "()Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "setInitializationConfiguration", "(Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;)V", "getInitializationConfiguration$annotations", "initializationConfiguration", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface SessionRepository {
    void addTimeToGlobalAdsFocusTime(int timeMs);

    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    String getGameId();

    Object getGatewayCache(f fVar);

    ByteString getGatewayState();

    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    InitializationConfigurationInternal getInitializationConfiguration();

    InitializationException getInitializationError();

    InitializationState getInitializationState();

    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    e getObserveInitializationState();

    r0 getOnChange();

    Object getPrivacy(f fVar);

    Object getPrivacyFsm(f fVar);

    List<InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverrides();

    List<AdFormatOuterClass.AdFormat> getScarEligibleFormats();

    SessionCountersOuterClass.SessionCounters getSessionCounters();

    ByteString getSessionId();

    ByteString getSessionToken();

    boolean getShouldInitialize();

    TokenCounters getTokenCounters();

    String getUnityInstallationId();

    String getUnityMegaSessionId();

    void incrementAllErrorsCount();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementCacheTimeoutErrorsCount();

    void incrementFocusChangeCount();

    void incrementGlobalAdsFocusChangeCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementSuccessCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isNativeConfigReady();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    Object persistNativeConfiguration(f fVar);

    void resetTokenCounters();

    void setGameId(String str);

    Object setGatewayCache(ByteString byteString, f fVar);

    void setGatewayState(ByteString byteString);

    void setGatewayUrl(String str);

    void setInitializationConfiguration(InitializationConfigurationInternal initializationConfigurationInternal);

    void setInitializationError(InitializationException initializationException);

    void setInitializationLatency(int ms);

    void setInitializationState(InitializationState initializationState);

    void setLastLoadLatency(int ms);

    void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    Object setPrivacy(ByteString byteString, f fVar);

    Object setPrivacyFsm(ByteString byteString, f fVar);

    void setRequestUrlOverrides(List<InitializationResponseOuterClass.RequestUrlOverride> list);

    void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(ByteString byteString);

    void setShouldInitialize(boolean z10);

    void setTokenCounters(TokenCounters tokenCounters);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class DefaultImpls {
        public static /* synthetic */ void getInitializationConfiguration$annotations() {
        }
    }
}
