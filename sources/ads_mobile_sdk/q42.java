package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class q42 extends SuspendLambda implements Function2 {
    public formularization.attabal a;
    public w52 b;
    public String c;
    public int d;
    public final /* synthetic */ w52 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q42(w52 w52Var, String str, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.e = w52Var;
        this.f = str;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new q42(this.e, this.f, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new q42(this.e, this.f, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        formularization.attabal attabalVar;
        String str;
        w52 w52Var;
        formularization.attabal attabalVar2;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.d;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                w52 w52Var2 = this.e;
                attabalVar = w52Var2.n;
                str = this.f;
                this.a = attabalVar;
                this.b = w52Var2;
                this.c = str;
                this.d = 1;
                if (attabalVar.attabal(null, this) != objBeachfront) {
                    w52Var = w52Var2;
                }
                return objBeachfront;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = this.a;
                try {
                    p002kotlin.dern.saneness(obj);
                    attabalVar = attabalVar2;
                    attabalVar.wireman(null);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    attabalVar = attabalVar2;
                    attabalVar.wireman(null);
                    throw th;
                }
            }
            String str2 = this.c;
            w52Var = this.b;
            formularization.attabal attabalVar3 = this.a;
            p002kotlin.dern.saneness(obj);
            str = str2;
            attabalVar = attabalVar3;
            x3 x3Var = (x3) w52Var.x.get(str);
            if (x3Var != null) {
                this.a = attabalVar;
                this.b = null;
                this.c = null;
                this.d = 2;
                obj = x3Var.d(this);
                if (obj != objBeachfront) {
                    attabalVar2 = attabalVar;
                    attabalVar = attabalVar2;
                }
                return objBeachfront;
            }
            attabalVar.wireman(null);
            return null;
        } catch (Throwable th2) {
            th = th2;
            attabalVar.wireman(null);
            throw th;
        }
    }
}
