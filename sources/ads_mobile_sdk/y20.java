package ads_mobile_sdk;

import com.google.gson.JsonObject;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class y20 implements portwide {
    public final iv a;

    public y20(iv consentManager) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.a = consentManager;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.CSRB_ECO_DATA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        x20 x20Var;
        if (dernVar instanceof x20) {
            x20Var = (x20) dernVar;
            int i = x20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x20Var.c = i - Integer.MIN_VALUE;
            } else {
                x20Var = new x20(this, dernVar);
            }
        } else {
            x20Var = new x20(this, dernVar);
        }
        Object objB = x20Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = x20Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objB);
            iv ivVar = this.a;
            x20Var.c = 1;
            ivVar.getClass();
            objB = iv.b(ivVar, x20Var);
            if (objB == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objB);
        }
        return new tn0(new w20((JsonObject) objB));
    }
}
