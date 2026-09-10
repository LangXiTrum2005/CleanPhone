package com.chartboost.heliumsdk.ad;

import com.chartboost.heliumsdk.domain.CachedAd;
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
@DebugMetadata(c = "com.chartboost.heliumsdk.ad.HeliumFullscreenAd$load$3$1$1", f = "HeliumFullscreenAd.kt", l = {}, m = "invokeSuspend")
public final class HeliumFullscreenAd$load$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CachedAd $it;
    final /* synthetic */ String $loadId;
    int label;
    final /* synthetic */ HeliumFullscreenAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeliumFullscreenAd$load$3$1$1(HeliumFullscreenAd heliumFullscreenAd, String str, CachedAd cachedAd, Continuation<? super HeliumFullscreenAd$load$3$1$1> continuation) {
        super(2, continuation);
        this.this$0 = heliumFullscreenAd;
        this.$loadId = str;
        this.$it = cachedAd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HeliumFullscreenAd$load$3$1$1(this.this$0, this.$loadId, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.inflightRequest = null;
        HeliumFullscreenAdListener listener = this.this$0.getListener();
        if (listener != null) {
            listener.onAdCached(this.this$0.getPlacementName(), this.$loadId, this.$it.getWinningBidInfo(), null);
        }
        return Unit.f43263a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HeliumFullscreenAd$load$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
