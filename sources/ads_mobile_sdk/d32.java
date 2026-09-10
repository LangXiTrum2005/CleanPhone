package ads_mobile_sdk;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import p002kotlin.Unit;
import saneness.pediatric;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class d32 implements pediatric {
    public final /* synthetic */ Map a;

    public d32(ImmutableMap immutableMap) {
        this.a = immutableMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rotuma rotumaVar, wretchedly.dern dernVar) {
        c32 c32Var;
        if (dernVar instanceof c32) {
            c32Var = (c32) dernVar;
            int i = c32Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32Var.c = i - Integer.MIN_VALUE;
            } else {
                c32Var = new c32(this, dernVar);
            }
        } else {
            c32Var = new c32(this, dernVar);
        }
        Object obj = c32Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c32Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            hr0 hr0Var = new hr0(this.a);
            c32Var.c = 1;
            if (hr0Var.a(rotumaVar, c32Var) == objBeachfront) {
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
