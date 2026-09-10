package ads_mobile_sdk;

import java.util.List;
import saneness.gondola;
import saneness.hel;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class vm extends xm0 {
    private static final vm DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private prescient thirdPartySdk_ = xm0.h();
    private prescient thirdPartyJavascript_ = xm0.h();

    static {
        vm vmVar = new vm();
        DEFAULT_INSTANCE = vmVar;
        xm0.a(vm.class, vmVar);
    }

    public static gondola p() {
        return (gondola) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"thirdPartySdk_", um.class, "thirdPartyJavascript_", lm.class});
        }
        if (iAttabal == 3) {
            return new vm();
        }
        if (iAttabal == 4) {
            return new gondola();
        }
        if (iAttabal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iAttabal != 6) {
            throw null;
        }
        hel helVar = PARSER;
        if (helVar != null) {
            return helVar;
        }
        synchronized (vm.class) {
            try {
                wm0Var = PARSER;
                if (wm0Var == null) {
                    wm0Var = new wm0(DEFAULT_INSTANCE);
                    PARSER = wm0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wm0Var;
    }

    public final List o() {
        return this.thirdPartySdk_;
    }
}
