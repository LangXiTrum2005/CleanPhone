package com.codejoy.boom.clap.module.vip;

import java.util.List;
import kotlinx.coroutines.saran;
import loungewear.PurchaseItem;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: VipActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.module.vip.VipActivity$initData$1$1$2", f = "VipActivity.kt", l = {}, m = "invokeSuspend", v = 1)
public final class VipActivity$initData$1$1$2 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    int label;
    final /* synthetic */ VipActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipActivity$initData$1$1$2(VipActivity vipActivity, wretchedly.dern<? super VipActivity$initData$1$1$2> dernVar) {
        super(2, dernVar);
        this.this$0 = vipActivity;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new VipActivity$initData$1$1$2(this.this$0, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        List<PurchaseItem> list = this.this$0.currentPurchaseList;
        if (list != null) {
            this.this$0.coi().cutely(list);
        }
        this.this$0.achondroplasia();
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((VipActivity$initData$1$1$2) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
