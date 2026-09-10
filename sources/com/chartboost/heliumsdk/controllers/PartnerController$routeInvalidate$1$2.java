package com.chartboost.heliumsdk.controllers;

import com.chartboost.heliumsdk.domain.PartnerAd;
import com.chartboost.heliumsdk.domain.PartnerAdapter;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.Result;
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
@DebugMetadata(c = "com.chartboost.heliumsdk.controllers.PartnerController$routeInvalidate$1$2", f = "PartnerController.kt", l = {IronSourceError.ERROR_NT_LOAD_WHILE_LONG_INITIATION}, m = "invokeSuspend")
public final class PartnerController$routeInvalidate$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PartnerAdapter $adapter;
    final /* synthetic */ PartnerAd $partnerAd;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerController$routeInvalidate$1$2(PartnerAdapter partnerAdapter, PartnerAd partnerAd, Continuation<? super PartnerController$routeInvalidate$1$2> continuation) {
        super(2, continuation);
        this.$adapter = partnerAdapter;
        this.$partnerAd = partnerAd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartnerController$routeInvalidate$1$2(this.$adapter, this.$partnerAd, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            PartnerAdapter partnerAdapter = this.$adapter;
            PartnerAd partnerAd = this.$partnerAd;
            this.label = 1;
            if (partnerAdapter.mo164invalidategIAlus(partnerAd, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            ((Result) obj).getClass();
        }
        return Unit.f43263a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PartnerController$routeInvalidate$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
