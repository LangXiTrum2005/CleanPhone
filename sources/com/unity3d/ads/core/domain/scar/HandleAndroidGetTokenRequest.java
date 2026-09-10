package com.unity3d.ads.core.domain.scar;

import ak.f;
import bk.a;
import ck.c;
import ck.e;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/HandleAndroidGetTokenRequest;", "Lcom/unity3d/ads/core/domain/scar/HandleGetTokenRequest;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/scar/GetHbTokenEventRequest;", "getHbTokenEventRequest", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;Lcom/unity3d/ads/core/domain/scar/GetHbTokenEventRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;)V", "Lcom/google/protobuf/ByteString;", "tokenId", "Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;", "biddingSignals", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "invoke", "(Lcom/google/protobuf/ByteString;Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/domain/scar/GetHbTokenEventRequest;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class HandleAndroidGetTokenRequest implements HandleGetTokenRequest {
    private final GatewayClient gatewayClient;
    private final GetHbTokenEventRequest getHbTokenEventRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest", f = "HandleAndroidGetTokenRequest.kt", l = {20, 24, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE}, m = "invoke")
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
            return HandleAndroidGetTokenRequest.this.invoke(null, null, this);
        }
    }

    public HandleAndroidGetTokenRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, GetHbTokenEventRequest getHbTokenEventRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        n.f(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        n.f(getHbTokenEventRequest, "getHbTokenEventRequest");
        n.f(getRequestPolicy, "getRequestPolicy");
        n.f(gatewayClient, "gatewayClient");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getHbTokenEventRequest = getHbTokenEventRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.unity3d.ads.core.domain.scar.HandleGetTokenRequest
    public Object invoke(ByteString byteString, BiddingSignals biddingSignals, f fVar) {
        AnonymousClass1 anonymousClass1;
        Object objRequest$default;
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
        Object objInvoke = anonymousClass2.result;
        int i11 = anonymousClass2.label;
        a aVar = a.f5708a;
        if (i11 == 0) {
            t9.e.z(objInvoke);
            GetHbTokenEventRequest getHbTokenEventRequest = this.getHbTokenEventRequest;
            anonymousClass2.L$0 = this;
            anonymousClass2.label = 1;
            objInvoke = getHbTokenEventRequest.invoke(byteString, biddingSignals, anonymousClass2);
            if (objInvoke != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            this = (HandleAndroidGetTokenRequest) anonymousClass2.L$0;
            t9.e.z(objInvoke);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(objInvoke);
                return objInvoke;
            }
            this = (HandleAndroidGetTokenRequest) anonymousClass2.L$0;
            t9.e.z(objInvoke);
        }
        RequestPolicy requestPolicyInvoke = this.getRequestPolicy.invoke();
        GatewayClient gatewayClient = this.gatewayClient;
        OperationType operationType = OperationType.GET_TOKEN;
        anonymousClass2.L$0 = null;
        anonymousClass2.label = 3;
        objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, (UniversalRequestOuterClass.UniversalRequest) objInvoke, requestPolicyInvoke, operationType, anonymousClass2, 1, null);
        if (objRequest$default != aVar) {
            return aVar;
        }
        return objRequest$default;
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setGetTokenEventRequest((GetTokenEventRequestOuterClass.GetTokenEventRequest) objInvoke);
        UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.getUniversalRequestForPayLoad;
        anonymousClass2.L$0 = this;
        anonymousClass2.label = 2;
        objInvoke = getUniversalRequestForPayLoad.invoke(payload_build, anonymousClass2);
        if (objInvoke != aVar) {
            RequestPolicy requestPolicyInvoke2 = this.getRequestPolicy.invoke();
            GatewayClient gatewayClient2 = this.gatewayClient;
            OperationType operationType2 = OperationType.GET_TOKEN;
            anonymousClass2.L$0 = null;
            anonymousClass2.label = 3;
            objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, (UniversalRequestOuterClass.UniversalRequest) objInvoke, requestPolicyInvoke2, operationType2, anonymousClass2, 1, null);
            if (objRequest$default != aVar) {
                return objRequest$default;
            }
        }
        return aVar;
    }
}
