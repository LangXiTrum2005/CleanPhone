package ads_mobile_sdk;

import saneness.hel;
import saneness.physical;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class rm extends xm0 {
    private static final rm DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 4;
    public static final int d = 5;
    private int bitField0_;
    private String errorDescription_ = "";
    private int errorType_;

    static {
        rm rmVar = new rm();
        DEFAULT_INSTANCE = rmVar;
        xm0.a(rm.class, rmVar);
    }

    public static physical o() {
        return (physical) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004᠌\u0000\u0005ဈ\u0001", new Object[]{"bitField0_", "errorType_", gm.a, "errorDescription_"});
        }
        if (iAttabal == 3) {
            return new rm();
        }
        if (iAttabal == 4) {
            return new physical();
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
        synchronized (rm.class) {
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
