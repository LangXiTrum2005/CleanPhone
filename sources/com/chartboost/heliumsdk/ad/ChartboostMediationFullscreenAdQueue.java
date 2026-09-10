package com.chartboost.heliumsdk.ad;

import android.content.Context;
import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.domain.AppConfigStorage;
import com.chartboost.heliumsdk.domain.CachedAd;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Keywords;
import com.chartboost.heliumsdk.domain.LoadRateLimiter;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.MetricsManager;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.domain.PartnerAdLoadRequest;
import com.chartboost.heliumsdk.domain.PlacementStorage;
import com.chartboost.heliumsdk.network.ChartboostMediationNetworking;
import com.chartboost.heliumsdk.network.Endpoints;
import com.chartboost.heliumsdk.utils.Environment;
import com.chartboost.heliumsdk.utils.LogController;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0016\u0018\u0000 L2\u00020\u0001:\u0001LB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010?\u001a\u00020=2\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u00020=2\u0006\u0010C\u001a\u00020DH\u0002J\u0006\u0010E\u001a\u00020\u001cJ\u0019\u0010F\u001a\u00020D2\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010GJ\u0006\u0010H\u001a\u00020=J\u0012\u0010I\u001a\u00020=2\b\b\u0002\u0010J\u001a\u00020\u001cH\u0002J\u0006\u0010K\u001a\u00020=R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u001e\u0010#\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020-X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R$\u00106\u001a\u00020+2\u0006\u00105\u001a\u00020+@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00102\"\u0004\b8\u00109R\u000e\u0010:\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, d2 = {"Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdQueue;", "", "context", "Landroid/content/Context;", "placementName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "adQueueListener", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdQueueListener;", "getAdQueueListener", "()Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdQueueListener;", "setAdQueueListener", "(Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdQueueListener;)V", "getContext", "()Landroid/content/Context;", "delayFetchRateMs", "", "getDelayFetchRateMs", "()J", "fetchAdJob", "Lkotlinx/coroutines/Job;", "fullscreenAdQueueAdExpiredListener", "com/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1;", "fullscreenAdsQueued", "", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAd;", "isPaused", "", "isPaused$Helium_release", "()Z", "setPaused$Helium_release", "(Z)V", "isQueueFetchInProgress", "<set-?>", "isRunning", "keywords", "Lcom/chartboost/heliumsdk/domain/Keywords;", "getKeywords", "()Lcom/chartboost/heliumsdk/domain/Keywords;", "setKeywords", "(Lcom/chartboost/heliumsdk/domain/Keywords;)V", "maxQueueSize", "", "notifyQueueToAutoStart", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdQueueNotifyOnAutoQueue;", "getNotifyQueueToAutoStart$Helium_release", "()Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdQueueNotifyOnAutoQueue;", "numberOfAdsReady", "getNumberOfAdsReady", "()I", "getPlacementName", "()Ljava/lang/String;", "value", "queueCapacity", "getQueueCapacity", "setQueueCapacity", "(I)V", "queueId", "queuedAdTtlMs", "cancelAllJobs", "", "getNextAd", "handleAdFetchLoadResultException", "error", "", "handleAdFetchLoadResultNoAd", "loadResult", "Lcom/chartboost/heliumsdk/ad/ChartboostMediationFullscreenAdLoadResult;", "hasNextAd", "loadFullscreenAd", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "startAdFetchJob", "isDelayed", "stop", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChartboostMediationFullscreenAdQueue {
    private static final String LOG_PREFIX = "The fullscreen ad queue for:";
    private static final int MINIMUM_QUEUE_SIZE = 1;
    private ChartboostMediationFullscreenAdQueueListener adQueueListener;
    private final Context context;
    private Job fetchAdJob;
    private final ChartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1 fullscreenAdQueueAdExpiredListener;
    private final List<ChartboostMediationFullscreenAd> fullscreenAdsQueued;
    private boolean isPaused;
    private boolean isRunning;
    private Keywords keywords;
    private int maxQueueSize;
    private final ChartboostMediationFullscreenAdQueueNotifyOnAutoQueue notifyQueueToAutoStart;
    private final String placementName;
    private int queueCapacity;
    private String queueId;
    private long queuedAdTtlMs;

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueue$start$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueue$start$1", f = "ChartboostMediationFullscreenAdQueue.kt", l = {299}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChartboostMediationFullscreenAdQueue.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                ChartboostMediationNetworking chartboostMediationNetworking = ChartboostMediationNetworking.INSTANCE;
                boolean isRunning = ChartboostMediationFullscreenAdQueue.this.getIsRunning();
                String placementName = ChartboostMediationFullscreenAdQueue.this.getPlacementName();
                int queueCapacity = ChartboostMediationFullscreenAdQueue.this.getQueueCapacity();
                Integer num = new Integer(ChartboostMediationFullscreenAdQueue.this.maxQueueSize);
                int numberOfAdsReady = ChartboostMediationFullscreenAdQueue.this.getNumberOfAdsReady();
                String str = ChartboostMediationFullscreenAdQueue.this.queueId;
                this.label = 1;
                if (chartboostMediationNetworking.makeQueueRequest(isRunning, placementName, queueCapacity, num, numberOfAdsReady, str, this) == coroutineSingletons) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueue$startAdFetchJob$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueue$startAdFetchJob$2", f = "ChartboostMediationFullscreenAdQueue.kt", l = {359, 367}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isDelayed;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChartboostMediationFullscreenAdQueue this$0;

        /* JADX INFO: renamed from: com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueue$startAdFetchJob$2$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueue$startAdFetchJob$2$3", f = "ChartboostMediationFullscreenAdQueue.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ChartboostMediationFullscreenAdLoadResult $loadResult;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ChartboostMediationFullscreenAdQueue this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue, ChartboostMediationFullscreenAdLoadResult chartboostMediationFullscreenAdLoadResult, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = chartboostMediationFullscreenAdQueue;
                this.$loadResult = chartboostMediationFullscreenAdLoadResult;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$loadResult, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Unit unit;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                ChartboostMediationFullscreenAdQueueListener adQueueListener = this.this$0.getAdQueueListener();
                Unit unit2 = Unit.f43263a;
                if (adQueueListener != null) {
                    ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue = this.this$0;
                    adQueueListener.onFullScreenAdQueueUpdated(chartboostMediationFullscreenAdQueue, this.$loadResult, chartboostMediationFullscreenAdQueue.getNumberOfAdsReady());
                    unit = unit2;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue2 = this.this$0;
                    LogController.INSTANCE.w("The fullscreen ad queue for: " + chartboostMediationFullscreenAdQueue2.getPlacementName() + " has its FullscreenAdQueueAdExpiredListener null.");
                }
                return unit2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z2, ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$isDelayed = z2;
            this.this$0 = chartboostMediationFullscreenAdQueue;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$isDelayed, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x009a  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:37:0x0103  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CoroutineScope coroutineScope2;
            ChartboostMediationFullscreenAdLoadResult chartboostMediationFullscreenAdLoadResult;
            ChartboostMediationFullscreenAd ad;
            ChartboostMediationFullscreenAd ad2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            Unit unit = Unit.f43263a;
            if (i2 == 0) {
                ResultKt.b(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                if (this.$isDelayed) {
                    long delayFetchRateMs = this.this$0.getDelayFetchRateMs();
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (DelayKt.a(delayFetchRateMs, this) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
            }
            chartboostMediationFullscreenAdLoadResult = (ChartboostMediationFullscreenAdLoadResult) obj;
            this.this$0.fetchAdJob = null;
            if (!CoroutineScopeKt.e(coroutineScope2)) {
                ad2 = chartboostMediationFullscreenAdLoadResult.getAd();
                if (ad2 != null) {
                    ad2.invalidate();
                }
                LogController.INSTANCE.w("The fullscreen ad queue for: " + this.this$0.getPlacementName() + " already has an active queue fetch job. Discarding previously loaded ad.");
                return unit;
            }
            ad = chartboostMediationFullscreenAdLoadResult.getAd();
            if (ad != null) {
                ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue = this.this$0;
                chartboostMediationFullscreenAdQueue.fullscreenAdsQueued.add(ad);
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new ChartboostMediationFullscreenAdQueue$startAdFetchJob$2$1$1(chartboostMediationFullscreenAdQueue, ad, null), 3);
            } else {
                this.this$0.handleAdFetchLoadResultNoAd(chartboostMediationFullscreenAdLoadResult);
            }
            DefaultScheduler defaultScheduler2 = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a.j0()), null, null, new AnonymousClass3(this.this$0, chartboostMediationFullscreenAdLoadResult, null), 3);
            this.this$0.startAdFetchJob(chartboostMediationFullscreenAdLoadResult.getAd() == null);
            return unit;
            if (this.this$0.fullscreenAdsQueued.size() >= this.this$0.getQueueCapacity()) {
                LogController.INSTANCE.d("The fullscreen ad queue for: " + this.this$0.getPlacementName() + " already reached capacity. Waiting until the next queue job.");
                this.this$0.fetchAdJob = null;
                return unit;
            }
            ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue2 = this.this$0;
            Context context = chartboostMediationFullscreenAdQueue2.getContext();
            this.L$0 = coroutineScope;
            this.label = 2;
            obj = chartboostMediationFullscreenAdQueue2.loadFullscreenAd(context, this);
            if (obj != coroutineSingletons) {
                coroutineScope2 = coroutineScope;
                chartboostMediationFullscreenAdLoadResult = (ChartboostMediationFullscreenAdLoadResult) obj;
                this.this$0.fetchAdJob = null;
                if (!CoroutineScopeKt.e(coroutineScope2)) {
                    ad2 = chartboostMediationFullscreenAdLoadResult.getAd();
                    if (ad2 != null) {
                        ad2.invalidate();
                    }
                    LogController.INSTANCE.w("The fullscreen ad queue for: " + this.this$0.getPlacementName() + " already has an active queue fetch job. Discarding previously loaded ad.");
                    return unit;
                }
                ad = chartboostMediationFullscreenAdLoadResult.getAd();
                if (ad != null) {
                    ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue3 = this.this$0;
                    chartboostMediationFullscreenAdQueue3.fullscreenAdsQueued.add(ad);
                    DefaultScheduler defaultScheduler3 = Dispatchers.f44752a;
                    BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new ChartboostMediationFullscreenAdQueue$startAdFetchJob$2$1$1(chartboostMediationFullscreenAdQueue3, ad, null), 3);
                } else {
                    this.this$0.handleAdFetchLoadResultNoAd(chartboostMediationFullscreenAdLoadResult);
                }
                DefaultScheduler defaultScheduler4 = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a.j0()), null, null, new AnonymousClass3(this.this$0, chartboostMediationFullscreenAdLoadResult, null), 3);
                this.this$0.startAdFetchJob(chartboostMediationFullscreenAdLoadResult.getAd() == null);
                return unit;
            }
            return coroutineSingletons;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueue$stop$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueue$stop$1", f = "ChartboostMediationFullscreenAdQueue.kt", l = {321}, m = "invokeSuspend")
    public static final class C09841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C09841(Continuation<? super C09841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChartboostMediationFullscreenAdQueue.this.new C09841(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                ChartboostMediationNetworking chartboostMediationNetworking = ChartboostMediationNetworking.INSTANCE;
                boolean isRunning = ChartboostMediationFullscreenAdQueue.this.getIsRunning();
                String placementName = ChartboostMediationFullscreenAdQueue.this.getPlacementName();
                int queueCapacity = ChartboostMediationFullscreenAdQueue.this.getQueueCapacity();
                int numberOfAdsReady = ChartboostMediationFullscreenAdQueue.this.getNumberOfAdsReady();
                String str = ChartboostMediationFullscreenAdQueue.this.queueId;
                this.label = 1;
                if (ChartboostMediationNetworking.makeQueueRequest$default(chartboostMediationNetworking, isRunning, placementName, queueCapacity, null, numberOfAdsReady, str, this, 8, null) == coroutineSingletons) {
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
            return ((C09841) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1] */
    public ChartboostMediationFullscreenAdQueue(Context context, String placementName) {
        Intrinsics.f(context, "context");
        Intrinsics.f(placementName, "placementName");
        this.context = context;
        this.placementName = placementName;
        this.notifyQueueToAutoStart = new ChartboostMediationFullscreenAdQueueNotifyOnAutoQueue() { // from class: com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueue$notifyQueueToAutoStart$1
            @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueueNotifyOnAutoQueue
            public void onSdkInitAutoQueue(boolean isSdkInitialized) {
                if (!isSdkInitialized) {
                    LogController.INSTANCE.w("Cannot auto start queuing due to the Chartboost Mediation SDK failing to initialize. Stopping the queue.");
                    this.this$0.stop();
                } else {
                    ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue = this.this$0;
                    chartboostMediationFullscreenAdQueue.setQueueCapacity(PlacementStorage.INSTANCE.getQueueSize(chartboostMediationFullscreenAdQueue.getPlacementName()));
                    this.this$0.start();
                }
            }
        };
        this.fullscreenAdQueueAdExpiredListener = new ChartboostMediationFullscreenAdQueueAdExpiredListener() { // from class: com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1
            @Override // com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdListener
            public void onAdExpired(ChartboostMediationFullscreenAd ad) {
                PartnerAd partnerAd;
                PartnerAdLoadRequest request;
                Intrinsics.f(ad, "ad");
                MetricsManager metricsManager = MetricsManager.INSTANCE;
                CachedAd cachedAd = ad.getCachedAd();
                Metrics metrics = new Metrics((cachedAd == null || (partnerAd = cachedAd.getPartnerAd()) == null || (request = partnerAd.getRequest()) == null) ? null : request.getPartnerId(), Endpoints.Sdk.Event.EXPIRATION);
                CachedAd cachedAd2 = ad.getCachedAd();
                metrics.setAuctionId(cachedAd2 != null ? cachedAd2.getAuctionId() : null);
                metrics.setSuccess(true);
                MetricsManager.postMetricsData$default(metricsManager, SetsKt.h(metrics), null, null, null, null, null, 62, null);
                LogController.INSTANCE.d("The fullscreen ad queue for: " + ad.getRequest().getPlacementName() + " has an expired ad. Will be removed from the queue.");
                ad.invalidate();
                this.this$0.fullscreenAdsQueued.remove(ad);
                DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new ChartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1$onAdExpired$2(this.this$0, null), 3);
                ChartboostMediationFullscreenAdQueue.startAdFetchJob$default(this.this$0, false, 1, null);
            }
        };
        this.fullscreenAdsQueued = new ArrayList();
        AppConfigStorage appConfigStorage = AppConfigStorage.INSTANCE;
        this.queuedAdTtlMs = appConfigStorage.getQueueAdTtlSeconds() * 1000;
        this.maxQueueSize = appConfigStorage.getMaxQueueSize();
        this.queueId = "";
        this.queueCapacity = PlacementStorage.INSTANCE.getQueueSize(placementName);
        this.keywords = new Keywords();
    }

    private final void cancelAllJobs() {
        this.isRunning = false;
        this.isPaused = false;
        Job job = this.fetchAdJob;
        if (job != null) {
            job.a(null);
        }
        this.fetchAdJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getDelayFetchRateMs() {
        return ((long) Math.max(AppConfigStorage.INSTANCE.getFullscreenLoadTimeoutSeconds(), new LoadRateLimiter().getLoadRateLimitSeconds(this.placementName))) * 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAdFetchLoadResultException(Throwable error) {
        LogController logController = LogController.INSTANCE;
        logController.e(error instanceof ChartboostMediationAdException ? ((ChartboostMediationAdException) error).getMessage() : ChartboostMediationError.CM_INTERNAL_ERROR.getMessage());
        this.fetchAdJob = null;
        logController.w("The fullscreen ad queue for: " + this.placementName + " encountered an error during ad fetch. The next fetch request has been delayed for " + (getDelayFetchRateMs() / ((long) 1000)) + " seconds to prevent unnecessary requests from being made.");
        startAdFetchJob(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAdFetchLoadResultNoAd(ChartboostMediationFullscreenAdLoadResult loadResult) {
        String string;
        LogController logController = LogController.INSTANCE;
        logController.w("The fullscreen ad queue for: " + this.placementName + " failed to load ad. The next fetch request has been delayed for " + (getDelayFetchRateMs() / ((long) 1000)) + " seconds to prevent unnecessary requests from being made.");
        StringBuilder sb = new StringBuilder("The fullscreen ad queue for: ");
        sb.append(this.placementName);
        sb.append(" failed to queue ad with loadId: ");
        sb.append(loadResult.getLoadId());
        sb.append(" and error: ");
        ChartboostMediationError error = loadResult.getError();
        if (error == null || (string = error.toString()) == null) {
            string = "";
        }
        sb.append(string);
        logController.i(sb.toString());
    }

    private final boolean isQueueFetchInProgress() {
        return this.fetchAdJob != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadFullscreenAd(Context context, Continuation<? super ChartboostMediationFullscreenAdLoadResult> continuation) {
        return ChartboostMediationFullscreenAd.INSTANCE.loadFullscreenAd$Helium_release(context, new ChartboostMediationAdLoadRequest(this.placementName, this.keywords), HeliumSdk.INSTANCE.getChartboostMediationInternal$Helium_release().getAdController(), this.fullscreenAdQueueAdExpiredListener, this.queueId, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAdFetchJob(boolean isDelayed) {
        if (!this.isRunning) {
            LogController.INSTANCE.d("The fullscreen ad queue for: " + this.placementName + " is no longer running. Waiting for the queue to start running.");
            return;
        }
        if (this.fullscreenAdsQueued.size() >= this.queueCapacity) {
            LogController.INSTANCE.d("The fullscreen ad queue for: " + this.placementName + " is already full. Waiting until next queue fetch job.");
            return;
        }
        if (!isQueueFetchInProgress()) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            this.fetchAdJob = BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), new ChartboostMediationFullscreenAdQueue$startAdFetchJob$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key.X, this), null, new AnonymousClass2(isDelayed, this, null), 2);
            return;
        }
        LogController.INSTANCE.d("The fullscreen ad queue for: " + this.placementName + " already has a queue fetch job in progress.");
    }

    public static /* synthetic */ void startAdFetchJob$default(ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        chartboostMediationFullscreenAdQueue.startAdFetchJob(z2);
    }

    public final ChartboostMediationFullscreenAdQueueListener getAdQueueListener() {
        if (this.adQueueListener == null) {
            LogController.INSTANCE.w("Ad queue listener is null on FullscreenAdQueueListener");
        }
        return this.adQueueListener;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Keywords getKeywords() {
        return this.keywords;
    }

    public final ChartboostMediationFullscreenAd getNextAd() {
        ChartboostMediationFullscreenAd chartboostMediationFullscreenAd = (ChartboostMediationFullscreenAd) CollectionsKt.S(this.fullscreenAdsQueued);
        startAdFetchJob$default(this, false, 1, null);
        if (chartboostMediationFullscreenAd == null) {
            return chartboostMediationFullscreenAd;
        }
        chartboostMediationFullscreenAd.setListener(null);
        return chartboostMediationFullscreenAd;
    }

    /* JADX INFO: renamed from: getNotifyQueueToAutoStart$Helium_release, reason: from getter */
    public final ChartboostMediationFullscreenAdQueueNotifyOnAutoQueue getNotifyQueueToAutoStart() {
        return this.notifyQueueToAutoStart;
    }

    public final int getNumberOfAdsReady() {
        return this.fullscreenAdsQueued.size();
    }

    public final String getPlacementName() {
        return this.placementName;
    }

    public final int getQueueCapacity() {
        return this.queueCapacity;
    }

    public final boolean hasNextAd() {
        return !this.fullscreenAdsQueued.isEmpty();
    }

    /* JADX INFO: renamed from: isPaused$Helium_release, reason: from getter */
    public final boolean getIsPaused() {
        return this.isPaused;
    }

    /* JADX INFO: renamed from: isRunning, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    public final void setAdQueueListener(ChartboostMediationFullscreenAdQueueListener chartboostMediationFullscreenAdQueueListener) {
        this.adQueueListener = chartboostMediationFullscreenAdQueueListener;
    }

    public final void setKeywords(Keywords keywords) {
        Intrinsics.f(keywords, "<set-?>");
        this.keywords = keywords;
    }

    public final void setPaused$Helium_release(boolean z2) {
        this.isPaused = z2;
    }

    public final void setQueueCapacity(int i2) {
        int i3 = this.maxQueueSize;
        if (i3 < 1) {
            i3 = 1;
        }
        int iB = RangesKt.b(i2, 1, i3);
        if (i2 != iB) {
            LogController.INSTANCE.e("Queue capacity adjusted to be within valid range: " + iB);
        }
        PlacementStorage.INSTANCE.addQueueSize(this.placementName, iB, i3);
        this.queueCapacity = iB;
    }

    public final void start() {
        if (HeliumSdk.INSTANCE.getChartboostMediationInternal$Helium_release().getInitializationStatus() != HeliumSdk.ChartboostMediationInitializationStatus.INITIALIZED) {
            LogController.INSTANCE.d("The fullscreen ad queue for: " + this.placementName + " the Chartboost Mediation SDK has not initialized. Cannot start the queue. Waiting until the Chartboost Mediation SDK has started before queuing.");
            this.isRunning = true;
            this.isPaused = true;
            return;
        }
        if (this.isRunning && !this.isPaused) {
            LogController.INSTANCE.d("The fullscreen ad queue for: " + this.placementName + " is already running");
            return;
        }
        this.isRunning = true;
        this.isPaused = false;
        this.queueId = Environment.INSTANCE.getSessionId$Helium_release() + System.currentTimeMillis();
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new AnonymousClass1(null), 3);
        startAdFetchJob$default(this, false, 1, null);
    }

    public final void stop() {
        cancelAllJobs();
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new C09841(null), 3);
    }
}
