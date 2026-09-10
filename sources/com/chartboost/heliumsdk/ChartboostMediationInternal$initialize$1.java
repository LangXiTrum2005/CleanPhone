package com.chartboost.heliumsdk;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.ChartboostMediationInternal", f = "ChartboostMediationInternal.kt", l = {72}, m = "initialize-yxL6bBk$Helium_release")
public final class ChartboostMediationInternal$initialize$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChartboostMediationInternal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartboostMediationInternal$initialize$1(ChartboostMediationInternal chartboostMediationInternal, Continuation<? super ChartboostMediationInternal$initialize$1> continuation) {
        super(continuation);
        this.this$0 = chartboostMediationInternal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM160initializeyxL6bBk$Helium_release = this.this$0.m160initializeyxL6bBk$Helium_release(null, null, null, null, this);
        return objM160initializeyxL6bBk$Helium_release == CoroutineSingletons.X ? objM160initializeyxL6bBk$Helium_release : new Result(objM160initializeyxL6bBk$Helium_release);
    }
}
