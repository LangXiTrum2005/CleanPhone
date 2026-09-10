package com.unity3d.ads.core.domain.scar;

import ak.f;
import bk.a;
import bn.d;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.g;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096Bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/AndroidFetchSignalsAndSendUseCase;", "Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;", "Lcn/a0;", "scope", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "scarManager", "Lcom/unity3d/ads/core/domain/scar/HandleGetTokenRequest;", "handleGetTokenRequest", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;", "scarEligibleEffectiveUseCase", "<init>", "(Lcn/a0;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/domain/scar/HandleGetTokenRequest;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;)V", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "formats", "", "", "getTags", "(Ljava/util/List;)Ljava/util/Map;", "", "tokenNumber", "Lcom/google/protobuf/ByteString;", "tokenId", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "Lwj/r;", "invoke", "(ILcom/google/protobuf/ByteString;Lcom/unity3d/ads/TokenConfiguration;Lak/f;)Ljava/lang/Object;", "Lcn/a0;", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "Lcom/unity3d/ads/core/domain/scar/HandleGetTokenRequest;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidFetchSignalsAndSendUseCase implements FetchSignalsAndSendUseCase {
    private final HandleGetTokenRequest handleGetTokenRequest;
    private final ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;
    private final ScarManager scarManager;
    private final a0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2", f = "AndroidFetchSignalsAndSendUseCase.kt", l = {DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        final /* synthetic */ TokenConfiguration $tokenConfiguration;
        final /* synthetic */ ByteString $tokenId;
        final /* synthetic */ int $tokenNumber;
        long J$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TokenConfiguration tokenConfiguration, int i10, ByteString byteString, f fVar) {
            super(2, fVar);
            this.$tokenConfiguration = tokenConfiguration;
            this.$tokenNumber = i10;
            this.$tokenId = byteString;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidFetchSignalsAndSendUseCase.this.new AnonymousClass2(this.$tokenConfiguration, this.$tokenNumber, this.$tokenId, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code duplicated, block: B:51:0x010f  */
        /* JADX WARN: Code duplicated, block: B:58:0x011e  */
        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            long jB;
            List<AdFormatOuterClass.AdFormat> list;
            Object signals;
            List<AdFormatOuterClass.AdFormat> list2;
            long j10;
            Object objInvoke;
            UniversalResponseOuterClass.UniversalResponse universalResponse;
            String str;
            int i10 = this.label;
            r rVar = r.f53297a;
            a aVar = a.f5708a;
            try {
                try {
                    if (i10 == 0) {
                        t9.e.z(obj);
                        jB = d.b();
                        List<AdFormatOuterClass.AdFormat> listInvoke = AndroidFetchSignalsAndSendUseCase.this.scarEligibleEffectiveUseCase.invoke(this.$tokenConfiguration);
                        if (!listInvoke.isEmpty()) {
                            SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, "native_scar_signals_collection_started", (Double) null, (Map) null, (Map) null, (AdObject) null, new Integer(this.$tokenNumber), 30, (Object) null);
                            try {
                                ScarManager scarManager = AndroidFetchSignalsAndSendUseCase.this.scarManager;
                                this.L$0 = listInvoke;
                                this.J$0 = jB;
                                this.label = 1;
                                signals = scarManager.getSignals(listInvoke, this);
                                if (signals != aVar) {
                                    list = listInvoke;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                list = listInvoke;
                                signals = t9.e.c(th);
                            }
                            return aVar;
                        }
                        return rVar;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j10 = this.J$0;
                        list2 = (List) this.L$0;
                        try {
                            t9.e.z(obj);
                            objInvoke = obj;
                        } catch (Throwable th3) {
                            th = th3;
                            objInvoke = t9.e.c(th);
                        }
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) (objInvoke instanceof g ? null : objInvoke);
                        if (universalResponse != null || universalResponse.hasError()) {
                            str = "native_scar_signals_upload_failure_time";
                        } else {
                            str = "native_scar_signals_upload_success_time";
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, str, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(j10))), AndroidFetchSignalsAndSendUseCase.this.getTags(list2), (Map) null, (AdObject) null, new Integer(this.$tokenNumber), 24, (Object) null);
                        return rVar;
                    }
                    jB = this.J$0;
                    list = (List) this.L$0;
                    try {
                        t9.e.z(obj);
                        signals = obj;
                    } catch (Throwable th4) {
                        th = th4;
                        signals = t9.e.c(th);
                    }
                    if (signals instanceof g) {
                        signals = null;
                    }
                    BiddingSignals biddingSignals = (BiddingSignals) signals;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, biddingSignals != null ? "native_scar_signals_collection_success_time" : "native_scar_signals_collection_failure_time", new Double(TimeExtensionsKt.elapsedMillis(new bn.f(jB))), AndroidFetchSignalsAndSendUseCase.this.getTags(list), (Map) null, (AdObject) null, new Integer(this.$tokenNumber), 24, (Object) null);
                    if (biddingSignals != null) {
                        long jB2 = d.b();
                        SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, "native_scar_signals_upload_started", (Double) null, (Map) null, (Map) null, (AdObject) null, new Integer(this.$tokenNumber), 30, (Object) null);
                        AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase = AndroidFetchSignalsAndSendUseCase.this;
                        ByteString byteString = this.$tokenId;
                        try {
                            HandleGetTokenRequest handleGetTokenRequest = androidFetchSignalsAndSendUseCase.handleGetTokenRequest;
                            this.L$0 = list;
                            this.J$0 = jB2;
                            this.label = 2;
                            objInvoke = handleGetTokenRequest.invoke(byteString, biddingSignals, this);
                            if (objInvoke != aVar) {
                                list2 = list;
                                j10 = jB2;
                                universalResponse = (UniversalResponseOuterClass.UniversalResponse) (objInvoke instanceof g ? null : objInvoke);
                                if (universalResponse != null) {
                                    str = "native_scar_signals_upload_failure_time";
                                } else {
                                    str = "native_scar_signals_upload_failure_time";
                                }
                                SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, str, new Double(TimeExtensionsKt.elapsedMillis(new bn.f(j10))), AndroidFetchSignalsAndSendUseCase.this.getTags(list2), (Map) null, (AdObject) null, new Integer(this.$tokenNumber), 24, (Object) null);
                                return rVar;
                            }
                            return aVar;
                        } catch (Throwable th5) {
                            th = th5;
                            list2 = list;
                            j10 = jB2;
                            objInvoke = t9.e.c(th);
                        }
                    }
                    return rVar;
                } catch (CancellationException e10) {
                    throw e10;
                }
            } catch (CancellationException e11) {
                throw e11;
            }
        }
    }

    public AndroidFetchSignalsAndSendUseCase(a0 scope, ScarManager scarManager, HandleGetTokenRequest handleGetTokenRequest, SendDiagnosticEvent sendDiagnosticEvent, ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase) {
        n.f(scope, "scope");
        n.f(scarManager, "scarManager");
        n.f(handleGetTokenRequest, "handleGetTokenRequest");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(scarEligibleEffectiveUseCase, "scarEligibleEffectiveUseCase");
        this.scope = scope;
        this.scarManager = scarManager;
        this.handleGetTokenRequest = handleGetTokenRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.scarEligibleEffectiveUseCase = scarEligibleEffectiveUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(List<? extends AdFormatOuterClass.AdFormat> formats) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (formats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER)) {
            linkedHashMap.put("banner", com.ironsource.mediationsdk.metadata.a.f29610g);
        }
        if (formats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED)) {
            linkedHashMap.put("rewarded", com.ironsource.mediationsdk.metadata.a.f29610g);
        }
        if (formats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL)) {
            linkedHashMap.put("interstitial", com.ironsource.mediationsdk.metadata.a.f29610g);
        }
        return linkedHashMap;
    }

    @Override // com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase
    public Object invoke(int i10, ByteString byteString, TokenConfiguration tokenConfiguration, f fVar) {
        d0.w(this.scope, null, new AnonymousClass2(tokenConfiguration, i10, byteString, null), 3);
        return r.f53297a;
    }
}
