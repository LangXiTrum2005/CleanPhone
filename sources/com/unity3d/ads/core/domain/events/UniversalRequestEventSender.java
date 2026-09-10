package com.unity3d.ads.core.domain.events;

import ak.f;
import bk.a;
import ck.c;
import ck.e;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086Bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;", "handleGatewayEventResponse", "Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;", "universalRequestTtlValidator", "Lcom/unity3d/ads/core/data/model/OperationType;", "operationType", "<init>", "(Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;Lcom/unity3d/ads/core/data/model/OperationType;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "universalRequest", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "requestPolicy", "Lwj/r;", "invoke", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;", "Lcom/unity3d/ads/core/domain/events/UniversalRequestTtlValidator;", "Lcom/unity3d/ads/core/data/model/OperationType;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class UniversalRequestEventSender {
    private final GatewayClient gatewayClient;
    private final HandleGatewayEventResponse handleGatewayEventResponse;
    private final OperationType operationType;
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.events.UniversalRequestEventSender", f = "UniversalRequestEventSender.kt", l = {23, 37}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
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
            return UniversalRequestEventSender.this.invoke(null, null, this);
        }
    }

    public UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator, OperationType operationType) {
        n.f(gatewayClient, "gatewayClient");
        n.f(handleGatewayEventResponse, "handleGatewayEventResponse");
        n.f(universalRequestTtlValidator, "universalRequestTtlValidator");
        n.f(operationType, "operationType");
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
        this.universalRequestTtlValidator = universalRequestTtlValidator;
        this.operationType = operationType;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object invoke(UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, f fVar) {
        AnonymousClass1 anonymousClass1;
        Object objC;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objRequest$default = anonymousClass2.result;
        int i11 = anonymousClass2.label;
        r rVar = r.f53297a;
        a aVar = a.f5708a;
        try {
            if (i11 == 0) {
                t9.e.z(objRequest$default);
                if (this.universalRequestTtlValidator.invoke(universalRequest, requestPolicy)) {
                    GatewayClient gatewayClient = this.gatewayClient;
                    OperationType operationType = this.operationType;
                    anonymousClass2.L$0 = this;
                    anonymousClass2.label = 1;
                    objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicy, operationType, anonymousClass2, 1, null);
                    if (objRequest$default == aVar) {
                    }
                    return aVar;
                }
                return rVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(objRequest$default);
                return rVar;
            }
            this = (UniversalRequestEventSender) anonymousClass2.L$0;
            t9.e.z(objRequest$default);
            objC = (UniversalResponseOuterClass.UniversalResponse) objRequest$default;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        if (!(h.a(objC) instanceof GatewayException)) {
            HandleGatewayEventResponse handleGatewayEventResponse = this.handleGatewayEventResponse;
            t9.e.z(objC);
            anonymousClass2.L$0 = null;
            anonymousClass2.label = 2;
            if (handleGatewayEventResponse.invoke((UniversalResponseOuterClass.UniversalResponse) objC, anonymousClass2) == aVar) {
                return aVar;
            }
        }
        return rVar;
    }

    public /* synthetic */ UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator, OperationType operationType, int i10, g gVar) {
        this(gatewayClient, handleGatewayEventResponse, universalRequestTtlValidator, (i10 & 8) != 0 ? OperationType.UNIVERSAL_EVENT : operationType);
    }
}
