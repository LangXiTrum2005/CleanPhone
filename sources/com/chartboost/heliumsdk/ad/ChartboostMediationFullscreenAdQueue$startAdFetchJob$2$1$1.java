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
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAdQueue$startAdFetchJob$2$1$1", f = "ChartboostMediationFullscreenAdQueue.kt", l = {384}, m = "invokeSuspend")
public final class ChartboostMediationFullscreenAdQueue$startAdFetchJob$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChartboostMediationFullscreenAd $ad;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChartboostMediationFullscreenAdQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostMediationFullscreenAdQueue$startAdFetchJob$2$1$1(ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue, ChartboostMediationFullscreenAd chartboostMediationFullscreenAd, Continuation<? super ChartboostMediationFullscreenAdQueue$startAdFetchJob$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = chartboostMediationFullscreenAdQueue;
        this.$ad = chartboostMediationFullscreenAd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChartboostMediationFullscreenAdQueue$startAdFetchJob$2$1$1 chartboostMediationFullscreenAdQueue$startAdFetchJob$2$1$1 = new ChartboostMediationFullscreenAdQueue$startAdFetchJob$2$1$1(this.this$0, this.$ad, continuation);
        chartboostMediationFullscreenAdQueue$startAdFetchJob$2$1$1.L$0 = obj;
        return chartboostMediationFullscreenAdQueue$startAdFetchJob$2$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            long j = this.this$0.queuedAdTtlMs;
            this.L$0 = coroutineScope;
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
        ChartboostMediationFullscreenAdListener listener = this.$ad.getListener();
        Unit unit2 = Unit.f43263a;
        if (listener != null) {
            listener.onAdExpired(this.$ad);
            unit = unit2;
        } else {
            unit = null;
        }
        if (unit == null) {
            ChartboostMediationFullscreenAdQueue chartboostMediationFullscreenAdQueue = this.this$0;
            LogController.INSTANCE.w("The fullscreen ad queue for: " + chartboostMediationFullscreenAdQueue.getPlacementName() + " has ad listener is null. Cannot expire ad.");
        }
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartboostMediationFullscreenAdQueue$startAdFetchJob$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
