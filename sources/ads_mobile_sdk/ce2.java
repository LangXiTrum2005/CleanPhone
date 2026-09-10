package ads_mobile_sdk;

import kotlinx.coroutines.cord;
import kotlinx.coroutines.splinterproof;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ce2 extends SuspendLambda implements Function2 {
    public formularization.attabal a;
    public ee2 b;
    public int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ee2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce2(long j, ee2 ee2Var, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = j;
        this.e = ee2Var;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new ce2(this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ce2(this.d, this.e, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        formularization.attabal attabalVar;
        ee2 ee2Var;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            long j = this.d;
            this.c = 1;
            if (splinterproof.saneness(j, this) != objBeachfront) {
            }
            return objBeachfront;
        }
        if (i == 1) {
            p002kotlin.dern.saneness(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ee2Var = this.b;
            attabalVar = this.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            cord cordVar = ee2Var.i;
            attabalVar.wireman(null);
            cordVar.dern();
            return Unit.f29295attabal;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
        ee2 ee2Var2 = this.e;
        attabalVar = ee2Var2.f;
        this.a = attabalVar;
        this.b = ee2Var2;
        this.c = 2;
        if (attabalVar.attabal(null, this) != objBeachfront) {
            ee2Var = ee2Var2;
            cord cordVar2 = ee2Var.i;
            attabalVar.wireman(null);
            cordVar2.dern();
            return Unit.f29295attabal;
        }
        return objBeachfront;
    }
}
