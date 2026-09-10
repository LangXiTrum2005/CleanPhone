package com.chartboost.mediation.chartboostadapter;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.mediation.chartboostadapter.ChartboostAdapter", f = "ChartboostAdapter.kt", l = {959}, m = "loadRewardedAd-0E7RQCE")
public final class ChartboostAdapter$loadRewardedAd$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChartboostAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostAdapter$loadRewardedAd$1(ChartboostAdapter chartboostAdapter, Continuation<? super ChartboostAdapter$loadRewardedAd$1> continuation) {
        super(continuation);
        this.this$0 = chartboostAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM177loadRewardedAd0E7RQCE = this.this$0.m177loadRewardedAd0E7RQCE(null, null, this);
        return objM177loadRewardedAd0E7RQCE == CoroutineSingletons.X ? objM177loadRewardedAd0E7RQCE : new Result(objM177loadRewardedAd0E7RQCE);
    }
}
