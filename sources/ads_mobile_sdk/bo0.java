package ads_mobile_sdk;

import saneness.hel;
import saneness.seminary;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class bo0 extends xm0 {
    private static final bo0 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int status_;
    private String stacktrace_ = "";
    private String conduitTraceKey_ = "";

    static {
        bo0 bo0Var = new bo0();
        DEFAULT_INSTANCE = bo0Var;
        xm0.a(bo0.class, bo0Var);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ", new Object[]{"status_", "stacktrace_", "conduitTraceKey_"});
        }
        if (iAttabal == 3) {
            return new bo0();
        }
        if (iAttabal == 4) {
            return new seminary();
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
        synchronized (bo0.class) {
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
}
