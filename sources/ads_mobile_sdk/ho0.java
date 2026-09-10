package ads_mobile_sdk;

import saneness.hel;
import saneness.logician;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class ho0 extends xm0 {
    private static final ho0 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 14;
    private int bitField0_;
    private co0 gmaSdkExceptionMessage_;

    static {
        ho0 ho0Var = new ho0();
        DEFAULT_INSTANCE = ho0Var;
        xm0.a(ho0.class, ho0Var);
    }

    public static logician o() {
        return (logician) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0000\u000eဉ\u0000", new Object[]{"bitField0_", "gmaSdkExceptionMessage_"});
        }
        if (iAttabal == 3) {
            return new ho0();
        }
        if (iAttabal == 4) {
            return new logician();
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
        synchronized (ho0.class) {
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
