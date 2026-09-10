package saneness;

import ads_mobile_sdk.xm0;
import ads_mobile_sdk.z43;

/* JADX INFO: loaded from: classes.dex */
public final class impromptu extends odille {
    @Override // saneness.odille
    public final z43 attabal(Object obj) {
        xm0 xm0Var = (xm0) obj;
        z43 z43Var = xm0Var.b;
        if (z43Var != z43.f) {
            return z43Var;
        }
        z43 z43VarB = z43.b();
        xm0Var.b = z43VarB;
        return z43VarB;
    }

    @Override // saneness.odille
    public final void saneness(Object obj, Object obj2) {
        ((xm0) obj).b = (z43) obj2;
    }

    @Override // saneness.odille
    public final void wireman(Object obj) {
        z43 z43Var = ((xm0) obj).b;
        if (z43Var.e) {
            z43Var.e = false;
        }
    }
}
