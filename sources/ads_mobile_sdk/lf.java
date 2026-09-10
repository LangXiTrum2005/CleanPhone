package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class lf implements portwide {
    public final iv a;

    public lf(iv consentManager) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.a = consentManager;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.APP_SET_ID;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        kf kfVar;
        ln lnVar;
        if (dernVar instanceof kf) {
            kfVar = (kf) dernVar;
            int i = kfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kfVar.c = i - Integer.MIN_VALUE;
            } else {
                kfVar = new kf(this, dernVar);
            }
        } else {
            kfVar = new kf(this, dernVar);
        }
        Object objM = kfVar.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = kfVar.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objM);
            iv ivVar = this.a;
            kfVar.c = 1;
            objM = ivVar.m(kfVar);
            if (objM == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objM);
        }
        spartacist spartacistVar = (spartacist) objM;
        if (spartacistVar == null) {
            lnVar = null;
        } else {
            if (spartacistVar instanceof nn0) {
                return (nn0) spartacistVar;
            }
            lnVar = (ln) ((tn0) spartacistVar).b;
        }
        return new tn0(new jf(lnVar != null ? lnVar.a : null));
    }
}
