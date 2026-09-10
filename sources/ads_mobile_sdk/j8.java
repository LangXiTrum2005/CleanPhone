package ads_mobile_sdk;

import java.util.List;
import saneness.escorial;
import saneness.hel;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class j8 extends xm0 {
    private static final j8 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    private prescient initializationData_ = xm0.h();

    static {
        j8 j8Var = new j8();
        DEFAULT_INSTANCE = j8Var;
        xm0.a(j8.class, j8Var);
    }

    public static j8 o() {
        return DEFAULT_INSTANCE;
    }

    public static escorial q() {
        return (escorial) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"initializationData_", m8.class});
        }
        if (iAttabal == 3) {
            return new j8();
        }
        if (iAttabal == 4) {
            return new escorial();
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
        synchronized (j8.class) {
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

    public final List p() {
        return this.initializationData_;
    }
}
