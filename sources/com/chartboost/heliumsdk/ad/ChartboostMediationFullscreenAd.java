package com.chartboost.heliumsdk.ad;

import android.content.Context;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.controllers.AdController;
import com.chartboost.heliumsdk.domain.AdFormat;
import com.chartboost.heliumsdk.domain.AdIdentifier;
import com.chartboost.heliumsdk.domain.AdInteractionListener;
import com.chartboost.heliumsdk.domain.AdLoadParams;
import com.chartboost.heliumsdk.domain.AppConfigStorage;
import com.chartboost.heliumsdk.domain.CachedAd;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.MetricsManager;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.network.Endpoints;
import com.chartboost.heliumsdk.network.model.MetricsRequestBody;
import com.chartboost.heliumsdk.utils.Environment;
import com.chartboost.heliumsdk.utils.HeliumJsonKt;
import com.chartboost.heliumsdk.utils.JsonTranslatorKt;
import com.chartboost.heliumsdk.utils.LogController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 :2\u00020\u0001:\u0001:BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0006\u0010-\u001a\u00020.J\b\u0010/\u001a\u000200H\u0002J\u0019\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203H\u0086@ø\u0001\u0000¢\u0006\u0002\u00104J!\u00105\u001a\u00020*2\u0006\u00102\u001a\u0002032\u0006\u00106\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u00107J\u0016\u00108\u001a\u00020.2\u0006\u00102\u001a\u0002032\u0006\u0010\u0004\u001a\u000209R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAd;", "", "cachedAd", "Lcom/chartboost/heliumsdk/domain/CachedAd;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdListener;", "request", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationAdLoadRequest;", "loadId", "", "winningBidInfo", "", "adController", "Lcom/chartboost/heliumsdk/controllers/AdController;", "(Lcom/chartboost/heliumsdk/domain/CachedAd;Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdListener;Lcom/chartboost/heliumsdk/ad/ChartboostMediationAdLoadRequest;Ljava/lang/String;Ljava/util/Map;Lcom/chartboost/heliumsdk/controllers/AdController;)V", "getCachedAd", "()Lcom/chartboost/heliumsdk/domain/CachedAd;", "setCachedAd", "(Lcom/chartboost/heliumsdk/domain/CachedAd;)V", "value", "customData", "getCustomData", "()Ljava/lang/String;", "setCustomData", "(Ljava/lang/String;)V", "getListener", "()Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdListener;", "setListener", "(Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdListener;)V", "getLoadId", "setLoadId", "getRequest", "()Lcom/chartboost/heliumsdk/ad/ChartboostMediationAdLoadRequest;", "setRequest", "(Lcom/chartboost/heliumsdk/ad/ChartboostMediationAdLoadRequest;)V", "showRequest", "Lkotlinx/coroutines/Job;", "getWinningBidInfo", "()Ljava/util/Map;", "setWinningBidInfo", "(Ljava/util/Map;)V", "createFailureShowResult", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationAdShowResult;", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "invalidate", "", "isShowInProgress", "", "show", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showAd", "showingAd", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/CachedAd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showFullscreenAdFromJava", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdShowListener;", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChartboostMediationFullscreenAd {
    private static final int CUSTOM_DATA_MAX_CHAR = 1000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AdController adController;
    private CachedAd cachedAd;
    private String customData;
    private ChartboostMediationFullscreenAdListener listener;
    private String loadId;
    private ChartboostMediationAdLoadRequest request;
    private Job showRequest;
    private Map<String, String> winningBidInfo;

    @Metadata(d1 = {"\u0000\u008d\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000*\u0001\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\tJ2\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J,\u0010\u0013\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J*\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010\u001e\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\u00122\u0006\u0010\f\u001a\u00020\rH\u0002J\u001b\u0010$\u001a\u00020%2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010'H\u0002ø\u0001\u0000J\u001d\u0010(\u001a\u0004\u0018\u00010\u00182\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010'H\u0002ø\u0001\u0000JA\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0080@ø\u0001\u0000¢\u0006\u0004\b,\u0010-JH\u0010.\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010'0/2\u0006\u0010*\u001a\u00020+2\u0006\u00100\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0002\u00101J,\u00102\u001a\u000203*\u00020\b2\u0006\u0010\u0007\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAd$Companion;", "", "()V", "CUSTOM_DATA_MAX_CHAR", "", "createAdInteractionListener", "com/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAd$Companion$createAdInteractionListener$1", "ad", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAd;", "(Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAd;)Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAd$Companion$createAdInteractionListener$1;", "createAdLoadParams", "Lcom/chartboost/heliumsdk/domain/AdLoadParams;", "request", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationAdLoadRequest;", "loadId", "", "queueId", "adFormat", "Lcom/chartboost/heliumsdk/domain/AdFormat;", "createAdLoadResult", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdLoadResult;", "payloadJson", "Lorg/json/JSONObject;", "error", "Lcom/chartboost/heliumsdk/domain/ChartboostMediationError;", "createChartboostMediationFullscreenAd", "adController", "Lcom/chartboost/heliumsdk/controllers/AdController;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdListener;", "createPayloadJson", "metricsSet", "", "Lcom/chartboost/heliumsdk/domain/Metrics;", "generateLoadId", "getAdFormat", "getCachedAd", "Lcom/chartboost/heliumsdk/domain/CachedAd;", "loadResult", "Lkotlin/Result;", "getError", "loadFullscreenAd", "context", "Landroid/content/Context;", "loadFullscreenAd$Helium_release", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/ad/ChartboostMediationAdLoadRequest;Lcom/chartboost/heliumsdk/controllers/AdController;Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdListener;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performAdLoad", "Lkotlin/Pair;", "adLoadParams", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/AdLoadParams;Lcom/chartboost/heliumsdk/controllers/AdController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAdDetails", "", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAd$Companion$createAdInteractionListener$1] */
        private final ChartboostMediationFullscreenAd$Companion$createAdInteractionListener$1 createAdInteractionListener(final ChartboostMediationFullscreenAd ad) {
            return new AdInteractionListener() { // from class: com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAd$Companion$createAdInteractionListener$1
                @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                public void onClicked(PartnerAd partnerAd) {
                    Unit unit;
                    Intrinsics.f(partnerAd, "partnerAd");
                    ChartboostMediationFullscreenAdListener listener = ad.getListener();
                    if (listener != null) {
                        listener.onAdClicked(ad);
                        unit = Unit.f43263a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        LogController.INSTANCE.e("Unable to notify onAdClicked() because listener is null");
                    }
                }

                @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                public void onDismissed(PartnerAd partnerAd, ChartboostMediationAdException error) {
                    Unit unit;
                    Intrinsics.f(partnerAd, "partnerAd");
                    HeliumSdk.INSTANCE.getChartboostMediationInternal$Helium_release().getFullscreenAdShowingState().notifyFullscreenAdClosed();
                    ChartboostMediationFullscreenAdListener listener = ad.getListener();
                    if (listener != null) {
                        listener.onAdClosed(ad, error);
                        unit = Unit.f43263a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        LogController.INSTANCE.e("Unable to notify onAdClosed() because listener is null");
                    }
                    ad.showRequest = null;
                    ad.invalidate();
                }

                @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                public void onExpired(PartnerAd partnerAd) {
                    Unit unit;
                    Intrinsics.f(partnerAd, "partnerAd");
                    ChartboostMediationFullscreenAdListener listener = ad.getListener();
                    if (listener != null) {
                        listener.onAdExpired(ad);
                        unit = Unit.f43263a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        LogController.INSTANCE.e("Unable to notify onAdExpired() because listener is null");
                    }
                    ad.showRequest = null;
                    ad.invalidate();
                }

                @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                public void onImpressionTracked(PartnerAd partnerAd) {
                    Intrinsics.f(partnerAd, "partnerAd");
                }

                @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
                public void onRewarded(PartnerAd partnerAd) {
                    Unit unit;
                    Intrinsics.f(partnerAd, "partnerAd");
                    ChartboostMediationFullscreenAdListener listener = ad.getListener();
                    if (listener != null) {
                        listener.onAdRewarded(ad);
                        unit = Unit.f43263a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        LogController.INSTANCE.e("Unable to notify onAdRewarded() because listener is null");
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AdLoadParams createAdLoadParams(ChartboostMediationFullscreenAd ad, ChartboostMediationAdLoadRequest request, String loadId, String queueId, AdFormat adFormat) {
            return new AdLoadParams(new AdIdentifier(AdFormat.INSTANCE.toAdType(adFormat), request.getPlacementName()), request.getKeywords(), loadId, queueId, null, createAdInteractionListener(ad));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ChartboostMediationFullscreenAdLoadResult createAdLoadResult(ChartboostMediationFullscreenAd ad, String loadId, JSONObject payloadJson, ChartboostMediationError error) {
            return new ChartboostMediationFullscreenAdLoadResult(ad, loadId, payloadJson, error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ChartboostMediationFullscreenAd createChartboostMediationFullscreenAd(String loadId, ChartboostMediationAdLoadRequest request, AdController adController, ChartboostMediationFullscreenAdListener listener) {
            return new ChartboostMediationFullscreenAd(null, listener, request, loadId, null, adController, 16, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final JSONObject createPayloadJson(Set<Metrics> metricsSet) {
            return JsonTranslatorKt.toJSONObject(JsonElementKt.getJsonObject(TreeJsonEncoderKt.writeJson(HeliumJsonKt.getHeliumJson(), MetricsManager.INSTANCE.buildMetricsDataRequestBody$Helium_release(metricsSet, (126 & 2) != 0 ? "" : null, (126 & 4) != 0 ? null : null, (126 & 8) != 0 ? null : null, (126 & 16) != 0 ? null : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? null : null), MetricsRequestBody.INSTANCE.serializer())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String generateLoadId() {
            return Environment.INSTANCE.getSessionId$Helium_release() + System.currentTimeMillis();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AdFormat getAdFormat(ChartboostMediationAdLoadRequest request) {
            Map<String, AdFormat> placementsToAdFormats = AppConfigStorage.INSTANCE.getPlacementsToAdFormats();
            if (placementsToAdFormats != null) {
                return placementsToAdFormats.get(request.getPlacementName());
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CachedAd getCachedAd(Result<CachedAd> loadResult) throws ChartboostMediationAdException {
            if (loadResult != null) {
                Object obj = loadResult.X;
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                CachedAd cachedAd = (CachedAd) obj;
                if (cachedAd != null) {
                    return cachedAd;
                }
            }
            throw new ChartboostMediationAdException(ChartboostMediationError.CM_LOAD_FAILURE_CHARTBOOST_MEDIATION_NOT_INITIALIZED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ChartboostMediationError getError(Result<CachedAd> loadResult) {
            if (loadResult == null) {
                return ChartboostMediationError.CM_LOAD_FAILURE_CHARTBOOST_MEDIATION_NOT_INITIALIZED;
            }
            Object obj = loadResult.X;
            Throwable thA = Result.a(obj);
            if (thA != null) {
                return thA instanceof ChartboostMediationAdException ? ((ChartboostMediationAdException) thA).getChartboostMediationError() : ChartboostMediationError.CM_LOAD_FAILURE_EXCEPTION;
            }
            return null;
        }

        public static /* synthetic */ Object loadFullscreenAd$Helium_release$default(Companion companion, Context context, ChartboostMediationAdLoadRequest chartboostMediationAdLoadRequest, AdController adController, ChartboostMediationFullscreenAdListener chartboostMediationFullscreenAdListener, String str, Continuation continuation, int i2, Object obj) {
            if ((i2 & 16) != 0) {
                str = null;
            }
            return companion.loadFullscreenAd$Helium_release(context, chartboostMediationAdLoadRequest, adController, chartboostMediationFullscreenAdListener, str, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        public final Object performAdLoad(Context context, AdLoadParams adLoadParams, AdController adController, Continuation<? super Pair<? extends Set<Metrics>, Result<CachedAd>>> continuation) {
            ChartboostMediationFullscreenAd$Companion$performAdLoad$1 chartboostMediationFullscreenAd$Companion$performAdLoad$1;
            Ref.ObjectRef objectRef;
            Set set;
            if (continuation instanceof ChartboostMediationFullscreenAd$Companion$performAdLoad$1) {
                chartboostMediationFullscreenAd$Companion$performAdLoad$1 = (ChartboostMediationFullscreenAd$Companion$performAdLoad$1) continuation;
                int i2 = chartboostMediationFullscreenAd$Companion$performAdLoad$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chartboostMediationFullscreenAd$Companion$performAdLoad$1.label = i2 - Integer.MIN_VALUE;
                } else {
                    chartboostMediationFullscreenAd$Companion$performAdLoad$1 = new ChartboostMediationFullscreenAd$Companion$performAdLoad$1(this, continuation);
                }
            } else {
                chartboostMediationFullscreenAd$Companion$performAdLoad$1 = new ChartboostMediationFullscreenAd$Companion$performAdLoad$1(this, continuation);
            }
            Object obj = chartboostMediationFullscreenAd$Companion$performAdLoad$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i3 = chartboostMediationFullscreenAd$Companion$performAdLoad$1.label;
            if (i3 == 0) {
                ResultKt.b(obj);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                Job jobC = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new ChartboostMediationFullscreenAd$Companion$performAdLoad$lambda$2$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X, objectRef2), null, new ChartboostMediationFullscreenAd$Companion$performAdLoad$2$2(objectRef2, adController, context, adLoadParams, linkedHashSet, null), 2);
                chartboostMediationFullscreenAd$Companion$performAdLoad$1.L$0 = linkedHashSet;
                chartboostMediationFullscreenAd$Companion$performAdLoad$1.L$1 = objectRef2;
                chartboostMediationFullscreenAd$Companion$performAdLoad$1.L$2 = jobC;
                chartboostMediationFullscreenAd$Companion$performAdLoad$1.label = 1;
                if (((JobSupport) jobC).n(chartboostMediationFullscreenAd$Companion$performAdLoad$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                objectRef = objectRef2;
                set = linkedHashSet;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) chartboostMediationFullscreenAd$Companion$performAdLoad$1.L$1;
                set = (Set) chartboostMediationFullscreenAd$Companion$performAdLoad$1.L$0;
                ResultKt.b(obj);
            }
            return new Pair(set, objectRef.X);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateAdDetails(ChartboostMediationFullscreenAd chartboostMediationFullscreenAd, CachedAd cachedAd, String str, ChartboostMediationFullscreenAdListener chartboostMediationFullscreenAdListener, ChartboostMediationAdLoadRequest chartboostMediationAdLoadRequest) {
            chartboostMediationFullscreenAd.setCachedAd(cachedAd);
            chartboostMediationFullscreenAd.setLoadId(str);
            chartboostMediationFullscreenAd.setListener(chartboostMediationFullscreenAdListener);
            chartboostMediationFullscreenAd.setRequest(chartboostMediationAdLoadRequest);
            chartboostMediationFullscreenAd.setWinningBidInfo(cachedAd.getWinningBidInfo());
            chartboostMediationFullscreenAd.setCustomData(cachedAd.getCustomData());
        }

        public final Object loadFullscreenAd$Helium_release(Context context, ChartboostMediationAdLoadRequest chartboostMediationAdLoadRequest, AdController adController, ChartboostMediationFullscreenAdListener chartboostMediationFullscreenAdListener, String str, Continuation<? super ChartboostMediationFullscreenAdLoadResult> continuation) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            return BuildersKt.f(MainDispatcherLoader.f45042a, new ChartboostMediationFullscreenAd$Companion$loadFullscreenAd$2(chartboostMediationAdLoadRequest, adController, chartboostMediationFullscreenAdListener, str, context, null), continuation);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAd$showAd$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAd", f = "ChartboostMediationFullscreenAd.kt", l = {356}, m = "showAd")
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChartboostMediationFullscreenAd.this.showAd(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAd$showAd$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAd$showAd$3", f = "ChartboostMediationFullscreenAd.kt", l = {345, 350}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Ref.ObjectRef<ChartboostMediationAdShowResult> $showResult;
        final /* synthetic */ CachedAd $showingAd;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ ChartboostMediationFullscreenAd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CachedAd cachedAd, ChartboostMediationFullscreenAd chartboostMediationFullscreenAd, Ref.ObjectRef<ChartboostMediationAdShowResult> objectRef, Context context, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$showingAd = cachedAd;
            this.this$0 = chartboostMediationFullscreenAd;
            this.$showResult = objectRef;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$showingAd, this.this$0, this.$showResult, this.$context, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00a2 A[PHI: r1
  0x00a2: PHI (r1v6 kotlin.jvm.internal.Ref$ObjectRef<com.chartboost.heliumsdk.ad.ChartboostMediationAdShowResult>) = 
  (r1v2 kotlin.jvm.internal.Ref$ObjectRef<com.chartboost.heliumsdk.ad.ChartboostMediationAdShowResult>)
  (r1v3 kotlin.jvm.internal.Ref$ObjectRef<com.chartboost.heliumsdk.ad.ChartboostMediationAdShowResult>)
  (r1v7 kotlin.jvm.internal.Ref$ObjectRef<com.chartboost.heliumsdk.ad.ChartboostMediationAdShowResult>)
 binds: [B:14:0x0053, B:20:0x006b, B:28:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef<ChartboostMediationAdShowResult> objectRef;
            CoroutineScope coroutineScope;
            ChartboostMediationAdShowResult chartboostMediationAdShowResultCreateFailureShowResult;
            Ref.ObjectRef<ChartboostMediationAdShowResult> objectRef2;
            ChartboostMediationAdShowResult chartboostMediationAdShowResult;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    objectRef = (Ref.ObjectRef) this.L$1;
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.b(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) this.L$3;
                    chartboostMediationAdShowResult = (ChartboostMediationAdShowResult) this.L$1;
                    ResultKt.b(obj);
                }
                chartboostMediationAdShowResultCreateFailureShowResult = chartboostMediationAdShowResult;
                objectRef = objectRef2;
                if (chartboostMediationAdShowResultCreateFailureShowResult == null) {
                    ChartboostMediationFullscreenAd chartboostMediationFullscreenAd = this.this$0;
                    chartboostMediationFullscreenAd.invalidate();
                    chartboostMediationAdShowResultCreateFailureShowResult = chartboostMediationFullscreenAd.createFailureShowResult(ChartboostMediationError.CM_SHOW_FAILURE_NOT_INITIALIZED);
                }
                objectRef.X = chartboostMediationAdShowResultCreateFailureShowResult;
                return Unit.f43263a;
            }
            ResultKt.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            CachedAd cachedAd = this.$showingAd;
            String customData = this.this$0.getCustomData();
            if (customData == null) {
                customData = "";
            }
            cachedAd.setCustomData(customData);
            objectRef = this.$showResult;
            AdController adController = this.this$0.adController;
            if (adController != null) {
                Context context = this.$context;
                CachedAd cachedAd2 = this.$showingAd;
                this.L$0 = coroutineScope2;
                this.L$1 = objectRef;
                this.label = 1;
                Object objShow = adController.show(context, cachedAd2, this);
                if (objShow != coroutineSingletons) {
                    coroutineScope = coroutineScope2;
                    obj = objShow;
                }
                return coroutineSingletons;
            }
            ChartboostMediationFullscreenAd chartboostMediationFullscreenAd2 = this.this$0;
            chartboostMediationFullscreenAd2.invalidate();
            chartboostMediationAdShowResultCreateFailureShowResult = chartboostMediationFullscreenAd2.createFailureShowResult(ChartboostMediationError.CM_SHOW_FAILURE_NOT_INITIALIZED);
            objectRef.X = chartboostMediationAdShowResultCreateFailureShowResult;
            return Unit.f43263a;
            chartboostMediationAdShowResultCreateFailureShowResult = (ChartboostMediationAdShowResult) obj;
            if (chartboostMediationAdShowResultCreateFailureShowResult != null) {
                ChartboostMediationFullscreenAd chartboostMediationFullscreenAd3 = this.this$0;
                if (chartboostMediationAdShowResultCreateFailureShowResult.getError() == null) {
                    DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                    Job jobC = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new ChartboostMediationFullscreenAd$showAd$3$1$1(chartboostMediationFullscreenAd3, null), 3);
                    this.L$0 = coroutineScope;
                    this.L$1 = chartboostMediationAdShowResultCreateFailureShowResult;
                    this.L$2 = jobC;
                    this.L$3 = objectRef;
                    this.label = 2;
                    if (((JobSupport) jobC).n(this) != coroutineSingletons) {
                        objectRef2 = objectRef;
                        chartboostMediationAdShowResult = chartboostMediationAdShowResultCreateFailureShowResult;
                        chartboostMediationAdShowResultCreateFailureShowResult = chartboostMediationAdShowResult;
                        objectRef = objectRef2;
                        if (chartboostMediationAdShowResultCreateFailureShowResult == null) {
                            ChartboostMediationFullscreenAd chartboostMediationFullscreenAd4 = this.this$0;
                            chartboostMediationFullscreenAd4.invalidate();
                            chartboostMediationAdShowResultCreateFailureShowResult = chartboostMediationFullscreenAd4.createFailureShowResult(ChartboostMediationError.CM_SHOW_FAILURE_NOT_INITIALIZED);
                        }
                    }
                    return coroutineSingletons;
                }
                if (chartboostMediationAdShowResultCreateFailureShowResult == null) {
                    ChartboostMediationFullscreenAd chartboostMediationFullscreenAd5 = this.this$0;
                    chartboostMediationFullscreenAd5.invalidate();
                    chartboostMediationAdShowResultCreateFailureShowResult = chartboostMediationFullscreenAd5.createFailureShowResult(ChartboostMediationError.CM_SHOW_FAILURE_NOT_INITIALIZED);
                }
            } else {
                ChartboostMediationFullscreenAd chartboostMediationFullscreenAd6 = this.this$0;
                chartboostMediationFullscreenAd6.invalidate();
                chartboostMediationAdShowResultCreateFailureShowResult = chartboostMediationFullscreenAd6.createFailureShowResult(ChartboostMediationError.CM_SHOW_FAILURE_NOT_INITIALIZED);
            }
            objectRef.X = chartboostMediationAdShowResultCreateFailureShowResult;
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAd$showFullscreenAdFromJava$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAd$showFullscreenAdFromJava$1", f = "ChartboostMediationFullscreenAd.kt", l = {275}, m = "invokeSuspend")
    public static final class C09831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ChartboostMediationFullscreenAdShowListener $listener;
        Object L$0;
        int label;
        final /* synthetic */ ChartboostMediationFullscreenAd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09831(ChartboostMediationFullscreenAdShowListener chartboostMediationFullscreenAdShowListener, ChartboostMediationFullscreenAd chartboostMediationFullscreenAd, Context context, Continuation<? super C09831> continuation) {
            super(2, continuation);
            this.$listener = chartboostMediationFullscreenAdShowListener;
            this.this$0 = chartboostMediationFullscreenAd;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C09831(this.$listener, this.this$0, this.$context, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChartboostMediationFullscreenAdShowListener chartboostMediationFullscreenAdShowListener;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                ChartboostMediationFullscreenAdShowListener chartboostMediationFullscreenAdShowListener2 = this.$listener;
                ChartboostMediationFullscreenAd chartboostMediationFullscreenAd = this.this$0;
                Context context = this.$context;
                this.L$0 = chartboostMediationFullscreenAdShowListener2;
                this.label = 1;
                Object objShow = chartboostMediationFullscreenAd.show(context, this);
                if (objShow == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chartboostMediationFullscreenAdShowListener = chartboostMediationFullscreenAdShowListener2;
                obj = objShow;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chartboostMediationFullscreenAdShowListener = (ChartboostMediationFullscreenAdShowListener) this.L$0;
                ResultKt.b(obj);
            }
            chartboostMediationFullscreenAdShowListener.onAdShown((ChartboostMediationAdShowResult) obj);
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09831) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    public ChartboostMediationFullscreenAd(CachedAd cachedAd, ChartboostMediationFullscreenAdListener chartboostMediationFullscreenAdListener, ChartboostMediationAdLoadRequest request, String loadId, Map<String, String> winningBidInfo, AdController adController) {
        Intrinsics.f(request, "request");
        Intrinsics.f(loadId, "loadId");
        Intrinsics.f(winningBidInfo, "winningBidInfo");
        this.cachedAd = cachedAd;
        this.listener = chartboostMediationFullscreenAdListener;
        this.request = request;
        this.loadId = loadId;
        this.winningBidInfo = winningBidInfo;
        this.adController = adController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartboostMediationAdShowResult createFailureShowResult(ChartboostMediationError error) {
        Metrics metrics = new Metrics(null, Endpoints.Sdk.Event.SHOW);
        metrics.setStart(Long.valueOf(System.currentTimeMillis()));
        metrics.setEnd(Long.valueOf(System.currentTimeMillis()));
        metrics.setDuration(0L);
        metrics.setSuccess(false);
        metrics.setChartboostMediationError(error);
        metrics.setChartboostMediationErrorMessage(error != null ? error.getMessage() : null);
        return new ChartboostMediationAdShowResult(JsonTranslatorKt.toJSONObject(JsonElementKt.getJsonObject(TreeJsonEncoderKt.writeJson(HeliumJsonKt.getHeliumJson(), MetricsManager.INSTANCE.buildMetricsDataRequestBody$Helium_release(SetsKt.h(metrics), (126 & 2) != 0 ? "" : null, (126 & 4) != 0 ? null : null, (126 & 8) != 0 ? null : null, (126 & 16) != 0 ? null : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? null : null), MetricsRequestBody.INSTANCE.serializer()))), error);
    }

    private final boolean isShowInProgress() {
        return this.showRequest != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object showAd(Context context, CachedAd cachedAd, Continuation<? super ChartboostMediationAdShowResult> continuation) {
        AnonymousClass1 anonymousClass1;
        Job jobC;
        ChartboostMediationFullscreenAd chartboostMediationFullscreenAd;
        Ref.ObjectRef objectRef;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.X = createFailureShowResult(ChartboostMediationError.CM_SHOW_FAILURE_UNKNOWN);
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            jobC = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new ChartboostMediationFullscreenAd$showAd$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X, objectRef2, this), null, new AnonymousClass3(cachedAd, this, objectRef2, context, null), 2);
            anonymousClass1.L$0 = objectRef2;
            anonymousClass1.L$1 = jobC;
            anonymousClass1.L$2 = this;
            anonymousClass1.label = 1;
            if (((JobSupport) jobC).n(anonymousClass1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            chartboostMediationFullscreenAd = this;
            objectRef = objectRef2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chartboostMediationFullscreenAd = (ChartboostMediationFullscreenAd) anonymousClass1.L$2;
            jobC = (Job) anonymousClass1.L$1;
            objectRef = (Ref.ObjectRef) anonymousClass1.L$0;
            ResultKt.b(obj);
        }
        chartboostMediationFullscreenAd.showRequest = jobC;
        return objectRef.X;
    }

    public final CachedAd getCachedAd() {
        return this.cachedAd;
    }

    public final String getCustomData() {
        return this.customData;
    }

    public final ChartboostMediationFullscreenAdListener getListener() {
        return this.listener;
    }

    public final String getLoadId() {
        return this.loadId;
    }

    public final ChartboostMediationAdLoadRequest getRequest() {
        return this.request;
    }

    public final Map<String, String> getWinningBidInfo() {
        return this.winningBidInfo;
    }

    public final void invalidate() {
        if (isShowInProgress()) {
            LogController.INSTANCE.d("Unable to invalidate ad because it is currently showing.");
            return;
        }
        this.listener = null;
        this.cachedAd = null;
        Job job = this.showRequest;
        if (job != null) {
            job.a(null);
        }
        this.showRequest = null;
    }

    public final void setCachedAd(CachedAd cachedAd) {
        this.cachedAd = cachedAd;
    }

    public final void setCustomData(String str) {
        if (str == null || str.length() <= 1000) {
            if (str != null) {
                CachedAd cachedAd = this.cachedAd;
                if (cachedAd != null) {
                    cachedAd.setCustomData(str);
                }
            }
            this.customData = str;
        }
        LogController.INSTANCE.w("Failed to set custom data. It is longer than the maximum limit of 1000 characters.");
        str = null;
        this.customData = str;
    }

    public final void setListener(ChartboostMediationFullscreenAdListener chartboostMediationFullscreenAdListener) {
        this.listener = chartboostMediationFullscreenAdListener;
    }

    public final void setLoadId(String str) {
        Intrinsics.f(str, "<set-?>");
        this.loadId = str;
    }

    public final void setRequest(ChartboostMediationAdLoadRequest chartboostMediationAdLoadRequest) {
        Intrinsics.f(chartboostMediationAdLoadRequest, "<set-?>");
        this.request = chartboostMediationAdLoadRequest;
    }

    public final void setWinningBidInfo(Map<String, String> map) {
        Intrinsics.f(map, "<set-?>");
        this.winningBidInfo = map;
    }

    public final Object show(Context context, Continuation<? super ChartboostMediationAdShowResult> continuation) {
        if (isShowInProgress()) {
            return createFailureShowResult(ChartboostMediationError.CM_SHOW_FAILURE_SHOW_IN_PROGRESS);
        }
        CachedAd cachedAd = this.cachedAd;
        if (cachedAd != null) {
            return showAd(context, cachedAd, continuation);
        }
        invalidate();
        return createFailureShowResult(ChartboostMediationError.CM_SHOW_FAILURE_AD_NOT_READY);
    }

    public final void showFullscreenAdFromJava(Context context, ChartboostMediationFullscreenAdShowListener listener) {
        Intrinsics.f(context, "context");
        Intrinsics.f(listener, "listener");
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new C09831(listener, this, context, null), 3);
    }

    public /* synthetic */ ChartboostMediationFullscreenAd(CachedAd cachedAd, ChartboostMediationFullscreenAdListener chartboostMediationFullscreenAdListener, ChartboostMediationAdLoadRequest chartboostMediationAdLoadRequest, String str, Map map, AdController adController, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cachedAd, chartboostMediationFullscreenAdListener, chartboostMediationAdLoadRequest, str, (i2 & 16) != 0 ? EmptyMap.X : map, adController);
    }
}
