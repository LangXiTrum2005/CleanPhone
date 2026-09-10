package ads_mobile_sdk;

import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class m33 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ o33 b;
    public final /* synthetic */ xq0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m33(o33 o33Var, xq0 xq0Var, String str, String str2, String str3, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = o33Var;
        this.c = xq0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new m33(this.b, this.c, this.d, this.e, this.f, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m33) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            o33 o33Var = this.b;
            gq0 gq0Var = this.c.a;
            String str = this.d;
            String str2 = this.e;
            String str3 = this.f;
            this.a = 1;
            int i2 = o33.f3289attabal;
            if (o33Var.a(gq0Var, str, str2, str3, this) == objBeachfront) {
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
