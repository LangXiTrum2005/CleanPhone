package com.unity3d.ads.core.domain;

import ak.f;
import ck.c;
import ck.e;
import ck.i;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.protobuf.ByteString;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import fn.a1;
import fn.g;
import fn.n0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import jk.d;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import wj.r;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 Y2\u00020\u0001:\u0001YBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0086Bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010 J+\u0010'\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%H\u0082@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010 J'\u0010,\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010 J\u0019\u0010-\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u00142\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b1\u00102JQ\u00107\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00104\u001a\u0002032\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00142\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b7\u00108Jt\u0010=\u001a:\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010;\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0<\u0012\u0006\u0012\u0004\u0018\u00010\u0001092\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>JA\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140B2\u0006\u0010?\u001a\u00020\u00142\b\u0010@\u001a\u0004\u0018\u00010;2\b\u0010A\u001a\u0004\u0018\u00010\u00142\b\u00100\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020%2\u0006\u0010/\u001a\u00020\u0014H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0014H\u0002¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010MR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010NR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010VR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010WR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010X\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Z"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyShowUseCase;", "", "Lcom/unity3d/ads/core/domain/Show;", "show", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "getInitializationState", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/Show;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;Lcom/unity3d/ads/core/log/Logger;)V", "", "placement", "Lcom/unity3d/ads/UnityAdsShowOptions;", "unityAdsShowOptions", "Lcom/unity3d/ads/core/data/model/Listeners;", "listeners", "Lwj/r;", "invoke", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/core/data/model/Listeners;Lak/f;)Ljava/lang/Object;", "Lbn/e;", "startTime", "showReceivedReward", "(Lbn/e;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/Listeners;)V", "bannerLeftApplication", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;", "operativeEvent", "operativeMessage", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "sendOperativeError", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lak/f;)Ljava/lang/Object;", "cancelTimeout", "(Lbn/e;)V", "showStarted", "showClicked", "getOpportunityId", "(Lcom/unity3d/ads/UnityAdsShowOptions;)Ljava/lang/String;", "opportunityId", "showOptions", "showStart", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;)V", "Lcom/unity3d/ads/adplayer/model/ShowStatus;", "status", "reason", "reasonDebug", "showCompleted", "(Lbn/e;Ljava/lang/String;Lcom/unity3d/ads/adplayer/model/ShowStatus;Lcom/unity3d/ads/core/data/model/Listeners;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;)V", "Lkotlin/Function6;", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "", "Lak/f;", "showError", "(Lbn/e;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/Listeners;Lcom/unity3d/ads/UnityAdsShowOptions;)Ljk/f;", "diagnosticReason", "code", "debugMessage", "", "getTags", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;)Ljava/util/Map;", "getTmpAdObject", "(Ljava/lang/String;)Lcom/unity3d/ads/core/data/model/AdObject;", "getAdInfoString", "()Ljava/lang/String;", "Lcom/unity3d/ads/core/domain/Show;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "Lcom/unity3d/ads/core/log/Logger;", "Lfn/n0;", "", "hasStarted", "Lfn/n0;", "timeoutCancellationRequested", "Lcom/unity3d/ads/core/data/model/AdObject;", "Ljava/lang/String;", "Lcom/unity3d/ads/UnityAdsShowOptions;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class LegacyShowUseCase {
    public static final String KEY_OBJECT_ID = "objectId";
    public static final String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";
    public static final String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;
    private AdObject adObject;
    private final AdRepository adRepository;
    private final GetInitializationState getInitializationState;
    private final GetOperativeEventApi getOperativeEventApi;
    private final n0 hasStarted;
    private final Logger logger;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final Show show;
    private final n0 timeoutCancellationRequested;
    private UnityAdsShowOptions unityAdsShowOptions;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$bannerLeftApplication$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends o implements jk.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3227invoke();
            return r.f53297a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3227invoke() {
            this.$listeners.onLeftApplication(this.$placement);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @e(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", l = {117, 122, 128, 133, 141, 146, 152, 159, 164, 196}, m = "invoke")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class C07681 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07681(f fVar) {
            super(fVar);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyShowUseCase.this.invoke(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lwj/r;", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "<anonymous>", "(Ljk/a;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", l = {178, 184, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements jk.c {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ String $placement;
        final /* synthetic */ jk.f $reportShowError;
        final /* synthetic */ boolean $useTimeout;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdObject adObject, boolean z10, jk.f fVar, String str, f fVar2) {
            super(2, fVar2);
            this.$adObject = adObject;
            this.$useTimeout = z10;
            this.$reportShowError = fVar;
            this.$placement = str;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            AnonymousClass2 anonymousClass2 = LegacyShowUseCase.this.new AnonymousClass2(this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, fVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            jk.a aVar;
            jk.f fVar;
            UnityAds.UnityAdsShowError unityAdsShowError;
            String str;
            jk.a aVar2;
            int i10 = this.label;
            r rVar = r.f53297a;
            bk.a aVar3 = bk.a.f5708a;
            if (i10 == 0) {
                t9.e.z(obj);
                aVar = (jk.a) this.L$0;
                if (!((Boolean) ((a1) LegacyShowUseCase.this.hasStarted).getValue()).booleanValue() && !((Boolean) ((a1) LegacyShowUseCase.this.timeoutCancellationRequested).getValue()).booleanValue()) {
                    LegacyShowUseCase legacyShowUseCase = LegacyShowUseCase.this;
                    OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT;
                    AdObject adObject = this.$adObject;
                    this.L$0 = aVar;
                    this.label = 1;
                    if (legacyShowUseCase.sendOperativeError(operativeEventErrorType, "timeout", adObject, this) != aVar3) {
                    }
                    return aVar3;
                }
                return rVar;
            }
            if (i10 == 1) {
                aVar = (jk.a) this.L$0;
                t9.e.z(obj);
            } else {
                if (i10 == 2) {
                    aVar = (jk.a) this.L$0;
                    t9.e.z(obj);
                    fVar = this.$reportShowError;
                    unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
                    str = LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
                    this.L$0 = aVar;
                    this.label = 3;
                    if (fVar.invoke("timeout", unityAdsShowError, str, null, null, this) != aVar3) {
                        aVar2 = aVar;
                    }
                    return aVar3;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (jk.a) this.L$0;
                t9.e.z(obj);
            }
            aVar2.invoke();
            return rVar;
            if (this.$useTimeout) {
                Show show = LegacyShowUseCase.this.show;
                AdObject adObject2 = this.$adObject;
                this.L$0 = aVar;
                this.label = 2;
                if (show.terminate(adObject2, this) != aVar3) {
                    fVar = this.$reportShowError;
                    unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
                    str = LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
                    this.L$0 = aVar;
                    this.label = 3;
                    if (fVar.invoke("timeout", unityAdsShowError, str, null, null, this) != aVar3) {
                        aVar2 = aVar;
                        aVar2.invoke();
                    }
                }
                return aVar3;
            }
            return rVar;
        }

        @Override // jk.c
        public final Object invoke(jk.a aVar, f fVar) {
            return ((AnonymousClass2) create(aVar, fVar)).invokeSuspend(r.f53297a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfn/f;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "", "it", "Lwj/r;", "<anonymous>", "(Lfn/f;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", l = {191}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements d {
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ jk.f $reportShowError;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(jk.f fVar, boolean z10, f fVar2) {
            super(3, fVar2);
            this.$reportShowError = fVar;
            this.$isBanner = z10;
        }

        @Override // jk.d
        public final Object invoke(fn.f fVar, Throwable th2, f fVar2) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$reportShowError, this.$isBanner, fVar2);
            anonymousClass3.L$0 = th2;
            return anonymousClass3.invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            AnonymousClass3 anonymousClass3;
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                Throwable th2 = (Throwable) this.L$0;
                jk.f fVar = this.$reportShowError;
                UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th2, 0, 1, null);
                this.label = 1;
                anonymousClass3 = this;
                Object objInvoke = fVar.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, anonymousClass3);
                bk.a aVar = bk.a.f5708a;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                anonymousClass3 = this;
            }
            if (!anonymousClass3.$isBanner) {
                LegacyShowUseCase.isFullscreenAdShowing = false;
            }
            return r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", "Lwj/r;", "emit", "(Lcom/unity3d/ads/core/data/model/ShowEvent;Lak/f;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass4<T> implements fn.f {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ jk.f $reportShowError;
        final /* synthetic */ long $startTime;
        final /* synthetic */ UnityAdsShowOptions $unityAdsShowOptions;

        public AnonymousClass4(long j10, String str, Listeners listeners, UnityAdsShowOptions unityAdsShowOptions, AdObject adObject, jk.f fVar) {
            this.$startTime = j10;
            this.$placement = str;
            this.$listeners = listeners;
            this.$unityAdsShowOptions = unityAdsShowOptions;
            this.$adObject = adObject;
            this.$reportShowError = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:48:0x0161  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x01a0, code lost:
        
            if (r4.invoke("uncaught_exception", r6, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, r9, r10) == r14) goto L58;
         */
        @Override // fn.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(com.unity3d.ads.core.data.model.ShowEvent r24, ak.f r25) {
            /*
                Method dump skipped, instruction units count: 422
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass4.emit(com.unity3d.ads.core.data.model.ShowEvent, ak.f):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C07691 extends o implements jk.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07691(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3228invoke();
            return r.f53297a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3228invoke() {
            this.$listeners.onClick(this.$placement);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showCompleted$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C07701 extends o implements jk.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ ShowStatus $status;
        final /* synthetic */ LegacyShowUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07701(Listeners listeners, String str, ShowStatus showStatus, LegacyShowUseCase legacyShowUseCase) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
            this.$status = showStatus;
            this.this$0 = legacyShowUseCase;
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3229invoke();
            return r.f53297a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3229invoke() {
            Listeners listeners = this.$listeners;
            String str = this.$placement;
            ShowStatus showStatus = this.$status;
            NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this.this$0.sessionRepository.getNativeConfiguration().getDefaultShowCompletionState();
            n.e(defaultShowCompletionState, "sessionRepository.native…efaultShowCompletionState");
            listeners.onComplete(str, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus, defaultShowCompletionState));
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "diagnosticReason", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "reason", "message", "", "code", "debugMessage", "Lwj/r;", "<anonymous>", "(Ljava/lang/String;Lcom/unity3d/ads/UnityAds$UnityAdsShowError;Ljava/lang/String;ILjava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
    public static final class C07711 extends i implements jk.f {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $opportunityId;
        final /* synthetic */ String $placement;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        final /* synthetic */ bn.e $startTime;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        /* synthetic */ Object L$4;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C02161 extends o implements jk.a {
            final /* synthetic */ Listeners $listeners;
            final /* synthetic */ String $message;
            final /* synthetic */ String $placement;
            final /* synthetic */ UnityAds.UnityAdsShowError $reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02161(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                super(0);
                this.$listeners = listeners;
                this.$placement = str;
                this.$reason = unityAdsShowError;
                this.$message = str2;
            }

            @Override // jk.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m3230invoke();
                return r.f53297a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3230invoke() {
                this.$listeners.onError(this.$placement, this.$reason, this.$message);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07711(String str, bn.e eVar, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, String str2, f fVar) {
            super(6, fVar);
            this.$opportunityId = str;
            this.$startTime = eVar;
            this.$showOptions = unityAdsShowOptions;
            this.$listeners = listeners;
            this.$placement = str2;
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            String str = (String) this.L$0;
            UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
            String str2 = (String) this.L$2;
            Integer num = (Integer) this.L$3;
            String str3 = (String) this.L$4;
            Logger.DefaultImpls.error$default(LegacyShowUseCase.this.logger, "Failed to show ad " + LegacyShowUseCase.this.getAdInfoString() + ", error: " + str2, null, 2, null);
            AdObject tmpAdObject = LegacyShowUseCase.this.adObject;
            if (tmpAdObject == null) {
                tmpAdObject = LegacyShowUseCase.this.getTmpAdObject(this.$opportunityId);
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(LegacyShowUseCase.this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(this.$startTime)), LegacyShowUseCase.this.getTags(str, num, str3, this.$showOptions), (Map) null, tmpAdObject, (Integer) null, 40, (Object) null);
            LegacyShowUseCase.this.safeCallbackInvoke.invoke(new C02161(this.$listeners, this.$placement, unityAdsShowError, str2));
            return r.f53297a;
        }

        @Override // jk.f
        public final Object invoke(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, Integer num, String str3, f fVar) {
            C07711 c07711 = LegacyShowUseCase.this.new C07711(this.$opportunityId, this.$startTime, this.$showOptions, this.$listeners, this.$placement, fVar);
            c07711.L$0 = str;
            c07711.L$1 = unityAdsShowError;
            c07711.L$2 = str2;
            c07711.L$3 = num;
            c07711.L$4 = str3;
            return c07711.invokeSuspend(r.f53297a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showReceivedReward$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C07721 extends o implements jk.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07721(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3231invoke();
            return r.f53297a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3231invoke() {
            this.$listeners.onRewarded(this.$placement);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showStarted$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C07731 extends o implements jk.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07731(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3232invoke();
            return r.f53297a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3232invoke() {
            this.$listeners.onStart(this.$placement);
        }
    }

    public LegacyShowUseCase(Show show, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetInitializationState getInitializationState, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke, Logger logger) {
        n.f(show, "show");
        n.f(adRepository, "adRepository");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        n.f(getOperativeEventApi, "getOperativeEventApi");
        n.f(getInitializationState, "getInitializationState");
        n.f(sessionRepository, "sessionRepository");
        n.f(safeCallbackInvoke, "safeCallbackInvoke");
        n.f(logger, "logger");
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = g.c(bool);
        this.timeoutCancellationRequested = g.c(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(bn.e startTime, String placement, Listeners listeners) {
        this.logger.info("Left app while showing ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, 44, (Object) null);
        this.safeCallbackInvoke.invoke(new AnonymousClass1(listeners, placement));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(bn.e startTime) {
        n0 n0Var = this.timeoutCancellationRequested;
        Boolean bool = Boolean.TRUE;
        a1 a1Var = (a1) n0Var;
        a1Var.getClass();
        a1Var.e0(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, 44, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAdInfoString() {
        ByteString opportunityId;
        StringBuilder sb2 = new StringBuilder("for placement ");
        AdObject adObject = this.adObject;
        UUID uuid = null;
        sb2.append(adObject != null ? adObject.getPlacementId() : null);
        sb2.append(" with instance id ");
        AdObject adObject2 = this.adObject;
        if (adObject2 != null && (opportunityId = adObject2.getOpportunityId()) != null) {
            uuid = ProtobufExtensionsKt.toUUID(opportunityId);
        }
        sb2.append(uuid);
        return sb2.toString();
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) throws IllegalArgumentException {
        Object objOpt;
        String string;
        JSONObject data = unityAdsShowOptions.getData();
        if (data == null || (objOpt = data.opt("objectId")) == null || (string = objOpt.toString()) == null) {
            return null;
        }
        return UUID.fromString(string).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(String diagnosticReason, Integer code, String debugMessage, UnityAdsShowOptions showOptions) {
        LinkedHashMap linkedHashMapR = b0.R(new wj.f("operation", OperationType.SHOW.toString()), new wj.f("reason", diagnosticReason), new wj.f("new_api", String.valueOf((showOptions != null ? showOptions.showConfiguration : null) != null)));
        if (code != null) {
        }
        if (debugMessage != null) {
            linkedHashMapR.put("reason_debug", debugMessage);
        }
        return linkedHashMapR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(String opportunityId) {
        UUID uuidFromString = UUID.fromString(opportunityId);
        n.e(uuidFromString, "fromString(opportunityId)");
        AdObject ad2 = this.adRepository.getAd(ProtobufExtensionsKt.toByteString(uuidFromString));
        if (ad2 != null) {
            return ad2;
        }
        SendDiagnosticEvent.Companion companion = SendDiagnosticEvent.INSTANCE;
        UUID uuidFromString2 = UUID.fromString(opportunityId);
        n.e(uuidFromString2, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(uuidFromString2);
        String str = this.placement;
        if (str == null) {
            str = "";
        }
        return SendDiagnosticEvent.Companion.getTmpAdObjectForEventSending$default(companion, byteString, str, false, null, null, false, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, f fVar) {
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.INSTANCE;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        n.e(builderNewBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(operativeEventErrorType);
        dsl_create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = operativeEventErrorData_build.toByteString();
        n.e(byteString, "errorData.toByteString()");
        Object objInvoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, fVar);
        return objInvoke == bk.a.f5708a ? objInvoke : r.f53297a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClicked(bn.e startTime, String placement, Listeners listeners) {
        this.logger.info("Clicked on ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, 44, (Object) null);
        this.safeCallbackInvoke.invoke(new C07691(listeners, placement));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCompleted(bn.e startTime, String placement, ShowStatus status, Listeners listeners, String reason, String reasonDebug, UnityAdsShowOptions showOptions) {
        this.logger.info("Finished showing ad " + getAdInfoString());
        yj.f fVar = new yj.f();
        if (reason != null) {
        }
        if (reasonDebug != null) {
        }
        String.valueOf((showOptions != null ? showOptions.showConfiguration : null) != null);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), fVar.g(), (Map) null, this.adObject, (Integer) null, 40, (Object) null);
        this.safeCallbackInvoke.invoke(new C07701(listeners, placement, status, this));
    }

    public static /* synthetic */ void showCompleted$default(LegacyShowUseCase legacyShowUseCase, bn.e eVar, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3, UnityAdsShowOptions unityAdsShowOptions, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            str3 = null;
        }
        legacyShowUseCase.showCompleted(eVar, str, showStatus, listeners, str2, str3, unityAdsShowOptions);
    }

    private final jk.f showError(bn.e startTime, String placement, String opportunityId, Listeners listeners, UnityAdsShowOptions showOptions) {
        return new C07711(opportunityId, startTime, showOptions, listeners, placement, null);
    }

    private final void showStart(String opportunityId, UnityAdsShowOptions showOptions) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED, (Double) null, b0.P(new wj.f("new_api", String.valueOf((showOptions != null ? showOptions.showConfiguration : null) != null))), (Map) null, getTmpAdObject(opportunityId), (Integer) null, 42, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStarted(bn.e startTime, String placement, Listeners listeners) {
        this.logger.info("Started showing ad " + getAdInfoString());
        n0 n0Var = this.hasStarted;
        Boolean bool = Boolean.TRUE;
        a1 a1Var = (a1) n0Var;
        a1Var.getClass();
        a1Var.e0(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, 44, (Object) null);
        this.safeCallbackInvoke.invoke(new C07731(listeners, placement));
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020e, code lost:
    
        if (r2.invoke("ad_player_scope_not_active", r12, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, r8) == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0230, code lost:
    
        if (r2.invoke("already_showing", r12, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_ALREADY_SHOWING, null, null, r8) == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0260, code lost:
    
        if (r2.invoke("placement_validation", r12, com.unity3d.ads.core.domain.LegacyShowUseCase.MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, r8) == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
    
        if (r2.invoke("not_initialized", r12, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, null, r8) == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013f, code lost:
    
        if (r2.invoke("placement_null", r12, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, null, r8) == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0169, code lost:
    
        if (r2.invoke("no_opportunity_id", r12, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_OPPORTUNITY_ID, null, r14, r8) == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018b, code lost:
    
        if (r2.invoke("placement_not_loaded", r12, r13, null, null, r8) == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ba, code lost:
    
        if (r2.invoke("ad_object_not_found", r12, r13, null, null, r8) == r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e1, code lost:
    
        if (r2.invoke("ad_object_expired", r12, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_AD_OBJECT_EXPIRED, null, null, r8) == r8) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.String r27, com.unity3d.ads.UnityAdsShowOptions r28, com.unity3d.ads.core.data.model.Listeners r29, ak.f r30) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.invoke(java.lang.String, com.unity3d.ads.UnityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners, ak.f):java.lang.Object");
    }

    public final void showReceivedReward(bn.e startTime, String placement, Listeners listeners) {
        n.f(startTime, "startTime");
        n.f(placement, "placement");
        n.f(listeners, "listeners");
        this.logger.info("Rewarding ad " + getAdInfoString());
        n0 n0Var = this.hasStarted;
        Boolean bool = Boolean.TRUE;
        a1 a1Var = (a1) n0Var;
        a1Var.getClass();
        a1Var.e0(null, bool);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), (Map) null, (Map) null, this.adObject, (Integer) null, 44, (Object) null);
        this.safeCallbackInvoke.invoke(new C07721(listeners, placement));
    }
}
