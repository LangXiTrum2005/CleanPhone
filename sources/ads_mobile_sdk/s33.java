package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import saneness.pediatric;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class s33 implements pediatric {
    public final /* synthetic */ Map a;

    public s33(Map map) {
        this.a = map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rotuma rotumaVar, wretchedly.dern dernVar) {
        r33 r33Var;
        if (dernVar instanceof r33) {
            r33Var = (r33) dernVar;
            int i = r33Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r33Var.c = i - Integer.MIN_VALUE;
            } else {
                r33Var = new r33(this, dernVar);
            }
        } else {
            r33Var = new r33(this, dernVar);
        }
        Object obj = r33Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = r33Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            hr0 hr0Var = new hr0(this.a);
            r33Var.c = 1;
            if (hr0Var.a(rotumaVar, r33Var) == objBeachfront) {
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
