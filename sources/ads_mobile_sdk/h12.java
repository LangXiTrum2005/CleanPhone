package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class h12 implements portwide {
    public final iv a;

    public h12(iv consentManager) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.a = consentManager;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.PER_APP_ID_V1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        g12 g12Var;
        ir0 ir0Var;
        if (dernVar instanceof g12) {
            g12Var = (g12) dernVar;
            int i = g12Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g12Var.c = i - Integer.MIN_VALUE;
            } else {
                g12Var = new g12(this, dernVar);
            }
        } else {
            g12Var = new g12(this, dernVar);
        }
        Object objQ = g12Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = g12Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objQ);
            iv ivVar = this.a;
            g12Var.c = 1;
            objQ = ivVar.q(g12Var);
            if (objQ == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objQ);
        }
        spartacist spartacistVar = (spartacist) objQ;
        if (spartacistVar == null) {
            ir0Var = null;
        } else {
            if (spartacistVar instanceof nn0) {
                return (nn0) spartacistVar;
            }
            ir0Var = (ir0) ((tn0) spartacistVar).b;
        }
        return new tn0(new f12(ir0Var));
    }
}
