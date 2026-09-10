package com.chartboost.mediation.chartboostadapter;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.mediation.chartboostadapter.ChartboostAdapter", f = "ChartboostAdapter.kt", l = {344, 345, 346}, m = "load-BWLJW6A")
public final class ChartboostAdapter$load$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChartboostAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostAdapter$load$1(ChartboostAdapter chartboostAdapter, Continuation<? super ChartboostAdapter$load$1> continuation) {
        super(continuation);
        this.this$0 = chartboostAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo165loadBWLJW6A = this.this$0.mo165loadBWLJW6A(null, null, null, this);
        return objMo165loadBWLJW6A == CoroutineSingletons.X ? objMo165loadBWLJW6A : new Result(objMo165loadBWLJW6A);
    }
}
