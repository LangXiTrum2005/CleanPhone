package com.chartboost.mediation.chartboostadapter;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.mediation.chartboostadapter.ChartboostAdapter", f = "ChartboostAdapter.kt", l = {959}, m = "showInterstitialAd-gIAlu-s")
public final class ChartboostAdapter$showInterstitialAd$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChartboostAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostAdapter$showInterstitialAd$1(ChartboostAdapter chartboostAdapter, Continuation<? super ChartboostAdapter$showInterstitialAd$1> continuation) {
        super(continuation);
        this.this$0 = chartboostAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM178showInterstitialAdgIAlus = this.this$0.m178showInterstitialAdgIAlus(null, this);
        return objM178showInterstitialAdgIAlus == CoroutineSingletons.X ? objM178showInterstitialAdgIAlus : new Result(objM178showInterstitialAdgIAlus);
    }
}
