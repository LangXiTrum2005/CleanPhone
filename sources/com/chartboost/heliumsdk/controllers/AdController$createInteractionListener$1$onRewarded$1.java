package com.chartboost.heliumsdk.controllers;

import com.chartboost.heliumsdk.domain.Bids;
import com.chartboost.heliumsdk.domain.CachedAd;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.AdController$createInteractionListener$1$onRewarded$1", f = "AdController.kt", l = {301, 308}, m = "invokeSuspend")
public final class AdController$createInteractionListener$1$onRewarded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bids $bids;
    final /* synthetic */ CachedAd $cachedAd;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdController$createInteractionListener$1$onRewarded$1(Bids bids, CachedAd cachedAd, Continuation<? super AdController$createInteractionListener$1$onRewarded$1> continuation) {
        super(2, continuation);
        this.$bids = bids;
        this.$cachedAd = cachedAd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdController$createInteractionListener$1$onRewarded$1(this.$bids, this.$cachedAd, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r6 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.X
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r6)
            goto L57
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            kotlin.ResultKt.b(r6)
            goto L36
        L1c:
            kotlin.ResultKt.b(r6)
            com.chartboost.heliumsdk.network.ChartboostMediationNetworking r6 = com.chartboost.heliumsdk.network.ChartboostMediationNetworking.INSTANCE
            com.chartboost.heliumsdk.domain.Bids r1 = r5.$bids
            java.lang.String r1 = r1.getAuctionId()
            com.chartboost.heliumsdk.domain.CachedAd r4 = r5.$cachedAd
            java.lang.String r4 = r4.getLoadId()
            r5.label = r3
            java.lang.Object r6 = r6.trackReward(r1, r4, r5)
            if (r6 != r0) goto L36
            goto L56
        L36:
            com.chartboost.heliumsdk.domain.Bids r6 = r5.$bids
            com.chartboost.heliumsdk.domain.Bid r6 = r6.getActiveBid()
            if (r6 == 0) goto L59
            com.chartboost.heliumsdk.domain.Bids r1 = r5.$bids
            com.chartboost.heliumsdk.domain.RewardedCallbackData r1 = r1.getRewardedCallbackData()
            if (r1 == 0) goto L59
            com.chartboost.heliumsdk.domain.CachedAd r3 = r5.$cachedAd
            com.chartboost.heliumsdk.network.ChartboostMediationNetworking r4 = com.chartboost.heliumsdk.network.ChartboostMediationNetworking.INSTANCE
            java.lang.String r3 = r3.getCustomData()
            r5.label = r2
            java.lang.Object r6 = r4.makeRewardedCallbackRequest(r6, r3, r1, r5)
            if (r6 != r0) goto L57
        L56:
            return r0
        L57:
            com.chartboost.heliumsdk.network.model.ChartboostMediationNetworkingResult r6 = (com.chartboost.heliumsdk.network.model.ChartboostMediationNetworkingResult) r6
        L59:
            kotlin.Unit r6 = kotlin.Unit.f43263a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.heliumsdk.controllers.AdController$createInteractionListener$1$onRewarded$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdController$createInteractionListener$1$onRewarded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
