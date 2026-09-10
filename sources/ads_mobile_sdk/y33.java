package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import saneness.pediatric;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class y33 implements pediatric {
    public static final y33 a = new y33();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rotuma rotumaVar, wretchedly.dern dernVar) {
        x33 x33Var;
        if (dernVar instanceof x33) {
            x33Var = (x33) dernVar;
            int i = x33Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x33Var.c = i - Integer.MIN_VALUE;
            } else {
                x33Var = new x33(this, dernVar);
            }
        } else {
            x33Var = new x33(this, dernVar);
        }
        Object obj = x33Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = x33Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Function2 w33Var = new w33(null);
            x33Var.c = 1;
            if (rotumaVar.attabal(w33Var, x33Var) == objBeachfront) {
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
