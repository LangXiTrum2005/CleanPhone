package com.unity3d.ads.core.domain.events;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.ads.core.data.repository.AdRevenueRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import fn.a1;
import fn.g;
import fn.n0;
import fn.s;
import gatewayprotocol.v1.AdRevenueEventRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.b;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/unity3d/ads/core/domain/events/AdRevenueObserver;", "", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "Lcn/a0;", "scope", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "adRevenueRepository", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcn/a0;Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/log/Logger;)V", "Lwj/r;", "invoke", "()V", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcn/a0;", "Lcom/unity3d/ads/core/data/repository/AdRevenueRepository;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/core/log/Logger;", "Lfn/n0;", "", "isRunning", "Lfn/n0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AdRevenueObserver {
    private final AdRevenueRepository adRevenueRepository;
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final n0 isRunning;
    private final Logger logger;
    private final a0 scope;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.AdRevenueObserver$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;", "currentAdRevenueEventRequest", "Lwj/r;", "<anonymous>", "(Lgatewayprotocol/v1/AdRevenueEventRequestOuterClass$AdRevenueEventRequest;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.events.AdRevenueObserver$invoke$2", f = "AdRevenueObserver.kt", l = {36, 37}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass2 anonymousClass2 = AdRevenueObserver.this.new AnonymousClass2(fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // jk.c
        public final Object invoke(AdRevenueEventRequestOuterClass.AdRevenueEventRequest adRevenueEventRequest, f fVar) {
            return ((AnonymousClass2) create(adRevenueEventRequest, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        
            if (com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, null, r6, r7, r8, r9, 1, null) == r3) goto L22;
         */
        @Override // ck.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                int r0 = r12.label
                r1 = 2
                r2 = 1
                bk.a r3 = bk.a.f5708a
                if (r0 == 0) goto L21
                if (r0 == r2) goto L1d
                if (r0 != r1) goto L15
                t9.e.z(r13)     // Catch: java.lang.Exception -> L11 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                goto L82
            L11:
                r0 = move-exception
                r13 = r0
                r9 = r12
                goto L77
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L1d:
                t9.e.z(r13)     // Catch: java.lang.Exception -> L11 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                goto L4f
            L21:
                t9.e.z(r13)
                java.lang.Object r13 = r12.L$0
                gatewayprotocol.v1.AdRevenueEventRequestOuterClass$AdRevenueEventRequest r13 = (gatewayprotocol.v1.AdRevenueEventRequestOuterClass.AdRevenueEventRequest) r13
                gatewayprotocol.v1.UniversalRequestKt r0 = gatewayprotocol.v1.UniversalRequestKt.INSTANCE     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl$Companion r0 = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload$Builder r4 = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder()     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                java.lang.String r5 = "newBuilder()"
                kotlin.jvm.internal.n.e(r4, r5)     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                gatewayprotocol.v1.UniversalRequestKt$PayloadKt$Dsl r0 = r0._create(r4)     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                r0.setAdRevenueEventRequest(r13)     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest$Payload r13 = r0._build()     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                com.unity3d.ads.core.domain.events.AdRevenueObserver r0 = com.unity3d.ads.core.domain.events.AdRevenueObserver.this     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r0 = com.unity3d.ads.core.domain.events.AdRevenueObserver.access$getGetUniversalRequestForPayLoad$p(r0)     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                r12.label = r2     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                java.lang.Object r13 = r0.invoke(r13, r12)     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                if (r13 != r3) goto L4f
                goto L70
            L4f:
                r6 = r13
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                com.unity3d.ads.core.domain.events.AdRevenueObserver r13 = com.unity3d.ads.core.domain.events.AdRevenueObserver.this     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.events.AdRevenueObserver.access$getGatewayClient$p(r13)     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                com.unity3d.ads.core.domain.events.AdRevenueObserver r13 = com.unity3d.ads.core.domain.events.AdRevenueObserver.this     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.events.AdRevenueObserver.access$getGetRequestPolicy$p(r13)     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.AD_REVENUE_EVENT     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                r12.label = r1     // Catch: java.lang.Exception -> L74 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                r5 = 0
                r10 = 1
                r11 = 0
                r9 = r12
                java.lang.Object r12 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L71 com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException -> L82
                if (r12 != r3) goto L82
            L70:
                return r3
            L71:
                r0 = move-exception
            L72:
                r13 = r0
                goto L77
            L74:
                r0 = move-exception
                r9 = r12
                goto L72
            L77:
                com.unity3d.ads.core.domain.events.AdRevenueObserver r12 = com.unity3d.ads.core.domain.events.AdRevenueObserver.this
                com.unity3d.ads.core.log.Logger r12 = com.unity3d.ads.core.domain.events.AdRevenueObserver.access$getLogger$p(r12)
                java.lang.String r0 = "Unexpected error processing ad revenue event"
                r12.trace(r0, r13)
            L82:
                wj.r r12 = wj.r.f53297a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.AdRevenueObserver.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.AdRevenueObserver$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lwj/r;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass3 extends o implements b {
        public AnonymousClass3() {
            super(1);
        }

        @Override // jk.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return r.f53297a;
        }

        public final void invoke(Throwable th2) {
            n0 n0Var = AdRevenueObserver.this.isRunning;
            Boolean bool = Boolean.FALSE;
            a1 a1Var = (a1) n0Var;
            a1Var.getClass();
            a1Var.e0(null, bool);
        }
    }

    public AdRevenueObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, a0 scope, AdRevenueRepository adRevenueRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, Logger logger) {
        n.f(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        n.f(scope, "scope");
        n.f(adRevenueRepository, "adRevenueRepository");
        n.f(gatewayClient, "gatewayClient");
        n.f(getRequestPolicy, "getRequestPolicy");
        n.f(logger, "logger");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = scope;
        this.adRevenueRepository = adRevenueRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.logger = logger;
        this.isRunning = g.c(Boolean.FALSE);
    }

    public final void invoke() {
        a1 a1Var;
        Object value;
        Boolean bool;
        n0 n0Var = this.isRunning;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!a1Var.c0(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        g.o(new s(this.adRevenueRepository.getAdRevenueEvents(), new AnonymousClass2(null), 2), this.scope).n(new AnonymousClass3());
    }
}
