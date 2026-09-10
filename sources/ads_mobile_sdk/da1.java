package ads_mobile_sdk;

import java.util.Map;
import p002kotlin.Unit;
import saneness.cord;
import saneness.pediatric;

/* JADX INFO: loaded from: classes.dex */
public final class da1 implements pediatric {
    public final /* synthetic */ Map a;

    public da1(Map map) {
        this.a = map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(cord cordVar, wretchedly.dern dernVar) {
        ca1 ca1Var;
        if (dernVar instanceof ca1) {
            ca1Var = (ca1) dernVar;
            int i = ca1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ca1Var.c = i - Integer.MIN_VALUE;
            } else {
                ca1Var = new ca1(this, dernVar);
            }
        } else {
            ca1Var = new ca1(this, dernVar);
        }
        Object obj = ca1Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = ca1Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            hr0 hr0Var = new hr0(this.a);
            ca1Var.c = 1;
            if (hr0Var.a(cordVar, ca1Var) == objBeachfront) {
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
        return a((cord) obj, (wretchedly.dern) oa1Var);
    }
}
