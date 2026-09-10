package ads_mobile_sdk;

import saneness.hel;
import saneness.reconvict;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class ka extends xm0 {
    private static final ka DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private long screenBrightness_ = -1;
    private long screenBrightnessMode_ = -1;
    private long screenOffTimeout_ = -1;

    static {
        ka kaVar = new ka();
        DEFAULT_INSTANCE = kaVar;
        xm0.a(ka.class, kaVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "screenBrightness_", "screenBrightnessMode_", "screenOffTimeout_"});
        }
        if (iAttabal == 3) {
            return new ka();
        }
        if (iAttabal == 4) {
            return new reconvict();
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
        synchronized (ka.class) {
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
