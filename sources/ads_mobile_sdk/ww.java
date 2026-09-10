package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import saneness.pediatric;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class ww implements pediatric {
    public final /* synthetic */ x83 a;

    public ww(x83 x83Var) {
        this.a = x83Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rotuma rotumaVar, wretchedly.dern dernVar) {
        vw vwVar;
        if (dernVar instanceof vw) {
            vwVar = (vw) dernVar;
            int i = vwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vwVar.c = i - Integer.MIN_VALUE;
            } else {
                vwVar = new vw(this, dernVar);
            }
        } else {
            vwVar = new vw(this, dernVar);
        }
        Object obj = vwVar.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = vwVar.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Function2 uwVar = new uw(this.a, null);
            vwVar.c = 1;
            if (rotumaVar.attabal(uwVar, vwVar) == objBeachfront) {
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
