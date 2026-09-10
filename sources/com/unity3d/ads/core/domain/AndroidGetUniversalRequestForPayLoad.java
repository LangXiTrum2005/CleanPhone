package com.unity3d.ads.core.domain;

import ak.f;
import ck.c;
import ck.e;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "getUniversalRequestSharedData", "<init>", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;)V", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "payload", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "invoke", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidGetUniversalRequestForPayLoad implements GetUniversalRequestForPayLoad {
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad", f = "AndroidGetUniversalRequestForPayLoad.kt", l = {14}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetUniversalRequestForPayLoad.this.invoke(null, this);
        }
    }

    public AndroidGetUniversalRequestForPayLoad(GetUniversalRequestSharedData getUniversalRequestSharedData) {
        n.f(getUniversalRequestSharedData, "getUniversalRequestSharedData");
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad
    public Object invoke(UniversalRequestOuterClass.UniversalRequest.Payload payload, f fVar) {
        AnonymousClass1 anonymousClass1;
        UniversalRequestOuterClass.UniversalRequest.Payload payload2;
        UniversalRequestKt.Dsl dsl;
        UniversalRequestKt.Dsl dsl2;
        UniversalRequestKt.Dsl dsl3;
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
        Object obj = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t9.e.z(obj);
            UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.INSTANCE;
            UniversalRequestOuterClass.UniversalRequest.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.newBuilder();
            n.e(builderNewBuilder, "newBuilder()");
            UniversalRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
            GetUniversalRequestSharedData getUniversalRequestSharedData = this.getUniversalRequestSharedData;
            anonymousClass1.L$0 = payload;
            anonymousClass1.L$1 = dsl_create;
            anonymousClass1.L$2 = dsl_create;
            anonymousClass1.L$3 = dsl_create;
            anonymousClass1.label = 1;
            Object objInvoke = getUniversalRequestSharedData.invoke(anonymousClass1);
            bk.a aVar = bk.a.f5708a;
            if (objInvoke == aVar) {
                return aVar;
            }
            payload2 = payload;
            dsl = dsl_create;
            dsl2 = dsl;
            obj = objInvoke;
            dsl3 = dsl2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl3 = (UniversalRequestKt.Dsl) anonymousClass1.L$3;
            dsl = (UniversalRequestKt.Dsl) anonymousClass1.L$2;
            dsl2 = (UniversalRequestKt.Dsl) anonymousClass1.L$1;
            payload2 = (UniversalRequestOuterClass.UniversalRequest.Payload) anonymousClass1.L$0;
            t9.e.z(obj);
        }
        dsl3.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) obj);
        dsl.setPayload(payload2);
        return dsl2._build();
    }
}
