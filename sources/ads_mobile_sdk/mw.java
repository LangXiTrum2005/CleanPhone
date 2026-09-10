package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import saneness.pediatric;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class mw implements pediatric {
    public final /* synthetic */ e2 a;

    public mw(e2 e2Var) {
        this.a = e2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rotuma rotumaVar, wretchedly.dern dernVar) {
        lw lwVar;
        if (dernVar instanceof lw) {
            lwVar = (lw) dernVar;
            int i = lwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwVar.c = i - Integer.MIN_VALUE;
            } else {
                lwVar = new lw(this, dernVar);
            }
        } else {
            lwVar = new lw(this, dernVar);
        }
        Object obj = lwVar.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = lwVar.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Function2 kwVar = new kw(this.a, null);
            lwVar.c = 1;
            if (rotumaVar.attabal(kwVar, lwVar) == objBeachfront) {
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
