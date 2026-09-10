package com.chartboost.heliumsdk.controllers;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.a;
import android.util.Size;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.applovin.shadow.okio.Segment;
import com.chartboost.heliumsdk.Ilrd;
import com.chartboost.heliumsdk.ad.ChartboostMediationAdShowResult;
import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.chartboost.heliumsdk.domain.AdFormat;
import com.chartboost.heliumsdk.domain.AdIdentifier;
import com.chartboost.heliumsdk.domain.AdInteractionListener;
import com.chartboost.heliumsdk.domain.AdLoadParams;
import com.chartboost.heliumsdk.domain.AppConfigStorage;
import com.chartboost.heliumsdk.domain.AuctionResult;
import com.chartboost.heliumsdk.domain.Bid;
import com.chartboost.heliumsdk.domain.Bids;
import com.chartboost.heliumsdk.domain.BidsResponse;
import com.chartboost.heliumsdk.domain.CachedAd;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.EventResult;
import com.chartboost.heliumsdk.domain.LoadRateLimiter;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.MetricsError;
import com.chartboost.heliumsdk.domain.MetricsManager;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.network.ChartboostMediationNetworking;
import com.chartboost.heliumsdk.network.Endpoints;
import com.chartboost.heliumsdk.network.model.ChartboostMediationNetworkingResult;
import com.chartboost.heliumsdk.network.model.MetricsRequestBody;
import com.chartboost.heliumsdk.utils.BackgroundTimeMonitorOperator;
import com.chartboost.heliumsdk.utils.BackgroundTimeMonitoring;
import com.chartboost.heliumsdk.utils.HeliumJsonKt;
import com.chartboost.heliumsdk.utils.JsonTranslatorKt;
import com.chartboost.heliumsdk.utils.LogController;
import com.thinkup.core.oo.n0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import okhttp3.Headers;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 =2\u00020\u0001:\u0001=B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u0002J\r\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\u000e\u0010\"\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001cJ@\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010/\u001a\u000200H\u0002J\"\u00101\u001a\u00020 2\u0006\u00102\u001a\u0002032\u0006\u0010/\u001a\u0002002\b\u00104\u001a\u0004\u0018\u000100H\u0002J!\u00105\u001a\u0002062\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@ø\u0001\u0002¢\u0006\u0002\u00107J*\u00108\u001a\u00020 2\u0006\u00109\u001a\u0002002\u0018\u0010:\u001a\u0014\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u0002000<0;H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006>"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/AdController;", "", "bidController", "Lcom/chartboost/heliumsdk/controllers/BidController;", "partnerController", "Lcom/chartboost/heliumsdk/controllers/PartnerController;", "privacyController", "Lcom/chartboost/heliumsdk/controllers/PrivacyController;", "loadRateLimiter", "Lcom/chartboost/heliumsdk/domain/LoadRateLimiter;", "backgroundTimeMonitor", "Lcom/chartboost/heliumsdk/utils/BackgroundTimeMonitoring;", n0.o.mo, "Lcom/chartboost/heliumsdk/Ilrd;", "(Lcom/chartboost/heliumsdk/controllers/BidController;Lcom/chartboost/heliumsdk/controllers/PartnerController;Lcom/chartboost/heliumsdk/controllers/PrivacyController;Lcom/chartboost/heliumsdk/domain/LoadRateLimiter;Lcom/chartboost/heliumsdk/utils/BackgroundTimeMonitoring;Lcom/chartboost/heliumsdk/Ilrd;)V", "bannerImpressionDepth", "", "interstitialImpressionDepth", "mainHandler", "Landroid/os/Handler;", "rewardedImpressionDepth", "rewardedInterstitialImpressionDepth", "createInteractionListener", "Lcom/chartboost/heliumsdk/domain/AdInteractionListener;", "bids", "Lcom/chartboost/heliumsdk/domain/Bids;", "adInteractionListener", "cachedAd", "Lcom/chartboost/heliumsdk/domain/CachedAd;", "getImpressionDepth", "adType", "incrementBannerImpressionDepth", "", "incrementBannerImpressionDepth$Helium_release", "invalidate", "load", "Lkotlin/Result;", "context", "Landroid/content/Context;", "adLoadParams", "Lcom/chartboost/heliumsdk/domain/AdLoadParams;", "metricsSet", "", "Lcom/chartboost/heliumsdk/domain/Metrics;", "load-BWLJW6A", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/AdLoadParams;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendAuctionWinnerRequest", "loadId", "", "sendLoadId", "adIdentifier", "Lcom/chartboost/heliumsdk/domain/AdIdentifier;", "queueId", "show", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationAdShowResult;", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/domain/CachedAd;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLoadRateLimiter", "placement", "headers", "", "", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BackgroundTimeMonitoring backgroundTimeMonitor;
    private int bannerImpressionDepth;
    private final BidController bidController;
    private final Ilrd ilrd;
    private int interstitialImpressionDepth;
    private final LoadRateLimiter loadRateLimiter;
    private final Handler mainHandler;
    private final PartnerController partnerController;
    private final PrivacyController privacyController;
    private int rewardedImpressionDepth;
    private int rewardedInterstitialImpressionDepth;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/AdController$Companion;", "", "()V", "adTypeToAdFormat", "Lcom/chartboost/heliumsdk/domain/AdFormat;", "adType", "", "adTypeToAdFormat$Helium_release", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AdFormat adTypeToAdFormat$Helium_release(int adType) {
            if (adType == 0) {
                return AdFormat.INTERSTITIAL;
            }
            if (adType == 1) {
                return AdFormat.REWARDED;
            }
            if (adType == 2) {
                return AdFormat.BANNER;
            }
            if (adType == 3) {
                return AdFormat.REWARDED_INTERSTITIAL;
            }
            if (adType == 4) {
                return AdFormat.ADAPTIVE_BANNER;
            }
            throw new IllegalArgumentException(a.h(adType, "Unknown AdType value: "));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.AdController$sendAuctionWinnerRequest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.AdController$sendAuctionWinnerRequest$1", f = "AdController.kt", l = {428}, m = "invokeSuspend")
    public static final class C09851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bids $bids;
        final /* synthetic */ String $loadId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09851(Bids bids, String str, Continuation<? super C09851> continuation) {
            super(2, continuation);
            this.$bids = bids;
            this.$loadId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C09851(this.$bids, this.$loadId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                ChartboostMediationNetworking chartboostMediationNetworking = ChartboostMediationNetworking.INSTANCE;
                Bids bids = this.$bids;
                String str = this.$loadId;
                this.label = 1;
                if (chartboostMediationNetworking.logAuctionWinner(bids, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09851) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.AdController$sendLoadId$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.AdController$sendLoadId$1", f = "AdController.kt", l = {339}, m = "invokeSuspend")
    public static final class C09861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AdIdentifier $adIdentifier;
        final /* synthetic */ String $loadId;
        final /* synthetic */ String $queueId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09861(AdIdentifier adIdentifier, String str, String str2, Continuation<? super C09861> continuation) {
            super(2, continuation);
            this.$adIdentifier = adIdentifier;
            this.$loadId = str;
            this.$queueId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C09861(this.$adIdentifier, this.$loadId, this.$queueId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                ChartboostMediationNetworking chartboostMediationNetworking = ChartboostMediationNetworking.INSTANCE;
                String placementName = this.$adIdentifier.getPlacementName();
                String placementType = this.$adIdentifier.getPlacementType();
                String str = this.$loadId;
                String str2 = this.$queueId;
                this.label = 1;
                if (chartboostMediationNetworking.trackAdLoad(placementName, placementType, str, str2, "new", this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09861) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.AdController$show$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.AdController", f = "AdController.kt", l = {355, 372}, m = "show")
    public static final class C09871 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C09871(Continuation<? super C09871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AdController.this.show(null, null, this);
        }
    }

    public AdController(BidController bidController, PartnerController partnerController, PrivacyController privacyController, LoadRateLimiter loadRateLimiter, BackgroundTimeMonitoring backgroundTimeMonitor, Ilrd ilrd) {
        Intrinsics.f(bidController, "bidController");
        Intrinsics.f(partnerController, "partnerController");
        Intrinsics.f(privacyController, "privacyController");
        Intrinsics.f(loadRateLimiter, "loadRateLimiter");
        Intrinsics.f(backgroundTimeMonitor, "backgroundTimeMonitor");
        Intrinsics.f(ilrd, "ilrd");
        this.bidController = bidController;
        this.partnerController = partnerController;
        this.privacyController = privacyController;
        this.loadRateLimiter = loadRateLimiter;
        this.backgroundTimeMonitor = backgroundTimeMonitor;
        this.ilrd = ilrd;
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    private final AdInteractionListener createInteractionListener(final Bids bids, final AdInteractionListener adInteractionListener, final CachedAd cachedAd) {
        return new AdInteractionListener() { // from class: com.chartboost.heliumsdk.controllers.AdController.createInteractionListener.1
            @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
            public void onClicked(PartnerAd partnerAd) {
                Intrinsics.f(partnerAd, "partnerAd");
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new AdController$createInteractionListener$1$onClicked$1(bids, cachedAd, null), 3);
                adInteractionListener.onClicked(partnerAd);
            }

            @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
            public void onDismissed(PartnerAd partnerAd, ChartboostMediationAdException error) {
                Intrinsics.f(partnerAd, "partnerAd");
                adInteractionListener.onDismissed(partnerAd, error);
            }

            @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
            public void onExpired(PartnerAd partnerAd) {
                Intrinsics.f(partnerAd, "partnerAd");
                adInteractionListener.onExpired(partnerAd);
            }

            @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
            public void onImpressionTracked(PartnerAd partnerAd) {
                Intrinsics.f(partnerAd, "partnerAd");
                adInteractionListener.onImpressionTracked(partnerAd);
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new AdController$createInteractionListener$1$onImpressionTracked$1(bids, cachedAd, null), 3);
            }

            @Override // com.chartboost.heliumsdk.domain.AdInteractionListener
            public void onRewarded(PartnerAd partnerAd) {
                Intrinsics.f(partnerAd, "partnerAd");
                if (partnerAd.getRequest().getFormat() != AdFormat.REWARDED && partnerAd.getRequest().getFormat() != AdFormat.REWARDED_INTERSTITIAL) {
                    LogController.INSTANCE.w("Received rewarded callback for non-rewarded placement. Ignoring.");
                    return;
                }
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new AdController$createInteractionListener$1$onRewarded$1(bids, cachedAd, null), 3);
                adInteractionListener.onRewarded(partnerAd);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getImpressionDepth(int adType) {
        if (adType == 0) {
            return this.interstitialImpressionDepth;
        }
        if (adType == 1) {
            return this.rewardedImpressionDepth;
        }
        if (adType == 2) {
            return this.bannerImpressionDepth;
        }
        if (adType != 3) {
            return adType != 4 ? this.bannerImpressionDepth : this.bannerImpressionDepth;
        }
        return this.rewardedInterstitialImpressionDepth;
    }

    private final void sendAuctionWinnerRequest(Bids bids, String loadId) {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new C09851(bids, loadId, null), 3);
    }

    private final void sendLoadId(AdIdentifier adIdentifier, String loadId, String queueId) {
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new C09861(adIdentifier, loadId, queueId, null), 3);
    }

    private final void updateLoadRateLimiter(String placement, Map<String, ? extends List<String>> headers) {
        String str;
        List<String> list = headers.get(ChartboostMediationNetworking.RATE_LIMIT_HEADER_KEY);
        if (list == null || (str = (String) CollectionsKt.y(list)) == null) {
            return;
        }
        try {
            this.loadRateLimiter.setLoadRateLimit(placement, Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            LogController.INSTANCE.w("Unable to retrieve rate limit on " + placement + " due to number format exception.");
        }
    }

    public final void incrementBannerImpressionDepth$Helium_release() {
        this.bannerImpressionDepth++;
    }

    public final void invalidate(CachedAd cachedAd) {
        Unit unit;
        Intrinsics.f(cachedAd, "cachedAd");
        PartnerAd partnerAd = cachedAd.getPartnerAd();
        if (partnerAd != null) {
            this.partnerController.routeInvalidate(partnerAd);
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            LogController.INSTANCE.d(ChartboostMediationError.CM_INVALIDATE_FAILURE_AD_NOT_FOUND.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x021e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0222  */
    /* JADX WARN: Code duplicated, block: B:57:0x022e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0231  */
    /* JADX WARN: Code duplicated, block: B:62:0x023a  */
    /* JADX WARN: Code duplicated, block: B:66:0x024c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0266  */
    /* JADX WARN: Code duplicated, block: B:69:0x026b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0282  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX INFO: renamed from: load-BWLJW6A, reason: not valid java name */
    public final Object m161loadBWLJW6A(Context context, AdLoadParams adLoadParams, Set<Metrics> set, Continuation<? super Result<CachedAd>> continuation) throws Throwable {
        AdController$load$1 adController$load$1;
        long jCurrentTimeMillis;
        Set<Metrics> set2;
        AdController adController;
        Context context2;
        BackgroundTimeMonitorOperator backgroundTimeMonitorOperator;
        String str;
        String str2;
        AuctionResult auctionResult;
        CachedAd cachedAd;
        Object objM162loadBidshUnOzRk;
        BackgroundTimeMonitorOperator backgroundTimeMonitorOperator2;
        AdLoadParams adLoadParams2;
        Set<Metrics> set3;
        long j;
        EventResult adLoadPartnerFailure;
        Throwable thA;
        ChartboostMediationAdException chartboostMediationAdException;
        ChartboostMediationError chartboostMediationError;
        Throwable thA2;
        Bid activeBid;
        JsonObject ilrd;
        AdLoadParams adLoadParams3 = adLoadParams;
        if (continuation instanceof AdController$load$1) {
            adController$load$1 = (AdController$load$1) continuation;
            int i2 = adController$load$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adController$load$1.label = i2 - Integer.MIN_VALUE;
            } else {
                adController$load$1 = new AdController$load$1(this, continuation);
            }
        } else {
            adController$load$1 = new AdController$load$1(this, continuation);
        }
        AdController$load$1 adController$load$2 = adController$load$1;
        Object obj = adController$load$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = adController$load$2.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            long jMillisUntilNextLoadIsAllowed = this.loadRateLimiter.millisUntilNextLoadIsAllowed(adLoadParams3.getAdIdentifier().getPlacementName());
            if (jMillisUntilNextLoadIsAllowed > 0 && AppConfigStorage.INSTANCE.getEnableRateLimiting()) {
                LogController logController = LogController.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append(adLoadParams3.getAdIdentifier().getPlacementName());
                sb.append(" has been rate limited. Please try again in ");
                long j2 = 1000;
                sb.append(jMillisUntilNextLoadIsAllowed / j2);
                sb.append('.');
                sb.append(jMillisUntilNextLoadIsAllowed % j2);
                sb.append(" seconds");
                logController.w(sb.toString());
                return ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_LOAD_FAILURE_RATE_LIMITED));
            }
            HeliumBannerAd.HeliumBannerSize bannerSize = adLoadParams3.getBannerSize();
            if (bannerSize != null) {
                Integer num = new Integer(bannerSize.getHeight());
                int iIntValue = num.intValue();
                if ((iIntValue >= 50 || iIntValue == 0) && iIntValue <= 1800) {
                    num = null;
                }
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    LogController.INSTANCE.w("Banner height must be at least 50 and no more than 1800. Banner height is " + iIntValue2 + '.');
                    return ResultKt.a(new ChartboostMediationAdException(ChartboostMediationError.CM_LOAD_FAILURE_INVALID_BANNER_SIZE));
                }
            }
            BackgroundTimeMonitorOperator backgroundTimeMonitorOperatorStartMonitoringOperation = this.backgroundTimeMonitor.startMonitoringOperation();
            jCurrentTimeMillis = System.currentTimeMillis();
            ProcessLifecycleOwner.j0.g0.a(backgroundTimeMonitorOperatorStartMonitoringOperation);
            if (AppConfigStorage.INSTANCE.getShouldNotifyLoads()) {
                sendLoadId(adLoadParams3.getAdIdentifier(), adLoadParams3.getLoadId(), adLoadParams3.getQueueId());
            }
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
            AdController$load$result$1 adController$load$result$1 = new AdController$load$result$1(this, adLoadParams3, context, null);
            adController$load$2.L$0 = this;
            adController$load$2.L$1 = context;
            adController$load$2.L$2 = adLoadParams3;
            set2 = set;
            adController$load$2.L$3 = set2;
            adController$load$2.L$4 = backgroundTimeMonitorOperatorStartMonitoringOperation;
            adController$load$2.J$0 = jCurrentTimeMillis;
            adController$load$2.label = 1;
            Object objF = BuildersKt.f(defaultIoScheduler, adController$load$result$1, adController$load$2);
            if (objF != coroutineSingletons) {
                adController = this;
                context2 = context;
                backgroundTimeMonitorOperator = backgroundTimeMonitorOperatorStartMonitoringOperation;
                obj = objF;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            long j3 = adController$load$2.J$0;
            BackgroundTimeMonitorOperator backgroundTimeMonitorOperator3 = (BackgroundTimeMonitorOperator) adController$load$2.L$4;
            Set<Metrics> set4 = (Set) adController$load$2.L$3;
            AdLoadParams adLoadParams4 = (AdLoadParams) adController$load$2.L$2;
            context2 = (Context) adController$load$2.L$1;
            AdController adController2 = (AdController) adController$load$2.L$0;
            ResultKt.b(obj);
            adController = adController2;
            set2 = set4;
            backgroundTimeMonitorOperator = backgroundTimeMonitorOperator3;
            adLoadParams3 = adLoadParams4;
            jCurrentTimeMillis = j3;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = adController$load$2.J$0;
            cachedAd = (CachedAd) adController$load$2.L$5;
            auctionResult = (AuctionResult) adController$load$2.L$4;
            backgroundTimeMonitorOperator2 = (BackgroundTimeMonitorOperator) adController$load$2.L$3;
            Set<Metrics> set5 = (Set) adController$load$2.L$2;
            AdLoadParams adLoadParams5 = (AdLoadParams) adController$load$2.L$1;
            AdController adController3 = (AdController) adController$load$2.L$0;
            ResultKt.b(obj);
            objM162loadBidshUnOzRk = ((Result) obj).X;
            adLoadParams2 = adLoadParams5;
            adController = adController3;
            set3 = set5;
        }
        MetricsManager metricsManager = MetricsManager.INSTANCE;
        String loadId = adLoadParams2.getLoadId();
        String queueId = adLoadParams2.getQueueId();
        Long l2 = new Long(j);
        Long l3 = new Long(backgroundTimeMonitorOperator2.backgroundTimeUntilNow());
        if (objM162loadBidshUnOzRk instanceof Result.Failure) {
            thA = Result.a(objM162loadBidshUnOzRk);
            if (thA instanceof ChartboostMediationAdException) {
                chartboostMediationAdException = (ChartboostMediationAdException) thA;
            } else {
                chartboostMediationAdException = null;
            }
            if (chartboostMediationAdException != null || (chartboostMediationError = chartboostMediationAdException.getChartboostMediationError()) == null) {
                chartboostMediationError = ChartboostMediationError.CM_LOAD_FAILURE_UNKNOWN;
            }
            adLoadPartnerFailure = new EventResult.AdLoadResult.AdLoadPartnerFailure(new MetricsError.SimpleError(chartboostMediationError));
        } else {
            adLoadPartnerFailure = EventResult.AdLoadResult.AdLoadSuccess.INSTANCE;
        }
        metricsManager.postMetricsData(set3, loadId, queueId, l2, l3, adLoadPartnerFailure);
        thA2 = Result.a(objM162loadBidshUnOzRk);
        if (thA2 == null) {
            return ResultKt.a(thA2);
        }
        cachedAd.setPartnerAd((PartnerAd) objM162loadBidshUnOzRk);
        cachedAd.setWinningBidInfo(auctionResult.getBids().getBidInfo());
        activeBid = auctionResult.getBids().getActiveBid();
        if (activeBid != null) {
            ilrd = activeBid.getIlrd();
        } else {
            ilrd = null;
        }
        cachedAd.setIlrdJson(ilrd);
        cachedAd.setLoadId(adLoadParams2.getLoadId());
        adController.sendAuctionWinnerRequest(auctionResult.getBids(), adLoadParams2.getLoadId());
        return cachedAd;
        ChartboostMediationNetworkingResult chartboostMediationNetworkingResult = (ChartboostMediationNetworkingResult) obj;
        ProcessLifecycleOwner.j0.g0.c(backgroundTimeMonitorOperator);
        if (!(chartboostMediationNetworkingResult instanceof ChartboostMediationNetworkingResult.Success)) {
            long j4 = jCurrentTimeMillis;
            String strSubstring = "";
            if (chartboostMediationNetworkingResult instanceof ChartboostMediationNetworkingResult.Failure) {
                ChartboostMediationNetworkingResult.Failure failure = (ChartboostMediationNetworkingResult.Failure) chartboostMediationNetworkingResult;
                if (failure.getError() != ChartboostMediationError.CM_LOAD_FAILURE_AUCTION_NO_BID && failure.getError() != ChartboostMediationError.CM_LOAD_FAILURE_RATE_LIMITED) {
                    LogController.INSTANCE.e(failure.getError().getMessage());
                }
                MetricsManager metricsManager2 = MetricsManager.INSTANCE;
                Endpoints.Sdk.Event event = Endpoints.Sdk.Event.LOAD;
                Headers headers = failure.getHeaders();
                String str3 = (headers == null || (str2 = headers.get(ChartboostMediationNetworking.AUCTION_ID_HEADER_KEY)) == null) ? "" : str2;
                ChartboostMediationError error = failure.getError();
                String message = failure.getError().getMessage();
                String placementType = adLoadParams3.getAdIdentifier().getPlacementType();
                long jBackgroundTimeUntilNow = backgroundTimeMonitorOperator.backgroundTimeUntilNow();
                HeliumBannerAd.HeliumBannerSize bannerSize2 = adLoadParams3.getBannerSize();
                metricsManager2.postMetricsDataForFailedEvent(null, event, str3, error, message, (14336 & 32) != 0 ? null : placementType, (14336 & 64) != 0 ? null : (bannerSize2 == null || !bannerSize2.isAdaptive()) ? null : new Size(adLoadParams3.getBannerSize().getWidth(), adLoadParams3.getBannerSize().getHeight()), (14336 & 128) != 0 ? null : new Long(j4), (14336 & 256) != 0 ? null : new Long(jBackgroundTimeUntilNow), (14336 & 512) != 0 ? null : adLoadParams3.getLoadId(), (14336 & 1024) != 0 ? null : new EventResult.AdLoadResult.AdLoadUnspecifiedFailure(new MetricsError.SimpleError(failure.getError())), (14336 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? null : null, (14336 & 4096) != 0 ? null : null, (14336 & Segment.SIZE) != 0 ? null : null);
                return ResultKt.a(new ChartboostMediationAdException(failure.getError()));
            }
            if (!(chartboostMediationNetworkingResult instanceof ChartboostMediationNetworkingResult.JsonParsingFailure)) {
                throw new NoWhenBranchMatchedException();
            }
            ChartboostMediationError chartboostMediationError2 = ChartboostMediationError.CM_LOAD_FAILURE_INVALID_BID_RESPONSE;
            ChartboostMediationNetworkingResult.JsonParsingFailure jsonParsingFailure = (ChartboostMediationNetworkingResult.JsonParsingFailure) chartboostMediationNetworkingResult;
            String message2 = jsonParsingFailure.getException().getMessage();
            if (message2 == null || (str = (String) StringsKt.K(message2, new char[]{'\n'}, 2).get(0)) == null) {
                str = "";
            }
            String message3 = jsonParsingFailure.getException().getMessage();
            if (message3 != null) {
                strSubstring = message3.substring(str.length());
                Intrinsics.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                if (StringsKt.M(strSubstring, "\nJSON input: ", false)) {
                    String strSubstring2 = strSubstring.substring(13);
                    Intrinsics.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strSubstring = strSubstring2;
                }
            }
            MetricsError.JsonParseError jsonParseError = new MetricsError.JsonParseError(chartboostMediationError2, jsonParsingFailure.getException(), str, strSubstring);
            MetricsManager metricsManager3 = MetricsManager.INSTANCE;
            Endpoints.Sdk.Event event2 = Endpoints.Sdk.Event.LOAD;
            String str4 = jsonParsingFailure.getHeaders().get(ChartboostMediationNetworking.AUCTION_ID_HEADER_KEY);
            String message4 = chartboostMediationError2.getMessage();
            String placementType2 = adLoadParams3.getAdIdentifier().getPlacementType();
            long jBackgroundTimeUntilNow2 = backgroundTimeMonitorOperator.backgroundTimeUntilNow();
            HeliumBannerAd.HeliumBannerSize bannerSize3 = adLoadParams3.getBannerSize();
            metricsManager3.postMetricsDataForFailedEvent(null, event2, str4, chartboostMediationError2, message4, (14336 & 32) != 0 ? null : placementType2, (14336 & 64) != 0 ? null : (bannerSize3 == null || !bannerSize3.isAdaptive()) ? null : new Size(adLoadParams3.getBannerSize().getWidth(), adLoadParams3.getBannerSize().getHeight()), (14336 & 128) != 0 ? null : new Long(j4), (14336 & 256) != 0 ? null : new Long(jBackgroundTimeUntilNow2), (14336 & 512) != 0 ? null : adLoadParams3.getLoadId(), (14336 & 1024) != 0 ? null : new EventResult.AdLoadResult.AdLoadJsonFailure(jsonParseError), (14336 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? null : null, (14336 & 4096) != 0 ? null : null, (14336 & Segment.SIZE) != 0 ? null : null);
            return ResultKt.a(new ChartboostMediationAdException(jsonParsingFailure.getError()));
        }
        ChartboostMediationNetworkingResult.Success success = (ChartboostMediationNetworkingResult.Success) chartboostMediationNetworkingResult;
        adController.updateLoadRateLimiter(adLoadParams3.getAdIdentifier().getPlacementName(), success.getHeaders().toMultimap());
        BidsResponse empty_bids_response = (BidsResponse) success.getBody();
        if (empty_bids_response == null) {
            empty_bids_response = BidsResponse.INSTANCE.getEMPTY_BIDS_RESPONSE();
        }
        auctionResult = new AuctionResult(new Bids(adLoadParams3, empty_bids_response), success.getHeaders().toMultimap(), null);
        cachedAd = new CachedAd(auctionResult.getBids().getAuctionId());
        BidController bidController = adController.bidController;
        Bids bids = auctionResult.getBids();
        HeliumBannerAd.HeliumBannerSize bannerSize4 = adLoadParams3.getBannerSize();
        AdInteractionListener adInteractionListenerCreateInteractionListener = adController.createInteractionListener(auctionResult.getBids(), adLoadParams3.getAdInteractionListener(), cachedAd);
        adController$load$2.L$0 = adController;
        adController$load$2.L$1 = adLoadParams3;
        adController$load$2.L$2 = set2;
        adController$load$2.L$3 = backgroundTimeMonitorOperator;
        adController$load$2.L$4 = auctionResult;
        adController$load$2.L$5 = cachedAd;
        adController$load$2.J$0 = jCurrentTimeMillis;
        adController$load$2.label = 2;
        long j5 = jCurrentTimeMillis;
        objM162loadBidshUnOzRk = bidController.m162loadBidshUnOzRk(context2, bids, bannerSize4, adInteractionListenerCreateInteractionListener, set2, adController$load$2);
        if (objM162loadBidshUnOzRk != coroutineSingletons) {
            backgroundTimeMonitorOperator2 = backgroundTimeMonitorOperator;
            adLoadParams2 = adLoadParams3;
            set3 = set2;
            j = j5;
            MetricsManager metricsManager4 = MetricsManager.INSTANCE;
            String loadId2 = adLoadParams2.getLoadId();
            String queueId2 = adLoadParams2.getQueueId();
            Long l4 = new Long(j);
            Long l5 = new Long(backgroundTimeMonitorOperator2.backgroundTimeUntilNow());
            if (objM162loadBidshUnOzRk instanceof Result.Failure) {
                adLoadPartnerFailure = EventResult.AdLoadResult.AdLoadSuccess.INSTANCE;
            } else {
                thA = Result.a(objM162loadBidshUnOzRk);
                if (thA instanceof ChartboostMediationAdException) {
                    chartboostMediationAdException = (ChartboostMediationAdException) thA;
                } else {
                    chartboostMediationAdException = null;
                }
                if (chartboostMediationAdException != null) {
                    chartboostMediationError = ChartboostMediationError.CM_LOAD_FAILURE_UNKNOWN;
                } else {
                    chartboostMediationError = ChartboostMediationError.CM_LOAD_FAILURE_UNKNOWN;
                }
                adLoadPartnerFailure = new EventResult.AdLoadResult.AdLoadPartnerFailure(new MetricsError.SimpleError(chartboostMediationError));
            }
            metricsManager4.postMetricsData(set3, loadId2, queueId2, l4, l5, adLoadPartnerFailure);
            thA2 = Result.a(objM162loadBidshUnOzRk);
            if (thA2 == null) {
                return ResultKt.a(thA2);
            }
            cachedAd.setPartnerAd((PartnerAd) objM162loadBidshUnOzRk);
            cachedAd.setWinningBidInfo(auctionResult.getBids().getBidInfo());
            activeBid = auctionResult.getBids().getActiveBid();
            if (activeBid != null) {
                ilrd = activeBid.getIlrd();
            } else {
                ilrd = null;
            }
            cachedAd.setIlrdJson(ilrd);
            cachedAd.setLoadId(adLoadParams2.getLoadId());
            adController.sendAuctionWinnerRequest(auctionResult.getBids(), adLoadParams2.getLoadId());
            return cachedAd;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:35:0x010b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0117  */
    /* JADX WARN: Code duplicated, block: B:38:0x011d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object show(Context context, CachedAd cachedAd, Continuation<? super ChartboostMediationAdShowResult> continuation) {
        C09871 c09871;
        CachedAd cachedAd2;
        Object objRouteShow;
        AdController adController;
        CachedAd cachedAd3;
        PartnerAd partnerAd;
        JSONObject jSONObject;
        JsonObject ilrdJson;
        if (continuation instanceof C09871) {
            c09871 = (C09871) continuation;
            int i2 = c09871.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c09871.label = i2 - Integer.MIN_VALUE;
            } else {
                c09871 = new C09871(continuation);
            }
        } else {
            c09871 = new C09871(continuation);
        }
        C09871 c09872 = c09871;
        Object obj = c09872.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = c09872.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            PartnerController partnerController = this.partnerController;
            PartnerAd partnerAd2 = cachedAd.getPartnerAd();
            String auctionId = cachedAd.getAuctionId();
            String loadId = cachedAd.getLoadId();
            c09872.L$0 = this;
            cachedAd2 = cachedAd;
            c09872.L$1 = cachedAd2;
            c09872.label = 1;
            objRouteShow = partnerController.routeShow(context, partnerAd2, auctionId, loadId, c09872);
            if (objRouteShow != coroutineSingletons) {
                adController = this;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            CachedAd cachedAd4 = (CachedAd) c09872.L$1;
            AdController adController2 = (AdController) c09872.L$0;
            ResultKt.b(obj);
            objRouteShow = obj;
            cachedAd2 = cachedAd4;
            adController = adController2;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            partnerAd = (PartnerAd) c09872.L$3;
            jSONObject = (JSONObject) c09872.L$2;
            cachedAd3 = (CachedAd) c09872.L$1;
            adController = (AdController) c09872.L$0;
            ResultKt.b(obj);
        }
        ilrdJson = cachedAd3.getIlrdJson();
        if (ilrdJson != null) {
            adController.ilrd.onIlrdReceived$Helium_release(partnerAd.getRequest().getChartboostPlacement(), JsonTranslatorKt.toJSONObject(ilrdJson));
        }
        if (AdFormat.REWARDED == partnerAd.getRequest().getFormat()) {
            adController.rewardedImpressionDepth++;
        } else if (AdFormat.INTERSTITIAL == partnerAd.getRequest().getFormat()) {
            adController.interstitialImpressionDepth++;
        } else if (AdFormat.REWARDED_INTERSTITIAL == partnerAd.getRequest().getFormat()) {
            adController.rewardedInterstitialImpressionDepth++;
        }
        return new ChartboostMediationAdShowResult(jSONObject, null);
        PartnerController.PartnerShowResult partnerShowResult = (PartnerController.PartnerShowResult) objRouteShow;
        boolean isSuccess = ((Metrics) CollectionsKt.v(partnerShowResult.getMetrics())).getIsSuccess();
        JSONObject jSONObject2 = JsonTranslatorKt.toJSONObject(JsonElementKt.getJsonObject(TreeJsonEncoderKt.writeJson(HeliumJsonKt.getHeliumJson(), MetricsManager.INSTANCE.buildMetricsDataRequestBody$Helium_release(partnerShowResult.getMetrics(), (126 & 2) != 0 ? "" : null, (126 & 4) != 0 ? null : null, (126 & 8) != 0 ? null : null, (126 & 16) != 0 ? null : null, (126 & 32) != 0 ? null : null, (126 & 64) != 0 ? null : null), MetricsRequestBody.INSTANCE.serializer())));
        if (!isSuccess) {
            ChartboostMediationError chartboostMediationError = ((Metrics) CollectionsKt.v(partnerShowResult.getMetrics())).getChartboostMediationError();
            if (chartboostMediationError == null) {
                chartboostMediationError = ChartboostMediationError.CM_SHOW_FAILURE_UNKNOWN;
            }
            return new ChartboostMediationAdShowResult(jSONObject2, chartboostMediationError);
        }
        PartnerAd partnerAd3 = partnerShowResult.getPartnerAd();
        if (partnerAd3 == null) {
            return new ChartboostMediationAdShowResult(jSONObject2, ChartboostMediationError.CM_SHOW_FAILURE_AD_NOT_READY);
        }
        cachedAd2.setPartnerAd(partnerAd3);
        ChartboostMediationNetworking chartboostMediationNetworking = ChartboostMediationNetworking.INSTANCE;
        String auctionId2 = cachedAd2.getAuctionId();
        String loadId2 = cachedAd2.getLoadId();
        c09872.L$0 = adController;
        c09872.L$1 = cachedAd2;
        c09872.L$2 = jSONObject2;
        c09872.L$3 = partnerAd3;
        c09872.label = 2;
        if (chartboostMediationNetworking.trackChartboostImpression(auctionId2, loadId2, c09872) != coroutineSingletons) {
            cachedAd3 = cachedAd2;
            partnerAd = partnerAd3;
            jSONObject = jSONObject2;
            ilrdJson = cachedAd3.getIlrdJson();
            if (ilrdJson != null) {
                adController.ilrd.onIlrdReceived$Helium_release(partnerAd.getRequest().getChartboostPlacement(), JsonTranslatorKt.toJSONObject(ilrdJson));
            }
            if (AdFormat.REWARDED == partnerAd.getRequest().getFormat()) {
                adController.rewardedImpressionDepth++;
            } else if (AdFormat.INTERSTITIAL == partnerAd.getRequest().getFormat()) {
                adController.interstitialImpressionDepth++;
            } else if (AdFormat.REWARDED_INTERSTITIAL == partnerAd.getRequest().getFormat()) {
                adController.rewardedInterstitialImpressionDepth++;
            }
            return new ChartboostMediationAdShowResult(jSONObject, null);
        }
        return coroutineSingletons;
    }
}
