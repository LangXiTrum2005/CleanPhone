package com.chartboost.heliumsdk.ad;

import com.chartboost.heliumsdk.utils.LogController;
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
@DebugMetadata(c = "com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1$onAdExpired$2", f = "ChartboostMediationFullscreenAdQueue.kt", l = {}, m = "invokeSuspend")
public final class ChartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1$onAdExpired$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChartboostMediationFullscreenAdQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1$onAdExpired$2(ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue, Continuation<? super ChartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1$onAdExpired$2> continuation) {
        super(2, continuation);
        this.this$0 = chartboostMediationFullscreenAdQueue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1$onAdExpired$2 chartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1$onAdExpired$2 = new ChartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1$onAdExpired$2(this.this$0, continuation);
        chartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1$onAdExpired$2.L$0 = obj;
        return chartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1$onAdExpired$2;
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
            adQueueListener.onFullscreenAdQueueExpiredAdRemoved(chartboostMediationFullscreenAdQueue, chartboostMediationFullscreenAdQueue.getNumberOfAdsReady());
            unit = unit2;
        } else {
            unit = null;
        }
        if (unit == null) {
            ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue2 = this.this$0;
            LogController.INSTANCE.w("Unable to fire onFullscreenAdQueueExpiredAdRemoved() because The fullscreen ad queue for: " + chartboostMediationFullscreenAdQueue2.getPlacementName() + " has a null listener.");
        }
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartboostMediationFullscreenAdQueue$fullscreenAdQueueAdExpiredListener$1$onAdExpired$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
