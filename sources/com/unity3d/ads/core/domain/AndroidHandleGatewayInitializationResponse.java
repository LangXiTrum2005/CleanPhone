package com.unity3d.ads.core.domain;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.ironsource.Ve;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.adquality.InitializeAdQuality;
import com.unity3d.ads.core.domain.events.AdRevenueObserver;
import com.unity3d.ads.core.domain.events.LifecycleEventObserver;
import com.unity3d.ads.core.domain.events.MaxAdRevenueObserver;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.List;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayInitializationResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "transactionEventManager", "Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;", "adRevenueObserver", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;", "maxAdRevenueObserver", "Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;", "lifecycleEventObserver", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "triggerInitializationCompletedRequest", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcn/a0;", "sdkScope", "Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "handleDebugSettings", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "getSafeguardedInitializationPolicy", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "defaultNativeConfiguration", "Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;", "initializeAdQuality", "<init>", "(Lcom/unity3d/ads/core/data/manager/TransactionEventManager;Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcn/a0;Lcom/unity3d/ads/core/domain/HandleDebugSettings;Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;)V", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", Ve.f27442n, "Lwj/r;", "invoke", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/manager/TransactionEventManager;", "Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;", "Lcom/unity3d/ads/core/domain/events/MaxAdRevenueObserver;", "Lcom/unity3d/ads/core/domain/events/LifecycleEventObserver;", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcn/a0;", "Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "Lcom/unity3d/ads/core/domain/GetSafeguardedInitializationPolicy;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {
    private final AdRevenueObserver adRevenueObserver;
    private final NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration;
    private final GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy;
    private final HandleDebugSettings handleDebugSettings;
    private final InitializeAdQuality initializeAdQuality;
    private final LifecycleEventObserver lifecycleEventObserver;
    private final MaxAdRevenueObserver maxAdRevenueObserver;
    private final a0 sdkScope;
    private final SessionRepository sessionRepository;
    private final TransactionEventManager transactionEventManager;
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$4", f = "AndroidHandleGatewayInitializationResponse.kt", l = {91}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends i implements c {
        int label;

        public AnonymousClass4(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidHandleGatewayInitializationResponse.this.new AnonymousClass4(fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass4) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                TriggerInitializationCompletedRequest triggerInitializationCompletedRequest = AndroidHandleGatewayInitializationResponse.this.triggerInitializationCompletedRequest;
                this.label = 1;
                Object objInvoke = triggerInitializationCompletedRequest.invoke(this);
                bk.a aVar = bk.a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return r.f53297a;
        }
    }

    public AndroidHandleGatewayInitializationResponse(TransactionEventManager transactionEventManager, AdRevenueObserver adRevenueObserver, MaxAdRevenueObserver maxAdRevenueObserver, LifecycleEventObserver lifecycleEventObserver, TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, SessionRepository sessionRepository, a0 sdkScope, HandleDebugSettings handleDebugSettings, GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy, NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration, InitializeAdQuality initializeAdQuality) {
        n.f(transactionEventManager, "transactionEventManager");
        n.f(adRevenueObserver, "adRevenueObserver");
        n.f(maxAdRevenueObserver, "maxAdRevenueObserver");
        n.f(lifecycleEventObserver, "lifecycleEventObserver");
        n.f(triggerInitializationCompletedRequest, "triggerInitializationCompletedRequest");
        n.f(sessionRepository, "sessionRepository");
        n.f(sdkScope, "sdkScope");
        n.f(handleDebugSettings, "handleDebugSettings");
        n.f(getSafeguardedInitializationPolicy, "getSafeguardedInitializationPolicy");
        n.f(defaultNativeConfiguration, "defaultNativeConfiguration");
        n.f(initializeAdQuality, "initializeAdQuality");
        this.transactionEventManager = transactionEventManager;
        this.adRevenueObserver = adRevenueObserver;
        this.maxAdRevenueObserver = maxAdRevenueObserver;
        this.lifecycleEventObserver = lifecycleEventObserver;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = sdkScope;
        this.handleDebugSettings = handleDebugSettings;
        this.getSafeguardedInitializationPolicy = getSafeguardedInitializationPolicy;
        this.defaultNativeConfiguration = defaultNativeConfiguration;
        this.initializeAdQuality = initializeAdQuality;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    public Object invoke(UniversalResponseOuterClass.UniversalResponse universalResponse, f fVar) throws GatewayException, InitializationException {
        String universalRequestUrl;
        if (universalResponse.hasPayload() && universalResponse.getPayload().hasInitializationResponse() && universalResponse.getPayload().getInitializationResponse().hasError()) {
            ErrorOuterClass.PublicErrorCode errorCode = universalResponse.getPayload().getInitializationResponse().getError().getErrorCode();
            n.e(errorCode, "response.payload.initial…nResponse.error.errorCode");
            String initErrorMsg = UnityAdsErrorKt.getInitErrorMsg(errorCode, this.sessionRepository.getGameId());
            if (initErrorMsg == null) {
                initErrorMsg = universalResponse.getPayload().getInitializationResponse().getError().getErrorText();
            }
            String str = initErrorMsg;
            n.e(str, "response.payload.initial…nResponse.error.errorText");
            throw new GatewayException(str, new IllegalStateException(universalResponse.getPayload().getInitializationResponse().getError().getErrorText()), "gateway_initialization", universalResponse.getPayload().getInitializationResponse().getError().getErrorText(), universalResponse.getPayload().getInitializationResponse().getError().getErrorCode());
        }
        if (universalResponse.hasError()) {
            ErrorOuterClass.PublicErrorCode errorCode2 = universalResponse.getError().getErrorCode();
            n.e(errorCode2, "response.error.errorCode");
            String initErrorMsg2 = UnityAdsErrorKt.getInitErrorMsg(errorCode2, this.sessionRepository.getGameId());
            if (initErrorMsg2 == null) {
                initErrorMsg2 = universalResponse.getError().getErrorText();
            }
            String str2 = initErrorMsg2;
            n.e(str2, "response.error.errorCode… response.error.errorText");
            throw new InitializationException(str2, new IllegalStateException(universalResponse.getError().getErrorText()), "gateway_initialization", universalResponse.getError().getErrorText(), universalResponse.getError().getErrorCode());
        }
        if (!universalResponse.hasPayload() || !universalResponse.getPayload().hasInitializationResponse()) {
            throw new InitializationException(UnityAdsErrorKt.MSG_INIT_FAIL_PARSING_ERROR, null, "gateway", "No payload", ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_PROTO, 2, null);
        }
        InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
        SessionRepository sessionRepository = this.sessionRepository;
        NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
        n.e(nativeConfiguration, "initResponse.nativeConfiguration");
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builder = nativeConfiguration.toBuilder();
        n.e(builder, "this.toBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builder);
        dsl_create.setInitPolicy(this.getSafeguardedInitializationPolicy.invoke(dsl_create.getInitPolicy()));
        dsl_create.setMaxExtrasSizeKb(dsl_create.getMaxExtrasSizeKb() == 0 ? this.defaultNativeConfiguration.getMaxExtrasSizeKb() : dsl_create.getMaxExtrasSizeKb());
        sessionRepository.setNativeConfiguration(dsl_create._build());
        if (initializationResponse.hasUniversalRequestUrl() && (universalRequestUrl = initializationResponse.getUniversalRequestUrl()) != null && universalRequestUrl.length() != 0) {
            SessionRepository sessionRepository2 = this.sessionRepository;
            String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
            n.e(universalRequestUrl2, "initResponse.universalRequestUrl");
            sessionRepository2.setGatewayUrl(universalRequestUrl2);
        }
        List<InitializationResponseOuterClass.RequestUrlOverride> requestUrlOverridesList = initializationResponse.getRequestUrlOverridesList();
        if (requestUrlOverridesList != null) {
            this.sessionRepository.setRequestUrlOverrides(requestUrlOverridesList);
        }
        List<AdFormatOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
        List<AdFormatOuterClass.AdFormat> scarEligibleFormatsList = initializationResponse.getScarEligibleFormatsList();
        n.e(scarEligibleFormatsList, "initResponse.scarEligibleFormatsList");
        scarEligibleFormats.addAll(scarEligibleFormatsList);
        if (initializationResponse.getTriggerInitializationCompletedRequest()) {
            d0.w(this.sdkScope, null, new AnonymousClass4(null), 3);
        }
        if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
            this.transactionEventManager.invoke();
        }
        if (initializationResponse.getNativeConfiguration().getFeatureFlags().getCollectIlrData()) {
            this.adRevenueObserver.invoke();
        }
        this.maxAdRevenueObserver.invoke();
        if (initializationResponse.getNativeConfiguration().getFeatureFlags().getCollectLifecycleEvents()) {
            this.lifecycleEventObserver.invoke();
        }
        if (initializationResponse.getNativeConfiguration().hasDebugSettings()) {
            HandleDebugSettings handleDebugSettings = this.handleDebugSettings;
            NativeConfigurationOuterClass.DebugSettings debugSettings = initializationResponse.getNativeConfiguration().getDebugSettings();
            n.e(debugSettings, "initResponse.nativeConfiguration.debugSettings");
            handleDebugSettings.invoke(debugSettings);
        }
        if (initializationResponse.getNativeConfiguration().hasLevelPlayAppKey()) {
            InitializeAdQuality initializeAdQuality = this.initializeAdQuality;
            String levelPlayAppKey = initializationResponse.getNativeConfiguration().getLevelPlayAppKey();
            n.e(levelPlayAppKey, "initResponse.nativeConfiguration.levelPlayAppKey");
            initializeAdQuality.invoke(levelPlayAppKey);
        }
        return r.f53297a;
    }
}
