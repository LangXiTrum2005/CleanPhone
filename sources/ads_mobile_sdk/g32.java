package ads_mobile_sdk;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import saneness.pediatric;
import saneness.rotuma;

/* JADX INFO: loaded from: classes.dex */
public final class g32 implements pediatric {
    public final /* synthetic */ gk2 a;

    public g32(gk2 gk2Var) {
        this.a = gk2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rotuma rotumaVar, wretchedly.dern dernVar) {
        f32 f32Var;
        if (dernVar instanceof f32) {
            f32Var = (f32) dernVar;
            int i = f32Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f32Var.c = i - Integer.MIN_VALUE;
            } else {
                f32Var = new f32(this, dernVar);
            }
        } else {
            f32Var = new f32(this, dernVar);
        }
        Object obj = f32Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = f32Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            Function2 e32Var = new e32(this.a, null);
            f32Var.c = 1;
            if (rotumaVar.attabal(e32Var, f32Var) == objBeachfront) {
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
