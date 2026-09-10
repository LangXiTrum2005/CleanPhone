package com.unity3d.ads.core.domain.events;

import ak.f;
import bk.a;
import ck.c;
import ck.e;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/events/CommonGetTransactionRequest;", "Lcom/unity3d/ads/core/domain/events/GetTransactionRequest;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;)V", "", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionData;", "transactionDataList", "", "googlePlayBillingLibraryVersion", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;", "transactionOrigin", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;", "invoke", "(Ljava/util/List;Ljava/lang/String;Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionOrigin;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonGetTransactionRequest implements GetTransactionRequest {
    private final DeviceInfoRepository deviceInfoRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.events.CommonGetTransactionRequest", f = "CommonGetTransactionRequest.kt", l = {21}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGetTransactionRequest.this.invoke(null, null, null, this);
        }
    }

    public CommonGetTransactionRequest(DeviceInfoRepository deviceInfoRepository) {
        n.f(deviceInfoRepository, "deviceInfoRepository");
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.events.GetTransactionRequest
    public Object invoke(List<TransactionEventRequestOuterClass.TransactionData> list, String str, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, f fVar) {
        AnonymousClass1 anonymousClass1;
        TransactionEventRequestKt.Dsl dsl_create;
        List<TransactionEventRequestOuterClass.TransactionData> list2;
        TransactionEventRequestKt.Dsl dsl;
        Object obj;
        CommonGetTransactionRequest commonGetTransactionRequest;
        TransactionEventRequestKt.Dsl dsl2;
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
        Object obj2 = anonymousClass1.result;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t9.e.z(obj2);
            TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.INSTANCE;
            TransactionEventRequestOuterClass.TransactionEventRequest.Builder builderNewBuilder = TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder();
            n.e(builderNewBuilder, "newBuilder()");
            dsl_create = companion._create(builderNewBuilder);
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = list;
            anonymousClass1.L$2 = str;
            anonymousClass1.L$3 = transactionOrigin;
            anonymousClass1.L$4 = dsl_create;
            anonymousClass1.L$5 = dsl_create;
            anonymousClass1.L$6 = dsl_create;
            anonymousClass1.label = 1;
            Object objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
            a aVar = a.f5708a;
            if (objStaticDeviceInfo == aVar) {
                return aVar;
            }
            list2 = list;
            dsl = dsl_create;
            obj = objStaticDeviceInfo;
            commonGetTransactionRequest = this;
            dsl2 = dsl;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl2 = (TransactionEventRequestKt.Dsl) anonymousClass1.L$6;
            dsl = (TransactionEventRequestKt.Dsl) anonymousClass1.L$5;
            TransactionEventRequestKt.Dsl dsl3 = (TransactionEventRequestKt.Dsl) anonymousClass1.L$4;
            transactionOrigin = (TransactionEventRequestOuterClass.TransactionOrigin) anonymousClass1.L$3;
            String str2 = (String) anonymousClass1.L$2;
            list2 = (List) anonymousClass1.L$1;
            commonGetTransactionRequest = (CommonGetTransactionRequest) anonymousClass1.L$0;
            t9.e.z(obj2);
            dsl_create = dsl3;
            str = str2;
            obj = obj2;
        }
        dsl2.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
        dsl.setDynamicDeviceInfo(commonGetTransactionRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl.setAppStore(TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY);
        dsl.setGooglePlayBillingLibraryVersion(str);
        dsl.setOrigin(transactionOrigin);
        dsl.addAllTransactionData(dsl.getTransactionData(), list2);
        return dsl_create._build();
    }
}
