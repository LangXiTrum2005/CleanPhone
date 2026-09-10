package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class yw2 implements portwide {
    public final js1 a;

    public yw2(js1 networkConnectivityManager) {
        Intrinsics.checkNotNullParameter(networkConnectivityManager, "networkConnectivityManager");
        this.a = networkConnectivityManager;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.TELEPHONY;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        xw2 xw2Var;
        if (dernVar instanceof xw2) {
            xw2Var = (xw2) dernVar;
            int i = xw2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xw2Var.c = i - Integer.MIN_VALUE;
            } else {
                xw2Var = new xw2(this, dernVar);
            }
        } else {
            xw2Var = new xw2(this, dernVar);
        }
        Object objA = xw2Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = xw2Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            js1 js1Var = this.a;
            xw2Var.c = 1;
            objA = js1Var.a(xw2Var);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objA);
        }
        return new tn0(objA);
    }
}
