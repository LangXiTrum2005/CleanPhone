package com.chartboost.heliumsdk.controllers;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.BidController", f = "BidController.kt", l = {46}, m = "loadBids-hUnOzRk")
public final class BidController$loadBids$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BidController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidController$loadBids$1(BidController bidController, Continuation<? super BidController$loadBids$1> continuation) {
        super(continuation);
        this.this$0 = bidController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM162loadBidshUnOzRk = this.this$0.m162loadBidshUnOzRk(null, null, null, null, null, this);
        return objM162loadBidshUnOzRk == CoroutineSingletons.X ? objM162loadBidshUnOzRk : new Result(objM162loadBidshUnOzRk);
    }
}
