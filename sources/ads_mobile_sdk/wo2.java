package ads_mobile_sdk;

import saneness.hel;
import saneness.tdb;
import saneness.unrenewable;

/* JADX INFO: loaded from: classes.dex */
public final class wo2 extends xm0 {
    private static final wo2 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private boolean automaticRefresh_;
    private boolean staleResultAllowed_;

    static {
        wo2 wo2Var = new wo2();
        DEFAULT_INSTANCE = wo2Var;
        xm0.a(wo2.class, wo2Var);
    }

    public static unrenewable o() {
        return (unrenewable) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"automaticRefresh_", "staleResultAllowed_"});
        }
        if (iAttabal == 3) {
            return new wo2();
        }
        if (iAttabal == 4) {
            return new unrenewable();
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
        synchronized (wo2.class) {
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
