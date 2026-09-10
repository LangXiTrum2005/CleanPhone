package ads_mobile_sdk;

import android.os.Bundle;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class bb3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ cb3 b;
    public final /* synthetic */ tg0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb3(cb3 cb3Var, tg0 tg0Var, String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = cb3Var;
        this.c = tg0Var;
        this.d = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new bb3(this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bb3) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            cb3 cb3Var = this.b;
            wg0 wg0Var = cb3Var.a;
            tg0 tg0Var = this.c;
            Bundle bundle = cb3Var.e.q;
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
