package ads_mobile_sdk;

import saneness.hel;
import saneness.incidentally;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class ia extends xm0 {
    private static final ia DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private long counter_ = -1;
    private int deviceIdType_;

    static {
        ia iaVar = new ia();
        DEFAULT_INSTANCE = iaVar;
        xm0.a(ia.class, iaVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "deviceIdType_", q9.a, "counter_"});
        }
        if (iAttabal == 3) {
            return new ia();
        }
        if (iAttabal == 4) {
            return new incidentally();
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
        synchronized (ia.class) {
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
