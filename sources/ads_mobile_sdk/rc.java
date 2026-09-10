package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public final class rc extends SuspendLambda implements Function2 {
    public formularization.attabal a;
    public dd b;
    public int c;
    public final /* synthetic */ dd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(dd ddVar, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.d = ddVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new rc(this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new rc(this.d, (wretchedly.dern) obj2).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        formularization.attabal attabalVar;
        dd ddVar;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.c;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            dd ddVar2 = this.d;
            attabalVar = ddVar2.t;
            this.a = attabalVar;
            this.b = ddVar2;
            this.c = 1;
            if (attabalVar.attabal(null, this) == objBeachfront) {
                return objBeachfront;
            }
            ddVar = ddVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ddVar = this.b;
            attabalVar = this.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
            ddVar.f.getClass();
            ddVar.u = p002kotlin.time.dern.graveside(System.currentTimeMillis(), DurationUnit.MILLISECONDS);
            Unit unit = Unit.f29295attabal;
            attabalVar.wireman(null);
            dd ddVar3 = this.d;
            if (ddVar3.p != lc.NO_ANR) {
                ddVar3.v.triweekly(unit);
            }
            return unit;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }
}
