package com.chartboost.mediation.chartboostadapter;

import com.chartboost.sdk.events.CacheEvent;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.mediation.chartboostadapter.ChartboostAdapter$loadBannerAd$2$chartboostBanner$1$onAdLoaded$2$1", f = "ChartboostAdapter.kt", l = {}, m = "invokeSuspend")
public final class ChartboostAdapter$loadBannerAd$2$chartboostBanner$1$onAdLoaded$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CacheEvent $event;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostAdapter$loadBannerAd$2$chartboostBanner$1$onAdLoaded$2$1(CacheEvent cacheEvent, Continuation<? super ChartboostAdapter$loadBannerAd$2$chartboostBanner$1$onAdLoaded$2$1> continuation) {
        super(2, continuation);
        this.$event = cacheEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartboostAdapter$loadBannerAd$2$chartboostBanner$1$onAdLoaded$2$1(this.$event, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.$event.getAd().show();
        return Unit.f43263a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartboostAdapter$loadBannerAd$2$chartboostBanner$1$onAdLoaded$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
