package com.chartboost.mediation.chartboostadapter;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Size;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.domain.AdFormat;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.GdprConsentStatus;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.domain.PartnerAdListener;
import com.chartboost.heliumsdk.domain.PartnerAdLoadRequest;
import com.chartboost.heliumsdk.domain.PartnerAdapter;
import com.chartboost.heliumsdk.domain.PartnerConfiguration;
import com.chartboost.heliumsdk.domain.PreBidRequest;
import com.chartboost.heliumsdk.utils.PartnerLogController;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CBError;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.chartboost.sdk.events.StartError;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.GDPR;
import com.p004ironsource.d9;
import com.p004ironsource.gv;
import com.p004ironsource.yq;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 H2\u00020\u0001:\u0001HB\u0005¢\u0006\u0002\u0010\u0002J#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J4\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&J4\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010&J,\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0017\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J,\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0017\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010+J \u0010.\u001a\u00020/2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0004H\u0016J'\u00103\u001a\u00020/2\u0006\u0010\u0015\u001a\u00020\u00162\b\u00104\u001a\u0004\u0018\u0001012\u0006\u00105\u001a\u000206H\u0016¢\u0006\u0002\u00107J\b\u00108\u001a\u000209H\u0002J,\u0010:\u001a\b\u0012\u0004\u0012\u00020/0\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010;\u001a\u00020<H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\u00020/2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010@\u001a\u000201H\u0016J,\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ$\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bE\u0010 J$\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010 R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006I"}, d2 = {"Lcom/chartboost/mediation/chartboostadapter/ChartboostAdapter;", "Lcom/chartboost/heliumsdk/domain/PartnerAdapter;", "()V", gv.f25175b, "", "getAdapterVersion", "()Ljava/lang/String;", "partnerDisplayName", "getPartnerDisplayName", "partnerId", "getPartnerId", "partnerSdkVersion", "getPartnerSdkVersion", "destroyBannerAd", "Lkotlin/Result;", "Lcom/chartboost/heliumsdk/domain/PartnerAd;", "partnerAd", "destroyBannerAd-IoAF18A", "(Lcom/chartboost/heliumsdk/domain/PartnerAd;)Ljava/lang/Object;", "fetchBidderInformation", "", "context", "Landroid/content/Context;", "request", "Lcom/chartboost/heliumsdk/domain/PreBidRequest;", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/PreBidRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChartboostAdSize", "Lcom/chartboost/sdk/ads/Banner$BannerSize;", "size", "Landroid/util/Size;", "invalidate", "invalidate-gIAlu-s", "(Lcom/chartboost/heliumsdk/domain/PartnerAd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Lcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;", "partnerAdListener", "Lcom/chartboost/heliumsdk/domain/PartnerAdListener;", "load-BWLJW6A", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;Lcom/chartboost/heliumsdk/domain/PartnerAdListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBannerAd", "loadBannerAd-BWLJW6A", "loadInterstitialAd", "loadInterstitialAd-0E7RQCE", "(Lcom/chartboost/heliumsdk/domain/PartnerAdLoadRequest;Lcom/chartboost/heliumsdk/domain/PartnerAdListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadRewardedAd", "loadRewardedAd-0E7RQCE", "setCcpaConsent", "", "hasGrantedCcpaConsent", "", "privacyString", "setGdpr", "applies", d9.i.a0, "Lcom/chartboost/heliumsdk/domain/GdprConsentStatus;", "(Landroid/content/Context;Ljava/lang/Boolean;Lcom/chartboost/heliumsdk/domain/GdprConsentStatus;)V", "setMediation", "Lcom/chartboost/sdk/Mediation;", "setUp", "partnerConfiguration", "Lcom/chartboost/heliumsdk/domain/PartnerConfiguration;", "setUp-0E7RQCE", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/PartnerConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserSubjectToCoppa", "isSubjectToCoppa", "show", "show-0E7RQCE", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/PartnerAd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showInterstitialAd", "showInterstitialAd-gIAlu-s", "showRewardedAd", "showRewardedAd-gIAlu-s", "Companion", "ChartboostAdapter_remoteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChartboostAdapter implements PartnerAdapter {
    private static final String APPLICATION_ID_KEY = "app_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static Function0<Unit> onShowSuccess = new Function0<Unit>() { // from class: com.chartboost.mediation.chartboostadapter.ChartboostAdapter$Companion$onShowSuccess$1
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m180invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m180invoke();
            return Unit.f43263a;
        }
    };
    private static Function2<? super ShowEvent, ? super ShowError, Unit> onShowError = new Function2<ShowEvent, ShowError, Unit>() { // from class: com.chartboost.mediation.chartboostadapter.ChartboostAdapter$Companion$onShowError$1
        public final void invoke(ShowEvent showEvent, ShowError showError) {
            Intrinsics.f(showEvent, "<anonymous parameter 0>");
            Intrinsics.f(showError, "<anonymous parameter 1>");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((ShowEvent) obj, (ShowError) obj2);
            return Unit.f43263a;
        }
    };

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000RJ\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/chartboost/mediation/chartboostadapter/ChartboostAdapter$Companion;", "", "()V", "APPLICATION_ID_KEY", "", "onShowError", "Lkotlin/Function2;", "Lcom/chartboost/sdk/events/ShowEvent;", "Lkotlin/ParameterName;", "name", "event", "Lcom/chartboost/sdk/events/ShowError;", "error", "", "getOnShowError$ChartboostAdapter_remoteRelease", "()Lkotlin/jvm/functions/Function2;", "setOnShowError$ChartboostAdapter_remoteRelease", "(Lkotlin/jvm/functions/Function2;)V", yq.f27803e, "Lkotlin/Function0;", "getOnShowSuccess$ChartboostAdapter_remoteRelease", "()Lkotlin/jvm/functions/Function0;", "setOnShowSuccess$ChartboostAdapter_remoteRelease", "(Lkotlin/jvm/functions/Function0;)V", "getChartboostMediationError", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "Lcom/chartboost/sdk/events/CBError;", "getChartboostMediationError$ChartboostAdapter_remoteRelease", "ChartboostAdapter_remoteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[StartError.Code.values().length];
                try {
                    iArr[StartError.Code.INVALID_CREDENTIALS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StartError.Code.NETWORK_FAILURE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[CacheError.Code.values().length];
                try {
                    iArr2[CacheError.Code.INTERNET_UNAVAILABLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[CacheError.Code.NO_AD_FOUND.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[CacheError.Code.SESSION_NOT_STARTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[CacheError.Code.NETWORK_FAILURE.ordinal()] = 4;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[CacheError.Code.SERVER_ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[ShowError.Code.values().length];
                try {
                    iArr3[ShowError.Code.INTERNET_UNAVAILABLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr3[ShowError.Code.NO_CACHED_AD.ordinal()] = 2;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[ShowError.Code.SESSION_NOT_STARTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChartboostMediationError getChartboostMediationError$ChartboostAdapter_remoteRelease(CBError error) {
            Intrinsics.f(error, "error");
            if (error instanceof StartError) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[((StartError) error).getCode().ordinal()];
                if (i2 != 1) {
                    return i2 != 2 ? ChartboostMediationError.CM_INITIALIZATION_FAILURE_UNKNOWN : ChartboostMediationError.CM_AD_SERVER_ERROR;
                }
                return ChartboostMediationError.CM_INITIALIZATION_FAILURE_INVALID_CREDENTIALS;
            }
            if (error instanceof CacheError) {
                int i3 = WhenMappings.$EnumSwitchMapping$1[((CacheError) error).getCode().ordinal()];
                if (i3 == 1) {
                    return ChartboostMediationError.CM_NO_CONNECTIVITY;
                }
                if (i3 == 2) {
                    return ChartboostMediationError.CM_LOAD_FAILURE_NO_FILL;
                }
                if (i3 != 3) {
                    return (i3 == 4 || i3 == 5) ? ChartboostMediationError.CM_AD_SERVER_ERROR : ChartboostMediationError.CM_PARTNER_ERROR;
                }
                return ChartboostMediationError.CM_INITIALIZATION_FAILURE_UNKNOWN;
            }
            if (!(error instanceof ShowError)) {
                return ChartboostMediationError.CM_UNKNOWN_ERROR;
            }
            int i4 = WhenMappings.$EnumSwitchMapping$2[((ShowError) error).getCode().ordinal()];
            if (i4 == 1) {
                return ChartboostMediationError.CM_NO_CONNECTIVITY;
            }
            if (i4 != 2) {
                return i4 != 3 ? ChartboostMediationError.CM_PARTNER_ERROR : ChartboostMediationError.CM_SHOW_FAILURE_NOT_INITIALIZED;
            }
            return ChartboostMediationError.CM_SHOW_FAILURE_AD_NOT_READY;
        }

        public final Function2<ShowEvent, ShowError, Unit> getOnShowError$ChartboostAdapter_remoteRelease() {
            return ChartboostAdapter.onShowError;
        }

        public final Function0<Unit> getOnShowSuccess$ChartboostAdapter_remoteRelease() {
            return ChartboostAdapter.onShowSuccess;
        }

        public final void setOnShowError$ChartboostAdapter_remoteRelease(Function2<? super ShowEvent, ? super ShowError, Unit> function2) {
            Intrinsics.f(function2, "<set-?>");
            ChartboostAdapter.onShowError = function2;
        }

        public final void setOnShowSuccess$ChartboostAdapter_remoteRelease(Function0<Unit> function0) {
            Intrinsics.f(function0, "<set-?>");
            ChartboostAdapter.onShowSuccess = function0;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GdprConsentStatus.values().length];
            try {
                iArr[GdprConsentStatus.GDPR_CONSENT_UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GdprConsentStatus.GDPR_CONSENT_GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GdprConsentStatus.GDPR_CONSENT_DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.mediation.chartboostadapter.ChartboostAdapter$fetchBidderInformation$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.mediation.chartboostadapter.ChartboostAdapter$fetchBidderInformation$2", f = "ChartboostAdapter.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends String>>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            String bidderToken = Chartboost.getBidderToken();
            if (bidderToken == null) {
                bidderToken = "";
            }
            PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, bidderToken.length() == 0 ? PartnerLogController.PartnerAdapterEvents.BIDDER_INFO_FETCH_FAILED : PartnerLogController.PartnerAdapterEvents.BIDDER_INFO_FETCH_SUCCEEDED, null, 2, null);
            return MapsKt.i(new Pair("buyeruid", bidderToken));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, String>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: destroyBannerAd-IoAF18A, reason: not valid java name */
    private final Object m174destroyBannerAdIoAF18A(PartnerAd partnerAd) {
        Object ad = partnerAd.getAd();
        if (ad == null) {
            PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.INVALIDATE_FAILED, "Ad is null.");
            return ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_INVALIDATE_FAILURE_AD_NOT_FOUND));
        }
        if (!(ad instanceof Banner)) {
            PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.INVALIDATE_FAILED, "Ad is not a Chartboost Banner.");
            return ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_INVALIDATE_FAILURE_WRONG_RESOURCE_TYPE));
        }
        ((Banner) ad).detach();
        PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, PartnerLogController.PartnerAdapterEvents.INVALIDATE_SUCCEEDED, null, 2, null);
        return partnerAd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Banner.BannerSize getChartboostAdSize(Size size) {
        Integer numValueOf = size != null ? Integer.valueOf(size.getHeight()) : null;
        IntRange intRangeE = RangesKt.e(50, 90);
        if (numValueOf != null && intRangeE.a(numValueOf.intValue())) {
            return Banner.BannerSize.STANDARD;
        }
        IntRange intRangeE2 = RangesKt.e(90, 250);
        if (numValueOf == null || !intRangeE2.a(numValueOf.intValue())) {
            return (numValueOf == null || !RangesKt.e(250, new DisplayMetrics().heightPixels).a(numValueOf.intValue())) ? Banner.BannerSize.STANDARD : Banner.BannerSize.MEDIUM;
        }
        return Banner.BannerSize.LEADERBOARD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: loadBannerAd-BWLJW6A, reason: not valid java name */
    public final Object m175loadBannerAdBWLJW6A(Context context, final PartnerAdLoadRequest partnerAdLoadRequest, final PartnerAdListener partnerAdListener, Continuation<? super Result<PartnerAd>> continuation) throws Throwable {
        ChartboostAdapter$loadBannerAd$1 chartboostAdapter$loadBannerAd$1;
        if (continuation instanceof ChartboostAdapter$loadBannerAd$1) {
            chartboostAdapter$loadBannerAd$1 = (ChartboostAdapter$loadBannerAd$1) continuation;
            int i2 = chartboostAdapter$loadBannerAd$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chartboostAdapter$loadBannerAd$1.label = i2 - Integer.MIN_VALUE;
            } else {
                chartboostAdapter$loadBannerAd$1 = new ChartboostAdapter$loadBannerAd$1(this, continuation);
            }
        } else {
            chartboostAdapter$loadBannerAd$1 = new ChartboostAdapter$loadBannerAd$1(this, continuation);
        }
        Object objP = chartboostAdapter$loadBannerAd$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = chartboostAdapter$loadBannerAd$1.label;
        if (i3 == 0) {
            ResultKt.b(objP);
            chartboostAdapter$loadBannerAd$1.L$0 = this;
            chartboostAdapter$loadBannerAd$1.L$1 = context;
            chartboostAdapter$loadBannerAd$1.L$2 = partnerAdLoadRequest;
            chartboostAdapter$loadBannerAd$1.L$3 = partnerAdListener;
            chartboostAdapter$loadBannerAd$1.label = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(chartboostAdapter$loadBannerAd$1));
            cancellableContinuationImpl.q();
            Banner banner = new Banner(context, partnerAdLoadRequest.getPartnerPlacement(), getChartboostAdSize(partnerAdLoadRequest.getSize()), new BannerCallback() { // from class: com.chartboost.mediation.chartboostadapter.ChartboostAdapter$loadBannerAd$2$chartboostBanner$1
                @Override // com.chartboost.sdk.callbacks.AdCallback
                public void onAdClicked(ClickEvent event, ClickError error) {
                    Intrinsics.f(event, "event");
                    PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, PartnerLogController.PartnerAdapterEvents.DID_CLICK, null, 2, null);
                    partnerAdListener.onPartnerAdClicked(new PartnerAd(event.getAd(), EmptyMap.X, partnerAdLoadRequest));
                }

                @Override // com.chartboost.sdk.callbacks.AdCallback
                public void onAdLoaded(CacheEvent event, CacheError error) {
                    Unit unit;
                    Intrinsics.f(event, "event");
                    if (error != null) {
                        CancellableContinuation<Result<PartnerAd>> cancellableContinuation = cancellableContinuationImpl;
                        PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.LOAD_FAILED, String.valueOf(error.getCode()));
                        ChartboostAdapter.loadBannerAd_BWLJW6A$lambda$0$resumeOnce(cancellableContinuation, ResultKt.a(new ChartboostMediationAdException(ChartboostAdapter.INSTANCE.getChartboostMediationError$ChartboostAdapter_remoteRelease(error))));
                        unit = Unit.f43263a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        PartnerAdLoadRequest partnerAdLoadRequest2 = partnerAdLoadRequest;
                        CancellableContinuation<Result<PartnerAd>> cancellableContinuation2 = cancellableContinuationImpl;
                        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new ChartboostAdapter$loadBannerAd$2$chartboostBanner$1$onAdLoaded$2$1(event, null), 3);
                        PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, PartnerLogController.PartnerAdapterEvents.LOAD_SUCCEEDED, null, 2, null);
                        ChartboostAdapter.loadBannerAd_BWLJW6A$lambda$0$resumeOnce(cancellableContinuation2, new PartnerAd(event.getAd(), EmptyMap.X, partnerAdLoadRequest2));
                    }
                }

                @Override // com.chartboost.sdk.callbacks.AdCallback
                public void onAdRequestedToShow(ShowEvent event) {
                    Intrinsics.f(event, "event");
                }

                @Override // com.chartboost.sdk.callbacks.AdCallback
                public void onAdShown(ShowEvent event, ShowError error) {
                    Intrinsics.f(event, "event");
                }

                @Override // com.chartboost.sdk.callbacks.AdCallback
                public void onImpressionRecorded(ImpressionEvent event) {
                    Intrinsics.f(event, "event");
                    PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, PartnerLogController.PartnerAdapterEvents.DID_TRACK_IMPRESSION, null, 2, null);
                    partnerAdListener.onPartnerAdImpression(new PartnerAd(event.getAd(), EmptyMap.X, partnerAdLoadRequest));
                }
            }, setMediation());
            String adm = partnerAdLoadRequest.getAdm();
            if (adm == null || adm.length() == 0) {
                banner.cache();
            } else {
                banner.cache(partnerAdLoadRequest.getAdm());
            }
            objP = cancellableContinuationImpl.p();
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP);
        }
        return ((Result) objP).X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBannerAd_BWLJW6A$lambda$0$resumeOnce(CancellableContinuation<? super Result<PartnerAd>> cancellableContinuation, Object obj) {
        if (cancellableContinuation.isActive()) {
            cancellableContinuation.resumeWith(new Result(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: loadInterstitialAd-0E7RQCE, reason: not valid java name */
    public final Object m176loadInterstitialAd0E7RQCE(PartnerAdLoadRequest partnerAdLoadRequest, PartnerAdListener partnerAdListener, Continuation<? super Result<PartnerAd>> continuation) throws Throwable {
        ChartboostAdapter$loadInterstitialAd$1 chartboostAdapter$loadInterstitialAd$1;
        if (continuation instanceof ChartboostAdapter$loadInterstitialAd$1) {
            chartboostAdapter$loadInterstitialAd$1 = (ChartboostAdapter$loadInterstitialAd$1) continuation;
            int i2 = chartboostAdapter$loadInterstitialAd$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chartboostAdapter$loadInterstitialAd$1.label = i2 - Integer.MIN_VALUE;
            } else {
                chartboostAdapter$loadInterstitialAd$1 = new ChartboostAdapter$loadInterstitialAd$1(this, continuation);
            }
        } else {
            chartboostAdapter$loadInterstitialAd$1 = new ChartboostAdapter$loadInterstitialAd$1(this, continuation);
        }
        Object objP = chartboostAdapter$loadInterstitialAd$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = chartboostAdapter$loadInterstitialAd$1.label;
        if (i3 == 0) {
            ResultKt.b(objP);
            chartboostAdapter$loadInterstitialAd$1.L$0 = this;
            chartboostAdapter$loadInterstitialAd$1.L$1 = partnerAdLoadRequest;
            chartboostAdapter$loadInterstitialAd$1.L$2 = partnerAdListener;
            chartboostAdapter$loadInterstitialAd$1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(chartboostAdapter$loadInterstitialAd$1));
            cancellableContinuationImpl.q();
            Interstitial interstitial = new Interstitial(partnerAdLoadRequest.getPartnerPlacement(), new InterstitialAdCallback(partnerAdLoadRequest, partnerAdListener, new WeakReference(cancellableContinuationImpl)), setMediation());
            String adm = partnerAdLoadRequest.getAdm();
            if (adm == null || adm.length() == 0) {
                interstitial.cache();
            } else {
                interstitial.cache(partnerAdLoadRequest.getAdm());
            }
            objP = cancellableContinuationImpl.p();
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP);
        }
        return ((Result) objP).X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: loadRewardedAd-0E7RQCE, reason: not valid java name */
    public final Object m177loadRewardedAd0E7RQCE(PartnerAdLoadRequest partnerAdLoadRequest, PartnerAdListener partnerAdListener, Continuation<? super Result<PartnerAd>> continuation) throws Throwable {
        ChartboostAdapter$loadRewardedAd$1 chartboostAdapter$loadRewardedAd$1;
        if (continuation instanceof ChartboostAdapter$loadRewardedAd$1) {
            chartboostAdapter$loadRewardedAd$1 = (ChartboostAdapter$loadRewardedAd$1) continuation;
            int i2 = chartboostAdapter$loadRewardedAd$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chartboostAdapter$loadRewardedAd$1.label = i2 - Integer.MIN_VALUE;
            } else {
                chartboostAdapter$loadRewardedAd$1 = new ChartboostAdapter$loadRewardedAd$1(this, continuation);
            }
        } else {
            chartboostAdapter$loadRewardedAd$1 = new ChartboostAdapter$loadRewardedAd$1(this, continuation);
        }
        Object objP = chartboostAdapter$loadRewardedAd$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = chartboostAdapter$loadRewardedAd$1.label;
        if (i3 == 0) {
            ResultKt.b(objP);
            chartboostAdapter$loadRewardedAd$1.L$0 = this;
            chartboostAdapter$loadRewardedAd$1.L$1 = partnerAdLoadRequest;
            chartboostAdapter$loadRewardedAd$1.L$2 = partnerAdListener;
            chartboostAdapter$loadRewardedAd$1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(chartboostAdapter$loadRewardedAd$1));
            cancellableContinuationImpl.q();
            Rewarded rewarded = new Rewarded(partnerAdLoadRequest.getPartnerPlacement(), new RewardedAdCallback(partnerAdLoadRequest, partnerAdListener, new WeakReference(cancellableContinuationImpl)), setMediation());
            String adm = partnerAdLoadRequest.getAdm();
            if (adm == null || adm.length() == 0) {
                rewarded.cache();
            } else {
                rewarded.cache(partnerAdLoadRequest.getAdm());
            }
            objP = cancellableContinuationImpl.p();
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP);
        }
        return ((Result) objP).X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Mediation setMediation() {
        return new Mediation("Chartboost", HeliumSdk.getVersion(), getAdapterVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: showInterstitialAd-gIAlu-s, reason: not valid java name */
    public final Object m178showInterstitialAdgIAlus(final PartnerAd partnerAd, Continuation<? super Result<PartnerAd>> continuation) throws Throwable {
        ChartboostAdapter$showInterstitialAd$1 chartboostAdapter$showInterstitialAd$1;
        if (continuation instanceof ChartboostAdapter$showInterstitialAd$1) {
            chartboostAdapter$showInterstitialAd$1 = (ChartboostAdapter$showInterstitialAd$1) continuation;
            int i2 = chartboostAdapter$showInterstitialAd$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chartboostAdapter$showInterstitialAd$1.label = i2 - Integer.MIN_VALUE;
            } else {
                chartboostAdapter$showInterstitialAd$1 = new ChartboostAdapter$showInterstitialAd$1(this, continuation);
            }
        } else {
            chartboostAdapter$showInterstitialAd$1 = new ChartboostAdapter$showInterstitialAd$1(this, continuation);
        }
        Object objP = chartboostAdapter$showInterstitialAd$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = chartboostAdapter$showInterstitialAd$1.label;
        if (i3 == 0) {
            ResultKt.b(objP);
            Object ad = partnerAd.getAd();
            if (ad == null) {
                PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.SHOW_FAILED, "Ad is null.");
                return ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_SHOW_FAILURE_AD_NOT_FOUND));
            }
            Interstitial interstitial = ad instanceof Interstitial ? (Interstitial) ad : null;
            if (interstitial != null) {
                chartboostAdapter$showInterstitialAd$1.L$0 = this;
                chartboostAdapter$showInterstitialAd$1.L$1 = partnerAd;
                chartboostAdapter$showInterstitialAd$1.L$2 = interstitial;
                chartboostAdapter$showInterstitialAd$1.L$3 = chartboostAdapter$showInterstitialAd$1;
                chartboostAdapter$showInterstitialAd$1.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(chartboostAdapter$showInterstitialAd$1));
                cancellableContinuationImpl.q();
                final WeakReference weakReference = new WeakReference(cancellableContinuationImpl);
                onShowSuccess = new Function0<Unit>() { // from class: com.chartboost.mediation.chartboostadapter.ChartboostAdapter$showInterstitialAd$2$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m181invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m181invoke() {
                        PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, PartnerLogController.PartnerAdapterEvents.SHOW_SUCCEEDED, null, 2, null);
                        ChartboostAdapter.showInterstitialAd_gIAlu_s$lambda$9$lambda$7$lambda$6$resumeOnce$5(weakReference, this, partnerAd);
                    }
                };
                onShowError = new Function2<ShowEvent, ShowError, Unit>() { // from class: com.chartboost.mediation.chartboostadapter.ChartboostAdapter$showInterstitialAd$2$1$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((ShowEvent) obj, (ShowError) obj2);
                        return Unit.f43263a;
                    }

                    public final void invoke(ShowEvent event, ShowError error) {
                        Intrinsics.f(event, "event");
                        Intrinsics.f(error, "error");
                        PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.SHOW_FAILED, "Location: " + event.getAd().getLocation() + ". Error: " + error.getCode());
                        ChartboostAdapter.showInterstitialAd_gIAlu_s$lambda$9$lambda$7$lambda$6$resumeOnce$5(weakReference, this, ResultKt.a(new ChartboostMediationAdException(ChartboostAdapter.INSTANCE.getChartboostMediationError$ChartboostAdapter_remoteRelease(error))));
                    }
                };
                interstitial.show();
                objP = cancellableContinuationImpl.p();
                if (objP == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.SHOW_FAILED, "Ad is not Interstitial.");
            return ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_SHOW_FAILURE_WRONG_RESOURCE_TYPE));
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objP);
        Result result = (Result) objP;
        if (result != null) {
            return result.X;
        }
        PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.SHOW_FAILED, "Ad is not Interstitial.");
        return ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_SHOW_FAILURE_WRONG_RESOURCE_TYPE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showInterstitialAd_gIAlu_s$lambda$9$lambda$7$lambda$6$resumeOnce$5(WeakReference<CancellableContinuation<Result<PartnerAd>>> weakReference, ChartboostAdapter chartboostAdapter, Object obj) {
        Unit unit;
        CancellableContinuation<Result<PartnerAd>> cancellableContinuation = weakReference.get();
        if (cancellableContinuation != null) {
            if (cancellableContinuation.isActive()) {
                cancellableContinuation.resumeWith(new Result(obj));
            }
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.SHOW_FAILED, "Unable to resume continuation for show. Continuation is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: showRewardedAd-gIAlu-s, reason: not valid java name */
    public final Object m179showRewardedAdgIAlus(final PartnerAd partnerAd, Continuation<? super Result<PartnerAd>> continuation) throws Throwable {
        ChartboostAdapter$showRewardedAd$1 chartboostAdapter$showRewardedAd$1;
        if (continuation instanceof ChartboostAdapter$showRewardedAd$1) {
            chartboostAdapter$showRewardedAd$1 = (ChartboostAdapter$showRewardedAd$1) continuation;
            int i2 = chartboostAdapter$showRewardedAd$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chartboostAdapter$showRewardedAd$1.label = i2 - Integer.MIN_VALUE;
            } else {
                chartboostAdapter$showRewardedAd$1 = new ChartboostAdapter$showRewardedAd$1(this, continuation);
            }
        } else {
            chartboostAdapter$showRewardedAd$1 = new ChartboostAdapter$showRewardedAd$1(this, continuation);
        }
        Object objP = chartboostAdapter$showRewardedAd$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = chartboostAdapter$showRewardedAd$1.label;
        if (i3 == 0) {
            ResultKt.b(objP);
            Object ad = partnerAd.getAd();
            if (ad == null) {
                PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.SHOW_FAILED, "Ad is null.");
                return ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_SHOW_FAILURE_AD_NOT_FOUND));
            }
            Rewarded rewarded = ad instanceof Rewarded ? (Rewarded) ad : null;
            if (rewarded != null) {
                chartboostAdapter$showRewardedAd$1.L$0 = this;
                chartboostAdapter$showRewardedAd$1.L$1 = partnerAd;
                chartboostAdapter$showRewardedAd$1.L$2 = rewarded;
                chartboostAdapter$showRewardedAd$1.L$3 = chartboostAdapter$showRewardedAd$1;
                chartboostAdapter$showRewardedAd$1.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(chartboostAdapter$showRewardedAd$1));
                cancellableContinuationImpl.q();
                final WeakReference weakReference = new WeakReference(cancellableContinuationImpl);
                onShowSuccess = new Function0<Unit>() { // from class: com.chartboost.mediation.chartboostadapter.ChartboostAdapter$showRewardedAd$2$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m182invoke();
                        return Unit.f43263a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m182invoke() {
                        PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, PartnerLogController.PartnerAdapterEvents.SHOW_SUCCEEDED, null, 2, null);
                        ChartboostAdapter.showRewardedAd_gIAlu_s$lambda$17$lambda$15$lambda$14$resumeOnce$13(weakReference, this, partnerAd);
                    }
                };
                onShowError = new Function2<ShowEvent, ShowError, Unit>() { // from class: com.chartboost.mediation.chartboostadapter.ChartboostAdapter$showRewardedAd$2$1$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((ShowEvent) obj, (ShowError) obj2);
                        return Unit.f43263a;
                    }

                    public final void invoke(ShowEvent event, ShowError error) {
                        Intrinsics.f(event, "event");
                        Intrinsics.f(error, "error");
                        PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.SHOW_FAILED, "Location: " + event.getAd().getLocation() + ". Error: " + error.getCode());
                        ChartboostAdapter.showRewardedAd_gIAlu_s$lambda$17$lambda$15$lambda$14$resumeOnce$13(weakReference, this, ResultKt.a(new ChartboostMediationAdException(ChartboostAdapter.INSTANCE.getChartboostMediationError$ChartboostAdapter_remoteRelease(error))));
                    }
                };
                rewarded.show();
                objP = cancellableContinuationImpl.p();
                if (objP == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.SHOW_FAILED, "Ad is not Rewarded.");
            return ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_SHOW_FAILURE_WRONG_RESOURCE_TYPE));
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objP);
        Result result = (Result) objP;
        if (result != null) {
            return result.X;
        }
        PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.SHOW_FAILED, "Ad is not Rewarded.");
        return ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_SHOW_FAILURE_WRONG_RESOURCE_TYPE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRewardedAd_gIAlu_s$lambda$17$lambda$15$lambda$14$resumeOnce$13(WeakReference<CancellableContinuation<Result<PartnerAd>>> weakReference, ChartboostAdapter chartboostAdapter, Object obj) {
        Unit unit;
        CancellableContinuation<Result<PartnerAd>> cancellableContinuation = weakReference.get();
        if (cancellableContinuation != null) {
            if (cancellableContinuation.isActive()) {
                cancellableContinuation.resumeWith(new Result(obj));
            }
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            PartnerLogController.INSTANCE.log(PartnerLogController.PartnerAdapterEvents.SHOW_FAILED, "Unable to resume continuation for show. Continuation is null.");
        }
    }

    @Override // com.chartboost.heliumsdk.domain.PartnerAdapter
    public Object fetchBidderInformation(Context context, PreBidRequest preBidRequest, Continuation<? super Map<String, String>> continuation) {
        PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, PartnerLogController.PartnerAdapterEvents.BIDDER_INFO_FETCH_STARTED, null, 2, null);
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        return BuildersKt.f(DefaultIoScheduler.f45062Y, new AnonymousClass2(null), continuation);
    }

    @Override // com.chartboost.heliumsdk.domain.PartnerAdapter
    public String getAdapterVersion() {
        return BuildConfig.CHARTBOOST_MEDIATION_CHARTBOOST_ADAPTER_VERSION;
    }

    @Override // com.chartboost.heliumsdk.domain.PartnerAdapter
    public String getPartnerDisplayName() {
        return "Chartboost";
    }

    @Override // com.chartboost.heliumsdk.domain.PartnerAdapter
    public String getPartnerId() {
        return "chartboost";
    }

    @Override // com.chartboost.heliumsdk.domain.PartnerAdapter
    public String getPartnerSdkVersion() {
        return Chartboost.getSDKVersion();
    }

    @Override // com.chartboost.heliumsdk.domain.PartnerAdapter
    /* JADX INFO: renamed from: invalidate-gIAlu-s */
    public Object mo164invalidategIAlus(PartnerAd partnerAd, Continuation<? super Result<PartnerAd>> continuation) {
        PartnerLogController.Companion companion = PartnerLogController.INSTANCE;
        PartnerLogController.Companion.log$default(companion, PartnerLogController.PartnerAdapterEvents.INVALIDATE_STARTED, null, 2, null);
        String key = partnerAd.getRequest().getFormat().getKey();
        if (Intrinsics.a(key, AdFormat.BANNER.getKey()) ? true : Intrinsics.a(key, "adaptive_banner")) {
            return m174destroyBannerAdIoAF18A(partnerAd);
        }
        if (Intrinsics.a(key, AdFormat.INTERSTITIAL.getKey()) ? true : Intrinsics.a(key, AdFormat.REWARDED.getKey())) {
            PartnerLogController.Companion.log$default(companion, PartnerLogController.PartnerAdapterEvents.INVALIDATE_SUCCEEDED, null, 2, null);
            return partnerAd;
        }
        PartnerLogController.Companion.log$default(companion, PartnerLogController.PartnerAdapterEvents.INVALIDATE_SUCCEEDED, null, 2, null);
        return partnerAd;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.chartboost.heliumsdk.domain.PartnerAdapter
    /* JADX INFO: renamed from: load-BWLJW6A */
    public Object mo165loadBWLJW6A(Context context, PartnerAdLoadRequest partnerAdLoadRequest, PartnerAdListener partnerAdListener, Continuation<? super Result<PartnerAd>> continuation) {
        ChartboostAdapter$load$1 chartboostAdapter$load$1;
        if (continuation instanceof ChartboostAdapter$load$1) {
            chartboostAdapter$load$1 = (ChartboostAdapter$load$1) continuation;
            int i2 = chartboostAdapter$load$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chartboostAdapter$load$1.label = i2 - Integer.MIN_VALUE;
            } else {
                chartboostAdapter$load$1 = new ChartboostAdapter$load$1(this, continuation);
            }
        } else {
            chartboostAdapter$load$1 = new ChartboostAdapter$load$1(this, continuation);
        }
        Object obj = chartboostAdapter$load$1.result;
        Object obj2 = CoroutineSingletons.X;
        int i3 = chartboostAdapter$load$1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.b(obj);
                return ((Result) obj).X;
            }
            if (i3 == 2) {
                ResultKt.b(obj);
                return ((Result) obj).X;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return ((Result) obj).X;
        }
        ResultKt.b(obj);
        PartnerLogController.Companion companion = PartnerLogController.INSTANCE;
        PartnerLogController.Companion.log$default(companion, PartnerLogController.PartnerAdapterEvents.LOAD_STARTED, null, 2, null);
        String key = partnerAdLoadRequest.getFormat().getKey();
        if (Intrinsics.a(key, AdFormat.BANNER.getKey()) ? true : Intrinsics.a(key, "adaptive_banner")) {
            chartboostAdapter$load$1.label = 1;
            Object objM175loadBannerAdBWLJW6A = m175loadBannerAdBWLJW6A(context, partnerAdLoadRequest, partnerAdListener, chartboostAdapter$load$1);
            if (objM175loadBannerAdBWLJW6A != obj2) {
                return objM175loadBannerAdBWLJW6A;
            }
        } else if (Intrinsics.a(key, AdFormat.INTERSTITIAL.getKey())) {
            chartboostAdapter$load$1.label = 2;
            Object objM176loadInterstitialAd0E7RQCE = m176loadInterstitialAd0E7RQCE(partnerAdLoadRequest, partnerAdListener, chartboostAdapter$load$1);
            if (objM176loadInterstitialAd0E7RQCE != obj2) {
                return objM176loadInterstitialAd0E7RQCE;
            }
        } else {
            if (!Intrinsics.a(key, AdFormat.REWARDED.getKey())) {
                PartnerLogController.Companion.log$default(companion, PartnerLogController.PartnerAdapterEvents.LOAD_FAILED, null, 2, null);
                return ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_LOAD_FAILURE_UNSUPPORTED_AD_FORMAT));
            }
            chartboostAdapter$load$1.label = 3;
            Object objM177loadRewardedAd0E7RQCE = m177loadRewardedAd0E7RQCE(partnerAdLoadRequest, partnerAdListener, chartboostAdapter$load$1);
            if (objM177loadRewardedAd0E7RQCE != obj2) {
                return objM177loadRewardedAd0E7RQCE;
            }
        }
        return obj2;
    }

    @Override // com.chartboost.heliumsdk.domain.PartnerAdapter
    public void setCcpaConsent(Context context, boolean hasGrantedCcpaConsent, String privacyString) {
        Intrinsics.f(context, "context");
        Intrinsics.f(privacyString, "privacyString");
        if (hasGrantedCcpaConsent) {
            PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, PartnerLogController.PartnerAdapterEvents.CCPA_CONSENT_GRANTED, null, 2, null);
            Chartboost.addDataUseConsent(context, new CCPA(CCPA.CCPA_CONSENT.OPT_IN_SALE));
        } else {
            if (hasGrantedCcpaConsent) {
                return;
            }
            PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, PartnerLogController.PartnerAdapterEvents.CCPA_CONSENT_DENIED, null, 2, null);
            Chartboost.addDataUseConsent(context, new CCPA(CCPA.CCPA_CONSENT.OPT_OUT_SALE));
        }
    }

    @Override // com.chartboost.heliumsdk.domain.PartnerAdapter
    public void setGdpr(Context context, Boolean applies, GdprConsentStatus gdprConsentStatus) {
        PartnerLogController.PartnerAdapterEvents partnerAdapterEvents;
        PartnerLogController.PartnerAdapterEvents partnerAdapterEvents2;
        Intrinsics.f(context, "context");
        Intrinsics.f(gdprConsentStatus, "gdprConsentStatus");
        PartnerLogController.Companion companion = PartnerLogController.INSTANCE;
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.a(applies, bool)) {
            partnerAdapterEvents = PartnerLogController.PartnerAdapterEvents.GDPR_APPLICABLE;
        } else {
            partnerAdapterEvents = Intrinsics.a(applies, Boolean.FALSE) ? PartnerLogController.PartnerAdapterEvents.GDPR_NOT_APPLICABLE : PartnerLogController.PartnerAdapterEvents.GDPR_UNKNOWN;
        }
        PartnerLogController.Companion.log$default(companion, partnerAdapterEvents, null, 2, null);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[gdprConsentStatus.ordinal()];
        if (i2 == 1) {
            partnerAdapterEvents2 = PartnerLogController.PartnerAdapterEvents.GDPR_CONSENT_UNKNOWN;
        } else if (i2 == 2) {
            partnerAdapterEvents2 = PartnerLogController.PartnerAdapterEvents.GDPR_CONSENT_GRANTED;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            partnerAdapterEvents2 = PartnerLogController.PartnerAdapterEvents.GDPR_CONSENT_DENIED;
        }
        PartnerLogController.Companion.log$default(companion, partnerAdapterEvents2, null, 2, null);
        if (!Intrinsics.a(applies, bool)) {
            Chartboost.clearDataUseConsent(context, "gdpr");
            return;
        }
        int i3 = iArr[gdprConsentStatus.ordinal()];
        if (i3 == 2) {
            Chartboost.addDataUseConsent(context, new GDPR(GDPR.GDPR_CONSENT.BEHAVIORAL));
        } else if (i3 != 3) {
            Chartboost.clearDataUseConsent(context, "gdpr");
        } else {
            Chartboost.addDataUseConsent(context, new GDPR(GDPR.GDPR_CONSENT.NON_BEHAVIORAL));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.chartboost.heliumsdk.domain.PartnerAdapter
    /* JADX INFO: renamed from: setUp-0E7RQCE */
    public Object mo166setUp0E7RQCE(Context context, PartnerConfiguration partnerConfiguration, Continuation<? super Result<Unit>> continuation) {
        ChartboostAdapter$setUp$1 chartboostAdapter$setUp$1;
        if (continuation instanceof ChartboostAdapter$setUp$1) {
            chartboostAdapter$setUp$1 = (ChartboostAdapter$setUp$1) continuation;
            int i2 = chartboostAdapter$setUp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chartboostAdapter$setUp$1.label = i2 - Integer.MIN_VALUE;
            } else {
                chartboostAdapter$setUp$1 = new ChartboostAdapter$setUp$1(this, continuation);
            }
        } else {
            chartboostAdapter$setUp$1 = new ChartboostAdapter$setUp$1(this, continuation);
        }
        Object objF = chartboostAdapter$setUp$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = chartboostAdapter$setUp$1.label;
        if (i3 == 0) {
            ResultKt.b(objF);
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
            ChartboostAdapter$setUp$2 chartboostAdapter$setUp$2 = new ChartboostAdapter$setUp$2(partnerConfiguration, context, null);
            chartboostAdapter$setUp$1.label = 1;
            objF = BuildersKt.f(defaultIoScheduler, chartboostAdapter$setUp$2, chartboostAdapter$setUp$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        return ((Result) objF).X;
    }

    @Override // com.chartboost.heliumsdk.domain.PartnerAdapter
    public void setUserSubjectToCoppa(Context context, boolean isSubjectToCoppa) {
        Intrinsics.f(context, "context");
        PartnerLogController.Companion.log$default(PartnerLogController.INSTANCE, isSubjectToCoppa ? PartnerLogController.PartnerAdapterEvents.COPPA_SUBJECT : PartnerLogController.PartnerAdapterEvents.COPPA_NOT_SUBJECT, null, 2, null);
        Chartboost.addDataUseConsent(context, new COPPA(isSubjectToCoppa));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.chartboost.heliumsdk.domain.PartnerAdapter
    /* JADX INFO: renamed from: show-0E7RQCE */
    public Object mo167show0E7RQCE(Context context, PartnerAd partnerAd, Continuation<? super Result<PartnerAd>> continuation) throws Throwable {
        ChartboostAdapter$show$1 chartboostAdapter$show$1;
        if (continuation instanceof ChartboostAdapter$show$1) {
            chartboostAdapter$show$1 = (ChartboostAdapter$show$1) continuation;
            int i2 = chartboostAdapter$show$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chartboostAdapter$show$1.label = i2 - Integer.MIN_VALUE;
            } else {
                chartboostAdapter$show$1 = new ChartboostAdapter$show$1(this, continuation);
            }
        } else {
            chartboostAdapter$show$1 = new ChartboostAdapter$show$1(this, continuation);
        }
        Object obj = chartboostAdapter$show$1.result;
        Object obj2 = CoroutineSingletons.X;
        int i3 = chartboostAdapter$show$1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.b(obj);
                return ((Result) obj).X;
            }
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return ((Result) obj).X;
        }
        ResultKt.b(obj);
        PartnerLogController.Companion companion = PartnerLogController.INSTANCE;
        PartnerLogController.Companion.log$default(companion, PartnerLogController.PartnerAdapterEvents.SHOW_STARTED, null, 2, null);
        String key = partnerAd.getRequest().getFormat().getKey();
        if (Intrinsics.a(key, AdFormat.BANNER.getKey()) ? true : Intrinsics.a(key, "adaptive_banner")) {
            PartnerLogController.Companion.log$default(companion, PartnerLogController.PartnerAdapterEvents.SHOW_SUCCEEDED, null, 2, null);
            return partnerAd;
        }
        if (Intrinsics.a(key, AdFormat.INTERSTITIAL.getKey())) {
            chartboostAdapter$show$1.label = 1;
            Object objM178showInterstitialAdgIAlus = m178showInterstitialAdgIAlus(partnerAd, chartboostAdapter$show$1);
            if (objM178showInterstitialAdgIAlus != obj2) {
                return objM178showInterstitialAdgIAlus;
            }
        } else {
            if (!Intrinsics.a(key, AdFormat.REWARDED.getKey())) {
                PartnerLogController.Companion.log$default(companion, PartnerLogController.PartnerAdapterEvents.SHOW_FAILED, null, 2, null);
                return ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_SHOW_FAILURE_UNSUPPORTED_AD_FORMAT));
            }
            chartboostAdapter$show$1.label = 2;
            Object objM179showRewardedAdgIAlus = m179showRewardedAdgIAlus(partnerAd, chartboostAdapter$show$1);
            if (objM179showRewardedAdgIAlus != obj2) {
                return objM179showRewardedAdgIAlus;
            }
        }
        return obj2;
    }
}
