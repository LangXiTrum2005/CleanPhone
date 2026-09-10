package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class um2 implements portwide {
    public final iv a;

    public um2(iv consentManager) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.a = consentManager;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.SESSION_ID;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        tm2 tm2Var;
        if (dernVar instanceof tm2) {
            tm2Var = (tm2) dernVar;
            int i = tm2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tm2Var.c = i - Integer.MIN_VALUE;
            } else {
                tm2Var = new tm2(this, dernVar);
            }
        } else {
            tm2Var = new tm2(this, dernVar);
        }
        Object objF = tm2Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = tm2Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objF);
            iv ivVar = this.a;
            tm2Var.c = 1;
            ivVar.getClass();
            objF = iv.f(ivVar, tm2Var);
            if (objF == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objF);
        }
        return new tn0(new sm2((String) objF));
    }
}
