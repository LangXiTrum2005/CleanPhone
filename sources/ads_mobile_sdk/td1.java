package ads_mobile_sdk;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import saneness.cubbyhouse;
import saneness.hel;
import saneness.prescient;
import saneness.slightingly;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class td1 extends xm0 {
    private static final td1 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private cd1 data_ = cd1.a();
    private prescient adapters_ = xm0.h();

    static {
        td1 td1Var = new td1();
        DEFAULT_INSTANCE = td1Var;
        xm0.a(td1.class, td1Var);
    }

    public static slightingly q() {
        return (slightingly) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0000\u0001Ț\u00022", new Object[]{"adapters_", "data_", cubbyhouse.f37119attabal});
        }
        if (iAttabal == 3) {
            return new td1();
        }
        if (iAttabal == 4) {
            return new slightingly();
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
        synchronized (td1.class) {
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
        return this.adapters_;
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.data_);
    }
}
