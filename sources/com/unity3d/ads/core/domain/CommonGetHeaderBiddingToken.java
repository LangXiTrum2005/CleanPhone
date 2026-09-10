package com.unity3d.ads.core.domain;

import ak.f;
import ck.c;
import ck.e;
import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096Bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "buildHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;", "fetchSignalsAndSendUseCase", "Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;", "scarEligibleEffectiveUseCase", "<init>", "(Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;)V", "", "tokenNumber", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "", "invoke", "(ILcom/unity3d/ads/TokenConfiguration;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;", "Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {
    public static final String HB_TOKEN_VERSION = "2";
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;
    private final FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase;
    private final ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken", f = "CommonGetHeaderBiddingToken.kt", l = {15, 18}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        int I$0;
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
            return CommonGetHeaderBiddingToken.this.invoke(0, null, this);
        }
    }

    public CommonGetHeaderBiddingToken(BuildHeaderBiddingToken buildHeaderBiddingToken, FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase, ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase) {
        n.f(buildHeaderBiddingToken, "buildHeaderBiddingToken");
        n.f(fetchSignalsAndSendUseCase, "fetchSignalsAndSendUseCase");
        n.f(scarEligibleEffectiveUseCase, "scarEligibleEffectiveUseCase");
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
        this.fetchSignalsAndSendUseCase = fetchSignalsAndSendUseCase;
        this.scarEligibleEffectiveUseCase = scarEligibleEffectiveUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    public Object invoke(int i10, TokenConfiguration tokenConfiguration, f fVar) {
        AnonymousClass1 anonymousClass1;
        CommonGetHeaderBiddingToken commonGetHeaderBiddingToken;
        List<AdFormatOuterClass.AdFormat> list;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken2;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object obj = anonymousClass1.result;
        int i12 = anonymousClass1.label;
        bk.a aVar = bk.a.f5708a;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = anonymousClass1.I$0;
                list = (List) anonymousClass1.L$2;
                tokenConfiguration = (TokenConfiguration) anonymousClass1.L$1;
                commonGetHeaderBiddingToken = (CommonGetHeaderBiddingToken) anonymousClass1.L$0;
                t9.e.z(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                headerBiddingToken2 = (HeaderBiddingTokenOuterClass.HeaderBiddingToken) anonymousClass1.L$0;
                t9.e.z(obj);
            }
            headerBiddingToken = headerBiddingToken2;
            ByteString byteString = headerBiddingToken.toByteString();
            n.e(byteString, "rawToken.toByteString()");
            return defpackage.e.n("2:", ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null));
        }
        t9.e.z(obj);
        List<AdFormatOuterClass.AdFormat> listInvoke = this.scarEligibleEffectiveUseCase.invoke(tokenConfiguration);
        BuildHeaderBiddingToken buildHeaderBiddingToken = this.buildHeaderBiddingToken;
        boolean z10 = !listInvoke.isEmpty();
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = tokenConfiguration;
        anonymousClass1.L$2 = listInvoke;
        anonymousClass1.I$0 = i10;
        anonymousClass1.label = 1;
        Object objInvoke = buildHeaderBiddingToken.invoke(i10, tokenConfiguration, z10, anonymousClass1);
        if (objInvoke != aVar) {
            commonGetHeaderBiddingToken = this;
            list = listInvoke;
            obj = objInvoke;
        }
        return aVar;
        headerBiddingToken = (HeaderBiddingTokenOuterClass.HeaderBiddingToken) obj;
        if (!list.isEmpty()) {
            FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase = commonGetHeaderBiddingToken.fetchSignalsAndSendUseCase;
            ByteString tokenId = headerBiddingToken.getTokenId();
            n.e(tokenId, "rawToken.tokenId");
            anonymousClass1.L$0 = headerBiddingToken;
            anonymousClass1.L$1 = null;
            anonymousClass1.L$2 = null;
            anonymousClass1.label = 2;
            if (fetchSignalsAndSendUseCase.invoke(i10, tokenId, tokenConfiguration, anonymousClass1) != aVar) {
                headerBiddingToken2 = headerBiddingToken;
                headerBiddingToken = headerBiddingToken2;
            }
            return aVar;
        }
        ByteString byteString2 = headerBiddingToken.toByteString();
        n.e(byteString2, "rawToken.toByteString()");
        return defpackage.e.n("2:", ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null));
    }
}
