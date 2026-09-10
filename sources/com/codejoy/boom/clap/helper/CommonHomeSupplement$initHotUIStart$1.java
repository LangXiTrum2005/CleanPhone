package com.codejoy.boom.clap.helper;

import android.app.Activity;
import android.app.Application;
import com.codejoy.boom.clap.module.vip.VipInfoManager;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import reuter.molybdenite;

/* JADX INFO: compiled from: CommonHomeSupplement.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {2, 2, 0})
@igo.wireman(c = "com.codejoy.boom.clap.helper.CommonHomeSupplement$initHotUIStart$1", f = "CommonHomeSupplement.kt", l = {}, m = "invokeSuspend", v = 1)
public final class CommonHomeSupplement$initHotUIStart$1 extends SuspendLambda implements Function2<saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonHomeSupplement$initHotUIStart$1(Activity activity, wretchedly.dern<? super CommonHomeSupplement$initHotUIStart$1> dernVar) {
        super(2, dernVar);
        this.$activity = activity;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new CommonHomeSupplement$initHotUIStart$1(this.$activity, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        molybdenite molybdeniteVar = molybdenite.f36681attabal;
        Application application = this.$activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        molybdeniteVar.saran(application, false);
        VipInfoManager vipInfoManagerAttabal = VipInfoManager.INSTANCE.attabal();
        Application application2 = this.$activity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application2, "getApplication(...)");
        vipInfoManagerAttabal.cutely(application2);
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((CommonHomeSupplement$initHotUIStart$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
