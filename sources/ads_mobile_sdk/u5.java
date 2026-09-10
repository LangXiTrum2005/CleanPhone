package ads_mobile_sdk;

import saneness.eradicative;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class u5 extends xm0 {
    private static final u5 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 18;
    private o5 adshieldMonitoringMessage_;
    private int bitField0_;

    static {
        u5 u5Var = new u5();
        DEFAULT_INSTANCE = u5Var;
        xm0.a(u5.class, u5Var);
    }

    public static eradicative o() {
        return (eradicative) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"bitField0_", "adshieldMonitoringMessage_"});
        }
        if (iAttabal == 3) {
            return new u5();
        }
        if (iAttabal == 4) {
            return new eradicative();
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
        synchronized (u5.class) {
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
