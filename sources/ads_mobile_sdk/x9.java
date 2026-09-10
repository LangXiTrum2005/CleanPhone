package ads_mobile_sdk;

import saneness.hel;
import saneness.subadar;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class x9 extends xm0 {
    private static final x9 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private int frontCamera_ = 1000;
    private int rearCamera_ = 1000;
    private int frontFlash_ = 1000;
    private int rearFlash_ = 1000;

    static {
        x9 x9Var = new x9();
        DEFAULT_INSTANCE = x9Var;
        xm0.a(x9.class, x9Var);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            cb cbVar = cb.a;
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "frontCamera_", cbVar, "rearCamera_", cbVar, "frontFlash_", cbVar, "rearFlash_", cbVar});
        }
        if (iAttabal == 3) {
            return new x9();
        }
        if (iAttabal == 4) {
            return new subadar();
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
        synchronized (x9.class) {
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
