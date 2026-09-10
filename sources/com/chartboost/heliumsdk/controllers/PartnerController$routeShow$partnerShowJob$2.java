package com.chartboost.heliumsdk.controllers;

import android.content.Context;
import com.chartboost.heliumsdk.domain.AppConfigStorage;
import com.chartboost.heliumsdk.domain.Metrics;
import com.chartboost.heliumsdk.domain.MetricsManager;
import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.domain.PartnerAdapter;
import com.chartboost.heliumsdk.network.Endpoints;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController$routeShow$partnerShowJob$2", f = "PartnerController.kt", l = {655}, m = "invokeSuspend")
public final class PartnerController$routeShow$partnerShowJob$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $auctionIdentifier;
    final /* synthetic */ Context $context;
    final /* synthetic */ Ref.ObjectRef<PartnerController.PartnerShowResult> $internalAdShowResult;
    final /* synthetic */ String $loadId;
    final /* synthetic */ PartnerAd $partnerAd;
    Object L$0;
    int label;
    final /* synthetic */ PartnerController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerController$routeShow$partnerShowJob$2(PartnerAd partnerAd, PartnerController partnerController, Ref.ObjectRef<PartnerController.PartnerShowResult> objectRef, String str, String str2, Context context, Continuation<? super PartnerController$routeShow$partnerShowJob$2> continuation) {
        super(2, continuation);
        this.$partnerAd = partnerAd;
        this.this$0 = partnerController;
        this.$internalAdShowResult = objectRef;
        this.$loadId = str;
        this.$auctionIdentifier = str2;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartnerController$routeShow$partnerShowJob$2(this.$partnerAd, this.this$0, this.$internalAdShowResult, this.$loadId, this.$auctionIdentifier, this.$context, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Set set;
        Set set2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Metrics metrics = new Metrics(this.$partnerAd.getRequest().getPartnerId(), Endpoints.Sdk.Event.SHOW);
            linkedHashSet.add(metrics);
            PartnerAdapter partnerAdapter = this.this$0.getAdapters().get(this.$partnerAd.getRequest().getPartnerId());
            if (partnerAdapter != null) {
                String str = this.$auctionIdentifier;
                PartnerController partnerController = this.this$0;
                Context context = this.$context;
                PartnerAd partnerAd = this.$partnerAd;
                metrics.setAuctionId(str);
                long showTimeoutSeconds = ((long) AppConfigStorage.INSTANCE.getShowTimeoutSeconds()) * 1000;
                PartnerController$routeShow$partnerShowJob$2$1$1 partnerController$routeShow$partnerShowJob$2$1$1 = new PartnerController$routeShow$partnerShowJob$2$1$1(metrics, partnerController, partnerAdapter, context, partnerAd, null);
                this.L$0 = linkedHashSet;
                this.label = 1;
                Object objC = TimeoutKt.c(showTimeoutSeconds, partnerController$routeShow$partnerShowJob$2$1$1, this);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                set2 = linkedHashSet;
                obj = objC;
            } else {
                set = linkedHashSet;
            }
            this.$internalAdShowResult.X = new PartnerController.PartnerShowResult(this.$partnerAd, set);
            MetricsManager.postMetricsData$default(MetricsManager.INSTANCE, set, this.$loadId, null, null, null, null, 60, null);
            return Unit.f43263a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        set2 = (Set) this.L$0;
        ResultKt.b(obj);
        set = set2;
        this.$internalAdShowResult.X = new PartnerController.PartnerShowResult(this.$partnerAd, set);
        MetricsManager.postMetricsData$default(MetricsManager.INSTANCE, set, this.$loadId, null, null, null, null, 60, null);
        return Unit.f43263a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PartnerController$routeShow$partnerShowJob$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
