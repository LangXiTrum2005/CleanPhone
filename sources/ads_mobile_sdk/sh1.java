package ads_mobile_sdk;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class sh1 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ uh1 b;
    public final /* synthetic */ gq0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh1(uh1 uh1Var, gq0 gq0Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = uh1Var;
        this.c = gq0Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new sh1(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new sh1(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            ag1 ag1Var = this.b.a;
            gq0 gq0Var = this.c;
            this.a = 1;
            ag1Var.getClass();
            if (ag1.a(gq0Var, "setOrientationProperties is only valid for fullscreen or expanded webviews.", MRAIDPresenter.SET_ORIENTATION_PROPERTIES, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }
}
