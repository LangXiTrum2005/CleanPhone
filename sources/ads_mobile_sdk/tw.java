package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import saneness.pediatric;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class tw implements pediatric {
    public final /* synthetic */ gk2 a;

    public tw(gk2 gk2Var) {
        this.a = gk2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rotuma rotumaVar, wretchedly.dern dernVar) {
        sw swVar;
        if (dernVar instanceof sw) {
            swVar = (sw) dernVar;
            int i = swVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                swVar.c = i - Integer.MIN_VALUE;
            } else {
                swVar = new sw(this, dernVar);
            }
        } else {
            swVar = new sw(this, dernVar);
        }
        Object obj = swVar.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = swVar.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Function2 rwVar = new rw(this.a, null);
            swVar.c = 1;
            if (rotumaVar.attabal(rwVar, swVar) == objBeachfront) {
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
