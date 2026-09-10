package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import saneness.pediatric;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class v33 implements pediatric {
    public static final v33 a = new v33();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rotuma rotumaVar, wretchedly.dern dernVar) {
        u33 u33Var;
        if (dernVar instanceof u33) {
            u33Var = (u33) dernVar;
            int i = u33Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u33Var.c = i - Integer.MIN_VALUE;
            } else {
                u33Var = new u33(this, dernVar);
            }
        } else {
            u33Var = new u33(this, dernVar);
        }
        Object obj = u33Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = u33Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Function2 t33Var = new t33(null);
            u33Var.c = 1;
            if (rotumaVar.attabal(t33Var, u33Var) == objBeachfront) {
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
