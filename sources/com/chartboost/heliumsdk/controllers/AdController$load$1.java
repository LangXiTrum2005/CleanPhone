package com.chartboost.heliumsdk.controllers;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.AdController", f = "AdController.kt", l = {104, 145}, m = "load-BWLJW6A")
public final class AdController$load$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdController$load$1(AdController adController, Continuation<? super AdController$load$1> continuation) {
        super(continuation);
        this.this$0 = adController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM161loadBWLJW6A = this.this$0.m161loadBWLJW6A(null, null, null, this);
        return objM161loadBWLJW6A == CoroutineSingletons.X ? objM161loadBWLJW6A : new Result(objM161loadBWLJW6A);
    }
}
