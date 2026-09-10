package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class m12 implements portwide {
    public final iv a;

    public m12(iv consentManager) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.a = consentManager;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.PER_APP_ID_V2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        l12 l12Var;
        j12 j12Var;
        if (dernVar instanceof l12) {
            l12Var = (l12) dernVar;
            int i = l12Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l12Var.c = i - Integer.MIN_VALUE;
            } else {
                l12Var = new l12(this, dernVar);
            }
        } else {
            l12Var = new l12(this, dernVar);
        }
        Object objR = l12Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = l12Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objR);
            iv ivVar = this.a;
            l12Var.c = 1;
            objR = ivVar.r(l12Var);
            if (objR == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objR);
        }
        spartacist spartacistVar = (spartacist) objR;
        if (spartacistVar == null) {
            j12Var = null;
        } else {
            if (spartacistVar instanceof nn0) {
                return (nn0) spartacistVar;
            }
            j12Var = (j12) ((tn0) spartacistVar).b;
        }
        return new tn0(new k12(j12Var));
    }
}
