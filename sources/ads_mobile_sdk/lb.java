package ads_mobile_sdk;

import saneness.hel;
import saneness.tdb;
import saneness.umbriferous;

/* JADX INFO: loaded from: classes.dex */
public final class lb extends xm0 {
    private static final lb DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    private int bitField0_;
    private String requestToken_ = "";

    static {
        lb lbVar = new lb();
        DEFAULT_INSTANCE = lbVar;
        xm0.a(lb.class, lbVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "requestToken_"});
        }
        if (iAttabal == 3) {
            return new lb();
        }
        if (iAttabal == 4) {
            return new umbriferous();
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
        synchronized (lb.class) {
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
