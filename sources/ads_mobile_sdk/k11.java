package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class k11 implements portwide {
    public final wz0 a;

    public k11(wz0 inspectorManager) {
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        this.a = inspectorManager;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.INSPECTOR_SIGNAL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) throws Throwable {
        j11 j11Var;
        if (dernVar instanceof j11) {
            j11Var = (j11) dernVar;
            int i = j11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j11Var.c = i - Integer.MIN_VALUE;
            } else {
                j11Var = new j11(this, dernVar);
            }
        } else {
            j11Var = new j11(this, dernVar);
        }
        Object objH = j11Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = j11Var.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objH);
            wz0 wz0Var = this.a;
            j11Var.c = 1;
            objH = wz0Var.h(j11Var);
            if (objH == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objH);
        }
        return new tn0(objH);
    }
}
