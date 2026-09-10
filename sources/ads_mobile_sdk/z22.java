package ads_mobile_sdk;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import p002kotlin.Unit;
import saneness.gerenuk;
import saneness.pediatric;

/* JADX INFO: loaded from: classes.dex */
public final class z22 implements pediatric {
    public final /* synthetic */ Map a;

    public z22(ImmutableMap immutableMap) {
        this.a = immutableMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(gerenuk gerenukVar, wretchedly.dern dernVar) {
        y22 y22Var;
        if (dernVar instanceof y22) {
            y22Var = (y22) dernVar;
            int i = y22Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y22Var.c = i - Integer.MIN_VALUE;
            } else {
                y22Var = new y22(this, dernVar);
            }
        } else {
            y22Var = new y22(this, dernVar);
        }
        Object obj = y22Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = y22Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            hr0 hr0Var = new hr0(this.a);
            y22Var.c = 1;
            if (hr0Var.a(gerenukVar, y22Var) == objBeachfront) {
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
