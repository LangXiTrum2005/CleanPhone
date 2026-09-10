package ads_mobile_sdk;

import saneness.hel;
import saneness.stratoscope;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class bb1 extends xm0 {
    private static final bb1 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private String functionName_ = "";
    private int numIsolates_;

    static {
        bb1 bb1Var = new bb1();
        DEFAULT_INSTANCE = bb1Var;
        xm0.a(bb1.class, bb1Var);
    }

    public static stratoscope o() {
        return (stratoscope) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"functionName_", "numIsolates_"});
        }
        if (iAttabal == 3) {
            return new bb1();
        }
        if (iAttabal == 4) {
            return new stratoscope();
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
        synchronized (bb1.class) {
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
