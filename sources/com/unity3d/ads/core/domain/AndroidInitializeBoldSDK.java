package com.unity3d.ads.core.domain;

import ak.f;
import bn.d;
import ck.c;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.e2;
import cn.w;
import com.adjust.sdk.AdjustConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.configuration.ConfigurationReader;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0019\b\u0000\u0018\u0000 S2\u00020\u0001:\u0001SB\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J#\u0010/\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0082@ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020+H\u0002¢\u0006\u0004\b1\u00102J+\u00105\u001a\u00020(2\u0006\u00104\u001a\u0002032\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0082@ø\u0001\u0000¢\u0006\u0004\b5\u00106J/\u00109\u001a\u00020(2\u0006\u00104\u001a\u0002032\u0006\u00108\u001a\u0002072\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b9\u0010:J7\u0010<\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020+0;2\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020(H\u0002¢\u0006\u0004\b>\u0010*J\u001b\u0010?\u001a\u00020(2\u0006\u0010,\u001a\u00020+H\u0096Bø\u0001\u0000¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010ER\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010GR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010HR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010IR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010JR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010KR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010LR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010MR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010NR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010OR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010PR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010QR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010R\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidInitializeBoldSDK;", "Lcom/unity3d/ads/core/domain/InitializeBoldSDK;", "Lcn/w;", "defaultDispatcher", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "initializeOM", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "getInitializeRequest", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/CleanAssets;", "cleanAssets", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "handleGatewayInitializationResponse", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/events/EventObservers;", "eventObservers", "Lcom/unity3d/ads/core/domain/TriggerInitializeListener;", "triggerInitializeListener", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "diagnosticEventRepository", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "storageManager", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "legacyConfigurationReader", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "sdkPropertiesManager", "Lcom/unity3d/ads/core/domain/GetGameId;", "getGameId", "Lcom/unity3d/ads/core/log/Logger;", "logger", "Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "handleFocusCounters", "<init>", "(Lcn/w;Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;Lcom/unity3d/ads/core/domain/GetInitializationRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/CleanAssets;Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/events/EventObservers;Lcom/unity3d/ads/core/domain/TriggerInitializeListener;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;Lcom/unity3d/ads/core/data/manager/StorageManager;Lcom/unity3d/services/core/configuration/ConfigurationReader;Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;Lcom/unity3d/ads/core/domain/GetGameId;Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;)V", "Lwj/r;", "checkCanInitialize", "()V", "", "source", "", "isRetry", "initializationStart", "(Ljava/lang/String;ZLak/f;)Ljava/lang/Object;", "getInitLog", "()Ljava/lang/String;", "Lbn/e;", "startTime", "initializationSuccess", "(Lbn/e;Ljava/lang/String;ZLak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "e", "initializationFailure", "(Lbn/e;Lcom/unity3d/ads/core/data/model/exception/InitializationException;Ljava/lang/String;Z)V", "", "getTags", "(Lcom/unity3d/ads/core/data/model/exception/InitializationException;Ljava/lang/String;Z)Ljava/util/Map;", "setupDiagnosticEvents", "invoke", "(Ljava/lang/String;Lak/f;)Ljava/lang/Object;", "Lcn/w;", "Lcom/unity3d/ads/core/domain/om/InitializeOMSDK;", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/core/domain/CleanAssets;", "Lcom/unity3d/ads/core/domain/HandleGatewayInitializationResponse;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/events/EventObservers;", "Lcom/unity3d/ads/core/domain/TriggerInitializeListener;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "Lcom/unity3d/ads/core/data/manager/StorageManager;", "Lcom/unity3d/services/core/configuration/ConfigurationReader;", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "Lcom/unity3d/ads/core/domain/GetGameId;", "Lcom/unity3d/ads/core/log/Logger;", "Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final String MSG_NETWORK = "Network";
    public static final String MSG_TIMEOUT = "Timeout";
    public static final String MSG_UNKNOWN = "Initialization failure";
    private final CleanAssets cleanAssets;
    private final w defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final EventObservers eventObservers;
    private final GatewayClient gatewayClient;
    private final GetGameId getGameId;
    private final GetInitializationRequest getInitializeRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final AndroidHandleFocusCounters handleFocusCounters;
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final InitializeOMSDK initializeOM;
    private final ConfigurationReader legacyConfigurationReader;
    private final Logger logger;
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final StorageManager storageManager;
    private final TriggerInitializeListener triggerInitializeListener;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", f = "AndroidInitializeBoldSDK.kt", l = {TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 133}, m = "initializationSuccess")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        double D$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidInitializeBoldSDK.this.initializationSuccess(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", l = {66, 83}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements jk.c {
        final /* synthetic */ String $source;
        int I$0;
        long J$0;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", l = {67, 69, 71, 72}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends i implements jk.c {
            final /* synthetic */ boolean $isRetry;
            final /* synthetic */ String $source;
            int label;
            final /* synthetic */ AndroidInitializeBoldSDK this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z10, f fVar) {
                super(2, fVar);
                this.this$0 = androidInitializeBoldSDK;
                this.$source = str;
                this.$isRetry = z10;
            }

            @Override // ck.a
            public final f create(Object obj, f fVar) {
                return new AnonymousClass1(this.this$0, this.$source, this.$isRetry, fVar);
            }

            @Override // jk.c
            public final Object invoke(a0 a0Var, f fVar) {
                return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x0074 A[PHI: r11 r15
  0x0074: PHI (r11v1 com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1) = 
  (r11v0 com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1)
  (r11v2 com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1)
 binds: [B:21:0x0071, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x0074: PHI (r15v12 java.lang.Object) = (r15v11 java.lang.Object), (r15v0 java.lang.Object) binds: [B:21:0x0071, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
            
                if (r14.invoke((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r15, r11) == r5) goto L25;
             */
            @Override // ck.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) throws com.unity3d.ads.core.data.model.exception.InitializationException {
                /*
                    r14 = this;
                    int r0 = r14.label
                    r1 = 4
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    bk.a r5 = bk.a.f5708a
                    if (r0 == 0) goto L2c
                    if (r0 == r4) goto L28
                    if (r0 == r3) goto L24
                    if (r0 == r2) goto L1f
                    if (r0 != r1) goto L17
                    t9.e.z(r15)
                    goto L85
                L17:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r15)
                    throw r14
                L1f:
                    t9.e.z(r15)
                    r11 = r14
                    goto L74
                L24:
                    t9.e.z(r15)
                    goto L52
                L28:
                    t9.e.z(r15)
                    goto L3e
                L2c:
                    t9.e.z(r15)
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r15 = r14.this$0
                    java.lang.String r0 = r14.$source
                    boolean r6 = r14.$isRetry
                    r14.label = r4
                    java.lang.Object r15 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationStart(r15, r0, r6, r14)
                    if (r15 != r5) goto L3e
                    goto L84
                L3e:
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r15 = r14.this$0
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$checkCanInitialize(r15)
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r15 = r14.this$0
                    com.unity3d.ads.core.domain.GetInitializationRequest r15 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetInitializeRequest$p(r15)
                    r14.label = r3
                    java.lang.Object r15 = r15.invoke(r14)
                    if (r15 != r5) goto L52
                    goto L84
                L52:
                    r8 = r15
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r8 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r8
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r15 = r14.this$0
                    com.unity3d.ads.core.domain.GetRequestPolicy r15 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetRequestPolicy$p(r15)
                    com.unity3d.ads.gatewayclient.RequestPolicy r9 = r15.invoke()
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r15 = r14.this$0
                    com.unity3d.ads.gatewayclient.GatewayClient r6 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGatewayClient$p(r15)
                    com.unity3d.ads.core.data.model.OperationType r10 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION
                    r14.label = r2
                    r7 = 0
                    r12 = 1
                    r13 = 0
                    r11 = r14
                    java.lang.Object r15 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r6, r7, r8, r9, r10, r11, r12, r13)
                    if (r15 != r5) goto L74
                    goto L84
                L74:
                    gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r15 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r15
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r14 = r11.this$0
                    com.unity3d.ads.core.domain.HandleGatewayInitializationResponse r14 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getHandleGatewayInitializationResponse$p(r14)
                    r11.label = r1
                    java.lang.Object r14 = r14.invoke(r15, r11)
                    if (r14 != r5) goto L85
                L84:
                    return r5
                L85:
                    wj.r r14 = wj.r.f53297a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, f fVar) {
            super(2, fVar);
            this.$source = str;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidInitializeBoldSDK.this.new AnonymousClass2(this.$source, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String, long] */
        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            long jB;
            ?? r10;
            int i10 = this.label;
            r rVar = r.f53297a;
            bk.a aVar = bk.a.f5708a;
            try {
                if (i10 == 0) {
                    t9.e.z(obj);
                    jB = d.b();
                    ?? r0 = !AndroidInitializeBoldSDK.this.sessionRepository.isFirstInitAttempt();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(AndroidInitializeBoldSDK.this, this.$source, r0, null);
                    this.J$0 = jB;
                    this.I$0 = r0;
                    this.label = 1;
                    i10 = r0;
                    if (d0.E(new e2(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, this), anonymousClass1) != aVar) {
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return rVar;
                }
                int i11 = this.I$0;
                jB = this.J$0;
                t9.e.z(obj);
                i10 = i11;
                AndroidInitializeBoldSDK androidInitializeBoldSDK = AndroidInitializeBoldSDK.this;
                bn.f fVar = new bn.f(jB);
                r10 = this.$source;
                boolean z10 = i10 != 0;
                this.label = 2;
                return androidInitializeBoldSDK.initializationSuccess(fVar, r10, z10, this) == aVar ? aVar : rVar;
            } catch (Exception e10) {
                InitializationException from = InitializationException.INSTANCE.parseFrom(e10);
                if (e10 instanceof GatewayException) {
                    AndroidInitializeBoldSDK.this.sessionRepository.setShouldInitialize(false);
                }
                AndroidInitializeBoldSDK.this.initializationFailure(new bn.f(r10), from, this.$source, i10 != 0);
                return rVar;
            }
        }
    }

    public AndroidInitializeBoldSDK(w defaultDispatcher, InitializeOMSDK initializeOM, GetInitializationRequest getInitializeRequest, GetRequestPolicy getRequestPolicy, CleanAssets cleanAssets, HandleGatewayInitializationResponse handleGatewayInitializationResponse, GatewayClient gatewayClient, SessionRepository sessionRepository, EventObservers eventObservers, TriggerInitializeListener triggerInitializeListener, SendDiagnosticEvent sendDiagnosticEvent, DiagnosticEventRepository diagnosticEventRepository, StorageManager storageManager, ConfigurationReader legacyConfigurationReader, SDKPropertiesManager sdkPropertiesManager, GetGameId getGameId, Logger logger, AndroidHandleFocusCounters handleFocusCounters) {
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(initializeOM, "initializeOM");
        n.f(getInitializeRequest, "getInitializeRequest");
        n.f(getRequestPolicy, "getRequestPolicy");
        n.f(cleanAssets, "cleanAssets");
        n.f(handleGatewayInitializationResponse, "handleGatewayInitializationResponse");
        n.f(gatewayClient, "gatewayClient");
        n.f(sessionRepository, "sessionRepository");
        n.f(eventObservers, "eventObservers");
        n.f(triggerInitializeListener, "triggerInitializeListener");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(diagnosticEventRepository, "diagnosticEventRepository");
        n.f(storageManager, "storageManager");
        n.f(legacyConfigurationReader, "legacyConfigurationReader");
        n.f(sdkPropertiesManager, "sdkPropertiesManager");
        n.f(getGameId, "getGameId");
        n.f(logger, "logger");
        n.f(handleFocusCounters, "handleFocusCounters");
        this.defaultDispatcher = defaultDispatcher;
        this.initializeOM = initializeOM;
        this.getInitializeRequest = getInitializeRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.cleanAssets = cleanAssets;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.legacyConfigurationReader = legacyConfigurationReader;
        this.sdkPropertiesManager = sdkPropertiesManager;
        this.getGameId = getGameId;
        this.logger = logger;
        this.handleFocusCounters = handleFocusCounters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() throws InitializationException {
        if (this.sessionRepository.getShouldInitialize()) {
            if (this.getGameId.invoke() == null) {
                throw new InitializationException("gameId is null.", null, "invalid_game_id", "null", null, 18, null);
            }
        } else {
            InitializationException initializationError = this.sessionRepository.getInitializationError();
            if (initializationError == null) {
                throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", null, 18, null);
            }
        }
    }

    private final String getInitLog() {
        StringBuilder sb2 = new StringBuilder("Initializing SDK 4.18.1 41801 with game id ");
        sb2.append(this.getGameId.invoke());
        sb2.append(" in ");
        sb2.append(this.sessionRepository.isTestModeEnabled() ? "test" : AdjustConfig.ENVIRONMENT_PRODUCTION);
        sb2.append(" mode, session ");
        sb2.append(ProtobufExtensionsKt.toUUID(this.sessionRepository.getSessionId()));
        return sb2.toString();
    }

    private final Map<String, String> getTags(InitializationException e10, String source, boolean isRetry) {
        yj.f fVar = new yj.f();
        fVar.put("operation", OperationType.INITIALIZATION.toString());
        if (e10 != null) {
        }
        fVar.put("source", source);
        fVar.put("is_retry", String.valueOf(isRetry));
        fVar.put("new_api", String.valueOf(this.sessionRepository.getInitializationConfiguration() != null));
        if (e10 != null && e10.getReasonDebug() != null) {
            fVar.put("reason_debug", e10.getReasonDebug());
        }
        return fVar.g();
    }

    public static /* synthetic */ Map getTags$default(AndroidInitializeBoldSDK androidInitializeBoldSDK, InitializationException initializationException, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            initializationException = null;
        }
        return androidInitializeBoldSDK.getTags(initializationException, str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(bn.e startTime, InitializationException e10, String source, boolean isRetry) {
        this.logger.error("Initialization failed: " + e10.getMessage(), e10);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_FAILURE_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), getTags(e10, source, isRetry), (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sessionRepository.setInitializationError(e10);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(e10);
        setupDiagnosticEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializationStart(String str, boolean z10, f fVar) {
        this.logger.info(getInitLog());
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_STARTED, (Double) null, b0.T(getTags$default(this, null, str, z10, 1, null), b0.P(new wj.f("kotlin_version", wj.c.f53275e.toString()))), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object objInvoke = this.eventObservers.invoke(fVar);
        return objInvoke == bk.a.f5708a ? objInvoke : r.f53297a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        if (r1.persistNativeConfiguration(r6) == r10) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object initializationSuccess(bn.e r23, java.lang.String r24, boolean r25, ak.f r26) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess(bn.e, java.lang.String, boolean, ak.f):java.lang.Object");
    }

    private final void setupDiagnosticEvents() {
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration config = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        n.e(config, "config");
        diagnosticEventRepository.configure(config);
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    public Object invoke(String str, f fVar) throws Throwable {
        Object objJ = d0.J(this.defaultDispatcher, new AnonymousClass2(str, null), fVar);
        return objJ == bk.a.f5708a ? objJ : r.f53297a;
    }
}
