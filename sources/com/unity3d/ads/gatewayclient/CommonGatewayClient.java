package com.unity3d.ads.gatewayclient;

import ak.f;
import bk.a;
import bn.d;
import ck.c;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.d2;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.google.protobuf.InvalidProtocolBufferException;
import com.ironsource.Ve;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 O2\u00020\u0001:\u0001OB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!JA\u0010&\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u00102\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100$0#2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010'J)\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100$0#2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010+J/\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J/\u00104\u001a\u0002002\u0006\u00103\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108J'\u0010;\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b;\u0010<J'\u0010=\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b=\u0010<J\u001f\u0010A\u001a\u0002092\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ'\u0010G\u001a\u00020F2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020\u001dH\u0002¢\u0006\u0004\bG\u0010HJ3\u0010\u0013\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010MR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010N\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, d2 = {"Lcom/unity3d/ads/gatewayclient/CommonGatewayClient;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "handleGatewayUniversalResponse", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;", "requestUrlFactory", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/HttpClientProvider;Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;Lcom/unity3d/ads/core/log/Logger;)V", "", "url", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "request", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "requestPolicy", "Lcom/unity3d/ads/core/data/model/OperationType;", "operationType", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "executeWithRetry", "(Ljava/lang/String;Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lcom/unity3d/ads/core/data/model/OperationType;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/services/core/network/model/HttpRequest;", "httpRequest", "", "retryCount", "Lcom/unity3d/services/core/network/model/HttpResponse;", "executeRequest", "(Lcom/unity3d/services/core/network/model/HttpRequest;ILcom/unity3d/ads/core/data/model/OperationType;Lak/f;)Ljava/lang/Object;", "gatewayUrl", "", "", "headers", "buildHttpRequest", "(Ljava/lang/String;Ljava/util/Map;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;)Lcom/unity3d/services/core/network/model/HttpRequest;", "getHeaders", "(I)Ljava/util/Map;", "getGatewayUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "e", "Lbn/e;", "startTime", "Lwj/r;", "sendNetworkErrorDiagnosticEvent", "(Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;ILcom/unity3d/ads/core/data/model/OperationType;Lbn/e;)V", "httpResponse", "sendNetworkSuccessDiagnosticEvent", "(Lcom/unity3d/services/core/network/model/HttpResponse;ILcom/unity3d/ads/core/data/model/OperationType;Lbn/e;)V", Ve.f27442n, "getUniversalResponse", "(Lcom/unity3d/services/core/network/model/HttpResponse;Lcom/unity3d/ads/core/data/model/OperationType;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "", "currentDelay", "calculateDelayTime", "(JLcom/unity3d/ads/gatewayclient/RequestPolicy;I)J", "calculateExponentialBackoff", "retryWaitBase", "", "retryJitterPct", "calculateJitter", "(IF)J", "responseCode", IronSourceConstants.EVENTS_DURATION, "maxDuration", "", "shouldRetry", "(IJI)Z", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;", "Lcom/unity3d/ads/core/log/Logger;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonGatewayClient implements GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final int CODE_TOO_MANY_REQUESTS = 429;
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_PROTOBUF = "application/x-protobuf";
    public static final String HEADER_RETRY_AFTER = "Retry-After";
    public static final String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    private final HttpClientProvider httpClientProvider;
    private final Logger logger;
    private final RequestUrlFactory requestUrlFactory;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OperationType.values().length];
            try {
                iArr[OperationType.INITIALIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OperationType.LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OperationType.LOAD_HEADER_BIDDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {121, 122}, m = "executeRequest")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.executeRequest(null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeWithRetry$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {78, 84, 108}, m = "executeWithRetry")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C08241 extends c {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C08241(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.executeWithRetry(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {62}, m = "request")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C08251 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C08251(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.request(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "<anonymous>", "(Lcn/a0;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", f = "CommonGatewayClient.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements jk.c {
        final /* synthetic */ OperationType $operationType;
        final /* synthetic */ UniversalRequestOuterClass.UniversalRequest $request;
        final /* synthetic */ RequestPolicy $requestPolicy;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OperationType operationType, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, f fVar) {
            super(2, fVar);
            this.$operationType = operationType;
            this.$url = str;
            this.$request = universalRequest;
            this.$requestPolicy = requestPolicy;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return CommonGatewayClient.this.new AnonymousClass2(this.$operationType, this.$url, this.$request, this.$requestPolicy, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) throws NetworkTimeoutException {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return obj;
            }
            t9.e.z(obj);
            CommonGatewayClient commonGatewayClient = CommonGatewayClient.this;
            String requestUrl = commonGatewayClient.requestUrlFactory.getRequestUrl(this.$operationType, this.$url);
            UniversalRequestOuterClass.UniversalRequest universalRequest = this.$request;
            RequestPolicy requestPolicy = this.$requestPolicy;
            OperationType operationType = this.$operationType;
            this.label = 1;
            Object objExecuteWithRetry = commonGatewayClient.executeWithRetry(requestUrl, universalRequest, requestPolicy, operationType, this);
            a aVar = a.f5708a;
            return objExecuteWithRetry == aVar ? aVar : objExecuteWithRetry;
        }
    }

    public CommonGatewayClient(HttpClientProvider httpClientProvider, HandleGatewayUniversalResponse handleGatewayUniversalResponse, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository, RequestUrlFactory requestUrlFactory, Logger logger) {
        n.f(httpClientProvider, "httpClientProvider");
        n.f(handleGatewayUniversalResponse, "handleGatewayUniversalResponse");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(sessionRepository, "sessionRepository");
        n.f(requestUrlFactory, "requestUrlFactory");
        n.f(logger, "logger");
        this.httpClientProvider = httpClientProvider;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.requestUrlFactory = requestUrlFactory;
        this.logger = logger;
    }

    private final HttpRequest buildHttpRequest(String gatewayUrl, Map<String, ? extends List<String>> headers, RequestPolicy requestPolicy, UniversalRequestOuterClass.UniversalRequest request) {
        return new HttpRequest(gatewayUrl, null, RequestType.POST, request.toByteArray(), headers, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final long calculateDelayTime(long currentDelay, RequestPolicy requestPolicy, int retryCount) {
        return Math.min(calculateExponentialBackoff(currentDelay, requestPolicy, retryCount) + calculateJitter(requestPolicy.getRetryWaitBase(), requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(long currentDelay, RequestPolicy requestPolicy, int retryCount) {
        if (retryCount == 0) {
            return currentDelay;
        }
        return (long) (requestPolicy.getRetryScalingFactor() * currentDelay);
    }

    private final long calculateJitter(int retryWaitBase, float retryJitterPct) {
        if (retryJitterPct == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        long j10 = (long) (retryWaitBase * retryJitterPct);
        return nk.e.f46786b.h(-j10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object executeRequest(HttpRequest httpRequest, int i10, OperationType operationType, f fVar) {
        AnonymousClass1 anonymousClass1;
        int i11;
        OperationType operationType2;
        OperationType operationType3;
        long j10;
        HttpRequest httpRequest2;
        int i12;
        CommonGatewayClient commonGatewayClient = this;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i13 = anonymousClass1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i13 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = commonGatewayClient.new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = commonGatewayClient.new AnonymousClass1(fVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objInvoke = anonymousClass2.result;
        int i14 = anonymousClass2.label;
        a aVar = a.f5708a;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j11 = anonymousClass2.J$0;
                i12 = anonymousClass2.I$0;
                OperationType operationType4 = (OperationType) anonymousClass2.L$1;
                CommonGatewayClient commonGatewayClient2 = (CommonGatewayClient) anonymousClass2.L$0;
                try {
                    t9.e.z(objInvoke);
                    j10 = j11;
                    operationType3 = operationType4;
                    commonGatewayClient = commonGatewayClient2;
                    try {
                        HttpResponse httpResponse = (HttpResponse) objInvoke;
                        commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse, i12, operationType3, new bn.f(j10));
                        return httpResponse;
                    } catch (d2 e10) {
                        e = e10;
                        i11 = i12;
                        commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null), i11, operationType3, new bn.f(j10));
                        throw e;
                    } catch (UnityAdsNetworkException e11) {
                        e = e11;
                        i11 = i12;
                        commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i11, operationType3, new bn.f(j10));
                        return HttpResponseKt.toHttpResponse(e);
                    }
                } catch (d2 e12) {
                    e = e12;
                    j10 = j11;
                    i11 = i12;
                    operationType3 = operationType4;
                    commonGatewayClient = commonGatewayClient2;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null), i11, operationType3, new bn.f(j10));
                    throw e;
                } catch (UnityAdsNetworkException e13) {
                    e = e13;
                    j10 = j11;
                    i11 = i12;
                    operationType3 = operationType4;
                    commonGatewayClient = commonGatewayClient2;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i11, operationType3, new bn.f(j10));
                    return HttpResponseKt.toHttpResponse(e);
                }
            }
            long j12 = anonymousClass2.J$0;
            int i15 = anonymousClass2.I$0;
            operationType2 = (OperationType) anonymousClass2.L$2;
            HttpRequest httpRequest3 = (HttpRequest) anonymousClass2.L$1;
            CommonGatewayClient commonGatewayClient3 = (CommonGatewayClient) anonymousClass2.L$0;
            try {
                t9.e.z(objInvoke);
                j10 = j12;
                i11 = i15;
                httpRequest2 = httpRequest3;
                commonGatewayClient = commonGatewayClient3;
                operationType3 = operationType2;
                try {
                    anonymousClass2.L$0 = commonGatewayClient;
                    anonymousClass2.L$1 = operationType3;
                    anonymousClass2.L$2 = null;
                    anonymousClass2.I$0 = i11;
                    anonymousClass2.J$0 = j10;
                    anonymousClass2.label = 2;
                    objInvoke = HttpClient.DefaultImpls.execute$default((HttpClient) objInvoke, httpRequest2, false, anonymousClass2, 2, null);
                    if (objInvoke != aVar) {
                        i12 = i11;
                        HttpResponse httpResponse2 = (HttpResponse) objInvoke;
                        commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse2, i12, operationType3, new bn.f(j10));
                        return httpResponse2;
                    }
                    return aVar;
                } catch (d2 e14) {
                    e = e14;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null), i11, operationType3, new bn.f(j10));
                    throw e;
                } catch (UnityAdsNetworkException e15) {
                    e = e15;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i11, operationType3, new bn.f(j10));
                    return HttpResponseKt.toHttpResponse(e);
                }
            } catch (d2 e16) {
                e = e16;
                j10 = j12;
                i11 = i15;
                operationType3 = operationType2;
                commonGatewayClient = commonGatewayClient3;
                commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null), i11, operationType3, new bn.f(j10));
                throw e;
            } catch (UnityAdsNetworkException e17) {
                e = e17;
                j10 = j12;
                i11 = i15;
                operationType3 = operationType2;
                commonGatewayClient = commonGatewayClient3;
                commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i11, operationType3, new bn.f(j10));
                return HttpResponseKt.toHttpResponse(e);
            }
        }
        t9.e.z(objInvoke);
        long jB = d.b();
        try {
            HttpClientProvider httpClientProvider = commonGatewayClient.httpClientProvider;
            anonymousClass2.L$0 = commonGatewayClient;
            anonymousClass2.L$1 = httpRequest;
            operationType2 = operationType;
            try {
                anonymousClass2.L$2 = operationType2;
                i11 = i10;
                try {
                    anonymousClass2.I$0 = i11;
                    anonymousClass2.J$0 = jB;
                    anonymousClass2.label = 1;
                    objInvoke = httpClientProvider.invoke(anonymousClass2);
                    if (objInvoke != aVar) {
                        httpRequest2 = httpRequest;
                        j10 = jB;
                        operationType3 = operationType2;
                        anonymousClass2.L$0 = commonGatewayClient;
                        anonymousClass2.L$1 = operationType3;
                        anonymousClass2.L$2 = null;
                        anonymousClass2.I$0 = i11;
                        anonymousClass2.J$0 = j10;
                        anonymousClass2.label = 2;
                        objInvoke = HttpClient.DefaultImpls.execute$default((HttpClient) objInvoke, httpRequest2, false, anonymousClass2, 2, null);
                        if (objInvoke != aVar) {
                            i12 = i11;
                            HttpResponse httpResponse3 = (HttpResponse) objInvoke;
                            commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse3, i12, operationType3, new bn.f(j10));
                            return httpResponse3;
                        }
                    }
                    return aVar;
                } catch (d2 e18) {
                    e = e18;
                    operationType3 = operationType2;
                    j10 = jB;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null), i11, operationType3, new bn.f(j10));
                    throw e;
                } catch (UnityAdsNetworkException e19) {
                    e = e19;
                    operationType3 = operationType2;
                    j10 = jB;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i11, operationType3, new bn.f(j10));
                    return HttpResponseKt.toHttpResponse(e);
                }
            } catch (d2 e20) {
                e = e20;
                i11 = i10;
            } catch (UnityAdsNetworkException e21) {
                e = e21;
                i11 = i10;
            }
        } catch (d2 e22) {
            e = e22;
            i11 = i10;
            operationType2 = operationType;
        } catch (UnityAdsNetworkException e23) {
            e = e23;
            i11 = i10;
            operationType2 = operationType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:33:0x0104  */
    /* JADX WARN: Code duplicated, block: B:40:0x0132  */
    /* JADX WARN: Code duplicated, block: B:42:0x0135  */
    /* JADX WARN: Code duplicated, block: B:43:0x013a  */
    /* JADX WARN: Code duplicated, block: B:46:0x015a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0183  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0171, code lost:
    
        if (cn.d0.l(r2, r1) == r7) goto L48;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0183, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0171 -> B:14:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object executeWithRetry(java.lang.String r31, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r32, com.unity3d.ads.gatewayclient.RequestPolicy r33, com.unity3d.ads.core.data.model.OperationType r34, ak.f r35) throws com.unity3d.ads.core.data.model.exception.NetworkTimeoutException {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.executeWithRetry(java.lang.String, gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, com.unity3d.ads.core.data.model.OperationType, ak.f):java.lang.Object");
    }

    private final String getGatewayUrl(String url) {
        return !n.a(url, UnityAdsConstants.DefaultUrls.GATEWAY_URL) ? url : this.sessionRepository.getGatewayUrl();
    }

    private final Map<String, List<String>> getHeaders(int retryCount) {
        yj.f fVar = new yj.f();
        fVar.put("Content-Type", j1.f.C(HEADER_PROTOBUF));
        if (retryCount > 0) {
            fVar.put(HEADER_RETRY_ATTEMPT, j1.f.C(String.valueOf(retryCount)));
        }
        return fVar.g();
    }

    private final UniversalResponseOuterClass.UniversalResponse getUniversalResponse(HttpResponse response, OperationType operationType) {
        try {
            Object body = response.getBody();
            if (body instanceof byte[]) {
                UniversalResponseOuterClass.UniversalResponse from = UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
                n.e(from, "parseFrom(responseBody)");
                return from;
            }
            if (!(body instanceof String)) {
                throw new InvalidProtocolBufferException("Could not parse response from gateway service");
            }
            byte[] bytes = ((String) body).getBytes(an.a.f3768a);
            n.e(bytes, "this as java.lang.String).getBytes(charset)");
            UniversalResponseOuterClass.UniversalResponse from2 = UniversalResponseOuterClass.UniversalResponse.parseFrom(bytes);
            n.e(from2, "parseFrom(\n             ….UTF_8)\n                )");
            return from2;
        } catch (InvalidProtocolBufferException e10) {
            this.logger.debug("Failed to parse response from gateway service with exception: " + e10.getLocalizedMessage());
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", (Double) null, b0.Q(new wj.f("operation", operationType.toString()), new wj.f("reason", "protobuf_parsing"), new wj.f("reason_debug", response.getBody().toString())), (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
            UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.INSTANCE;
            UniversalResponseOuterClass.UniversalResponse.Builder builderNewBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
            n.e(builderNewBuilder, "newBuilder()");
            UniversalResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
            ErrorKt.Dsl.Companion companion2 = ErrorKt.Dsl.INSTANCE;
            ErrorOuterClass.Error.Builder builderNewBuilder2 = ErrorOuterClass.Error.newBuilder();
            n.e(builderNewBuilder2, "newBuilder()");
            ErrorKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
            dsl_create2.setErrorText("ERROR: Could not parse response from gateway service");
            dsl_create.setError(dsl_create2._build());
            return dsl_create._build();
        }
    }

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException e10, int retryCount, OperationType operationType, bn.e startTime) {
        if (operationType == OperationType.DIAGNOSTIC_EVENT) {
            return;
        }
        LinkedHashMap linkedHashMapR = b0.R(new wj.f("operation", operationType.toString()), new wj.f("retries", String.valueOf(retryCount)), new wj.f("protocol", String.valueOf(e10.getProtocol())), new wj.f("network_client", String.valueOf(e10.getClient())), new wj.f("reason_code", String.valueOf(e10.getCode())), new wj.f("reason_debug", e10.getMessage()));
        int i10 = WhenMappings.$EnumSwitchMapping$0[operationType.ordinal()];
        if (i10 == 1) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_FAILURE_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), linkedHashMapR, (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
        } else if (i10 == 2 || i10 == 3) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), linkedHashMapR, (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), linkedHashMapR, (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
        }
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse, int retryCount, OperationType operationType, bn.e startTime) {
        if (operationType == OperationType.DIAGNOSTIC_EVENT) {
            return;
        }
        LinkedHashMap linkedHashMapR = b0.R(new wj.f("operation", operationType.toString()), new wj.f("retries", String.valueOf(retryCount)), new wj.f("protocol", httpResponse.getProtocol()), new wj.f("network_client", httpResponse.getClient()), new wj.f("reason_code", String.valueOf(httpResponse.getStatusCode())));
        int i10 = WhenMappings.$EnumSwitchMapping$0[operationType.ordinal()];
        if (i10 == 1) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), linkedHashMapR, (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
        } else if (i10 == 2 || i10 == 3) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), linkedHashMapR, (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), linkedHashMapR, (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
        }
    }

    private final boolean shouldRetry(int responseCode, long duration, int maxDuration) {
        return 400 <= responseCode && responseCode < 600 && duration < ((long) maxDuration);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.unity3d.ads.gatewayclient.GatewayClient
    public Object request(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, f fVar) throws NetworkTimeoutException {
        C08251 c08251;
        RequestPolicy requestPolicy2;
        if (fVar instanceof C08251) {
            c08251 = (C08251) fVar;
            int i10 = c08251.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c08251.label = i10 - Integer.MIN_VALUE;
            } else {
                c08251 = new C08251(fVar);
            }
        } else {
            c08251 = new C08251(fVar);
        }
        Object objK = c08251.result;
        int i11 = c08251.label;
        if (i11 == 0) {
            t9.e.z(objK);
            int i12 = bn.a.f5743d;
            long jO = d0.c.O(requestPolicy.getMaxDuration(), bn.c.MILLISECONDS);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(operationType, str, universalRequest, requestPolicy, null);
            c08251.L$0 = requestPolicy;
            c08251.label = 1;
            objK = d0.K(d0.G(jO), anonymousClass2, c08251);
            a aVar = a.f5708a;
            if (objK == aVar) {
                return aVar;
            }
            requestPolicy2 = requestPolicy;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            requestPolicy2 = (RequestPolicy) c08251.L$0;
            t9.e.z(objK);
        }
        UniversalResponseOuterClass.UniversalResponse universalResponse = (UniversalResponseOuterClass.UniversalResponse) objK;
        if (universalResponse != null) {
            return universalResponse;
        }
        throw new NetworkTimeoutException("Gateway request timed out after " + requestPolicy2.getMaxDuration() + "ms", null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }
}
