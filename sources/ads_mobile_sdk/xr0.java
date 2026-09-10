package ads_mobile_sdk;

import saneness.caulome;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class xr0 extends xm0 {
    private static final xr0 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    private String action_ = "";

    static {
        xr0 xr0Var = new xr0();
        DEFAULT_INSTANCE = xr0Var;
        xm0.a(xr0.class, xr0Var);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"action_"});
        }
        if (iAttabal == 3) {
            return new xr0();
        }
        if (iAttabal == 4) {
            return new caulome();
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
        synchronized (xr0.class) {
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
