package com.codejoy.boom.clap.service;

import com.codejoy.boom.clap.data.FunctionMode;
import com.codejoy.boom.clap.module.result.FoundPhoneActivity;
import eia.impromptu;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ClapCounterService.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.service.ClapCounterService$startListener$1$1", f = "ClapCounterService.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ClapCounterService$startListener$1$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ClapCounterService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClapCounterService$startListener$1$1(ClapCounterService clapCounterService, wretchedly.dern<? super ClapCounterService$startListener$1$1> dernVar) {
        super(2, dernVar);
        this.this$0 = clapCounterService;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        ClapCounterService$startListener$1$1 clapCounterService$startListener$1$1 = new ClapCounterService$startListener$1$1(this.this$0, dernVar);
        clapCounterService$startListener$1$1.L$0 = obj;
        return clapCounterService$startListener$1$1;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM3351constructorimpl;
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        if (!this.this$0.getIsPlaySound() && (!tau.saneness.f38666attabal.gintrap() || !ClapCounterService.INSTANCE.cutely())) {
            stonecrop.wireman.saneness(stonecrop.wireman.f38163attabal, "4b_detect_clap", null, null, null, null, 30, null);
            ClapCounterService clapCounterService = this.this$0;
            try {
                Result.Companion companion = Result.INSTANCE;
                clapCounterService.triweekly(FunctionMode.MODE_CLAP_FIND_PHONE);
                clapCounterService.rotuma();
                if (!com.yoadx.ad.lib.core.marial.f23882attabal.attabal()) {
                    FoundPhoneActivity.INSTANCE.attabal(clapCounterService, clapCounterService.getFunctionMode());
                }
                objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
            if (thM3354exceptionOrNullimpl != null) {
                impromptu.saneness().wireman(thM3354exceptionOrNullimpl);
            }
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((ClapCounterService$startListener$1$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
