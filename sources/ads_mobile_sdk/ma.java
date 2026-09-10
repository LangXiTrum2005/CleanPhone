package ads_mobile_sdk;

import saneness.hel;
import saneness.imposure;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class ma extends xm0 {
    private static final ma DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private long mediaVolume_ = -1;
    private int isDndMode_ = 1000;

    static {
        ma maVar = new ma();
        DEFAULT_INSTANCE = maVar;
        xm0.a(ma.class, maVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "mediaVolume_", "isDndMode_", cb.a});
        }
        if (iAttabal == 3) {
            return new ma();
        }
        if (iAttabal == 4) {
            return new imposure();
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
        synchronized (ma.class) {
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
