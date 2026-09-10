package com.chartboost.heliumsdk.controllers;

import com.chartboost.heliumsdk.domain.Bids;
import com.chartboost.heliumsdk.domain.CachedAd;
import com.chartboost.heliumsdk.network.ChartboostMediationNetworking;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.AdController$createInteractionListener$1$onClicked$1", f = "AdController.kt", l = {286}, m = "invokeSuspend")
public final class AdController$createInteractionListener$1$onClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bids $bids;
    final /* synthetic */ CachedAd $cachedAd;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdController$createInteractionListener$1$onClicked$1(Bids bids, CachedAd cachedAd, Continuation<? super AdController$createInteractionListener$1$onClicked$1> continuation) {
        super(2, continuation);
        this.$bids = bids;
        this.$cachedAd = cachedAd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdController$createInteractionListener$1$onClicked$1(this.$bids, this.$cachedAd, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ChartboostMediationNetworking chartboostMediationNetworking = ChartboostMediationNetworking.INSTANCE;
            String auctionId = this.$bids.getAuctionId();
            String loadId = this.$cachedAd.getLoadId();
            this.label = 1;
            if (chartboostMediationNetworking.trackClick(auctionId, loadId, this) == coroutineSingletons) {
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
        return ((AdController$createInteractionListener$1$onClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
