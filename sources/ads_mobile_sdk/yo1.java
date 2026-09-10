package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import saneness.gerenuk;
import saneness.pediatric;

/* JADX INFO: loaded from: classes.dex */
public final class yo1 implements pediatric {
    public final /* synthetic */ Map a;

    public yo1(Map map) {
        this.a = map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(gerenuk gerenukVar, wretchedly.dern dernVar) {
        xo1 xo1Var;
        if (dernVar instanceof xo1) {
            xo1Var = (xo1) dernVar;
            int i = xo1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xo1Var.c = i - Integer.MIN_VALUE;
            } else {
                xo1Var = new xo1(this, dernVar);
            }
        } else {
            xo1Var = new xo1(this, dernVar);
        }
        Object obj = xo1Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = xo1Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            hr0 hr0Var = new hr0(this.a);
            xo1Var.c = 1;
            if (hr0Var.a(gerenukVar, xo1Var) == objBeachfront) {
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
        return a((gerenuk) obj, (wretchedly.dern) oa1Var);
    }
}
