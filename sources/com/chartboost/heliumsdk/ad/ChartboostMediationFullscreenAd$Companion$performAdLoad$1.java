package com.chartboost.heliumsdk.ad;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.ad.ChartboostMediationFullscreenAd$Companion", f = "ChartboostMediationFullscreenAd.kt", l = {147}, m = "performAdLoad")
public final class ChartboostMediationFullscreenAd$Companion$performAdLoad$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChartboostMediationFullscreenAd.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostMediationFullscreenAd$Companion$performAdLoad$1(ChartboostMediationFullscreenAd.Companion companion, Continuation<? super ChartboostMediationFullscreenAd$Companion$performAdLoad$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.performAdLoad(null, null, null, this);
    }
}
