package com.unity3d.ads.core.domain;

import ak.f;
import android.content.Context;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.w;
import com.google.protobuf.ByteString;
import com.ironsource.X3;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010$J7\u00100\u001a\u00020/2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101JE\u00109\u001a\u0002082\u0006\u00103\u001a\u0002022\u0006\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&2\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010.\u001a\u00020-H\u0096Bø\u0001\u0000¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010BR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010CR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010D\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidLoad;", "Lcom/unity3d/ads/core/domain/Load;", "Lcn/w;", "defaultDispatcher", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "getAdRequest", "Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "getAdPlayerConfigRequest", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "handleGatewayAdResponse", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "validateExtrasSize", "<init>", "(Lcn/w;Lcom/unity3d/ads/core/domain/GetAdRequest;Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/ValidateExtrasSize;)V", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "e", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "handleGatewayException", "(Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;)Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "failure", "", "isCachePhaseFailure", "(Lcom/unity3d/ads/core/data/model/LoadResult$Failure;)Z", X3.f27663w, "Lwj/r;", "incrementLoadRequestCount", "(Z)V", "incrementLoadRequestAdmCount", "Lcom/google/protobuf/ByteString;", "opportunityId", "", "placement", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/core/data/model/AdObject;", "getTmpAdObject", "(Lcom/google/protobuf/ByteString;Ljava/lang/String;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lcom/unity3d/ads/UnityAdsLoadOptions;)Lcom/unity3d/ads/core/data/model/AdObject;", "Landroid/content/Context;", "context", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "headerBiddingAdMarkup", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "bannerSize", "Lcom/unity3d/ads/core/data/model/LoadResult;", "invoke", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/UnityAdsLoadOptions;Lak/f;)Ljava/lang/Object;", "Lcn/w;", "Lcom/unity3d/ads/core/domain/GetAdRequest;", "Lcom/unity3d/ads/core/domain/GetAdPlayerConfigRequest;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/ValidateExtrasSize;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidLoad implements Load {
    private final AdRepository adRepository;
    private final w defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    private final GetAdRequest getAdRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final ValidateExtrasSize validateExtrasSize;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidLoad$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lcom/unity3d/ads/core/data/model/LoadResult;", "<anonymous>", "(Lcn/a0;)Lcom/unity3d/ads/core/data/model/LoadResult;"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", l = {96, 100, 117, 121, 161}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
        final /* synthetic */ Context $context;
        final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ String $placement;
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        final /* synthetic */ AndroidLoad this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdRequestOuterClass.BannerSize bannerSize, AndroidLoad androidLoad, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, UnityAdsLoadOptions unityAdsLoadOptions, Context context, f fVar) {
            super(2, fVar);
            this.$bannerSize = bannerSize;
            this.this$0 = androidLoad;
            this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
            this.$opportunityId = byteString;
            this.$placement = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$context = context;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$bannerSize, this.this$0, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17181. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
            */
        @Override // ck.a
        public final java.lang.Object invokeSuspend(java.lang.Object r41) {
            /*
                Method dump skipped, instruction units count: 1718
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidLoad.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidLoad(w defaultDispatcher, GetAdRequest getAdRequest, GetAdPlayerConfigRequest getAdPlayerConfigRequest, GetRequestPolicy getRequestPolicy, HandleGatewayAdResponse handleGatewayAdResponse, SessionRepository sessionRepository, GatewayClient gatewayClient, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, ValidateExtrasSize validateExtrasSize) {
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(getAdRequest, "getAdRequest");
        n.f(getAdPlayerConfigRequest, "getAdPlayerConfigRequest");
        n.f(getRequestPolicy, "getRequestPolicy");
        n.f(handleGatewayAdResponse, "handleGatewayAdResponse");
        n.f(sessionRepository, "sessionRepository");
        n.f(gatewayClient, "gatewayClient");
        n.f(adRepository, "adRepository");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(validateExtrasSize, "validateExtrasSize");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.validateExtrasSize = validateExtrasSize;
    }

    public static final /* synthetic */ AdRepository access$getAdRepository$p(AndroidLoad androidLoad) {
        return androidLoad.adRepository;
    }

    public static final /* synthetic */ GatewayClient access$getGatewayClient$p(AndroidLoad androidLoad) {
        return androidLoad.gatewayClient;
    }

    public static final /* synthetic */ GetAdPlayerConfigRequest access$getGetAdPlayerConfigRequest$p(AndroidLoad androidLoad) {
        return androidLoad.getAdPlayerConfigRequest;
    }

    public static final /* synthetic */ GetAdRequest access$getGetAdRequest$p(AndroidLoad androidLoad) {
        return androidLoad.getAdRequest;
    }

    public static final /* synthetic */ GetRequestPolicy access$getGetRequestPolicy$p(AndroidLoad androidLoad) {
        return androidLoad.getRequestPolicy;
    }

    public static final /* synthetic */ HandleGatewayAdResponse access$getHandleGatewayAdResponse$p(AndroidLoad androidLoad) {
        return androidLoad.handleGatewayAdResponse;
    }

    public static final /* synthetic */ SendDiagnosticEvent access$getSendDiagnosticEvent$p(AndroidLoad androidLoad) {
        return androidLoad.sendDiagnosticEvent;
    }

    public static final /* synthetic */ SessionRepository access$getSessionRepository$p(AndroidLoad androidLoad) {
        return androidLoad.sessionRepository;
    }

    public static final /* synthetic */ AdObject access$getTmpAdObject(AndroidLoad androidLoad, ByteString byteString, String str, boolean z10, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, UnityAdsLoadOptions unityAdsLoadOptions) {
        return androidLoad.getTmpAdObject(byteString, str, z10, diagnosticAdType, unityAdsLoadOptions);
    }

    public static final /* synthetic */ ValidateExtrasSize access$getValidateExtrasSize$p(AndroidLoad androidLoad) {
        return androidLoad.validateExtrasSize;
    }

    public static final /* synthetic */ LoadResult.Failure access$handleGatewayException(AndroidLoad androidLoad, UnityAdsNetworkException unityAdsNetworkException) {
        return androidLoad.handleGatewayException(unityAdsNetworkException);
    }

    public static final /* synthetic */ void access$incrementLoadRequestAdmCount(AndroidLoad androidLoad, boolean z10) {
        androidLoad.incrementLoadRequestAdmCount(z10);
    }

    public static final /* synthetic */ void access$incrementLoadRequestCount(AndroidLoad androidLoad, boolean z10) {
        androidLoad.incrementLoadRequestCount(z10);
    }

    public static final /* synthetic */ boolean access$isCachePhaseFailure(AndroidLoad androidLoad, LoadResult.Failure failure) {
        return androidLoad.isCachePhaseFailure(failure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(ByteString opportunityId, String placement, boolean isHeaderBidding, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, UnityAdsLoadOptions loadOptions) {
        return SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending$default(SendDiagnosticEvent.INSTANCE, opportunityId, placement, isHeaderBidding, loadOptions, adType, false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadResult.Failure handleGatewayException(UnityAdsNetworkException e10) {
        ErrorOuterClass.PublicErrorCode errorCode;
        String loadErrorMsg;
        ErrorOuterClass.PublicErrorCode errorCode2;
        boolean z10 = e10 instanceof NetworkTimeoutException;
        if (z10) {
            errorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT;
        } else if (!(e10 instanceof GatewayException) || (errorCode = ((GatewayException) e10).getErrorCode()) == null) {
            errorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK;
        }
        ErrorOuterClass.PublicErrorCode publicErrorCode = errorCode;
        if (z10) {
            loadErrorMsg = UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_TIME_OUT;
        } else if (!(e10 instanceof GatewayException) || (errorCode2 = ((GatewayException) e10).getErrorCode()) == null || (loadErrorMsg = UnityAdsErrorKt.getLoadErrorMsg(errorCode2)) == null) {
            loadErrorMsg = UnityAdsErrorKt.getLoadErrorMsg(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_LOAD_NETWORK);
        }
        return new LoadResult.Failure(publicErrorCode, loadErrorMsg, e10, z10 ? "timeout" : "gateway", e10.getMessage(), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean isBanner) {
        if (isBanner) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean isBanner) {
        if (isBanner) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCachePhaseFailure(LoadResult.Failure failure) {
        String reason = failure.getReason();
        int iHashCode = reason.hashCode();
        if (iHashCode == -1131560769) {
            return reason.equals("no_webview_entry_point");
        }
        if (iHashCode != -952823001) {
            return iHashCode == -711698443 && reason.equals("adviewer");
        }
        return reason.equals("invalid_url");
    }

    @Override // com.unity3d.ads.core.domain.Load
    public Object invoke(Context context, String str, ByteString byteString, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, f fVar) {
        return d0.J(this.defaultDispatcher, new AnonymousClass2(bannerSize, this, headerBiddingAdMarkup, byteString, str, unityAdsLoadOptions, context, null), fVar);
    }
}
