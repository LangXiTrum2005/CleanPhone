package ads_mobile_sdk;

import java.net.URL;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import saneness.hobby;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class c4 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(e4 e4Var, String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = e4Var;
        this.c = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new c4(this.b, this.c, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c4(this.b, this.c, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            hobby hobbyVar = this.b.d;
            URL url = new URL(this.c);
            this.a = 1;
            obj = hobbyVar.a(url, this);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        spartacist spartacistVar = (spartacist) obj;
        if (spartacistVar instanceof tn0) {
            ((zt0) ((tn0) spartacistVar).b).getClass();
        }
        return Unit.f29295attabal;
    }
}
