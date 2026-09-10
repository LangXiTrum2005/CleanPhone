package com.chartboost.heliumsdk;

import kotlin.Metadata;
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
@DebugMetadata(c = "com.chartboost.heliumsdk.PartnerConsents$addPartnerConsentsObserver$1", f = "PartnerConsents.kt", l = {}, m = "invokeSuspend")
public final class PartnerConsents$addPartnerConsentsObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PartnerConsents.PartnerConsentsObserver $observer;
    int label;
    final /* synthetic */ PartnerConsents this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerConsents$addPartnerConsentsObserver$1(PartnerConsents partnerConsents, PartnerConsents.PartnerConsentsObserver partnerConsentsObserver, Continuation<? super PartnerConsents$addPartnerConsentsObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = partnerConsents;
        this.$observer = partnerConsentsObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PartnerConsents$addPartnerConsentsObserver$1(this.this$0, this.$observer, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.partnerConsentsObservers.add(this.$observer);
        return Unit.f43263a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PartnerConsents$addPartnerConsentsObserver$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
    }
}
