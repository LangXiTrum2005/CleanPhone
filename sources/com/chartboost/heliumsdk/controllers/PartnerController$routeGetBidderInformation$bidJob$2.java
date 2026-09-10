package com.chartboost.heliumsdk.controllers;

import android.content.Context;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.MetricsManager;
import com.chartboost.heliumsdk.domain.PreBidRequest;
import com.chartboost.heliumsdk.network.Endpoints;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController$routeGetBidderInformation$bidJob$2", f = "PartnerController.kt", l = {366}, m = "invokeSuspend")
public final class PartnerController$routeGetBidderInformation$bidJob$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConcurrentHashMap<String, Map<String, String>> $bidTokens;
    final /* synthetic */ Context $context;
    final /* synthetic */ PreBidRequest $request;
    Object L$0;
    int label;
    final /* synthetic */ PartnerController this$0;

    /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.PartnerController$routeGetBidderInformation$bidJob$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController$routeGetBidderInformation$bidJob$2$1", f = "PartnerController.kt", l = {367}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Long>>, Object> {
        final /* synthetic */ ConcurrentHashMap<String, Map<String, String>> $bidTokens;
        final /* synthetic */ Context $context;
        final /* synthetic */ Set<Metrics> $metricsDataSet;
        final /* synthetic */ PreBidRequest $request;
        int label;
        final /* synthetic */ PartnerController this$0;

        /* JADX INFO: renamed from: com.chartboost.heliumsdk.controllers.PartnerController$routeGetBidderInformation$bidJob$2$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController$routeGetBidderInformation$bidJob$2$1$1", f = "PartnerController.kt", l = {403}, m = "invokeSuspend")
        public static final class C01601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Long>>, Object> {
            final /* synthetic */ ConcurrentHashMap<String, Map<String, String>> $bidTokens;
            final /* synthetic */ Context $context;
            final /* synthetic */ Set<Metrics> $metricsDataSet;
            final /* synthetic */ PreBidRequest $request;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ PartnerController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01601(PartnerController partnerController, Set<Metrics> set, ConcurrentHashMap<String, Map<String, String>> concurrentHashMap, Context context, PreBidRequest preBidRequest, Continuation<? super C01601> continuation) {
                super(2, continuation);
                this.this$0 = partnerController;
                this.$metricsDataSet = set;
                this.$bidTokens = concurrentHashMap;
                this.$context = context;
                this.$request = preBidRequest;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01601 c01601 = new C01601(this.this$0, this.$metricsDataSet, this.$bidTokens, this.$context, this.$request, continuation);
                c01601.L$0 = obj;
                return c01601;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return obj;
                }
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Set<String> setKeySet = this.this$0.getAdapters().keySet();
                Set<Metrics> set = this.$metricsDataSet;
                PartnerController partnerController = this.this$0;
                ConcurrentHashMap<String, Map<String, String>> concurrentHashMap = this.$bidTokens;
                Context context = this.$context;
                PreBidRequest preBidRequest = this.$request;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(setKeySet, 10));
                for (String str : setKeySet) {
                    Metrics metrics = new Metrics(str, Endpoints.Sdk.Event.PREBID);
                    set.add(metrics);
                    arrayList.add(BuildersKt.a(coroutineScope, null, new PartnerController$routeGetBidderInformation$bidJob$2$1$1$1$1(partnerController, str, metrics, concurrentHashMap, context, preBidRequest, null), 3));
                }
                this.label = 1;
                Object objA = AwaitKt.a(arrayList, this);
                return objA == coroutineSingletons ? coroutineSingletons : objA;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<Long>> continuation) {
                return ((C01601) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PartnerController partnerController, Set<Metrics> set, ConcurrentHashMap<String, Map<String, String>> concurrentHashMap, Context context, PreBidRequest preBidRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = partnerController;
            this.$metricsDataSet = set;
            this.$bidTokens = concurrentHashMap;
            this.$context = context;
            this.$request = preBidRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$metricsDataSet, this.$bidTokens, this.$context, this.$request, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            ResultKt.b(obj);
            long prebidFetchTimeoutMs = this.this$0.getPrebidFetchTimeoutMs();
            C01601 c01601 = new C01601(this.this$0, this.$metricsDataSet, this.$bidTokens, this.$context, this.$request, null);
            this.label = 1;
            Object objC = TimeoutKt.c(prebidFetchTimeoutMs, c01601, this);
            return objC == coroutineSingletons ? coroutineSingletons : objC;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<Long>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerController$routeGetBidderInformation$bidJob$2(PreBidRequest preBidRequest, PartnerController partnerController, ConcurrentHashMap<String, Map<String, String>> concurrentHashMap, Context context, Continuation<? super PartnerController$routeGetBidderInformation$bidJob$2> continuation) {
        super(2, continuation);
        this.$request = preBidRequest;
        this.this$0 = partnerController;
        this.$bidTokens = concurrentHashMap;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartnerController$routeGetBidderInformation$bidJob$2(this.$request, this.this$0, this.$bidTokens, this.$context, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set set;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.f45062Y;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, linkedHashSet, this.$bidTokens, this.$context, this.$request, null);
            this.L$0 = linkedHashSet;
            this.label = 1;
            if (BuildersKt.f(defaultIoScheduler, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            set = linkedHashSet;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set2 = (Set) this.L$0;
            ResultKt.b(obj);
            set = set2;
        }
        MetricsManager.postMetricsData$default(MetricsManager.INSTANCE, set, this.$request.getLoadId(), null, null, null, null, 60, null);
        return Unit.f43263a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PartnerController$routeGetBidderInformation$bidJob$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
