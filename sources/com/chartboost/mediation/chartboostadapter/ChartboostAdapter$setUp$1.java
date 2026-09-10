package com.chartboost.mediation.chartboostadapter;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.mediation.chartboostadapter.ChartboostAdapter", f = "ChartboostAdapter.kt", l = {148}, m = "setUp-0E7RQCE")
public final class ChartboostAdapter$setUp$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChartboostAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostAdapter$setUp$1(ChartboostAdapter chartboostAdapter, Continuation<? super ChartboostAdapter$setUp$1> continuation) {
        super(continuation);
        this.this$0 = chartboostAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo166setUp0E7RQCE = this.this$0.mo166setUp0E7RQCE(null, null, this);
        return objMo166setUp0E7RQCE == CoroutineSingletons.X ? objMo166setUp0E7RQCE : new Result(objMo166setUp0E7RQCE);
    }
}
