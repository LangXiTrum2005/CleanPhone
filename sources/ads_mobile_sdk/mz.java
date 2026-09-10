package ads_mobile_sdk;

import saneness.hel;
import saneness.kinshasa;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class mz extends xm0 {
    private static final mz DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    private int bitField0_;
    private kn sha256_ = kn.b;

    static {
        mz mzVar = new mz();
        DEFAULT_INSTANCE = mzVar;
        xm0.a(mz.class, mzVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"bitField0_", "sha256_"});
        }
        if (iAttabal == 3) {
            return new mz();
        }
        if (iAttabal == 4) {
            return new kinshasa();
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
        synchronized (mz.class) {
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
