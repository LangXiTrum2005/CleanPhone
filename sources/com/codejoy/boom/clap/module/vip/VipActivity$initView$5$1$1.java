package com.codejoy.boom.clap.module.vip;

import com.blankj.utilcode.util.ToastUtils;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: VipActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.module.vip.VipActivity$initView$5$1$1", f = "VipActivity.kt", l = {}, m = "invokeSuspend", v = 1)
public final class VipActivity$initView$5$1$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ boolean $it;
    int label;
    final /* synthetic */ VipActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipActivity$initView$5$1$1(boolean z, VipActivity vipActivity, wretchedly.dern<? super VipActivity$initView$5$1$1> dernVar) {
        super(2, dernVar);
        this.$it = z;
        this.this$0 = vipActivity;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new VipActivity$initView$5$1$1(this.$it, this.this$0, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        if (this.$it) {
            this.this$0.claque();
        } else {
            ToastUtils.polloi(this.this$0.getString(com.codejoy.boom.clap.arytenoidectomy.no_transaction_found), new Object[0]);
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((VipActivity$initView$5$1$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
