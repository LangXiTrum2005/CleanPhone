package com.unity3d.ads.core.domain;

import ak.f;
import an.h;
import android.content.Context;
import bn.d;
import bn.e;
import ck.c;
import cn.d0;
import com.google.protobuf.ByteString;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.UnityAdsErrorKt;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.banners.UnityBannerSize;
import fn.a1;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wj.r;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ]2\u00020\u0001:\u0001]BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u00162\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00010\u00162\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020+2\u0006\u0010%\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J3\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016042\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J!\u0010<\u001a\u00020)2\u0006\u0010%\u001a\u00020\u00162\b\b\u0002\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b>\u0010?JC\u0010F\u001a\u00020+2\u0006\u0010A\u001a\u00020@2\b\u0010B\u001a\u0004\u0018\u00010\u00162\u0006\u0010C\u001a\u00020 2\b\u0010E\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0086Bø\u0001\u0000¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010HR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010IR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010JR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010KR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010LR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010NR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010OR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010PR\u0016\u0010Q\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\u0018\u0010T\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010B\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010XR\u0016\u0010C\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010\\\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006^"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyLoadUseCase;", "", "Lcom/unity3d/ads/core/domain/Load;", "load", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getInitializationState", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "awaitInitialization", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "cleanUpWhenOpportunityExpires", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/Load;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/AwaitInitialization;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;Lcom/unity3d/ads/core/log/Logger;)V", "", "adMarkup", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "getHeaderBiddingAdMarkup", "(Ljava/lang/String;)Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "Lcom/unity3d/services/banners/UnityBannerSize;", "bannerSize", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "getBannerSize", "(Lcom/unity3d/services/banners/UnityBannerSize;)Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "Lcom/unity3d/ads/UnityAdsLoadOptions;", "unityAdsLoadOptions", "getOpportunityId", "(Lcom/unity3d/ads/UnityAdsLoadOptions;)Ljava/lang/String;", "getAdMarkup", "opportunityId", "Lbn/e;", "loadStart", "(Ljava/lang/String;)Lbn/e;", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lwj/r;", "loadSuccess", "(Lcom/unity3d/ads/core/data/model/AdObject;)V", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "loadResult", "loadFailure", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/LoadResult$Failure;)V", "reason", "reasonDebug", "", "getTags", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getAdType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "", "isScarAd", "getTmpAdObject", "(Ljava/lang/String;Z)Lcom/unity3d/ads/core/data/model/AdObject;", "getAdInfoString", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "placement", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/core/domain/InternalLoadListener;", "unityLoadListener", "invoke", "(Landroid/content/Context;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/unity3d/ads/core/domain/InternalLoadListener;Lcom/unity3d/services/banners/UnityBannerSize;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/Load;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "Lcom/unity3d/ads/core/log/Logger;", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "Z", X3.f27663w, "listener", "Lcom/unity3d/ads/core/domain/InternalLoadListener;", "startTime", "Lbn/e;", "Ljava/lang/String;", "Lcom/google/protobuf/ByteString;", "opportunity", "Lcom/google/protobuf/ByteString;", "Lcom/unity3d/ads/UnityAdsLoadOptions;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class LegacyLoadUseCase {
    public static final String KEY_AD_MARKUP = "adMarkup";
    public static final String KEY_OBJECT_ID = "objectId";
    private String adMarkup;
    private final AdRepository adRepository;
    private final AwaitInitialization awaitInitialization;
    private final CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires;
    private final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    private InternalLoadListener listener;
    private final Load load;
    private UnityAdsLoadOptions loadOptions;
    private final Logger logger;
    private ByteString opportunity;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private e startTime;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @ck.e(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase", f = "LegacyLoadUseCase.kt", l = {InterfaceC0435l1.d.b.f29108e}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyLoadUseCase.this.invoke(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadFailure$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C07661 extends o implements jk.a {
        final /* synthetic */ LoadResult.Failure $loadResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07661(LoadResult.Failure failure) {
            super(0);
            this.$loadResult = failure;
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3225invoke();
            return r.f53297a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3225invoke() {
            InternalLoadListener internalLoadListener = LegacyLoadUseCase.this.listener;
            if (internalLoadListener != null) {
                int number = this.$loadResult.getError().getNumber();
                String message = this.$loadResult.getMessage();
                if (message == null) {
                    message = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
                }
                internalLoadListener.onAdLoadFail(new UnityAdsError(number, message));
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadSuccess$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C07671 extends o implements jk.a {
        final /* synthetic */ AdObject $adObject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07671(AdObject adObject) {
            super(0);
            this.$adObject = adObject;
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3226invoke();
            return r.f53297a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3226invoke() {
            InternalLoadListener internalLoadListener = LegacyLoadUseCase.this.listener;
            if (internalLoadListener != null) {
                internalLoadListener.onAdLoaded(this.$adObject);
            }
        }
    }

    public LegacyLoadUseCase(Load load, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, AdRepository adRepository, SafeCallbackInvoke safeCallbackInvoke, CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires, Logger logger) {
        n.f(load, "load");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(getInitializationState, "getInitializationState");
        n.f(awaitInitialization, "awaitInitialization");
        n.f(sessionRepository, "sessionRepository");
        n.f(adRepository, "adRepository");
        n.f(safeCallbackInvoke, "safeCallbackInvoke");
        n.f(cleanUpWhenOpportunityExpires, "cleanUpWhenOpportunityExpires");
        n.f(logger, "logger");
        this.load = load;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.adRepository = adRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.cleanUpWhenOpportunityExpires = cleanUpWhenOpportunityExpires;
        this.logger = logger;
    }

    private final String getAdInfoString(String opportunityId) {
        return q4.a.j(new StringBuilder("for placement "), this.placement, " with instance id ", opportunityId);
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object objOpt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (objOpt = data.opt("adMarkup")) == null) {
            return null;
        }
        return objOpt.toString();
    }

    private final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.isBanner ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final AdRequestOuterClass.BannerSize getBannerSize(UnityBannerSize bannerSize) {
        if (bannerSize == null) {
            return null;
        }
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.INSTANCE;
        AdRequestOuterClass.BannerSize.Builder builderNewBuilder = AdRequestOuterClass.BannerSize.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        BannerSizeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setWidth(bannerSize.getWidth());
        dsl_create.setHeight(bannerSize.getHeight());
        return dsl_create._build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(String adMarkup) {
        if (adMarkup == null || h.y0(adMarkup)) {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
        }
        try {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(ProtobufExtensionsKt.fromBase64$default(adMarkup, false, 1, null).toByteArray());
        } catch (Exception unused) {
            return null;
        }
    }

    private final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object objOpt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (objOpt = data.opt("objectId")) == null) {
            return null;
        }
        return objOpt.toString();
    }

    private final Map<String, String> getTags(String reason, String reasonDebug) {
        wj.f fVar = new wj.f("state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        wj.f fVar2 = new wj.f("operation", OperationType.LOAD.toString());
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null) {
            n.l(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
            throw null;
        }
        LinkedHashMap linkedHashMapR = b0.R(fVar, fVar2, new wj.f("new_api", String.valueOf(unityAdsLoadOptions.loadConfiguration != null)));
        if (reason != null && reason.length() != 0) {
            linkedHashMapR.put("reason", reason);
        }
        if (reasonDebug != null && reasonDebug.length() != 0) {
            linkedHashMapR.put("reason_debug", reasonDebug);
        }
        return linkedHashMapR;
    }

    public static /* synthetic */ Map getTags$default(LegacyLoadUseCase legacyLoadUseCase, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final AdObject getTmpAdObject(String opportunityId, boolean isScarAd) {
        SendDiagnosticEvent.Companion companion = SendDiagnosticEvent.INSTANCE;
        UUID uuidFromString = UUID.fromString(opportunityId);
        n.e(uuidFromString, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(uuidFromString);
        String str = this.placement;
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions != null) {
            return companion.getTmpAdObjectForEventSending(byteString, str, this.isHeaderBidding, unityAdsLoadOptions, getAdType(), isScarAd);
        }
        n.l(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        throw null;
    }

    public static /* synthetic */ AdObject getTmpAdObject$default(LegacyLoadUseCase legacyLoadUseCase, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return legacyLoadUseCase.getTmpAdObject(str, z10);
    }

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, f fVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, internalLoadListener, unityBannerSize, fVar);
    }

    private final void loadFailure(String opportunityId, LoadResult.Failure loadResult) {
        Logger.DefaultImpls.error$default(this.logger, "Failed to load ad " + getAdInfoString(opportunityId) + ", error: " + loadResult.getError() + " :: " + loadResult.getMessage(), null, 2, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FAILURE_TIME;
        e eVar = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, eVar != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(eVar)) : null, getTags(loadResult.getReason(), loadResult.getReasonDebug()), (Map) null, getTmpAdObject(opportunityId, loadResult.isScarAd()), (Integer) null, 40, (Object) null);
        this.safeCallbackInvoke.invoke(new C07661(loadResult));
    }

    private final e loadStart(String opportunityId) {
        long jB = d.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED, (Double) null, getTags$default(this, null, null, 3, null), (Map) null, getTmpAdObject$default(this, opportunityId, false, 2, null), (Integer) null, 42, (Object) null);
        return new bn.f(jB);
    }

    private final void loadSuccess(AdObject adObject) {
        this.logger.info("Successfully loaded ad " + getAdInfoString(ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString()));
        ((a1) adObject.getState()).d0(AdObjectState.LOADED);
        this.cleanUpWhenOpportunityExpires.invoke(adObject);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_SUCCESS_TIME;
        e eVar = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, eVar != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(eVar)) : null, getTags$default(this, null, null, 3, null), (Map) null, adObject, (Integer) null, 40, (Object) null);
        this.safeCallbackInvoke.invoke(new C07671(adObject));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object invoke(Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, InternalLoadListener internalLoadListener, UnityBannerSize unityBannerSize, f fVar) {
        AnonymousClass1 anonymousClass1;
        Throwable th2;
        String str2;
        Throwable th3;
        LegacyLoadUseCase legacyLoadUseCase = this;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = legacyLoadUseCase.new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = legacyLoadUseCase.new AnonymousClass1(fVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        int i11 = anonymousClass2.label;
        if (i11 == 0) {
            t9.e.z(obj);
            String opportunityId = legacyLoadUseCase.getOpportunityId(unityAdsLoadOptions);
            if (opportunityId == null) {
                opportunityId = UUID.randomUUID().toString();
                n.e(opportunityId, "randomUUID().toString()");
            }
            legacyLoadUseCase.logger.info("Load invoked for placement: " + str + " with instance id: " + opportunityId);
            long loadTimeoutMs = (long) legacyLoadUseCase.sessionRepository.getNativeConfiguration().getAdOperations().getLoadTimeoutMs();
            AdRequestOuterClass.BannerSize bannerSize = legacyLoadUseCase.getBannerSize(unityBannerSize);
            legacyLoadUseCase.loadOptions = unityAdsLoadOptions;
            String adMarkup = legacyLoadUseCase.getAdMarkup(unityAdsLoadOptions);
            legacyLoadUseCase.adMarkup = adMarkup;
            legacyLoadUseCase.isHeaderBidding = !(adMarkup == null || h.y0(adMarkup));
            legacyLoadUseCase.isBanner = unityBannerSize != null;
            legacyLoadUseCase.listener = internalLoadListener;
            legacyLoadUseCase.placement = str;
            legacyLoadUseCase.startTime = legacyLoadUseCase.loadStart(opportunityId);
            try {
                LegacyLoadUseCase$invoke$loadResult$1 legacyLoadUseCase$invoke$loadResult$1 = new LegacyLoadUseCase$invoke$loadResult$1(opportunityId, legacyLoadUseCase, context, str, bannerSize, unityAdsLoadOptions, null);
                anonymousClass2.L$0 = legacyLoadUseCase;
                anonymousClass2.L$1 = opportunityId;
                anonymousClass2.label = 1;
                Object objK = d0.K(loadTimeoutMs, legacyLoadUseCase$invoke$loadResult$1, anonymousClass2);
                bk.a aVar = bk.a.f5708a;
                if (objK == aVar) {
                    return aVar;
                }
                str2 = opportunityId;
                obj = objK;
            } catch (Throwable th4) {
                th2 = th4;
                str2 = opportunityId;
                legacyLoadUseCase.loadFailure(str2, new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th2, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th2, 0, 1, null), false, 32, null));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) anonymousClass2.L$1;
            LegacyLoadUseCase legacyLoadUseCase2 = (LegacyLoadUseCase) anonymousClass2.L$0;
            try {
                t9.e.z(obj);
                str2 = str3;
                legacyLoadUseCase = legacyLoadUseCase2;
            } catch (Throwable th5) {
                th3 = th5;
                str2 = str3;
                legacyLoadUseCase = legacyLoadUseCase2;
                th2 = th3;
                legacyLoadUseCase.loadFailure(str2, new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th2, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th2, 0, 1, null), false, 32, null));
                return r.f53297a;
            }
        }
        try {
            LoadResult failure = (LoadResult) obj;
            if (failure == null) {
                failure = new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT, UnityAdsErrorKt.MSG_BOLD_LOAD_FAIL_TIME_OUT, null, "timeout", null, false, 52, null);
            }
            if (failure instanceof LoadResult.Success) {
                legacyLoadUseCase.loadSuccess(((LoadResult.Success) failure).getAdObject());
            } else if (failure instanceof LoadResult.Failure) {
                legacyLoadUseCase.loadFailure(str2, (LoadResult.Failure) failure);
            }
        } catch (Throwable th6) {
            th3 = th6;
            th2 = th3;
            legacyLoadUseCase.loadFailure(str2, new LoadResult.Failure(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_UNSPECIFIED, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th2, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th2, 0, 1, null), false, 32, null));
        }
        return r.f53297a;
    }
}
