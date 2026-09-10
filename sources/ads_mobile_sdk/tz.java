package ads_mobile_sdk;

import saneness.hel;
import saneness.poleward;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class tz extends xm0 {
    private static final tz DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int action_;
    private int bitField0_;
    private long intervalMsec_;
    private boolean isTerminalAction_;
    private int surface_;

    static {
        tz tzVar = new tz();
        DEFAULT_INSTANCE = tzVar;
        xm0.a(tz.class, tzVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "surface_", rz.a, "action_", oz.a, "isTerminalAction_", "intervalMsec_"});
        }
        if (iAttabal == 3) {
            return new tz();
        }
        if (iAttabal == 4) {
            return new poleward();
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
        synchronized (tz.class) {
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
