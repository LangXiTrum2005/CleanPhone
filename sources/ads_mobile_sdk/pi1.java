package ads_mobile_sdk;

import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class pi1 implements kotlinx.coroutines.flow.wireman {
    public final /* synthetic */ kotlinx.coroutines.flow.wireman a;
    public final /* synthetic */ ti1 b;

    public pi1(kotlinx.coroutines.flow.wireman wiremanVar, ti1 ti1Var) {
        this.a = wiremanVar;
        this.b = ti1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, wretchedly.dern dernVar) {
        oi1 oi1Var;
        if (dernVar instanceof oi1) {
            oi1Var = (oi1) dernVar;
            int i = oi1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oi1Var.b = i - Integer.MIN_VALUE;
            } else {
                oi1Var = new oi1(this, dernVar);
            }
        } else {
            oi1Var = new oi1(this, dernVar);
        }
        Object obj2 = oi1Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = oi1Var.b;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj2);
            kotlinx.coroutines.flow.wireman wiremanVar = this.a;
            spartacist tn0Var = (spartacist) obj;
            if (tn0Var instanceof tn0) {
                tn0Var = new tn0(this.b.c.invoke(((tn0) tn0Var).b));
            } else if (!(tn0Var instanceof nn0)) {
                throw new NoWhenBranchMatchedException();
            }
            oi1Var.b = 1;
            if (wiremanVar.emit(tn0Var, oi1Var) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj2);
        }
        return Unit.f29295attabal;
    }
}
