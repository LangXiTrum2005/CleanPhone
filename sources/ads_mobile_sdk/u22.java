package ads_mobile_sdk;

import saneness.hel;
import saneness.houselet;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class u22 extends xm0 {
    private static final u22 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private prescient androidLifecycleEvents_ = xm0.h();
    private long clickTimestampMs_;

    static {
        u22 u22Var = new u22();
        DEFAULT_INSTANCE = u22Var;
        xm0.a(u22.class, u22Var);
    }

    public static houselet o() {
        return (houselet) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"androidLifecycleEvents_", wb.class, "clickTimestampMs_"});
        }
        if (iAttabal == 3) {
            return new u22();
        }
        if (iAttabal == 4) {
            return new houselet();
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
        synchronized (u22.class) {
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
