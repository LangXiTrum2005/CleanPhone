package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import saneness.pediatric;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class qw implements pediatric {
    public final /* synthetic */ gh1 a;

    public qw(gh1 gh1Var) {
        this.a = gh1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rotuma rotumaVar, wretchedly.dern dernVar) {
        pw pwVar;
        if (dernVar instanceof pw) {
            pwVar = (pw) dernVar;
            int i = pwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pwVar.c = i - Integer.MIN_VALUE;
            } else {
                pwVar = new pw(this, dernVar);
            }
        } else {
            pwVar = new pw(this, dernVar);
        }
        Object obj = pwVar.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = pwVar.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Function2 owVar = new ow(this.a, null);
            pwVar.c = 1;
            if (rotumaVar.attabal(owVar, pwVar) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.pediatric
    public final /* bridge */ /* synthetic */ Object a(Object obj, oa1 oa1Var) {
        return a((rotuma) obj, (wretchedly.dern) oa1Var);
    }
}
