package ads_mobile_sdk;

import android.os.Bundle;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qg0 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ rg0 b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg0(rg0 rg0Var, Bundle bundle, String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = rg0Var;
        this.c = bundle;
        this.d = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new qg0(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qg0) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            wg0 wg0Var = this.b.b;
            tg0 tg0Var = tg0.d;
            Bundle bundle = this.c;
            String str = this.d;
            this.a = 1;
            wg0Var.getClass();
            if (wg0.a(wg0Var, tg0Var, bundle, str) == objBeachfront) {
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
