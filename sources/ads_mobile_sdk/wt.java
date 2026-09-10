package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class wt extends SuspendLambda implements Function1 {
    public spartacist a;
    public formularization.attabal b;
    public iv c;
    public int d;
    public final /* synthetic */ iv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(iv ivVar, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.e = ivVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new wt(this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new wt(this.e, (wretchedly.dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        spartacist spartacistVar;
        iv ivVar;
        formularization.attabal attabalVar;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.d;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            hf hfVar = this.e.k;
            this.d = 1;
            hfVar.getClass();
            obj = hf.a(hfVar, this);
            if (obj != objBeachfront) {
            }
            return objBeachfront;
        }
        if (i == 1) {
            p002kotlin.dern.saneness(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ivVar = this.c;
            attabalVar = this.b;
            spartacistVar = this.a;
            p002kotlin.dern.saneness(obj);
        }
        try {
            ivVar.J = (ln) ((tn0) spartacistVar).b;
            Unit unit = Unit.f29295attabal;
            return spartacistVar;
        } finally {
            attabalVar.wireman(null);
        }
        spartacist spartacistVar2 = (spartacist) obj;
        if (!(spartacistVar2 instanceof tn0)) {
            return spartacistVar2;
        }
        iv ivVar2 = this.e;
        formularization.attabal attabalVar2 = ivVar2.I;
        this.a = spartacistVar2;
        this.b = attabalVar2;
        this.c = ivVar2;
        this.d = 2;
        if (attabalVar2.attabal(null, this) != objBeachfront) {
            spartacistVar = spartacistVar2;
            ivVar = ivVar2;
            attabalVar = attabalVar2;
            ivVar.J = (ln) ((tn0) spartacistVar).b;
            Unit unit2 = Unit.f29295attabal;
            return spartacistVar;
        }
        return objBeachfront;
    }
}
