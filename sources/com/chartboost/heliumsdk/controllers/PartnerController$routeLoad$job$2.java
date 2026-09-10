package com.chartboost.heliumsdk.controllers;

import android.content.Context;
import android.util.Size;
import com.applovin.shadow.okio.Segment;
import com.chartboost.heliumsdk.domain.ChartboostMediationAdException;
import com.chartboost.heliumsdk.domain.ChartboostMediationError;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.MetricsManager;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.domain.PartnerAdLoadRequest;
import com.chartboost.heliumsdk.domain.PartnerAdapter;
import com.chartboost.heliumsdk.network.Endpoints;
import com.p004ironsource.mediationsdk.metadata.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController$routeLoad$job$2", f = "PartnerController.kt", l = {472}, m = "invokeSuspend")
public final class PartnerController$routeLoad$job$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $auctionId;
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $isMediation;
    final /* synthetic */ String $lineItemId;
    final /* synthetic */ Set<Metrics> $loadMetricsSet;
    final /* synthetic */ String $placementType;
    final /* synthetic */ PartnerAdLoadRequest $request;
    final /* synthetic */ Ref.ObjectRef<Result<PartnerAd>> $result;
    int label;
    final /* synthetic */ PartnerController this$0;

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.PartnerController$routeLoad$job$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController$routeLoad$job$2$1", f = "PartnerController.kt", l = {473}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $auctionId;
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $isMediation;
        final /* synthetic */ String $lineItemId;
        final /* synthetic */ Set<Metrics> $loadMetricsSet;
        final /* synthetic */ String $placementType;
        final /* synthetic */ PartnerAdLoadRequest $request;
        final /* synthetic */ Ref.ObjectRef<Result<PartnerAd>> $result;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PartnerController this$0;

        /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.PartnerController$routeLoad$job$2$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController$routeLoad$job$2$1$1", f = "PartnerController.kt", l = {498}, m = "invokeSuspend")
        public static final class C01611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
            final /* synthetic */ String $auctionId;
            final /* synthetic */ Context $context;
            final /* synthetic */ boolean $isMediation;
            final /* synthetic */ String $lineItemId;
            final /* synthetic */ Set<Metrics> $loadMetricsSet;
            final /* synthetic */ String $placementType;
            final /* synthetic */ PartnerAdLoadRequest $request;
            final /* synthetic */ Ref.ObjectRef<Result<PartnerAd>> $result;
            long J$0;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PartnerController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01611(PartnerController partnerController, PartnerAdLoadRequest partnerAdLoadRequest, Set<Metrics> set, String str, String str2, boolean z2, String str3, Context context, Ref.ObjectRef<Result<PartnerAd>> objectRef, Continuation<? super C01611> continuation) {
                super(2, continuation);
                this.this$0 = partnerController;
                this.$request = partnerAdLoadRequest;
                this.$loadMetricsSet = set;
                this.$auctionId = str;
                this.$lineItemId = str2;
                this.$isMediation = z2;
                this.$placementType = str3;
                this.$context = context;
                this.$result = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01611 c01611 = new C01611(this.this$0, this.$request, this.$loadMetricsSet, this.$auctionId, this.$lineItemId, this.$isMediation, this.$placementType, this.$context, this.$result, continuation);
                c01611.L$0 = obj;
                return c01611;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                long j;
                Metrics metrics;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.b(obj);
                    PartnerAdapter partnerAdapter = this.this$0.getAdapters().get(this.$request.getPartnerId());
                    if (partnerAdapter == null) {
                        PartnerAdLoadRequest partnerAdLoadRequest = this.$request;
                        String str = this.$auctionId;
                        String str2 = this.$placementType;
                        Ref.ObjectRef<Result<PartnerAd>> objectRef = this.$result;
                        MetricsManager metricsManager = MetricsManager.INSTANCE;
                        String partnerId = partnerAdLoadRequest.getPartnerId();
                        Endpoints.Sdk.Event event = Endpoints.Sdk.Event.LOAD;
                        ChartboostMediationError chartboostMediationError = ChartboostMediationError.CM_LOAD_FAILURE_ADAPTER_NOT_FOUND;
                        String message = chartboostMediationError.getMessage();
                        String identifier = partnerAdLoadRequest.getIdentifier();
                        Size size = partnerAdLoadRequest.getSize();
                        if (size == null || !Intrinsics.a(str2, "adaptive_banner")) {
                            size = null;
                        }
                        metricsManager.postMetricsDataForFailedEvent(partnerId, event, str, chartboostMediationError, message, (14336 & 32) != 0 ? null : str2, (14336 & 64) != 0 ? null : size, (14336 & 128) != 0 ? null : null, (14336 & 256) != 0 ? null : null, (14336 & 512) != 0 ? null : identifier, (14336 & 1024) != 0 ? null : null, (14336 & a.f25965n) != 0 ? null : null, (14336 & 4096) != 0 ? null : null, (14336 & Segment.SIZE) != 0 ? null : null);
                        objectRef.X = ResultKt.a(new ChartboostMediationAdException(chartboostMediationError));
                        return Unit.f43263a;
                    }
                    Set<Metrics> set = this.$loadMetricsSet;
                    String str3 = this.$auctionId;
                    String str4 = this.$lineItemId;
                    boolean z2 = this.$isMediation;
                    PartnerAdLoadRequest partnerAdLoadRequest2 = this.$request;
                    String str5 = this.$placementType;
                    Context context = this.$context;
                    PartnerController partnerController = this.this$0;
                    Ref.ObjectRef<Result<PartnerAd>> objectRef2 = this.$result;
                    Metrics metrics2 = new Metrics(partnerAdapter.getPartnerId(), Endpoints.Sdk.Event.LOAD);
                    set.add(metrics2);
                    metrics2.setAuctionId(str3);
                    metrics2.setLineItemId(str4);
                    metrics2.setNetworkType(Metrics.NetworkType.INSTANCE.getType(z2));
                    metrics2.setPartnerPlacement(partnerAdLoadRequest2.getPartnerPlacement());
                    metrics2.setPlacementType(str5);
                    if (Intrinsics.a(str5, "adaptive_banner") && partnerAdLoadRequest2.getSize() != null) {
                        metrics2.setSize(new Size(partnerAdLoadRequest2.getSize().getWidth(), partnerAdLoadRequest2.getSize().getHeight()));
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                    MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f45042a;
                    PartnerController$routeLoad$job$2$1$1$1$1$1 partnerController$routeLoad$job$2$1$1$1$1$1 = new PartnerController$routeLoad$job$2$1$1$1$1$1(metrics2, partnerAdapter, context, partnerAdLoadRequest2, partnerController, str3, objectRef2, null);
                    this.L$0 = metrics2;
                    this.J$0 = jCurrentTimeMillis;
                    this.label = 1;
                    if (BuildersKt.f(mainCoroutineDispatcher, partnerController$routeLoad$job$2$1$1$1$1$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    j = jCurrentTimeMillis;
                    metrics = metrics2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.J$0;
                    metrics = (Metrics) this.L$0;
                    ResultKt.b(obj);
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                metrics.setDuration(new Long(jCurrentTimeMillis2));
                return new Long(jCurrentTimeMillis2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
                return ((C01611) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PartnerController partnerController, PartnerAdLoadRequest partnerAdLoadRequest, Set<Metrics> set, String str, String str2, boolean z2, String str3, Context context, Ref.ObjectRef<Result<PartnerAd>> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = partnerController;
            this.$request = partnerAdLoadRequest;
            this.$loadMetricsSet = set;
            this.$auctionId = str;
            this.$lineItemId = str2;
            this.$isMediation = z2;
            this.$placementType = str3;
            this.$context = context;
            this.$result = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, this.$loadMetricsSet, this.$auctionId, this.$lineItemId, this.$isMediation, this.$placementType, this.$context, this.$result, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objC;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                long loadTimeoutMs = this.this$0.getLoadTimeoutMs(this.$request.getFormat());
                C01611 c01611 = new C01611(this.this$0, this.$request, this.$loadMetricsSet, this.$auctionId, this.$lineItemId, this.$isMediation, this.$placementType, this.$context, this.$result, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                objC = TimeoutKt.c(loadTimeoutMs, c01611, this);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                objC = obj;
            }
            if (objC == null) {
                PartnerAdLoadRequest partnerAdLoadRequest = this.$request;
                boolean z2 = this.$isMediation;
                String str = this.$auctionId;
                String str2 = this.$placementType;
                String str3 = this.$lineItemId;
                Ref.ObjectRef<Result<PartnerAd>> objectRef = this.$result;
                MetricsManager metricsManager = MetricsManager.INSTANCE;
                String partnerId = partnerAdLoadRequest.getPartnerId();
                Endpoints.Sdk.Event event = Endpoints.Sdk.Event.LOAD;
                ChartboostMediationError chartboostMediationError = ChartboostMediationError.CM_LOAD_FAILURE_TIMEOUT;
                String message = chartboostMediationError.getMessage();
                String identifier = partnerAdLoadRequest.getIdentifier();
                Size size = partnerAdLoadRequest.getSize();
                if (size == null || !Intrinsics.a(str2, "adaptive_banner")) {
                    size = null;
                }
                metricsManager.postMetricsDataForFailedEvent(partnerId, event, str, chartboostMediationError, message, (14336 & 32) != 0 ? null : str2, (14336 & 64) != 0 ? null : size, (14336 & 128) != 0 ? null : null, (14336 & 256) != 0 ? null : null, (14336 & 512) != 0 ? null : identifier, (14336 & 1024) != 0 ? null : null, (14336 & a.f25965n) != 0 ? null : Metrics.NetworkType.INSTANCE.getType(z2), (14336 & 4096) != 0 ? null : str3, (14336 & Segment.SIZE) != 0 ? null : partnerAdLoadRequest.getPartnerPlacement());
                objectRef.X = ResultKt.a(new ChartboostMediationAdException(chartboostMediationError));
            }
            return Unit.f43263a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerController$routeLoad$job$2(PartnerController partnerController, PartnerAdLoadRequest partnerAdLoadRequest, Set<Metrics> set, String str, String str2, boolean z2, String str3, Context context, Ref.ObjectRef<Result<PartnerAd>> objectRef, Continuation<? super PartnerController$routeLoad$job$2> continuation) {
        super(2, continuation);
        this.this$0 = partnerController;
        this.$request = partnerAdLoadRequest;
        this.$loadMetricsSet = set;
        this.$auctionId = str;
        this.$lineItemId = str2;
        this.$isMediation = z2;
        this.$placementType = str3;
        this.$context = context;
        this.$result = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartnerController$routeLoad$job$2(this.this$0, this.$request, this.$loadMetricsSet, this.$auctionId, this.$lineItemId, this.$isMediation, this.$placementType, this.$context, this.$result, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, this.$loadMetricsSet, this.$auctionId, this.$lineItemId, this.$isMediation, this.$placementType, this.$context, this.$result, null);
            this.label = 1;
            if (BuildersKt.f(defaultIoScheduler, anonymousClass1, this) == coroutineSingletons) {
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
        return ((PartnerController$routeLoad$job$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
