package com.unity3d.ads.core.domain;

import ak.f;
import bn.d;
import ck.c;
import ck.e;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "getInitializationCompletedRequest", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Lwj/r;", "invoke", "(Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidTriggerInitializationCompletedRequest implements TriggerInitializationCompletedRequest {
    private final GatewayClient gatewayClient;
    private final GetInitializationCompletedRequest getInitializationCompletedRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest", f = "AndroidTriggerInitializationCompletedRequest.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE, 32}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        long J$0;
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
            return AndroidTriggerInitializationCompletedRequest.this.invoke(this);
        }
    }

    public AndroidTriggerInitializationCompletedRequest(GetInitializationCompletedRequest getInitializationCompletedRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(getInitializationCompletedRequest, "getInitializationCompletedRequest");
        n.f(getRequestPolicy, "getRequestPolicy");
        n.f(gatewayClient, "gatewayClient");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getInitializationCompletedRequest = getInitializationCompletedRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb A[Catch: Exception -> 0x0116, TRY_LEAVE, TryCatch #2 {Exception -> 0x0116, blocks: (B:35:0x00c3, B:37:0x00cb), top: B:55:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0118  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest
    public Object invoke(f fVar) {
        AnonymousClass1 anonymousClass1;
        long jB;
        long j10;
        long j11;
        Object objRequest$default;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest = this;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = androidTriggerInitializationCompletedRequest.new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = androidTriggerInitializationCompletedRequest.new AnonymousClass1(fVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objInvoke = anonymousClass2.result;
        int i11 = anonymousClass2.label;
        r rVar = r.f53297a;
        bk.a aVar = bk.a.f5708a;
        if (i11 == 0) {
            t9.e.z(objInvoke);
            jB = d.b();
            SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_STARTED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, 62, (Object) null);
            try {
                GetInitializationCompletedRequest getInitializationCompletedRequest = androidTriggerInitializationCompletedRequest.getInitializationCompletedRequest;
                anonymousClass2.L$0 = androidTriggerInitializationCompletedRequest;
                anonymousClass2.J$0 = jB;
                anonymousClass2.label = 1;
                objInvoke = getInitializationCompletedRequest.invoke(anonymousClass2);
                if (objInvoke == aVar) {
                    return aVar;
                }
                UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                RequestPolicy requestPolicyInvoke = androidTriggerInitializationCompletedRequest.getRequestPolicy.invoke();
                GatewayClient gatewayClient = androidTriggerInitializationCompletedRequest.gatewayClient;
                OperationType operationType = OperationType.INITIALIZATION_COMPLETED;
                anonymousClass2.L$0 = androidTriggerInitializationCompletedRequest;
                anonymousClass2.J$0 = jB;
                anonymousClass2.label = 2;
                j11 = jB;
                objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicyInvoke, operationType, anonymousClass2, 1, null);
                if (objRequest$default == aVar) {
                    return aVar;
                }
                objInvoke = objRequest$default;
                j10 = j11;
                universalResponse = (UniversalResponseOuterClass.UniversalResponse) objInvoke;
                if (universalResponse.hasError()) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(j10))), b0.Q(new wj.f("operation", OperationType.INITIALIZATION_COMPLETED.toString()), new wj.f("reason", "gateway"), new wj.f("reason_debug", universalResponse.getError().getErrorText())), (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
                    return rVar;
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(j10))), (Map) null, (Map) null, (AdObject) null, (Integer) null, 60, (Object) null);
                return rVar;
            } catch (Exception e10) {
                e = e10;
                j10 = jB;
            }
        } else if (i11 == 1) {
            long j12 = anonymousClass2.J$0;
            AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest2 = (AndroidTriggerInitializationCompletedRequest) anonymousClass2.L$0;
            try {
                t9.e.z(objInvoke);
                androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest2;
                jB = j12;
                try {
                    UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                    RequestPolicy requestPolicyInvoke2 = androidTriggerInitializationCompletedRequest.getRequestPolicy.invoke();
                    GatewayClient gatewayClient2 = androidTriggerInitializationCompletedRequest.gatewayClient;
                    OperationType operationType2 = OperationType.INITIALIZATION_COMPLETED;
                    anonymousClass2.L$0 = androidTriggerInitializationCompletedRequest;
                    anonymousClass2.J$0 = jB;
                    anonymousClass2.label = 2;
                    j11 = jB;
                    try {
                        objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest2, requestPolicyInvoke2, operationType2, anonymousClass2, 1, null);
                        if (objRequest$default == aVar) {
                            return aVar;
                        }
                        objInvoke = objRequest$default;
                        j10 = j11;
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) objInvoke;
                        if (universalResponse.hasError()) {
                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(j10))), b0.Q(new wj.f("operation", OperationType.INITIALIZATION_COMPLETED.toString()), new wj.f("reason", "gateway"), new wj.f("reason_debug", universalResponse.getError().getErrorText())), (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
                            return rVar;
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(j10))), (Map) null, (Map) null, (AdObject) null, (Integer) null, 60, (Object) null);
                        return rVar;
                    } catch (Exception e11) {
                        e = e11;
                        j10 = j11;
                    }
                } catch (Exception e12) {
                    e = e12;
                    j11 = jB;
                }
            } catch (Exception e13) {
                e = e13;
                j10 = j12;
                androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest2;
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j13 = anonymousClass2.J$0;
            AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest3 = (AndroidTriggerInitializationCompletedRequest) anonymousClass2.L$0;
            try {
                t9.e.z(objInvoke);
                androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                j10 = j13;
                try {
                    universalResponse = (UniversalResponseOuterClass.UniversalResponse) objInvoke;
                    if (universalResponse.hasError()) {
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(j10))), b0.Q(new wj.f("operation", OperationType.INITIALIZATION_COMPLETED.toString()), new wj.f("reason", "gateway"), new wj.f("reason_debug", universalResponse.getError().getErrorText())), (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
                        return rVar;
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(j10))), (Map) null, (Map) null, (AdObject) null, (Integer) null, 60, (Object) null);
                    return rVar;
                } catch (Exception e14) {
                    e = e14;
                }
            } catch (Exception e15) {
                e = e15;
                androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                j10 = j13;
            }
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(j10))), b0.Q(new wj.f("operation", OperationType.INITIALIZATION_COMPLETED.toString()), new wj.f("reason", "uncaught_exception"), new wj.f("reason_debug", ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null))), (Map) null, (AdObject) null, (Integer) null, 56, (Object) null);
        return rVar;
    }
}
