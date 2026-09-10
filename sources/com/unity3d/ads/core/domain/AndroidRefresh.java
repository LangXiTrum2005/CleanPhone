package com.unity3d.ads.core.domain;

import ak.f;
import ck.c;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.w;
import com.google.protobuf.ByteString;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidRefresh;", "Lcom/unity3d/ads/core/domain/Refresh;", "Lcn/w;", "defaultDispatcher", "Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;", "getAdDataRefreshRequest", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "<init>", "(Lcn/w;Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;)V", "Lcom/google/protobuf/ByteString;", "opportunityId", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "invoke", "(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lak/f;)Ljava/lang/Object;", "Lcn/w;", "Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidRefresh implements Refresh {
    private final w defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdDataRefreshRequest getAdDataRefreshRequest;
    private final GetRequestPolicy getRequestPolicy;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidRefresh$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidRefresh", f = "AndroidRefresh.kt", l = {25}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidRefresh.this.invoke(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidRefresh$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcn/a0;", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lcn/a0;)Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidRefresh$invoke$2", f = "AndroidRefresh.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements jk.c {
        final /* synthetic */ ByteString $adDataRefreshToken;
        final /* synthetic */ ByteString $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ByteString byteString, ByteString byteString2, f fVar) {
            super(2, fVar);
            this.$adDataRefreshToken = byteString;
            this.$opportunityId = byteString2;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidRefresh.this.new AnonymousClass2(this.$adDataRefreshToken, this.$opportunityId, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r13 == r3) goto L15;
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
                if (r0 == 0) goto L1c
                if (r0 == r2) goto L18
                if (r0 != r1) goto L10
                t9.e.z(r13)
                goto L54
            L10:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L18:
                t9.e.z(r13)
                goto L32
            L1c:
                t9.e.z(r13)
                com.unity3d.ads.core.domain.AndroidRefresh r13 = com.unity3d.ads.core.domain.AndroidRefresh.this
                com.unity3d.ads.core.domain.GetAdDataRefreshRequest r13 = com.unity3d.ads.core.domain.AndroidRefresh.access$getGetAdDataRefreshRequest$p(r13)
                com.google.protobuf.ByteString r0 = r12.$adDataRefreshToken
                com.google.protobuf.ByteString r4 = r12.$opportunityId
                r12.label = r2
                java.lang.Object r13 = r13.invoke(r0, r4, r12)
                if (r13 != r3) goto L32
                goto L53
            L32:
                r6 = r13
                gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6
                com.unity3d.ads.core.domain.AndroidRefresh r13 = com.unity3d.ads.core.domain.AndroidRefresh.this
                com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.AndroidRefresh.access$getGetRequestPolicy$p(r13)
                com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                com.unity3d.ads.core.domain.AndroidRefresh r13 = com.unity3d.ads.core.domain.AndroidRefresh.this
                com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.AndroidRefresh.access$getGatewayClient$p(r13)
                com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.REFRESH
                r12.label = r1
                r5 = 0
                r10 = 1
                r11 = 0
                r9 = r12
                java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r3) goto L54
            L53:
                return r3
            L54:
                gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
                gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse$Payload r12 = r13.getPayload()
                gatewayprotocol.v1.AdDataRefreshResponseOuterClass$AdDataRefreshResponse r12 = r12.getAdDataRefreshResponse()
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidRefresh.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidRefresh(w defaultDispatcher, GetAdDataRefreshRequest getAdDataRefreshRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(getAdDataRefreshRequest, "getAdDataRefreshRequest");
        n.f(getRequestPolicy, "getRequestPolicy");
        n.f(gatewayClient, "gatewayClient");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdDataRefreshRequest = getAdDataRefreshRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.Refresh
    public Object invoke(ByteString byteString, ByteString byteString2, f fVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
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
        Object objJ = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t9.e.z(objJ);
            w wVar = this.defaultDispatcher;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(byteString2, byteString, null);
            anonymousClass1.label = 1;
            objJ = d0.J(wVar, anonymousClass2, anonymousClass1);
            bk.a aVar = bk.a.f5708a;
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(objJ);
        }
        n.e(objJ, "override suspend fun inv…RefreshResponse\n        }");
        return objJ;
    }
}
