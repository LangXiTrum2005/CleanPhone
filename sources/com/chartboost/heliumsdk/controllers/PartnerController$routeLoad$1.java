package com.chartboost.heliumsdk.controllers;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController", f = "PartnerController.kt", l = {567}, m = "routeLoad-eH_QyT8$Helium_release")
public final class PartnerController$routeLoad$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PartnerController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerController$routeLoad$1(PartnerController partnerController, Continuation<? super PartnerController$routeLoad$1> continuation) {
        super(continuation);
        this.this$0 = partnerController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM163routeLoadeH_QyT8$Helium_release = this.this$0.m163routeLoadeH_QyT8$Helium_release(null, null, null, false, null, null, null, this);
        return objM163routeLoadeH_QyT8$Helium_release == CoroutineSingletons.X ? objM163routeLoadeH_QyT8$Helium_release : new Result(objM163routeLoadeH_QyT8$Helium_release);
    }
}
