package com.chartboost.heliumsdk.controllers.banners;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.applovin.impl.H0;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.Ilrd;
import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.chartboost.heliumsdk.ad.HeliumBannerAdListener;
import com.chartboost.heliumsdk.controllers.AdController;
import com.chartboost.heliumsdk.domain.AppConfigStorage;
import com.chartboost.heliumsdk.domain.CachedAd;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.MetricsManager;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.domain.PartnerAdUtils;
import com.chartboost.heliumsdk.domain.PlacementStorage;
import com.chartboost.heliumsdk.network.Endpoints;
import com.chartboost.heliumsdk.utils.Environment;
import com.chartboost.heliumsdk.utils.FullscreenAdShowingState;
import com.chartboost.heliumsdk.utils.LogController;
import com.p004ironsource.k6;
import com.thinkup.core.oo.n0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0012*\u0001\u0011\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020.H\u0002J\u0006\u00100\u001a\u00020.J\u0006\u00101\u001a\u00020.J\b\u00102\u001a\u000203H\u0002J\u0017\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0000¢\u0006\u0002\b8J\u0012\u00109\u001a\u00020.2\b\b\u0002\u0010:\u001a\u00020\u0014H\u0002J\u0018\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u0002032\u0006\u0010=\u001a\u00020>H\u0002J\u0018\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020\r2\u0006\u0010<\u001a\u000203H\u0002J\u0012\u0010A\u001a\u00020.2\b\u0010@\u001a\u0004\u0018\u00010\rH\u0002J\u0006\u0010B\u001a\u00020.J\u0006\u0010C\u001a\u00020.J\u0006\u0010D\u001a\u00020.J\b\u0010E\u001a\u00020.H\u0002J\r\u0010F\u001a\u00020.H\u0000¢\u0006\u0002\bGJ\b\u0010H\u001a\u00020.H\u0002J\b\u0010I\u001a\u00020.H\u0002J\b\u0010J\u001a\u00020.H\u0002J(\u0010K\u001a\u00020.2\u0006\u0010L\u001a\u00020\u000b2\u0006\u0010M\u001a\u0002032\u0006\u0010N\u001a\u0002032\u0006\u0010<\u001a\u000203H\u0002J\b\u0010O\u001a\u00020.H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/banners/BannerController;", "", "heliumBannerAdRef", "Ljava/lang/ref/WeakReference;", "Lcom/chartboost/heliumsdk/ad/HeliumBannerAd;", "fullscreenAdShowingState", "Lcom/chartboost/heliumsdk/utils/FullscreenAdShowingState;", n0.o.mo, "Lcom/chartboost/heliumsdk/Ilrd;", "(Ljava/lang/ref/WeakReference;Lcom/chartboost/heliumsdk/utils/FullscreenAdShowingState;Lcom/chartboost/heliumsdk/Ilrd;)V", "bannerShownUptimeMillis", "", "currentlyShowingAd", "Lcom/chartboost/heliumsdk/domain/CachedAd;", "fetchAdJob", "Lkotlinx/coroutines/Job;", "fullscreenAdShowingStateObserver", "com/chartboost/heliumsdk/controllers/banners/BannerController$fullscreenAdShowingStateObserver$1", "Lcom/chartboost/heliumsdk/controllers/banners/BannerController$fullscreenAdShowingStateObserver$1;", "isAutoRefreshResumed", "", "isHeliumBannerAdReadyToRefresh", "isPublisherTriggeredLoad", "isShowingAd", "mainHandler", "Landroid/os/Handler;", "maxRefreshTime", "", "maxTriesUntilPenaltyTime", "nextAd", "nextAdJob", "refreshTimeMillis", "getRefreshTimeMillis", "()I", "refreshesFailed", "shouldAutoRefresh", "getShouldAutoRefresh", "()Z", "shownDurationMillis", "swapAdJob", "timeToVerifyAdSizeJobMillis", "getTimeToVerifyAdSizeJobMillis", "()J", "visibilityTracker", "Lcom/chartboost/heliumsdk/controllers/banners/VisibilityTracker;", "cancelAllJobs", "", "checkAndResumeRefresh", "clearAd", "destroy", "getBannerAdPlacementName", "", "getCreativeSizeDips", "Landroid/util/Size;", k6.f25513u, "Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;", "getCreativeSizeDips$Helium_release", "getNextAd", "forceRefresh", "handleLoadFailure", "loadId", "error", "", "handleLoadSuccess", "cachedAd", "invalidateAd", "load", "onHeliumBannerAdPauseRefresh", "onHeliumBannerAdResumeRefresh", "pauseRefresh", "renewCachedAd", "renewCachedAd$Helium_release", "resetState", "scheduleAdSwap", "scheduleNextRefresh", "sendShowMetricsData", "startTime", HandleInvocationsFromAdViewer.KEY_OM_PARTNER, "auctionId", "swapAd", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BannerController {
    private long bannerShownUptimeMillis;
    private CachedAd currentlyShowingAd;
    private Job fetchAdJob;
    private final FullscreenAdShowingState fullscreenAdShowingState;
    private final BannerController$fullscreenAdShowingStateObserver$1 fullscreenAdShowingStateObserver;
    private final WeakReference<HeliumBannerAd> heliumBannerAdRef;
    private final Ilrd ilrd;
    private boolean isAutoRefreshResumed;
    private boolean isHeliumBannerAdReadyToRefresh;
    private boolean isPublisherTriggeredLoad;
    private boolean isShowingAd;
    private final Handler mainHandler;
    private final int maxRefreshTime;
    private final int maxTriesUntilPenaltyTime;
    private CachedAd nextAd;
    private Job nextAdJob;
    private int refreshesFailed;
    private long shownDurationMillis;
    private Job swapAdJob;
    private VisibilityTracker visibilityTracker;

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.banners.BannerController$handleLoadFailure$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.banners.BannerController$handleLoadFailure$1", f = "BannerController.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Throwable $error;
        final /* synthetic */ String $loadId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Throwable th, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$loadId = str;
            this.$error = th;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BannerController.this.new AnonymousClass1(this.$loadId, this.$error, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0066  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HeliumBannerAdListener heliumBannerAdListener;
            Size sizeAsSize;
            PartnerAd partnerAd;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            HeliumBannerAd heliumBannerAd = (HeliumBannerAd) BannerController.this.heliumBannerAdRef.get();
            if (heliumBannerAd != null && (heliumBannerAdListener = heliumBannerAd.getHeliumBannerAdListener()) != null) {
                String bannerAdPlacementName = BannerController.this.getBannerAdPlacementName();
                String str = this.$loadId;
                Map<String, String> map = EmptyMap.X;
                Throwable th = this.$error;
                ChartboostMediationAdException chartboostMediationAdException = th instanceof ChartboostMediationAdException ? (ChartboostMediationAdException) th : new ChartboostMediationAdException(ChartboostMediationError.CM_LOAD_FAILURE_UNKNOWN);
                CachedAd cachedAd = BannerController.this.currentlyShowingAd;
                if (cachedAd == null || (partnerAd = cachedAd.getPartnerAd()) == null) {
                    sizeAsSize = HeliumBannerAd.HeliumBannerSize.INSTANCE.asSize(HeliumBannerAd.HeliumBannerSize.STANDARD);
                } else {
                    PartnerAdUtils partnerAdUtils = PartnerAdUtils.INSTANCE;
                    Size size = partnerAd.getRequest().getSize();
                    if (size == null) {
                        size = HeliumBannerAd.HeliumBannerSize.INSTANCE.asSize(HeliumBannerAd.HeliumBannerSize.STANDARD);
                    }
                    sizeAsSize = partnerAdUtils.getCreativeSizeFromPartnerAdDetails(partnerAd, size);
                    if (sizeAsSize == null) {
                        sizeAsSize = HeliumBannerAd.HeliumBannerSize.INSTANCE.asSize(HeliumBannerAd.HeliumBannerSize.STANDARD);
                    }
                }
                heliumBannerAdListener.onAdCached(bannerAdPlacementName, str, map, chartboostMediationAdException, sizeAsSize);
            }
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.banners.BannerController$handleLoadSuccess$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.banners.BannerController$handleLoadSuccess$1", f = "BannerController.kt", l = {}, m = "invokeSuspend")
    public static final class C09911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CachedAd $cachedAd;
        final /* synthetic */ String $loadId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09911(String str, CachedAd cachedAd, Continuation<? super C09911> continuation) {
            super(2, continuation);
            this.$loadId = str;
            this.$cachedAd = cachedAd;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BannerController.this.new C09911(this.$loadId, this.$cachedAd, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0056  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HeliumBannerAdListener heliumBannerAdListener;
            Size sizeAsSize;
            PartnerAd partnerAd;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            HeliumBannerAd heliumBannerAd = (HeliumBannerAd) BannerController.this.heliumBannerAdRef.get();
            if (heliumBannerAd != null && (heliumBannerAdListener = heliumBannerAd.getHeliumBannerAdListener()) != null) {
                String bannerAdPlacementName = BannerController.this.getBannerAdPlacementName();
                String str = this.$loadId;
                Map<String, String> winningBidInfo = this.$cachedAd.getWinningBidInfo();
                CachedAd cachedAd = BannerController.this.currentlyShowingAd;
                if (cachedAd == null || (partnerAd = cachedAd.getPartnerAd()) == null) {
                    sizeAsSize = HeliumBannerAd.HeliumBannerSize.INSTANCE.asSize(HeliumBannerAd.HeliumBannerSize.STANDARD);
                } else {
                    PartnerAdUtils partnerAdUtils = PartnerAdUtils.INSTANCE;
                    Size size = partnerAd.getRequest().getSize();
                    if (size == null) {
                        size = HeliumBannerAd.HeliumBannerSize.INSTANCE.asSize(HeliumBannerAd.HeliumBannerSize.STANDARD);
                    }
                    sizeAsSize = partnerAdUtils.getCreativeSizeFromPartnerAdDetails(partnerAd, size);
                    if (sizeAsSize == null) {
                        sizeAsSize = HeliumBannerAd.HeliumBannerSize.INSTANCE.asSize(HeliumBannerAd.HeliumBannerSize.STANDARD);
                    }
                }
                heliumBannerAdListener.onAdCached(bannerAdPlacementName, str, winningBidInfo, null, sizeAsSize);
            }
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09911) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.banners.BannerController$scheduleAdSwap$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.banners.BannerController$scheduleAdSwap$1", f = "BannerController.kt", l = {558}, m = "invokeSuspend")
    public static final class C09921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.LongRef $timeToRefreshMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.banners.BannerController$scheduleAdSwap$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.banners.BannerController$scheduleAdSwap$1$1", f = "BannerController.kt", l = {559}, m = "invokeSuspend")
        public static final class C01621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.LongRef $timeToRefreshMillis;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01621(Ref.LongRef longRef, Continuation<? super C01621> continuation) {
                super(2, continuation);
                this.$timeToRefreshMillis = longRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01621(this.$timeToRefreshMillis, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.b(obj);
                    long j = this.$timeToRefreshMillis.X;
                    this.label = 1;
                    if (DelayKt.a(j, this) == coroutineSingletons) {
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
                return ((C01621) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09921(Ref.LongRef longRef, Continuation<? super C09921> continuation) {
            super(2, continuation);
            this.$timeToRefreshMillis = longRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09921 c09921 = BannerController.this.new C09921(this.$timeToRefreshMillis, continuation);
            c09921.L$0 = obj;
            return c09921;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
                C01621 c01621 = new C01621(this.$timeToRefreshMillis, null);
                this.L$0 = coroutineScope2;
                this.label = 1;
                if (BuildersKt.f(defaultIoScheduler, c01621, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
            }
            boolean zE = CoroutineScopeKt.e(coroutineScope);
            Unit unit = Unit.f43263a;
            if (!zE) {
                return unit;
            }
            BannerController.this.swapAd();
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09921) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.banners.BannerController$scheduleNextRefresh$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.banners.BannerController$scheduleNextRefresh$1", f = "BannerController.kt", l = {786}, m = "invokeSuspend")
    public static final class C09931 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.LongRef $timeToRefreshMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.banners.BannerController$scheduleNextRefresh$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.banners.BannerController$scheduleNextRefresh$1$1", f = "BannerController.kt", l = {787}, m = "invokeSuspend")
        public static final class C01631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.LongRef $timeToRefreshMillis;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01631(Ref.LongRef longRef, Continuation<? super C01631> continuation) {
                super(2, continuation);
                this.$timeToRefreshMillis = longRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01631(this.$timeToRefreshMillis, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.b(obj);
                    long j = this.$timeToRefreshMillis.X;
                    this.label = 1;
                    if (DelayKt.a(j, this) == coroutineSingletons) {
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
                return ((C01631) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09931(Ref.LongRef longRef, Continuation<? super C09931> continuation) {
            super(2, continuation);
            this.$timeToRefreshMillis = longRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09931 c09931 = BannerController.this.new C09931(this.$timeToRefreshMillis, continuation);
            c09931.L$0 = obj;
            return c09931;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
                C01631 c01631 = new C01631(this.$timeToRefreshMillis, null);
                this.L$0 = coroutineScope2;
                this.label = 1;
                if (BuildersKt.f(defaultIoScheduler, c01631, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
            }
            boolean zE = CoroutineScopeKt.e(coroutineScope);
            Unit unit = Unit.f43263a;
            if (!zE) {
                return unit;
            }
            BannerController.getNextAd$default(BannerController.this, false, 1, null);
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09931) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.chartboost.heliumsdk.controllers.banners.BannerController$fullscreenAdShowingStateObserver$1] */
    public BannerController(WeakReference<HeliumBannerAd> heliumBannerAdRef, FullscreenAdShowingState fullscreenAdShowingState, Ilrd ilrd) {
        Intrinsics.f(heliumBannerAdRef, "heliumBannerAdRef");
        this.heliumBannerAdRef = heliumBannerAdRef;
        this.fullscreenAdShowingState = fullscreenAdShowingState;
        this.ilrd = ilrd;
        PlacementStorage placementStorage = PlacementStorage.INSTANCE;
        this.maxRefreshTime = placementStorage.getMaxRefreshTime() * 1000;
        this.maxTriesUntilPenaltyTime = placementStorage.getMaxTriesUntilPenaltyTime();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.fullscreenAdShowingStateObserver = new FullscreenAdShowingState.FullscreenAdShowingStateObserver() { // from class: com.chartboost.heliumsdk.controllers.banners.BannerController$fullscreenAdShowingStateObserver$1
            @Override // com.chartboost.heliumsdk.utils.FullscreenAdShowingState.FullscreenAdShowingStateObserver
            public void onFullscreenAdDismissed() {
                this.this$0.checkAndResumeRefresh();
            }

            @Override // com.chartboost.heliumsdk.utils.FullscreenAdShowingState.FullscreenAdShowingStateObserver
            public void onFullscreenAdShown() {
                this.this$0.pauseRefresh();
            }
        };
        this.bannerShownUptimeMillis = SystemClock.uptimeMillis();
        this.isAutoRefreshResumed = true;
    }

    private final void cancelAllJobs() {
        Job job = this.fetchAdJob;
        if (job != null) {
            job.a(null);
        }
        Job job2 = this.nextAdJob;
        if (job2 != null) {
            job2.a(null);
        }
        Job job3 = this.swapAdJob;
        if (job3 != null) {
            job3.a(null);
        }
        this.fetchAdJob = null;
        this.nextAdJob = null;
        this.swapAdJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkAndResumeRefresh() {
        if (this.isHeliumBannerAdReadyToRefresh) {
            FullscreenAdShowingState fullscreenAdShowingState = this.fullscreenAdShowingState;
            if (fullscreenAdShowingState == null || !fullscreenAdShowingState.getIsFullscreenAdShowing()) {
                this.isAutoRefreshResumed = true;
                this.bannerShownUptimeMillis = SystemClock.uptimeMillis();
                if (this.nextAd != null) {
                    scheduleAdSwap();
                } else {
                    scheduleNextRefresh();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getBannerAdPlacementName() {
        HeliumBannerAd heliumBannerAd = this.heliumBannerAdRef.get();
        return heliumBannerAd != null ? heliumBannerAd.getPlacementName() : "";
    }

    private final void getNextAd(boolean forceRefresh) {
        if (!forceRefresh && (this.nextAd != null || this.fetchAdJob != null)) {
            LogController.INSTANCE.i("Already loading an ad.");
            return;
        }
        HeliumBannerAd heliumBannerAd = this.heliumBannerAdRef.get();
        Unit unit = null;
        if (heliumBannerAd != null) {
            String str = Environment.INSTANCE.getSessionId$Helium_release() + System.currentTimeMillis();
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            this.fetchAdJob = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), new BannerController$getNextAd$lambda$7$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X, this, heliumBannerAd, str), null, new BannerController$getNextAd$1$2(heliumBannerAd, str, this, forceRefresh, null), 2);
            unit = Unit.f43263a;
        }
        if (unit == null) {
            LogController.INSTANCE.e("The Helium SDK Banner reference is missing on getNextAd()");
        }
        checkAndResumeRefresh();
    }

    public static /* synthetic */ void getNextAd$default(BannerController bannerController, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        bannerController.getNextAd(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRefreshTimeMillis() {
        return PlacementStorage.INSTANCE.getRefreshTime(getBannerAdPlacementName()) * 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getTimeToVerifyAdSizeJobMillis() {
        return AppConfigStorage.INSTANCE.getBannerSizeEventDelayMs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLoadFailure(String loadId, Throwable error) {
        this.refreshesFailed++;
        this.shownDurationMillis = 0L;
        scheduleNextRefresh();
        if (this.isPublisherTriggeredLoad) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new AnonymousClass1(loadId, error, null), 3);
        }
        this.isPublisherTriggeredLoad = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLoadSuccess(CachedAd cachedAd, String loadId) {
        cachedAd.setLoadId(loadId);
        this.nextAd = cachedAd;
        this.refreshesFailed = 0;
        scheduleAdSwap();
        if (this.isPublisherTriggeredLoad) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new C09911(loadId, cachedAd, null), 3);
        }
        this.isPublisherTriggeredLoad = false;
    }

    private final void invalidateAd(CachedAd cachedAd) {
        Unit unit;
        if (cachedAd != null) {
            AdController adController$Helium_release = HeliumSdk.INSTANCE.getChartboostMediationInternal$Helium_release().getAdController();
            if (adController$Helium_release != null) {
                adController$Helium_release.invalidate(cachedAd);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
            if (unit == null) {
                LogController.INSTANCE.e("Failed to invalidate ad due to no ad controller.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$3$lambda$2$lambda$1(BannerController this$0, PartnerAd partnerAd, CachedAd heliumAd) {
        Unit unit;
        HeliumBannerAdListener heliumBannerAdListener;
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(partnerAd, "$partnerAd");
        Intrinsics.f(heliumAd, "$heliumAd");
        HeliumBannerAd heliumBannerAd = this$0.heliumBannerAdRef.get();
        if (heliumBannerAd == null || (heliumBannerAdListener = heliumBannerAd.getHeliumBannerAdListener()) == null) {
            unit = null;
        } else {
            String chartboostPlacement = partnerAd.getRequest().getChartboostPlacement();
            String loadId = heliumAd.getLoadId();
            Map<String, String> winningBidInfo = heliumAd.getWinningBidInfo();
            PartnerAdUtils partnerAdUtils = PartnerAdUtils.INSTANCE;
            Size size = partnerAd.getRequest().getSize();
            if (size == null) {
                size = HeliumBannerAd.HeliumBannerSize.INSTANCE.asSize(HeliumBannerAd.HeliumBannerSize.STANDARD);
            }
            heliumBannerAdListener.onAdCached(chartboostPlacement, loadId, winningBidInfo, null, partnerAdUtils.getCreativeSizeFromPartnerAdDetails(partnerAd, size));
            unit = Unit.f43263a;
        }
        if (unit == null) {
            LogController.INSTANCE.e("The Helium SDK Banner listener is detached on onHeliumAdLoaded for onAdCached.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pauseRefresh() {
        if (this.isAutoRefreshResumed) {
            this.isAutoRefreshResumed = false;
            this.shownDurationMillis = (SystemClock.uptimeMillis() - this.bannerShownUptimeMillis) + this.shownDurationMillis;
            LogController.INSTANCE.d("Auto refresh paused. Already shown for " + this.shownDurationMillis + " millis");
            cancelAllJobs();
        }
    }

    private final void resetState() {
        this.isPublisherTriggeredLoad = false;
        this.isShowingAd = false;
        VisibilityTracker visibilityTracker = this.visibilityTracker;
        if (visibilityTracker != null) {
            visibilityTracker.destroy();
        }
        this.visibilityTracker = null;
        cancelAllJobs();
        invalidateAd(this.currentlyShowingAd);
        invalidateAd(this.nextAd);
        this.currentlyShowingAd = null;
        this.nextAd = null;
        HeliumBannerAd heliumBannerAd = this.heliumBannerAdRef.get();
        if (heliumBannerAd != null) {
            heliumBannerAd.removeAllViews();
        }
        FullscreenAdShowingState fullscreenAdShowingState = this.fullscreenAdShowingState;
        if (fullscreenAdShowingState != null) {
            fullscreenAdShowingState.unsubscribe(this.fullscreenAdShowingStateObserver);
        }
    }

    private final void scheduleAdSwap() {
        if (!this.isHeliumBannerAdReadyToRefresh) {
            LogController.INSTANCE.d("Waiting on ad swap since banner is offscreen.");
            return;
        }
        long jUptimeMillis = (SystemClock.uptimeMillis() - this.bannerShownUptimeMillis) + this.shownDurationMillis;
        if (!this.isShowingAd || jUptimeMillis > getRefreshTimeMillis() || !getShouldAutoRefresh()) {
            swapAd();
            return;
        }
        Ref.LongRef longRef = new Ref.LongRef();
        long refreshTimeMillis = ((long) getRefreshTimeMillis()) - jUptimeMillis;
        longRef.X = refreshTimeMillis;
        if (refreshTimeMillis < 0) {
            longRef.X = 0L;
        }
        LogController.INSTANCE.d("Scheduling a banner ad swap in " + longRef.X + " millis.");
        Job job = this.swapAdJob;
        if (job != null) {
            job.a(null);
        }
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        this.swapAdJob = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new C09921(longRef, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleNextRefresh() {
        long refreshTimeMillis;
        long j;
        long j2;
        if (getShouldAutoRefresh()) {
            if (!this.isHeliumBannerAdReadyToRefresh) {
                LogController.INSTANCE.d("HeliumBannerAd is not on screen. Not refreshing.");
                return;
            }
            Ref.LongRef longRef = new Ref.LongRef();
            if (this.nextAd != null || this.refreshesFailed >= 1) {
                if (this.refreshesFailed >= this.maxTriesUntilPenaltyTime) {
                    refreshTimeMillis = this.maxRefreshTime;
                    j = this.shownDurationMillis;
                } else {
                    refreshTimeMillis = getRefreshTimeMillis();
                    j = this.shownDurationMillis;
                }
                j2 = refreshTimeMillis - j;
            } else {
                j2 = 0;
            }
            longRef.X = j2;
            if (j2 < 0) {
                longRef.X = 0L;
            }
            LogController.INSTANCE.d("Scheduling next banner refresh in " + longRef.X + " millis.");
            Job job = this.nextAdJob;
            if (job != null) {
                job.a(null);
            }
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            this.nextAdJob = BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new C09931(longRef, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendShowMetricsData(long startTime, String partnerName, String auctionId, String loadId) {
        Metrics metrics = new Metrics(partnerName, Endpoints.Sdk.Event.SHOW);
        HashSet hashSet = new HashSet();
        metrics.setAuctionId(auctionId);
        metrics.setStart(Long.valueOf(startTime));
        metrics.setEnd(Long.valueOf(System.currentTimeMillis()));
        metrics.setSuccess(true);
        hashSet.add(metrics);
        MetricsManager.postMetricsData$default(MetricsManager.INSTANCE, hashSet, loadId, null, null, null, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public final void swapAd() {
        FrameLayout.LayoutParams layoutParams;
        HeliumBannerAd heliumBannerAd = this.heliumBannerAdRef.get();
        if (heliumBannerAd == null) {
            LogController.INSTANCE.d("Failed to swap ad because reference to HeliumBannerAd lost");
            return;
        }
        CachedAd cachedAd = this.nextAd;
        if (cachedAd == null) {
            LogController.INSTANCE.d("Attempting to swap ad with no loaded ad.");
            return;
        }
        PartnerAd partnerAd = cachedAd.getPartnerAd();
        if (partnerAd == null) {
            LogController.INSTANCE.d("Attempting to swap ad with no loaded partner ad. " + ChartboostMediationError.CM_LOAD_FAILURE_NO_FILL);
            return;
        }
        View inlineView = partnerAd.getInlineView();
        if (inlineView == null) {
            LogController.INSTANCE.d("Attempting to swap ad with no loaded ad view. " + ChartboostMediationError.CM_LOAD_FAILURE_NO_INLINE_VIEW);
            return;
        }
        LogController.INSTANCE.d("Showing banner.");
        CachedAd cachedAd2 = this.currentlyShowingAd;
        this.currentlyShowingAd = cachedAd;
        this.nextAd = null;
        ViewParent parent = inlineView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(inlineView);
        }
        ArrayList arrayList = new ArrayList();
        int childCount = heliumBannerAd.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = heliumBannerAd.getChildAt(i2);
            Intrinsics.e(childAt, "heliumBannerAd.getChildAt(i)");
            arrayList.add(childAt);
        }
        HeliumBannerAd.HeliumBannerSize size = heliumBannerAd.getSize();
        double d = heliumBannerAd.getContext().getResources().getDisplayMetrics().density;
        if (size != null && size.isAdaptive()) {
            layoutParams = new FrameLayout.LayoutParams((int) (((double) getCreativeSizeDips$Helium_release(size).getWidth()) * d), (int) (((double) getCreativeSizeDips$Helium_release(size).getHeight()) * d));
        } else if (size != null) {
            layoutParams = new FrameLayout.LayoutParams((int) (((double) size.getWidth()) * d), (int) (((double) size.getHeight()) * d));
        } else {
            HeliumBannerAd.HeliumBannerSize heliumBannerSize = HeliumBannerAd.HeliumBannerSize.STANDARD;
            layoutParams = new FrameLayout.LayoutParams((int) (((double) heliumBannerSize.getWidth()) * d), (int) (((double) heliumBannerSize.getHeight()) * d));
        }
        layoutParams.gravity = 17;
        heliumBannerAd.addView(inlineView, layoutParams);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            heliumBannerAd.removeView((View) it.next());
        }
        this.isShowingAd = true;
        this.shownDurationMillis = 0L;
        this.bannerShownUptimeMillis = SystemClock.uptimeMillis();
        VisibilityTracker visibilityTracker = this.visibilityTracker;
        if (visibilityTracker != null) {
            visibilityTracker.destroy();
        }
        Context context = heliumBannerAd.getContext();
        Intrinsics.e(context, "heliumBannerAd.context");
        View topmostView = VisibilityTracker.INSTANCE.getTopmostView(heliumBannerAd.getContext(), heliumBannerAd);
        View view = topmostView == null ? heliumBannerAd : topmostView;
        AppConfigStorage appConfigStorage = AppConfigStorage.INSTANCE;
        VisibilityTracker visibilityTracker2 = new VisibilityTracker(context, inlineView, view, appConfigStorage.getBannerImpressionMinVisibleDips(), appConfigStorage.getBannerImpressionMinVisibleDurationMs(), appConfigStorage.getVisibilityTrackerPollIntervalMs(), appConfigStorage.getVisibilityTrackerTraversalLimit());
        visibilityTracker2.setVisibilityTrackerListener(new BannerController$swapAd$1$1(this, partnerAd, cachedAd, inlineView, heliumBannerAd));
        visibilityTracker2.start();
        this.visibilityTracker = visibilityTracker2;
        invalidateAd(cachedAd2);
    }

    public final void clearAd() {
        resetState();
    }

    public final void destroy() {
        resetState();
        this.heliumBannerAdRef.clear();
    }

    public final Size getCreativeSizeDips$Helium_release(HeliumBannerAd.HeliumBannerSize bannerSize) {
        CachedAd cachedAd;
        PartnerAd partnerAd;
        Size creativeSizeFromPartnerAdDetails = null;
        if (bannerSize != null) {
            try {
                if (bannerSize.isAdaptive() && (cachedAd = this.currentlyShowingAd) != null && (partnerAd = cachedAd.getPartnerAd()) != null) {
                    creativeSizeFromPartnerAdDetails = PartnerAdUtils.INSTANCE.getCreativeSizeFromPartnerAdDetails(partnerAd, HeliumBannerAd.HeliumBannerSize.INSTANCE.asSize(bannerSize));
                }
            } catch (Exception e2) {
                LogController.INSTANCE.e("Encountered a problem getting the creative size: " + e2.getMessage());
            }
        }
        if (creativeSizeFromPartnerAdDetails == null) {
            int width = bannerSize != null ? bannerSize.getWidth() : HeliumBannerAd.HeliumBannerSize.STANDARD.getWidth();
            if (bannerSize == null) {
                bannerSize = HeliumBannerAd.HeliumBannerSize.STANDARD;
            }
            creativeSizeFromPartnerAdDetails = new Size(width, bannerSize.getHeight());
        }
        return creativeSizeFromPartnerAdDetails;
    }

    public final boolean getShouldAutoRefresh() {
        return PlacementStorage.INSTANCE.shouldRefresh(getBannerAdPlacementName());
    }

    public final void load() {
        PartnerAd partnerAd;
        if (this.isPublisherTriggeredLoad) {
            LogController.INSTANCE.w(ChartboostMediationError.CM_LOAD_FAILURE_LOAD_IN_PROGRESS.getMessage());
            return;
        }
        this.isPublisherTriggeredLoad = true;
        if (this.fetchAdJob != null) {
            LogController.INSTANCE.w(ChartboostMediationError.CM_LOAD_FAILURE_LOAD_IN_PROGRESS.getMessage() + " Treating the next load as a publisher initiated load.");
            return;
        }
        CachedAd cachedAd = this.nextAd;
        if (cachedAd != null && (partnerAd = cachedAd.getPartnerAd()) != null) {
            LogController.INSTANCE.d("Returning cached ad.");
            if (partnerAd.getInlineView() != null) {
                this.mainHandler.post(new H0(this, partnerAd, cachedAd, 7));
                this.isPublisherTriggeredLoad = false;
                return;
            }
        }
        FullscreenAdShowingState fullscreenAdShowingState = this.fullscreenAdShowingState;
        if (fullscreenAdShowingState != null) {
            fullscreenAdShowingState.subscribe(this.fullscreenAdShowingStateObserver);
        }
        getNextAd$default(this, false, 1, null);
    }

    public final void onHeliumBannerAdPauseRefresh() {
        this.isHeliumBannerAdReadyToRefresh = false;
        pauseRefresh();
    }

    public final void onHeliumBannerAdResumeRefresh() {
        this.isHeliumBannerAdReadyToRefresh = true;
        checkAndResumeRefresh();
    }

    public final void renewCachedAd$Helium_release() {
        pauseRefresh();
        this.isPublisherTriggeredLoad = true;
        getNextAd(true);
    }

    public /* synthetic */ BannerController(WeakReference weakReference, FullscreenAdShowingState fullscreenAdShowingState, Ilrd ilrd, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference, (i2 & 2) != 0 ? HeliumSdk.INSTANCE.getChartboostMediationInternal$Helium_release().getFullscreenAdShowingState() : fullscreenAdShowingState, (i2 & 4) != 0 ? HeliumSdk.INSTANCE.getChartboostMediationInternal$Helium_release().getIlrd() : ilrd);
    }
}
