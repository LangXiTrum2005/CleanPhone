package ads_mobile_sdk;

import android.os.Bundle;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class ln2 implements portwide {
    public final iv a;

    public ln2(iv consentManager) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.a = consentManager;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.CONSENT_STRINGS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        kn2 kn2Var;
        if (dernVar instanceof kn2) {
            kn2Var = (kn2) dernVar;
            int i = kn2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kn2Var.c = i - Integer.MIN_VALUE;
            } else {
                kn2Var = new kn2(this, dernVar);
            }
        } else {
            kn2Var = new kn2(this, dernVar);
        }
        Object objC = kn2Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = kn2Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objC);
            iv ivVar = this.a;
            kn2Var.c = 1;
            ivVar.getClass();
            objC = iv.c(ivVar, kn2Var);
            if (objC == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objC);
        }
        return new tn0(new jn2((Bundle) objC));
    }
}
