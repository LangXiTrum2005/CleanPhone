package com.unity3d.ads.core.domain;

import ak.f;
import bn.d;
import ck.c;
import ck.e;
import ck.i;
import cn.a0;
import com.google.protobuf.ByteString;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.Ve;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.adload.WebViewLessLoadStrategy;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.n;
import wj.g;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J5\u00101\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/H\u0082@ø\u0001\u0000¢\u0006\u0004\b1\u00102JS\u0010>\u001a\u00020=2\u0006\u00104\u001a\u0002032\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\"2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0096Bø\u0001\u0000¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010ER\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010FR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010HR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010IR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010JR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010KR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010LR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010M\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayAdResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "getWebViewContainerUseCase", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "getWebViewBridge", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "getHandleInvocationsFromAdViewer", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "campaignRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "getLatestWebViewConfiguration", "Lcom/unity3d/ads/adplayer/AdPlayerScope;", "adPlayerScope", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "getAdPlayer", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "cacheWebViewAssets", "Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;", "webViewLessLoadStrategy", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;Lcom/unity3d/ads/adplayer/AdPlayerScope;Lcom/unity3d/ads/core/domain/GetAdPlayer;Lcom/unity3d/ads/core/domain/CacheWebViewAssets;Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "webViewUrl", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webviewContainer", "Lwj/r;", "loadUrl", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/String;Lcom/unity3d/ads/adplayer/WebViewContainer;Lak/f;)Ljava/lang/Object;", "", "t", "Lcom/google/protobuf/ByteString;", "opportunityId", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", Ve.f27442n, "Lcom/unity3d/ads/adplayer/AdPlayer;", "adPlayer", "cleanup", "(Ljava/lang/Throwable;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lcom/unity3d/ads/adplayer/AdPlayer;Lak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Landroid/content/Context;", "context", "placementId", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "forceWebViewLoad", "Lcom/unity3d/ads/core/data/model/LoadResult;", "invoke", "(Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Landroid/content/Context;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;ZZLak/f;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "Lcom/unity3d/ads/adplayer/AdPlayerScope;", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final WebViewLessLoadStrategy webViewLessLoadStrategy;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {279, 285}, m = "cleanup")
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
            return AndroidHandleGatewayAdResponse.this.cleanup(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {InterfaceC0435l1.d.b.f29107d, 128, 160, 176, 214, 215, 220, 246}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07601 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public C07601(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayAdResponse.this.invoke(null, null, null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "it", "Lwj/r;", "<anonymous>", "(Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", f = "AndroidHandleGatewayAdResponse.kt", l = {195}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements jk.c {
        final /* synthetic */ c0 $adPlayer;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c0 c0Var, f fVar) {
            super(2, fVar);
            this.$adPlayer = c0Var;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$adPlayer, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // jk.c
        public final Object invoke(AllowedPiiOuterClass.AllowedPii allowedPii, f fVar) {
            return ((AnonymousClass2) create(allowedPii, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                AllowedPiiOuterClass.AllowedPii allowedPii = (AllowedPiiOuterClass.AllowedPii) this.L$0;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f44760a;
                byte[] byteArray = allowedPii.toByteArray();
                n.e(byteArray, "it.toByteArray()");
                this.label = 1;
                Object objOnAllowedPiiChange = adPlayer.onAllowedPiiChange(byteArray, this);
                bk.a aVar = bk.a.f5708a;
                if (objOnAllowedPiiChange == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", f = "AndroidHandleGatewayAdResponse.kt", l = {221}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements jk.c {
        final /* synthetic */ c0 $adPlayer;
        final /* synthetic */ LoadEvent $loadEvent;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LoadEvent loadEvent, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, c0 c0Var, f fVar) {
            super(2, fVar);
            this.$loadEvent = loadEvent;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = c0Var;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass3(this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass3) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                Error error = new Error(((LoadEvent.Error) this.$loadEvent).getMessage());
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f44760a;
                this.label = 1;
                Object objCleanup = androidHandleGatewayAdResponse.cleanup(error, byteString, adResponse, adPlayer, this);
                bk.a aVar = bk.a.f5708a;
                if (objCleanup == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", f = "AndroidHandleGatewayAdResponse.kt", l = {247}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends i implements jk.c {
        final /* synthetic */ c0 $adPlayer;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        final /* synthetic */ CancellationException $t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, c0 c0Var, f fVar) {
            super(2, fVar);
            this.$t = cancellationException;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = c0Var;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass4(this.$t, this.$opportunityId, this.$response, this.$adPlayer, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass4) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                CancellationException cancellationException = this.$t;
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f44760a;
                this.label = 1;
                Object objCleanup = androidHandleGatewayAdResponse.cleanup(cancellationException, byteString, adResponse, adPlayer, this);
                bk.a aVar = bk.a.f5708a;
                if (objCleanup == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$loadUrl$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {255}, m = "loadUrl")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07611 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07611(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayAdResponse.this.loadUrl(null, null, null, this);
        }
    }

    public AndroidHandleGatewayAdResponse(AdRepository adRepository, AndroidGetWebViewContainerUseCase getWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridge, DeviceInfoRepository deviceInfoRepository, HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer, CampaignRepository campaignRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetLatestWebViewConfiguration getLatestWebViewConfiguration, AdPlayerScope adPlayerScope, GetAdPlayer getAdPlayer, CacheWebViewAssets cacheWebViewAssets, WebViewLessLoadStrategy webViewLessLoadStrategy, SessionRepository sessionRepository) {
        n.f(adRepository, "adRepository");
        n.f(getWebViewContainerUseCase, "getWebViewContainerUseCase");
        n.f(getWebViewBridge, "getWebViewBridge");
        n.f(deviceInfoRepository, "deviceInfoRepository");
        n.f(getHandleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        n.f(campaignRepository, "campaignRepository");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(getOperativeEventApi, "getOperativeEventApi");
        n.f(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        n.f(adPlayerScope, "adPlayerScope");
        n.f(getAdPlayer, "getAdPlayer");
        n.f(cacheWebViewAssets, "cacheWebViewAssets");
        n.f(webViewLessLoadStrategy, "webViewLessLoadStrategy");
        n.f(sessionRepository, "sessionRepository");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = getWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = getHandleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
        this.webViewLessLoadStrategy = webViewLessLoadStrategy;
        this.sessionRepository = sessionRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object cleanup(Throwable th2, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, AdPlayer adPlayer, f fVar) {
        AnonymousClass1 anonymousClass1;
        String message;
        AdPlayer adPlayer2;
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
        Object obj = anonymousClass2.result;
        int i11 = anonymousClass2.label;
        r rVar = r.f53297a;
        bk.a aVar = bk.a.f5708a;
        if (i11 != 0) {
            if (i11 == 1) {
                adPlayer2 = (AdPlayer) anonymousClass2.L$0;
                t9.e.z(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return rVar;
        }
        t9.e.z(obj);
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.INSTANCE;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED);
        Throwable cause = th2.getCause();
        if ((cause == null || (message = cause.getMessage()) == null) && (message = th2.getMessage()) == null) {
            message = "";
        }
        dsl_create.setMessage(message);
        OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR;
        ByteString trackingToken = adResponse.getTrackingToken();
        n.e(trackingToken, "response.trackingToken");
        ByteString byteString2 = operativeEventErrorData_build.toByteString();
        n.e(byteString2, "operativeEventErrorData.toByteString()");
        anonymousClass2.L$0 = adPlayer;
        anonymousClass2.label = 1;
        if (GetOperativeEventApi.invoke$default(getOperativeEventApi, operativeEventType, byteString, trackingToken, byteString2, null, null, anonymousClass2, 48, null) != aVar) {
            adPlayer2 = adPlayer;
        }
        return aVar;
        if (adPlayer2 != null) {
            anonymousClass2.L$0 = null;
            anonymousClass2.label = 2;
            if (adPlayer2.destroy(anonymousClass2) == aVar) {
                return aVar;
            }
        }
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object loadUrl(AdObject adObject, String str, WebViewContainer webViewContainer, f fVar) {
        C07611 c07611;
        long jB;
        Object objC;
        if (fVar instanceof C07611) {
            c07611 = (C07611) fVar;
            int i10 = c07611.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07611.label = i10 - Integer.MIN_VALUE;
            } else {
                c07611 = new C07611(fVar);
            }
        } else {
            c07611 = new C07611(fVar);
        }
        Object obj = c07611.result;
        int i11 = c07611.label;
        r rVar = r.f53297a;
        if (i11 == 0) {
            t9.e.z(obj);
            jB = d.b();
            try {
                c07611.L$0 = this;
                c07611.L$1 = adObject;
                c07611.J$0 = jB;
                c07611.label = 1;
                Object objLoadUrl = webViewContainer.loadUrl(str, c07611);
                Object obj2 = bk.a.f5708a;
                if (objLoadUrl == obj2) {
                    return obj2;
                }
                objC = rVar;
            } catch (Throwable th2) {
                th = th2;
                objC = t9.e.c(th);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j10 = c07611.J$0;
            AdObject adObject2 = (AdObject) c07611.L$1;
            AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = (AndroidHandleGatewayAdResponse) c07611.L$0;
            try {
                t9.e.z(obj);
                jB = j10;
                this = androidHandleGatewayAdResponse;
                adObject = adObject2;
                objC = rVar;
            } catch (Throwable th3) {
                th = th3;
                jB = j10;
                this = androidHandleGatewayAdResponse;
                adObject = adObject2;
                objC = t9.e.c(th);
            }
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, !(objC instanceof g) ? DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_SUCCESS_TIME : DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_FILE_FAILURE_TIME, new Double(bn.a.g(bn.f.a(jB), bn.c.MILLISECONDS)), (Map) null, (Map) null, adObject, (Integer) null, 44, (Object) null);
        t9.e.z(objC);
        return rVar;
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0090: MOVE (r11 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:24:0x008e */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x008f: MOVE (r14 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:24:0x008e */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19901. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    public java.lang.Object invoke(com.unity3d.ads.UnityAdsLoadOptions r58, com.google.protobuf.ByteString r59, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r60, android.content.Context r61, java.lang.String r62, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r63, boolean r64, boolean r65, ak.f r66) {
        /*
            Method dump skipped, instruction units count: 1990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke(com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, android.content.Context, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, boolean, ak.f):java.lang.Object");
    }
}
